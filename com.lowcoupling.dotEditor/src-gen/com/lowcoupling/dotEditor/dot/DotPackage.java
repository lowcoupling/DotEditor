/**
 */
package com.lowcoupling.dotEditor.dot;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see com.lowcoupling.dotEditor.dot.DotFactory
 * @model kind="package"
 * @generated
 */
public interface DotPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "dot";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.lowcoupling.com/dotEditor/Dot";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "dot";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  DotPackage eINSTANCE = com.lowcoupling.dotEditor.dot.impl.DotPackageImpl.init();

  /**
   * The meta object id for the '{@link com.lowcoupling.dotEditor.dot.impl.GraphModelImpl <em>Graph Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.lowcoupling.dotEditor.dot.impl.GraphModelImpl
   * @see com.lowcoupling.dotEditor.dot.impl.DotPackageImpl#getGraphModel()
   * @generated
   */
  int GRAPH_MODEL = 0;

  /**
   * The feature id for the '<em><b>Graph</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GRAPH_MODEL__GRAPH = 0;

  /**
   * The number of structural features of the '<em>Graph Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GRAPH_MODEL_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link com.lowcoupling.dotEditor.dot.impl.GraphImpl <em>Graph</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.lowcoupling.dotEditor.dot.impl.GraphImpl
   * @see com.lowcoupling.dotEditor.dot.impl.DotPackageImpl#getGraph()
   * @generated
   */
  int GRAPH = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GRAPH__NAME = 0;

  /**
   * The number of structural features of the '<em>Graph</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GRAPH_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link com.lowcoupling.dotEditor.dot.impl.UndirectedGraphImpl <em>Undirected Graph</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.lowcoupling.dotEditor.dot.impl.UndirectedGraphImpl
   * @see com.lowcoupling.dotEditor.dot.impl.DotPackageImpl#getUndirectedGraph()
   * @generated
   */
  int UNDIRECTED_GRAPH = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNDIRECTED_GRAPH__NAME = GRAPH__NAME;

  /**
   * The feature id for the '<em><b>Edge</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNDIRECTED_GRAPH__EDGE = GRAPH_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Undirected Graph</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNDIRECTED_GRAPH_FEATURE_COUNT = GRAPH_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.lowcoupling.dotEditor.dot.impl.DirectedGraphImpl <em>Directed Graph</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.lowcoupling.dotEditor.dot.impl.DirectedGraphImpl
   * @see com.lowcoupling.dotEditor.dot.impl.DotPackageImpl#getDirectedGraph()
   * @generated
   */
  int DIRECTED_GRAPH = 3;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIRECTED_GRAPH__NAME = GRAPH__NAME;

  /**
   * The feature id for the '<em><b>Edge</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIRECTED_GRAPH__EDGE = GRAPH_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Directed Graph</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIRECTED_GRAPH_FEATURE_COUNT = GRAPH_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.lowcoupling.dotEditor.dot.impl.UnDirectedEdgeImpl <em>Un Directed Edge</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.lowcoupling.dotEditor.dot.impl.UnDirectedEdgeImpl
   * @see com.lowcoupling.dotEditor.dot.impl.DotPackageImpl#getUnDirectedEdge()
   * @generated
   */
  int UN_DIRECTED_EDGE = 4;

  /**
   * The feature id for the '<em><b>Src</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UN_DIRECTED_EDGE__SRC = 0;

  /**
   * The feature id for the '<em><b>Tgt</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UN_DIRECTED_EDGE__TGT = 1;

  /**
   * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UN_DIRECTED_EDGE__ATTRIBUTES = 2;

  /**
   * The number of structural features of the '<em>Un Directed Edge</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UN_DIRECTED_EDGE_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link com.lowcoupling.dotEditor.dot.impl.DirectedEdgeImpl <em>Directed Edge</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.lowcoupling.dotEditor.dot.impl.DirectedEdgeImpl
   * @see com.lowcoupling.dotEditor.dot.impl.DotPackageImpl#getDirectedEdge()
   * @generated
   */
  int DIRECTED_EDGE = 5;

  /**
   * The feature id for the '<em><b>Src</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIRECTED_EDGE__SRC = 0;

  /**
   * The feature id for the '<em><b>Tgt</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIRECTED_EDGE__TGT = 1;

  /**
   * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIRECTED_EDGE__ATTRIBUTES = 2;

  /**
   * The number of structural features of the '<em>Directed Edge</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIRECTED_EDGE_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link com.lowcoupling.dotEditor.dot.impl.AttributeImpl <em>Attribute</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.lowcoupling.dotEditor.dot.impl.AttributeImpl
   * @see com.lowcoupling.dotEditor.dot.impl.DotPackageImpl#getAttribute()
   * @generated
   */
  int ATTRIBUTE = 6;

  /**
   * The feature id for the '<em><b>Weight</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE__WEIGHT = 0;

  /**
   * The number of structural features of the '<em>Attribute</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link com.lowcoupling.dotEditor.dot.impl.NodeImpl <em>Node</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.lowcoupling.dotEditor.dot.impl.NodeImpl
   * @see com.lowcoupling.dotEditor.dot.impl.DotPackageImpl#getNode()
   * @generated
   */
  int NODE = 7;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NODE__NAME = 0;

  /**
   * The number of structural features of the '<em>Node</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NODE_FEATURE_COUNT = 1;


  /**
   * Returns the meta object for class '{@link com.lowcoupling.dotEditor.dot.GraphModel <em>Graph Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Graph Model</em>'.
   * @see com.lowcoupling.dotEditor.dot.GraphModel
   * @generated
   */
  EClass getGraphModel();

  /**
   * Returns the meta object for the containment reference list '{@link com.lowcoupling.dotEditor.dot.GraphModel#getGraph <em>Graph</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Graph</em>'.
   * @see com.lowcoupling.dotEditor.dot.GraphModel#getGraph()
   * @see #getGraphModel()
   * @generated
   */
  EReference getGraphModel_Graph();

  /**
   * Returns the meta object for class '{@link com.lowcoupling.dotEditor.dot.Graph <em>Graph</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Graph</em>'.
   * @see com.lowcoupling.dotEditor.dot.Graph
   * @generated
   */
  EClass getGraph();

  /**
   * Returns the meta object for the attribute '{@link com.lowcoupling.dotEditor.dot.Graph#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see com.lowcoupling.dotEditor.dot.Graph#getName()
   * @see #getGraph()
   * @generated
   */
  EAttribute getGraph_Name();

  /**
   * Returns the meta object for class '{@link com.lowcoupling.dotEditor.dot.UndirectedGraph <em>Undirected Graph</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Undirected Graph</em>'.
   * @see com.lowcoupling.dotEditor.dot.UndirectedGraph
   * @generated
   */
  EClass getUndirectedGraph();

  /**
   * Returns the meta object for the containment reference list '{@link com.lowcoupling.dotEditor.dot.UndirectedGraph#getEdge <em>Edge</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Edge</em>'.
   * @see com.lowcoupling.dotEditor.dot.UndirectedGraph#getEdge()
   * @see #getUndirectedGraph()
   * @generated
   */
  EReference getUndirectedGraph_Edge();

  /**
   * Returns the meta object for class '{@link com.lowcoupling.dotEditor.dot.DirectedGraph <em>Directed Graph</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Directed Graph</em>'.
   * @see com.lowcoupling.dotEditor.dot.DirectedGraph
   * @generated
   */
  EClass getDirectedGraph();

  /**
   * Returns the meta object for the containment reference list '{@link com.lowcoupling.dotEditor.dot.DirectedGraph#getEdge <em>Edge</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Edge</em>'.
   * @see com.lowcoupling.dotEditor.dot.DirectedGraph#getEdge()
   * @see #getDirectedGraph()
   * @generated
   */
  EReference getDirectedGraph_Edge();

  /**
   * Returns the meta object for class '{@link com.lowcoupling.dotEditor.dot.UnDirectedEdge <em>Un Directed Edge</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Un Directed Edge</em>'.
   * @see com.lowcoupling.dotEditor.dot.UnDirectedEdge
   * @generated
   */
  EClass getUnDirectedEdge();

  /**
   * Returns the meta object for the containment reference '{@link com.lowcoupling.dotEditor.dot.UnDirectedEdge#getSrc <em>Src</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Src</em>'.
   * @see com.lowcoupling.dotEditor.dot.UnDirectedEdge#getSrc()
   * @see #getUnDirectedEdge()
   * @generated
   */
  EReference getUnDirectedEdge_Src();

  /**
   * Returns the meta object for the containment reference '{@link com.lowcoupling.dotEditor.dot.UnDirectedEdge#getTgt <em>Tgt</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Tgt</em>'.
   * @see com.lowcoupling.dotEditor.dot.UnDirectedEdge#getTgt()
   * @see #getUnDirectedEdge()
   * @generated
   */
  EReference getUnDirectedEdge_Tgt();

  /**
   * Returns the meta object for the containment reference list '{@link com.lowcoupling.dotEditor.dot.UnDirectedEdge#getAttributes <em>Attributes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Attributes</em>'.
   * @see com.lowcoupling.dotEditor.dot.UnDirectedEdge#getAttributes()
   * @see #getUnDirectedEdge()
   * @generated
   */
  EReference getUnDirectedEdge_Attributes();

  /**
   * Returns the meta object for class '{@link com.lowcoupling.dotEditor.dot.DirectedEdge <em>Directed Edge</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Directed Edge</em>'.
   * @see com.lowcoupling.dotEditor.dot.DirectedEdge
   * @generated
   */
  EClass getDirectedEdge();

  /**
   * Returns the meta object for the containment reference '{@link com.lowcoupling.dotEditor.dot.DirectedEdge#getSrc <em>Src</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Src</em>'.
   * @see com.lowcoupling.dotEditor.dot.DirectedEdge#getSrc()
   * @see #getDirectedEdge()
   * @generated
   */
  EReference getDirectedEdge_Src();

  /**
   * Returns the meta object for the containment reference '{@link com.lowcoupling.dotEditor.dot.DirectedEdge#getTgt <em>Tgt</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Tgt</em>'.
   * @see com.lowcoupling.dotEditor.dot.DirectedEdge#getTgt()
   * @see #getDirectedEdge()
   * @generated
   */
  EReference getDirectedEdge_Tgt();

  /**
   * Returns the meta object for the containment reference list '{@link com.lowcoupling.dotEditor.dot.DirectedEdge#getAttributes <em>Attributes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Attributes</em>'.
   * @see com.lowcoupling.dotEditor.dot.DirectedEdge#getAttributes()
   * @see #getDirectedEdge()
   * @generated
   */
  EReference getDirectedEdge_Attributes();

  /**
   * Returns the meta object for class '{@link com.lowcoupling.dotEditor.dot.Attribute <em>Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Attribute</em>'.
   * @see com.lowcoupling.dotEditor.dot.Attribute
   * @generated
   */
  EClass getAttribute();

  /**
   * Returns the meta object for the attribute '{@link com.lowcoupling.dotEditor.dot.Attribute#getWeight <em>Weight</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Weight</em>'.
   * @see com.lowcoupling.dotEditor.dot.Attribute#getWeight()
   * @see #getAttribute()
   * @generated
   */
  EAttribute getAttribute_Weight();

  /**
   * Returns the meta object for class '{@link com.lowcoupling.dotEditor.dot.Node <em>Node</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Node</em>'.
   * @see com.lowcoupling.dotEditor.dot.Node
   * @generated
   */
  EClass getNode();

  /**
   * Returns the meta object for the attribute '{@link com.lowcoupling.dotEditor.dot.Node#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see com.lowcoupling.dotEditor.dot.Node#getName()
   * @see #getNode()
   * @generated
   */
  EAttribute getNode_Name();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  DotFactory getDotFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link com.lowcoupling.dotEditor.dot.impl.GraphModelImpl <em>Graph Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.lowcoupling.dotEditor.dot.impl.GraphModelImpl
     * @see com.lowcoupling.dotEditor.dot.impl.DotPackageImpl#getGraphModel()
     * @generated
     */
    EClass GRAPH_MODEL = eINSTANCE.getGraphModel();

    /**
     * The meta object literal for the '<em><b>Graph</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference GRAPH_MODEL__GRAPH = eINSTANCE.getGraphModel_Graph();

    /**
     * The meta object literal for the '{@link com.lowcoupling.dotEditor.dot.impl.GraphImpl <em>Graph</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.lowcoupling.dotEditor.dot.impl.GraphImpl
     * @see com.lowcoupling.dotEditor.dot.impl.DotPackageImpl#getGraph()
     * @generated
     */
    EClass GRAPH = eINSTANCE.getGraph();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute GRAPH__NAME = eINSTANCE.getGraph_Name();

    /**
     * The meta object literal for the '{@link com.lowcoupling.dotEditor.dot.impl.UndirectedGraphImpl <em>Undirected Graph</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.lowcoupling.dotEditor.dot.impl.UndirectedGraphImpl
     * @see com.lowcoupling.dotEditor.dot.impl.DotPackageImpl#getUndirectedGraph()
     * @generated
     */
    EClass UNDIRECTED_GRAPH = eINSTANCE.getUndirectedGraph();

    /**
     * The meta object literal for the '<em><b>Edge</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference UNDIRECTED_GRAPH__EDGE = eINSTANCE.getUndirectedGraph_Edge();

    /**
     * The meta object literal for the '{@link com.lowcoupling.dotEditor.dot.impl.DirectedGraphImpl <em>Directed Graph</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.lowcoupling.dotEditor.dot.impl.DirectedGraphImpl
     * @see com.lowcoupling.dotEditor.dot.impl.DotPackageImpl#getDirectedGraph()
     * @generated
     */
    EClass DIRECTED_GRAPH = eINSTANCE.getDirectedGraph();

    /**
     * The meta object literal for the '<em><b>Edge</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DIRECTED_GRAPH__EDGE = eINSTANCE.getDirectedGraph_Edge();

    /**
     * The meta object literal for the '{@link com.lowcoupling.dotEditor.dot.impl.UnDirectedEdgeImpl <em>Un Directed Edge</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.lowcoupling.dotEditor.dot.impl.UnDirectedEdgeImpl
     * @see com.lowcoupling.dotEditor.dot.impl.DotPackageImpl#getUnDirectedEdge()
     * @generated
     */
    EClass UN_DIRECTED_EDGE = eINSTANCE.getUnDirectedEdge();

    /**
     * The meta object literal for the '<em><b>Src</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference UN_DIRECTED_EDGE__SRC = eINSTANCE.getUnDirectedEdge_Src();

    /**
     * The meta object literal for the '<em><b>Tgt</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference UN_DIRECTED_EDGE__TGT = eINSTANCE.getUnDirectedEdge_Tgt();

    /**
     * The meta object literal for the '<em><b>Attributes</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference UN_DIRECTED_EDGE__ATTRIBUTES = eINSTANCE.getUnDirectedEdge_Attributes();

    /**
     * The meta object literal for the '{@link com.lowcoupling.dotEditor.dot.impl.DirectedEdgeImpl <em>Directed Edge</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.lowcoupling.dotEditor.dot.impl.DirectedEdgeImpl
     * @see com.lowcoupling.dotEditor.dot.impl.DotPackageImpl#getDirectedEdge()
     * @generated
     */
    EClass DIRECTED_EDGE = eINSTANCE.getDirectedEdge();

    /**
     * The meta object literal for the '<em><b>Src</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DIRECTED_EDGE__SRC = eINSTANCE.getDirectedEdge_Src();

    /**
     * The meta object literal for the '<em><b>Tgt</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DIRECTED_EDGE__TGT = eINSTANCE.getDirectedEdge_Tgt();

    /**
     * The meta object literal for the '<em><b>Attributes</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DIRECTED_EDGE__ATTRIBUTES = eINSTANCE.getDirectedEdge_Attributes();

    /**
     * The meta object literal for the '{@link com.lowcoupling.dotEditor.dot.impl.AttributeImpl <em>Attribute</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.lowcoupling.dotEditor.dot.impl.AttributeImpl
     * @see com.lowcoupling.dotEditor.dot.impl.DotPackageImpl#getAttribute()
     * @generated
     */
    EClass ATTRIBUTE = eINSTANCE.getAttribute();

    /**
     * The meta object literal for the '<em><b>Weight</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ATTRIBUTE__WEIGHT = eINSTANCE.getAttribute_Weight();

    /**
     * The meta object literal for the '{@link com.lowcoupling.dotEditor.dot.impl.NodeImpl <em>Node</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.lowcoupling.dotEditor.dot.impl.NodeImpl
     * @see com.lowcoupling.dotEditor.dot.impl.DotPackageImpl#getNode()
     * @generated
     */
    EClass NODE = eINSTANCE.getNode();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NODE__NAME = eINSTANCE.getNode_Name();

  }

} //DotPackage
