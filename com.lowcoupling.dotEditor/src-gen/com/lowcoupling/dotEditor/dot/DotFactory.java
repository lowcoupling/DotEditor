/**
 */
package com.lowcoupling.dotEditor.dot;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see com.lowcoupling.dotEditor.dot.DotPackage
 * @generated
 */
public interface DotFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  DotFactory eINSTANCE = com.lowcoupling.dotEditor.dot.impl.DotFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Graph Model</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Graph Model</em>'.
   * @generated
   */
  GraphModel createGraphModel();

  /**
   * Returns a new object of class '<em>Graph</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Graph</em>'.
   * @generated
   */
  Graph createGraph();

  /**
   * Returns a new object of class '<em>Undirected Graph</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Undirected Graph</em>'.
   * @generated
   */
  UndirectedGraph createUndirectedGraph();

  /**
   * Returns a new object of class '<em>Directed Graph</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Directed Graph</em>'.
   * @generated
   */
  DirectedGraph createDirectedGraph();

  /**
   * Returns a new object of class '<em>Un Directed Edge</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Un Directed Edge</em>'.
   * @generated
   */
  UnDirectedEdge createUnDirectedEdge();

  /**
   * Returns a new object of class '<em>Directed Edge</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Directed Edge</em>'.
   * @generated
   */
  DirectedEdge createDirectedEdge();

  /**
   * Returns a new object of class '<em>Attribute</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Attribute</em>'.
   * @generated
   */
  Attribute createAttribute();

  /**
   * Returns a new object of class '<em>Node</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Node</em>'.
   * @generated
   */
  Node createNode();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  DotPackage getDotPackage();

} //DotFactory
