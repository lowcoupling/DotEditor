/**
 */
package com.lowcoupling.dotEditor.dot;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Directed Edge</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.lowcoupling.dotEditor.dot.DirectedEdge#getSrc <em>Src</em>}</li>
 *   <li>{@link com.lowcoupling.dotEditor.dot.DirectedEdge#getTgt <em>Tgt</em>}</li>
 *   <li>{@link com.lowcoupling.dotEditor.dot.DirectedEdge#getAttributes <em>Attributes</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.lowcoupling.dotEditor.dot.DotPackage#getDirectedEdge()
 * @model
 * @generated
 */
public interface DirectedEdge extends EObject
{
  /**
   * Returns the value of the '<em><b>Src</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Src</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Src</em>' containment reference.
   * @see #setSrc(Node)
   * @see com.lowcoupling.dotEditor.dot.DotPackage#getDirectedEdge_Src()
   * @model containment="true"
   * @generated
   */
  Node getSrc();

  /**
   * Sets the value of the '{@link com.lowcoupling.dotEditor.dot.DirectedEdge#getSrc <em>Src</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Src</em>' containment reference.
   * @see #getSrc()
   * @generated
   */
  void setSrc(Node value);

  /**
   * Returns the value of the '<em><b>Tgt</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Tgt</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Tgt</em>' containment reference.
   * @see #setTgt(Node)
   * @see com.lowcoupling.dotEditor.dot.DotPackage#getDirectedEdge_Tgt()
   * @model containment="true"
   * @generated
   */
  Node getTgt();

  /**
   * Sets the value of the '{@link com.lowcoupling.dotEditor.dot.DirectedEdge#getTgt <em>Tgt</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Tgt</em>' containment reference.
   * @see #getTgt()
   * @generated
   */
  void setTgt(Node value);

  /**
   * Returns the value of the '<em><b>Attributes</b></em>' containment reference list.
   * The list contents are of type {@link com.lowcoupling.dotEditor.dot.Attribute}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Attributes</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Attributes</em>' containment reference list.
   * @see com.lowcoupling.dotEditor.dot.DotPackage#getDirectedEdge_Attributes()
   * @model containment="true"
   * @generated
   */
  EList<Attribute> getAttributes();

} // DirectedEdge
