package com.lowcoupling.dotEditor.serializer;

import com.google.inject.Inject;
import com.lowcoupling.dotEditor.services.DotGrammarAccess;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.GroupAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;

@SuppressWarnings("all")
public class DotSyntacticSequencer extends AbstractSyntacticSequencer {

	protected DotGrammarAccess grammarAccess;
	protected AbstractElementAlias match_UnDirectedEdge___LeftSquareBracketKeyword_3_0_RightSquareBracketKeyword_3_2__q;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (DotGrammarAccess) access;
		match_UnDirectedEdge___LeftSquareBracketKeyword_3_0_RightSquareBracketKeyword_3_2__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getUnDirectedEdgeAccess().getLeftSquareBracketKeyword_3_0()), new TokenAlias(false, false, grammarAccess.getUnDirectedEdgeAccess().getRightSquareBracketKeyword_3_2()));
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		return "";
	}
	
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if(match_UnDirectedEdge___LeftSquareBracketKeyword_3_0_RightSquareBracketKeyword_3_2__q.equals(syntax))
				emit_UnDirectedEdge___LeftSquareBracketKeyword_3_0_RightSquareBracketKeyword_3_2__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Syntax:
	 *     ('[' ']')?
	 */
	protected void emit_UnDirectedEdge___LeftSquareBracketKeyword_3_0_RightSquareBracketKeyword_3_2__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
