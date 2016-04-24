package org.team38.assembly.ui;

import com.google.common.base.Objects;
import com.google.inject.Inject;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.xtext.builder.nature.ToggleXtextNatureAction;
import org.eclipse.xtext.ui.editor.IXtextEditorCallback;
import org.eclipse.xtext.ui.editor.XtextEditor;

/**
 * @author Sven Efftinge - Initial contribution and API
 */
@SuppressWarnings("all")
public class LC2200NatureAdder extends IXtextEditorCallback.NullImpl {
  @Inject
  private ToggleXtextNatureAction toggleNature;
  
  @Override
  public void afterCreatePartControl(final XtextEditor editor) {
    IResource resource = editor.getResource();
    boolean _and = false;
    boolean _and_1 = false;
    boolean _and_2 = false;
    boolean _notEquals = (!Objects.equal(resource, null));
    if (!_notEquals) {
      _and_2 = false;
    } else {
      IProject _project = resource.getProject();
      boolean _hasNature = this.toggleNature.hasNature(_project);
      boolean _not = (!_hasNature);
      _and_2 = _not;
    }
    if (!_and_2) {
      _and_1 = false;
    } else {
      IProject _project_1 = resource.getProject();
      boolean _isAccessible = _project_1.isAccessible();
      _and_1 = _isAccessible;
    }
    if (!_and_1) {
      _and = false;
    } else {
      IProject _project_2 = resource.getProject();
      boolean _isHidden = _project_2.isHidden();
      boolean _not_1 = (!_isHidden);
      _and = _not_1;
    }
    if (_and) {
      IProject _project_3 = resource.getProject();
      this.toggleNature.toggleNature(_project_3);
    }
  }
}
