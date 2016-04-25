package org.team38.assembly.wizards;

import java.net.URI;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectDescription;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExecutableExtension;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.dialogs.WizardNewProjectCreationPage;
import org.eclipse.ui.wizards.newresource.BasicNewProjectResourceWizard;

/**
 * Implementation class for the New LC-2200 Project Wizard. Called when the new project
 * wizard is opened.
 * 
 * @author Tyler Smith, Georgia Institute of Technology
 *
 */
public class LC2200ProjectNewWizard extends Wizard implements INewWizard, IExecutableExtension {
	// Constants
	private final String WINDOW_TITLE = "New LC-2200 Project";
	private final String PAGE_DESCRIPTION = "Create a new LC-2200 Project.";
	private final String PAGE_TITLE = "Create a new LC-2200 Project.";
	
	private WizardNewProjectCreationPage mainPage;
	private IConfigurationElement configElement;

	public LC2200ProjectNewWizard() {
		setWindowTitle(WINDOW_TITLE);
	}

	@Override
	public void init(IWorkbench workbench, IStructuredSelection selection) {}

	/**
	 * Verifies that all necessary information is present: the project name.
	 * Checks that the project name is not the empty string ("").
	 */
	@Override
	public boolean performFinish() {
		String projectName = mainPage.getProjectName();
		URI location = null;
		if (projectName == null || projectName.length() == 0) {
			return false;
		}
		if(!mainPage.useDefaults()) {
			location = mainPage.getLocationURI();
		}
		createProject(projectName, location);
		
		BasicNewProjectResourceWizard.updatePerspective(configElement);
		return true;
	}
	
	/**
	 * Adds the main new project page to the wizard.
	 */
	@Override
    public void addPages() {
        super.addPages();

        mainPage = new WizardNewProjectCreationPage(PAGE_DESCRIPTION);
        mainPage.setTitle(PAGE_TITLE);
        mainPage.setDescription(PAGE_DESCRIPTION);

        addPage(mainPage);
    }

	@Override
	public void setInitializationData(IConfigurationElement config, String propertyName, Object data)
			throws CoreException {
		configElement = config;
	}
	
	/**
	 * Creates a project object in the Eclipse framework. Also creates the 
	 * necessary file structure to house the project.
	 * 
	 * @param projectName -- The name of the project
	 * @param location -- The location; the file location of the project
	 * @return the IProject object representing this project
	 */
	private IProject createProject(String projectName, URI location) {
		IProject project = ResourcesPlugin.getWorkspace().getRoot().getProject(projectName);
		// Get project name from framework if it exists
		if(!project.exists()) {
			URI projectLocation = location;
			IProjectDescription desc = project.getWorkspace().newProjectDescription(project.getName());
			if (location != null && ResourcesPlugin.getWorkspace().getRoot().getLocationURI().equals(location)) {
				projectLocation = null;
			}
			
			desc.setLocationURI(projectLocation);
			try {
				project.create(desc,null);
				if(!project.isOpen()) {
					project.open(null);
				}
			} catch (CoreException e) {
				e.printStackTrace();
			}
		}
		// Used to add subfolders to the project. i.e. if source files should go into
		// a src/ folder
		try {
			String[] paths = { /*"src"*/ };
			addToProjectStructure(project, paths);
		} catch (CoreException e) {
			e.printStackTrace();
			project = null;
		}
		
		return project;
	}
	
	/**
	 * Adds paths to the project relative to the top-level directory for the project
	 * 
	 * @param project -- the project to which to add the paths
	 * @param paths -- the paths to add
	 * @throws CoreException
	 */
	private void addToProjectStructure(IProject project, String[] paths) throws CoreException {
		for (String path : paths) {
			IFolder etcFolders = project.getFolder(path);
			createFolder(etcFolders);
		}
	}
	
	/**
	 * Creates a folder in the file structure
	 * 
	 * @param folder -- the folder to create
	 * @throws CoreException
	 */
	private void createFolder(IFolder folder) throws CoreException {
		IContainer parent = folder.getParent();
		if (parent instanceof IFolder) {
			createFolder((IFolder) parent);
		}
		if (!folder.exists()) {
			folder.create(false, true, null);
		}
	}
}
