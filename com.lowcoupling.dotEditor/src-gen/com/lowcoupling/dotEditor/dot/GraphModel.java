/**
 */
package com.lowcoupling.dotEditor.dot;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Graph Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.lowcoupling.dotEditor.dot.GraphModel#getGraph <em>Graph</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.lowcoupling.dotEditor.dot.DotPackage#getGraphModel()
 * @model
 * @generated
 */
public interface GraphModel extends EObject
{
  /**
   * Returns the value of the '<em><b>Graph</b></em>' containment reference list.
   * The list contents are of type {@link com.lowcoupling.dotEditor.dot.Graph}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Graph</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Graph</em>' containment reference list.
   * @see com.lowcoupling.dotEditor.dot.DotPackage#getGraphModel_Graph()
   * @model containment="true"
   * @generated
   */
  EList<Graph> getGraph();

} // GraphModel
