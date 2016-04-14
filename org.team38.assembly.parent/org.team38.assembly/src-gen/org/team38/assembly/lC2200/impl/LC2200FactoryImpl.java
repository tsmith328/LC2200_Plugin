/**
 * generated by Xtext 2.9.1
 */
package org.team38.assembly.lC2200.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.team38.assembly.lC2200.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class LC2200FactoryImpl extends EFactoryImpl implements LC2200Factory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static LC2200Factory init()
  {
    try
    {
      LC2200Factory theLC2200Factory = (LC2200Factory)EPackage.Registry.INSTANCE.getEFactory(LC2200Package.eNS_URI);
      if (theLC2200Factory != null)
      {
        return theLC2200Factory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new LC2200FactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LC2200FactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case LC2200Package.PROGRAM: return createProgram();
      case LC2200Package.LINE: return createLine();
      case LC2200Package.INSTRUCTION: return createInstruction();
      case LC2200Package.DIRECTIVE: return createDirective();
      case LC2200Package.RINSTRUCTION: return createRInstruction();
      case LC2200Package.IINSTRUCTION: return createIInstruction();
      case LC2200Package.JINSTRUCTION: return createJInstruction();
      case LC2200Package.OINSTRUCTION: return createOInstruction();
      case LC2200Package.NOOP_DIRECTIVE: return createNOOPDirective();
      case LC2200Package.WORD_DIRECTIVE: return createWordDirective();
      case LC2200Package.LA_DIRECTIVE: return createLADirective();
      case LC2200Package.RINSTRUCTION_TRANS: return createRInstructionTrans();
      case LC2200Package.IINSTRUCTION_IMM_TRANS: return createIInstructionImmTrans();
      case LC2200Package.IINSTRUCTION_OFFSET_TRANS: return createIInstructionOffsetTrans();
      case LC2200Package.IINSTRUCTION_LABEL_TRANS: return createIInstructionLabelTrans();
      case LC2200Package.JINSTRUCTION_TRANS: return createJInstructionTrans();
      case LC2200Package.WORD_TRANS: return createWordTrans();
      case LC2200Package.LA_TRANS: return createLATrans();
      case LC2200Package.COMMENT_TRANS: return createCommentTrans();
      case LC2200Package.LINE_END: return createLineEnd();
      case LC2200Package.REG_TRANS: return createRegTrans();
      case LC2200Package.LABEL_BEG: return createLabelBeg();
      case LC2200Package.LABEL_END: return createLabelEnd();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Program createProgram()
  {
    ProgramImpl program = new ProgramImpl();
    return program;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Line createLine()
  {
    LineImpl line = new LineImpl();
    return line;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Instruction createInstruction()
  {
    InstructionImpl instruction = new InstructionImpl();
    return instruction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Directive createDirective()
  {
    DirectiveImpl directive = new DirectiveImpl();
    return directive;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RInstruction createRInstruction()
  {
    RInstructionImpl rInstruction = new RInstructionImpl();
    return rInstruction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IInstruction createIInstruction()
  {
    IInstructionImpl iInstruction = new IInstructionImpl();
    return iInstruction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public JInstruction createJInstruction()
  {
    JInstructionImpl jInstruction = new JInstructionImpl();
    return jInstruction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OInstruction createOInstruction()
  {
    OInstructionImpl oInstruction = new OInstructionImpl();
    return oInstruction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NOOPDirective createNOOPDirective()
  {
    NOOPDirectiveImpl noopDirective = new NOOPDirectiveImpl();
    return noopDirective;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public WordDirective createWordDirective()
  {
    WordDirectiveImpl wordDirective = new WordDirectiveImpl();
    return wordDirective;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LADirective createLADirective()
  {
    LADirectiveImpl laDirective = new LADirectiveImpl();
    return laDirective;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RInstructionTrans createRInstructionTrans()
  {
    RInstructionTransImpl rInstructionTrans = new RInstructionTransImpl();
    return rInstructionTrans;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IInstructionImmTrans createIInstructionImmTrans()
  {
    IInstructionImmTransImpl iInstructionImmTrans = new IInstructionImmTransImpl();
    return iInstructionImmTrans;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IInstructionOffsetTrans createIInstructionOffsetTrans()
  {
    IInstructionOffsetTransImpl iInstructionOffsetTrans = new IInstructionOffsetTransImpl();
    return iInstructionOffsetTrans;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IInstructionLabelTrans createIInstructionLabelTrans()
  {
    IInstructionLabelTransImpl iInstructionLabelTrans = new IInstructionLabelTransImpl();
    return iInstructionLabelTrans;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public JInstructionTrans createJInstructionTrans()
  {
    JInstructionTransImpl jInstructionTrans = new JInstructionTransImpl();
    return jInstructionTrans;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public WordTrans createWordTrans()
  {
    WordTransImpl wordTrans = new WordTransImpl();
    return wordTrans;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LATrans createLATrans()
  {
    LATransImpl laTrans = new LATransImpl();
    return laTrans;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CommentTrans createCommentTrans()
  {
    CommentTransImpl commentTrans = new CommentTransImpl();
    return commentTrans;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LineEnd createLineEnd()
  {
    LineEndImpl lineEnd = new LineEndImpl();
    return lineEnd;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RegTrans createRegTrans()
  {
    RegTransImpl regTrans = new RegTransImpl();
    return regTrans;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LabelBeg createLabelBeg()
  {
    LabelBegImpl labelBeg = new LabelBegImpl();
    return labelBeg;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LabelEnd createLabelEnd()
  {
    LabelEndImpl labelEnd = new LabelEndImpl();
    return labelEnd;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LC2200Package getLC2200Package()
  {
    return (LC2200Package)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static LC2200Package getPackage()
  {
    return LC2200Package.eINSTANCE;
  }

} //LC2200FactoryImpl
