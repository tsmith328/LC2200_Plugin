package org.team38.assembly.wizards;

import java.io.ByteArrayInputStream;
import java.nio.charset.StandardCharsets;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.dialogs.WizardNewFileCreationPage;
import org.eclipse.ui.ide.IDE;

public class LC2200FileNewWizard extends Wizard implements INewWizard {
	private final String FILE_EXTENSION = "s";
	private final String INITIAL_CONTENTS = "; Your Name Here";
	WizardNewFileCreationPage pageOne;
	IStructuredSelection selection;
	
	public LC2200FileNewWizard() {
		setWindowTitle("New LC-2200 File");
	}

	@Override
	public void init(IWorkbench workbench, IStructuredSelection selection) {
		this.selection = selection;

	}

	@Override
	public boolean performFinish() {
		String fileName = pageOne.getFileName();
		if (fileName == null || fileName.length() == 0) {
			return false;
		}
		// If no extension, add one (should be unnecessary)
		String extension = pageOne.getFileExtension();
		if (extension == null || extension.length() == 0) {
			fileName += "." + FILE_EXTENSION;
		}
		// We have a good file name. Create the file and open the it in the editor
		IFile file = pageOne.createNewFile();
		try {
			file.appendContents(new ByteArrayInputStream(INITIAL_CONTENTS.getBytes(StandardCharsets.UTF_8)), false, false, null);
		} catch (CoreException e) {
			e.printStackTrace();
		}
		IWorkbenchPage page = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage();
		try {
			//IDE.setDefaultEditor(file, "org.eclipse.ui.editorss");
			IDE.openEditor(page, file);
		} catch (PartInitException e) {
			e.printStackTrace();
		}
		return true;
	}
	
	@Override
	public void addPages() {
        super.addPages();

        pageOne = new WizardNewFileCreationPage("Create a new LC-2200 File", selection);
        pageOne.setTitle("LC-2200 File");
        pageOne.setDescription("Create a new LC-2200 File.");
        pageOne.setFileExtension(FILE_EXTENSION);

        addPage(pageOne);
    }
}
