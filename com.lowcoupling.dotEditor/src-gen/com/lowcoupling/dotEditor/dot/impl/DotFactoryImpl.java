/**
 */
package com.lowcoupling.dotEditor.dot.impl;

import com.lowcoupling.dotEditor.dot.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DotFactoryImpl extends EFactoryImpl implements DotFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static DotFactory init()
  {
    try
    {
      DotFactory theDotFactory = (DotFactory)EPackage.Registry.INSTANCE.getEFactory(DotPackage.eNS_URI);
      if (theDotFactory != null)
      {
        return theDotFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new DotFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DotFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case DotPackage.GRAPH_MODEL: return createGraphModel();
      case DotPackage.GRAPH: return createGraph();
      case DotPackage.UNDIRECTED_GRAPH: return createUndirectedGraph();
      case DotPackage.DIRECTED_GRAPH: return createDirectedGraph();
      case DotPackage.UN_DIRECTED_EDGE: return createUnDirectedEdge();
      case DotPackage.DIRECTED_EDGE: return createDirectedEdge();
      case DotPackage.ATTRIBUTE: return createAttribute();
      case DotPackage.NODE: return createNode();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GraphModel createGraphModel()
  {
    GraphModelImpl graphModel = new GraphModelImpl();
    return graphModel;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Graph createGraph()
  {
    GraphImpl graph = new GraphImpl();
    return graph;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UndirectedGraph createUndirectedGraph()
  {
    UndirectedGraphImpl undirectedGraph = new UndirectedGraphImpl();
    return undirectedGraph;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DirectedGraph createDirectedGraph()
  {
    DirectedGraphImpl directedGraph = new DirectedGraphImpl();
    return directedGraph;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UnDirectedEdge createUnDirectedEdge()
  {
    UnDirectedEdgeImpl unDirectedEdge = new UnDirectedEdgeImpl();
    return unDirectedEdge;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DirectedEdge createDirectedEdge()
  {
    DirectedEdgeImpl directedEdge = new DirectedEdgeImpl();
    return directedEdge;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Attribute createAttribute()
  {
    AttributeImpl attribute = new AttributeImpl();
    return attribute;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Node createNode()
  {
    NodeImpl node = new NodeImpl();
    return node;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DotPackage getDotPackage()
  {
    return (DotPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static DotPackage getPackage()
  {
    return DotPackage.eINSTANCE;
  }

} //DotFactoryImpl
