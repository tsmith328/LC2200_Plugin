package org.team38.assembly;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.ui.part.ViewPart;

/**
 * Visualizes the assembled LC-2200 code as a view next to the student's workspace.
 * @author Tyler Smith, Georgia Institute of Technology
 *
 */
public class AssembledView extends ViewPart {
	private Label label;
	final String DEFAULT_CONTENTS = ""; // What the View should display before being initialized
	
	/**
	 * Called when the View is initialized. Sets the default text and adds
	 * listener for student code updates.
	 * 
	 * @param parent -- the container surrounding this view's contents
	 */
	@Override
	public void createPartControl(Composite parent) {
		label = new Label(parent, SWT.WRAP);
		label.setText(DEFAULT_CONTENTS);
	}

	/**
	 * Sets the focus for this View to its contents.
	 */
	@Override
	public void setFocus() {
		//this.label.setFocus();
	}
	
	/**
	 * Updates the contents of this view.
	 * 
	 * @param contents -- the new contents for this view
	 */
	public void updateView(String contents) {
		this.label.setText(contents);
	}
	
}
