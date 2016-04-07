/**
 * generated by Xtext 2.9.2
 */
package org.team38.assembly.lC2200;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>RInstruction</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.team38.assembly.lC2200.RInstruction#getR_opcode <em>Ropcode</em>}</li>
 *   <li>{@link org.team38.assembly.lC2200.RInstruction#getReg1 <em>Reg1</em>}</li>
 *   <li>{@link org.team38.assembly.lC2200.RInstruction#getReg2 <em>Reg2</em>}</li>
 *   <li>{@link org.team38.assembly.lC2200.RInstruction#getReg3 <em>Reg3</em>}</li>
 * </ul>
 *
 * @see org.team38.assembly.lC2200.LC2200Package#getRInstruction()
 * @model
 * @generated
 */
public interface RInstruction extends EObject
{
  /**
   * Returns the value of the '<em><b>Ropcode</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ropcode</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ropcode</em>' containment reference.
   * @see #setR_opcode(RInstructionTrans)
   * @see org.team38.assembly.lC2200.LC2200Package#getRInstruction_R_opcode()
   * @model containment="true"
   * @generated
   */
  RInstructionTrans getR_opcode();

  /**
   * Sets the value of the '{@link org.team38.assembly.lC2200.RInstruction#getR_opcode <em>Ropcode</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ropcode</em>' containment reference.
   * @see #getR_opcode()
   * @generated
   */
  void setR_opcode(RInstructionTrans value);

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
   * @see org.team38.assembly.lC2200.LC2200Package#getRInstruction_Reg1()
   * @model containment="true"
   * @generated
   */
  RegTrans getReg1();

  /**
   * Sets the value of the '{@link org.team38.assembly.lC2200.RInstruction#getReg1 <em>Reg1</em>}' containment reference.
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
   * @see org.team38.assembly.lC2200.LC2200Package#getRInstruction_Reg2()
   * @model containment="true"
   * @generated
   */
  RegTrans getReg2();

  /**
   * Sets the value of the '{@link org.team38.assembly.lC2200.RInstruction#getReg2 <em>Reg2</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Reg2</em>' containment reference.
   * @see #getReg2()
   * @generated
   */
  void setReg2(RegTrans value);

  /**
   * Returns the value of the '<em><b>Reg3</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Reg3</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Reg3</em>' containment reference.
   * @see #setReg3(RegTrans)
   * @see org.team38.assembly.lC2200.LC2200Package#getRInstruction_Reg3()
   * @model containment="true"
   * @generated
   */
  RegTrans getReg3();

  /**
   * Sets the value of the '{@link org.team38.assembly.lC2200.RInstruction#getReg3 <em>Reg3</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Reg3</em>' containment reference.
   * @see #getReg3()
   * @generated
   */
  void setReg3(RegTrans value);

} // RInstruction
