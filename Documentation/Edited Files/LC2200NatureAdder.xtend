
package org.team38.assembly.ui
/*******************************************************************************
 * Copyright (c) 2009 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/

import org.eclipse.xtext.ui.editor.IXtextEditorCallback;
import org.eclipse.xtext.ui.editor.XtextEditor;
import com.google.inject.Inject;
import org.eclipse.xtext.builder.nature.ToggleXtextNatureAction;

/**
 * @author Sven Efftinge - Initial contribution and API to IXtextEditorCallback class
 * @author Matthew Moreno - Modified afterCreatePartControl to simply toggle the Xtext nature on
 */
public class LC2200NatureAdder extends IXtextEditorCallback.NullImpl {
	@Inject
	private ToggleXtextNatureAction toggleNature;
	
	/** Called when creating an LC2200 file. Applies the LC2200 nature to the file always. */
	override void afterCreatePartControl(XtextEditor editor) {
		var resource = editor.getResource();
		if (resource != null && !toggleNature.hasNature(resource.getProject()) && resource.getProject().isAccessible()
			&& !resource.getProject().isHidden()) {
			toggleNature.toggleNature(resource.getProject());
		}
	}
}
