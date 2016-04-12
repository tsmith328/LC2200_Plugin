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

import org.team38.assembly.lC2200.LADirective;
import org.team38.assembly.lC2200.LATrans;
import org.team38.assembly.lC2200.LC2200Package;
import org.team38.assembly.lC2200.LabelEnd;
import org.team38.assembly.lC2200.RegTrans;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>LA Directive</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.team38.assembly.lC2200.impl.LADirectiveImpl#getLa_dir <em>La dir</em>}</li>
 *   <li>{@link org.team38.assembly.lC2200.impl.LADirectiveImpl#getReg <em>Reg</em>}</li>
 *   <li>{@link org.team38.assembly.lC2200.impl.LADirectiveImpl#getLabel <em>Label</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LADirectiveImpl extends MinimalEObjectImpl.Container implements LADirective
{
  /**
   * The cached value of the '{@link #getLa_dir() <em>La dir</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLa_dir()
   * @generated
   * @ordered
   */
  protected LATrans la_dir;

  /**
   * The cached value of the '{@link #getReg() <em>Reg</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getReg()
   * @generated
   * @ordered
   */
  protected RegTrans reg;

  /**
   * The cached value of the '{@link #getLabel() <em>Label</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLabel()
   * @generated
   * @ordered
   */
  protected LabelEnd label;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected LADirectiveImpl()
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
    return LC2200Package.Literals.LA_DIRECTIVE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LATrans getLa_dir()
  {
    return la_dir;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetLa_dir(LATrans newLa_dir, NotificationChain msgs)
  {
    LATrans oldLa_dir = la_dir;
    la_dir = newLa_dir;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LC2200Package.LA_DIRECTIVE__LA_DIR, oldLa_dir, newLa_dir);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLa_dir(LATrans newLa_dir)
  {
    if (newLa_dir != la_dir)
    {
      NotificationChain msgs = null;
      if (la_dir != null)
        msgs = ((InternalEObject)la_dir).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LC2200Package.LA_DIRECTIVE__LA_DIR, null, msgs);
      if (newLa_dir != null)
        msgs = ((InternalEObject)newLa_dir).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LC2200Package.LA_DIRECTIVE__LA_DIR, null, msgs);
      msgs = basicSetLa_dir(newLa_dir, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LC2200Package.LA_DIRECTIVE__LA_DIR, newLa_dir, newLa_dir));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RegTrans getReg()
  {
    return reg;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetReg(RegTrans newReg, NotificationChain msgs)
  {
    RegTrans oldReg = reg;
    reg = newReg;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LC2200Package.LA_DIRECTIVE__REG, oldReg, newReg);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setReg(RegTrans newReg)
  {
    if (newReg != reg)
    {
      NotificationChain msgs = null;
      if (reg != null)
        msgs = ((InternalEObject)reg).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LC2200Package.LA_DIRECTIVE__REG, null, msgs);
      if (newReg != null)
        msgs = ((InternalEObject)newReg).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LC2200Package.LA_DIRECTIVE__REG, null, msgs);
      msgs = basicSetReg(newReg, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LC2200Package.LA_DIRECTIVE__REG, newReg, newReg));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LabelEnd getLabel()
  {
    return label;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetLabel(LabelEnd newLabel, NotificationChain msgs)
  {
    LabelEnd oldLabel = label;
    label = newLabel;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LC2200Package.LA_DIRECTIVE__LABEL, oldLabel, newLabel);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLabel(LabelEnd newLabel)
  {
    if (newLabel != label)
    {
      NotificationChain msgs = null;
      if (label != null)
        msgs = ((InternalEObject)label).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LC2200Package.LA_DIRECTIVE__LABEL, null, msgs);
      if (newLabel != null)
        msgs = ((InternalEObject)newLabel).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LC2200Package.LA_DIRECTIVE__LABEL, null, msgs);
      msgs = basicSetLabel(newLabel, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LC2200Package.LA_DIRECTIVE__LABEL, newLabel, newLabel));
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
      case LC2200Package.LA_DIRECTIVE__LA_DIR:
        return basicSetLa_dir(null, msgs);
      case LC2200Package.LA_DIRECTIVE__REG:
        return basicSetReg(null, msgs);
      case LC2200Package.LA_DIRECTIVE__LABEL:
        return basicSetLabel(null, msgs);
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
      case LC2200Package.LA_DIRECTIVE__LA_DIR:
        return getLa_dir();
      case LC2200Package.LA_DIRECTIVE__REG:
        return getReg();
      case LC2200Package.LA_DIRECTIVE__LABEL:
        return getLabel();
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
      case LC2200Package.LA_DIRECTIVE__LA_DIR:
        setLa_dir((LATrans)newValue);
        return;
      case LC2200Package.LA_DIRECTIVE__REG:
        setReg((RegTrans)newValue);
        return;
      case LC2200Package.LA_DIRECTIVE__LABEL:
        setLabel((LabelEnd)newValue);
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
      case LC2200Package.LA_DIRECTIVE__LA_DIR:
        setLa_dir((LATrans)null);
        return;
      case LC2200Package.LA_DIRECTIVE__REG:
        setReg((RegTrans)null);
        return;
      case LC2200Package.LA_DIRECTIVE__LABEL:
        setLabel((LabelEnd)null);
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
      case LC2200Package.LA_DIRECTIVE__LA_DIR:
        return la_dir != null;
      case LC2200Package.LA_DIRECTIVE__REG:
        return reg != null;
      case LC2200Package.LA_DIRECTIVE__LABEL:
        return label != null;
    }
    return super.eIsSet(featureID);
  }

} //LADirectiveImpl