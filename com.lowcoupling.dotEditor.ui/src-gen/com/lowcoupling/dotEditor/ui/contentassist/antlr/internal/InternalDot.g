/*
* generated by Xtext
*/
grammar InternalDot;

options {
	superClass=AbstractInternalContentAssistParser;
	backtrack=true;
	
}

@lexer::header {
package com.lowcoupling.dotEditor.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;
}

@parser::header {
package com.lowcoupling.dotEditor.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import com.lowcoupling.dotEditor.services.DotGrammarAccess;

}

@parser::members {
 
 	private DotGrammarAccess grammarAccess;
 	
    public void setGrammarAccess(DotGrammarAccess grammarAccess) {
    	this.grammarAccess = grammarAccess;
    }
    
    @Override
    protected Grammar getGrammar() {
    	return grammarAccess.getGrammar();
    }
    
    @Override
    protected String getValueForTokenName(String tokenName) {
    	return tokenName;
    }

}




// Entry rule entryRuleGraphModel
entryRuleGraphModel 
:
{ before(grammarAccess.getGraphModelRule()); }
	 ruleGraphModel
{ after(grammarAccess.getGraphModelRule()); } 
	 EOF 
;

// Rule GraphModel
ruleGraphModel
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getGraphModelAccess().getGraphAssignment()); }
(rule__GraphModel__GraphAssignment)*
{ after(grammarAccess.getGraphModelAccess().getGraphAssignment()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleGraph
entryRuleGraph 
:
{ before(grammarAccess.getGraphRule()); }
	 ruleGraph
{ after(grammarAccess.getGraphRule()); } 
	 EOF 
;

// Rule Graph
ruleGraph
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getGraphAccess().getAlternatives()); }
(rule__Graph__Alternatives)
{ after(grammarAccess.getGraphAccess().getAlternatives()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleUndirectedGraph
entryRuleUndirectedGraph 
:
{ before(grammarAccess.getUndirectedGraphRule()); }
	 ruleUndirectedGraph
{ after(grammarAccess.getUndirectedGraphRule()); } 
	 EOF 
;

// Rule UndirectedGraph
ruleUndirectedGraph
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getUndirectedGraphAccess().getGroup()); }
(rule__UndirectedGraph__Group__0)
{ after(grammarAccess.getUndirectedGraphAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleDirectedGraph
entryRuleDirectedGraph 
:
{ before(grammarAccess.getDirectedGraphRule()); }
	 ruleDirectedGraph
{ after(grammarAccess.getDirectedGraphRule()); } 
	 EOF 
;

// Rule DirectedGraph
ruleDirectedGraph
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getDirectedGraphAccess().getGroup()); }
(rule__DirectedGraph__Group__0)
{ after(grammarAccess.getDirectedGraphAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleUnDirectedEdge
entryRuleUnDirectedEdge 
:
{ before(grammarAccess.getUnDirectedEdgeRule()); }
	 ruleUnDirectedEdge
{ after(grammarAccess.getUnDirectedEdgeRule()); } 
	 EOF 
;

// Rule UnDirectedEdge
ruleUnDirectedEdge
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getUnDirectedEdgeAccess().getGroup()); }
(rule__UnDirectedEdge__Group__0)
{ after(grammarAccess.getUnDirectedEdgeAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleDirectedEdge
entryRuleDirectedEdge 
:
{ before(grammarAccess.getDirectedEdgeRule()); }
	 ruleDirectedEdge
{ after(grammarAccess.getDirectedEdgeRule()); } 
	 EOF 
;

// Rule DirectedEdge
ruleDirectedEdge
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getDirectedEdgeAccess().getGroup()); }
(rule__DirectedEdge__Group__0)
{ after(grammarAccess.getDirectedEdgeAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleAttribute
entryRuleAttribute 
:
{ before(grammarAccess.getAttributeRule()); }
	 ruleAttribute
{ after(grammarAccess.getAttributeRule()); } 
	 EOF 
;

// Rule Attribute
ruleAttribute
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getAttributeAccess().getGroup()); }
(rule__Attribute__Group__0)
{ after(grammarAccess.getAttributeAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleNode
entryRuleNode 
:
{ before(grammarAccess.getNodeRule()); }
	 ruleNode
{ after(grammarAccess.getNodeRule()); } 
	 EOF 
;

// Rule Node
ruleNode
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getNodeAccess().getNameAssignment()); }
(rule__Node__NameAssignment)
{ after(grammarAccess.getNodeAccess().getNameAssignment()); }
)

