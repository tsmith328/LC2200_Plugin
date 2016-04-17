/**
 * generated by Xtext 2.9.1
 */
package org.team38.assembly.lC2200;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Line</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.team38.assembly.lC2200.Line#getLabel <em>Label</em>}</li>
 * </ul>
 *
 * @see org.team38.assembly.lC2200.LC2200Package#getLine()
 * @model
 * @generated
 */
public interface Line extends EObject
{
  /**
   * Returns the value of the '<em><b>Label</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Label</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Label</em>' containment reference.
   * @see #setLabel(LabelBeg)
   * @see org.team38.assembly.lC2200.LC2200Package#getLine_Label()
   * @model containment="true"
   * @generated
   */
  LabelBeg getLabel();

  /**
   * Sets the value of the '{@link org.team38.assembly.lC2200.Line#getLabel <em>Label</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Label</em>' containment reference.
   * @see #getLabel()
   * @generated
   */
  void setLabel(LabelBeg value);

} // Line