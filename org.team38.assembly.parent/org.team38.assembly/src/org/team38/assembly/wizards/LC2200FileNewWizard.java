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

/**
 * Implementation class for the New File Wizard.
 * Creates a new LC-2200 assembly file with initial contents
 * 
 * @author Tyler Smith, Georgia Institute of Technology
 */
public class LC2200FileNewWizard extends Wizard implements INewWizard {
	// Constants
	private final String FILE_EXTENSION = "s";
	private final String INITIAL_CONTENTS = "; Your Name Here";
	private final String WINDOW_TITLE = "New LC-2200 File";
	private final String PAGE_TITLE = "";
	private final String PAGE_DESCRIPTION = "";
	
	
	private WizardNewFileCreationPage mainPage;
	private IStructuredSelection selection;
	
	public LC2200FileNewWizard() {
		setWindowTitle(WINDOW_TITLE);
	}

	@Override
	public void init(IWorkbench workbench, IStructuredSelection selection) {
		this.selection = selection;
	}

	/**
	 * Verifies that the correct information has been completed.
	 * In this case, the parent folder and file name (which isn't the empty string)
	 */
	@Override
	public boolean performFinish() {
		// Make sure file name exists and isn't empty string
		String fileName = mainPage.getFileName();
		if (fileName == null || fileName.length() == 0) {
			return false;
		}
		// If no extension, add one (should be unnecessary)
		String extension = mainPage.getFileExtension();
		if (extension == null || extension.length() == 0) {
			fileName += "." + FILE_EXTENSION;
		}
		// We have a good file name. Create the file and open the it in the editor
		IFile file = mainPage.createNewFile();
		try {
			file.appendContents(new ByteArrayInputStream(
					INITIAL_CONTENTS.getBytes(StandardCharsets.UTF_8)), false, false, null);
		} catch (CoreException e) {
			e.printStackTrace();
		}
		IWorkbenchPage page = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage();
		try {
			IDE.openEditor(page, file);
		} catch (PartInitException e) {
			e.printStackTrace();
		}
		return true;
	}
	
	/**
	 * Adds the main page to the wizard.
	 */
	@Override
	public void addPages() {
        super.addPages();

        mainPage = new WizardNewFileCreationPage(PAGE_DESCRIPTION, selection);
        mainPage.setTitle(PAGE_TITLE);
        mainPage.setDescription(PAGE_DESCRIPTION);
        mainPage.setFileExtension(FILE_EXTENSION);

        addPage(mainPage);
    }
}
