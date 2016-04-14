package org.team38.assembly;

import com.google.common.base.Objects;
import java.util.HashMap;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.team38.assembly.lC2200.Directive;
import org.team38.assembly.lC2200.Instruction;
import org.team38.assembly.lC2200.LabelBeg;
import org.team38.assembly.lC2200.Line;
import org.team38.assembly.lC2200.Program;

@SuppressWarnings("all")
public class LabelHandler {
  /**
   * Stores labels and their position into a hash map
   * 
   * @param root
   */
  public static HashMap<String, Integer> populateLabels(final Program root) {
    int offset = 0;
    HashMap<String, Integer> labelTable = new HashMap<String, Integer>();
    EList<Line> lines = root.getLines();
    for (final Line line : lines) {
      {
        EClass _eClass = line.eClass();
        String _name = _eClass.getName();
        boolean _equals = _name.equals("Directive");
        if (_equals) {
          Directive dir = ((Directive) line);
          LabelBeg labelBeg = dir.getLabel();
          boolean _notEquals = (!Objects.equal(labelBeg, null));
          if (_notEquals) {
            String label = labelBeg.getLabel();
            boolean _notEquals_1 = (!Objects.equal(label, null));
            if (_notEquals_1) {
              String _replace = label.replace(":", "");
              labelTable.put(_replace, Integer.valueOf(offset));
            }
          }
        } else {
          EClass _eClass_1 = line.eClass();
          String _name_1 = _eClass_1.getName();
          boolean _equals_1 = _name_1.equals("Instruction");
          if (_equals_1) {
            Instruction instr = ((Instruction) line);
            LabelBeg labelBeg_1 = instr.getLabel();
            boolean _notEquals_2 = (!Objects.equal(labelBeg_1, null));
            if (_notEquals_2) {
              String label_1 = labelBeg_1.getLabel();
              boolean _notEquals_3 = (!Objects.equal(label_1, null));
              if (_notEquals_3) {
                String _replace_1 = label_1.replace(":", "");
                labelTable.put(_replace_1, Integer.valueOf(offset));
              }
            }
          }
        }
        offset++;
      }
    }
    return labelTable;
  }
}
