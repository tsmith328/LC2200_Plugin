/**
 * generated by Xtext 2.9.1
 */
package org.team38.assembly.generator;

import com.google.common.base.Objects;
import java.util.HashMap;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.AbstractGenerator;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.generator.IGeneratorContext;
import org.team38.assembly.lC2200.Directive;
import org.team38.assembly.lC2200.IInstruction;
import org.team38.assembly.lC2200.Instruction;
import org.team38.assembly.lC2200.JInstruction;
import org.team38.assembly.lC2200.NOOPDirective;
import org.team38.assembly.lC2200.OInstruction;
import org.team38.assembly.lC2200.Program;
import org.team38.assembly.lC2200.RInstruction;
import org.team38.assembly.lC2200.WordDirective;

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
@SuppressWarnings("all")
public class LC2200Generator extends AbstractGenerator {
  private StringBuffer assembledOutput;
  
  private HashMap<String, Integer> labelTable;
  
  private int offset;
  
  @Override
  public void doGenerate(final Resource resource, final IFileSystemAccess2 fsa, final IGeneratorContext context) {
    StringBuffer _stringBuffer = new StringBuffer();
    this.assembledOutput = _stringBuffer;
    HashMap<String, Integer> _hashMap = new HashMap<String, Integer>();
    this.labelTable = _hashMap;
    EList<EObject> _contents = resource.getContents();
    EObject e_root = _contents.get(0);
    EClass _eClass = e_root.eClass();
    String _name = _eClass.getName();
    boolean _equals = _name.equals("Program");
    if (_equals) {
      this.offset = 0;
      this.populateLabels(((Program) e_root));
      this.offset = 0;
      this.compileProgram(((Program) e_root));
    }
    String _string = this.assembledOutput.toString();
    String _trim = _string.trim();
    fsa.generateFile("helloworld.txt", _trim);
  }
  
  public void populateLabels(final Program root) {
    EList<EObject> lines = root.getLines();
    for (final EObject line : lines) {
      {
        EClass _eClass = line.eClass();
        String _name = _eClass.getName();
        boolean _equals = _name.equals("Directive");
        if (_equals) {
          Directive dir = ((Directive) line);
          String label = dir.getLabel();
          boolean _notEquals = (!Objects.equal(label, null));
          if (_notEquals) {
            String _replace = label.replace(":", "");
            this.labelTable.put(_replace, Integer.valueOf(this.offset));
          }
        } else {
          EClass _eClass_1 = line.eClass();
          String _name_1 = _eClass_1.getName();
          boolean _equals_1 = _name_1.equals("Instruction");
          if (_equals_1) {
            Instruction instr = ((Instruction) line);
            String label_1 = instr.getLabel();
            boolean _notEquals_1 = (!Objects.equal(label_1, null));
            if (_notEquals_1) {
              String _replace_1 = label_1.replace(":", "");
              this.labelTable.put(_replace_1, Integer.valueOf(this.offset));
            }
          }
        }
        this.offset++;
      }
    }
  }
  
  public void compileProgram(final Program root) {
    EList<EObject> lines = root.getLines();
    for (final EObject line : lines) {
      {
        EClass _eClass = line.eClass();
        String _name = _eClass.getName();
        boolean _equals = _name.equals("Directive");
        if (_equals) {
          this.compileDirective(((Directive) line));
        } else {
          EClass _eClass_1 = line.eClass();
          String _name_1 = _eClass_1.getName();
          boolean _equals_1 = _name_1.equals("Instruction");
          if (_equals_1) {
            this.compileInstruction(((Instruction) line));
          }
        }
        this.offset++;
      }
    }
  }
  
  public StringBuffer compileDirective(final Directive dir) {
    StringBuffer _xblockexpression = null;
    {
      EObject dirType = dir.getDirective();
      StringBuffer _xifexpression = null;
      EClass _eClass = dirType.eClass();
      String _name = _eClass.getName();
      boolean _equals = _name.equals("NOOPDirective");
      if (_equals) {
        _xifexpression = this.compileNOOP(((NOOPDirective) dirType));
      } else {
        StringBuffer _xifexpression_1 = null;
        EClass _eClass_1 = dirType.eClass();
        String _name_1 = _eClass_1.getName();
        boolean _equals_1 = _name_1.equals("WordDirective");
        if (_equals_1) {
          _xifexpression_1 = this.compileWord(((WordDirective) dirType));
        }
        _xifexpression = _xifexpression_1;
      }
      _xblockexpression = _xifexpression;
    }
    return _xblockexpression;
  }
  
