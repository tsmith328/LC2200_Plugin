/**
 * generated by Xtext 2.9.1
 */
package org.team38.assembly.lC2200.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.team38.assembly.lC2200.LC2200Package;
import org.team38.assembly.lC2200.RInstructionTrans;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>RInstruction Trans</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.team38.assembly.lC2200.impl.RInstructionTransImpl#getR_opcode <em>Ropcode</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RInstructionTransImpl extends MinimalEObjectImpl.Container implements RInstructionTrans
{
  /**
   * The default value of the '{@link #getR_opcode() <em>Ropcode</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getR_opcode()
   * @generated
   * @ordered
   */
  protected static final String ROPCODE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getR_opcode() <em>Ropcode</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getR_opcode()
   * @generated
   * @ordered
   */
  protected String r_opcode = ROPCODE_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected RInstructionTransImpl()
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
    return LC2200Package.Literals.RINSTRUCTION_TRANS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getR_opcode()
  {
    return r_opcode;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setR_opcode(String newR_opcode)
  {
    String oldR_opcode = r_opcode;
    r_opcode = newR_opcode;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LC2200Package.RINSTRUCTION_TRANS__ROPCODE, oldR_opcode, r_opcode));
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
      case LC2200Package.RINSTRUCTION_TRANS__ROPCODE:
        return getR_opcode();
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
      case LC2200Package.RINSTRUCTION_TRANS__ROPCODE:
        setR_opcode((String)newValue);
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
      case LC2200Package.RINSTRUCTION_TRANS__ROPCODE:
        setR_opcode(ROPCODE_EDEFAULT);
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
      case LC2200Package.RINSTRUCTION_TRANS__ROPCODE:
        return ROPCODE_EDEFAULT == null ? r_opcode != null : !ROPCODE_EDEFAULT.equals(r_opcode);
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
    result.append(" (r_opcode: ");
    result.append(r_opcode);
    result.append(')');
    return result.toString();
  }

} //RInstructionTransImpl
