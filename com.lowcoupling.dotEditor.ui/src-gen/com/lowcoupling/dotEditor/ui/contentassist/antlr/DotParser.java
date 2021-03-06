/*
* generated by Xtext
*/
package com.lowcoupling.dotEditor.ui.contentassist.antlr;

import java.util.Collection;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;

import com.google.inject.Inject;

import com.lowcoupling.dotEditor.services.DotGrammarAccess;

public class DotParser extends AbstractContentAssistParser {
	
	@Inject
	private DotGrammarAccess grammarAccess;
	
	private Map<AbstractElement, String> nameMappings;
	
	@Override
	protected com.lowcoupling.dotEditor.ui.contentassist.antlr.internal.InternalDotParser createParser() {
		com.lowcoupling.dotEditor.ui.contentassist.antlr.internal.InternalDotParser result = new com.lowcoupling.dotEditor.ui.contentassist.antlr.internal.InternalDotParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}
	
	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getGraphAccess().getAlternatives(), "rule__Graph__Alternatives");
					put(grammarAccess.getEDGEOP_LITERALAccess().getAlternatives(), "rule__EDGEOP_LITERAL__Alternatives");
					put(grammarAccess.getUndirectedGraphAccess().getGroup(), "rule__UndirectedGraph__Group__0");
					put(grammarAccess.getUndirectedGraphAccess().getGroup_3(), "rule__UndirectedGraph__Group_3__0");
					put(grammarAccess.getDirectedGraphAccess().getGroup(), "rule__DirectedGraph__Group__0");
					put(grammarAccess.getDirectedGraphAccess().getGroup_3(), "rule__DirectedGraph__Group_3__0");
					put(grammarAccess.getUnDirectedEdgeAccess().getGroup(), "rule__UnDirectedEdge__Group__0");
					put(grammarAccess.getUnDirectedEdgeAccess().getGroup_3(), "rule__UnDirectedEdge__Group_3__0");
					put(grammarAccess.getDirectedEdgeAccess().getGroup(), "rule__DirectedEdge__Group__0");
					put(grammarAccess.getDirectedEdgeAccess().getGroup_3(), "rule__DirectedEdge__Group_3__0");
					put(grammarAccess.getAttributeAccess().getGroup(), "rule__Attribute__Group__0");
					put(grammarAccess.getEDGEOP_LITERALAccess().getGroup_0(), "rule__EDGEOP_LITERAL__Group_0__0");
					put(grammarAccess.getEDGEOP_LITERALAccess().getGroup_1(), "rule__EDGEOP_LITERAL__Group_1__0");
					put(grammarAccess.getGraphModelAccess().getGraphAssignment(), "rule__GraphModel__GraphAssignment");
					put(grammarAccess.getUndirectedGraphAccess().getNameAssignment_1(), "rule__UndirectedGraph__NameAssignment_1");
					put(grammarAccess.getUndirectedGraphAccess().getEdgeAssignment_3_0(), "rule__UndirectedGraph__EdgeAssignment_3_0");
					put(grammarAccess.getDirectedGraphAccess().getNameAssignment_1(), "rule__DirectedGraph__NameAssignment_1");
					put(grammarAccess.getDirectedGraphAccess().getEdgeAssignment_3_0(), "rule__DirectedGraph__EdgeAssignment_3_0");
					put(grammarAccess.getUnDirectedEdgeAccess().getSrcAssignment_0(), "rule__UnDirectedEdge__SrcAssignment_0");
					put(grammarAccess.getUnDirectedEdgeAccess().getTgtAssignment_2(), "rule__UnDirectedEdge__TgtAssignment_2");
					put(grammarAccess.getUnDirectedEdgeAccess().getAttributesAssignment_3_1(), "rule__UnDirectedEdge__AttributesAssignment_3_1");
					put(grammarAccess.getDirectedEdgeAccess().getSrcAssignment_0(), "rule__DirectedEdge__SrcAssignment_0");
					put(grammarAccess.getDirectedEdgeAccess().getTgtAssignment_2(), "rule__DirectedEdge__TgtAssignment_2");
					put(grammarAccess.getDirectedEdgeAccess().getAttributesAssignment_3_1(), "rule__DirectedEdge__AttributesAssignment_3_1");
					put(grammarAccess.getAttributeAccess().getWeightAssignment_2(), "rule__Attribute__WeightAssignment_2");
					put(grammarAccess.getNodeAccess().getNameAssignment(), "rule__Node__NameAssignment");
				}
			};
		}
		return nameMappings.get(element);
	}
	
	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			com.lowcoupling.dotEditor.ui.contentassist.antlr.internal.InternalDotParser typedParser = (com.lowcoupling.dotEditor.ui.contentassist.antlr.internal.InternalDotParser) parser;
			typedParser.entryRuleGraphModel();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}		
	}
	
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}
	
	public DotGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(DotGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