  public StringBuffer compileInstruction(final Instruction instr) {
    StringBuffer _xblockexpression = null;
    {
      EObject instrType = instr.getInstruction();
      StringBuffer _xifexpression = null;
      EClass _eClass = instrType.eClass();
      String _name = _eClass.getName();
      boolean _equals = _name.equals("IInstruction");
      if (_equals) {
        _xifexpression = this.compileIInstruction(((IInstruction) instrType));
      } else {
        StringBuffer _xifexpression_1 = null;
        EClass _eClass_1 = instrType.eClass();
        String _name_1 = _eClass_1.getName();
        boolean _equals_1 = _name_1.equals("RInstruction");
        if (_equals_1) {
          _xifexpression_1 = this.compileRInstruction(((RInstruction) instrType));
        } else {
          StringBuffer _xifexpression_2 = null;
          EClass _eClass_2 = instrType.eClass();
          String _name_2 = _eClass_2.getName();
          boolean _equals_2 = _name_2.equals("JInstruction");
          if (_equals_2) {
            _xifexpression_2 = this.compileJInstruction(((JInstruction) instrType));
          } else {
            StringBuffer _xifexpression_3 = null;
            EClass _eClass_3 = instrType.eClass();
            String _name_3 = _eClass_3.getName();
            boolean _equals_3 = _name_3.equals("OInstruction");
            if (_equals_3) {
              _xifexpression_3 = this.compileOInstruction(((OInstruction) instrType));
            }
            _xifexpression_2 = _xifexpression_3;
          }
          _xifexpression_1 = _xifexpression_2;
        }
        _xifexpression = _xifexpression_1;
      }
      _xblockexpression = _xifexpression;
    }
    return _xblockexpression;
  }
  
