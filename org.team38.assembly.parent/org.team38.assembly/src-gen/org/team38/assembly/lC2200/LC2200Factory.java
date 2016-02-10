/**
 * generated by Xtext 2.9.1
 */
package org.team38.assembly.lC2200;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.team38.assembly.lC2200.LC2200Package
 * @generated
 */
public interface LC2200Factory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  LC2200Factory eINSTANCE = org.team38.assembly.lC2200.impl.LC2200FactoryImpl.init();

  /**
   * Returns a new object of class '<em>Program</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Program</em>'.
   * @generated
   */
  Program createProgram();

  /**
   * Returns a new object of class '<em>Instruction</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Instruction</em>'.
   * @generated
   */
  Instruction createInstruction();

  /**
   * Returns a new object of class '<em>Directive</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Directive</em>'.
   * @generated
   */
  Directive createDirective();

  /**
   * Returns a new object of class '<em>RInstruction</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>RInstruction</em>'.
   * @generated
   */
  RInstruction createRInstruction();

  /**
   * Returns a new object of class '<em>IInstruction</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>IInstruction</em>'.
   * @generated
   */
  IInstruction createIInstruction();

  /**
   * Returns a new object of class '<em>JInstruction</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>JInstruction</em>'.
   * @generated
   */
  JInstruction createJInstruction();

  /**
   * Returns a new object of class '<em>OInstruction</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>OInstruction</em>'.
   * @generated
   */
  OInstruction createOInstruction();

  /**
   * Returns a new object of class '<em>NOOP Directive</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>NOOP Directive</em>'.
   * @generated
   */
  NOOPDirective createNOOPDirective();

  /**
   * Returns a new object of class '<em>Word Directive</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Word Directive</em>'.
   * @generated
   */
  WordDirective createWordDirective();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  LC2200Package getLC2200Package();

} //LC2200Factory
