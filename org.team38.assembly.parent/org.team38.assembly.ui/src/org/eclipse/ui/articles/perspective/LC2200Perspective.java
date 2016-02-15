package org.eclipse.ui.articles.perspective;

import org.eclipse.ui.IFolderLayout;
import org.eclipse.ui.IPageLayout;
import org.eclipse.ui.IPerspectiveFactory;

public class LC2200Perspective implements IPerspectiveFactory {

	@Override
	public void createInitialLayout(IPageLayout layout) {
		defineActions(layout);
		defineLayout(layout);

	}
	/**
	 * Defines the actions available in this perspective.
	 * @param layout -- the layout we are building
	 * @author Tyler Smith
	 */
	private void defineActions(IPageLayout layout) {
		// "New Wizards"
		layout.addNewWizardShortcut("org.eclipse.ui.wizards.new.folder");
		layout.addNewWizardShortcut("org.eclipse.ui.wizards.new.file");
		
		layout.addShowViewShortcut(IPageLayout.ID_PROJECT_EXPLORER);
	}
	
	/**
	 * Defines the layout of the perspective.
	 * All items are placed relative to the default editor area
	 * @param layout -- the layout we are building
	 * @author Tyler Smith
	 */
	private void defineLayout(IPageLayout layout) {
		String editorArea = layout.getEditorArea();
		IFolderLayout left =
				layout.createFolder("left", IPageLayout.LEFT, 0.26f, editorArea);
		IFolderLayout right = 
				layout.createFolder("right", IPageLayout.RIGHT, 1.0f - 0.26f, editorArea);
		IFolderLayout bottom =
				layout.createFolder("bottom", IPageLayout.BOTTOM, 1.0f - 0.26f, editorArea);
		left.addView(IPageLayout.ID_PROJECT_EXPLORER);
		right.addView(IPageLayout.ID_OUTLINE);
		bottom.addView(IPageLayout.ID_PROBLEM_VIEW);
	}

}
