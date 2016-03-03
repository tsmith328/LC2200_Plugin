/**
 * generated by Xtext 2.9.1
 */
package org.team38.assembly.lC2200.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.team38.assembly.lC2200.JInstruction;
import org.team38.assembly.lC2200.JInstructionTrans;
import org.team38.assembly.lC2200.LC2200Package;
import org.team38.assembly.lC2200.RegTrans;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>JInstruction</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.team38.assembly.lC2200.impl.JInstructionImpl#getJ_opcode <em>Jopcode</em>}</li>
 *   <li>{@link org.team38.assembly.lC2200.impl.JInstructionImpl#getReg1 <em>Reg1</em>}</li>
 *   <li>{@link org.team38.assembly.lC2200.impl.JInstructionImpl#getReg2 <em>Reg2</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class JInstructionImpl extends MinimalEObjectImpl.Container implements JInstruction
{
  /**
   * The cached value of the '{@link #getJ_opcode() <em>Jopcode</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getJ_opcode()
   * @generated
   * @ordered
   */
  protected JInstructionTrans j_opcode;

  /**
   * The cached value of the '{@link #getReg1() <em>Reg1</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getReg1()
   * @generated
   * @ordered
   */
  protected RegTrans reg1;

  /**
   * The cached value of the '{@link #getReg2() <em>Reg2</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getReg2()
   * @generated
   * @ordered
   */
  protected RegTrans reg2;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected JInstructionImpl()
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
    return LC2200Package.Literals.JINSTRUCTION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public JInstructionTrans getJ_opcode()
  {
    return j_opcode;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetJ_opcode(JInstructionTrans newJ_opcode, NotificationChain msgs)
  {
    JInstructionTrans oldJ_opcode = j_opcode;
    j_opcode = newJ_opcode;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LC2200Package.JINSTRUCTION__JOPCODE, oldJ_opcode, newJ_opcode);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setJ_opcode(JInstructionTrans newJ_opcode)
  {
    if (newJ_opcode != j_opcode)
    {
      NotificationChain msgs = null;
      if (j_opcode != null)
        msgs = ((InternalEObject)j_opcode).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LC2200Package.JINSTRUCTION__JOPCODE, null, msgs);
      if (newJ_opcode != null)
        msgs = ((InternalEObject)newJ_opcode).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LC2200Package.JINSTRUCTION__JOPCODE, null, msgs);
      msgs = basicSetJ_opcode(newJ_opcode, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LC2200Package.JINSTRUCTION__JOPCODE, newJ_opcode, newJ_opcode));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RegTrans getReg1()
  {
    return reg1;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetReg1(RegTrans newReg1, NotificationChain msgs)
  {
    RegTrans oldReg1 = reg1;
    reg1 = newReg1;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LC2200Package.JINSTRUCTION__REG1, oldReg1, newReg1);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setReg1(RegTrans newReg1)
  {
    if (newReg1 != reg1)
    {
      NotificationChain msgs = null;
      if (reg1 != null)
        msgs = ((InternalEObject)reg1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LC2200Package.JINSTRUCTION__REG1, null, msgs);
      if (newReg1 != null)
        msgs = ((InternalEObject)newReg1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LC2200Package.JINSTRUCTION__REG1, null, msgs);
      msgs = basicSetReg1(newReg1, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LC2200Package.JINSTRUCTION__REG1, newReg1, newReg1));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RegTrans getReg2()
  {
    return reg2;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetReg2(RegTrans newReg2, NotificationChain msgs)
  {
    RegTrans oldReg2 = reg2;
    reg2 = newReg2;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LC2200Package.JINSTRUCTION__REG2, oldReg2, newReg2);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setReg2(RegTrans newReg2)
  {
    if (newReg2 != reg2)
    {
      NotificationChain msgs = null;
      if (reg2 != null)
        msgs = ((InternalEObject)reg2).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LC2200Package.JINSTRUCTION__REG2, null, msgs);
      if (newReg2 != null)
        msgs = ((InternalEObject)newReg2).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LC2200Package.JINSTRUCTION__REG2, null, msgs);
      msgs = basicSetReg2(newReg2, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LC2200Package.JINSTRUCTION__REG2, newReg2, newReg2));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case LC2200Package.JINSTRUCTION__JOPCODE:
        return basicSetJ_opcode(null, msgs);
      case LC2200Package.JINSTRUCTION__REG1:
        return basicSetReg1(null, msgs);
      case LC2200Package.JINSTRUCTION__REG2:
        return basicSetReg2(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
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
      case LC2200Package.JINSTRUCTION__JOPCODE:
        return getJ_opcode();
      case LC2200Package.JINSTRUCTION__REG1:
        return getReg1();
      case LC2200Package.JINSTRUCTION__REG2:
        return getReg2();
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
      case LC2200Package.JINSTRUCTION__JOPCODE:
        setJ_opcode((JInstructionTrans)newValue);
        return;
      case LC2200Package.JINSTRUCTION__REG1:
        setReg1((RegTrans)newValue);
        return;
      case LC2200Package.JINSTRUCTION__REG2:
        setReg2((RegTrans)newValue);
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
      case LC2200Package.JINSTRUCTION__JOPCODE:
        setJ_opcode((JInstructionTrans)null);
        return;
      case LC2200Package.JINSTRUCTION__REG1:
        setReg1((RegTrans)null);
        return;
      case LC2200Package.JINSTRUCTION__REG2:
        setReg2((RegTrans)null);
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
      case LC2200Package.JINSTRUCTION__JOPCODE:
        return j_opcode != null;
      case LC2200Package.JINSTRUCTION__REG1:
        return reg1 != null;
      case LC2200Package.JINSTRUCTION__REG2:
        return reg2 != null;
    }
    return super.eIsSet(featureID);
  }

} //JInstructionImpl
