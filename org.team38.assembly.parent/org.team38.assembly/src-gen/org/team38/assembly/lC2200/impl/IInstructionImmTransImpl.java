/**
 * generated by Xtext 2.9.1
 */
package org.team38.assembly.lC2200.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.team38.assembly.lC2200.IInstructionImmTrans;
import org.team38.assembly.lC2200.LC2200Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>IInstruction Imm Trans</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.team38.assembly.lC2200.impl.IInstructionImmTransImpl#getI_opcode <em>Iopcode</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IInstructionImmTransImpl extends MinimalEObjectImpl.Container implements IInstructionImmTrans
{
  /**
   * The default value of the '{@link #getI_opcode() <em>Iopcode</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getI_opcode()
   * @generated
   * @ordered
   */
  protected static final String IOPCODE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getI_opcode() <em>Iopcode</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getI_opcode()
   * @generated
   * @ordered
   */
  protected String i_opcode = IOPCODE_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected IInstructionImmTransImpl()
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
    return LC2200Package.Literals.IINSTRUCTION_IMM_TRANS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getI_opcode()
  {
    return i_opcode;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setI_opcode(String newI_opcode)
  {
    String oldI_opcode = i_opcode;
    i_opcode = newI_opcode;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LC2200Package.IINSTRUCTION_IMM_TRANS__IOPCODE, oldI_opcode, i_opcode));
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
      case LC2200Package.IINSTRUCTION_IMM_TRANS__IOPCODE:
        return getI_opcode();
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
      case LC2200Package.IINSTRUCTION_IMM_TRANS__IOPCODE:
        setI_opcode((String)newValue);
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
      case LC2200Package.IINSTRUCTION_IMM_TRANS__IOPCODE:
        setI_opcode(IOPCODE_EDEFAULT);
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
      case LC2200Package.IINSTRUCTION_IMM_TRANS__IOPCODE:
        return IOPCODE_EDEFAULT == null ? i_opcode != null : !IOPCODE_EDEFAULT.equals(i_opcode);
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
    result.append(" (i_opcode: ");
    result.append(i_opcode);
    result.append(')');
    return result.toString();
  }

} //IInstructionImmTransImpl
