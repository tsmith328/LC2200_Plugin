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
          LabelHandler.addLabel(labelBeg, labelTable, offset);
        } else {
          EClass _eClass_1 = line.eClass();
          String _name_1 = _eClass_1.getName();
          boolean _equals_1 = _name_1.equals("Instruction");
          if (_equals_1) {
            Instruction instr = ((Instruction) line);
            LabelBeg labelBeg_1 = instr.getLabel();
            LabelHandler.addLabel(labelBeg_1, labelTable, offset);
          }
        }
        offset++;
      }
    }
    return labelTable;
  }
  
  public static Integer addLabel(final LabelBeg labelBeg, final HashMap<String, Integer> labelTable, final int offset) {
    Integer _xifexpression = null;
    boolean _notEquals = (!Objects.equal(labelBeg, null));
    if (_notEquals) {
      Integer _xblockexpression = null;
      {
        String label = labelBeg.getLabel();
        Integer _xifexpression_1 = null;
        boolean _notEquals_1 = (!Objects.equal(label, null));
        if (_notEquals_1) {
          Integer _xblockexpression_1 = null;
          {
            String _replace = label.replace(":", "");
            label = _replace;
            Integer _xifexpression_2 = null;
            Integer _get = labelTable.get(label);
            boolean _equals = Objects.equal(_get, null);
            if (_equals) {
              _xifexpression_2 = labelTable.put(label, Integer.valueOf(offset));
            } else {
              _xifexpression_2 = labelTable.put(label, Integer.valueOf((-1)));
            }
            _xblockexpression_1 = _xifexpression_2;
          }
          _xifexpression_1 = _xblockexpression_1;
        }
        _xblockexpression = _xifexpression_1;
      }
      _xifexpression = _xblockexpression;
    }
    return _xifexpression;
  }
}
