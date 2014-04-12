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



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalDotParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'graph'", "'{'", "'}'", "';'", "'digraph'", "'--'", "'['", "']'", "'->'", "'weight'", "'='"
    };
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=5;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalDotParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalDotParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalDotParser.tokenNames; }
    public String getGrammarFileName() { return "../com.lowcoupling.dotEditor.ui/src-gen/com/lowcoupling/dotEditor/ui/contentassist/antlr/internal/InternalDot.g"; }


     
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




    // $ANTLR start "entryRuleGraphModel"
    // ../com.lowcoupling.dotEditor.ui/src-gen/com/lowcoupling/dotEditor/ui/contentassist/antlr/internal/InternalDot.g:61:1: entryRuleGraphModel : ruleGraphModel EOF ;
    public final void entryRuleGraphModel() throws RecognitionException {
        try {
            // ../com.lowcoupling.dotEditor.ui/src-gen/com/lowcoupling/dotEditor/ui/contentassist/antlr/internal/InternalDot.g:62:1: ( ruleGraphModel EOF )
            // ../com.lowcoupling.dotEditor.ui/src-gen/com/lowcoupling/dotEditor/ui/contentassist/antlr/internal/InternalDot.g:63:1: ruleGraphModel EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGraphModelRule()); 
            }
            pushFollow(FOLLOW_ruleGraphModel_in_entryRuleGraphModel67);
            ruleGraphModel();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGraphModelRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleGraphModel74); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleGraphModel"


    // $ANTLR start "ruleGraphModel"
    // ../com.lowcoupling.dotEditor.ui/src-gen/com/lowcoupling/dotEditor/ui/contentassist/antlr/internal/InternalDot.g:70:1: ruleGraphModel : ( ( rule__GraphModel__GraphAssignment )* ) ;
    public final void ruleGraphModel() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.dotEditor.ui/src-gen/com/lowcoupling/dotEditor/ui/contentassist/antlr/internal/InternalDot.g:74:2: ( ( ( rule__GraphModel__GraphAssignment )* ) )
            // ../com.lowcoupling.dotEditor.ui/src-gen/com/lowcoupling/dotEditor/ui/contentassist/antlr/internal/InternalDot.g:75:1: ( ( rule__GraphModel__GraphAssignment )* )
            {
            // ../com.lowcoupling.dotEditor.ui/src-gen/com/lowcoupling/dotEditor/ui/contentassist/antlr/internal/InternalDot.g:75:1: ( ( rule__GraphModel__GraphAssignment )* )
            // ../com.lowcoupling.dotEditor.ui/src-gen/com/lowcoupling/dotEditor/ui/contentassist/antlr/internal/InternalDot.g:76:1: ( rule__GraphModel__GraphAssignment )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGraphModelAccess().getGraphAssignment()); 
            }
            // ../com.lowcoupling.dotEditor.ui/src-gen/com/lowcoupling/dotEditor/ui/contentassist/antlr/internal/InternalDot.g:77:1: ( rule__GraphModel__GraphAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11||LA1_0==15) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../com.lowcoupling.dotEditor.ui/src-gen/com/lowcoupling/dotEditor/ui/contentassist/antlr/internal/InternalDot.g:77:2: rule__GraphModel__GraphAssignment
            	    {
            	    pushFollow(FOLLOW_rule__GraphModel__GraphAssignment_in_ruleGraphModel100);
            	    rule__GraphModel__GraphAssignment();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGraphModelAccess().getGraphAssignment()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGraphModel"


    // $ANTLR start "entryRuleGraph"
    // ../com.lowcoupling.dotEditor.ui/src-gen/com/lowcoupling/dotEditor/ui/contentassist/antlr/internal/InternalDot.g:89:1: entryRuleGraph : ruleGraph EOF ;
    public final void entryRuleGraph() throws RecognitionException {
        try {
            // ../com.lowcoupling.dotEditor.ui/src-gen/com/lowcoupling/dotEditor/ui/contentassist/antlr/internal/InternalDot.g:90:1: ( ruleGraph EOF )
            // ../com.lowcoupling.dotEditor.ui/src-gen/com/lowcoupling/dotEditor/ui/contentassist/antlr/internal/InternalDot.g:91:1: ruleGraph EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGraphRule()); 
            }
            pushFollow(FOLLOW_ruleGraph_in_entryRuleGraph128);
            ruleGraph();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGraphRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleGraph135); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleGraph"


    // $ANTLR start "ruleGraph"
    // ../com.lowcoupling.dotEditor.ui/src-gen/com/lowcoupling/dotEditor/ui/contentassist/antlr/internal/InternalDot.g:98:1: ruleGraph : ( ( rule__Graph__Alternatives ) ) ;
    public final void ruleGraph() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.dotEditor.ui/src-gen/com/lowcoupling/dotEditor/ui/contentassist/antlr/internal/InternalDot.g:102:2: ( ( ( rule__Graph__Alternatives ) ) )
            // ../com.lowcoupling.dotEditor.ui/src-gen/com/lowcoupling/dotEditor/ui/contentassist/antlr/internal/InternalDot.g:103:1: ( ( rule__Graph__Alternatives ) )
            {
            // ../com.lowcoupling.dotEditor.ui/src-gen/com/lowcoupling/dotEditor/ui/contentassist/antlr/internal/InternalDot.g:103:1: ( ( rule__Graph__Alternatives ) )
            // ../com.lowcoupling.dotEditor.ui/src-gen/com/lowcoupling/dotEditor/ui/contentassist/antlr/internal/InternalDot.g:104:1: ( rule__Graph__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGraphAccess().getAlternatives()); 
            }
            // ../com.lowcoupling.dotEditor.ui/src-gen/com/lowcoupling/dotEditor/ui/contentassist/antlr/internal/InternalDot.g:105:1: ( rule__Graph__Alternatives )
            // ../com.lowcoupling.dotEditor.ui/src-gen/com/lowcoupling/dotEditor/ui/contentassist/antlr/internal/InternalDot.g:105:2: rule__Graph__Alternatives
            {
            pushFollow(FOLLOW_rule__Graph__Alternatives_in_ruleGraph161);
            rule__Graph__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGraphAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGraph"


    // $ANTLR start "entryRuleUndirectedGraph"
    // ../com.lowcoupling.dotEditor.ui/src-gen/com/lowcoupling/dotEditor/ui/contentassist/antlr/internal/InternalDot.g:117:1: entryRuleUndirectedGraph : ruleUndirectedGraph EOF ;
    public final void entryRuleUndirectedGraph() throws RecognitionException {
        try {
            // ../com.lowcoupling.dotEditor.ui/src-gen/com/lowcoupling/dotEditor/ui/contentassist/antlr/internal/InternalDot.g:118:1: ( ruleUndirectedGraph EOF )
            // ../com.lowcoupling.dotEditor.ui/src-gen/com/lowcoupling/dotEditor/ui/contentassist/antlr/internal/InternalDot.g:119:1: ruleUndirectedGraph EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUndirectedGraphRule()); 
            }
            pushFollow(FOLLOW_ruleUndirectedGraph_in_entryRuleUndirectedGraph188);
            ruleUndirectedGraph();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getUndirectedGraphRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleUndirectedGraph195); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleUndirectedGraph"


    // $ANTLR start "ruleUndirectedGraph"
    // ../com.lowcoupling.dotEditor.ui/src-gen/com/lowcoupling/dotEditor/ui/contentassist/antlr/internal/InternalDot.g:126:1: ruleUndirectedGraph : ( ( rule__UndirectedGraph__Group__0 ) ) ;
    public final void ruleUndirectedGraph() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.dotEditor.ui/src-gen/com/lowcoupling/dotEditor/ui/contentassist/antlr/internal/InternalDot.g:130:2: ( ( ( rule__UndirectedGraph__Group__0 ) ) )
            // ../com.lowcoupling.dotEditor.ui/src-gen/com/lowcoupling/dotEditor/ui/contentassist/antlr/internal/InternalDot.g:131:1: ( ( rule__UndirectedGraph__Group__0 ) )
            {
            // ../com.lowcoupling.dotEditor.ui/src-gen/com/lowcoupling/dotEditor/ui/contentassist/antlr/internal/InternalDot.g:131:1: ( ( rule__UndirectedGraph__Group__0 ) )
            // ../com.lowcoupling.dotEditor.ui/src-gen/com/lowcoupling/dotEditor/ui/contentassist/antlr/internal/InternalDot.g:132:1: ( rule__UndirectedGraph__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUndirectedGraphAccess().getGroup()); 
            }
            // ../com.lowcoupling.dotEditor.ui/src-gen/com/lowcoupling/dotEditor/ui/contentassist/antlr/internal/InternalDot.g:133:1: ( rule__UndirectedGraph__Group__0 )
            // ../com.lowcoupling.dotEditor.ui/src-gen/com/lowcoupling/dotEditor/ui/contentassist/antlr/internal/InternalDot.g:133:2: rule__UndirectedGraph__Group__0
            {
            pushFollow(FOLLOW_rule__UndirectedGraph__Group__0_in_ruleUndirectedGraph221);
            rule__UndirectedGraph__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getUndirectedGraphAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleUndirectedGraph"


    // $ANTLR start "entryRuleDirectedGraph"
    // ../com.lowcoupling.dotEditor.ui/src-gen/com/lowcoupling/dotEditor/ui/contentassist/antlr/internal/InternalDot.g:145:1: entryRuleDirectedGraph : ruleDirectedGraph EOF ;
    public final void entryRuleDirectedGraph() throws RecognitionException {
        try {
            // ../com.lowcoupling.dotEditor.ui/src-gen/com/lowcoupling/dotEditor/ui/contentassist/antlr/internal/InternalDot.g:146:1: ( ruleDirectedGraph EOF )
            // ../com.lowcoupling.dotEditor.ui/src-gen/com/lowcoupling/dotEditor/ui/contentassist/antlr/internal/InternalDot.g:147:1: ruleDirectedGraph EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDirectedGraphRule()); 
            }
            pushFollow(FOLLOW_ruleDirectedGraph_in_entryRuleDirectedGraph248);
            ruleDirectedGraph();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDirectedGraphRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDirectedGraph255); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDirectedGraph"


    // $ANTLR start "ruleDirectedGraph"
    // ../com.lowcoupling.dotEditor.ui/src-gen/com/lowcoupling/dotEditor/ui/contentassist/antlr/internal/InternalDot.g:154:1: ruleDirectedGraph : ( ( rule__DirectedGraph__Group__0 ) ) ;
    public final void ruleDirectedGraph() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.dotEditor.ui/src-gen/com/lowcoupling/dotEditor/ui/contentassist/antlr/internal/InternalDot.g:158:2: ( ( ( rule__DirectedGraph__Group__0 ) ) )
            // ../com.lowcoupling.dotEditor.ui/src-gen/com/lowcoupling/dotEditor/ui/contentassist/antlr/internal/InternalDot.g:159:1: ( ( rule__DirectedGraph__Group__0 ) )
            {
            // ../com.lowcoupling.dotEditor.ui/src-gen/com/lowcoupling/dotEditor/ui/contentassist/antlr/internal/InternalDot.g:159:1: ( ( rule__DirectedGraph__Group__0 ) )
            // ../com.lowcoupling.dotEditor.ui/src-gen/com/lowcoupling/dotEditor/ui/contentassist/antlr/internal/InternalDot.g:160:1: ( rule__DirectedGraph__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDirectedGraphAccess().getGroup()); 
            }
            // ../com.lowcoupling.dotEditor.ui/src-gen/com/lowcoupling/dotEditor/ui/contentassist/antlr/internal/InternalDot.g:161:1: ( rule__DirectedGraph__Group__0 )
            // ../com.lowcoupling.dotEditor.ui/src-gen/com/lowcoupling/dotEditor/ui/contentassist/antlr/internal/InternalDot.g:161:2: rule__DirectedGraph__Group__0
            {
            pushFollow(FOLLOW_rule__DirectedGraph__Group__0_in_ruleDirectedGraph281);
            rule__DirectedGraph__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDirectedGraphAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDirectedGraph"


    // $ANTLR start "entryRuleUnDirectedEdge"
    // ../com.lowcoupling.dotEditor.ui/src-gen/com/lowcoupling/dotEditor/ui/contentassist/antlr/internal/InternalDot.g:173:1: entryRuleUnDirectedEdge : ruleUnDirectedEdge EOF ;
    public final void entryRuleUnDirectedEdge() throws RecognitionException {
        try {
            // ../com.lowcoupling.dotEditor.ui/src-gen/com/lowcoupling/dotEditor/ui/contentassist/antlr/internal/InternalDot.g:174:1: ( ruleUnDirectedEdge EOF )
            // ../com.lowcoupling.dotEditor.ui/src-gen/com/lowcoupling/dotEditor/ui/contentassist/antlr/internal/InternalDot.g:175:1: ruleUnDirectedEdge EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnDirectedEdgeRule()); 
            }
            pushFollow(FOLLOW_ruleUnDirectedEdge_in_entryRuleUnDirectedEdge308);
            ruleUnDirectedEdge();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getUnDirectedEdgeRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleUnDirectedEdge315); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleUnDirectedEdge"


    // $ANTLR start "ruleUnDirectedEdge"
    // ../com.lowcoupling.dotEditor.ui/src-gen/com/lowcoupling/dotEditor/ui/contentassist/antlr/internal/InternalDot.g:182:1: ruleUnDirectedEdge : ( ( rule__UnDirectedEdge__Group__0 ) ) ;
    public final void ruleUnDirectedEdge() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.dotEditor.ui/src-gen/com/lowcoupling/dotEditor/ui/contentassist/antlr/internal/InternalDot.g:186:2: ( ( ( rule__UnDirectedEdge__Group__0 ) ) )
            // ../com.lowcoupling.dotEditor.ui/src-gen/com/lowcoupling/dotEditor/ui/contentassist/antlr/internal/InternalDot.g:187:1: ( ( rule__UnDirectedEdge__Group__0 ) )
            {
            // ../com.lowcoupling.dotEditor.ui/src-gen/com/lowcoupling/dotEditor/ui/contentassist/antlr/internal/InternalDot.g:187:1: ( ( rule__UnDirectedEdge__Group__0 ) )
            // ../com.lowcoupling.dotEditor.ui/src-gen/com/lowcoupling/dotEditor/ui/contentassist/antlr/internal/InternalDot.g:188:1: ( rule__UnDirectedEdge__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnDirectedEdgeAccess().getGroup()); 
            }
            // ../com.lowcoupling.dotEditor.ui/src-gen/com/lowcoupling/dotEditor/ui/contentassist/antlr/internal/InternalDot.g:189:1: ( rule__UnDirectedEdge__Group__0 )
            // ../com.lowcoupling.dotEditor.ui/src-gen/com/lowcoupling/dotEditor/ui/contentassist/antlr/internal/InternalDot.g:189:2: rule__UnDirectedEdge__Group__0
            {
            pushFollow(FOLLOW_rule__UnDirectedEdge__Group__0_in_ruleUnDirectedEdge341);
            rule__UnDirectedEdge__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getUnDirectedEdgeAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleUnDirectedEdge"


    // $ANTLR start "entryRuleDirectedEdge"
    // ../com.lowcoupling.dotEditor.ui/src-gen/com/lowcoupling/dotEditor/ui/contentassist/antlr/internal/InternalDot.g:201:1: entryRuleDirectedEdge : ruleDirectedEdge EOF ;
    public final void entryRuleDirectedEdge() throws RecognitionException {
        try {
            // ../com.lowcoupling.dotEditor.ui/src-gen/com/lowcoupling/dotEditor/ui/contentassist/antlr/internal/InternalDot.g:202:1: ( ruleDirectedEdge EOF )
            // ../com.lowcoupling.dotEditor.ui/src-gen/com/lowcoupling/dotEditor/ui/contentassist/antlr/internal/InternalDot.g:203:1: ruleDirectedEdge EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDirectedEdgeRule()); 
            }
            pushFollow(FOLLOW_ruleDirectedEdge_in_entryRuleDirectedEdge368);
            ruleDirectedEdge();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDirectedEdgeRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDirectedEdge375); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDirectedEdge"


    // $ANTLR start "ruleDirectedEdge"
    // ../com.lowcoupling.dotEditor.ui/src-gen/com/lowcoupling/dotEditor/ui/contentassist/antlr/internal/InternalDot.g:210:1: ruleDirectedEdge : ( ( rule__DirectedEdge__Group__0 ) ) ;
    public final void ruleDirectedEdge() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.dotEditor.ui/src-gen/com/lowcoupling/dotEditor/ui/contentassist/antlr/internal/InternalDot.g:214:2: ( ( ( rule__DirectedEdge__Group__0 ) ) )
            // ../com.lowcoupling.dotEditor.ui/src-gen/com/lowcoupling/dotEditor/ui/contentassist/antlr/internal/InternalDot.g:215:1: ( ( rule__DirectedEdge__Group__0 ) )
            {
            // ../com.lowcoupling.dotEditor.ui/src-gen/com/lowcoupling/dotEditor/ui/contentassist/antlr/internal/InternalDot.g:215:1: ( ( rule__DirectedEdge__Group__0 ) )
            // ../com.lowcoupling.dotEditor.ui/src-gen/com/lowcoupling/dotEditor/ui/contentassist/antlr/internal/InternalDot.g:216:1: ( rule__DirectedEdge__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDirectedEdgeAccess().getGroup()); 
            }
            // ../com.lowcoupling.dotEditor.ui/src-gen/com/lowcoupling/dotEditor/ui/contentassist/antlr/internal/InternalDot.g:217:1: ( rule__DirectedEdge__Group__0 )
            // ../com.lowcoupling.dotEditor.ui/src-gen/com/lowcoupling/dotEditor/ui/contentassist/antlr/internal/InternalDot.g:217:2: rule__DirectedEdge__Group__0
            {
            pushFollow(FOLLOW_rule__DirectedEdge__Group__0_in_ruleDirectedEdge401);
            rule__DirectedEdge__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDirectedEdgeAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDirectedEdge"


    // $ANTLR start "entryRuleAttribute"
    // ../com.lowcoupling.dotEditor.ui/src-gen/com/lowcoupling/dotEditor/ui/contentassist/antlr/internal/InternalDot.g:229:1: entryRuleAttribute : ruleAttribute EOF ;
    public final void entryRuleAttribute() throws RecognitionException {
        try {
            // ../com.lowcoupling.dotEditor.ui/src-gen/com/lowcoupling/dotEditor/ui/contentassist/antlr/internal/InternalDot.g:230:1: ( ruleAttribute EOF )
            // ../com.lowcoupling.dotEditor.ui/src-gen/com/lowcoupling/dotEditor/ui/contentassist/antlr/internal/InternalDot.g:231:1: ruleAttribute EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeRule()); 
            }
            pushFollow(FOLLOW_ruleAttribute_in_entryRuleAttribute428);
            ruleAttribute();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributeRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttribute435); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAttribute"


    // $ANTLR start "ruleAttribute"
    // ../com.lowcoupling.dotEditor.ui/src-gen/com/lowcoupling/dotEditor/ui/contentassist/antlr/internal/InternalDot.g:238:1: ruleAttribute : ( ( rule__Attribute__Group__0 ) ) ;
    public final void ruleAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.dotEditor.ui/src-gen/com/lowcoupling/dotEditor/ui/contentassist/antlr/internal/InternalDot.g:242:2: ( ( ( rule__Attribute__Group__0 ) ) )
            // ../com.lowcoupling.dotEditor.ui/src-gen/com/lowcoupling/dotEditor/ui/contentassist/antlr/internal/InternalDot.g:243:1: ( ( rule__Attribute__Group__0 ) )
            {
            // ../com.lowcoupling.dotEditor.ui/src-gen/com/lowcoupling/dotEditor/ui/contentassist/antlr/internal/InternalDot.g:243:1: ( ( rule__Attribute__Group__0 ) )
            // ../com.lowcoupling.dotEditor.ui/src-gen/com/lowcoupling/dotEditor/ui/contentassist/antlr/internal/InternalDot.g:244:1: ( rule__Attribute__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeAccess().getGroup()); 
            }
            // ../com.lowcoupling.dotEditor.ui/src-gen/com/lowcoupling/dotEditor/ui/contentassist/antlr/internal/InternalDot.g:245:1: ( rule__Attribute__Group__0 )
            // ../com.lowcoupling.dotEditor.ui/src-gen/com/lowcoupling/dotEditor/ui/contentassist/antlr/internal/InternalDot.g:245:2: rule__Attribute__Group__0
            {
            pushFollow(FOLLOW_rule__Attribute__Group__0_in_ruleAttribute461);
            rule__Attribute__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributeAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAttribute"


    // $ANTLR start "entryRuleNode"
    // ../com.lowcoupling.dotEditor.ui/src-gen/com/lowcoupling/dotEditor/ui/contentassist/antlr/internal/InternalDot.g:257:1: entryRuleNode : ruleNode EOF ;
    public final void entryRuleNode() throws RecognitionException {
        try {
            // ../com.lowcoupling.dotEditor.ui/src-gen/com/lowcoupling/dotEditor/ui/contentassist/antlr/internal/InternalDot.g:258:1: ( ruleNode EOF )
            // ../com.lowcoupling.dotEditor.ui/src-gen/com/lowcoupling/dotEditor/ui/contentassist/antlr/internal/InternalDot.g:259:1: ruleNode EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodeRule()); 
            }
            pushFollow(FOLLOW_ruleNode_in_entryRuleNode488);
            ruleNode();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNodeRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNode495); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleNode"


    // $ANTLR start "ruleNode"
    // ../com.lowcoupling.dotEditor.ui/src-gen/com/lowcoupling/dotEditor/ui/contentassist/antlr/internal/InternalDot.g:266:1: ruleNode : ( ( rule__Node__NameAssignment ) ) ;
    public final void ruleNode() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.dotEditor.ui/src-gen/com/lowcoupling/dotEditor/ui/contentassist/antlr/internal/InternalDot.g:270:2: ( ( ( rule__Node__NameAssignment ) ) )
            // ../com.lowcoupling.dotEditor.ui/src-gen/com/lowcoupling/dotEditor/ui/contentassist/antlr/internal/InternalDot.g:271:1: ( ( rule__Node__NameAssignment ) )
            {
            // ../com.lowcoupling.dotEditor.ui/src-gen/com/lowcoupling/dotEditor/ui/contentassist/antlr/internal/InternalDot.g:271:1: ( ( rule__Node__NameAssignment ) )
            // ../com.lowcoupling.dotEditor.ui/src-gen/com/lowcoupling/dotEditor/ui/contentassist/antlr/internal/InternalDot.g:272:1: ( rule__Node__NameAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodeAccess().getNameAssignment()); 
            }
            // ../com.lowcoupling.dotEditor.ui/src-gen/com/lowcoupling/dotEditor/ui/contentassist/antlr/internal/InternalDot.g:273:1: ( rule__Node__NameAssignment )
            // ../com.lowcoupling.dotEditor.ui/src-gen/com/lowcoupling/dotEditor/ui/contentassist/antlr/internal/InternalDot.g:273:2: rule__Node__NameAssignment
            {
            pushFollow(FOLLOW_rule__Node__NameAssignment_in_ruleNode521);
            rule__Node__NameAssignment();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNodeAccess().getNameAssignment()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNode"


    // $ANTLR start "rule__Graph__Alternatives"
    // ../com.lowcoupling.dotEditor.ui/src-gen/com/lowcoupling/dotEditor/ui/contentassist/antlr/internal/InternalDot.g:289:1: rule__Graph__Alternatives : ( ( ruleUndirectedGraph ) | ( ruleDirectedGraph ) );
    public final void rule__Graph__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.dotEditor.ui/src-gen/com/lowcoupling/dotEditor/ui/contentassist/antlr/internal/InternalDot.g:293:1: ( ( ruleUndirectedGraph ) | ( ruleDirectedGraph ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==11) ) {
                alt2=1;
            }
            else if ( (LA2_0==15) ) {
                alt2=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../com.lowcoupling.dotEditor.ui/src-gen/com/lowcoupling/dotEditor/ui/contentassist/antlr/internal/InternalDot.g:294:1: ( ruleUndirectedGraph )
                    {
                    // ../com.lowcoupling.dotEditor.ui/src-gen/com/lowcoupling/dotEditor/ui/contentassist/antlr/internal/InternalDot.g:294:1: ( ruleUndirectedGraph )
                    // ../com.lowcoupling.dotEditor.ui/src-gen/com/lowcoupling/dotEditor/ui/contentassist/antlr/internal/InternalDot.g:295:1: ruleUndirectedGraph
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getGraphAccess().getUndirectedGraphParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_ruleUndirectedGraph_in_rule__Graph__Alternatives561);
                    ruleUndirectedGraph();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getGraphAccess().getUndirectedGraphParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../com.lowcoupling.dotEditor.ui/src-gen/com/lowcoupling/dotEditor/ui/contentassist/antlr/internal/InternalDot.g:300:6: ( ruleDirectedGraph )
                    {
                    // ../com.lowcoupling.dotEditor.ui/src-gen/com/lowcoupling/dotEditor/ui/contentassist/antlr/internal/InternalDot.g:300:6: ( ruleDirectedGraph )
                    // ../com.lowcoupling.dotEditor.ui/src-gen/com/lowcoupling/dotEditor/ui/contentassist/antlr/internal/InternalDot.g:301:1: ruleDirectedGraph
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getGraphAccess().getDirectedGraphParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_ruleDirectedGraph_in_rule__Graph__Alternatives578);
                    ruleDirectedGraph();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getGraphAccess().getDirectedGraphParserRuleCall_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Graph__Alternatives"


    // $ANTLR start "rule__UndirectedGraph__Group__0"
    // ../com.lowcoupling.dotEditor.ui/src-gen/com/lowcoupling/dotEditor/ui/contentassist/antlr/internal/InternalDot.g:314:1: rule__UndirectedGraph__Group__0 : rule__UndirectedGraph__Group__0__Impl rule__UndirectedGraph__Group__1 ;
    public final void rule__UndirectedGraph__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.dotEditor.ui/src-gen/com/lowcoupling/dotEditor/ui/contentassist/antlr/internal/InternalDot.g:318:1: ( rule__UndirectedGraph__Group__0__Impl rule__UndirectedGraph__Group__1 )
            // ../com.lowcoupling.dotEditor.ui/src-gen/com/lowcoupling/dotEditor/ui/contentassist/antlr/internal/InternalDot.g:319:2: rule__UndirectedGraph__Group__0__Impl rule__UndirectedGraph__Group__1
            {
            pushFollow(FOLLOW_rule__UndirectedGraph__Group__0__Impl_in_rule__UndirectedGraph__Group__0609);
            rule__UndirectedGraph__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__UndirectedGraph__Group__1_in_rule__UndirectedGraph__Group__0612);
            rule__UndirectedGraph__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UndirectedGraph__Group__0"


    // $ANTLR start "rule__UndirectedGraph__Group__0__Impl"
    // ../com.lowcoupling.dotEditor.ui/src-gen/com/lowcoupling/dotEditor/ui/contentassist/antlr/internal/InternalDot.g:326:1: rule__UndirectedGraph__Group__0__Impl : ( 'graph' ) ;
    public final void rule__UndirectedGraph__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.dotEditor.ui/src-gen/com/lowcoupling/dotEditor/ui/contentassist/antlr/internal/InternalDot.g:330:1: ( ( 'graph' ) )
            // ../com.lowcoupling.dotEditor.ui/src-gen/com/lowcoupling/dotEditor/ui/contentassist/antlr/internal/InternalDot.g:331:1: ( 'graph' )
            {
            // ../com.lowcoupling.dotEditor.ui/src-gen/com/lowcoupling/dotEditor/ui/contentassist/antlr/internal/InternalDot.g:331:1: ( 'graph' )
            // ../com.lowcoupling.dotEditor.ui/src-gen/com/lowcoupling/dotEditor/ui/contentassist/antlr/internal/InternalDot.g:332:1: 'graph'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUndirectedGraphAccess().getGraphKeyword_0()); 
            }
            match(input,11,FOLLOW_11_in_rule__UndirectedGraph__Group__0__Impl640); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getUndirectedGraphAccess().getGraphKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UndirectedGraph__Group__0__Impl"


    // $ANTLR start "rule__UndirectedGraph__Group__1"
    // ../com.lowcoupling.dotEditor.ui/src-gen/com/lowcoupling/dotEditor/ui/contentassist/antlr/internal/InternalDot.g:345:1: rule__UndirectedGraph__Group__1 : rule__UndirectedGraph__Group__1__Impl rule__UndirectedGraph__Group__2 ;
    public final void rule__UndirectedGraph__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.dotEditor.ui/src-gen/com/lowcoupling/dotEditor/ui/contentassist/antlr/internal/InternalDot.g:349:1: ( rule__UndirectedGraph__Group__1__Impl rule__UndirectedGraph__Group__2 )
            // ../com.lowcoupling.dotEditor.ui/src-gen/com/lowcoupling/dotEditor/ui/contentassist/antlr/internal/InternalDot.g:350:2: rule__UndirectedGraph__Group__1__Impl rule__UndirectedGraph__Group__2
            {
            pushFollow(FOLLOW_rule__UndirectedGraph__Group__1__Impl_in_rule__UndirectedGraph__Group__1671);
            rule__UndirectedGraph__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__UndirectedGraph__Group__2_in_rule__UndirectedGraph__Group__1674);
            rule__UndirectedGraph__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UndirectedGraph__Group__1"


    // $ANTLR start "rule__UndirectedGraph__Group__1__Impl"
    // ../com.lowcoupling.dotEditor.ui/src-gen/com/lowcoupling/dotEditor/ui/contentassist/antlr/internal/InternalDot.g:357:1: rule__UndirectedGraph__Group__1__Impl : ( ( rule__UndirectedGraph__NameAssignment_1 ) ) ;
    public final void rule__UndirectedGraph__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.dotEditor.ui/src-gen/com/lowcoupling/dotEditor/ui/contentassist/antlr/internal/InternalDot.g:361:1: ( ( ( rule__UndirectedGraph__NameAssignment_1 ) ) )
            // ../com.lowcoupling.dotEditor.ui/src-gen/com/lowcoupling/dotEditor/ui/contentassist/antlr/internal/InternalDot.g:362:1: ( ( rule__UndirectedGraph__NameAssignment_1 ) )
            {
            // ../com.lowcoupling.dotEditor.ui/src-gen/com/lowcoupling/dotEditor/ui/contentassist/antlr/internal/InternalDot.g:362:1: ( ( rule__UndirectedGraph__NameAssignment_1 ) )
            // ../com.lowcoupling.dotEditor.ui/src-gen/com/lowcoupling/dotEditor/ui/contentassist/antlr/internal/InternalDot.g:363:1: ( rule__UndirectedGraph__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUndirectedGraphAccess().getNameAssignment_1()); 
            }
            // ../com.lowcoupling.dotEditor.ui/src-gen/com/lowcoupling/dotEditor/ui/contentassist/antlr/internal/InternalDot.g:364:1: ( rule__UndirectedGraph__NameAssignment_1 )
            // ../com.lowcoupling.dotEditor.ui/src-gen/com/lowcoupling/dotEditor/ui/contentassist/antlr/internal/InternalDot.g:364:2: rule__UndirectedGraph__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__UndirectedGraph__NameAssignment_1_in_rule__UndirectedGraph__Group__1__Impl701);
            rule__UndirectedGraph__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getUndirectedGraphAccess().getNameAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UndirectedGraph__Group__1__Impl"


    // $ANTLR start "rule__UndirectedGraph__Group__2"
    // ../com.lowcoupling.dotEditor.ui/src-gen/com/lowcoupling/dotEditor/ui/contentassist/antlr/internal/InternalDot.g:374:1: rule__UndirectedGraph__Group__2 : rule__UndirectedGraph__Group__2__Impl rule__UndirectedGraph__Group__3 ;
    public final void rule__UndirectedGraph__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.dotEditor.ui/src-gen/com/lowcoupling/dotEditor/ui/contentassist/antlr/internal/InternalDot.g:378:1: ( rule__UndirectedGraph__Group__2__Impl rule__UndirectedGraph__Group__3 )
            // ../com.lowcoupling.dotEditor.ui/src-gen/com/lowcoupling/dotEditor/ui/contentassist/antlr/internal/InternalDot.g:379:2: rule__UndirectedGraph__Group__2__Impl rule__UndirectedGraph__Group__3
            {
            pushFollow(FOLLOW_rule__UndirectedGraph__Group__2__Impl_in_rule__UndirectedGraph__Group__2731);
            rule__UndirectedGraph__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__UndirectedGraph__Group__3_in_rule__UndirectedGraph__Group__2734);
            rule__UndirectedGraph__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UndirectedGraph__Group__2"


    // $ANTLR start "rule__UndirectedGraph__Group__2__Impl"
    // ../com.lowcoupling.dotEditor.ui/src-gen/com/lowcoupling/dotEditor/ui/contentassist/antlr/internal/InternalDot.g:386:1: rule__UndirectedGraph__Group__2__Impl : ( '{' ) ;
    public final void rule__UndirectedGraph__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.dotEditor.ui/src-gen/com/lowcoupling/dotEditor/ui/contentassist/antlr/internal/InternalDot.g:390:1: ( ( '{' ) )
            // ../com.lowcoupling.dotEditor.ui/src-gen/com/lowcoupling/dotEditor/ui/contentassist/antlr/internal/InternalDot.g:391:1: ( '{' )
            {
            // ../com.lowcoupling.dotEditor.ui/src-gen/com/lowcoupling/dotEditor/ui/contentassist/antlr/internal/InternalDot.g:391:1: ( '{' )
            // ../com.lowcoupling.dotEditor.ui/src-gen/com/lowcoupling/dotEditor/ui/contentassist/antlr/internal/InternalDot.g:392:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUndirectedGraphAccess().getLeftCurlyBracketKeyword_2()); 
            }
            match(input,12,FOLLOW_12_in_rule__UndirectedGraph__Group__2__Impl762); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getUndirectedGraphAccess().getLeftCurlyBracketKeyword_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UndirectedGraph__Group__2__Impl"


    // $ANTLR start "rule__UndirectedGraph__Group__3"
    // ../com.lowcoupling.dotEditor.ui/src-gen/com/lowcoupling/dotEditor/ui/contentassist/antlr/internal/InternalDot.g:405:1: rule__UndirectedGraph__Group__3 : rule__UndirectedGraph__Group__3__Impl rule__UndirectedGraph__Group__4 ;
    public final void rule__UndirectedGraph__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.dotEditor.ui/src-gen/com/lowcoupling/dotEditor/ui/contentassist/antlr/internal/InternalDot.g:409:1: ( rule__UndirectedGraph__Group__3__Impl rule__UndirectedGraph__Group__4 )
            // ../com.lowcoupling.dotEditor.ui/src-gen/com/lowcoupling/dotEditor/ui/contentassist/antlr/internal/InternalDot.g:410:2: rule__UndirectedGraph__Group__3__Impl rule__UndirectedGraph__Group__4
            {
            pushFollow(FOLLOW_rule__UndirectedGraph__Group__3__Impl_in_rule__UndirectedGraph__Group__3793);
            rule__UndirectedGraph__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__UndirectedGraph__Group__4_in_rule__UndirectedGraph__Group__3796);
            rule__UndirectedGraph__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UndirectedGraph__Group__3"


    // $ANTLR start "rule__UndirectedGraph__Group__3__Impl"
    // ../com.lowcoupling.dotEditor.ui/src-gen/com/lowcoupling/dotEditor/ui/contentassist/antlr/internal/InternalDot.g:417:1: rule__UndirectedGraph__Group__3__Impl : ( ( rule__UndirectedGraph__Group_3__0 )* ) ;
    public final void rule__UndirectedGraph__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.dotEditor.ui/src-gen/com/lowcoupling/dotEditor/ui/contentassist/antlr/internal/InternalDot.g:421:1: ( ( ( rule__UndirectedGraph__Group_3__0 )* ) )
            // ../com.lowcoupling.dotEditor.ui/src-gen/com/lowcoupling/dotEditor/ui/contentassist/antlr/internal/InternalDot.g:422:1: ( ( rule__UndirectedGraph__Group_3__0 )* )
            {
            // ../com.lowcoupling.dotEditor.ui/src-gen/com/lowcoupling/dotEditor/ui/contentassist/antlr/internal/InternalDot.g:422:1: ( ( rule__UndirectedGraph__Group_3__0 )* )
            // ../com.lowcoupling.dotEditor.ui/src-gen/com/lowcoupling/dotEditor/ui/contentassist/antlr/internal/InternalDot.g:423:1: ( rule__UndirectedGraph__Group_3__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUndirectedGraphAccess().getGroup_3()); 
            }
            // ../com.lowcoupling.dotEditor.ui/src-gen/com/lowcoupling/dotEditor/ui/contentassist/antlr/internal/InternalDot.g:424:1: ( rule__UndirectedGraph__Group_3__0 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==RULE_ID) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../com.lowcoupling.dotEditor.ui/src-gen/com/lowcoupling/dotEditor/ui/contentassist/antlr/internal/InternalDot.g:424:2: rule__UndirectedGraph__Group_3__0
            	    {
            	    pushFollow(FOLLOW_rule__UndirectedGraph__Group_3__0_in_rule__UndirectedGraph__Group__3__Impl823);
            	    rule__UndirectedGraph__Group_3__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getUndirectedGraphAccess().getGroup_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UndirectedGraph__Group__3__Impl"


    // $ANTLR start "rule__UndirectedGraph__Group__4"
    // ../com.lowcoupling.dotEditor.ui/src-gen/com/lowcoupling/dotEditor/ui/contentassist/antlr/internal/InternalDot.g:434:1: rule__UndirectedGraph__Group__4 : rule__UndirectedGraph__Group__4__Impl ;
    public final void rule__UndirectedGraph__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.dotEditor.ui/src-gen/com/lowcoupling/dotEditor/ui/contentassist/antlr/internal/InternalDot.g:438:1: ( rule__UndirectedGraph__Group__4__Impl )
            // ../com.lowcoupling.dotEditor.ui/src-gen/com/lowcoupling/dotEditor/ui/contentassist/antlr/internal/InternalDot.g:439:2: rule__UndirectedGraph__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__UndirectedGraph__Group__4__Impl_in_rule__UndirectedGraph__Group__4854);
            rule__UndirectedGraph__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UndirectedGraph__Group__4"


    // $ANTLR start "rule__UndirectedGraph__Group__4__Impl"
    // ../com.lowcoupling.dotEditor.ui/src-gen/com/lowcoupling/dotEditor/ui/contentassist/antlr/internal/InternalDot.g:445:1: rule__UndirectedGraph__Group__4__Impl : ( '}' ) ;
    public final void rule__UndirectedGraph__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.dotEditor.ui/src-gen/com/lowcoupling/dotEditor/ui/contentassist/antlr/internal/InternalDot.g:449:1: ( ( '}' ) )
            // ../com.lowcoupling.dotEditor.ui/src-gen/com/lowcoupling/dotEditor/ui/contentassist/antlr/internal/InternalDot.g:450:1: ( '}' )
            {
            // ../com.lowcoupling.dotEditor.ui/src-gen/com/lowcoupling/dotEditor/ui/contentassist/antlr/internal/InternalDot.g:450:1: ( '}' )
            // ../com.lowcoupling.dotEditor.ui/src-gen/com/lowcoupling/dotEditor/ui/contentassist/antlr/internal/InternalDot.g:451:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUndirectedGraphAccess().getRightCurlyBracketKeyword_4()); 
            }
            match(input,13,FOLLOW_13_in_rule__UndirectedGraph__Group__4__Impl882); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getUndirectedGraphAccess().getRightCurlyBracketKeyword_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UndirectedGraph__Group__4__Impl"


    // $ANTLR start "rule__UndirectedGraph__Group_3__0"
    // ../com.lowcoupling.dotEditor.ui/src-gen/com/lowcoupling/dotEditor/ui/contentassist/antlr/internal/InternalDot.g:474:1: rule__UndirectedGraph__Group_3__0 : rule__UndirectedGraph__Group_3__0__Impl rule__UndirectedGraph__Group_3__1 ;
    public final void rule__UndirectedGraph__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.dotEditor.ui/src-gen/com/lowcoupling/dotEditor/ui/contentassist/antlr/internal/InternalDot.g:478:1: ( rule__UndirectedGraph__Group_3__0__Impl rule__UndirectedGraph__Group_3__1 )
            // ../com.lowcoupling.dotEditor.ui/src-gen/com/lowcoupling/dotEditor/ui/contentassist/antlr/internal/InternalDot.g:479:2: rule__UndirectedGraph__Group_3__0__Impl rule__UndirectedGraph__Group_3__1
            {
            pushFollow(FOLLOW_rule__UndirectedGraph__Group_3__0__Impl_in_rule__UndirectedGraph__Group_3__0923);
            rule__UndirectedGraph__Group_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__UndirectedGraph__Group_3__1_in_rule__UndirectedGraph__Group_3__0926);
            rule__UndirectedGraph__Group_3__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UndirectedGraph__Group_3__0"


    // $ANTLR start "rule__UndirectedGraph__Group_3__0__Impl"
    // ../com.lowcoupling.dotEditor.ui/src-gen/com/lowcoupling/dotEditor/ui/contentassist/antlr/internal/InternalDot.g:486:1: rule__UndirectedGraph__Group_3__0__Impl : ( ( rule__UndirectedGraph__EdgeAssignment_3_0 ) ) ;
    public final void rule__UndirectedGraph__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.dotEditor.ui/src-gen/com/lowcoupling/dotEditor/ui/contentassist/antlr/internal/InternalDot.g:490:1: ( ( ( rule__UndirectedGraph__EdgeAssignment_3_0 ) ) )
            // ../com.lowcoupling.dotEditor.ui/src-gen/com/lowcoupling/dotEditor/ui/contentassist/antlr/internal/InternalDot.g:491:1: ( ( rule__UndirectedGraph__EdgeAssignment_3_0 ) )
            {
            // ../com.lowcoupling.dotEditor.ui/src-gen/com/lowcoupling/dotEditor/ui/contentassist/antlr/internal/InternalDot.g:491:1: ( ( rule__UndirectedGraph__EdgeAssignment_3_0 ) )
            // ../com.lowcoupling.dotEditor.ui/src-gen/com/lowcoupling/dotEditor/ui/contentassist/antlr/internal/InternalDot.g:492:1: ( rule__UndirectedGraph__EdgeAssignment_3_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUndirectedGraphAccess().getEdgeAssignment_3_0()); 
            }
            // ../com.lowcoupling.dotEditor.ui/src-gen/com/lowcoupling/dotEditor/ui/contentassist/antlr/internal/InternalDot.g:493:1: ( rule__UndirectedGraph__EdgeAssignment_3_0 )
            // ../com.lowcoupling.dotEditor.ui/src-gen/com/lowcoupling/dotEditor/ui/contentassist/antlr/internal/InternalDot.g:493:2: rule__UndirectedGraph__EdgeAssignment_3_0
            {
            pushFollow(FOLLOW_rule__UndirectedGraph__EdgeAssignment_3_0_in_rule__UndirectedGraph__Group_3__0__Impl953);
            rule__UndirectedGraph__EdgeAssignment_3_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getUndirectedGraphAccess().getEdgeAssignment_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UndirectedGraph__Group_3__0__Impl"


    // $ANTLR start "rule__UndirectedGraph__Group_3__1"
    // ../com.lowcoupling.dotEditor.ui/src-gen/com/lowcoupling/dotEditor/ui/contentassist/antlr/internal/InternalDot.g:503:1: rule__UndirectedGraph__Group_3__1 : rule__UndirectedGraph__Group_3__1__Impl ;
    public final void rule__UndirectedGraph__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.dotEditor.ui/src-gen/com/lowcoupling/dotEditor/ui/contentassist/antlr/internal/InternalDot.g:507:1: ( rule__UndirectedGraph__Group_3__1__Impl )
            // ../com.lowcoupling.dotEditor.ui/src-gen/com/lowcoupling/dotEditor/ui/contentassist/antlr/internal/InternalDot.g:508:2: rule__UndirectedGraph__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__UndirectedGraph__Group_3__1__Impl_in_rule__UndirectedGraph__Group_3__1983);
            rule__UndirectedGraph__Group_3__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UndirectedGraph__Group_3__1"


    // $ANTLR start "rule__UndirectedGraph__Group_3__1__Impl"
    // ../com.lowcoupling.dotEditor.ui/src-gen/com/lowcoupling/dotEditor/ui/contentassist/antlr/internal/InternalDot.g:514:1: rule__UndirectedGraph__Group_3__1__Impl : ( ';' ) ;
    public final void rule__UndirectedGraph__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.dotEditor.ui/src-gen/com/lowcoupling/dotEditor/ui/contentassist/antlr/internal/InternalDot.g:518:1: ( ( ';' ) )
            // ../com.lowcoupling.dotEditor.ui/src-gen/com/lowcoupling/dotEditor/ui/contentassist/antlr/internal/InternalDot.g:519:1: ( ';' )
            {
            // ../com.lowcoupling.dotEditor.ui/src-gen/com/lowcoupling/dotEditor/ui/contentassist/antlr/internal/InternalDot.g:519:1: ( ';' )
            // ../com.lowcoupling.dotEditor.ui/src-gen/com/lowcoupling/dotEditor/ui/contentassist/antlr/internal/InternalDot.g:520:1: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUndirectedGraphAccess().getSemicolonKeyword_3_1()); 
            }
            match(input,14,FOLLOW_14_in_rule__UndirectedGraph__Group_3__1__Impl1011); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getUndirectedGraphAccess().getSemicolonKeyword_3_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UndirectedGraph__Group_3__1__Impl"


    // $ANTLR start "rule__DirectedGraph__Group__0"
    // ../com.lowcoupling.dotEditor.ui/src-gen/com/lowcoupling/dotEditor/ui/contentassist/antlr/internal/InternalDot.g:537:1: rule__DirectedGraph__Group__0 : rule__DirectedGraph__Group__0__Impl rule__DirectedGraph__Group__1 ;
    public final void rule__DirectedGraph__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.dotEditor.ui/src-gen/com/lowcoupling/dotEditor/ui/contentassist/antlr/internal/InternalDot.g:541:1: ( rule__DirectedGraph__Group__0__Impl rule__DirectedGraph__Group__1 )
            // ../com.lowcoupling.dotEditor.ui/src-gen/com/lowcoupling/dotEditor/ui/contentassist/antlr/internal/InternalDot.g:542:2: rule__DirectedGraph__Group__0__Impl rule__DirectedGraph__Group__1
            {
            pushFollow(FOLLOW_rule__DirectedGraph__Group__0__Impl_in_rule__DirectedGraph__Group__01046);
            rule__DirectedGraph__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__DirectedGraph__Group__1_in_rule__DirectedGraph__Group__01049);
            rule__DirectedGraph__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DirectedGraph__Group__0"


    // $ANTLR start "rule__DirectedGraph__Group__0__Impl"
    // ../com.lowcoupling.dotEditor.ui/src-gen/com/lowcoupling/dotEditor/ui/contentassist/antlr/internal/InternalDot.g:549:1: rule__DirectedGraph__Group__0__Impl : ( 'digraph' ) ;
    public final void rule__DirectedGraph__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.dotEditor.ui/src-gen/com/lowcoupling/dotEditor/ui/contentassist/antlr/internal/InternalDot.g:553:1: ( ( 'digraph' ) )
            // ../com.lowcoupling.dotEditor.ui/src-gen/com/lowcoupling/dotEditor/ui/contentassist/antlr/internal/InternalDot.g:554:1: ( 'digraph' )
            {
            // ../com.lowcoupling.dotEditor.ui/src-gen/com/lowcoupling/dotEditor/ui/contentassist/antlr/internal/InternalDot.g:554:1: ( 'digraph' )
            // ../com.lowcoupling.dotEditor.ui/src-gen/com/lowcoupling/dotEditor/ui/contentassist/antlr/internal/InternalDot.g:555:1: 'digraph'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDirectedGraphAccess().getDigraphKeyword_0()); 
            }
            match(input,15,FOLLOW_15_in_rule__DirectedGraph__Group__0__Impl1077); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDirectedGraphAccess().getDigraphKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DirectedGraph__Group__0__Impl"


    // $ANTLR start "rule__DirectedGraph__Group__1"
    // ../com.lowcoupling.dotEditor.ui/src-gen/com/lowcoupling/dotEditor/ui/contentassist/antlr/internal/InternalDot.g:568:1: rule__DirectedGraph__Group__1 : rule__DirectedGraph__Group__1__Impl rule__DirectedGraph__Group__2 ;
    public final void rule__DirectedGraph__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.dotEditor.ui/src-gen/com/lowcoupling/dotEditor/ui/contentassist/antlr/internal/InternalDot.g:572:1: ( rule__DirectedGraph__Group__1__Impl rule__DirectedGraph__Group__2 )
            // ../com.lowcoupling.dotEditor.ui/src-gen/com/lowcoupling/dotEditor/ui/contentassist/antlr/internal/InternalDot.g:573:2: rule__DirectedGraph__Group__1__Impl rule__DirectedGraph__Group__2
            {
            pushFollow(FOLLOW_rule__DirectedGraph__Group__1__Impl_in_rule__DirectedGraph__Group__11108);
            rule__DirectedGraph__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__DirectedGraph__Group__2_in_rule__DirectedGraph__Group__11111);
            rule__DirectedGraph__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DirectedGraph__Group__1"


    // $ANTLR start "rule__DirectedGraph__Group__1__Impl"
    // ../com.lowcoupling.dotEditor.ui/src-gen/com/lowcoupling/dotEditor/ui/contentassist/antlr/internal/InternalDot.g:580:1: rule__DirectedGraph__Group__1__Impl : ( ( rule__DirectedGraph__NameAssignment_1 ) ) ;
    public final void rule__DirectedGraph__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.dotEditor.ui/src-gen/com/lowcoupling/dotEditor/ui/contentassist/antlr/internal/InternalDot.g:584:1: ( ( ( rule__DirectedGraph__NameAssignment_1 ) ) )
            // ../com.lowcoupling.dotEditor.ui/src-gen/com/lowcoupling/dotEditor/ui/contentassist/antlr/internal/InternalDot.g:585:1: ( ( rule__DirectedGraph__NameAssignment_1 ) )
            {
            // ../com.lowcoupling.dotEditor.ui/src-gen/com/lowcoupling/dotEditor/ui/contentassist/antlr/internal/InternalDot.g:585:1: ( ( rule__DirectedGraph__NameAssignment_1 ) )
            // ../com.lowcoupling.dotEditor.ui/src-gen/com/lowcoupling/dotEditor/ui/contentassist/antlr/internal/InternalDot.g:586:1: ( rule__DirectedGraph__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDirectedGraphAccess().getNameAssignment_1()); 
            }
            // ../com.lowcoupling.dotEditor.ui/src-gen/com/lowcoupling/dotEditor/ui/contentassist/antlr/internal/InternalDot.g:587:1: ( rule__DirectedGraph__NameAssignment_1 )
            // ../com.lowcoupling.dotEditor.ui/src-gen/com/lowcoupling/dotEditor/ui/contentassist/antlr/internal/InternalDot.g:587:2: rule__DirectedGraph__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__DirectedGraph__NameAssignment_1_in_rule__DirectedGraph__Group__1__Impl1138);
            rule__DirectedGraph__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDirectedGraphAccess().getNameAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DirectedGraph__Group__1__Impl"


    // $ANTLR start "rule__DirectedGraph__Group__2"
    // ../com.lowcoupling.dotEditor.ui/src-gen/com/lowcoupling/dotEditor/ui/contentassist/antlr/internal/InternalDot.g:597:1: rule__DirectedGraph__Group__2 : rule__DirectedGraph__Group__2__Impl rule__DirectedGraph__Group__3 ;
    public final void rule__DirectedGraph__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.dotEditor.ui/src-gen/com/lowcoupling/dotEditor/ui/contentassist/antlr/internal/InternalDot.g:601:1: ( rule__DirectedGraph__Group__2__Impl rule__DirectedGraph__Group__3 )
            // ../com.lowcoupling.dotEditor.ui/src-gen/com/lowcoupling/dotEditor/ui/contentassist/antlr/internal/InternalDot.g:602:2: rule__DirectedGraph__Group__2__Impl rule__DirectedGraph__Group__3
            {
            pushFollow(FOLLOW_rule__DirectedGraph__Group__2__Impl_in_rule__DirectedGraph__Group__21168);
            rule__DirectedGraph__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__DirectedGraph__Group__3_in_rule__DirectedGraph__Group__21171);
            rule__DirectedGraph__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DirectedGraph__Group__2"


    // $ANTLR start "rule__DirectedGraph__Group__2__Impl"
    // ../com.lowcoupling.dotEditor.ui/src-gen/com/lowcoupling/dotEditor/ui/contentassist/antlr/internal/InternalDot.g:609:1: rule__DirectedGraph__Group__2__Impl : ( '{' ) ;
    public final void rule__DirectedGraph__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.dotEditor.ui/src-gen/com/lowcoupling/dotEditor/ui/contentassist/antlr/internal/InternalDot.g:613:1: ( ( '{' ) )
            // ../com.lowcoupling.dotEditor.ui/src-gen/com/lowcoupling/dotEditor/ui/contentassist/antlr/internal/InternalDot.g:614:1: ( '{' )
            {
            // ../com.lowcoupling.dotEditor.ui/src-gen/com/lowcoupling/dotEditor/ui/contentassist/antlr/internal/InternalDot.g:614:1: ( '{' )
            // ../com.lowcoupling.dotEditor.ui/src-gen/com/lowcoupling/dotEditor/ui/contentassist/antlr/internal/InternalDot.g:615:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDirectedGraphAccess().getLeftCurlyBracketKeyword_2()); 
            }
            match(input,12,FOLLOW_12_in_rule__DirectedGraph__Group__2__Impl1199); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDirectedGraphAccess().getLeftCurlyBracketKeyword_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DirectedGraph__Group__2__Impl"


    // $ANTLR start "rule__DirectedGraph__Group__3"
    // ../com.lowcoupling.dotEditor.ui/src-gen/com/lowcoupling/dotEditor/ui/contentassist/antlr/internal/InternalDot.g:628:1: rule__DirectedGraph__Group__3 : rule__DirectedGraph__Group__3__Impl rule__DirectedGraph__Group__4 ;
    public final void rule__DirectedGraph__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.dotEditor.ui/src-gen/com/lowcoupling/dotEditor/ui/contentassist/antlr/internal/InternalDot.g:632:1: ( rule__DirectedGraph__Group__3__Impl rule__DirectedGraph__Group__4 )
            // ../com.lowcoupling.dotEditor.ui/src-gen/com/lowcoupling/dotEditor/ui/contentassist/antlr/internal/InternalDot.g:633:2: rule__DirectedGraph__Group__3__Impl rule__DirectedGraph__Group__4
            {
            pushFollow(FOLLOW_rule__DirectedGraph__Group__3__Impl_in_rule__DirectedGraph__Group__31230);
            rule__DirectedGraph__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__DirectedGraph__Group__4_in_rule__DirectedGraph__Group__31233);
            rule__DirectedGraph__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DirectedGraph__Group__3"


    // $ANTLR start "rule__DirectedGraph__Group__3__Impl"
    // ../com.lowcoupling.dotEditor.ui/src-gen/com/lowcoupling/dotEditor/ui/contentassist/antlr/internal/InternalDot.g:640:1: rule__DirectedGraph__Group__3__Impl : ( ( rule__DirectedGraph__Group_3__0 )* ) ;
    public final void rule__DirectedGraph__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.dotEditor.ui/src-gen/com/lowcoupling/dotEditor/ui/contentassist/antlr/internal/InternalDot.g:644:1: ( ( ( rule__DirectedGraph__Group_3__0 )* ) )
            // ../com.lowcoupling.dotEditor.ui/src-gen/com/lowcoupling/dotEditor/ui/contentassist/antlr/internal/InternalDot.g:645:1: ( ( rule__DirectedGraph__Group_3__0 )* )
            {
            // ../com.lowcoupling.dotEditor.ui/src-gen/com/lowcoupling/dotEditor/ui/contentassist/antlr/internal/InternalDot.g:645:1: ( ( rule__DirectedGraph__Group_3__0 )* )
            // ../com.lowcoupling.dotEditor.ui/src-gen/com/lowcoupling/dotEditor/ui/contentassist/antlr/internal/InternalDot.g:646:1: ( rule__DirectedGraph__Group_3__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDirectedGraphAccess().getGroup_3()); 
            }
            // ../com.lowcoupling.dotEditor.ui/src-gen/com/lowcoupling/dotEditor/ui/contentassist/antlr/internal/InternalDot.g:647:1: ( rule__DirectedGraph__Group_3__0 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==RULE_ID) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../com.lowcoupling.dotEditor.ui/src-gen/com/lowcoupling/dotEditor/ui/contentassist/antlr/internal/InternalDot.g:647:2: rule__DirectedGraph__Group_3__0
            	    {
            	    pushFollow(FOLLOW_rule__DirectedGraph__Group_3__0_in_rule__DirectedGraph__Group__3__Impl1260);
            	    rule__DirectedGraph__Group_3__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDirectedGraphAccess().getGroup_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DirectedGraph__Group__3__Impl"


    // $ANTLR start "rule__DirectedGraph__Group__4"
    // ../com.lowcoupling.dotEditor.ui/src-gen/com/lowcoupling/dotEditor/ui/contentassist/antlr/internal/InternalDot.g:657:1: rule__DirectedGraph__Group__4 : rule__DirectedGraph__Group__4__Impl ;
    public final void rule__DirectedGraph__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.dotEditor.ui/src-gen/com/lowcoupling/dotEditor/ui/contentassist/antlr/internal/InternalDot.g:661:1: ( rule__DirectedGraph__Group__4__Impl )
            // ../com.lowcoupling.dotEditor.ui/src-gen/com/lowcoupling/dotEditor/ui/contentassist/antlr/internal/InternalDot.g:662:2: rule__DirectedGraph__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__DirectedGraph__Group__4__Impl_in_rule__DirectedGraph__Group__41291);
            rule__DirectedGraph__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DirectedGraph__Group__4"


    // $ANTLR start "rule__DirectedGraph__Group__4__Impl"
    // ../com.lowcoupling.dotEditor.ui/src-gen/com/lowcoupling/dotEditor/ui/contentassist/antlr/internal/InternalDot.g:668:1: rule__DirectedGraph__Group__4__Impl : ( '}' ) ;
    public final void rule__DirectedGraph__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.dotEditor.ui/src-gen/com/lowcoupling/dotEditor/ui/contentassist/antlr/internal/InternalDot.g:672:1: ( ( '}' ) )
            // ../com.lowcoupling.dotEditor.ui/src-gen/com/lowcoupling/dotEditor/ui/contentassist/antlr/internal/InternalDot.g:673:1: ( '}' )
            {
            // ../com.lowcoupling.dotEditor.ui/src-gen/com/lowcoupling/dotEditor/ui/contentassist/antlr/internal/InternalDot.g:673:1: ( '}' )
            // ../com.lowcoupling.dotEditor.ui/src-gen/com/lowcoupling/dotEditor/ui/contentassist/antlr/internal/InternalDot.g:674:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDirectedGraphAccess().getRightCurlyBracketKeyword_4()); 
            }
            match(input,13,FOLLOW_13_in_rule__DirectedGraph__Group__4__Impl1319); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDirectedGraphAccess().getRightCurlyBracketKeyword_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DirectedGraph__Group__4__Impl"


    // $ANTLR start "rule__DirectedGraph__Group_3__0"
    // ../com.lowcoupling.dotEditor.ui/src-gen/com/lowcoupling/dotEditor/ui/contentassist/antlr/internal/InternalDot.g:697:1: rule__DirectedGraph__Group_3__0 : rule__DirectedGraph__Group_3__0__Impl rule__DirectedGraph__Group_3__1 ;
    public final void rule__DirectedGraph__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.dotEditor.ui/src-gen/com/lowcoupling/dotEditor/ui/contentassist/antlr/internal/InternalDot.g:701:1: ( rule__DirectedGraph__Group_3__0__Impl rule__DirectedGraph__Group_3__1 )
            // ../com.lowcoupling.dotEditor.ui/src-gen/com/lowcoupling/dotEditor/ui/contentassist/antlr/internal/InternalDot.g:702:2: rule__DirectedGraph__Group_3__0__Impl rule__DirectedGraph__Group_3__1
            {
            pushFollow(FOLLOW_rule__DirectedGraph__Group_3__0__Impl_in_rule__DirectedGraph__Group_3__01360);
            rule__DirectedGraph__Group_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__DirectedGraph__Group_3__1_in_rule__DirectedGraph__Group_3__01363);
            rule__DirectedGraph__Group_3__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DirectedGraph__Group_3__0"


    // $ANTLR start "rule__DirectedGraph__Group_3__0__Impl"
    // ../com.lowcoupling.dotEditor.ui/src-gen/com/lowcoupling/dotEditor/ui/contentassist/antlr/internal/InternalDot.g:709:1: rule__DirectedGraph__Group_3__0__Impl : ( ( rule__DirectedGraph__EdgeAssignment_3_0 ) ) ;
    public final void rule__DirectedGraph__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.dotEditor.ui/src-gen/com/lowcoupling/dotEditor/ui/contentassist/antlr/internal/InternalDot.g:713:1: ( ( ( rule__DirectedGraph__EdgeAssignment_3_0 ) ) )
            // ../com.lowcoupling.dotEditor.ui/src-gen/com/lowcoupling/dotEditor/ui/contentassist/antlr/internal/InternalDot.g:714:1: ( ( rule__DirectedGraph__EdgeAssignment_3_0 ) )
            {
            // ../com.lowcoupling.dotEditor.ui/src-gen/com/lowcoupling/dotEditor/ui/contentassist/antlr/internal/InternalDot.g:714:1: ( ( rule__DirectedGraph__EdgeAssignment_3_0 ) )
            // ../com.lowcoupling.dotEditor.ui/src-gen/com/lowcoupling/dotEditor/ui/contentassist/antlr/internal/InternalDot.g:715:1: ( rule__DirectedGraph__EdgeAssignment_3_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDirectedGraphAccess().getEdgeAssignment_3_0()); 
            }
            // ../com.lowcoupling.dotEditor.ui/src-gen/com/lowcoupling/dotEditor/ui/contentassist/antlr/internal/InternalDot.g:716:1: ( rule__DirectedGraph__EdgeAssignment_3_0 )
            // ../com.lowcoupling.dotEditor.ui/src-gen/com/lowcoupling/dotEditor/ui/contentassist/antlr/internal/InternalDot.g:716:2: rule__DirectedGraph__EdgeAssignment_3_0
            {
            pushFollow(FOLLOW_rule__DirectedGraph__EdgeAssignment_3_0_in_rule__DirectedGraph__Group_3__0__Impl1390);
            rule__DirectedGraph__EdgeAssignment_3_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDirectedGraphAccess().getEdgeAssignment_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DirectedGraph__Group_3__0__Impl"


    // $ANTLR start "rule__DirectedGraph__Group_3__1"
    // ../com.lowcoupling.dotEditor.ui/src-gen/com/lowcoupling/dotEditor/ui/contentassist/antlr/internal/InternalDot.g:726:1: rule__DirectedGraph__Group_3__1 : rule__DirectedGraph__Group_3__1__Impl ;
    public final void rule__DirectedGraph__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.dotEditor.ui/src-gen/com/lowcoupling/dotEditor/ui/contentassist/antlr/internal/InternalDot.g:730:1: ( rule__DirectedGraph__Group_3__1__Impl )
            // ../com.lowcoupling.dotEditor.ui/src-gen/com/lowcoupling/dotEditor/ui/contentassist/antlr/internal/InternalDot.g:731:2: rule__DirectedGraph__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__DirectedGraph__Group_3__1__Impl_in_rule__DirectedGraph__Group_3__11420);
            rule__DirectedGraph__Group_3__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DirectedGraph__Group_3__1"


    // $ANTLR start "rule__DirectedGraph__Group_3__1__Impl"
    // ../com.lowcoupling.dotEditor.ui/src-gen/com/lowcoupling/dotEditor/ui/contentassist/antlr/internal/InternalDot.g:737:1: rule__DirectedGraph__Group_3__1__Impl : ( ';' ) ;
    public final void rule__DirectedGraph__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.dotEditor.ui/src-gen/com/lowcoupling/dotEditor/ui/contentassist/antlr/internal/InternalDot.g:741:1: ( ( ';' ) )
            // ../com.lowcoupling.dotEditor.ui/src-gen/com/lowcoupling/dotEditor/ui/contentassist/antlr/internal/InternalDot.g:742:1: ( ';' )
            {
            // ../com.lowcoupling.dotEditor.ui/src-gen/com/lowcoupling/dotEditor/ui/contentassist/antlr/internal/InternalDot.g:742:1: ( ';' )
            // ../com.lowcoupling.dotEditor.ui/src-gen/com/lowcoupling/dotEditor/ui/contentassist/antlr/internal/InternalDot.g:743:1: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDirectedGraphAccess().getSemicolonKeyword_3_1()); 
            }
            match(input,14,FOLLOW_14_in_rule__DirectedGraph__Group_3__1__Impl1448); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDirectedGraphAccess().getSemicolonKeyword_3_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DirectedGraph__Group_3__1__Impl"


    // $ANTLR start "rule__UnDirectedEdge__Group__0"
    // ../com.lowcoupling.dotEditor.ui/src-gen/com/lowcoupling/dotEditor/ui/contentassist/antlr/internal/InternalDot.g:760:1: rule__UnDirectedEdge__Group__0 : rule__UnDirectedEdge__Group__0__Impl rule__UnDirectedEdge__Group__1 ;
    public final void rule__UnDirectedEdge__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.dotEditor.ui/src-gen/com/lowcoupling/dotEditor/ui/contentassist/antlr/internal/InternalDot.g:764:1: ( rule__UnDirectedEdge__Group__0__Impl rule__UnDirectedEdge__Group__1 )
            // ../com.lowcoupling.dotEditor.ui/src-gen/com/lowcoupling/dotEditor/ui/contentassist/antlr/internal/InternalDot.g:765:2: rule__UnDirectedEdge__Group__0__Impl rule__UnDirectedEdge__Group__1
            {
            pushFollow(FOLLOW_rule__UnDirectedEdge__Group__0__Impl_in_rule__UnDirectedEdge__Group__01483);
            rule__UnDirectedEdge__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__UnDirectedEdge__Group__1_in_rule__UnDirectedEdge__Group__01486);
            rule__UnDirectedEdge__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnDirectedEdge__Group__0"


    // $ANTLR start "rule__UnDirectedEdge__Group__0__Impl"
    // ../com.lowcoupling.dotEditor.ui/src-gen/com/lowcoupling/dotEditor/ui/contentassist/antlr/internal/InternalDot.g:772:1: rule__UnDirectedEdge__Group__0__Impl : ( ( rule__UnDirectedEdge__SrcAssignment_0 ) ) ;
    public final void rule__UnDirectedEdge__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.dotEditor.ui/src-gen/com/lowcoupling/dotEditor/ui/contentassist/antlr/internal/InternalDot.g:776:1: ( ( ( rule__UnDirectedEdge__SrcAssignment_0 ) ) )
            // ../com.lowcoupling.dotEditor.ui/src-gen/com/lowcoupling/dotEditor/ui/contentassist/antlr/internal/InternalDot.g:777:1: ( ( rule__UnDirectedEdge__SrcAssignment_0 ) )
            {
            // ../com.lowcoupling.dotEditor.ui/src-gen/com/lowcoupling/dotEditor/ui/contentassist/antlr/internal/InternalDot.g:777:1: ( ( rule__UnDirectedEdge__SrcAssignment_0 ) )
            // ../com.lowcoupling.dotEditor.ui/src-gen/com/lowcoupling/dotEditor/ui/contentassist/antlr/internal/InternalDot.g:778:1: ( rule__UnDirectedEdge__SrcAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnDirectedEdgeAccess().getSrcAssignment_0()); 
            }
            // ../com.lowcoupling.dotEditor.ui/src-gen/com/lowcoupling/dotEditor/ui/contentassist/antlr/internal/InternalDot.g:779:1: ( rule__UnDirectedEdge__SrcAssignment_0 )
            // ../com.lowcoupling.dotEditor.ui/src-gen/com/lowcoupling/dotEditor/ui/contentassist/antlr/internal/InternalDot.g:779:2: rule__UnDirectedEdge__SrcAssignment_0
            {
            pushFollow(FOLLOW_rule__UnDirectedEdge__SrcAssignment_0_in_rule__UnDirectedEdge__Group__0__Impl1513);
            rule__UnDirectedEdge__SrcAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getUnDirectedEdgeAccess().getSrcAssignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnDirectedEdge__Group__0__Impl"


    // $ANTLR start "rule__UnDirectedEdge__Group__1"
    // ../com.lowcoupling.dotEditor.ui/src-gen/com/lowcoupling/dotEditor/ui/contentassist/antlr/internal/InternalDot.g:789:1: rule__UnDirectedEdge__Group__1 : rule__UnDirectedEdge__Group__1__Impl rule__UnDirectedEdge__Group__2 ;
    public final void rule__UnDirectedEdge__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.dotEditor.ui/src-gen/com/lowcoupling/dotEditor/ui/contentassist/antlr/internal/InternalDot.g:793:1: ( rule__UnDirectedEdge__Group__1__Impl rule__UnDirectedEdge__Group__2 )
            // ../com.lowcoupling.dotEditor.ui/src-gen/com/lowcoupling/dotEditor/ui/contentassist/antlr/internal/InternalDot.g:794:2: rule__UnDirectedEdge__Group__1__Impl rule__UnDirectedEdge__Group__2
            {
            pushFollow(FOLLOW_rule__UnDirectedEdge__Group__1__Impl_in_rule__UnDirectedEdge__Group__11543);
            rule__UnDirectedEdge__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__UnDirectedEdge__Group__2_in_rule__UnDirectedEdge__Group__11546);
            rule__UnDirectedEdge__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnDirectedEdge__Group__1"


    // $ANTLR start "rule__UnDirectedEdge__Group__1__Impl"
    // ../com.lowcoupling.dotEditor.ui/src-gen/com/lowcoupling/dotEditor/ui/contentassist/antlr/internal/InternalDot.g:801:1: rule__UnDirectedEdge__Group__1__Impl : ( '--' ) ;
    public final void rule__UnDirectedEdge__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.dotEditor.ui/src-gen/com/lowcoupling/dotEditor/ui/contentassist/antlr/internal/InternalDot.g:805:1: ( ( '--' ) )
            // ../com.lowcoupling.dotEditor.ui/src-gen/com/lowcoupling/dotEditor/ui/contentassist/antlr/internal/InternalDot.g:806:1: ( '--' )
            {
            // ../com.lowcoupling.dotEditor.ui/src-gen/com/lowcoupling/dotEditor/ui/contentassist/antlr/internal/InternalDot.g:806:1: ( '--' )
            // ../com.lowcoupling.dotEditor.ui/src-gen/com/lowcoupling/dotEditor/ui/contentassist/antlr/internal/InternalDot.g:807:1: '--'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnDirectedEdgeAccess().getHyphenMinusHyphenMinusKeyword_1()); 
            }
            match(input,16,FOLLOW_16_in_rule__UnDirectedEdge__Group__1__Impl1574); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getUnDirectedEdgeAccess().getHyphenMinusHyphenMinusKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnDirectedEdge__Group__1__Impl"


    // $ANTLR start "rule__UnDirectedEdge__Group__2"
    // ../com.lowcoupling.dotEditor.ui/src-gen/com/lowcoupling/dotEditor/ui/contentassist/antlr/internal/InternalDot.g:820:1: rule__UnDirectedEdge__Group__2 : rule__UnDirectedEdge__Group__2__Impl rule__UnDirectedEdge__Group__3 ;
    public final void rule__UnDirectedEdge__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.dotEditor.ui/src-gen/com/lowcoupling/dotEditor/ui/contentassist/antlr/internal/InternalDot.g:824:1: ( rule__UnDirectedEdge__Group__2__Impl rule__UnDirectedEdge__Group__3 )
            // ../com.lowcoupling.dotEditor.ui/src-gen/com/lowcoupling/dotEditor/ui/contentassist/antlr/internal/InternalDot.g:825:2: rule__UnDirectedEdge__Group__2__Impl rule__UnDirectedEdge__Group__3
            {
            pushFollow(FOLLOW_rule__UnDirectedEdge__Group__2__Impl_in_rule__UnDirectedEdge__Group__21605);
            rule__UnDirectedEdge__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__UnDirectedEdge__Group__3_in_rule__UnDirectedEdge__Group__21608);
            rule__UnDirectedEdge__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnDirectedEdge__Group__2"


    // $ANTLR start "rule__UnDirectedEdge__Group__2__Impl"
    // ../com.lowcoupling.dotEditor.ui/src-gen/com/lowcoupling/dotEditor/ui/contentassist/antlr/internal/InternalDot.g:832:1: rule__UnDirectedEdge__Group__2__Impl : ( ( rule__UnDirectedEdge__TgtAssignment_2 ) ) ;
    public final void rule__UnDirectedEdge__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.dotEditor.ui/src-gen/com/lowcoupling/dotEditor/ui/contentassist/antlr/internal/InternalDot.g:836:1: ( ( ( rule__UnDirectedEdge__TgtAssignment_2 ) ) )
            // ../com.lowcoupling.dotEditor.ui/src-gen/com/lowcoupling/dotEditor/ui/contentassist/antlr/internal/InternalDot.g:837:1: ( ( rule__UnDirectedEdge__TgtAssignment_2 ) )
            {
            // ../com.lowcoupling.dotEditor.ui/src-gen/com/lowcoupling/dotEditor/ui/contentassist/antlr/internal/InternalDot.g:837:1: ( ( rule__UnDirectedEdge__TgtAssignment_2 ) )
            // ../com.lowcoupling.dotEditor.ui/src-gen/com/lowcoupling/dotEditor/ui/contentassist/antlr/internal/InternalDot.g:838:1: ( rule__UnDirectedEdge__TgtAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnDirectedEdgeAccess().getTgtAssignment_2()); 
            }
            // ../com.lowcoupling.dotEditor.ui/src-gen/com/lowcoupling/dotEditor/ui/contentassist/antlr/internal/InternalDot.g:839:1: ( rule__UnDirectedEdge__TgtAssignment_2 )
            // ../com.lowcoupling.dotEditor.ui/src-gen/com/lowcoupling/dotEditor/ui/contentassist/antlr/internal/InternalDot.g:839:2: rule__UnDirectedEdge__TgtAssignment_2
            {
            pushFollow(FOLLOW_rule__UnDirectedEdge__TgtAssignment_2_in_rule__UnDirectedEdge__Group__2__Impl1635);
            rule__UnDirectedEdge__TgtAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getUnDirectedEdgeAccess().getTgtAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnDirectedEdge__Group__2__Impl"


    // $ANTLR start "rule__UnDirectedEdge__Group__3"
    // ../com.lowcoupling.dotEditor.ui/src-gen/com/lowcoupling/dotEditor/ui/contentassist/antlr/internal/InternalDot.g:849:1: rule__UnDirectedEdge__Group__3 : rule__UnDirectedEdge__Group__3__Impl ;
    public final void rule__UnDirectedEdge__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.dotEditor.ui/src-gen/com/lowcoupling/dotEditor/ui/contentassist/antlr/internal/InternalDot.g:853:1: ( rule__UnDirectedEdge__Group__3__Impl )
            // ../com.lowcoupling.dotEditor.ui/src-gen/com/lowcoupling/dotEditor/ui/contentassist/antlr/internal/InternalDot.g:854:2: rule__UnDirectedEdge__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__UnDirectedEdge__Group__3__Impl_in_rule__UnDirectedEdge__Group__31665);
            rule__UnDirectedEdge__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnDirectedEdge__Group__3"


    // $ANTLR start "rule__UnDirectedEdge__Group__3__Impl"
    // ../com.lowcoupling.dotEditor.ui/src-gen/com/lowcoupling/dotEditor/ui/contentassist/antlr/internal/InternalDot.g:860:1: rule__UnDirectedEdge__Group__3__Impl : ( ( rule__UnDirectedEdge__Group_3__0 )? ) ;
    public final void rule__UnDirectedEdge__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.dotEditor.ui/src-gen/com/lowcoupling/dotEditor/ui/contentassist/antlr/internal/InternalDot.g:864:1: ( ( ( rule__UnDirectedEdge__Group_3__0 )? ) )
            // ../com.lowcoupling.dotEditor.ui/src-gen/com/lowcoupling/dotEditor/ui/contentassist/antlr/internal/InternalDot.g:865:1: ( ( rule__UnDirectedEdge__Group_3__0 )? )
            {
            // ../com.lowcoupling.dotEditor.ui/src-gen/com/lowcoupling/dotEditor/ui/contentassist/antlr/internal/InternalDot.g:865:1: ( ( rule__UnDirectedEdge__Group_3__0 )? )
            // ../com.lowcoupling.dotEditor.ui/src-gen/com/lowcoupling/dotEditor/ui/contentassist/antlr/internal/InternalDot.g:866:1: ( rule__UnDirectedEdge__Group_3__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnDirectedEdgeAccess().getGroup_3()); 
            }
            // ../com.lowcoupling.dotEditor.ui/src-gen/com/lowcoupling/dotEditor/ui/contentassist/antlr/internal/InternalDot.g:867:1: ( rule__UnDirectedEdge__Group_3__0 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==17) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../com.lowcoupling.dotEditor.ui/src-gen/com/lowcoupling/dotEditor/ui/contentassist/antlr/internal/InternalDot.g:867:2: rule__UnDirectedEdge__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__UnDirectedEdge__Group_3__0_in_rule__UnDirectedEdge__Group__3__Impl1692);
                    rule__UnDirectedEdge__Group_3__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getUnDirectedEdgeAccess().getGroup_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnDirectedEdge__Group__3__Impl"


    // $ANTLR start "rule__UnDirectedEdge__Group_3__0"
    // ../com.lowcoupling.dotEditor.ui/src-gen/com/lowcoupling/dotEditor/ui/contentassist/antlr/internal/InternalDot.g:885:1: rule__UnDirectedEdge__Group_3__0 : rule__UnDirectedEdge__Group_3__0__Impl rule__UnDirectedEdge__Group_3__1 ;
    public final void rule__UnDirectedEdge__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.dotEditor.ui/src-gen/com/lowcoupling/dotEditor/ui/contentassist/antlr/internal/InternalDot.g:889:1: ( rule__UnDirectedEdge__Group_3__0__Impl rule__UnDirectedEdge__Group_3__1 )
            // ../com.lowcoupling.dotEditor.ui/src-gen/com/lowcoupling/dotEditor/ui/contentassist/antlr/internal/InternalDot.g:890:2: rule__UnDirectedEdge__Group_3__0__Impl rule__UnDirectedEdge__Group_3__1
            {
            pushFollow(FOLLOW_rule__UnDirectedEdge__Group_3__0__Impl_in_rule__UnDirectedEdge__Group_3__01731);
            rule__UnDirectedEdge__Group_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__UnDirectedEdge__Group_3__1_in_rule__UnDirectedEdge__Group_3__01734);
            rule__UnDirectedEdge__Group_3__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnDirectedEdge__Group_3__0"


    // $ANTLR start "rule__UnDirectedEdge__Group_3__0__Impl"
    // ../com.lowcoupling.dotEditor.ui/src-gen/com/lowcoupling/dotEditor/ui/contentassist/antlr/internal/InternalDot.g:897:1: rule__UnDirectedEdge__Group_3__0__Impl : ( '[' ) ;
    public final void rule__UnDirectedEdge__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.dotEditor.ui/src-gen/com/lowcoupling/dotEditor/ui/contentassist/antlr/internal/InternalDot.g:901:1: ( ( '[' ) )
            // ../com.lowcoupling.dotEditor.ui/src-gen/com/lowcoupling/dotEditor/ui/contentassist/antlr/internal/InternalDot.g:902:1: ( '[' )
            {
            // ../com.lowcoupling.dotEditor.ui/src-gen/com/lowcoupling/dotEditor/ui/contentassist/antlr/internal/InternalDot.g:902:1: ( '[' )
            // ../com.lowcoupling.dotEditor.ui/src-gen/com/lowcoupling/dotEditor/ui/contentassist/antlr/internal/InternalDot.g:903:1: '['
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnDirectedEdgeAccess().getLeftSquareBracketKeyword_3_0()); 
            }
            match(input,17,FOLLOW_17_in_rule__UnDirectedEdge__Group_3__0__Impl1762); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getUnDirectedEdgeAccess().getLeftSquareBracketKeyword_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnDirectedEdge__Group_3__0__Impl"


    // $ANTLR start "rule__UnDirectedEdge__Group_3__1"
    // ../com.lowcoupling.dotEditor.ui/src-gen/com/lowcoupling/dotEditor/ui/contentassist/antlr/internal/InternalDot.g:916:1: rule__UnDirectedEdge__Group_3__1 : rule__UnDirectedEdge__Group_3__1__Impl rule__UnDirectedEdge__Group_3__2 ;
    public final void rule__UnDirectedEdge__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.dotEditor.ui/src-gen/com/lowcoupling/dotEditor/ui/contentassist/antlr/internal/InternalDot.g:920:1: ( rule__UnDirectedEdge__Group_3__1__Impl rule__UnDirectedEdge__Group_3__2 )
            // ../com.lowcoupling.dotEditor.ui/src-gen/com/lowcoupling/dotEditor/ui/contentassist/antlr/internal/InternalDot.g:921:2: rule__UnDirectedEdge__Group_3__1__Impl rule__UnDirectedEdge__Group_3__2
            {
            pushFollow(FOLLOW_rule__UnDirectedEdge__Group_3__1__Impl_in_rule__UnDirectedEdge__Group_3__11793);
            rule__UnDirectedEdge__Group_3__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__UnDirectedEdge__Group_3__2_in_rule__UnDirectedEdge__Group_3__11796);
            rule__UnDirectedEdge__Group_3__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnDirectedEdge__Group_3__1"


    // $ANTLR start "rule__UnDirectedEdge__Group_3__1__Impl"
    // ../com.lowcoupling.dotEditor.ui/src-gen/com/lowcoupling/dotEditor/ui/contentassist/antlr/internal/InternalDot.g:928:1: rule__UnDirectedEdge__Group_3__1__Impl : ( ( rule__UnDirectedEdge__AttributesAssignment_3_1 )* ) ;
    public final void rule__UnDirectedEdge__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.dotEditor.ui/src-gen/com/lowcoupling/dotEditor/ui/contentassist/antlr/internal/InternalDot.g:932:1: ( ( ( rule__UnDirectedEdge__AttributesAssignment_3_1 )* ) )
            // ../com.lowcoupling.dotEditor.ui/src-gen/com/lowcoupling/dotEditor/ui/contentassist/antlr/internal/InternalDot.g:933:1: ( ( rule__UnDirectedEdge__AttributesAssignment_3_1 )* )
            {
            // ../com.lowcoupling.dotEditor.ui/src-gen/com/lowcoupling/dotEditor/ui/contentassist/antlr/internal/InternalDot.g:933:1: ( ( rule__UnDirectedEdge__AttributesAssignment_3_1 )* )
            // ../com.lowcoupling.dotEditor.ui/src-gen/com/lowcoupling/dotEditor/ui/contentassist/antlr/internal/InternalDot.g:934:1: ( rule__UnDirectedEdge__AttributesAssignment_3_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnDirectedEdgeAccess().getAttributesAssignment_3_1()); 
            }
            // ../com.lowcoupling.dotEditor.ui/src-gen/com/lowcoupling/dotEditor/ui/contentassist/antlr/internal/InternalDot.g:935:1: ( rule__UnDirectedEdge__AttributesAssignment_3_1 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==20) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../com.lowcoupling.dotEditor.ui/src-gen/com/lowcoupling/dotEditor/ui/contentassist/antlr/internal/InternalDot.g:935:2: rule__UnDirectedEdge__AttributesAssignment_3_1
            	    {
            	    pushFollow(FOLLOW_rule__UnDirectedEdge__AttributesAssignment_3_1_in_rule__UnDirectedEdge__Group_3__1__Impl1823);
            	    rule__UnDirectedEdge__AttributesAssignment_3_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getUnDirectedEdgeAccess().getAttributesAssignment_3_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnDirectedEdge__Group_3__1__Impl"


    // $ANTLR start "rule__UnDirectedEdge__Group_3__2"
    // ../com.lowcoupling.dotEditor.ui/src-gen/com/lowcoupling/dotEditor/ui/contentassist/antlr/internal/InternalDot.g:945:1: rule__UnDirectedEdge__Group_3__2 : rule__UnDirectedEdge__Group_3__2__Impl ;
    public final void rule__UnDirectedEdge__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.dotEditor.ui/src-gen/com/lowcoupling/dotEditor/ui/contentassist/antlr/internal/InternalDot.g:949:1: ( rule__UnDirectedEdge__Group_3__2__Impl )
            // ../com.lowcoupling.dotEditor.ui/src-gen/com/lowcoupling/dotEditor/ui/contentassist/antlr/internal/InternalDot.g:950:2: rule__UnDirectedEdge__Group_3__2__Impl
            {
            pushFollow(FOLLOW_rule__UnDirectedEdge__Group_3__2__Impl_in_rule__UnDirectedEdge__Group_3__21854);
            rule__UnDirectedEdge__Group_3__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnDirectedEdge__Group_3__2"


    // $ANTLR start "rule__UnDirectedEdge__Group_3__2__Impl"
    // ../com.lowcoupling.dotEditor.ui/src-gen/com/lowcoupling/dotEditor/ui/contentassist/antlr/internal/InternalDot.g:956:1: rule__UnDirectedEdge__Group_3__2__Impl : ( ']' ) ;
    public final void rule__UnDirectedEdge__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.dotEditor.ui/src-gen/com/lowcoupling/dotEditor/ui/contentassist/antlr/internal/InternalDot.g:960:1: ( ( ']' ) )
            // ../com.lowcoupling.dotEditor.ui/src-gen/com/lowcoupling/dotEditor/ui/contentassist/antlr/internal/InternalDot.g:961:1: ( ']' )
            {
            // ../com.lowcoupling.dotEditor.ui/src-gen/com/lowcoupling/dotEditor/ui/contentassist/antlr/internal/InternalDot.g:961:1: ( ']' )
            // ../com.lowcoupling.dotEditor.ui/src-gen/com/lowcoupling/dotEditor/ui/contentassist/antlr/internal/InternalDot.g:962:1: ']'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnDirectedEdgeAccess().getRightSquareBracketKeyword_3_2()); 
            }
            match(input,18,FOLLOW_18_in_rule__UnDirectedEdge__Group_3__2__Impl1882); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getUnDirectedEdgeAccess().getRightSquareBracketKeyword_3_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnDirectedEdge__Group_3__2__Impl"


    // $ANTLR start "rule__DirectedEdge__Group__0"
    // ../com.lowcoupling.dotEditor.ui/src-gen/com/lowcoupling/dotEditor/ui/contentassist/antlr/internal/InternalDot.g:981:1: rule__DirectedEdge__Group__0 : rule__DirectedEdge__Group__0__Impl rule__DirectedEdge__Group__1 ;
    public final void rule__DirectedEdge__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.dotEditor.ui/src-gen/com/lowcoupling/dotEditor/ui/contentassist/antlr/internal/InternalDot.g:985:1: ( rule__DirectedEdge__Group__0__Impl rule__DirectedEdge__Group__1 )
            // ../com.lowcoupling.dotEditor.ui/src-gen/com/lowcoupling/dotEditor/ui/contentassist/antlr/internal/InternalDot.g:986:2: rule__DirectedEdge__Group__0__Impl rule__DirectedEdge__Group__1
            {
            pushFollow(FOLLOW_rule__DirectedEdge__Group__0__Impl_in_rule__DirectedEdge__Group__01919);
            rule__DirectedEdge__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__DirectedEdge__Group__1_in_rule__DirectedEdge__Group__01922);
            rule__DirectedEdge__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DirectedEdge__Group__0"


    // $ANTLR start "rule__DirectedEdge__Group__0__Impl"
    // ../com.lowcoupling.dotEditor.ui/src-gen/com/lowcoupling/dotEditor/ui/contentassist/antlr/internal/InternalDot.g:993:1: rule__DirectedEdge__Group__0__Impl : ( ( rule__DirectedEdge__SrcAssignment_0 ) ) ;
    public final void rule__DirectedEdge__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.dotEditor.ui/src-gen/com/lowcoupling/dotEditor/ui/contentassist/antlr/internal/InternalDot.g:997:1: ( ( ( rule__DirectedEdge__SrcAssignment_0 ) ) )
            // ../com.lowcoupling.dotEditor.ui/src-gen/com/lowcoupling/dotEditor/ui/contentassist/antlr/internal/InternalDot.g:998:1: ( ( rule__DirectedEdge__SrcAssignment_0 ) )
            {
            // ../com.lowcoupling.dotEditor.ui/src-gen/com/lowcoupling/dotEditor/ui/contentassist/antlr/internal/InternalDot.g:998:1: ( ( rule__DirectedEdge__SrcAssignment_0 ) )
            // ../com.lowcoupling.dotEditor.ui/src-gen/com/lowcoupling/dotEditor/ui/contentassist/antlr/internal/InternalDot.g:999:1: ( rule__DirectedEdge__SrcAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDirectedEdgeAccess().getSrcAssignment_0()); 
            }
            // ../com.lowcoupling.dotEditor.ui/src-gen/com/lowcoupling/dotEditor/ui/contentassist/antlr/internal/InternalDot.g:1000:1: ( rule__DirectedEdge__SrcAssignment_0 )
            // ../com.lowcoupling.dotEditor.ui/src-gen/com/lowcoupling/dotEditor/ui/contentassist/antlr/internal/InternalDot.g:1000:2: rule__DirectedEdge__SrcAssignment_0
            {
            pushFollow(FOLLOW_rule__DirectedEdge__SrcAssignment_0_in_rule__DirectedEdge__Group__0__Impl1949);
            rule__DirectedEdge__SrcAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDirectedEdgeAccess().getSrcAssignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DirectedEdge__Group__0__Impl"


    // $ANTLR start "rule__DirectedEdge__Group__1"
    // ../com.lowcoupling.dotEditor.ui/src-gen/com/lowcoupling/dotEditor/ui/contentassist/antlr/internal/InternalDot.g:1010:1: rule__DirectedEdge__Group__1 : rule__DirectedEdge__Group__1__Impl rule__DirectedEdge__Group__2 ;
    public final void rule__DirectedEdge__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.dotEditor.ui/src-gen/com/lowcoupling/dotEditor/ui/contentassist/antlr/internal/InternalDot.g:1014:1: ( rule__DirectedEdge__Group__1__Impl rule__DirectedEdge__Group__2 )
            // ../com.lowcoupling.dotEditor.ui/src-gen/com/lowcoupling/dotEditor/ui/contentassist/antlr/internal/InternalDot.g:1015:2: rule__DirectedEdge__Group__1__Impl rule__DirectedEdge__Group__2
            {
            pushFollow(FOLLOW_rule__DirectedEdge__Group__1__Impl_in_rule__DirectedEdge__Group__11979);
            rule__DirectedEdge__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__DirectedEdge__Group__2_in_rule__DirectedEdge__Group__11982);
            rule__DirectedEdge__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DirectedEdge__Group__1"


    // $ANTLR start "rule__DirectedEdge__Group__1__Impl"
    // ../com.lowcoupling.dotEditor.ui/src-gen/com/lowcoupling/dotEditor/ui/contentassist/antlr/internal/InternalDot.g:1022:1: rule__DirectedEdge__Group__1__Impl : ( '->' ) ;
    public final void rule__DirectedEdge__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.dotEditor.ui/src-gen/com/lowcoupling/dotEditor/ui/contentassist/antlr/internal/InternalDot.g:1026:1: ( ( '->' ) )
            // ../com.lowcoupling.dotEditor.ui/src-gen/com/lowcoupling/dotEditor/ui/contentassist/antlr/internal/InternalDot.g:1027:1: ( '->' )
            {
            // ../com.lowcoupling.dotEditor.ui/src-gen/com/lowcoupling/dotEditor/ui/contentassist/antlr/internal/InternalDot.g:1027:1: ( '->' )
            // ../com.lowcoupling.dotEditor.ui/src-gen/com/lowcoupling/dotEditor/ui/contentassist/antlr/internal/InternalDot.g:1028:1: '->'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDirectedEdgeAccess().getHyphenMinusGreaterThanSignKeyword_1()); 
            }
            match(input,19,FOLLOW_19_in_rule__DirectedEdge__Group__1__Impl2010); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDirectedEdgeAccess().getHyphenMinusGreaterThanSignKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DirectedEdge__Group__1__Impl"


    // $ANTLR start "rule__DirectedEdge__Group__2"
    // ../com.lowcoupling.dotEditor.ui/src-gen/com/lowcoupling/dotEditor/ui/contentassist/antlr/internal/InternalDot.g:1041:1: rule__DirectedEdge__Group__2 : rule__DirectedEdge__Group__2__Impl rule__DirectedEdge__Group__3 ;
    public final void rule__DirectedEdge__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.dotEditor.ui/src-gen/com/lowcoupling/dotEditor/ui/contentassist/antlr/internal/InternalDot.g:1045:1: ( rule__DirectedEdge__Group__2__Impl rule__DirectedEdge__Group__3 )
            // ../com.lowcoupling.dotEditor.ui/src-gen/com/lowcoupling/dotEditor/ui/contentassist/antlr/internal/InternalDot.g:1046:2: rule__DirectedEdge__Group__2__Impl rule__DirectedEdge__Group__3
            {
            pushFollow(FOLLOW_rule__DirectedEdge__Group__2__Impl_in_rule__DirectedEdge__Group__22041);
            rule__DirectedEdge__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__DirectedEdge__Group__3_in_rule__DirectedEdge__Group__22044);
            rule__DirectedEdge__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DirectedEdge__Group__2"


    // $ANTLR start "rule__DirectedEdge__Group__2__Impl"
    // ../com.lowcoupling.dotEditor.ui/src-gen/com/lowcoupling/dotEditor/ui/contentassist/antlr/internal/InternalDot.g:1053:1: rule__DirectedEdge__Group__2__Impl : ( ( rule__DirectedEdge__TgtAssignment_2 ) ) ;
    public final void rule__DirectedEdge__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.dotEditor.ui/src-gen/com/lowcoupling/dotEditor/ui/contentassist/antlr/internal/InternalDot.g:1057:1: ( ( ( rule__DirectedEdge__TgtAssignment_2 ) ) )
            // ../com.lowcoupling.dotEditor.ui/src-gen/com/lowcoupling/dotEditor/ui/contentassist/antlr/internal/InternalDot.g:1058:1: ( ( rule__DirectedEdge__TgtAssignment_2 ) )
            {
            // ../com.lowcoupling.dotEditor.ui/src-gen/com/lowcoupling/dotEditor/ui/contentassist/antlr/internal/InternalDot.g:1058:1: ( ( rule__DirectedEdge__TgtAssignment_2 ) )
            // ../com.lowcoupling.dotEditor.ui/src-gen/com/lowcoupling/dotEditor/ui/contentassist/antlr/internal/InternalDot.g:1059:1: ( rule__DirectedEdge__TgtAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDirectedEdgeAccess().getTgtAssignment_2()); 
            }
            // ../com.lowcoupling.dotEditor.ui/src-gen/com/lowcoupling/dotEditor/ui/contentassist/antlr/internal/InternalDot.g:1060:1: ( rule__DirectedEdge__TgtAssignment_2 )
            // ../com.lowcoupling.dotEditor.ui/src-gen/com/lowcoupling/dotEditor/ui/contentassist/antlr/internal/InternalDot.g:1060:2: rule__DirectedEdge__TgtAssignment_2
            {
            pushFollow(FOLLOW_rule__DirectedEdge__TgtAssignment_2_in_rule__DirectedEdge__Group__2__Impl2071);
            rule__DirectedEdge__TgtAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDirectedEdgeAccess().getTgtAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DirectedEdge__Group__2__Impl"


    // $ANTLR start "rule__DirectedEdge__Group__3"
    // ../com.lowcoupling.dotEditor.ui/src-gen/com/lowcoupling/dotEditor/ui/contentassist/antlr/internal/InternalDot.g:1070:1: rule__DirectedEdge__Group__3 : rule__DirectedEdge__Group__3__Impl ;
    public final void rule__DirectedEdge__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.dotEditor.ui/src-gen/com/lowcoupling/dotEditor/ui/contentassist/antlr/internal/InternalDot.g:1074:1: ( rule__DirectedEdge__Group__3__Impl )
            // ../com.lowcoupling.dotEditor.ui/src-gen/com/lowcoupling/dotEditor/ui/contentassist/antlr/internal/InternalDot.g:1075:2: rule__DirectedEdge__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__DirectedEdge__Group__3__Impl_in_rule__DirectedEdge__Group__32101);
            rule__DirectedEdge__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DirectedEdge__Group__3"


    // $ANTLR start "rule__DirectedEdge__Group__3__Impl"
    // ../com.lowcoupling.dotEditor.ui/src-gen/com/lowcoupling/dotEditor/ui/contentassist/antlr/internal/InternalDot.g:1081:1: rule__DirectedEdge__Group__3__Impl : ( ( rule__DirectedEdge__Group_3__0 )? ) ;
    public final void rule__DirectedEdge__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.dotEditor.ui/src-gen/com/lowcoupling/dotEditor/ui/contentassist/antlr/internal/InternalDot.g:1085:1: ( ( ( rule__DirectedEdge__Group_3__0 )? ) )
            // ../com.lowcoupling.dotEditor.ui/src-gen/com/lowcoupling/dotEditor/ui/contentassist/antlr/internal/InternalDot.g:1086:1: ( ( rule__DirectedEdge__Group_3__0 )? )
            {
            // ../com.lowcoupling.dotEditor.ui/src-gen/com/lowcoupling/dotEditor/ui/contentassist/antlr/internal/InternalDot.g:1086:1: ( ( rule__DirectedEdge__Group_3__0 )? )
            // ../com.lowcoupling.dotEditor.ui/src-gen/com/lowcoupling/dotEditor/ui/contentassist/antlr/internal/InternalDot.g:1087:1: ( rule__DirectedEdge__Group_3__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDirectedEdgeAccess().getGroup_3()); 
            }
            // ../com.lowcoupling.dotEditor.ui/src-gen/com/lowcoupling/dotEditor/ui/contentassist/antlr/internal/InternalDot.g:1088:1: ( rule__DirectedEdge__Group_3__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==17) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../com.lowcoupling.dotEditor.ui/src-gen/com/lowcoupling/dotEditor/ui/contentassist/antlr/internal/InternalDot.g:1088:2: rule__DirectedEdge__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__DirectedEdge__Group_3__0_in_rule__DirectedEdge__Group__3__Impl2128);
                    rule__DirectedEdge__Group_3__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDirectedEdgeAccess().getGroup_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DirectedEdge__Group__3__Impl"


    // $ANTLR start "rule__DirectedEdge__Group_3__0"
    // ../com.lowcoupling.dotEditor.ui/src-gen/com/lowcoupling/dotEditor/ui/contentassist/antlr/internal/InternalDot.g:1106:1: rule__DirectedEdge__Group_3__0 : rule__DirectedEdge__Group_3__0__Impl rule__DirectedEdge__Group_3__1 ;
    public final void rule__DirectedEdge__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.dotEditor.ui/src-gen/com/lowcoupling/dotEditor/ui/contentassist/antlr/internal/InternalDot.g:1110:1: ( rule__DirectedEdge__Group_3__0__Impl rule__DirectedEdge__Group_3__1 )
            // ../com.lowcoupling.dotEditor.ui/src-gen/com/lowcoupling/dotEditor/ui/contentassist/antlr/internal/InternalDot.g:1111:2: rule__DirectedEdge__Group_3__0__Impl rule__DirectedEdge__Group_3__1
            {
            pushFollow(FOLLOW_rule__DirectedEdge__Group_3__0__Impl_in_rule__DirectedEdge__Group_3__02167);
            rule__DirectedEdge__Group_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__DirectedEdge__Group_3__1_in_rule__DirectedEdge__Group_3__02170);
            rule__DirectedEdge__Group_3__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DirectedEdge__Group_3__0"


    // $ANTLR start "rule__DirectedEdge__Group_3__0__Impl"
    // ../com.lowcoupling.dotEditor.ui/src-gen/com/lowcoupling/dotEditor/ui/contentassist/antlr/internal/InternalDot.g:1118:1: rule__DirectedEdge__Group_3__0__Impl : ( '[' ) ;
    public final void rule__DirectedEdge__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.dotEditor.ui/src-gen/com/lowcoupling/dotEditor/ui/contentassist/antlr/internal/InternalDot.g:1122:1: ( ( '[' ) )
            // ../com.lowcoupling.dotEditor.ui/src-gen/com/lowcoupling/dotEditor/ui/contentassist/antlr/internal/InternalDot.g:1123:1: ( '[' )
            {
            // ../com.lowcoupling.dotEditor.ui/src-gen/com/lowcoupling/dotEditor/ui/contentassist/antlr/internal/InternalDot.g:1123:1: ( '[' )
            // ../com.lowcoupling.dotEditor.ui/src-gen/com/lowcoupling/dotEditor/ui/contentassist/antlr/internal/InternalDot.g:1124:1: '['
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDirectedEdgeAccess().getLeftSquareBracketKeyword_3_0()); 
            }
            match(input,17,FOLLOW_17_in_rule__DirectedEdge__Group_3__0__Impl2198); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDirectedEdgeAccess().getLeftSquareBracketKeyword_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DirectedEdge__Group_3__0__Impl"


    // $ANTLR start "rule__DirectedEdge__Group_3__1"
    // ../com.lowcoupling.dotEditor.ui/src-gen/com/lowcoupling/dotEditor/ui/contentassist/antlr/internal/InternalDot.g:1137:1: rule__DirectedEdge__Group_3__1 : rule__DirectedEdge__Group_3__1__Impl rule__DirectedEdge__Group_3__2 ;
    public final void rule__DirectedEdge__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.dotEditor.ui/src-gen/com/lowcoupling/dotEditor/ui/contentassist/antlr/internal/InternalDot.g:1141:1: ( rule__DirectedEdge__Group_3__1__Impl rule__DirectedEdge__Group_3__2 )
            // ../com.lowcoupling.dotEditor.ui/src-gen/com/lowcoupling/dotEditor/ui/contentassist/antlr/internal/InternalDot.g:1142:2: rule__DirectedEdge__Group_3__1__Impl rule__DirectedEdge__Group_3__2
            {
            pushFollow(FOLLOW_rule__DirectedEdge__Group_3__1__Impl_in_rule__DirectedEdge__Group_3__12229);
            rule__DirectedEdge__Group_3__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__DirectedEdge__Group_3__2_in_rule__DirectedEdge__Group_3__12232);
            rule__DirectedEdge__Group_3__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DirectedEdge__Group_3__1"


    // $ANTLR start "rule__DirectedEdge__Group_3__1__Impl"
    // ../com.lowcoupling.dotEditor.ui/src-gen/com/lowcoupling/dotEditor/ui/contentassist/antlr/internal/InternalDot.g:1149:1: rule__DirectedEdge__Group_3__1__Impl : ( ( ( rule__DirectedEdge__AttributesAssignment_3_1 ) ) ( ( rule__DirectedEdge__AttributesAssignment_3_1 )* ) ) ;
    public final void rule__DirectedEdge__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.dotEditor.ui/src-gen/com/lowcoupling/dotEditor/ui/contentassist/antlr/internal/InternalDot.g:1153:1: ( ( ( ( rule__DirectedEdge__AttributesAssignment_3_1 ) ) ( ( rule__DirectedEdge__AttributesAssignment_3_1 )* ) ) )
            // ../com.lowcoupling.dotEditor.ui/src-gen/com/lowcoupling/dotEditor/ui/contentassist/antlr/internal/InternalDot.g:1154:1: ( ( ( rule__DirectedEdge__AttributesAssignment_3_1 ) ) ( ( rule__DirectedEdge__AttributesAssignment_3_1 )* ) )
            {
            // ../com.lowcoupling.dotEditor.ui/src-gen/com/lowcoupling/dotEditor/ui/contentassist/antlr/internal/InternalDot.g:1154:1: ( ( ( rule__DirectedEdge__AttributesAssignment_3_1 ) ) ( ( rule__DirectedEdge__AttributesAssignment_3_1 )* ) )
            // ../com.lowcoupling.dotEditor.ui/src-gen/com/lowcoupling/dotEditor/ui/contentassist/antlr/internal/InternalDot.g:1155:1: ( ( rule__DirectedEdge__AttributesAssignment_3_1 ) ) ( ( rule__DirectedEdge__AttributesAssignment_3_1 )* )
            {
            // ../com.lowcoupling.dotEditor.ui/src-gen/com/lowcoupling/dotEditor/ui/contentassist/antlr/internal/InternalDot.g:1155:1: ( ( rule__DirectedEdge__AttributesAssignment_3_1 ) )
            // ../com.lowcoupling.dotEditor.ui/src-gen/com/lowcoupling/dotEditor/ui/contentassist/antlr/internal/InternalDot.g:1156:1: ( rule__DirectedEdge__AttributesAssignment_3_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDirectedEdgeAccess().getAttributesAssignment_3_1()); 
            }
            // ../com.lowcoupling.dotEditor.ui/src-gen/com/lowcoupling/dotEditor/ui/contentassist/antlr/internal/InternalDot.g:1157:1: ( rule__DirectedEdge__AttributesAssignment_3_1 )
            // ../com.lowcoupling.dotEditor.ui/src-gen/com/lowcoupling/dotEditor/ui/contentassist/antlr/internal/InternalDot.g:1157:2: rule__DirectedEdge__AttributesAssignment_3_1
            {
            pushFollow(FOLLOW_rule__DirectedEdge__AttributesAssignment_3_1_in_rule__DirectedEdge__Group_3__1__Impl2261);
            rule__DirectedEdge__AttributesAssignment_3_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDirectedEdgeAccess().getAttributesAssignment_3_1()); 
            }

            }

            // ../com.lowcoupling.dotEditor.ui/src-gen/com/lowcoupling/dotEditor/ui/contentassist/antlr/internal/InternalDot.g:1160:1: ( ( rule__DirectedEdge__AttributesAssignment_3_1 )* )
            // ../com.lowcoupling.dotEditor.ui/src-gen/com/lowcoupling/dotEditor/ui/contentassist/antlr/internal/InternalDot.g:1161:1: ( rule__DirectedEdge__AttributesAssignment_3_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDirectedEdgeAccess().getAttributesAssignment_3_1()); 
            }
            // ../com.lowcoupling.dotEditor.ui/src-gen/com/lowcoupling/dotEditor/ui/contentassist/antlr/internal/InternalDot.g:1162:1: ( rule__DirectedEdge__AttributesAssignment_3_1 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==20) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../com.lowcoupling.dotEditor.ui/src-gen/com/lowcoupling/dotEditor/ui/contentassist/antlr/internal/InternalDot.g:1162:2: rule__DirectedEdge__AttributesAssignment_3_1
            	    {
            	    pushFollow(FOLLOW_rule__DirectedEdge__AttributesAssignment_3_1_in_rule__DirectedEdge__Group_3__1__Impl2273);
            	    rule__DirectedEdge__AttributesAssignment_3_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDirectedEdgeAccess().getAttributesAssignment_3_1()); 
            }

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DirectedEdge__Group_3__1__Impl"


    // $ANTLR start "rule__DirectedEdge__Group_3__2"
    // ../com.lowcoupling.dotEditor.ui/src-gen/com/lowcoupling/dotEditor/ui/contentassist/antlr/internal/InternalDot.g:1173:1: rule__DirectedEdge__Group_3__2 : rule__DirectedEdge__Group_3__2__Impl ;
    public final void rule__DirectedEdge__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.dotEditor.ui/src-gen/com/lowcoupling/dotEditor/ui/contentassist/antlr/internal/InternalDot.g:1177:1: ( rule__DirectedEdge__Group_3__2__Impl )
            // ../com.lowcoupling.dotEditor.ui/src-gen/com/lowcoupling/dotEditor/ui/contentassist/antlr/internal/InternalDot.g:1178:2: rule__DirectedEdge__Group_3__2__Impl
            {
            pushFollow(FOLLOW_rule__DirectedEdge__Group_3__2__Impl_in_rule__DirectedEdge__Group_3__22306);
            rule__DirectedEdge__Group_3__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DirectedEdge__Group_3__2"


    // $ANTLR start "rule__DirectedEdge__Group_3__2__Impl"
    // ../com.lowcoupling.dotEditor.ui/src-gen/com/lowcoupling/dotEditor/ui/contentassist/antlr/internal/InternalDot.g:1184:1: rule__DirectedEdge__Group_3__2__Impl : ( ']' ) ;
    public final void rule__DirectedEdge__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.dotEditor.ui/src-gen/com/lowcoupling/dotEditor/ui/contentassist/antlr/internal/InternalDot.g:1188:1: ( ( ']' ) )
            // ../com.lowcoupling.dotEditor.ui/src-gen/com/lowcoupling/dotEditor/ui/contentassist/antlr/internal/InternalDot.g:1189:1: ( ']' )
            {
            // ../com.lowcoupling.dotEditor.ui/src-gen/com/lowcoupling/dotEditor/ui/contentassist/antlr/internal/InternalDot.g:1189:1: ( ']' )
            // ../com.lowcoupling.dotEditor.ui/src-gen/com/lowcoupling/dotEditor/ui/contentassist/antlr/internal/InternalDot.g:1190:1: ']'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDirectedEdgeAccess().getRightSquareBracketKeyword_3_2()); 
            }
            match(input,18,FOLLOW_18_in_rule__DirectedEdge__Group_3__2__Impl2334); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDirectedEdgeAccess().getRightSquareBracketKeyword_3_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DirectedEdge__Group_3__2__Impl"


    // $ANTLR start "rule__Attribute__Group__0"
    // ../com.lowcoupling.dotEditor.ui/src-gen/com/lowcoupling/dotEditor/ui/contentassist/antlr/internal/InternalDot.g:1209:1: rule__Attribute__Group__0 : rule__Attribute__Group__0__Impl rule__Attribute__Group__1 ;
    public final void rule__Attribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.dotEditor.ui/src-gen/com/lowcoupling/dotEditor/ui/contentassist/antlr/internal/InternalDot.g:1213:1: ( rule__Attribute__Group__0__Impl rule__Attribute__Group__1 )
            // ../com.lowcoupling.dotEditor.ui/src-gen/com/lowcoupling/dotEditor/ui/contentassist/antlr/internal/InternalDot.g:1214:2: rule__Attribute__Group__0__Impl rule__Attribute__Group__1
            {
            pushFollow(FOLLOW_rule__Attribute__Group__0__Impl_in_rule__Attribute__Group__02371);
            rule__Attribute__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Attribute__Group__1_in_rule__Attribute__Group__02374);
            rule__Attribute__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__0"


    // $ANTLR start "rule__Attribute__Group__0__Impl"
    // ../com.lowcoupling.dotEditor.ui/src-gen/com/lowcoupling/dotEditor/ui/contentassist/antlr/internal/InternalDot.g:1221:1: rule__Attribute__Group__0__Impl : ( 'weight' ) ;
    public final void rule__Attribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.dotEditor.ui/src-gen/com/lowcoupling/dotEditor/ui/contentassist/antlr/internal/InternalDot.g:1225:1: ( ( 'weight' ) )
            // ../com.lowcoupling.dotEditor.ui/src-gen/com/lowcoupling/dotEditor/ui/contentassist/antlr/internal/InternalDot.g:1226:1: ( 'weight' )
            {
            // ../com.lowcoupling.dotEditor.ui/src-gen/com/lowcoupling/dotEditor/ui/contentassist/antlr/internal/InternalDot.g:1226:1: ( 'weight' )
            // ../com.lowcoupling.dotEditor.ui/src-gen/com/lowcoupling/dotEditor/ui/contentassist/antlr/internal/InternalDot.g:1227:1: 'weight'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeAccess().getWeightKeyword_0()); 
            }
            match(input,20,FOLLOW_20_in_rule__Attribute__Group__0__Impl2402); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributeAccess().getWeightKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__0__Impl"


    // $ANTLR start "rule__Attribute__Group__1"
    // ../com.lowcoupling.dotEditor.ui/src-gen/com/lowcoupling/dotEditor/ui/contentassist/antlr/internal/InternalDot.g:1240:1: rule__Attribute__Group__1 : rule__Attribute__Group__1__Impl rule__Attribute__Group__2 ;
    public final void rule__Attribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.dotEditor.ui/src-gen/com/lowcoupling/dotEditor/ui/contentassist/antlr/internal/InternalDot.g:1244:1: ( rule__Attribute__Group__1__Impl rule__Attribute__Group__2 )
            // ../com.lowcoupling.dotEditor.ui/src-gen/com/lowcoupling/dotEditor/ui/contentassist/antlr/internal/InternalDot.g:1245:2: rule__Attribute__Group__1__Impl rule__Attribute__Group__2
            {
            pushFollow(FOLLOW_rule__Attribute__Group__1__Impl_in_rule__Attribute__Group__12433);
            rule__Attribute__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Attribute__Group__2_in_rule__Attribute__Group__12436);
            rule__Attribute__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__1"


    // $ANTLR start "rule__Attribute__Group__1__Impl"
    // ../com.lowcoupling.dotEditor.ui/src-gen/com/lowcoupling/dotEditor/ui/contentassist/antlr/internal/InternalDot.g:1252:1: rule__Attribute__Group__1__Impl : ( '=' ) ;
    public final void rule__Attribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.dotEditor.ui/src-gen/com/lowcoupling/dotEditor/ui/contentassist/antlr/internal/InternalDot.g:1256:1: ( ( '=' ) )
            // ../com.lowcoupling.dotEditor.ui/src-gen/com/lowcoupling/dotEditor/ui/contentassist/antlr/internal/InternalDot.g:1257:1: ( '=' )
            {
            // ../com.lowcoupling.dotEditor.ui/src-gen/com/lowcoupling/dotEditor/ui/contentassist/antlr/internal/InternalDot.g:1257:1: ( '=' )
            // ../com.lowcoupling.dotEditor.ui/src-gen/com/lowcoupling/dotEditor/ui/contentassist/antlr/internal/InternalDot.g:1258:1: '='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeAccess().getEqualsSignKeyword_1()); 
            }
            match(input,21,FOLLOW_21_in_rule__Attribute__Group__1__Impl2464); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributeAccess().getEqualsSignKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__1__Impl"


    // $ANTLR start "rule__Attribute__Group__2"
    // ../com.lowcoupling.dotEditor.ui/src-gen/com/lowcoupling/dotEditor/ui/contentassist/antlr/internal/InternalDot.g:1271:1: rule__Attribute__Group__2 : rule__Attribute__Group__2__Impl ;
    public final void rule__Attribute__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.dotEditor.ui/src-gen/com/lowcoupling/dotEditor/ui/contentassist/antlr/internal/InternalDot.g:1275:1: ( rule__Attribute__Group__2__Impl )
            // ../com.lowcoupling.dotEditor.ui/src-gen/com/lowcoupling/dotEditor/ui/contentassist/antlr/internal/InternalDot.g:1276:2: rule__Attribute__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Attribute__Group__2__Impl_in_rule__Attribute__Group__22495);
            rule__Attribute__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__2"


    // $ANTLR start "rule__Attribute__Group__2__Impl"
    // ../com.lowcoupling.dotEditor.ui/src-gen/com/lowcoupling/dotEditor/ui/contentassist/antlr/internal/InternalDot.g:1282:1: rule__Attribute__Group__2__Impl : ( ( rule__Attribute__WeightAssignment_2 ) ) ;
    public final void rule__Attribute__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.dotEditor.ui/src-gen/com/lowcoupling/dotEditor/ui/contentassist/antlr/internal/InternalDot.g:1286:1: ( ( ( rule__Attribute__WeightAssignment_2 ) ) )
            // ../com.lowcoupling.dotEditor.ui/src-gen/com/lowcoupling/dotEditor/ui/contentassist/antlr/internal/InternalDot.g:1287:1: ( ( rule__Attribute__WeightAssignment_2 ) )
            {
            // ../com.lowcoupling.dotEditor.ui/src-gen/com/lowcoupling/dotEditor/ui/contentassist/antlr/internal/InternalDot.g:1287:1: ( ( rule__Attribute__WeightAssignment_2 ) )
            // ../com.lowcoupling.dotEditor.ui/src-gen/com/lowcoupling/dotEditor/ui/contentassist/antlr/internal/InternalDot.g:1288:1: ( rule__Attribute__WeightAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeAccess().getWeightAssignment_2()); 
            }
            // ../com.lowcoupling.dotEditor.ui/src-gen/com/lowcoupling/dotEditor/ui/contentassist/antlr/internal/InternalDot.g:1289:1: ( rule__Attribute__WeightAssignment_2 )
            // ../com.lowcoupling.dotEditor.ui/src-gen/com/lowcoupling/dotEditor/ui/contentassist/antlr/internal/InternalDot.g:1289:2: rule__Attribute__WeightAssignment_2
            {
            pushFollow(FOLLOW_rule__Attribute__WeightAssignment_2_in_rule__Attribute__Group__2__Impl2522);
            rule__Attribute__WeightAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributeAccess().getWeightAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__2__Impl"


    // $ANTLR start "rule__GraphModel__GraphAssignment"
    // ../com.lowcoupling.dotEditor.ui/src-gen/com/lowcoupling/dotEditor/ui/contentassist/antlr/internal/InternalDot.g:1308:1: rule__GraphModel__GraphAssignment : ( ruleGraph ) ;
    public final void rule__GraphModel__GraphAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.dotEditor.ui/src-gen/com/lowcoupling/dotEditor/ui/contentassist/antlr/internal/InternalDot.g:1312:1: ( ( ruleGraph ) )
            // ../com.lowcoupling.dotEditor.ui/src-gen/com/lowcoupling/dotEditor/ui/contentassist/antlr/internal/InternalDot.g:1313:1: ( ruleGraph )
            {
            // ../com.lowcoupling.dotEditor.ui/src-gen/com/lowcoupling/dotEditor/ui/contentassist/antlr/internal/InternalDot.g:1313:1: ( ruleGraph )
            // ../com.lowcoupling.dotEditor.ui/src-gen/com/lowcoupling/dotEditor/ui/contentassist/antlr/internal/InternalDot.g:1314:1: ruleGraph
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGraphModelAccess().getGraphGraphParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_ruleGraph_in_rule__GraphModel__GraphAssignment2565);
            ruleGraph();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGraphModelAccess().getGraphGraphParserRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GraphModel__GraphAssignment"


    // $ANTLR start "rule__UndirectedGraph__NameAssignment_1"
    // ../com.lowcoupling.dotEditor.ui/src-gen/com/lowcoupling/dotEditor/ui/contentassist/antlr/internal/InternalDot.g:1323:1: rule__UndirectedGraph__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__UndirectedGraph__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.dotEditor.ui/src-gen/com/lowcoupling/dotEditor/ui/contentassist/antlr/internal/InternalDot.g:1327:1: ( ( RULE_ID ) )
            // ../com.lowcoupling.dotEditor.ui/src-gen/com/lowcoupling/dotEditor/ui/contentassist/antlr/internal/InternalDot.g:1328:1: ( RULE_ID )
            {
            // ../com.lowcoupling.dotEditor.ui/src-gen/com/lowcoupling/dotEditor/ui/contentassist/antlr/internal/InternalDot.g:1328:1: ( RULE_ID )
            // ../com.lowcoupling.dotEditor.ui/src-gen/com/lowcoupling/dotEditor/ui/contentassist/antlr/internal/InternalDot.g:1329:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUndirectedGraphAccess().getNameIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__UndirectedGraph__NameAssignment_12596); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getUndirectedGraphAccess().getNameIDTerminalRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UndirectedGraph__NameAssignment_1"


    // $ANTLR start "rule__UndirectedGraph__EdgeAssignment_3_0"
    // ../com.lowcoupling.dotEditor.ui/src-gen/com/lowcoupling/dotEditor/ui/contentassist/antlr/internal/InternalDot.g:1338:1: rule__UndirectedGraph__EdgeAssignment_3_0 : ( ruleUnDirectedEdge ) ;
    public final void rule__UndirectedGraph__EdgeAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.dotEditor.ui/src-gen/com/lowcoupling/dotEditor/ui/contentassist/antlr/internal/InternalDot.g:1342:1: ( ( ruleUnDirectedEdge ) )
            // ../com.lowcoupling.dotEditor.ui/src-gen/com/lowcoupling/dotEditor/ui/contentassist/antlr/internal/InternalDot.g:1343:1: ( ruleUnDirectedEdge )
            {
            // ../com.lowcoupling.dotEditor.ui/src-gen/com/lowcoupling/dotEditor/ui/contentassist/antlr/internal/InternalDot.g:1343:1: ( ruleUnDirectedEdge )
            // ../com.lowcoupling.dotEditor.ui/src-gen/com/lowcoupling/dotEditor/ui/contentassist/antlr/internal/InternalDot.g:1344:1: ruleUnDirectedEdge
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUndirectedGraphAccess().getEdgeUnDirectedEdgeParserRuleCall_3_0_0()); 
            }
            pushFollow(FOLLOW_ruleUnDirectedEdge_in_rule__UndirectedGraph__EdgeAssignment_3_02627);
            ruleUnDirectedEdge();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getUndirectedGraphAccess().getEdgeUnDirectedEdgeParserRuleCall_3_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UndirectedGraph__EdgeAssignment_3_0"


    // $ANTLR start "rule__DirectedGraph__NameAssignment_1"
    // ../com.lowcoupling.dotEditor.ui/src-gen/com/lowcoupling/dotEditor/ui/contentassist/antlr/internal/InternalDot.g:1353:1: rule__DirectedGraph__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__DirectedGraph__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.dotEditor.ui/src-gen/com/lowcoupling/dotEditor/ui/contentassist/antlr/internal/InternalDot.g:1357:1: ( ( RULE_ID ) )
            // ../com.lowcoupling.dotEditor.ui/src-gen/com/lowcoupling/dotEditor/ui/contentassist/antlr/internal/InternalDot.g:1358:1: ( RULE_ID )
            {
            // ../com.lowcoupling.dotEditor.ui/src-gen/com/lowcoupling/dotEditor/ui/contentassist/antlr/internal/InternalDot.g:1358:1: ( RULE_ID )
            // ../com.lowcoupling.dotEditor.ui/src-gen/com/lowcoupling/dotEditor/ui/contentassist/antlr/internal/InternalDot.g:1359:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDirectedGraphAccess().getNameIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__DirectedGraph__NameAssignment_12658); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDirectedGraphAccess().getNameIDTerminalRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DirectedGraph__NameAssignment_1"


    // $ANTLR start "rule__DirectedGraph__EdgeAssignment_3_0"
    // ../com.lowcoupling.dotEditor.ui/src-gen/com/lowcoupling/dotEditor/ui/contentassist/antlr/internal/InternalDot.g:1368:1: rule__DirectedGraph__EdgeAssignment_3_0 : ( ruleDirectedEdge ) ;
    public final void rule__DirectedGraph__EdgeAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.dotEditor.ui/src-gen/com/lowcoupling/dotEditor/ui/contentassist/antlr/internal/InternalDot.g:1372:1: ( ( ruleDirectedEdge ) )
            // ../com.lowcoupling.dotEditor.ui/src-gen/com/lowcoupling/dotEditor/ui/contentassist/antlr/internal/InternalDot.g:1373:1: ( ruleDirectedEdge )
            {
            // ../com.lowcoupling.dotEditor.ui/src-gen/com/lowcoupling/dotEditor/ui/contentassist/antlr/internal/InternalDot.g:1373:1: ( ruleDirectedEdge )
            // ../com.lowcoupling.dotEditor.ui/src-gen/com/lowcoupling/dotEditor/ui/contentassist/antlr/internal/InternalDot.g:1374:1: ruleDirectedEdge
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDirectedGraphAccess().getEdgeDirectedEdgeParserRuleCall_3_0_0()); 
            }
            pushFollow(FOLLOW_ruleDirectedEdge_in_rule__DirectedGraph__EdgeAssignment_3_02689);
            ruleDirectedEdge();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDirectedGraphAccess().getEdgeDirectedEdgeParserRuleCall_3_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DirectedGraph__EdgeAssignment_3_0"


    // $ANTLR start "rule__UnDirectedEdge__SrcAssignment_0"
    // ../com.lowcoupling.dotEditor.ui/src-gen/com/lowcoupling/dotEditor/ui/contentassist/antlr/internal/InternalDot.g:1383:1: rule__UnDirectedEdge__SrcAssignment_0 : ( ruleNode ) ;
    public final void rule__UnDirectedEdge__SrcAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.dotEditor.ui/src-gen/com/lowcoupling/dotEditor/ui/contentassist/antlr/internal/InternalDot.g:1387:1: ( ( ruleNode ) )
            // ../com.lowcoupling.dotEditor.ui/src-gen/com/lowcoupling/dotEditor/ui/contentassist/antlr/internal/InternalDot.g:1388:1: ( ruleNode )
            {
            // ../com.lowcoupling.dotEditor.ui/src-gen/com/lowcoupling/dotEditor/ui/contentassist/antlr/internal/InternalDot.g:1388:1: ( ruleNode )
            // ../com.lowcoupling.dotEditor.ui/src-gen/com/lowcoupling/dotEditor/ui/contentassist/antlr/internal/InternalDot.g:1389:1: ruleNode
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnDirectedEdgeAccess().getSrcNodeParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleNode_in_rule__UnDirectedEdge__SrcAssignment_02720);
            ruleNode();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getUnDirectedEdgeAccess().getSrcNodeParserRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnDirectedEdge__SrcAssignment_0"


    // $ANTLR start "rule__UnDirectedEdge__TgtAssignment_2"
    // ../com.lowcoupling.dotEditor.ui/src-gen/com/lowcoupling/dotEditor/ui/contentassist/antlr/internal/InternalDot.g:1398:1: rule__UnDirectedEdge__TgtAssignment_2 : ( ruleNode ) ;
    public final void rule__UnDirectedEdge__TgtAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.dotEditor.ui/src-gen/com/lowcoupling/dotEditor/ui/contentassist/antlr/internal/InternalDot.g:1402:1: ( ( ruleNode ) )
            // ../com.lowcoupling.dotEditor.ui/src-gen/com/lowcoupling/dotEditor/ui/contentassist/antlr/internal/InternalDot.g:1403:1: ( ruleNode )
            {
            // ../com.lowcoupling.dotEditor.ui/src-gen/com/lowcoupling/dotEditor/ui/contentassist/antlr/internal/InternalDot.g:1403:1: ( ruleNode )
            // ../com.lowcoupling.dotEditor.ui/src-gen/com/lowcoupling/dotEditor/ui/contentassist/antlr/internal/InternalDot.g:1404:1: ruleNode
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnDirectedEdgeAccess().getTgtNodeParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleNode_in_rule__UnDirectedEdge__TgtAssignment_22751);
            ruleNode();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getUnDirectedEdgeAccess().getTgtNodeParserRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnDirectedEdge__TgtAssignment_2"


    // $ANTLR start "rule__UnDirectedEdge__AttributesAssignment_3_1"
    // ../com.lowcoupling.dotEditor.ui/src-gen/com/lowcoupling/dotEditor/ui/contentassist/antlr/internal/InternalDot.g:1413:1: rule__UnDirectedEdge__AttributesAssignment_3_1 : ( ruleAttribute ) ;
    public final void rule__UnDirectedEdge__AttributesAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.dotEditor.ui/src-gen/com/lowcoupling/dotEditor/ui/contentassist/antlr/internal/InternalDot.g:1417:1: ( ( ruleAttribute ) )
            // ../com.lowcoupling.dotEditor.ui/src-gen/com/lowcoupling/dotEditor/ui/contentassist/antlr/internal/InternalDot.g:1418:1: ( ruleAttribute )
            {
            // ../com.lowcoupling.dotEditor.ui/src-gen/com/lowcoupling/dotEditor/ui/contentassist/antlr/internal/InternalDot.g:1418:1: ( ruleAttribute )
            // ../com.lowcoupling.dotEditor.ui/src-gen/com/lowcoupling/dotEditor/ui/contentassist/antlr/internal/InternalDot.g:1419:1: ruleAttribute
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnDirectedEdgeAccess().getAttributesAttributeParserRuleCall_3_1_0()); 
            }
            pushFollow(FOLLOW_ruleAttribute_in_rule__UnDirectedEdge__AttributesAssignment_3_12782);
            ruleAttribute();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getUnDirectedEdgeAccess().getAttributesAttributeParserRuleCall_3_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnDirectedEdge__AttributesAssignment_3_1"


    // $ANTLR start "rule__DirectedEdge__SrcAssignment_0"
    // ../com.lowcoupling.dotEditor.ui/src-gen/com/lowcoupling/dotEditor/ui/contentassist/antlr/internal/InternalDot.g:1428:1: rule__DirectedEdge__SrcAssignment_0 : ( ruleNode ) ;
    public final void rule__DirectedEdge__SrcAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.dotEditor.ui/src-gen/com/lowcoupling/dotEditor/ui/contentassist/antlr/internal/InternalDot.g:1432:1: ( ( ruleNode ) )
            // ../com.lowcoupling.dotEditor.ui/src-gen/com/lowcoupling/dotEditor/ui/contentassist/antlr/internal/InternalDot.g:1433:1: ( ruleNode )
            {
            // ../com.lowcoupling.dotEditor.ui/src-gen/com/lowcoupling/dotEditor/ui/contentassist/antlr/internal/InternalDot.g:1433:1: ( ruleNode )
            // ../com.lowcoupling.dotEditor.ui/src-gen/com/lowcoupling/dotEditor/ui/contentassist/antlr/internal/InternalDot.g:1434:1: ruleNode
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDirectedEdgeAccess().getSrcNodeParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleNode_in_rule__DirectedEdge__SrcAssignment_02813);
            ruleNode();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDirectedEdgeAccess().getSrcNodeParserRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DirectedEdge__SrcAssignment_0"


    // $ANTLR start "rule__DirectedEdge__TgtAssignment_2"
    // ../com.lowcoupling.dotEditor.ui/src-gen/com/lowcoupling/dotEditor/ui/contentassist/antlr/internal/InternalDot.g:1443:1: rule__DirectedEdge__TgtAssignment_2 : ( ruleNode ) ;
    public final void rule__DirectedEdge__TgtAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.dotEditor.ui/src-gen/com/lowcoupling/dotEditor/ui/contentassist/antlr/internal/InternalDot.g:1447:1: ( ( ruleNode ) )
            // ../com.lowcoupling.dotEditor.ui/src-gen/com/lowcoupling/dotEditor/ui/contentassist/antlr/internal/InternalDot.g:1448:1: ( ruleNode )
            {
            // ../com.lowcoupling.dotEditor.ui/src-gen/com/lowcoupling/dotEditor/ui/contentassist/antlr/internal/InternalDot.g:1448:1: ( ruleNode )
            // ../com.lowcoupling.dotEditor.ui/src-gen/com/lowcoupling/dotEditor/ui/contentassist/antlr/internal/InternalDot.g:1449:1: ruleNode
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDirectedEdgeAccess().getTgtNodeParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleNode_in_rule__DirectedEdge__TgtAssignment_22844);
            ruleNode();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDirectedEdgeAccess().getTgtNodeParserRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DirectedEdge__TgtAssignment_2"


    // $ANTLR start "rule__DirectedEdge__AttributesAssignment_3_1"
    // ../com.lowcoupling.dotEditor.ui/src-gen/com/lowcoupling/dotEditor/ui/contentassist/antlr/internal/InternalDot.g:1458:1: rule__DirectedEdge__AttributesAssignment_3_1 : ( ruleAttribute ) ;
    public final void rule__DirectedEdge__AttributesAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.dotEditor.ui/src-gen/com/lowcoupling/dotEditor/ui/contentassist/antlr/internal/InternalDot.g:1462:1: ( ( ruleAttribute ) )
            // ../com.lowcoupling.dotEditor.ui/src-gen/com/lowcoupling/dotEditor/ui/contentassist/antlr/internal/InternalDot.g:1463:1: ( ruleAttribute )
            {
            // ../com.lowcoupling.dotEditor.ui/src-gen/com/lowcoupling/dotEditor/ui/contentassist/antlr/internal/InternalDot.g:1463:1: ( ruleAttribute )
            // ../com.lowcoupling.dotEditor.ui/src-gen/com/lowcoupling/dotEditor/ui/contentassist/antlr/internal/InternalDot.g:1464:1: ruleAttribute
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDirectedEdgeAccess().getAttributesAttributeParserRuleCall_3_1_0()); 
            }
            pushFollow(FOLLOW_ruleAttribute_in_rule__DirectedEdge__AttributesAssignment_3_12875);
            ruleAttribute();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDirectedEdgeAccess().getAttributesAttributeParserRuleCall_3_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DirectedEdge__AttributesAssignment_3_1"


    // $ANTLR start "rule__Attribute__WeightAssignment_2"
    // ../com.lowcoupling.dotEditor.ui/src-gen/com/lowcoupling/dotEditor/ui/contentassist/antlr/internal/InternalDot.g:1473:1: rule__Attribute__WeightAssignment_2 : ( RULE_INT ) ;
    public final void rule__Attribute__WeightAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.dotEditor.ui/src-gen/com/lowcoupling/dotEditor/ui/contentassist/antlr/internal/InternalDot.g:1477:1: ( ( RULE_INT ) )
            // ../com.lowcoupling.dotEditor.ui/src-gen/com/lowcoupling/dotEditor/ui/contentassist/antlr/internal/InternalDot.g:1478:1: ( RULE_INT )
            {
            // ../com.lowcoupling.dotEditor.ui/src-gen/com/lowcoupling/dotEditor/ui/contentassist/antlr/internal/InternalDot.g:1478:1: ( RULE_INT )
            // ../com.lowcoupling.dotEditor.ui/src-gen/com/lowcoupling/dotEditor/ui/contentassist/antlr/internal/InternalDot.g:1479:1: RULE_INT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeAccess().getWeightINTTerminalRuleCall_2_0()); 
            }
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Attribute__WeightAssignment_22906); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributeAccess().getWeightINTTerminalRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__WeightAssignment_2"


    // $ANTLR start "rule__Node__NameAssignment"
    // ../com.lowcoupling.dotEditor.ui/src-gen/com/lowcoupling/dotEditor/ui/contentassist/antlr/internal/InternalDot.g:1488:1: rule__Node__NameAssignment : ( RULE_ID ) ;
    public final void rule__Node__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.lowcoupling.dotEditor.ui/src-gen/com/lowcoupling/dotEditor/ui/contentassist/antlr/internal/InternalDot.g:1492:1: ( ( RULE_ID ) )
            // ../com.lowcoupling.dotEditor.ui/src-gen/com/lowcoupling/dotEditor/ui/contentassist/antlr/internal/InternalDot.g:1493:1: ( RULE_ID )
            {
            // ../com.lowcoupling.dotEditor.ui/src-gen/com/lowcoupling/dotEditor/ui/contentassist/antlr/internal/InternalDot.g:1493:1: ( RULE_ID )
            // ../com.lowcoupling.dotEditor.ui/src-gen/com/lowcoupling/dotEditor/ui/contentassist/antlr/internal/InternalDot.g:1494:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodeAccess().getNameIDTerminalRuleCall_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Node__NameAssignment2937); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNodeAccess().getNameIDTerminalRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node__NameAssignment"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleGraphModel_in_entryRuleGraphModel67 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGraphModel74 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GraphModel__GraphAssignment_in_ruleGraphModel100 = new BitSet(new long[]{0x0000000000008802L});
    public static final BitSet FOLLOW_ruleGraph_in_entryRuleGraph128 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGraph135 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Graph__Alternatives_in_ruleGraph161 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUndirectedGraph_in_entryRuleUndirectedGraph188 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUndirectedGraph195 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UndirectedGraph__Group__0_in_ruleUndirectedGraph221 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDirectedGraph_in_entryRuleDirectedGraph248 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDirectedGraph255 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DirectedGraph__Group__0_in_ruleDirectedGraph281 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnDirectedEdge_in_entryRuleUnDirectedEdge308 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUnDirectedEdge315 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UnDirectedEdge__Group__0_in_ruleUnDirectedEdge341 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDirectedEdge_in_entryRuleDirectedEdge368 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDirectedEdge375 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DirectedEdge__Group__0_in_ruleDirectedEdge401 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttribute_in_entryRuleAttribute428 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttribute435 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__Group__0_in_ruleAttribute461 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNode_in_entryRuleNode488 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNode495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Node__NameAssignment_in_ruleNode521 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUndirectedGraph_in_rule__Graph__Alternatives561 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDirectedGraph_in_rule__Graph__Alternatives578 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UndirectedGraph__Group__0__Impl_in_rule__UndirectedGraph__Group__0609 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__UndirectedGraph__Group__1_in_rule__UndirectedGraph__Group__0612 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__UndirectedGraph__Group__0__Impl640 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UndirectedGraph__Group__1__Impl_in_rule__UndirectedGraph__Group__1671 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__UndirectedGraph__Group__2_in_rule__UndirectedGraph__Group__1674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UndirectedGraph__NameAssignment_1_in_rule__UndirectedGraph__Group__1__Impl701 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UndirectedGraph__Group__2__Impl_in_rule__UndirectedGraph__Group__2731 = new BitSet(new long[]{0x0000000000002010L});
    public static final BitSet FOLLOW_rule__UndirectedGraph__Group__3_in_rule__UndirectedGraph__Group__2734 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__UndirectedGraph__Group__2__Impl762 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UndirectedGraph__Group__3__Impl_in_rule__UndirectedGraph__Group__3793 = new BitSet(new long[]{0x0000000000002010L});
    public static final BitSet FOLLOW_rule__UndirectedGraph__Group__4_in_rule__UndirectedGraph__Group__3796 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UndirectedGraph__Group_3__0_in_rule__UndirectedGraph__Group__3__Impl823 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__UndirectedGraph__Group__4__Impl_in_rule__UndirectedGraph__Group__4854 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__UndirectedGraph__Group__4__Impl882 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UndirectedGraph__Group_3__0__Impl_in_rule__UndirectedGraph__Group_3__0923 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__UndirectedGraph__Group_3__1_in_rule__UndirectedGraph__Group_3__0926 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UndirectedGraph__EdgeAssignment_3_0_in_rule__UndirectedGraph__Group_3__0__Impl953 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UndirectedGraph__Group_3__1__Impl_in_rule__UndirectedGraph__Group_3__1983 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__UndirectedGraph__Group_3__1__Impl1011 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DirectedGraph__Group__0__Impl_in_rule__DirectedGraph__Group__01046 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__DirectedGraph__Group__1_in_rule__DirectedGraph__Group__01049 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__DirectedGraph__Group__0__Impl1077 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DirectedGraph__Group__1__Impl_in_rule__DirectedGraph__Group__11108 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__DirectedGraph__Group__2_in_rule__DirectedGraph__Group__11111 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DirectedGraph__NameAssignment_1_in_rule__DirectedGraph__Group__1__Impl1138 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DirectedGraph__Group__2__Impl_in_rule__DirectedGraph__Group__21168 = new BitSet(new long[]{0x0000000000002010L});
    public static final BitSet FOLLOW_rule__DirectedGraph__Group__3_in_rule__DirectedGraph__Group__21171 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__DirectedGraph__Group__2__Impl1199 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DirectedGraph__Group__3__Impl_in_rule__DirectedGraph__Group__31230 = new BitSet(new long[]{0x0000000000002010L});
    public static final BitSet FOLLOW_rule__DirectedGraph__Group__4_in_rule__DirectedGraph__Group__31233 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DirectedGraph__Group_3__0_in_rule__DirectedGraph__Group__3__Impl1260 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__DirectedGraph__Group__4__Impl_in_rule__DirectedGraph__Group__41291 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__DirectedGraph__Group__4__Impl1319 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DirectedGraph__Group_3__0__Impl_in_rule__DirectedGraph__Group_3__01360 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__DirectedGraph__Group_3__1_in_rule__DirectedGraph__Group_3__01363 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DirectedGraph__EdgeAssignment_3_0_in_rule__DirectedGraph__Group_3__0__Impl1390 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DirectedGraph__Group_3__1__Impl_in_rule__DirectedGraph__Group_3__11420 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__DirectedGraph__Group_3__1__Impl1448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UnDirectedEdge__Group__0__Impl_in_rule__UnDirectedEdge__Group__01483 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__UnDirectedEdge__Group__1_in_rule__UnDirectedEdge__Group__01486 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UnDirectedEdge__SrcAssignment_0_in_rule__UnDirectedEdge__Group__0__Impl1513 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UnDirectedEdge__Group__1__Impl_in_rule__UnDirectedEdge__Group__11543 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__UnDirectedEdge__Group__2_in_rule__UnDirectedEdge__Group__11546 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__UnDirectedEdge__Group__1__Impl1574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UnDirectedEdge__Group__2__Impl_in_rule__UnDirectedEdge__Group__21605 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__UnDirectedEdge__Group__3_in_rule__UnDirectedEdge__Group__21608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UnDirectedEdge__TgtAssignment_2_in_rule__UnDirectedEdge__Group__2__Impl1635 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UnDirectedEdge__Group__3__Impl_in_rule__UnDirectedEdge__Group__31665 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UnDirectedEdge__Group_3__0_in_rule__UnDirectedEdge__Group__3__Impl1692 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UnDirectedEdge__Group_3__0__Impl_in_rule__UnDirectedEdge__Group_3__01731 = new BitSet(new long[]{0x0000000000140000L});
    public static final BitSet FOLLOW_rule__UnDirectedEdge__Group_3__1_in_rule__UnDirectedEdge__Group_3__01734 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__UnDirectedEdge__Group_3__0__Impl1762 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UnDirectedEdge__Group_3__1__Impl_in_rule__UnDirectedEdge__Group_3__11793 = new BitSet(new long[]{0x0000000000140000L});
    public static final BitSet FOLLOW_rule__UnDirectedEdge__Group_3__2_in_rule__UnDirectedEdge__Group_3__11796 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UnDirectedEdge__AttributesAssignment_3_1_in_rule__UnDirectedEdge__Group_3__1__Impl1823 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_rule__UnDirectedEdge__Group_3__2__Impl_in_rule__UnDirectedEdge__Group_3__21854 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__UnDirectedEdge__Group_3__2__Impl1882 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DirectedEdge__Group__0__Impl_in_rule__DirectedEdge__Group__01919 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__DirectedEdge__Group__1_in_rule__DirectedEdge__Group__01922 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DirectedEdge__SrcAssignment_0_in_rule__DirectedEdge__Group__0__Impl1949 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DirectedEdge__Group__1__Impl_in_rule__DirectedEdge__Group__11979 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__DirectedEdge__Group__2_in_rule__DirectedEdge__Group__11982 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__DirectedEdge__Group__1__Impl2010 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DirectedEdge__Group__2__Impl_in_rule__DirectedEdge__Group__22041 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__DirectedEdge__Group__3_in_rule__DirectedEdge__Group__22044 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DirectedEdge__TgtAssignment_2_in_rule__DirectedEdge__Group__2__Impl2071 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DirectedEdge__Group__3__Impl_in_rule__DirectedEdge__Group__32101 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DirectedEdge__Group_3__0_in_rule__DirectedEdge__Group__3__Impl2128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DirectedEdge__Group_3__0__Impl_in_rule__DirectedEdge__Group_3__02167 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__DirectedEdge__Group_3__1_in_rule__DirectedEdge__Group_3__02170 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__DirectedEdge__Group_3__0__Impl2198 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DirectedEdge__Group_3__1__Impl_in_rule__DirectedEdge__Group_3__12229 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__DirectedEdge__Group_3__2_in_rule__DirectedEdge__Group_3__12232 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DirectedEdge__AttributesAssignment_3_1_in_rule__DirectedEdge__Group_3__1__Impl2261 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_rule__DirectedEdge__AttributesAssignment_3_1_in_rule__DirectedEdge__Group_3__1__Impl2273 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_rule__DirectedEdge__Group_3__2__Impl_in_rule__DirectedEdge__Group_3__22306 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__DirectedEdge__Group_3__2__Impl2334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__Group__0__Impl_in_rule__Attribute__Group__02371 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__Attribute__Group__1_in_rule__Attribute__Group__02374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Attribute__Group__0__Impl2402 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__Group__1__Impl_in_rule__Attribute__Group__12433 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Attribute__Group__2_in_rule__Attribute__Group__12436 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Attribute__Group__1__Impl2464 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__Group__2__Impl_in_rule__Attribute__Group__22495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__WeightAssignment_2_in_rule__Attribute__Group__2__Impl2522 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGraph_in_rule__GraphModel__GraphAssignment2565 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__UndirectedGraph__NameAssignment_12596 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnDirectedEdge_in_rule__UndirectedGraph__EdgeAssignment_3_02627 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__DirectedGraph__NameAssignment_12658 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDirectedEdge_in_rule__DirectedGraph__EdgeAssignment_3_02689 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNode_in_rule__UnDirectedEdge__SrcAssignment_02720 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNode_in_rule__UnDirectedEdge__TgtAssignment_22751 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttribute_in_rule__UnDirectedEdge__AttributesAssignment_3_12782 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNode_in_rule__DirectedEdge__SrcAssignment_02813 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNode_in_rule__DirectedEdge__TgtAssignment_22844 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttribute_in_rule__DirectedEdge__AttributesAssignment_3_12875 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Attribute__WeightAssignment_22906 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Node__NameAssignment2937 = new BitSet(new long[]{0x0000000000000002L});

}