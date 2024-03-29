/**
 * generated by Xtext 2.9.1
 */
package org.team38.assembly.lC2200;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Program</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.team38.assembly.lC2200.Program#getLines <em>Lines</em>}</li>
 * </ul>
 *
 * @see org.team38.assembly.lC2200.LC2200Package#getProgram()
 * @model
 * @generated
 */
public interface Program extends EObject
{
  /**
   * Returns the value of the '<em><b>Lines</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Lines</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Lines</em>' containment reference list.
   * @see org.team38.assembly.lC2200.LC2200Package#getProgram_Lines()
   * @model containment="true"
   * @generated
   */
  EList<EObject> getLines();

} // Program