  public StringBuffer compileNOOP(final NOOPDirective noop) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("0000000000000000");
    _builder.newLine();
    return this.assembledOutput.append(_builder);
  }
  
  public StringBuffer compileWord(final WordDirective word) {
    StringBuffer _xblockexpression = null;
    {
      String wordImm = word.getImm();
      String wordImmBin = this.immToBinary(wordImm, 16);
      StringConcatenation _builder = new StringConcatenation();
      _builder.append(wordImmBin, "");
      _builder.newLineIfNotEmpty();
      _xblockexpression = this.assembledOutput.append(_builder);
    }
    return _xblockexpression;
  }
  
  public StringBuffer compileIInstruction(final IInstruction iInstr) {
    StringBuffer _xblockexpression = null;
    {
      String op = iInstr.getI_opcode();
      String reg1 = iInstr.getReg1();
      String reg2 = iInstr.getReg2();
      String imm = iInstr.getImm();
      String opBin = this.opToBinary(op);
      String reg1Bin = this.regToBinary(reg1);
      String reg2Bin = this.regToBinary(reg2);
      String immBin = "";
      boolean _equals = op.equals("beq");
      if (_equals) {
        Integer labelLine = this.labelTable.get(imm);
        boolean _notEquals = (!Objects.equal(labelLine, null));
        if (_notEquals) {
          String _string = Integer.toString(((labelLine).intValue() - this.offset));
          String _immToBinary = this.immToBinary(_string, 5);
          immBin = _immToBinary;
        } else {
          immBin = "00000";
        }
      } else {
        String _immToBinary_1 = this.immToBinary(imm, 5);
        immBin = _immToBinary_1;
      }
      StringConcatenation _builder = new StringConcatenation();
      _builder.append(opBin, "");
      _builder.append(" ");
      _builder.append(reg1Bin, "");
      _builder.append(" ");
      _builder.append(reg2Bin, "");
      _builder.append(" ");
      _builder.append(immBin, "");
      _builder.newLineIfNotEmpty();
      _xblockexpression = this.assembledOutput.append(_builder);
    }
    return _xblockexpression;
  }
  
  public StringBuffer compileRInstruction(final RInstruction rInstr) {
    StringBuffer _xblockexpression = null;
    {
      String op = rInstr.getR_opcode();
      String reg1 = rInstr.getReg1();
      String reg2 = rInstr.getReg2();
      String reg3 = rInstr.getReg3();
      String opBin = this.opToBinary(op);
      String reg1Bin = this.regToBinary(reg1);
      String reg2Bin = this.regToBinary(reg2);
      String reg3Bin = this.regToBinary(reg3);
      StringConcatenation _builder = new StringConcatenation();
      _builder.append(opBin, "");
      _builder.append(" ");
      _builder.append(reg1Bin, "");
      _builder.append(" ");
      _builder.append(reg2Bin, "");
      _builder.append(" ");
      _builder.append(reg3Bin, "");
      _builder.append(" 0");
      _builder.newLineIfNotEmpty();
      _xblockexpression = this.assembledOutput.append(_builder);
    }
    return _xblockexpression;
  }
  
  public StringBuffer compileJInstruction(final JInstruction jInstr) {
    StringBuffer _xblockexpression = null;
    {
      String op = jInstr.getJ_opcode();
      String reg1 = jInstr.getReg1();
      String reg2 = jInstr.getReg2();
      String opBin = this.opToBinary(op);
      String reg1Bin = this.regToBinary(reg1);
      String reg2Bin = this.regToBinary(reg2);
      StringConcatenation _builder = new StringConcatenation();
      _builder.append(opBin, "");
      _builder.append(" ");
      _builder.append(reg1Bin, "");
      _builder.append(" ");
      _builder.append(reg2Bin, "");
      _builder.append(" 00000");
      _builder.newLineIfNotEmpty();
      _xblockexpression = this.assembledOutput.append(_builder);
    }
    return _xblockexpression;
  }
  
  public StringBuffer compileOInstruction(final OInstruction oInstr) {
    StringBuffer _xblockexpression = null;
    {
      String op = oInstr.getO_opcode();
      String opBin = this.opToBinary(op);
      StringConcatenation _builder = new StringConcatenation();
      _builder.append(opBin, "");
      _builder.append(" 00000000000 0");
      _builder.newLineIfNotEmpty();
      _xblockexpression = this.assembledOutput.append(_builder);
    }
    return _xblockexpression;
  }
  
  public String opToBinary(final String op) {
    switch (op) {
      case "add":
        return "000";
      case "nand":
        return "001";
      case "addi":
        return "010";
      case "lw":
        return "011";
      case "sw":
        return "100";
      case "beq":
        return "101";
      case "jalr":
        return "110";
      case "halt":
        return "111";
      default:
        return "";
    }
  }
  
  public String regToBinary(final String reg) {
    switch (reg) {
      case "$zero":
        return "0000";
      case "$at":
        return "0001";
      case "$v0":
        return "0010";
      case "$a0":
        return "0011";
      case "$a1":
        return "0010";
      case "$a2":
        return "0101";
      case "$t0":
        return "0110";
      case "$t1":
        return "0111";
      case "$t2":
        return "1000";
      case "$s0":
        return "1001";
      case "$s1":
        return "1010";
      case "$s2":
        return "1011";
      case "$k0":
        return "1100";
      case "$sp":
        return "1101";
      case "$fp":
        return "1110";
      case "$ra":
        return "1111";
      default:
        return "";
    }
  }
  
  public String immToBinary(final String imm, final int bitLength) {
    int _parseInt = Integer.parseInt(imm);
    String immBin = Integer.toBinaryString(_parseInt);
    int _length = immBin.length();
    boolean _greaterThan = (_length > bitLength);
    if (_greaterThan) {
      int _length_1 = immBin.length();
      int _minus = (_length_1 - bitLength);
      int _length_2 = immBin.length();
      String _substring = immBin.substring(_minus, _length_2);
      immBin = _substring;
    } else {
      while (((immBin.length() - bitLength) < 0)) {
        immBin = ("0" + immBin);
      }
    }
    return immBin;
  }
}
