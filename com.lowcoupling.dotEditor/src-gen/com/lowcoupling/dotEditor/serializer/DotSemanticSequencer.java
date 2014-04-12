package com.lowcoupling.dotEditor.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import com.lowcoupling.dotEditor.dot.Attribute;
import com.lowcoupling.dotEditor.dot.DirectedEdge;
import com.lowcoupling.dotEditor.dot.DirectedGraph;
import com.lowcoupling.dotEditor.dot.DotPackage;
import com.lowcoupling.dotEditor.dot.GraphModel;
import com.lowcoupling.dotEditor.dot.Node;
import com.lowcoupling.dotEditor.dot.UnDirectedEdge;
import com.lowcoupling.dotEditor.dot.UndirectedGraph;
import com.lowcoupling.dotEditor.services.DotGrammarAccess;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticNodeProvider.INodesForEObjectProvider;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("all")
public class DotSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private DotGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == DotPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case DotPackage.ATTRIBUTE:
				if(context == grammarAccess.getAttributeRule()) {
					sequence_Attribute(context, (Attribute) semanticObject); 
					return; 
				}
				else break;
			case DotPackage.DIRECTED_EDGE:
				if(context == grammarAccess.getDirectedEdgeRule()) {
					sequence_DirectedEdge(context, (DirectedEdge) semanticObject); 
					return; 
				}
				else break;
			case DotPackage.DIRECTED_GRAPH:
				if(context == grammarAccess.getDirectedGraphRule() ||
				   context == grammarAccess.getGraphRule()) {
					sequence_DirectedGraph(context, (DirectedGraph) semanticObject); 
					return; 
				}
				else break;
			case DotPackage.GRAPH_MODEL:
				if(context == grammarAccess.getGraphModelRule()) {
					sequence_GraphModel(context, (GraphModel) semanticObject); 
					return; 
				}
				else break;
			case DotPackage.NODE:
				if(context == grammarAccess.getNodeRule()) {
					sequence_Node(context, (Node) semanticObject); 
					return; 
				}
				else break;
			case DotPackage.UN_DIRECTED_EDGE:
				if(context == grammarAccess.getUnDirectedEdgeRule()) {
					sequence_UnDirectedEdge(context, (UnDirectedEdge) semanticObject); 
					return; 
				}
				else break;
			case DotPackage.UNDIRECTED_GRAPH:
				if(context == grammarAccess.getGraphRule() ||
				   context == grammarAccess.getUndirectedGraphRule()) {
					sequence_UndirectedGraph(context, (UndirectedGraph) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     weight=INT
	 */
	protected void sequence_Attribute(EObject context, Attribute semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, DotPackage.Literals.ATTRIBUTE__WEIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DotPackage.Literals.ATTRIBUTE__WEIGHT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getAttributeAccess().getWeightINTTerminalRuleCall_2_0(), semanticObject.getWeight());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (src=Node tgt=Node attributes+=Attribute*)
	 */
	protected void sequence_DirectedEdge(EObject context, DirectedEdge semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID edge+=DirectedEdge*)
	 */
	protected void sequence_DirectedGraph(EObject context, DirectedGraph semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     graph+=Graph*
	 */
	protected void sequence_GraphModel(EObject context, GraphModel semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_Node(EObject context, Node semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, DotPackage.Literals.NODE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DotPackage.Literals.NODE__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getNodeAccess().getNameIDTerminalRuleCall_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (src=Node tgt=Node attributes+=Attribute*)
	 */
	protected void sequence_UnDirectedEdge(EObject context, UnDirectedEdge semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID edge+=UnDirectedEdge*)
	 */
	protected void sequence_UndirectedGraph(EObject context, UndirectedGraph semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}
