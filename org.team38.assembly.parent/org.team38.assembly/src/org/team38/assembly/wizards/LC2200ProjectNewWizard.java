package org.team38.assembly.wizards;

import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.dialogs.WizardNewProjectCreationPage;

public class LC2200ProjectNewWizard extends Wizard implements INewWizard {
	
	private WizardNewProjectCreationPage pageOne;

	public LC2200ProjectNewWizard() {
		setWindowTitle("Window Title");
		// TODO Auto-generated constructor stub
	}

	@Override
	public void init(IWorkbench workbench, IStructuredSelection selection) {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean performFinish() {
		String projectName = pageOne.getProjectName();
		if (projectName == null || projectName.length() == 0) {
			return false;
		}
		if(pageOne.useDefaults()) {
			return true;
		}
		return true;
	}
	
	@Override
    public void addPages() {
        super.addPages();

        pageOne = new WizardNewProjectCreationPage("From Scratch Project Wizard");
        pageOne.setTitle("From Scratch Project");
        pageOne.setDescription("Create something from scratch.");

        addPage(pageOne);
    }
}
