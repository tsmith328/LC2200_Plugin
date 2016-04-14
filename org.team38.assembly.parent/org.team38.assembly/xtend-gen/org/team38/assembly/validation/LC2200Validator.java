/**
 * generated by Xtext 2.9.1
 */
package org.team38.assembly.validation;

import com.google.common.base.Objects;
import java.util.HashMap;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.validation.Check;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.team38.assembly.LabelHandler;
import org.team38.assembly.lC2200.IInstruction;
import org.team38.assembly.lC2200.Instruction;
import org.team38.assembly.lC2200.LC2200Package;
import org.team38.assembly.lC2200.LabelEnd;
import org.team38.assembly.lC2200.Line;
import org.team38.assembly.lC2200.Program;
import org.team38.assembly.lC2200.WordDirective;
import org.team38.assembly.validation.AbstractLC2200Validator;

/**
 * This class contains custom validation rules.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
 */
@SuppressWarnings("all")
public class LC2200Validator extends AbstractLC2200Validator {
  @Check
  public void checkInstructionImmediate(final IInstruction instr) {
    EObject _i_opcode = instr.getI_opcode();
    EClass _eClass = _i_opcode.eClass();
    String _name = _eClass.getName();
    boolean _equals = _name.equals("IInstructionLabelTrans");
    if (_equals) {
      return;
    }
    String imm = instr.getImm();
    int immInt = 0;
    try {
      int _indexOf = imm.indexOf("0x");
      boolean _notEquals = (_indexOf != (-1));
      if (_notEquals) {
        String _substring = imm.substring(2);
        int _parseInt = Integer.parseInt(_substring, 16);
        immInt = _parseInt;
      } else {
        int _parseInt_1 = Integer.parseInt(imm);
        immInt = _parseInt_1;
      }
    } catch (final Throwable _t) {
      if (_t instanceof Exception) {
        final Exception e = (Exception)_t;
        this.warning("Immediate values should be hex or decimal integers", LC2200Package.Literals.IINSTRUCTION__IMM);
      } else {
        throw Exceptions.sneakyThrow(_t);
      }
    }
    if (((immInt < (-16)) || (immInt > 15))) {
      this.warning("Signed 5 bit immediate values should be between -16 and 15", LC2200Package.Literals.IINSTRUCTION__IMM);
    }
  }
  
  @Check
  public void checkWordImmediate(final WordDirective word) {
    String imm = word.getImm();
    int immInt = 0;
    try {
      int _indexOf = imm.indexOf("0x");
      boolean _notEquals = (_indexOf != (-1));
      if (_notEquals) {
        String _substring = imm.substring(2);
        int _parseInt = Integer.parseInt(_substring, 16);
        immInt = _parseInt;
      } else {
        int _parseInt_1 = Integer.parseInt(imm);
        immInt = _parseInt_1;
      }
    } catch (final Throwable _t) {
      if (_t instanceof Exception) {
        final Exception e = (Exception)_t;
        this.warning("Immediate values should be integers", LC2200Package.Literals.WORD_DIRECTIVE__IMM);
      } else {
        throw Exceptions.sneakyThrow(_t);
      }
    }
    if (((immInt < (-65536)) || (immInt > 65535))) {
      this.warning("Signed 16 bit immediate values should be between -65536 and 65535", LC2200Package.Literals.WORD_DIRECTIVE__IMM);
    }
  }
  
  @Check
  public void checkLabelIsValid(final IInstruction instr) {
    EObject _i_opcode = instr.getI_opcode();
    EClass _eClass = _i_opcode.eClass();
    String _name = _eClass.getName();
    boolean _equals = _name.equals("IInstructionLabelTrans");
    if (_equals) {
      LabelEnd labelTrans = instr.getLabel();
      String label = labelTrans.getLabel();
      EObject root = ((EObject) instr);
      EObject _eContainer = instr.eContainer();
      Instruction parent = ((Instruction) _eContainer);
      while ((!Objects.equal(root.eContainer(), null))) {
        EObject _eContainer_1 = root.eContainer();
        root = _eContainer_1;
      }
      EClass _eClass_1 = root.eClass();
      String _name_1 = _eClass_1.getName();
      boolean _equals_1 = _name_1.equals("Program");
      if (_equals_1) {
        HashMap<String, Integer> labelTable = LabelHandler.populateLabels(((Program) root));
        Integer _get = labelTable.get(label);
        boolean _equals_2 = Objects.equal(_get, null);
        if (_equals_2) {
          this.warning("Label does not exist", LC2200Package.Literals.IINSTRUCTION__LABEL);
        } else {
          EList<Line> lines = ((Program) root).getLines();
          int offset = 0;
          boolean found = false;
          for (int i = 0; ((i < ((Object[])Conversions.unwrapArray(lines, Object.class)).length) && (!found)); i++) {
            {
              Line _get_1 = lines.get(i);
              boolean _equals_3 = parent.equals(_get_1);
              if (_equals_3) {
                found = true;
                Integer _get_2 = labelTable.get(label);
                int dif = ((_get_2).intValue() - offset);
                if (((dif > 15) || (dif < (-16)))) {
                  this.warning("Label offset cannot fit into 5 bits", LC2200Package.Literals.IINSTRUCTION__LABEL);
                }
              }
              offset++;
            }
          }
        }
      }
    }
  }
}
