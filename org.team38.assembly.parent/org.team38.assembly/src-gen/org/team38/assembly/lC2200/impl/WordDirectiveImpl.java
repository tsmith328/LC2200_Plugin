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

import org.team38.assembly.lC2200.LC2200Package;
import org.team38.assembly.lC2200.WordDirective;
import org.team38.assembly.lC2200.WordTrans;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Word Directive</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.team38.assembly.lC2200.impl.WordDirectiveImpl#getW_dir <em>Wdir</em>}</li>
 *   <li>{@link org.team38.assembly.lC2200.impl.WordDirectiveImpl#getImm <em>Imm</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WordDirectiveImpl extends MinimalEObjectImpl.Container implements WordDirective
{
  /**
   * The cached value of the '{@link #getW_dir() <em>Wdir</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getW_dir()
   * @generated
   * @ordered
   */
  protected WordTrans w_dir;

  /**
   * The default value of the '{@link #getImm() <em>Imm</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getImm()
   * @generated
   * @ordered
   */
  protected static final String IMM_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getImm() <em>Imm</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getImm()
   * @generated
   * @ordered
   */
  protected String imm = IMM_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected WordDirectiveImpl()
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
    return LC2200Package.Literals.WORD_DIRECTIVE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public WordTrans getW_dir()
  {
    return w_dir;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetW_dir(WordTrans newW_dir, NotificationChain msgs)
  {
    WordTrans oldW_dir = w_dir;
    w_dir = newW_dir;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LC2200Package.WORD_DIRECTIVE__WDIR, oldW_dir, newW_dir);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setW_dir(WordTrans newW_dir)
  {
    if (newW_dir != w_dir)
    {
      NotificationChain msgs = null;
      if (w_dir != null)
        msgs = ((InternalEObject)w_dir).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LC2200Package.WORD_DIRECTIVE__WDIR, null, msgs);
      if (newW_dir != null)
        msgs = ((InternalEObject)newW_dir).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LC2200Package.WORD_DIRECTIVE__WDIR, null, msgs);
      msgs = basicSetW_dir(newW_dir, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LC2200Package.WORD_DIRECTIVE__WDIR, newW_dir, newW_dir));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getImm()
  {
    return imm;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setImm(String newImm)
  {
    String oldImm = imm;
    imm = newImm;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LC2200Package.WORD_DIRECTIVE__IMM, oldImm, imm));
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
      case LC2200Package.WORD_DIRECTIVE__WDIR:
        return basicSetW_dir(null, msgs);
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
      case LC2200Package.WORD_DIRECTIVE__WDIR:
        return getW_dir();
      case LC2200Package.WORD_DIRECTIVE__IMM:
        return getImm();
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
      case LC2200Package.WORD_DIRECTIVE__WDIR:
        setW_dir((WordTrans)newValue);
        return;
      case LC2200Package.WORD_DIRECTIVE__IMM:
        setImm((String)newValue);
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
      case LC2200Package.WORD_DIRECTIVE__WDIR:
        setW_dir((WordTrans)null);
        return;
      case LC2200Package.WORD_DIRECTIVE__IMM:
        setImm(IMM_EDEFAULT);
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
      case LC2200Package.WORD_DIRECTIVE__WDIR:
        return w_dir != null;
      case LC2200Package.WORD_DIRECTIVE__IMM:
        return IMM_EDEFAULT == null ? imm != null : !IMM_EDEFAULT.equals(imm);
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
    result.append(" (imm: ");
    result.append(imm);
    result.append(')');
    return result.toString();
  }

} //WordDirectiveImpl