;
finally {
	restoreStackSize(stackSize);
}








rule__Graph__Alternatives
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getGraphAccess().getUndirectedGraphParserRuleCall_0()); }
	ruleUndirectedGraph
{ after(grammarAccess.getGraphAccess().getUndirectedGraphParserRuleCall_0()); }
)

    |(
{ before(grammarAccess.getGraphAccess().getDirectedGraphParserRuleCall_1()); }
	ruleDirectedGraph
{ after(grammarAccess.getGraphAccess().getDirectedGraphParserRuleCall_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}




rule__UndirectedGraph__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__UndirectedGraph__Group__0__Impl
	rule__UndirectedGraph__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__UndirectedGraph__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getUndirectedGraphAccess().getGraphKeyword_0()); }

	'graph' 

{ after(grammarAccess.getUndirectedGraphAccess().getGraphKeyword_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__UndirectedGraph__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__UndirectedGraph__Group__1__Impl
	rule__UndirectedGraph__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__UndirectedGraph__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getUndirectedGraphAccess().getNameAssignment_1()); }
(rule__UndirectedGraph__NameAssignment_1)
{ after(grammarAccess.getUndirectedGraphAccess().getNameAssignment_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__UndirectedGraph__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__UndirectedGraph__Group__2__Impl
	rule__UndirectedGraph__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__UndirectedGraph__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getUndirectedGraphAccess().getLeftCurlyBracketKeyword_2()); }

	'{' 

{ after(grammarAccess.getUndirectedGraphAccess().getLeftCurlyBracketKeyword_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__UndirectedGraph__Group__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__UndirectedGraph__Group__3__Impl
	rule__UndirectedGraph__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__UndirectedGraph__Group__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getUndirectedGraphAccess().getGroup_3()); }
(rule__UndirectedGraph__Group_3__0)*
{ after(grammarAccess.getUndirectedGraphAccess().getGroup_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__UndirectedGraph__Group__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__UndirectedGraph__Group__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__UndirectedGraph__Group__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getUndirectedGraphAccess().getRightCurlyBracketKeyword_4()); }

	'}' 

{ after(grammarAccess.getUndirectedGraphAccess().getRightCurlyBracketKeyword_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}












rule__UndirectedGraph__Group_3__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__UndirectedGraph__Group_3__0__Impl
	rule__UndirectedGraph__Group_3__1
;
finally {
	restoreStackSize(stackSize);
}

rule__UndirectedGraph__Group_3__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getUndirectedGraphAccess().getEdgeAssignment_3_0()); }
(rule__UndirectedGraph__EdgeAssignment_3_0)
{ after(grammarAccess.getUndirectedGraphAccess().getEdgeAssignment_3_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__UndirectedGraph__Group_3__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__UndirectedGraph__Group_3__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__UndirectedGraph__Group_3__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getUndirectedGraphAccess().getSemicolonKeyword_3_1()); }

	';' 

{ after(grammarAccess.getUndirectedGraphAccess().getSemicolonKeyword_3_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__DirectedGraph__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__DirectedGraph__Group__0__Impl
	rule__DirectedGraph__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__DirectedGraph__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getDirectedGraphAccess().getDigraphKeyword_0()); }

	'digraph' 

{ after(grammarAccess.getDirectedGraphAccess().getDigraphKeyword_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__DirectedGraph__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__DirectedGraph__Group__1__Impl
	rule__DirectedGraph__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__DirectedGraph__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getDirectedGraphAccess().getNameAssignment_1()); }
