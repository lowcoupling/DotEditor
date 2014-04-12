/**
 */
package com.lowcoupling.dotEditor.dot;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Directed Graph</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.lowcoupling.dotEditor.dot.DirectedGraph#getEdge <em>Edge</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.lowcoupling.dotEditor.dot.DotPackage#getDirectedGraph()
 * @model
 * @generated
 */
public interface DirectedGraph extends Graph
{
  /**
   * Returns the value of the '<em><b>Edge</b></em>' containment reference list.
   * The list contents are of type {@link com.lowcoupling.dotEditor.dot.DirectedEdge}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Edge</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Edge</em>' containment reference list.
   * @see com.lowcoupling.dotEditor.dot.DotPackage#getDirectedGraph_Edge()
   * @model containment="true"
   * @generated
   */
  EList<DirectedEdge> getEdge();

} // DirectedGraph
