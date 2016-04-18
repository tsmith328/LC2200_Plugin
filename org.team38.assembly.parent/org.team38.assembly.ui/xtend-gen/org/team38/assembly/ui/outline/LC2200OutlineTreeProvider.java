/**
 * generated by Xtext 2.9.1
 */
package org.team38.assembly.ui.outline;

import com.google.common.base.Objects;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.ui.editor.outline.impl.DefaultOutlineTreeProvider;
import org.eclipse.xtext.ui.editor.outline.impl.DocumentRootNode;
import org.team38.assembly.lC2200.Directive;
import org.team38.assembly.lC2200.Instruction;
import org.team38.assembly.lC2200.LabelBeg;
import org.team38.assembly.lC2200.Program;

/**
 * Customizes the Eclipse outline view to show labels
 */
@SuppressWarnings("all")
public class LC2200OutlineTreeProvider extends DefaultOutlineTreeProvider {
  /**
   * Only adds labels to the outline view. Labels are found by
   * traversing the parse tree
   * 
   * @param parentNode - The document root node
   * @param program - The parse tree root node
   */
  public void _createChildren(final DocumentRootNode parentNode, final Program program) {
    EList<EObject> _eContents = program.eContents();
    for (final EObject element : _eContents) {
      {
        EClass _eClass = element.eClass();
        String className = _eClass.getName();
        boolean _equals = className.equals("Instruction");
        if (_equals) {
          LabelBeg labelTrans = ((Instruction) element).getLabel();
          boolean _notEquals = (!Objects.equal(labelTrans, null));
          if (_notEquals) {
            this.createNode(parentNode, labelTrans);
          }
        } else {
          boolean _equals_1 = className.equals("Directive");
          if (_equals_1) {
            LabelBeg labelTrans_1 = ((Directive) element).getLabel();
            boolean _notEquals_1 = (!Objects.equal(labelTrans_1, null));
            if (_notEquals_1) {
              this.createNode(parentNode, labelTrans_1);
            }
          }
        }
      }
    }
  }
}