(rule__DirectedGraph__NameAssignment_1)
{ after(grammarAccess.getDirectedGraphAccess().getNameAssignment_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__DirectedGraph__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__DirectedGraph__Group__2__Impl
	rule__DirectedGraph__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__DirectedGraph__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getDirectedGraphAccess().getLeftCurlyBracketKeyword_2()); }

	'{' 

{ after(grammarAccess.getDirectedGraphAccess().getLeftCurlyBracketKeyword_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__DirectedGraph__Group__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__DirectedGraph__Group__3__Impl
	rule__DirectedGraph__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__DirectedGraph__Group__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getDirectedGraphAccess().getGroup_3()); }
(rule__DirectedGraph__Group_3__0)*
{ after(grammarAccess.getDirectedGraphAccess().getGroup_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__DirectedGraph__Group__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__DirectedGraph__Group__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__DirectedGraph__Group__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getDirectedGraphAccess().getRightCurlyBracketKeyword_4()); }

	'}' 

{ after(grammarAccess.getDirectedGraphAccess().getRightCurlyBracketKeyword_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}












rule__DirectedGraph__Group_3__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__DirectedGraph__Group_3__0__Impl
	rule__DirectedGraph__Group_3__1
;
finally {
	restoreStackSize(stackSize);
}

rule__DirectedGraph__Group_3__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getDirectedGraphAccess().getEdgeAssignment_3_0()); }
(rule__DirectedGraph__EdgeAssignment_3_0)
{ after(grammarAccess.getDirectedGraphAccess().getEdgeAssignment_3_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__DirectedGraph__Group_3__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__DirectedGraph__Group_3__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__DirectedGraph__Group_3__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getDirectedGraphAccess().getSemicolonKeyword_3_1()); }

	';' 

{ after(grammarAccess.getDirectedGraphAccess().getSemicolonKeyword_3_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__UnDirectedEdge__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__UnDirectedEdge__Group__0__Impl
	rule__UnDirectedEdge__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__UnDirectedEdge__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getUnDirectedEdgeAccess().getSrcAssignment_0()); }
(rule__UnDirectedEdge__SrcAssignment_0)
{ after(grammarAccess.getUnDirectedEdgeAccess().getSrcAssignment_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__UnDirectedEdge__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__UnDirectedEdge__Group__1__Impl
	rule__UnDirectedEdge__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__UnDirectedEdge__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getUnDirectedEdgeAccess().getHyphenMinusHyphenMinusKeyword_1()); }

	'--' 

{ after(grammarAccess.getUnDirectedEdgeAccess().getHyphenMinusHyphenMinusKeyword_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__UnDirectedEdge__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__UnDirectedEdge__Group__2__Impl
	rule__UnDirectedEdge__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__UnDirectedEdge__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getUnDirectedEdgeAccess().getTgtAssignment_2()); }
(rule__UnDirectedEdge__TgtAssignment_2)
{ after(grammarAccess.getUnDirectedEdgeAccess().getTgtAssignment_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__UnDirectedEdge__Group__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__UnDirectedEdge__Group__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__UnDirectedEdge__Group__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getUnDirectedEdgeAccess().getGroup_3()); }
(rule__UnDirectedEdge__Group_3__0)?
{ after(grammarAccess.getUnDirectedEdgeAccess().getGroup_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}










rule__UnDirectedEdge__Group_3__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__UnDirectedEdge__Group_3__0__Impl
	rule__UnDirectedEdge__Group_3__1
;
finally {
	restoreStackSize(stackSize);
}

rule__UnDirectedEdge__Group_3__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getUnDirectedEdgeAccess().getLeftSquareBracketKeyword_3_0()); }

	'[' 

