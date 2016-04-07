/**
 * generated by Xtext 2.9.2
 */
package org.team38.assembly.lC2200;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>IInstruction</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.team38.assembly.lC2200.IInstruction#getI_opcode <em>Iopcode</em>}</li>
 *   <li>{@link org.team38.assembly.lC2200.IInstruction#getReg1 <em>Reg1</em>}</li>
 *   <li>{@link org.team38.assembly.lC2200.IInstruction#getReg2 <em>Reg2</em>}</li>
 *   <li>{@link org.team38.assembly.lC2200.IInstruction#getImm <em>Imm</em>}</li>
 *   <li>{@link org.team38.assembly.lC2200.IInstruction#getLabel <em>Label</em>}</li>
 * </ul>
 *
 * @see org.team38.assembly.lC2200.LC2200Package#getIInstruction()
 * @model
 * @generated
 */
public interface IInstruction extends EObject
{
  /**
   * Returns the value of the '<em><b>Iopcode</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Iopcode</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Iopcode</em>' containment reference.
   * @see #setI_opcode(EObject)
   * @see org.team38.assembly.lC2200.LC2200Package#getIInstruction_I_opcode()
   * @model containment="true"
   * @generated
   */
  EObject getI_opcode();

  /**
   * Sets the value of the '{@link org.team38.assembly.lC2200.IInstruction#getI_opcode <em>Iopcode</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Iopcode</em>' containment reference.
   * @see #getI_opcode()
   * @generated
   */
  void setI_opcode(EObject value);

  /**
   * Returns the value of the '<em><b>Reg1</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Reg1</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Reg1</em>' containment reference.
   * @see #setReg1(RegTrans)
   * @see org.team38.assembly.lC2200.LC2200Package#getIInstruction_Reg1()
   * @model containment="true"
   * @generated
   */
  RegTrans getReg1();

  /**
   * Sets the value of the '{@link org.team38.assembly.lC2200.IInstruction#getReg1 <em>Reg1</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Reg1</em>' containment reference.
   * @see #getReg1()
   * @generated
   */
  void setReg1(RegTrans value);

  /**
   * Returns the value of the '<em><b>Reg2</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Reg2</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Reg2</em>' containment reference.
   * @see #setReg2(RegTrans)
   * @see org.team38.assembly.lC2200.LC2200Package#getIInstruction_Reg2()
   * @model containment="true"
   * @generated
   */
  RegTrans getReg2();

  /**
   * Sets the value of the '{@link org.team38.assembly.lC2200.IInstruction#getReg2 <em>Reg2</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Reg2</em>' containment reference.
   * @see #getReg2()
   * @generated
   */
  void setReg2(RegTrans value);

  /**
   * Returns the value of the '<em><b>Imm</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Imm</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Imm</em>' attribute.
   * @see #setImm(String)
   * @see org.team38.assembly.lC2200.LC2200Package#getIInstruction_Imm()
   * @model
   * @generated
   */
  String getImm();

  /**
   * Sets the value of the '{@link org.team38.assembly.lC2200.IInstruction#getImm <em>Imm</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Imm</em>' attribute.
   * @see #getImm()
   * @generated
   */
  void setImm(String value);

  /**
   * Returns the value of the '<em><b>Label</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Label</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Label</em>' containment reference.
   * @see #setLabel(LabelEnd)
   * @see org.team38.assembly.lC2200.LC2200Package#getIInstruction_Label()
   * @model containment="true"
   * @generated
   */
  LabelEnd getLabel();

  /**
   * Sets the value of the '{@link org.team38.assembly.lC2200.IInstruction#getLabel <em>Label</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Label</em>' containment reference.
   * @see #getLabel()
   * @generated
   */
  void setLabel(LabelEnd value);

} // IInstruction
