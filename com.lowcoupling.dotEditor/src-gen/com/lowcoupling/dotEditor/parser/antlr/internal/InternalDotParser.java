package com.lowcoupling.dotEditor.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import com.lowcoupling.dotEditor.services.DotGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalDotParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'graph'", "'{'", "';'", "'}'", "'digraph'", "'--'", "'['", "']'", "'->'", "'weight'", "'='"
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
    public String getGrammarFileName() { return "../com.lowcoupling.dotEditor/src-gen/com/lowcoupling/dotEditor/parser/antlr/internal/InternalDot.g"; }



     	private DotGrammarAccess grammarAccess;
     	
        public InternalDotParser(TokenStream input, DotGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "GraphModel";	
       	}
       	
       	@Override
       	protected DotGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleGraphModel"
    // ../com.lowcoupling.dotEditor/src-gen/com/lowcoupling/dotEditor/parser/antlr/internal/InternalDot.g:67:1: entryRuleGraphModel returns [EObject current=null] : iv_ruleGraphModel= ruleGraphModel EOF ;
    public final EObject entryRuleGraphModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGraphModel = null;


        try {
            // ../com.lowcoupling.dotEditor/src-gen/com/lowcoupling/dotEditor/parser/antlr/internal/InternalDot.g:68:2: (iv_ruleGraphModel= ruleGraphModel EOF )
            // ../com.lowcoupling.dotEditor/src-gen/com/lowcoupling/dotEditor/parser/antlr/internal/InternalDot.g:69:2: iv_ruleGraphModel= ruleGraphModel EOF
            {
             newCompositeNode(grammarAccess.getGraphModelRule()); 
            pushFollow(FOLLOW_ruleGraphModel_in_entryRuleGraphModel75);
            iv_ruleGraphModel=ruleGraphModel();

            state._fsp--;

             current =iv_ruleGraphModel; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleGraphModel85); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGraphModel"


    // $ANTLR start "ruleGraphModel"
    // ../com.lowcoupling.dotEditor/src-gen/com/lowcoupling/dotEditor/parser/antlr/internal/InternalDot.g:76:1: ruleGraphModel returns [EObject current=null] : ( (lv_graph_0_0= ruleGraph ) )* ;
    public final EObject ruleGraphModel() throws RecognitionException {
        EObject current = null;

        EObject lv_graph_0_0 = null;


         enterRule(); 
            
        try {
            // ../com.lowcoupling.dotEditor/src-gen/com/lowcoupling/dotEditor/parser/antlr/internal/InternalDot.g:79:28: ( ( (lv_graph_0_0= ruleGraph ) )* )
            // ../com.lowcoupling.dotEditor/src-gen/com/lowcoupling/dotEditor/parser/antlr/internal/InternalDot.g:80:1: ( (lv_graph_0_0= ruleGraph ) )*
            {
            // ../com.lowcoupling.dotEditor/src-gen/com/lowcoupling/dotEditor/parser/antlr/internal/InternalDot.g:80:1: ( (lv_graph_0_0= ruleGraph ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11||LA1_0==15) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../com.lowcoupling.dotEditor/src-gen/com/lowcoupling/dotEditor/parser/antlr/internal/InternalDot.g:81:1: (lv_graph_0_0= ruleGraph )
            	    {
            	    // ../com.lowcoupling.dotEditor/src-gen/com/lowcoupling/dotEditor/parser/antlr/internal/InternalDot.g:81:1: (lv_graph_0_0= ruleGraph )
            	    // ../com.lowcoupling.dotEditor/src-gen/com/lowcoupling/dotEditor/parser/antlr/internal/InternalDot.g:82:3: lv_graph_0_0= ruleGraph
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getGraphModelAccess().getGraphGraphParserRuleCall_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleGraph_in_ruleGraphModel130);
            	    lv_graph_0_0=ruleGraph();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getGraphModelRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"graph",
            	            		lv_graph_0_0, 
            	            		"Graph");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleGraphModel"


    // $ANTLR start "entryRuleGraph"
    // ../com.lowcoupling.dotEditor/src-gen/com/lowcoupling/dotEditor/parser/antlr/internal/InternalDot.g:106:1: entryRuleGraph returns [EObject current=null] : iv_ruleGraph= ruleGraph EOF ;
    public final EObject entryRuleGraph() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGraph = null;


        try {
            // ../com.lowcoupling.dotEditor/src-gen/com/lowcoupling/dotEditor/parser/antlr/internal/InternalDot.g:107:2: (iv_ruleGraph= ruleGraph EOF )
            // ../com.lowcoupling.dotEditor/src-gen/com/lowcoupling/dotEditor/parser/antlr/internal/InternalDot.g:108:2: iv_ruleGraph= ruleGraph EOF
            {
             newCompositeNode(grammarAccess.getGraphRule()); 
            pushFollow(FOLLOW_ruleGraph_in_entryRuleGraph166);
            iv_ruleGraph=ruleGraph();

            state._fsp--;

             current =iv_ruleGraph; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleGraph176); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGraph"


    // $ANTLR start "ruleGraph"
    // ../com.lowcoupling.dotEditor/src-gen/com/lowcoupling/dotEditor/parser/antlr/internal/InternalDot.g:115:1: ruleGraph returns [EObject current=null] : (this_UndirectedGraph_0= ruleUndirectedGraph | this_DirectedGraph_1= ruleDirectedGraph ) ;
    public final EObject ruleGraph() throws RecognitionException {
        EObject current = null;

        EObject this_UndirectedGraph_0 = null;

        EObject this_DirectedGraph_1 = null;


         enterRule(); 
            
        try {
            // ../com.lowcoupling.dotEditor/src-gen/com/lowcoupling/dotEditor/parser/antlr/internal/InternalDot.g:118:28: ( (this_UndirectedGraph_0= ruleUndirectedGraph | this_DirectedGraph_1= ruleDirectedGraph ) )
            // ../com.lowcoupling.dotEditor/src-gen/com/lowcoupling/dotEditor/parser/antlr/internal/InternalDot.g:119:1: (this_UndirectedGraph_0= ruleUndirectedGraph | this_DirectedGraph_1= ruleDirectedGraph )
            {
            // ../com.lowcoupling.dotEditor/src-gen/com/lowcoupling/dotEditor/parser/antlr/internal/InternalDot.g:119:1: (this_UndirectedGraph_0= ruleUndirectedGraph | this_DirectedGraph_1= ruleDirectedGraph )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==11) ) {
                alt2=1;
            }
            else if ( (LA2_0==15) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../com.lowcoupling.dotEditor/src-gen/com/lowcoupling/dotEditor/parser/antlr/internal/InternalDot.g:120:5: this_UndirectedGraph_0= ruleUndirectedGraph
                    {
                     
                            newCompositeNode(grammarAccess.getGraphAccess().getUndirectedGraphParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleUndirectedGraph_in_ruleGraph223);
                    this_UndirectedGraph_0=ruleUndirectedGraph();

                    state._fsp--;

                     
                            current = this_UndirectedGraph_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../com.lowcoupling.dotEditor/src-gen/com/lowcoupling/dotEditor/parser/antlr/internal/InternalDot.g:130:5: this_DirectedGraph_1= ruleDirectedGraph
                    {
                     
                            newCompositeNode(grammarAccess.getGraphAccess().getDirectedGraphParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleDirectedGraph_in_ruleGraph250);
                    this_DirectedGraph_1=ruleDirectedGraph();

                    state._fsp--;

                     
                            current = this_DirectedGraph_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleGraph"


    // $ANTLR start "entryRuleUndirectedGraph"
    // ../com.lowcoupling.dotEditor/src-gen/com/lowcoupling/dotEditor/parser/antlr/internal/InternalDot.g:146:1: entryRuleUndirectedGraph returns [EObject current=null] : iv_ruleUndirectedGraph= ruleUndirectedGraph EOF ;
    public final EObject entryRuleUndirectedGraph() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUndirectedGraph = null;


        try {
            // ../com.lowcoupling.dotEditor/src-gen/com/lowcoupling/dotEditor/parser/antlr/internal/InternalDot.g:147:2: (iv_ruleUndirectedGraph= ruleUndirectedGraph EOF )
            // ../com.lowcoupling.dotEditor/src-gen/com/lowcoupling/dotEditor/parser/antlr/internal/InternalDot.g:148:2: iv_ruleUndirectedGraph= ruleUndirectedGraph EOF
            {
             newCompositeNode(grammarAccess.getUndirectedGraphRule()); 
            pushFollow(FOLLOW_ruleUndirectedGraph_in_entryRuleUndirectedGraph285);
            iv_ruleUndirectedGraph=ruleUndirectedGraph();

            state._fsp--;

             current =iv_ruleUndirectedGraph; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUndirectedGraph295); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleUndirectedGraph"


    // $ANTLR start "ruleUndirectedGraph"
    // ../com.lowcoupling.dotEditor/src-gen/com/lowcoupling/dotEditor/parser/antlr/internal/InternalDot.g:155:1: ruleUndirectedGraph returns [EObject current=null] : (otherlv_0= 'graph' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( (lv_edge_3_0= ruleUnDirectedEdge ) ) otherlv_4= ';' )* otherlv_5= '}' ) ;
    public final EObject ruleUndirectedGraph() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        EObject lv_edge_3_0 = null;


         enterRule(); 
            
        try {
            // ../com.lowcoupling.dotEditor/src-gen/com/lowcoupling/dotEditor/parser/antlr/internal/InternalDot.g:158:28: ( (otherlv_0= 'graph' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( (lv_edge_3_0= ruleUnDirectedEdge ) ) otherlv_4= ';' )* otherlv_5= '}' ) )
            // ../com.lowcoupling.dotEditor/src-gen/com/lowcoupling/dotEditor/parser/antlr/internal/InternalDot.g:159:1: (otherlv_0= 'graph' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( (lv_edge_3_0= ruleUnDirectedEdge ) ) otherlv_4= ';' )* otherlv_5= '}' )
            {
            // ../com.lowcoupling.dotEditor/src-gen/com/lowcoupling/dotEditor/parser/antlr/internal/InternalDot.g:159:1: (otherlv_0= 'graph' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( (lv_edge_3_0= ruleUnDirectedEdge ) ) otherlv_4= ';' )* otherlv_5= '}' )
            // ../com.lowcoupling.dotEditor/src-gen/com/lowcoupling/dotEditor/parser/antlr/internal/InternalDot.g:159:3: otherlv_0= 'graph' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( (lv_edge_3_0= ruleUnDirectedEdge ) ) otherlv_4= ';' )* otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_11_in_ruleUndirectedGraph332); 

                	newLeafNode(otherlv_0, grammarAccess.getUndirectedGraphAccess().getGraphKeyword_0());
                
            // ../com.lowcoupling.dotEditor/src-gen/com/lowcoupling/dotEditor/parser/antlr/internal/InternalDot.g:163:1: ( (lv_name_1_0= RULE_ID ) )
            // ../com.lowcoupling.dotEditor/src-gen/com/lowcoupling/dotEditor/parser/antlr/internal/InternalDot.g:164:1: (lv_name_1_0= RULE_ID )
            {
            // ../com.lowcoupling.dotEditor/src-gen/com/lowcoupling/dotEditor/parser/antlr/internal/InternalDot.g:164:1: (lv_name_1_0= RULE_ID )
            // ../com.lowcoupling.dotEditor/src-gen/com/lowcoupling/dotEditor/parser/antlr/internal/InternalDot.g:165:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleUndirectedGraph349); 

            			newLeafNode(lv_name_1_0, grammarAccess.getUndirectedGraphAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getUndirectedGraphRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleUndirectedGraph366); 

                	newLeafNode(otherlv_2, grammarAccess.getUndirectedGraphAccess().getLeftCurlyBracketKeyword_2());
                
            // ../com.lowcoupling.dotEditor/src-gen/com/lowcoupling/dotEditor/parser/antlr/internal/InternalDot.g:185:1: ( ( (lv_edge_3_0= ruleUnDirectedEdge ) ) otherlv_4= ';' )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==RULE_ID) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../com.lowcoupling.dotEditor/src-gen/com/lowcoupling/dotEditor/parser/antlr/internal/InternalDot.g:185:2: ( (lv_edge_3_0= ruleUnDirectedEdge ) ) otherlv_4= ';'
            	    {
            	    // ../com.lowcoupling.dotEditor/src-gen/com/lowcoupling/dotEditor/parser/antlr/internal/InternalDot.g:185:2: ( (lv_edge_3_0= ruleUnDirectedEdge ) )
            	    // ../com.lowcoupling.dotEditor/src-gen/com/lowcoupling/dotEditor/parser/antlr/internal/InternalDot.g:186:1: (lv_edge_3_0= ruleUnDirectedEdge )
            	    {
            	    // ../com.lowcoupling.dotEditor/src-gen/com/lowcoupling/dotEditor/parser/antlr/internal/InternalDot.g:186:1: (lv_edge_3_0= ruleUnDirectedEdge )
            	    // ../com.lowcoupling.dotEditor/src-gen/com/lowcoupling/dotEditor/parser/antlr/internal/InternalDot.g:187:3: lv_edge_3_0= ruleUnDirectedEdge
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getUndirectedGraphAccess().getEdgeUnDirectedEdgeParserRuleCall_3_0_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleUnDirectedEdge_in_ruleUndirectedGraph388);
            	    lv_edge_3_0=ruleUnDirectedEdge();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getUndirectedGraphRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"edge",
            	            		lv_edge_3_0, 
            	            		"UnDirectedEdge");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }

            	    otherlv_4=(Token)match(input,13,FOLLOW_13_in_ruleUndirectedGraph400); 

            	        	newLeafNode(otherlv_4, grammarAccess.getUndirectedGraphAccess().getSemicolonKeyword_3_1());
            	        

            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            otherlv_5=(Token)match(input,14,FOLLOW_14_in_ruleUndirectedGraph414); 

                	newLeafNode(otherlv_5, grammarAccess.getUndirectedGraphAccess().getRightCurlyBracketKeyword_4());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleUndirectedGraph"


    // $ANTLR start "entryRuleDirectedGraph"
    // ../com.lowcoupling.dotEditor/src-gen/com/lowcoupling/dotEditor/parser/antlr/internal/InternalDot.g:219:1: entryRuleDirectedGraph returns [EObject current=null] : iv_ruleDirectedGraph= ruleDirectedGraph EOF ;
    public final EObject entryRuleDirectedGraph() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDirectedGraph = null;


        try {
            // ../com.lowcoupling.dotEditor/src-gen/com/lowcoupling/dotEditor/parser/antlr/internal/InternalDot.g:220:2: (iv_ruleDirectedGraph= ruleDirectedGraph EOF )
            // ../com.lowcoupling.dotEditor/src-gen/com/lowcoupling/dotEditor/parser/antlr/internal/InternalDot.g:221:2: iv_ruleDirectedGraph= ruleDirectedGraph EOF
            {
             newCompositeNode(grammarAccess.getDirectedGraphRule()); 
            pushFollow(FOLLOW_ruleDirectedGraph_in_entryRuleDirectedGraph450);
            iv_ruleDirectedGraph=ruleDirectedGraph();

            state._fsp--;

             current =iv_ruleDirectedGraph; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDirectedGraph460); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDirectedGraph"


    // $ANTLR start "ruleDirectedGraph"
    // ../com.lowcoupling.dotEditor/src-gen/com/lowcoupling/dotEditor/parser/antlr/internal/InternalDot.g:228:1: ruleDirectedGraph returns [EObject current=null] : (otherlv_0= 'digraph' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( (lv_edge_3_0= ruleDirectedEdge ) ) otherlv_4= ';' )* otherlv_5= '}' ) ;
    public final EObject ruleDirectedGraph() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        EObject lv_edge_3_0 = null;


         enterRule(); 
            
        try {
            // ../com.lowcoupling.dotEditor/src-gen/com/lowcoupling/dotEditor/parser/antlr/internal/InternalDot.g:231:28: ( (otherlv_0= 'digraph' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( (lv_edge_3_0= ruleDirectedEdge ) ) otherlv_4= ';' )* otherlv_5= '}' ) )
            // ../com.lowcoupling.dotEditor/src-gen/com/lowcoupling/dotEditor/parser/antlr/internal/InternalDot.g:232:1: (otherlv_0= 'digraph' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( (lv_edge_3_0= ruleDirectedEdge ) ) otherlv_4= ';' )* otherlv_5= '}' )
            {
            // ../com.lowcoupling.dotEditor/src-gen/com/lowcoupling/dotEditor/parser/antlr/internal/InternalDot.g:232:1: (otherlv_0= 'digraph' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( (lv_edge_3_0= ruleDirectedEdge ) ) otherlv_4= ';' )* otherlv_5= '}' )
            // ../com.lowcoupling.dotEditor/src-gen/com/lowcoupling/dotEditor/parser/antlr/internal/InternalDot.g:232:3: otherlv_0= 'digraph' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( (lv_edge_3_0= ruleDirectedEdge ) ) otherlv_4= ';' )* otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,15,FOLLOW_15_in_ruleDirectedGraph497); 

                	newLeafNode(otherlv_0, grammarAccess.getDirectedGraphAccess().getDigraphKeyword_0());
                
            // ../com.lowcoupling.dotEditor/src-gen/com/lowcoupling/dotEditor/parser/antlr/internal/InternalDot.g:236:1: ( (lv_name_1_0= RULE_ID ) )
            // ../com.lowcoupling.dotEditor/src-gen/com/lowcoupling/dotEditor/parser/antlr/internal/InternalDot.g:237:1: (lv_name_1_0= RULE_ID )
            {
            // ../com.lowcoupling.dotEditor/src-gen/com/lowcoupling/dotEditor/parser/antlr/internal/InternalDot.g:237:1: (lv_name_1_0= RULE_ID )
            // ../com.lowcoupling.dotEditor/src-gen/com/lowcoupling/dotEditor/parser/antlr/internal/InternalDot.g:238:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDirectedGraph514); 

            			newLeafNode(lv_name_1_0, grammarAccess.getDirectedGraphAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getDirectedGraphRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleDirectedGraph531); 

                	newLeafNode(otherlv_2, grammarAccess.getDirectedGraphAccess().getLeftCurlyBracketKeyword_2());
                
            // ../com.lowcoupling.dotEditor/src-gen/com/lowcoupling/dotEditor/parser/antlr/internal/InternalDot.g:258:1: ( ( (lv_edge_3_0= ruleDirectedEdge ) ) otherlv_4= ';' )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==RULE_ID) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../com.lowcoupling.dotEditor/src-gen/com/lowcoupling/dotEditor/parser/antlr/internal/InternalDot.g:258:2: ( (lv_edge_3_0= ruleDirectedEdge ) ) otherlv_4= ';'
            	    {
            	    // ../com.lowcoupling.dotEditor/src-gen/com/lowcoupling/dotEditor/parser/antlr/internal/InternalDot.g:258:2: ( (lv_edge_3_0= ruleDirectedEdge ) )
            	    // ../com.lowcoupling.dotEditor/src-gen/com/lowcoupling/dotEditor/parser/antlr/internal/InternalDot.g:259:1: (lv_edge_3_0= ruleDirectedEdge )
            	    {
            	    // ../com.lowcoupling.dotEditor/src-gen/com/lowcoupling/dotEditor/parser/antlr/internal/InternalDot.g:259:1: (lv_edge_3_0= ruleDirectedEdge )
            	    // ../com.lowcoupling.dotEditor/src-gen/com/lowcoupling/dotEditor/parser/antlr/internal/InternalDot.g:260:3: lv_edge_3_0= ruleDirectedEdge
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getDirectedGraphAccess().getEdgeDirectedEdgeParserRuleCall_3_0_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleDirectedEdge_in_ruleDirectedGraph553);
            	    lv_edge_3_0=ruleDirectedEdge();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getDirectedGraphRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"edge",
            	            		lv_edge_3_0, 
            	            		"DirectedEdge");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }

            	    otherlv_4=(Token)match(input,13,FOLLOW_13_in_ruleDirectedGraph565); 

            	        	newLeafNode(otherlv_4, grammarAccess.getDirectedGraphAccess().getSemicolonKeyword_3_1());
            	        

            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            otherlv_5=(Token)match(input,14,FOLLOW_14_in_ruleDirectedGraph579); 

                	newLeafNode(otherlv_5, grammarAccess.getDirectedGraphAccess().getRightCurlyBracketKeyword_4());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDirectedGraph"


    // $ANTLR start "entryRuleUnDirectedEdge"
    // ../com.lowcoupling.dotEditor/src-gen/com/lowcoupling/dotEditor/parser/antlr/internal/InternalDot.g:292:1: entryRuleUnDirectedEdge returns [EObject current=null] : iv_ruleUnDirectedEdge= ruleUnDirectedEdge EOF ;
    public final EObject entryRuleUnDirectedEdge() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnDirectedEdge = null;


        try {
            // ../com.lowcoupling.dotEditor/src-gen/com/lowcoupling/dotEditor/parser/antlr/internal/InternalDot.g:293:2: (iv_ruleUnDirectedEdge= ruleUnDirectedEdge EOF )
            // ../com.lowcoupling.dotEditor/src-gen/com/lowcoupling/dotEditor/parser/antlr/internal/InternalDot.g:294:2: iv_ruleUnDirectedEdge= ruleUnDirectedEdge EOF
            {
             newCompositeNode(grammarAccess.getUnDirectedEdgeRule()); 
            pushFollow(FOLLOW_ruleUnDirectedEdge_in_entryRuleUnDirectedEdge615);
            iv_ruleUnDirectedEdge=ruleUnDirectedEdge();

            state._fsp--;

             current =iv_ruleUnDirectedEdge; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUnDirectedEdge625); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleUnDirectedEdge"


    // $ANTLR start "ruleUnDirectedEdge"
    // ../com.lowcoupling.dotEditor/src-gen/com/lowcoupling/dotEditor/parser/antlr/internal/InternalDot.g:301:1: ruleUnDirectedEdge returns [EObject current=null] : ( ( (lv_src_0_0= ruleNode ) ) otherlv_1= '--' ( (lv_tgt_2_0= ruleNode ) ) (otherlv_3= '[' ( (lv_attributes_4_0= ruleAttribute ) )* otherlv_5= ']' )? ) ;
    public final EObject ruleUnDirectedEdge() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_src_0_0 = null;

        EObject lv_tgt_2_0 = null;

        EObject lv_attributes_4_0 = null;


         enterRule(); 
            
        try {
            // ../com.lowcoupling.dotEditor/src-gen/com/lowcoupling/dotEditor/parser/antlr/internal/InternalDot.g:304:28: ( ( ( (lv_src_0_0= ruleNode ) ) otherlv_1= '--' ( (lv_tgt_2_0= ruleNode ) ) (otherlv_3= '[' ( (lv_attributes_4_0= ruleAttribute ) )* otherlv_5= ']' )? ) )
            // ../com.lowcoupling.dotEditor/src-gen/com/lowcoupling/dotEditor/parser/antlr/internal/InternalDot.g:305:1: ( ( (lv_src_0_0= ruleNode ) ) otherlv_1= '--' ( (lv_tgt_2_0= ruleNode ) ) (otherlv_3= '[' ( (lv_attributes_4_0= ruleAttribute ) )* otherlv_5= ']' )? )
            {
            // ../com.lowcoupling.dotEditor/src-gen/com/lowcoupling/dotEditor/parser/antlr/internal/InternalDot.g:305:1: ( ( (lv_src_0_0= ruleNode ) ) otherlv_1= '--' ( (lv_tgt_2_0= ruleNode ) ) (otherlv_3= '[' ( (lv_attributes_4_0= ruleAttribute ) )* otherlv_5= ']' )? )
            // ../com.lowcoupling.dotEditor/src-gen/com/lowcoupling/dotEditor/parser/antlr/internal/InternalDot.g:305:2: ( (lv_src_0_0= ruleNode ) ) otherlv_1= '--' ( (lv_tgt_2_0= ruleNode ) ) (otherlv_3= '[' ( (lv_attributes_4_0= ruleAttribute ) )* otherlv_5= ']' )?
            {
            // ../com.lowcoupling.dotEditor/src-gen/com/lowcoupling/dotEditor/parser/antlr/internal/InternalDot.g:305:2: ( (lv_src_0_0= ruleNode ) )
            // ../com.lowcoupling.dotEditor/src-gen/com/lowcoupling/dotEditor/parser/antlr/internal/InternalDot.g:306:1: (lv_src_0_0= ruleNode )
            {
            // ../com.lowcoupling.dotEditor/src-gen/com/lowcoupling/dotEditor/parser/antlr/internal/InternalDot.g:306:1: (lv_src_0_0= ruleNode )
            // ../com.lowcoupling.dotEditor/src-gen/com/lowcoupling/dotEditor/parser/antlr/internal/InternalDot.g:307:3: lv_src_0_0= ruleNode
            {
             
            	        newCompositeNode(grammarAccess.getUnDirectedEdgeAccess().getSrcNodeParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleNode_in_ruleUnDirectedEdge671);
            lv_src_0_0=ruleNode();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getUnDirectedEdgeRule());
            	        }
                   		set(
                   			current, 
                   			"src",
                    		lv_src_0_0, 
                    		"Node");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_1=(Token)match(input,16,FOLLOW_16_in_ruleUnDirectedEdge683); 

                	newLeafNode(otherlv_1, grammarAccess.getUnDirectedEdgeAccess().getHyphenMinusHyphenMinusKeyword_1());
                
            // ../com.lowcoupling.dotEditor/src-gen/com/lowcoupling/dotEditor/parser/antlr/internal/InternalDot.g:327:1: ( (lv_tgt_2_0= ruleNode ) )
            // ../com.lowcoupling.dotEditor/src-gen/com/lowcoupling/dotEditor/parser/antlr/internal/InternalDot.g:328:1: (lv_tgt_2_0= ruleNode )
            {
            // ../com.lowcoupling.dotEditor/src-gen/com/lowcoupling/dotEditor/parser/antlr/internal/InternalDot.g:328:1: (lv_tgt_2_0= ruleNode )
            // ../com.lowcoupling.dotEditor/src-gen/com/lowcoupling/dotEditor/parser/antlr/internal/InternalDot.g:329:3: lv_tgt_2_0= ruleNode
            {
             
            	        newCompositeNode(grammarAccess.getUnDirectedEdgeAccess().getTgtNodeParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleNode_in_ruleUnDirectedEdge704);
            lv_tgt_2_0=ruleNode();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getUnDirectedEdgeRule());
            	        }
                   		set(
                   			current, 
                   			"tgt",
                    		lv_tgt_2_0, 
                    		"Node");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../com.lowcoupling.dotEditor/src-gen/com/lowcoupling/dotEditor/parser/antlr/internal/InternalDot.g:345:2: (otherlv_3= '[' ( (lv_attributes_4_0= ruleAttribute ) )* otherlv_5= ']' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==17) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../com.lowcoupling.dotEditor/src-gen/com/lowcoupling/dotEditor/parser/antlr/internal/InternalDot.g:345:4: otherlv_3= '[' ( (lv_attributes_4_0= ruleAttribute ) )* otherlv_5= ']'
                    {
                    otherlv_3=(Token)match(input,17,FOLLOW_17_in_ruleUnDirectedEdge717); 

                        	newLeafNode(otherlv_3, grammarAccess.getUnDirectedEdgeAccess().getLeftSquareBracketKeyword_3_0());
                        
                    // ../com.lowcoupling.dotEditor/src-gen/com/lowcoupling/dotEditor/parser/antlr/internal/InternalDot.g:349:1: ( (lv_attributes_4_0= ruleAttribute ) )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==20) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // ../com.lowcoupling.dotEditor/src-gen/com/lowcoupling/dotEditor/parser/antlr/internal/InternalDot.g:350:1: (lv_attributes_4_0= ruleAttribute )
                    	    {
                    	    // ../com.lowcoupling.dotEditor/src-gen/com/lowcoupling/dotEditor/parser/antlr/internal/InternalDot.g:350:1: (lv_attributes_4_0= ruleAttribute )
                    	    // ../com.lowcoupling.dotEditor/src-gen/com/lowcoupling/dotEditor/parser/antlr/internal/InternalDot.g:351:3: lv_attributes_4_0= ruleAttribute
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getUnDirectedEdgeAccess().getAttributesAttributeParserRuleCall_3_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleAttribute_in_ruleUnDirectedEdge738);
                    	    lv_attributes_4_0=ruleAttribute();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getUnDirectedEdgeRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"attributes",
                    	            		lv_attributes_4_0, 
                    	            		"Attribute");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);

                    otherlv_5=(Token)match(input,18,FOLLOW_18_in_ruleUnDirectedEdge751); 

                        	newLeafNode(otherlv_5, grammarAccess.getUnDirectedEdgeAccess().getRightSquareBracketKeyword_3_2());
                        

                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleUnDirectedEdge"


    // $ANTLR start "entryRuleDirectedEdge"
    // ../com.lowcoupling.dotEditor/src-gen/com/lowcoupling/dotEditor/parser/antlr/internal/InternalDot.g:379:1: entryRuleDirectedEdge returns [EObject current=null] : iv_ruleDirectedEdge= ruleDirectedEdge EOF ;
    public final EObject entryRuleDirectedEdge() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDirectedEdge = null;


        try {
            // ../com.lowcoupling.dotEditor/src-gen/com/lowcoupling/dotEditor/parser/antlr/internal/InternalDot.g:380:2: (iv_ruleDirectedEdge= ruleDirectedEdge EOF )
            // ../com.lowcoupling.dotEditor/src-gen/com/lowcoupling/dotEditor/parser/antlr/internal/InternalDot.g:381:2: iv_ruleDirectedEdge= ruleDirectedEdge EOF
            {
             newCompositeNode(grammarAccess.getDirectedEdgeRule()); 
            pushFollow(FOLLOW_ruleDirectedEdge_in_entryRuleDirectedEdge789);
            iv_ruleDirectedEdge=ruleDirectedEdge();

            state._fsp--;

             current =iv_ruleDirectedEdge; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDirectedEdge799); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDirectedEdge"


    // $ANTLR start "ruleDirectedEdge"
    // ../com.lowcoupling.dotEditor/src-gen/com/lowcoupling/dotEditor/parser/antlr/internal/InternalDot.g:388:1: ruleDirectedEdge returns [EObject current=null] : ( ( (lv_src_0_0= ruleNode ) ) otherlv_1= '->' ( (lv_tgt_2_0= ruleNode ) ) (otherlv_3= '[' ( (lv_attributes_4_0= ruleAttribute ) )+ otherlv_5= ']' )? ) ;
    public final EObject ruleDirectedEdge() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_src_0_0 = null;

        EObject lv_tgt_2_0 = null;

        EObject lv_attributes_4_0 = null;


         enterRule(); 
            
        try {
            // ../com.lowcoupling.dotEditor/src-gen/com/lowcoupling/dotEditor/parser/antlr/internal/InternalDot.g:391:28: ( ( ( (lv_src_0_0= ruleNode ) ) otherlv_1= '->' ( (lv_tgt_2_0= ruleNode ) ) (otherlv_3= '[' ( (lv_attributes_4_0= ruleAttribute ) )+ otherlv_5= ']' )? ) )
            // ../com.lowcoupling.dotEditor/src-gen/com/lowcoupling/dotEditor/parser/antlr/internal/InternalDot.g:392:1: ( ( (lv_src_0_0= ruleNode ) ) otherlv_1= '->' ( (lv_tgt_2_0= ruleNode ) ) (otherlv_3= '[' ( (lv_attributes_4_0= ruleAttribute ) )+ otherlv_5= ']' )? )
            {
            // ../com.lowcoupling.dotEditor/src-gen/com/lowcoupling/dotEditor/parser/antlr/internal/InternalDot.g:392:1: ( ( (lv_src_0_0= ruleNode ) ) otherlv_1= '->' ( (lv_tgt_2_0= ruleNode ) ) (otherlv_3= '[' ( (lv_attributes_4_0= ruleAttribute ) )+ otherlv_5= ']' )? )
            // ../com.lowcoupling.dotEditor/src-gen/com/lowcoupling/dotEditor/parser/antlr/internal/InternalDot.g:392:2: ( (lv_src_0_0= ruleNode ) ) otherlv_1= '->' ( (lv_tgt_2_0= ruleNode ) ) (otherlv_3= '[' ( (lv_attributes_4_0= ruleAttribute ) )+ otherlv_5= ']' )?
            {
            // ../com.lowcoupling.dotEditor/src-gen/com/lowcoupling/dotEditor/parser/antlr/internal/InternalDot.g:392:2: ( (lv_src_0_0= ruleNode ) )
            // ../com.lowcoupling.dotEditor/src-gen/com/lowcoupling/dotEditor/parser/antlr/internal/InternalDot.g:393:1: (lv_src_0_0= ruleNode )
            {
            // ../com.lowcoupling.dotEditor/src-gen/com/lowcoupling/dotEditor/parser/antlr/internal/InternalDot.g:393:1: (lv_src_0_0= ruleNode )
            // ../com.lowcoupling.dotEditor/src-gen/com/lowcoupling/dotEditor/parser/antlr/internal/InternalDot.g:394:3: lv_src_0_0= ruleNode
            {
             
            	        newCompositeNode(grammarAccess.getDirectedEdgeAccess().getSrcNodeParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleNode_in_ruleDirectedEdge845);
            lv_src_0_0=ruleNode();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getDirectedEdgeRule());
            	        }
                   		set(
                   			current, 
                   			"src",
                    		lv_src_0_0, 
                    		"Node");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_1=(Token)match(input,19,FOLLOW_19_in_ruleDirectedEdge857); 

                	newLeafNode(otherlv_1, grammarAccess.getDirectedEdgeAccess().getHyphenMinusGreaterThanSignKeyword_1());
                
            // ../com.lowcoupling.dotEditor/src-gen/com/lowcoupling/dotEditor/parser/antlr/internal/InternalDot.g:414:1: ( (lv_tgt_2_0= ruleNode ) )
            // ../com.lowcoupling.dotEditor/src-gen/com/lowcoupling/dotEditor/parser/antlr/internal/InternalDot.g:415:1: (lv_tgt_2_0= ruleNode )
            {
            // ../com.lowcoupling.dotEditor/src-gen/com/lowcoupling/dotEditor/parser/antlr/internal/InternalDot.g:415:1: (lv_tgt_2_0= ruleNode )
            // ../com.lowcoupling.dotEditor/src-gen/com/lowcoupling/dotEditor/parser/antlr/internal/InternalDot.g:416:3: lv_tgt_2_0= ruleNode
            {
             
            	        newCompositeNode(grammarAccess.getDirectedEdgeAccess().getTgtNodeParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleNode_in_ruleDirectedEdge878);
            lv_tgt_2_0=ruleNode();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getDirectedEdgeRule());
            	        }
                   		set(
                   			current, 
                   			"tgt",
                    		lv_tgt_2_0, 
                    		"Node");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../com.lowcoupling.dotEditor/src-gen/com/lowcoupling/dotEditor/parser/antlr/internal/InternalDot.g:432:2: (otherlv_3= '[' ( (lv_attributes_4_0= ruleAttribute ) )+ otherlv_5= ']' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==17) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../com.lowcoupling.dotEditor/src-gen/com/lowcoupling/dotEditor/parser/antlr/internal/InternalDot.g:432:4: otherlv_3= '[' ( (lv_attributes_4_0= ruleAttribute ) )+ otherlv_5= ']'
                    {
                    otherlv_3=(Token)match(input,17,FOLLOW_17_in_ruleDirectedEdge891); 

                        	newLeafNode(otherlv_3, grammarAccess.getDirectedEdgeAccess().getLeftSquareBracketKeyword_3_0());
                        
                    // ../com.lowcoupling.dotEditor/src-gen/com/lowcoupling/dotEditor/parser/antlr/internal/InternalDot.g:436:1: ( (lv_attributes_4_0= ruleAttribute ) )+
                    int cnt7=0;
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0==20) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // ../com.lowcoupling.dotEditor/src-gen/com/lowcoupling/dotEditor/parser/antlr/internal/InternalDot.g:437:1: (lv_attributes_4_0= ruleAttribute )
                    	    {
                    	    // ../com.lowcoupling.dotEditor/src-gen/com/lowcoupling/dotEditor/parser/antlr/internal/InternalDot.g:437:1: (lv_attributes_4_0= ruleAttribute )
                    	    // ../com.lowcoupling.dotEditor/src-gen/com/lowcoupling/dotEditor/parser/antlr/internal/InternalDot.g:438:3: lv_attributes_4_0= ruleAttribute
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getDirectedEdgeAccess().getAttributesAttributeParserRuleCall_3_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleAttribute_in_ruleDirectedEdge912);
                    	    lv_attributes_4_0=ruleAttribute();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getDirectedEdgeRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"attributes",
                    	            		lv_attributes_4_0, 
                    	            		"Attribute");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt7 >= 1 ) break loop7;
                                EarlyExitException eee =
                                    new EarlyExitException(7, input);
                                throw eee;
                        }
                        cnt7++;
                    } while (true);

                    otherlv_5=(Token)match(input,18,FOLLOW_18_in_ruleDirectedEdge925); 

                        	newLeafNode(otherlv_5, grammarAccess.getDirectedEdgeAccess().getRightSquareBracketKeyword_3_2());
                        

                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDirectedEdge"


    // $ANTLR start "entryRuleAttribute"
    // ../com.lowcoupling.dotEditor/src-gen/com/lowcoupling/dotEditor/parser/antlr/internal/InternalDot.g:466:1: entryRuleAttribute returns [EObject current=null] : iv_ruleAttribute= ruleAttribute EOF ;
    public final EObject entryRuleAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttribute = null;


        try {
            // ../com.lowcoupling.dotEditor/src-gen/com/lowcoupling/dotEditor/parser/antlr/internal/InternalDot.g:467:2: (iv_ruleAttribute= ruleAttribute EOF )
            // ../com.lowcoupling.dotEditor/src-gen/com/lowcoupling/dotEditor/parser/antlr/internal/InternalDot.g:468:2: iv_ruleAttribute= ruleAttribute EOF
            {
             newCompositeNode(grammarAccess.getAttributeRule()); 
            pushFollow(FOLLOW_ruleAttribute_in_entryRuleAttribute963);
            iv_ruleAttribute=ruleAttribute();

            state._fsp--;

             current =iv_ruleAttribute; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttribute973); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAttribute"


    // $ANTLR start "ruleAttribute"
    // ../com.lowcoupling.dotEditor/src-gen/com/lowcoupling/dotEditor/parser/antlr/internal/InternalDot.g:475:1: ruleAttribute returns [EObject current=null] : (otherlv_0= 'weight' otherlv_1= '=' ( (lv_weight_2_0= RULE_INT ) ) ) ;
    public final EObject ruleAttribute() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_weight_2_0=null;

         enterRule(); 
            
        try {
            // ../com.lowcoupling.dotEditor/src-gen/com/lowcoupling/dotEditor/parser/antlr/internal/InternalDot.g:478:28: ( (otherlv_0= 'weight' otherlv_1= '=' ( (lv_weight_2_0= RULE_INT ) ) ) )
            // ../com.lowcoupling.dotEditor/src-gen/com/lowcoupling/dotEditor/parser/antlr/internal/InternalDot.g:479:1: (otherlv_0= 'weight' otherlv_1= '=' ( (lv_weight_2_0= RULE_INT ) ) )
            {
            // ../com.lowcoupling.dotEditor/src-gen/com/lowcoupling/dotEditor/parser/antlr/internal/InternalDot.g:479:1: (otherlv_0= 'weight' otherlv_1= '=' ( (lv_weight_2_0= RULE_INT ) ) )
            // ../com.lowcoupling.dotEditor/src-gen/com/lowcoupling/dotEditor/parser/antlr/internal/InternalDot.g:479:3: otherlv_0= 'weight' otherlv_1= '=' ( (lv_weight_2_0= RULE_INT ) )
            {
            otherlv_0=(Token)match(input,20,FOLLOW_20_in_ruleAttribute1010); 

                	newLeafNode(otherlv_0, grammarAccess.getAttributeAccess().getWeightKeyword_0());
                
            otherlv_1=(Token)match(input,21,FOLLOW_21_in_ruleAttribute1022); 

                	newLeafNode(otherlv_1, grammarAccess.getAttributeAccess().getEqualsSignKeyword_1());
                
            // ../com.lowcoupling.dotEditor/src-gen/com/lowcoupling/dotEditor/parser/antlr/internal/InternalDot.g:487:1: ( (lv_weight_2_0= RULE_INT ) )
            // ../com.lowcoupling.dotEditor/src-gen/com/lowcoupling/dotEditor/parser/antlr/internal/InternalDot.g:488:1: (lv_weight_2_0= RULE_INT )
            {
            // ../com.lowcoupling.dotEditor/src-gen/com/lowcoupling/dotEditor/parser/antlr/internal/InternalDot.g:488:1: (lv_weight_2_0= RULE_INT )
            // ../com.lowcoupling.dotEditor/src-gen/com/lowcoupling/dotEditor/parser/antlr/internal/InternalDot.g:489:3: lv_weight_2_0= RULE_INT
            {
            lv_weight_2_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleAttribute1039); 

            			newLeafNode(lv_weight_2_0, grammarAccess.getAttributeAccess().getWeightINTTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getAttributeRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"weight",
                    		lv_weight_2_0, 
                    		"INT");
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAttribute"


    // $ANTLR start "entryRuleNode"
    // ../com.lowcoupling.dotEditor/src-gen/com/lowcoupling/dotEditor/parser/antlr/internal/InternalDot.g:513:1: entryRuleNode returns [EObject current=null] : iv_ruleNode= ruleNode EOF ;
    public final EObject entryRuleNode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNode = null;


        try {
            // ../com.lowcoupling.dotEditor/src-gen/com/lowcoupling/dotEditor/parser/antlr/internal/InternalDot.g:514:2: (iv_ruleNode= ruleNode EOF )
            // ../com.lowcoupling.dotEditor/src-gen/com/lowcoupling/dotEditor/parser/antlr/internal/InternalDot.g:515:2: iv_ruleNode= ruleNode EOF
            {
             newCompositeNode(grammarAccess.getNodeRule()); 
            pushFollow(FOLLOW_ruleNode_in_entryRuleNode1080);
            iv_ruleNode=ruleNode();

            state._fsp--;

             current =iv_ruleNode; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNode1090); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNode"


    // $ANTLR start "ruleNode"
    // ../com.lowcoupling.dotEditor/src-gen/com/lowcoupling/dotEditor/parser/antlr/internal/InternalDot.g:522:1: ruleNode returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleNode() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;

         enterRule(); 
            
        try {
            // ../com.lowcoupling.dotEditor/src-gen/com/lowcoupling/dotEditor/parser/antlr/internal/InternalDot.g:525:28: ( ( (lv_name_0_0= RULE_ID ) ) )
            // ../com.lowcoupling.dotEditor/src-gen/com/lowcoupling/dotEditor/parser/antlr/internal/InternalDot.g:526:1: ( (lv_name_0_0= RULE_ID ) )
            {
            // ../com.lowcoupling.dotEditor/src-gen/com/lowcoupling/dotEditor/parser/antlr/internal/InternalDot.g:526:1: ( (lv_name_0_0= RULE_ID ) )
            // ../com.lowcoupling.dotEditor/src-gen/com/lowcoupling/dotEditor/parser/antlr/internal/InternalDot.g:527:1: (lv_name_0_0= RULE_ID )
            {
            // ../com.lowcoupling.dotEditor/src-gen/com/lowcoupling/dotEditor/parser/antlr/internal/InternalDot.g:527:1: (lv_name_0_0= RULE_ID )
            // ../com.lowcoupling.dotEditor/src-gen/com/lowcoupling/dotEditor/parser/antlr/internal/InternalDot.g:528:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleNode1131); 

            			newLeafNode(lv_name_0_0, grammarAccess.getNodeAccess().getNameIDTerminalRuleCall_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getNodeRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"ID");
            	    

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNode"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleGraphModel_in_entryRuleGraphModel75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGraphModel85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGraph_in_ruleGraphModel130 = new BitSet(new long[]{0x0000000000008802L});
    public static final BitSet FOLLOW_ruleGraph_in_entryRuleGraph166 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGraph176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUndirectedGraph_in_ruleGraph223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDirectedGraph_in_ruleGraph250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUndirectedGraph_in_entryRuleUndirectedGraph285 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUndirectedGraph295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleUndirectedGraph332 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleUndirectedGraph349 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleUndirectedGraph366 = new BitSet(new long[]{0x0000000000004010L});
    public static final BitSet FOLLOW_ruleUnDirectedEdge_in_ruleUndirectedGraph388 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleUndirectedGraph400 = new BitSet(new long[]{0x0000000000004010L});
    public static final BitSet FOLLOW_14_in_ruleUndirectedGraph414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDirectedGraph_in_entryRuleDirectedGraph450 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDirectedGraph460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleDirectedGraph497 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDirectedGraph514 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleDirectedGraph531 = new BitSet(new long[]{0x0000000000004010L});
    public static final BitSet FOLLOW_ruleDirectedEdge_in_ruleDirectedGraph553 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleDirectedGraph565 = new BitSet(new long[]{0x0000000000004010L});
    public static final BitSet FOLLOW_14_in_ruleDirectedGraph579 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnDirectedEdge_in_entryRuleUnDirectedEdge615 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUnDirectedEdge625 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNode_in_ruleUnDirectedEdge671 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleUnDirectedEdge683 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleNode_in_ruleUnDirectedEdge704 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_17_in_ruleUnDirectedEdge717 = new BitSet(new long[]{0x0000000000140000L});
    public static final BitSet FOLLOW_ruleAttribute_in_ruleUnDirectedEdge738 = new BitSet(new long[]{0x0000000000140000L});
    public static final BitSet FOLLOW_18_in_ruleUnDirectedEdge751 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDirectedEdge_in_entryRuleDirectedEdge789 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDirectedEdge799 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNode_in_ruleDirectedEdge845 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleDirectedEdge857 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleNode_in_ruleDirectedEdge878 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_17_in_ruleDirectedEdge891 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_ruleAttribute_in_ruleDirectedEdge912 = new BitSet(new long[]{0x0000000000140000L});
    public static final BitSet FOLLOW_18_in_ruleDirectedEdge925 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttribute_in_entryRuleAttribute963 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttribute973 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleAttribute1010 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleAttribute1022 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleAttribute1039 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNode_in_entryRuleNode1080 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNode1090 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleNode1131 = new BitSet(new long[]{0x0000000000000002L});

}