{ after(grammarAccess.getUnDirectedEdgeAccess().getLeftSquareBracketKeyword_3_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__UnDirectedEdge__Group_3__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__UnDirectedEdge__Group_3__1__Impl
	rule__UnDirectedEdge__Group_3__2
;
finally {
	restoreStackSize(stackSize);
}

rule__UnDirectedEdge__Group_3__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getUnDirectedEdgeAccess().getAttributesAssignment_3_1()); }
(rule__UnDirectedEdge__AttributesAssignment_3_1)*
{ after(grammarAccess.getUnDirectedEdgeAccess().getAttributesAssignment_3_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__UnDirectedEdge__Group_3__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__UnDirectedEdge__Group_3__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__UnDirectedEdge__Group_3__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getUnDirectedEdgeAccess().getRightSquareBracketKeyword_3_2()); }

	']' 

{ after(grammarAccess.getUnDirectedEdgeAccess().getRightSquareBracketKeyword_3_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}








rule__DirectedEdge__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__DirectedEdge__Group__0__Impl
	rule__DirectedEdge__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__DirectedEdge__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getDirectedEdgeAccess().getSrcAssignment_0()); }
(rule__DirectedEdge__SrcAssignment_0)
{ after(grammarAccess.getDirectedEdgeAccess().getSrcAssignment_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__DirectedEdge__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__DirectedEdge__Group__1__Impl
	rule__DirectedEdge__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__DirectedEdge__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getDirectedEdgeAccess().getHyphenMinusGreaterThanSignKeyword_1()); }

	'->' 

{ after(grammarAccess.getDirectedEdgeAccess().getHyphenMinusGreaterThanSignKeyword_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__DirectedEdge__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__DirectedEdge__Group__2__Impl
	rule__DirectedEdge__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__DirectedEdge__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getDirectedEdgeAccess().getTgtAssignment_2()); }
(rule__DirectedEdge__TgtAssignment_2)
{ after(grammarAccess.getDirectedEdgeAccess().getTgtAssignment_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__DirectedEdge__Group__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__DirectedEdge__Group__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__DirectedEdge__Group__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getDirectedEdgeAccess().getGroup_3()); }
(rule__DirectedEdge__Group_3__0)?
{ after(grammarAccess.getDirectedEdgeAccess().getGroup_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}










rule__DirectedEdge__Group_3__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__DirectedEdge__Group_3__0__Impl
	rule__DirectedEdge__Group_3__1
;
finally {
	restoreStackSize(stackSize);
}

rule__DirectedEdge__Group_3__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getDirectedEdgeAccess().getLeftSquareBracketKeyword_3_0()); }

	'[' 

{ after(grammarAccess.getDirectedEdgeAccess().getLeftSquareBracketKeyword_3_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__DirectedEdge__Group_3__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__DirectedEdge__Group_3__1__Impl
	rule__DirectedEdge__Group_3__2
;
finally {
	restoreStackSize(stackSize);
}

rule__DirectedEdge__Group_3__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
(
{ before(grammarAccess.getDirectedEdgeAccess().getAttributesAssignment_3_1()); }
(rule__DirectedEdge__AttributesAssignment_3_1)
{ after(grammarAccess.getDirectedEdgeAccess().getAttributesAssignment_3_1()); }
)
(
{ before(grammarAccess.getDirectedEdgeAccess().getAttributesAssignment_3_1()); }
(rule__DirectedEdge__AttributesAssignment_3_1)*
{ after(grammarAccess.getDirectedEdgeAccess().getAttributesAssignment_3_1()); }
)
)

;
finally {
	restoreStackSize(stackSize);
}


rule__DirectedEdge__Group_3__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__DirectedEdge__Group_3__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__DirectedEdge__Group_3__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getDirectedEdgeAccess().getRightSquareBracketKeyword_3_2()); }

	']' 

{ after(grammarAccess.getDirectedEdgeAccess().getRightSquareBracketKeyword_3_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}








rule__Attribute__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Attribute__Group__0__Impl
	rule__Attribute__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Attribute__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getAttributeAccess().getWeightKeyword_0()); }

	'weight' 

