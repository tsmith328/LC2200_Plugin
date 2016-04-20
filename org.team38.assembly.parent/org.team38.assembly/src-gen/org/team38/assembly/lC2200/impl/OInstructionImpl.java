/**
 * generated by Xtext 2.9.1
 */
package org.team38.assembly.lC2200.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.team38.assembly.lC2200.LC2200Package;
import org.team38.assembly.lC2200.OInstruction;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>OInstruction</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.team38.assembly.lC2200.impl.OInstructionImpl#getO_opcode <em>Oopcode</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OInstructionImpl extends MinimalEObjectImpl.Container implements OInstruction
{
  /**
   * The default value of the '{@link #getO_opcode() <em>Oopcode</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getO_opcode()
   * @generated
   * @ordered
   */
  protected static final String OOPCODE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getO_opcode() <em>Oopcode</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getO_opcode()
   * @generated
   * @ordered
   */
  protected String o_opcode = OOPCODE_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected OInstructionImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return LC2200Package.Literals.OINSTRUCTION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getO_opcode()
  {
    return o_opcode;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setO_opcode(String newO_opcode)
  {
    String oldO_opcode = o_opcode;
    o_opcode = newO_opcode;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LC2200Package.OINSTRUCTION__OOPCODE, oldO_opcode, o_opcode));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case LC2200Package.OINSTRUCTION__OOPCODE:
        return getO_opcode();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case LC2200Package.OINSTRUCTION__OOPCODE:
        setO_opcode((String)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case LC2200Package.OINSTRUCTION__OOPCODE:
        setO_opcode(OOPCODE_EDEFAULT);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case LC2200Package.OINSTRUCTION__OOPCODE:
        return OOPCODE_EDEFAULT == null ? o_opcode != null : !OOPCODE_EDEFAULT.equals(o_opcode);
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (o_opcode: ");
    result.append(o_opcode);
    result.append(')');
    return result.toString();
  }

} //OInstructionImpl
