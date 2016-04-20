package org.team38.assembly;

import java.util.Scanner;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResourceChangeEvent;
import org.eclipse.core.resources.IResourceChangeListener;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.part.FileEditorInput;
import org.eclipse.ui.part.ViewPart;

public class AssembledView extends ViewPart implements IResourceChangeListener {
	Label label;
	String defaultContents = "";
	IResourceChangeEvent event;
	public AssembledView() {
		super();
	}
	
	
	@Override
	public void createPartControl(Composite parent) {
		label = new Label(parent, SWT.WRAP);
		label.setText(defaultContents);
		
		// Add listener to editor to know when to change contents of the view
		IWorkspace workspace = ResourcesPlugin.getWorkspace();
		workspace.addResourceChangeListener(this, IResourceChangeEvent.POST_CHANGE);
	}

	@Override
	public void setFocus() {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void dispose() {
		super.dispose();
		ResourcesPlugin.getWorkspace().removeResourceChangeListener(this);
	}
	
	@Override
	public void resourceChanged(IResourceChangeEvent event) {
		// Update view with contents of binary file
		IWorkbench workbench = PlatformUI.getWorkbench();
		if (workbench == null) return;
		IWorkbenchWindow window = workbench.getActiveWorkbenchWindow();
		if (window == null) return;
		IWorkbenchPage page = window.getActivePage();
		if (page == null) return;
		IEditorPart editor = page.getActiveEditor();
		if (editor == null) return;
		IEditorInput input = editor.getEditorInput();
		if (input == null) return;
		IPath path = ((FileEditorInput)input).getPath();
		String pathString = path.toString();
		String name = pathString.substring(pathString.lastIndexOf("/"),
				pathString.length()-1);
		String newPath = pathString.substring(0, pathString.lastIndexOf("/")) + 
				"/src-gen" + name + "bin";

		try {
			IWorkspaceRoot root = ResourcesPlugin.getWorkspace().getRoot();
			IFile binaryFile = root.getFileForLocation(new Path(newPath));
			InputStream binary = new FileInputStream(binaryFile.getLocation().toOSString());
			Scanner s = new Scanner(binary, "UTF-8");
			s.useDelimiter("\\A");
			String contents = s.hasNext() ? s.next() : "";
			s.close();
			label.setText(contents);
		} catch (FileNotFoundException e) {
			label.setText("");
			e.printStackTrace();
		}
	}
	
	
}
