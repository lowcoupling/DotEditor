/**
 */
package com.lowcoupling.dotEditor.dot.impl;

import com.lowcoupling.dotEditor.dot.Attribute;
import com.lowcoupling.dotEditor.dot.DirectedEdge;
import com.lowcoupling.dotEditor.dot.DotPackage;
import com.lowcoupling.dotEditor.dot.Node;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Directed Edge</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.lowcoupling.dotEditor.dot.impl.DirectedEdgeImpl#getSrc <em>Src</em>}</li>
 *   <li>{@link com.lowcoupling.dotEditor.dot.impl.DirectedEdgeImpl#getTgt <em>Tgt</em>}</li>
 *   <li>{@link com.lowcoupling.dotEditor.dot.impl.DirectedEdgeImpl#getAttributes <em>Attributes</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DirectedEdgeImpl extends MinimalEObjectImpl.Container implements DirectedEdge
{
  /**
   * The cached value of the '{@link #getSrc() <em>Src</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSrc()
   * @generated
   * @ordered
   */
  protected Node src;

  /**
   * The cached value of the '{@link #getTgt() <em>Tgt</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTgt()
   * @generated
   * @ordered
   */
  protected Node tgt;

  /**
   * The cached value of the '{@link #getAttributes() <em>Attributes</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAttributes()
   * @generated
   * @ordered
   */
  protected EList<Attribute> attributes;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DirectedEdgeImpl()
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
    return DotPackage.Literals.DIRECTED_EDGE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Node getSrc()
  {
    return src;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSrc(Node newSrc, NotificationChain msgs)
  {
    Node oldSrc = src;
    src = newSrc;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DotPackage.DIRECTED_EDGE__SRC, oldSrc, newSrc);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSrc(Node newSrc)
  {
    if (newSrc != src)
    {
      NotificationChain msgs = null;
      if (src != null)
        msgs = ((InternalEObject)src).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DotPackage.DIRECTED_EDGE__SRC, null, msgs);
      if (newSrc != null)
        msgs = ((InternalEObject)newSrc).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DotPackage.DIRECTED_EDGE__SRC, null, msgs);
      msgs = basicSetSrc(newSrc, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DotPackage.DIRECTED_EDGE__SRC, newSrc, newSrc));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Node getTgt()
  {
    return tgt;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTgt(Node newTgt, NotificationChain msgs)
  {
    Node oldTgt = tgt;
    tgt = newTgt;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DotPackage.DIRECTED_EDGE__TGT, oldTgt, newTgt);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTgt(Node newTgt)
  {
    if (newTgt != tgt)
    {
      NotificationChain msgs = null;
      if (tgt != null)
        msgs = ((InternalEObject)tgt).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DotPackage.DIRECTED_EDGE__TGT, null, msgs);
      if (newTgt != null)
        msgs = ((InternalEObject)newTgt).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DotPackage.DIRECTED_EDGE__TGT, null, msgs);
      msgs = basicSetTgt(newTgt, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DotPackage.DIRECTED_EDGE__TGT, newTgt, newTgt));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Attribute> getAttributes()
  {
    if (attributes == null)
    {
      attributes = new EObjectContainmentEList<Attribute>(Attribute.class, this, DotPackage.DIRECTED_EDGE__ATTRIBUTES);
    }
    return attributes;
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
      case DotPackage.DIRECTED_EDGE__SRC:
        return basicSetSrc(null, msgs);
      case DotPackage.DIRECTED_EDGE__TGT:
        return basicSetTgt(null, msgs);
      case DotPackage.DIRECTED_EDGE__ATTRIBUTES:
        return ((InternalEList<?>)getAttributes()).basicRemove(otherEnd, msgs);
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
      case DotPackage.DIRECTED_EDGE__SRC:
        return getSrc();
      case DotPackage.DIRECTED_EDGE__TGT:
        return getTgt();
      case DotPackage.DIRECTED_EDGE__ATTRIBUTES:
        return getAttributes();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case DotPackage.DIRECTED_EDGE__SRC:
        setSrc((Node)newValue);
        return;
      case DotPackage.DIRECTED_EDGE__TGT:
        setTgt((Node)newValue);
        return;
      case DotPackage.DIRECTED_EDGE__ATTRIBUTES:
        getAttributes().clear();
        getAttributes().addAll((Collection<? extends Attribute>)newValue);
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
      case DotPackage.DIRECTED_EDGE__SRC:
        setSrc((Node)null);
        return;
      case DotPackage.DIRECTED_EDGE__TGT:
        setTgt((Node)null);
        return;
      case DotPackage.DIRECTED_EDGE__ATTRIBUTES:
        getAttributes().clear();
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
      case DotPackage.DIRECTED_EDGE__SRC:
        return src != null;
      case DotPackage.DIRECTED_EDGE__TGT:
        return tgt != null;
      case DotPackage.DIRECTED_EDGE__ATTRIBUTES:
        return attributes != null && !attributes.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //DirectedEdgeImpl