{ after(grammarAccess.getAttributeAccess().getWeightKeyword_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Attribute__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Attribute__Group__1__Impl
	rule__Attribute__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Attribute__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getAttributeAccess().getEqualsSignKeyword_1()); }

	'=' 

{ after(grammarAccess.getAttributeAccess().getEqualsSignKeyword_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Attribute__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Attribute__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Attribute__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getAttributeAccess().getWeightAssignment_2()); }
(rule__Attribute__WeightAssignment_2)
{ after(grammarAccess.getAttributeAccess().getWeightAssignment_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}











rule__GraphModel__GraphAssignment
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getGraphModelAccess().getGraphGraphParserRuleCall_0()); }
	ruleGraph{ after(grammarAccess.getGraphModelAccess().getGraphGraphParserRuleCall_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__UndirectedGraph__NameAssignment_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getUndirectedGraphAccess().getNameIDTerminalRuleCall_1_0()); }
	RULE_ID{ after(grammarAccess.getUndirectedGraphAccess().getNameIDTerminalRuleCall_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__UndirectedGraph__EdgeAssignment_3_0
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getUndirectedGraphAccess().getEdgeUnDirectedEdgeParserRuleCall_3_0_0()); }
	ruleUnDirectedEdge{ after(grammarAccess.getUndirectedGraphAccess().getEdgeUnDirectedEdgeParserRuleCall_3_0_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__DirectedGraph__NameAssignment_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getDirectedGraphAccess().getNameIDTerminalRuleCall_1_0()); }
	RULE_ID{ after(grammarAccess.getDirectedGraphAccess().getNameIDTerminalRuleCall_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__DirectedGraph__EdgeAssignment_3_0
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getDirectedGraphAccess().getEdgeDirectedEdgeParserRuleCall_3_0_0()); }
	ruleDirectedEdge{ after(grammarAccess.getDirectedGraphAccess().getEdgeDirectedEdgeParserRuleCall_3_0_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__UnDirectedEdge__SrcAssignment_0
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getUnDirectedEdgeAccess().getSrcNodeParserRuleCall_0_0()); }
	ruleNode{ after(grammarAccess.getUnDirectedEdgeAccess().getSrcNodeParserRuleCall_0_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__UnDirectedEdge__TgtAssignment_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getUnDirectedEdgeAccess().getTgtNodeParserRuleCall_2_0()); }
	ruleNode{ after(grammarAccess.getUnDirectedEdgeAccess().getTgtNodeParserRuleCall_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__UnDirectedEdge__AttributesAssignment_3_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getUnDirectedEdgeAccess().getAttributesAttributeParserRuleCall_3_1_0()); }
	ruleAttribute{ after(grammarAccess.getUnDirectedEdgeAccess().getAttributesAttributeParserRuleCall_3_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__DirectedEdge__SrcAssignment_0
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getDirectedEdgeAccess().getSrcNodeParserRuleCall_0_0()); }
	ruleNode{ after(grammarAccess.getDirectedEdgeAccess().getSrcNodeParserRuleCall_0_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__DirectedEdge__TgtAssignment_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getDirectedEdgeAccess().getTgtNodeParserRuleCall_2_0()); }
	ruleNode{ after(grammarAccess.getDirectedEdgeAccess().getTgtNodeParserRuleCall_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__DirectedEdge__AttributesAssignment_3_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getDirectedEdgeAccess().getAttributesAttributeParserRuleCall_3_1_0()); }
	ruleAttribute{ after(grammarAccess.getDirectedEdgeAccess().getAttributesAttributeParserRuleCall_3_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Attribute__WeightAssignment_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getAttributeAccess().getWeightINTTerminalRuleCall_2_0()); }
	RULE_INT{ after(grammarAccess.getAttributeAccess().getWeightINTTerminalRuleCall_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Node__NameAssignment
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getNodeAccess().getNameIDTerminalRuleCall_0()); }
	RULE_ID{ after(grammarAccess.getNodeAccess().getNameIDTerminalRuleCall_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;


