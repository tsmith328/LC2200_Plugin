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

public class LC2200ProjectNewWizard extends Wizard implements INewWizard, IExecutableExtension {
	
	private WizardNewProjectCreationPage pageOne;
	private IConfigurationElement configElement;

	public LC2200ProjectNewWizard() {
		setWindowTitle("New LC-2200 Project");
		// TODO Auto-generated constructor stub
	}

	@Override
	public void init(IWorkbench workbench, IStructuredSelection selection) {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean performFinish() {
		String projectName = pageOne.getProjectName();
		URI location = null;
		if (projectName == null || projectName.length() == 0) {
			return false;
		}
		if(!pageOne.useDefaults()) {
			location = pageOne.getLocationURI();
		}
		createProject(projectName, location);
		
		BasicNewProjectResourceWizard.updatePerspective(configElement);
		return true;
	}
	
	@Override
    public void addPages() {
        super.addPages();

        pageOne = new WizardNewProjectCreationPage("Create an LC-2200 Project");
        pageOne.setTitle("LC-2200 Project");
        pageOne.setDescription("Create a new LC-2200 Project.");

        addPage(pageOne);
    }

	@Override
	public void setInitializationData(IConfigurationElement config, String propertyName, Object data)
			throws CoreException {
		// TODO Auto-generated method stub
		configElement = config;
		
	}
	
	private IProject createProject(String projectName, URI location) {
		IProject project = ResourcesPlugin.getWorkspace().getRoot().getProject(projectName);
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
		
		try {
			String[] paths = { /*"src"*/ };
			addToProjectStructure(project, paths);
		} catch (CoreException e) {
			e.printStackTrace();
			project = null;
		}
		
		return project;
	}
	
	private void addToProjectStructure(IProject project, String[] paths) throws CoreException {
		for (String path : paths) {
			IFolder etcFolders = project.getFolder(path);
			createFolder(etcFolders);
		}
	}
	
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
