/**
 * generated by Xtext 2.9.1
 */
package org.team38.assembly.lC2200;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Directive</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.team38.assembly.lC2200.Directive#getLabel <em>Label</em>}</li>
 *   <li>{@link org.team38.assembly.lC2200.Directive#getDirective <em>Directive</em>}</li>
 *   <li>{@link org.team38.assembly.lC2200.Directive#getComment <em>Comment</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.team38.assembly.lC2200.LC2200Package#getDirective()
 * @model
 * @generated
 */
public interface Directive extends EObject
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
   * @see org.team38.assembly.lC2200.LC2200Package#getDirective_Label()
   * @model containment="true"
   * @generated
   */
  LabelBeg getLabel();

  /**
   * Sets the value of the '{@link org.team38.assembly.lC2200.Directive#getLabel <em>Label</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Label</em>' containment reference.
   * @see #getLabel()
   * @generated
   */
  void setLabel(LabelBeg value);

  /**
   * Returns the value of the '<em><b>Directive</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Directive</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Directive</em>' containment reference.
   * @see #setDirective(EObject)
   * @see org.team38.assembly.lC2200.LC2200Package#getDirective_Directive()
   * @model containment="true"
   * @generated
   */
  EObject getDirective();

  /**
   * Sets the value of the '{@link org.team38.assembly.lC2200.Directive#getDirective <em>Directive</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Directive</em>' containment reference.
   * @see #getDirective()
   * @generated
   */
  void setDirective(EObject value);

  /**
   * Returns the value of the '<em><b>Comment</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Comment</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Comment</em>' containment reference.
   * @see #setComment(CommentTrans)
   * @see org.team38.assembly.lC2200.LC2200Package#getDirective_Comment()
   * @model containment="true"
   * @generated
   */
  CommentTrans getComment();

  /**
   * Sets the value of the '{@link org.team38.assembly.lC2200.Directive#getComment <em>Comment</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Comment</em>' containment reference.
   * @see #getComment()
   * @generated
   */
  void setComment(CommentTrans value);

} // Directive
