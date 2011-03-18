package org.waml.w3c.webidl.parser.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.xtext.parsetree.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.eclipse.xtext.conversion.ValueConverterException;
import org.waml.w3c.webidl.services.WebIDLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalWebIDLParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'import'", "';'", "'typedef'", "'[]'", "'unsigned'", "'void'", "'boolean'", "'byte'", "'double'", "'float'", "'short'", "'long'", "'Object'", "'object'", "'any'", "'octet'", "'DOMString'", "'?'", "'sequence<'", "'>'", "'::'", "'Constructor'", "'('", "','", "')'", "'NamedConstructor'", "'='", "'Callback'", "'FunctionOnly'", "'PropertyOnly'", "'NoInterfaceObject'", "'OverrideBuiltins'", "'PrototypeRoot'", "'PutForwards'", "'TreatNullAs'", "'EmptyString'", "'TreatUndefinedAs'", "'null'", "'AllowAny'", "'Replaceable'", "'Supplemental'", "'ReplaceableNamedProperties'", "'implements'", "'['", "']'", "'module'", "'{'", "'}'", "'Prefix'", "'NamespaceObject'", "'interface'", "':'", "'stringifier'", "'omittable'", "'raises'", "'getter'", "'setter'", "'creator'", "'deleter'", "'caller'", "'readonly'", "'attribute'", "'getraises'", "'setraises'", "'exception'", "'in'", "'optional'", "'...'", "'const'", "'0x'"
    };
    public static final int RULE_ID=5;
    public static final int RULE_STRING=4;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=6;
    public static final int RULE_WS=9;
    public static final int RULE_SL_COMMENT=8;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=7;

        public InternalWebIDLParser(TokenStream input) {
            super(input);
            ruleMemo = new HashMap[183+1];
         }
        

    public String[] getTokenNames() { return tokenNames; }
    public String getGrammarFileName() { return "../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g"; }



    /*
      This grammar contains a lot of empty actions to work around a bug in ANTLR.
      Otherwise the ANTLR tool will create synpreds that cannot be compiled in some rare cases.
    */
     
     	private WebIDLGrammarAccess grammarAccess;
     	
        public InternalWebIDLParser(TokenStream input, IAstFactory factory, WebIDLGrammarAccess grammarAccess) {
            this(input);
            this.factory = factory;
            registerRules(grammarAccess.getGrammar());
            this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected InputStream getTokenFile() {
        	ClassLoader classLoader = getClass().getClassLoader();
        	return classLoader.getResourceAsStream("org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.tokens");
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "IDLDefinitions";	
       	}
       	
       	@Override
       	protected WebIDLGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start entryRuleIDLDefinitions
    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:83:1: entryRuleIDLDefinitions returns [EObject current=null] : iv_ruleIDLDefinitions= ruleIDLDefinitions EOF ;
    public final EObject entryRuleIDLDefinitions() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIDLDefinitions = null;


        try {
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:84:2: (iv_ruleIDLDefinitions= ruleIDLDefinitions EOF )
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:85:2: iv_ruleIDLDefinitions= ruleIDLDefinitions EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getIDLDefinitionsRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleIDLDefinitions_in_entryRuleIDLDefinitions81);
            iv_ruleIDLDefinitions=ruleIDLDefinitions();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleIDLDefinitions; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleIDLDefinitions91); if (failed) return current;

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
    // $ANTLR end entryRuleIDLDefinitions


    // $ANTLR start ruleIDLDefinitions
    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:92:1: ruleIDLDefinitions returns [EObject current=null] : ( ( (lv_imports_0_0= ruleImport ) )* ( (lv_definitions_1_0= ruleAbstractDefinitions ) )* ) ;
    public final EObject ruleIDLDefinitions() throws RecognitionException {
        EObject current = null;

        EObject lv_imports_0_0 = null;

        EObject lv_definitions_1_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:97:6: ( ( ( (lv_imports_0_0= ruleImport ) )* ( (lv_definitions_1_0= ruleAbstractDefinitions ) )* ) )
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:98:1: ( ( (lv_imports_0_0= ruleImport ) )* ( (lv_definitions_1_0= ruleAbstractDefinitions ) )* )
            {
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:98:1: ( ( (lv_imports_0_0= ruleImport ) )* ( (lv_definitions_1_0= ruleAbstractDefinitions ) )* )
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:98:2: ( (lv_imports_0_0= ruleImport ) )* ( (lv_definitions_1_0= ruleAbstractDefinitions ) )*
            {
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:98:2: ( (lv_imports_0_0= ruleImport ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:99:1: (lv_imports_0_0= ruleImport )
            	    {
            	    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:99:1: (lv_imports_0_0= ruleImport )
            	    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:100:3: lv_imports_0_0= ruleImport
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getIDLDefinitionsAccess().getImportsImportParserRuleCall_0_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleImport_in_ruleIDLDefinitions137);
            	    lv_imports_0_0=ruleImport();
            	    _fsp--;
            	    if (failed) return current;
            	    if ( backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = factory.create(grammarAccess.getIDLDefinitionsRule().getType().getClassifier());
            	      	            associateNodeWithAstElement(currentNode.getParent(), current);
            	      	        }
            	      	        try {
            	      	       		add(
            	      	       			current, 
            	      	       			"imports",
            	      	        		lv_imports_0_0, 
            	      	        		"Import", 
            	      	        		currentNode);
            	      	        } catch (ValueConverterException vce) {
            	      				handleValueConverterException(vce);
            	      	        }
            	      	        currentNode = currentNode.getParent();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:122:3: ( (lv_definitions_1_0= ruleAbstractDefinitions ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==RULE_ID||LA2_0==13||LA2_0==54||LA2_0==56||LA2_0==61||LA2_0==75) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:123:1: (lv_definitions_1_0= ruleAbstractDefinitions )
            	    {
            	    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:123:1: (lv_definitions_1_0= ruleAbstractDefinitions )
            	    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:124:3: lv_definitions_1_0= ruleAbstractDefinitions
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getIDLDefinitionsAccess().getDefinitionsAbstractDefinitionsParserRuleCall_1_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleAbstractDefinitions_in_ruleIDLDefinitions159);
            	    lv_definitions_1_0=ruleAbstractDefinitions();
            	    _fsp--;
            	    if (failed) return current;
            	    if ( backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = factory.create(grammarAccess.getIDLDefinitionsRule().getType().getClassifier());
            	      	            associateNodeWithAstElement(currentNode.getParent(), current);
            	      	        }
            	      	        try {
            	      	       		add(
            	      	       			current, 
            	      	       			"definitions",
            	      	        		lv_definitions_1_0, 
            	      	        		"AbstractDefinitions", 
            	      	        		currentNode);
            	      	        } catch (ValueConverterException vce) {
            	      				handleValueConverterException(vce);
            	      	        }
            	      	        currentNode = currentNode.getParent();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
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
    // $ANTLR end ruleIDLDefinitions


    // $ANTLR start entryRuleImport
    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:154:1: entryRuleImport returns [EObject current=null] : iv_ruleImport= ruleImport EOF ;
    public final EObject entryRuleImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImport = null;


        try {
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:155:2: (iv_ruleImport= ruleImport EOF )
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:156:2: iv_ruleImport= ruleImport EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getImportRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleImport_in_entryRuleImport196);
            iv_ruleImport=ruleImport();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleImport; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleImport206); if (failed) return current;

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
    // $ANTLR end entryRuleImport


    // $ANTLR start ruleImport
    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:163:1: ruleImport returns [EObject current=null] : ( 'import' ( (lv_importURI_1_0= RULE_STRING ) ) ';' ) ;
    public final EObject ruleImport() throws RecognitionException {
        EObject current = null;

        Token lv_importURI_1_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:168:6: ( ( 'import' ( (lv_importURI_1_0= RULE_STRING ) ) ';' ) )
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:169:1: ( 'import' ( (lv_importURI_1_0= RULE_STRING ) ) ';' )
            {
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:169:1: ( 'import' ( (lv_importURI_1_0= RULE_STRING ) ) ';' )
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:169:3: 'import' ( (lv_importURI_1_0= RULE_STRING ) ) ';'
            {
            match(input,11,FOLLOW_11_in_ruleImport241); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getImportAccess().getImportKeyword_0(), null); 
                  
            }
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:173:1: ( (lv_importURI_1_0= RULE_STRING ) )
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:174:1: (lv_importURI_1_0= RULE_STRING )
            {
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:174:1: (lv_importURI_1_0= RULE_STRING )
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:175:3: lv_importURI_1_0= RULE_STRING
            {
            lv_importURI_1_0=(Token)input.LT(1);
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleImport258); if (failed) return current;
            if ( backtracking==0 ) {

              			createLeafNode(grammarAccess.getImportAccess().getImportURISTRINGTerminalRuleCall_1_0(), "importURI"); 
              		
            }
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getImportRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode, current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"importURI",
              	        		lv_importURI_1_0, 
              	        		"STRING", 
              	        		lastConsumedNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	    
            }

            }


            }

            match(input,12,FOLLOW_12_in_ruleImport273); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getImportAccess().getSemicolonKeyword_2(), null); 
                  
            }

            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
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
    // $ANTLR end ruleImport


    // $ANTLR start entryRuleTypeDef
    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:209:1: entryRuleTypeDef returns [EObject current=null] : iv_ruleTypeDef= ruleTypeDef EOF ;
    public final EObject entryRuleTypeDef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeDef = null;


        try {
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:210:2: (iv_ruleTypeDef= ruleTypeDef EOF )
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:211:2: iv_ruleTypeDef= ruleTypeDef EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getTypeDefRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleTypeDef_in_entryRuleTypeDef309);
            iv_ruleTypeDef=ruleTypeDef();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleTypeDef; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTypeDef319); if (failed) return current;

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
    // $ANTLR end entryRuleTypeDef


    // $ANTLR start ruleTypeDef
    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:218:1: ruleTypeDef returns [EObject current=null] : ( 'typedef' ( (lv_type_1_0= ruleTypeRef ) ) ( (lv_name_2_0= RULE_ID ) ) ';' ) ;
    public final EObject ruleTypeDef() throws RecognitionException {
        EObject current = null;

        Token lv_name_2_0=null;
        EObject lv_type_1_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:223:6: ( ( 'typedef' ( (lv_type_1_0= ruleTypeRef ) ) ( (lv_name_2_0= RULE_ID ) ) ';' ) )
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:224:1: ( 'typedef' ( (lv_type_1_0= ruleTypeRef ) ) ( (lv_name_2_0= RULE_ID ) ) ';' )
            {
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:224:1: ( 'typedef' ( (lv_type_1_0= ruleTypeRef ) ) ( (lv_name_2_0= RULE_ID ) ) ';' )
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:224:3: 'typedef' ( (lv_type_1_0= ruleTypeRef ) ) ( (lv_name_2_0= RULE_ID ) ) ';'
            {
            match(input,13,FOLLOW_13_in_ruleTypeDef354); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getTypeDefAccess().getTypedefKeyword_0(), null); 
                  
            }
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:228:1: ( (lv_type_1_0= ruleTypeRef ) )
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:229:1: (lv_type_1_0= ruleTypeRef )
            {
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:229:1: (lv_type_1_0= ruleTypeRef )
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:230:3: lv_type_1_0= ruleTypeRef
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getTypeDefAccess().getTypeTypeRefParserRuleCall_1_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleTypeRef_in_ruleTypeDef375);
            lv_type_1_0=ruleTypeRef();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getTypeDefRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"type",
              	        		lv_type_1_0, 
              	        		"TypeRef", 
              	        		currentNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	        currentNode = currentNode.getParent();
              	    
            }

            }


            }

            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:252:2: ( (lv_name_2_0= RULE_ID ) )
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:253:1: (lv_name_2_0= RULE_ID )
            {
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:253:1: (lv_name_2_0= RULE_ID )
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:254:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTypeDef392); if (failed) return current;
            if ( backtracking==0 ) {

              			createLeafNode(grammarAccess.getTypeDefAccess().getNameIDTerminalRuleCall_2_0(), "name"); 
              		
            }
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getTypeDefRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode, current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"name",
              	        		lv_name_2_0, 
              	        		"ID", 
              	        		lastConsumedNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	    
            }

            }


            }

            match(input,12,FOLLOW_12_in_ruleTypeDef407); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getTypeDefAccess().getSemicolonKeyword_3(), null); 
                  
            }

            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
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
    // $ANTLR end ruleTypeDef


    // $ANTLR start entryRuleTypeRef
    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:288:1: entryRuleTypeRef returns [EObject current=null] : iv_ruleTypeRef= ruleTypeRef EOF ;
    public final EObject entryRuleTypeRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeRef = null;


        try {
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:289:2: (iv_ruleTypeRef= ruleTypeRef EOF )
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:290:2: iv_ruleTypeRef= ruleTypeRef EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getTypeRefRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleTypeRef_in_entryRuleTypeRef443);
            iv_ruleTypeRef=ruleTypeRef();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleTypeRef; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTypeRef453); if (failed) return current;

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
    // $ANTLR end entryRuleTypeRef


    // $ANTLR start ruleTypeRef
    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:297:1: ruleTypeRef returns [EObject current=null] : ( (this_PrimitiveTypeRef_0= rulePrimitiveTypeRef ( (lv_isArray_1_0= '[]' ) )? ) | (this_SequenceType_2= ruleSequenceType ( (lv_isArray_3_0= '[]' ) )? ) | (this_UserTypeRef_4= ruleUserTypeRef ( (lv_isArray_5_0= '[]' ) )? ) ) ;
    public final EObject ruleTypeRef() throws RecognitionException {
        EObject current = null;

        Token lv_isArray_1_0=null;
        Token lv_isArray_3_0=null;
        Token lv_isArray_5_0=null;
        EObject this_PrimitiveTypeRef_0 = null;

        EObject this_SequenceType_2 = null;

        EObject this_UserTypeRef_4 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:302:6: ( ( (this_PrimitiveTypeRef_0= rulePrimitiveTypeRef ( (lv_isArray_1_0= '[]' ) )? ) | (this_SequenceType_2= ruleSequenceType ( (lv_isArray_3_0= '[]' ) )? ) | (this_UserTypeRef_4= ruleUserTypeRef ( (lv_isArray_5_0= '[]' ) )? ) ) )
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:303:1: ( (this_PrimitiveTypeRef_0= rulePrimitiveTypeRef ( (lv_isArray_1_0= '[]' ) )? ) | (this_SequenceType_2= ruleSequenceType ( (lv_isArray_3_0= '[]' ) )? ) | (this_UserTypeRef_4= ruleUserTypeRef ( (lv_isArray_5_0= '[]' ) )? ) )
            {
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:303:1: ( (this_PrimitiveTypeRef_0= rulePrimitiveTypeRef ( (lv_isArray_1_0= '[]' ) )? ) | (this_SequenceType_2= ruleSequenceType ( (lv_isArray_3_0= '[]' ) )? ) | (this_UserTypeRef_4= ruleUserTypeRef ( (lv_isArray_5_0= '[]' ) )? ) )
            int alt6=3;
            switch ( input.LA(1) ) {
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
                {
                alt6=1;
                }
                break;
            case 29:
                {
                alt6=2;
                }
                break;
            case RULE_ID:
                {
                alt6=3;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("303:1: ( (this_PrimitiveTypeRef_0= rulePrimitiveTypeRef ( (lv_isArray_1_0= '[]' ) )? ) | (this_SequenceType_2= ruleSequenceType ( (lv_isArray_3_0= '[]' ) )? ) | (this_UserTypeRef_4= ruleUserTypeRef ( (lv_isArray_5_0= '[]' ) )? ) )", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:303:2: (this_PrimitiveTypeRef_0= rulePrimitiveTypeRef ( (lv_isArray_1_0= '[]' ) )? )
                    {
                    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:303:2: (this_PrimitiveTypeRef_0= rulePrimitiveTypeRef ( (lv_isArray_1_0= '[]' ) )? )
                    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:304:2: this_PrimitiveTypeRef_0= rulePrimitiveTypeRef ( (lv_isArray_1_0= '[]' ) )?
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getTypeRefAccess().getPrimitiveTypeRefParserRuleCall_0_0(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_rulePrimitiveTypeRef_in_ruleTypeRef504);
                    this_PrimitiveTypeRef_0=rulePrimitiveTypeRef();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_PrimitiveTypeRef_0; 
                              currentNode = currentNode.getParent();
                          
                    }
                    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:315:1: ( (lv_isArray_1_0= '[]' ) )?
                    int alt3=2;
                    int LA3_0 = input.LA(1);

                    if ( (LA3_0==14) ) {
                        alt3=1;
                    }
                    switch (alt3) {
                        case 1 :
                            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:316:1: (lv_isArray_1_0= '[]' )
                            {
                            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:316:1: (lv_isArray_1_0= '[]' )
                            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:317:3: lv_isArray_1_0= '[]'
                            {
                            lv_isArray_1_0=(Token)input.LT(1);
                            match(input,14,FOLLOW_14_in_ruleTypeRef521); if (failed) return current;
                            if ( backtracking==0 ) {

                                      createLeafNode(grammarAccess.getTypeRefAccess().getIsArrayLeftSquareBracketRightSquareBracketKeyword_0_1_0(), "isArray"); 
                                  
                            }
                            if ( backtracking==0 ) {

                              	        if (current==null) {
                              	            current = factory.create(grammarAccess.getTypeRefRule().getType().getClassifier());
                              	            associateNodeWithAstElement(currentNode, current);
                              	        }
                              	        
                              	        try {
                              	       		set(current, "isArray", true, "[]", lastConsumedNode);
                              	        } catch (ValueConverterException vce) {
                              				handleValueConverterException(vce);
                              	        }
                              	    
                            }

                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:337:6: (this_SequenceType_2= ruleSequenceType ( (lv_isArray_3_0= '[]' ) )? )
                    {
                    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:337:6: (this_SequenceType_2= ruleSequenceType ( (lv_isArray_3_0= '[]' ) )? )
                    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:338:2: this_SequenceType_2= ruleSequenceType ( (lv_isArray_3_0= '[]' ) )?
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getTypeRefAccess().getSequenceTypeParserRuleCall_1_0(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleSequenceType_in_ruleTypeRef568);
                    this_SequenceType_2=ruleSequenceType();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_SequenceType_2; 
                              currentNode = currentNode.getParent();
                          
                    }
                    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:349:1: ( (lv_isArray_3_0= '[]' ) )?
                    int alt4=2;
                    int LA4_0 = input.LA(1);

                    if ( (LA4_0==14) ) {
                        alt4=1;
                    }
                    switch (alt4) {
                        case 1 :
                            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:350:1: (lv_isArray_3_0= '[]' )
                            {
                            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:350:1: (lv_isArray_3_0= '[]' )
                            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:351:3: lv_isArray_3_0= '[]'
                            {
                            lv_isArray_3_0=(Token)input.LT(1);
                            match(input,14,FOLLOW_14_in_ruleTypeRef585); if (failed) return current;
                            if ( backtracking==0 ) {

                                      createLeafNode(grammarAccess.getTypeRefAccess().getIsArrayLeftSquareBracketRightSquareBracketKeyword_1_1_0(), "isArray"); 
                                  
                            }
                            if ( backtracking==0 ) {

                              	        if (current==null) {
                              	            current = factory.create(grammarAccess.getTypeRefRule().getType().getClassifier());
                              	            associateNodeWithAstElement(currentNode, current);
                              	        }
                              	        
                              	        try {
                              	       		set(current, "isArray", true, "[]", lastConsumedNode);
                              	        } catch (ValueConverterException vce) {
                              				handleValueConverterException(vce);
                              	        }
                              	    
                            }

                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 3 :
                    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:371:6: (this_UserTypeRef_4= ruleUserTypeRef ( (lv_isArray_5_0= '[]' ) )? )
                    {
                    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:371:6: (this_UserTypeRef_4= ruleUserTypeRef ( (lv_isArray_5_0= '[]' ) )? )
                    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:372:2: this_UserTypeRef_4= ruleUserTypeRef ( (lv_isArray_5_0= '[]' ) )?
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getTypeRefAccess().getUserTypeRefParserRuleCall_2_0(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleUserTypeRef_in_ruleTypeRef632);
                    this_UserTypeRef_4=ruleUserTypeRef();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_UserTypeRef_4; 
                              currentNode = currentNode.getParent();
                          
                    }
                    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:383:1: ( (lv_isArray_5_0= '[]' ) )?
                    int alt5=2;
                    int LA5_0 = input.LA(1);

                    if ( (LA5_0==14) ) {
                        alt5=1;
                    }
                    switch (alt5) {
                        case 1 :
                            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:384:1: (lv_isArray_5_0= '[]' )
                            {
                            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:384:1: (lv_isArray_5_0= '[]' )
                            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:385:3: lv_isArray_5_0= '[]'
                            {
                            lv_isArray_5_0=(Token)input.LT(1);
                            match(input,14,FOLLOW_14_in_ruleTypeRef649); if (failed) return current;
                            if ( backtracking==0 ) {

                                      createLeafNode(grammarAccess.getTypeRefAccess().getIsArrayLeftSquareBracketRightSquareBracketKeyword_2_1_0(), "isArray"); 
                                  
                            }
                            if ( backtracking==0 ) {

                              	        if (current==null) {
                              	            current = factory.create(grammarAccess.getTypeRefRule().getType().getClassifier());
                              	            associateNodeWithAstElement(currentNode, current);
                              	        }
                              	        
                              	        try {
                              	       		set(current, "isArray", true, "[]", lastConsumedNode);
                              	        } catch (ValueConverterException vce) {
                              				handleValueConverterException(vce);
                              	        }
                              	    
                            }

                            }


                            }
                            break;

                    }


                    }


                    }
                    break;

            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
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
    // $ANTLR end ruleTypeRef


    // $ANTLR start entryRuleUserTypeRef
    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:412:1: entryRuleUserTypeRef returns [EObject current=null] : iv_ruleUserTypeRef= ruleUserTypeRef EOF ;
    public final EObject entryRuleUserTypeRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUserTypeRef = null;


        try {
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:413:2: (iv_ruleUserTypeRef= ruleUserTypeRef EOF )
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:414:2: iv_ruleUserTypeRef= ruleUserTypeRef EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getUserTypeRefRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleUserTypeRef_in_entryRuleUserTypeRef700);
            iv_ruleUserTypeRef=ruleUserTypeRef();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleUserTypeRef; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleUserTypeRef710); if (failed) return current;

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
    // $ANTLR end entryRuleUserTypeRef


    // $ANTLR start ruleUserTypeRef
    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:421:1: ruleUserTypeRef returns [EObject current=null] : ( ( ruleScopedName ) ) ;
    public final EObject ruleUserTypeRef() throws RecognitionException {
        EObject current = null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:426:6: ( ( ( ruleScopedName ) ) )
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:427:1: ( ( ruleScopedName ) )
            {
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:427:1: ( ( ruleScopedName ) )
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:428:1: ( ruleScopedName )
            {
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:428:1: ( ruleScopedName )
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:429:3: ruleScopedName
            {
            if ( backtracking==0 ) {
               
              		  /* */ 
              		
            }
            if ( backtracking==0 ) {

              			if (current==null) {
              	            current = factory.create(grammarAccess.getUserTypeRefRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode, current);
              	        }
                      
            }
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getUserTypeRefAccess().getTypeTypesCrossReference_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleScopedName_in_ruleUserTypeRef761);
            ruleScopedName();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               
              	        currentNode = currentNode.getParent();
              	    
            }

            }


            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
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
    // $ANTLR end ruleUserTypeRef


    // $ANTLR start entryRulePrimitiveTypeRef
    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:456:1: entryRulePrimitiveTypeRef returns [EObject current=null] : iv_rulePrimitiveTypeRef= rulePrimitiveTypeRef EOF ;
    public final EObject entryRulePrimitiveTypeRef() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimitiveTypeRef = null;


        try {
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:457:2: (iv_rulePrimitiveTypeRef= rulePrimitiveTypeRef EOF )
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:458:2: iv_rulePrimitiveTypeRef= rulePrimitiveTypeRef EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getPrimitiveTypeRefRule(), currentNode); 
            }
            pushFollow(FOLLOW_rulePrimitiveTypeRef_in_entryRulePrimitiveTypeRef798);
            iv_rulePrimitiveTypeRef=rulePrimitiveTypeRef();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_rulePrimitiveTypeRef; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePrimitiveTypeRef808); if (failed) return current;

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
    // $ANTLR end entryRulePrimitiveTypeRef


    // $ANTLR start rulePrimitiveTypeRef
    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:465:1: rulePrimitiveTypeRef returns [EObject current=null] : ( ( (lv_unsigned_0_0= 'unsigned' ) )? ( ( (lv_name_1_1= 'void' | lv_name_1_2= 'boolean' | lv_name_1_3= 'byte' | lv_name_1_4= 'double' | lv_name_1_5= 'float' | lv_name_1_6= 'short' | lv_name_1_7= 'long' | lv_name_1_8= 'Object' | lv_name_1_9= 'object' | lv_name_1_10= 'any' | lv_name_1_11= 'octet' | lv_name_1_12= 'DOMString' ) ) )+ ( (lv_nullable_2_0= '?' ) )? ) ;
    public final EObject rulePrimitiveTypeRef() throws RecognitionException {
        EObject current = null;

        Token lv_unsigned_0_0=null;
        Token lv_name_1_1=null;
        Token lv_name_1_2=null;
        Token lv_name_1_3=null;
        Token lv_name_1_4=null;
        Token lv_name_1_5=null;
        Token lv_name_1_6=null;
        Token lv_name_1_7=null;
        Token lv_name_1_8=null;
        Token lv_name_1_9=null;
        Token lv_name_1_10=null;
        Token lv_name_1_11=null;
        Token lv_name_1_12=null;
        Token lv_nullable_2_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:470:6: ( ( ( (lv_unsigned_0_0= 'unsigned' ) )? ( ( (lv_name_1_1= 'void' | lv_name_1_2= 'boolean' | lv_name_1_3= 'byte' | lv_name_1_4= 'double' | lv_name_1_5= 'float' | lv_name_1_6= 'short' | lv_name_1_7= 'long' | lv_name_1_8= 'Object' | lv_name_1_9= 'object' | lv_name_1_10= 'any' | lv_name_1_11= 'octet' | lv_name_1_12= 'DOMString' ) ) )+ ( (lv_nullable_2_0= '?' ) )? ) )
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:471:1: ( ( (lv_unsigned_0_0= 'unsigned' ) )? ( ( (lv_name_1_1= 'void' | lv_name_1_2= 'boolean' | lv_name_1_3= 'byte' | lv_name_1_4= 'double' | lv_name_1_5= 'float' | lv_name_1_6= 'short' | lv_name_1_7= 'long' | lv_name_1_8= 'Object' | lv_name_1_9= 'object' | lv_name_1_10= 'any' | lv_name_1_11= 'octet' | lv_name_1_12= 'DOMString' ) ) )+ ( (lv_nullable_2_0= '?' ) )? )
            {
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:471:1: ( ( (lv_unsigned_0_0= 'unsigned' ) )? ( ( (lv_name_1_1= 'void' | lv_name_1_2= 'boolean' | lv_name_1_3= 'byte' | lv_name_1_4= 'double' | lv_name_1_5= 'float' | lv_name_1_6= 'short' | lv_name_1_7= 'long' | lv_name_1_8= 'Object' | lv_name_1_9= 'object' | lv_name_1_10= 'any' | lv_name_1_11= 'octet' | lv_name_1_12= 'DOMString' ) ) )+ ( (lv_nullable_2_0= '?' ) )? )
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:471:2: ( (lv_unsigned_0_0= 'unsigned' ) )? ( ( (lv_name_1_1= 'void' | lv_name_1_2= 'boolean' | lv_name_1_3= 'byte' | lv_name_1_4= 'double' | lv_name_1_5= 'float' | lv_name_1_6= 'short' | lv_name_1_7= 'long' | lv_name_1_8= 'Object' | lv_name_1_9= 'object' | lv_name_1_10= 'any' | lv_name_1_11= 'octet' | lv_name_1_12= 'DOMString' ) ) )+ ( (lv_nullable_2_0= '?' ) )?
            {
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:471:2: ( (lv_unsigned_0_0= 'unsigned' ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==15) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:472:1: (lv_unsigned_0_0= 'unsigned' )
                    {
                    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:472:1: (lv_unsigned_0_0= 'unsigned' )
                    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:473:3: lv_unsigned_0_0= 'unsigned'
                    {
                    lv_unsigned_0_0=(Token)input.LT(1);
                    match(input,15,FOLLOW_15_in_rulePrimitiveTypeRef851); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getPrimitiveTypeRefAccess().getUnsignedUnsignedKeyword_0_0(), "unsigned"); 
                          
                    }
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getPrimitiveTypeRefRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode, current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "unsigned", true, "unsigned", lastConsumedNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:492:3: ( ( (lv_name_1_1= 'void' | lv_name_1_2= 'boolean' | lv_name_1_3= 'byte' | lv_name_1_4= 'double' | lv_name_1_5= 'float' | lv_name_1_6= 'short' | lv_name_1_7= 'long' | lv_name_1_8= 'Object' | lv_name_1_9= 'object' | lv_name_1_10= 'any' | lv_name_1_11= 'octet' | lv_name_1_12= 'DOMString' ) ) )+
            int cnt9=0;
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>=16 && LA9_0<=27)) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:493:1: ( (lv_name_1_1= 'void' | lv_name_1_2= 'boolean' | lv_name_1_3= 'byte' | lv_name_1_4= 'double' | lv_name_1_5= 'float' | lv_name_1_6= 'short' | lv_name_1_7= 'long' | lv_name_1_8= 'Object' | lv_name_1_9= 'object' | lv_name_1_10= 'any' | lv_name_1_11= 'octet' | lv_name_1_12= 'DOMString' ) )
            	    {
            	    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:493:1: ( (lv_name_1_1= 'void' | lv_name_1_2= 'boolean' | lv_name_1_3= 'byte' | lv_name_1_4= 'double' | lv_name_1_5= 'float' | lv_name_1_6= 'short' | lv_name_1_7= 'long' | lv_name_1_8= 'Object' | lv_name_1_9= 'object' | lv_name_1_10= 'any' | lv_name_1_11= 'octet' | lv_name_1_12= 'DOMString' ) )
            	    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:494:1: (lv_name_1_1= 'void' | lv_name_1_2= 'boolean' | lv_name_1_3= 'byte' | lv_name_1_4= 'double' | lv_name_1_5= 'float' | lv_name_1_6= 'short' | lv_name_1_7= 'long' | lv_name_1_8= 'Object' | lv_name_1_9= 'object' | lv_name_1_10= 'any' | lv_name_1_11= 'octet' | lv_name_1_12= 'DOMString' )
            	    {
            	    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:494:1: (lv_name_1_1= 'void' | lv_name_1_2= 'boolean' | lv_name_1_3= 'byte' | lv_name_1_4= 'double' | lv_name_1_5= 'float' | lv_name_1_6= 'short' | lv_name_1_7= 'long' | lv_name_1_8= 'Object' | lv_name_1_9= 'object' | lv_name_1_10= 'any' | lv_name_1_11= 'octet' | lv_name_1_12= 'DOMString' )
            	    int alt8=12;
            	    switch ( input.LA(1) ) {
            	    case 16:
            	        {
            	        alt8=1;
            	        }
            	        break;
            	    case 17:
            	        {
            	        alt8=2;
            	        }
            	        break;
            	    case 18:
            	        {
            	        alt8=3;
            	        }
            	        break;
            	    case 19:
            	        {
            	        alt8=4;
            	        }
            	        break;
            	    case 20:
            	        {
            	        alt8=5;
            	        }
            	        break;
            	    case 21:
            	        {
            	        alt8=6;
            	        }
            	        break;
            	    case 22:
            	        {
            	        alt8=7;
            	        }
            	        break;
            	    case 23:
            	        {
            	        alt8=8;
            	        }
            	        break;
            	    case 24:
            	        {
            	        alt8=9;
            	        }
            	        break;
            	    case 25:
            	        {
            	        alt8=10;
            	        }
            	        break;
            	    case 26:
            	        {
            	        alt8=11;
            	        }
            	        break;
            	    case 27:
            	        {
            	        alt8=12;
            	        }
            	        break;
            	    default:
            	        if (backtracking>0) {failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("494:1: (lv_name_1_1= 'void' | lv_name_1_2= 'boolean' | lv_name_1_3= 'byte' | lv_name_1_4= 'double' | lv_name_1_5= 'float' | lv_name_1_6= 'short' | lv_name_1_7= 'long' | lv_name_1_8= 'Object' | lv_name_1_9= 'object' | lv_name_1_10= 'any' | lv_name_1_11= 'octet' | lv_name_1_12= 'DOMString' )", 8, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt8) {
            	        case 1 :
            	            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:495:3: lv_name_1_1= 'void'
            	            {
            	            lv_name_1_1=(Token)input.LT(1);
            	            match(input,16,FOLLOW_16_in_rulePrimitiveTypeRef885); if (failed) return current;
            	            if ( backtracking==0 ) {

            	                      createLeafNode(grammarAccess.getPrimitiveTypeRefAccess().getNameVoidKeyword_1_0_0(), "name"); 
            	                  
            	            }
            	            if ( backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = factory.create(grammarAccess.getPrimitiveTypeRefRule().getType().getClassifier());
            	              	            associateNodeWithAstElement(currentNode, current);
            	              	        }
            	              	        
            	              	        try {
            	              	       		set(current, "name", lv_name_1_1, null, lastConsumedNode);
            	              	        } catch (ValueConverterException vce) {
            	              				handleValueConverterException(vce);
            	              	        }
            	              	    
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:513:8: lv_name_1_2= 'boolean'
            	            {
            	            lv_name_1_2=(Token)input.LT(1);
            	            match(input,17,FOLLOW_17_in_rulePrimitiveTypeRef914); if (failed) return current;
            	            if ( backtracking==0 ) {

            	                      createLeafNode(grammarAccess.getPrimitiveTypeRefAccess().getNameBooleanKeyword_1_0_1(), "name"); 
            	                  
            	            }
            	            if ( backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = factory.create(grammarAccess.getPrimitiveTypeRefRule().getType().getClassifier());
            	              	            associateNodeWithAstElement(currentNode, current);
            	              	        }
            	              	        
            	              	        try {
            	              	       		set(current, "name", lv_name_1_2, null, lastConsumedNode);
            	              	        } catch (ValueConverterException vce) {
            	              				handleValueConverterException(vce);
            	              	        }
            	              	    
            	            }

            	            }
            	            break;
            	        case 3 :
            	            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:531:8: lv_name_1_3= 'byte'
            	            {
            	            lv_name_1_3=(Token)input.LT(1);
            	            match(input,18,FOLLOW_18_in_rulePrimitiveTypeRef943); if (failed) return current;
            	            if ( backtracking==0 ) {

            	                      createLeafNode(grammarAccess.getPrimitiveTypeRefAccess().getNameByteKeyword_1_0_2(), "name"); 
            	                  
            	            }
            	            if ( backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = factory.create(grammarAccess.getPrimitiveTypeRefRule().getType().getClassifier());
            	              	            associateNodeWithAstElement(currentNode, current);
            	              	        }
            	              	        
            	              	        try {
            	              	       		set(current, "name", lv_name_1_3, null, lastConsumedNode);
            	              	        } catch (ValueConverterException vce) {
            	              				handleValueConverterException(vce);
            	              	        }
            	              	    
            	            }

            	            }
            	            break;
            	        case 4 :
            	            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:549:8: lv_name_1_4= 'double'
            	            {
            	            lv_name_1_4=(Token)input.LT(1);
            	            match(input,19,FOLLOW_19_in_rulePrimitiveTypeRef972); if (failed) return current;
            	            if ( backtracking==0 ) {

            	                      createLeafNode(grammarAccess.getPrimitiveTypeRefAccess().getNameDoubleKeyword_1_0_3(), "name"); 
            	                  
            	            }
            	            if ( backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = factory.create(grammarAccess.getPrimitiveTypeRefRule().getType().getClassifier());
            	              	            associateNodeWithAstElement(currentNode, current);
            	              	        }
            	              	        
            	              	        try {
            	              	       		set(current, "name", lv_name_1_4, null, lastConsumedNode);
            	              	        } catch (ValueConverterException vce) {
            	              				handleValueConverterException(vce);
            	              	        }
            	              	    
            	            }

            	            }
            	            break;
            	        case 5 :
            	            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:567:8: lv_name_1_5= 'float'
            	            {
            	            lv_name_1_5=(Token)input.LT(1);
            	            match(input,20,FOLLOW_20_in_rulePrimitiveTypeRef1001); if (failed) return current;
            	            if ( backtracking==0 ) {

            	                      createLeafNode(grammarAccess.getPrimitiveTypeRefAccess().getNameFloatKeyword_1_0_4(), "name"); 
            	                  
            	            }
            	            if ( backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = factory.create(grammarAccess.getPrimitiveTypeRefRule().getType().getClassifier());
            	              	            associateNodeWithAstElement(currentNode, current);
            	              	        }
            	              	        
            	              	        try {
            	              	       		set(current, "name", lv_name_1_5, null, lastConsumedNode);
            	              	        } catch (ValueConverterException vce) {
            	              				handleValueConverterException(vce);
            	              	        }
            	              	    
            	            }

            	            }
            	            break;
            	        case 6 :
            	            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:585:8: lv_name_1_6= 'short'
            	            {
            	            lv_name_1_6=(Token)input.LT(1);
            	            match(input,21,FOLLOW_21_in_rulePrimitiveTypeRef1030); if (failed) return current;
            	            if ( backtracking==0 ) {

            	                      createLeafNode(grammarAccess.getPrimitiveTypeRefAccess().getNameShortKeyword_1_0_5(), "name"); 
            	                  
            	            }
            	            if ( backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = factory.create(grammarAccess.getPrimitiveTypeRefRule().getType().getClassifier());
            	              	            associateNodeWithAstElement(currentNode, current);
            	              	        }
            	              	        
            	              	        try {
            	              	       		set(current, "name", lv_name_1_6, null, lastConsumedNode);
            	              	        } catch (ValueConverterException vce) {
            	              				handleValueConverterException(vce);
            	              	        }
            	              	    
            	            }

            	            }
            	            break;
            	        case 7 :
            	            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:603:8: lv_name_1_7= 'long'
            	            {
            	            lv_name_1_7=(Token)input.LT(1);
            	            match(input,22,FOLLOW_22_in_rulePrimitiveTypeRef1059); if (failed) return current;
            	            if ( backtracking==0 ) {

            	                      createLeafNode(grammarAccess.getPrimitiveTypeRefAccess().getNameLongKeyword_1_0_6(), "name"); 
            	                  
            	            }
            	            if ( backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = factory.create(grammarAccess.getPrimitiveTypeRefRule().getType().getClassifier());
            	              	            associateNodeWithAstElement(currentNode, current);
            	              	        }
            	              	        
            	              	        try {
            	              	       		set(current, "name", lv_name_1_7, null, lastConsumedNode);
            	              	        } catch (ValueConverterException vce) {
            	              				handleValueConverterException(vce);
            	              	        }
            	              	    
            	            }

            	            }
            	            break;
            	        case 8 :
            	            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:621:8: lv_name_1_8= 'Object'
            	            {
            	            lv_name_1_8=(Token)input.LT(1);
            	            match(input,23,FOLLOW_23_in_rulePrimitiveTypeRef1088); if (failed) return current;
            	            if ( backtracking==0 ) {

            	                      createLeafNode(grammarAccess.getPrimitiveTypeRefAccess().getNameObjectKeyword_1_0_7(), "name"); 
            	                  
            	            }
            	            if ( backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = factory.create(grammarAccess.getPrimitiveTypeRefRule().getType().getClassifier());
            	              	            associateNodeWithAstElement(currentNode, current);
            	              	        }
            	              	        
            	              	        try {
            	              	       		set(current, "name", lv_name_1_8, null, lastConsumedNode);
            	              	        } catch (ValueConverterException vce) {
            	              				handleValueConverterException(vce);
            	              	        }
            	              	    
            	            }

            	            }
            	            break;
            	        case 9 :
            	            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:639:8: lv_name_1_9= 'object'
            	            {
            	            lv_name_1_9=(Token)input.LT(1);
            	            match(input,24,FOLLOW_24_in_rulePrimitiveTypeRef1117); if (failed) return current;
            	            if ( backtracking==0 ) {

            	                      createLeafNode(grammarAccess.getPrimitiveTypeRefAccess().getNameObjectKeyword_1_0_8(), "name"); 
            	                  
            	            }
            	            if ( backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = factory.create(grammarAccess.getPrimitiveTypeRefRule().getType().getClassifier());
            	              	            associateNodeWithAstElement(currentNode, current);
            	              	        }
            	              	        
            	              	        try {
            	              	       		set(current, "name", lv_name_1_9, null, lastConsumedNode);
            	              	        } catch (ValueConverterException vce) {
            	              				handleValueConverterException(vce);
            	              	        }
            	              	    
            	            }

            	            }
            	            break;
            	        case 10 :
            	            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:657:8: lv_name_1_10= 'any'
            	            {
            	            lv_name_1_10=(Token)input.LT(1);
            	            match(input,25,FOLLOW_25_in_rulePrimitiveTypeRef1146); if (failed) return current;
            	            if ( backtracking==0 ) {

            	                      createLeafNode(grammarAccess.getPrimitiveTypeRefAccess().getNameAnyKeyword_1_0_9(), "name"); 
            	                  
            	            }
            	            if ( backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = factory.create(grammarAccess.getPrimitiveTypeRefRule().getType().getClassifier());
            	              	            associateNodeWithAstElement(currentNode, current);
            	              	        }
            	              	        
            	              	        try {
            	              	       		set(current, "name", lv_name_1_10, null, lastConsumedNode);
            	              	        } catch (ValueConverterException vce) {
            	              				handleValueConverterException(vce);
            	              	        }
            	              	    
            	            }

            	            }
            	            break;
            	        case 11 :
            	            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:675:8: lv_name_1_11= 'octet'
            	            {
            	            lv_name_1_11=(Token)input.LT(1);
            	            match(input,26,FOLLOW_26_in_rulePrimitiveTypeRef1175); if (failed) return current;
            	            if ( backtracking==0 ) {

            	                      createLeafNode(grammarAccess.getPrimitiveTypeRefAccess().getNameOctetKeyword_1_0_10(), "name"); 
            	                  
            	            }
            	            if ( backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = factory.create(grammarAccess.getPrimitiveTypeRefRule().getType().getClassifier());
            	              	            associateNodeWithAstElement(currentNode, current);
            	              	        }
            	              	        
            	              	        try {
            	              	       		set(current, "name", lv_name_1_11, null, lastConsumedNode);
            	              	        } catch (ValueConverterException vce) {
            	              				handleValueConverterException(vce);
            	              	        }
            	              	    
            	            }

            	            }
            	            break;
            	        case 12 :
            	            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:693:8: lv_name_1_12= 'DOMString'
            	            {
            	            lv_name_1_12=(Token)input.LT(1);
            	            match(input,27,FOLLOW_27_in_rulePrimitiveTypeRef1204); if (failed) return current;
            	            if ( backtracking==0 ) {

            	                      createLeafNode(grammarAccess.getPrimitiveTypeRefAccess().getNameDOMStringKeyword_1_0_11(), "name"); 
            	                  
            	            }
            	            if ( backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = factory.create(grammarAccess.getPrimitiveTypeRefRule().getType().getClassifier());
            	              	            associateNodeWithAstElement(currentNode, current);
            	              	        }
            	              	        
            	              	        try {
            	              	       		set(current, "name", lv_name_1_12, null, lastConsumedNode);
            	              	        } catch (ValueConverterException vce) {
            	              				handleValueConverterException(vce);
            	              	        }
            	              	    
            	            }

            	            }
            	            break;

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt9 >= 1 ) break loop9;
            	    if (backtracking>0) {failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(9, input);
                        throw eee;
                }
                cnt9++;
            } while (true);

            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:714:3: ( (lv_nullable_2_0= '?' ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==28) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:715:1: (lv_nullable_2_0= '?' )
                    {
                    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:715:1: (lv_nullable_2_0= '?' )
                    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:716:3: lv_nullable_2_0= '?'
                    {
                    lv_nullable_2_0=(Token)input.LT(1);
                    match(input,28,FOLLOW_28_in_rulePrimitiveTypeRef1239); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getPrimitiveTypeRefAccess().getNullableQuestionMarkKeyword_2_0(), "nullable"); 
                          
                    }
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getPrimitiveTypeRefRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode, current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "nullable", true, "?", lastConsumedNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	    
                    }

                    }


                    }
                    break;

            }


            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
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
    // $ANTLR end rulePrimitiveTypeRef


    // $ANTLR start entryRuleSequenceType
    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:743:1: entryRuleSequenceType returns [EObject current=null] : iv_ruleSequenceType= ruleSequenceType EOF ;
    public final EObject entryRuleSequenceType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSequenceType = null;


        try {
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:744:2: (iv_ruleSequenceType= ruleSequenceType EOF )
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:745:2: iv_ruleSequenceType= ruleSequenceType EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getSequenceTypeRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleSequenceType_in_entryRuleSequenceType1289);
            iv_ruleSequenceType=ruleSequenceType();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleSequenceType; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSequenceType1299); if (failed) return current;

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
    // $ANTLR end entryRuleSequenceType


    // $ANTLR start ruleSequenceType
    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:752:1: ruleSequenceType returns [EObject current=null] : ( 'sequence<' ( (lv_type_1_0= ruleTypeRef ) ) '>' ( (lv_nullable_3_0= '?' ) )? ) ;
    public final EObject ruleSequenceType() throws RecognitionException {
        EObject current = null;

        Token lv_nullable_3_0=null;
        EObject lv_type_1_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:757:6: ( ( 'sequence<' ( (lv_type_1_0= ruleTypeRef ) ) '>' ( (lv_nullable_3_0= '?' ) )? ) )
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:758:1: ( 'sequence<' ( (lv_type_1_0= ruleTypeRef ) ) '>' ( (lv_nullable_3_0= '?' ) )? )
            {
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:758:1: ( 'sequence<' ( (lv_type_1_0= ruleTypeRef ) ) '>' ( (lv_nullable_3_0= '?' ) )? )
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:758:3: 'sequence<' ( (lv_type_1_0= ruleTypeRef ) ) '>' ( (lv_nullable_3_0= '?' ) )?
            {
            match(input,29,FOLLOW_29_in_ruleSequenceType1334); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getSequenceTypeAccess().getSequenceKeyword_0(), null); 
                  
            }
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:762:1: ( (lv_type_1_0= ruleTypeRef ) )
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:763:1: (lv_type_1_0= ruleTypeRef )
            {
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:763:1: (lv_type_1_0= ruleTypeRef )
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:764:3: lv_type_1_0= ruleTypeRef
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getSequenceTypeAccess().getTypeTypeRefParserRuleCall_1_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleTypeRef_in_ruleSequenceType1355);
            lv_type_1_0=ruleTypeRef();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getSequenceTypeRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"type",
              	        		lv_type_1_0, 
              	        		"TypeRef", 
              	        		currentNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	        currentNode = currentNode.getParent();
              	    
            }

            }


            }

            match(input,30,FOLLOW_30_in_ruleSequenceType1365); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getSequenceTypeAccess().getGreaterThanSignKeyword_2(), null); 
                  
            }
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:790:1: ( (lv_nullable_3_0= '?' ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==28) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:791:1: (lv_nullable_3_0= '?' )
                    {
                    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:791:1: (lv_nullable_3_0= '?' )
                    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:792:3: lv_nullable_3_0= '?'
                    {
                    lv_nullable_3_0=(Token)input.LT(1);
                    match(input,28,FOLLOW_28_in_ruleSequenceType1383); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getSequenceTypeAccess().getNullableQuestionMarkKeyword_3_0(), "nullable"); 
                          
                    }
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getSequenceTypeRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode, current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "nullable", true, "?", lastConsumedNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	    
                    }

                    }


                    }
                    break;

            }


            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
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
    // $ANTLR end ruleSequenceType


    // $ANTLR start entryRuleScopedName
    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:819:1: entryRuleScopedName returns [String current=null] : iv_ruleScopedName= ruleScopedName EOF ;
    public final String entryRuleScopedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleScopedName = null;


        try {
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:820:2: (iv_ruleScopedName= ruleScopedName EOF )
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:821:2: iv_ruleScopedName= ruleScopedName EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getScopedNameRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleScopedName_in_entryRuleScopedName1434);
            iv_ruleScopedName=ruleScopedName();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleScopedName.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleScopedName1445); if (failed) return current;

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
    // $ANTLR end entryRuleScopedName


    // $ANTLR start ruleScopedName
    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:828:1: ruleScopedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '::' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleScopedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:833:6: ( (this_ID_0= RULE_ID (kw= '::' this_ID_2= RULE_ID )* ) )
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:834:1: (this_ID_0= RULE_ID (kw= '::' this_ID_2= RULE_ID )* )
            {
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:834:1: (this_ID_0= RULE_ID (kw= '::' this_ID_2= RULE_ID )* )
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:834:6: this_ID_0= RULE_ID (kw= '::' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleScopedName1485); if (failed) return current;
            if ( backtracking==0 ) {

              		current.merge(this_ID_0);
                  
            }
            if ( backtracking==0 ) {
               
                  createLeafNode(grammarAccess.getScopedNameAccess().getIDTerminalRuleCall_0(), null); 
                  
            }
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:841:1: (kw= '::' this_ID_2= RULE_ID )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==31) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:842:2: kw= '::' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)input.LT(1);
            	    match(input,31,FOLLOW_31_in_ruleScopedName1504); if (failed) return current;
            	    if ( backtracking==0 ) {

            	              current.merge(kw);
            	              createLeafNode(grammarAccess.getScopedNameAccess().getColonColonKeyword_1_0(), null); 
            	          
            	    }
            	    this_ID_2=(Token)input.LT(1);
            	    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleScopedName1519); if (failed) return current;
            	    if ( backtracking==0 ) {

            	      		current.merge(this_ID_2);
            	          
            	    }
            	    if ( backtracking==0 ) {
            	       
            	          createLeafNode(grammarAccess.getScopedNameAccess().getIDTerminalRuleCall_1_1(), null); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);


            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
              	    lastConsumedNode = currentNode;
                  
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
    // $ANTLR end ruleScopedName


    // $ANTLR start entryRuleConstructor
    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:864:1: entryRuleConstructor returns [EObject current=null] : iv_ruleConstructor= ruleConstructor EOF ;
    public final EObject entryRuleConstructor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstructor = null;


        try {
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:865:2: (iv_ruleConstructor= ruleConstructor EOF )
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:866:2: iv_ruleConstructor= ruleConstructor EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getConstructorRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleConstructor_in_entryRuleConstructor1568);
            iv_ruleConstructor=ruleConstructor();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleConstructor; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleConstructor1578); if (failed) return current;

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
    // $ANTLR end entryRuleConstructor


    // $ANTLR start ruleConstructor
    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:873:1: ruleConstructor returns [EObject current=null] : ( 'Constructor' () ( '(' ( (lv_arguments_3_0= ruleArgument ) ) ( ',' ( (lv_arguments_5_0= ruleArgument ) ) )* ')' )? ) ;
    public final EObject ruleConstructor() throws RecognitionException {
        EObject current = null;

        EObject lv_arguments_3_0 = null;

        EObject lv_arguments_5_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:878:6: ( ( 'Constructor' () ( '(' ( (lv_arguments_3_0= ruleArgument ) ) ( ',' ( (lv_arguments_5_0= ruleArgument ) ) )* ')' )? ) )
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:879:1: ( 'Constructor' () ( '(' ( (lv_arguments_3_0= ruleArgument ) ) ( ',' ( (lv_arguments_5_0= ruleArgument ) ) )* ')' )? )
            {
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:879:1: ( 'Constructor' () ( '(' ( (lv_arguments_3_0= ruleArgument ) ) ( ',' ( (lv_arguments_5_0= ruleArgument ) ) )* ')' )? )
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:879:3: 'Constructor' () ( '(' ( (lv_arguments_3_0= ruleArgument ) ) ( ',' ( (lv_arguments_5_0= ruleArgument ) ) )* ')' )?
            {
            match(input,32,FOLLOW_32_in_ruleConstructor1613); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getConstructorAccess().getConstructorKeyword_0(), null); 
                  
            }
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:883:1: ()
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:884:2: 
            {
            if ( backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( backtracking==0 ) {
               
                      temp=factory.create(grammarAccess.getConstructorAccess().getConstructorAction_1().getType().getClassifier());
                      current = temp; 
                      temp = null;
                      CompositeNode newNode = createCompositeNode(grammarAccess.getConstructorAccess().getConstructorAction_1(), currentNode.getParent());
                  newNode.getChildren().add(currentNode);
                  moveLookaheadInfo(currentNode, newNode);
                  currentNode = newNode; 
                      associateNodeWithAstElement(currentNode, current); 
                  
            }

            }

            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:897:2: ( '(' ( (lv_arguments_3_0= ruleArgument ) ) ( ',' ( (lv_arguments_5_0= ruleArgument ) ) )* ')' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==33) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:897:4: '(' ( (lv_arguments_3_0= ruleArgument ) ) ( ',' ( (lv_arguments_5_0= ruleArgument ) ) )* ')'
                    {
                    match(input,33,FOLLOW_33_in_ruleConstructor1636); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getConstructorAccess().getLeftParenthesisKeyword_2_0(), null); 
                          
                    }
                    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:901:1: ( (lv_arguments_3_0= ruleArgument ) )
                    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:902:1: (lv_arguments_3_0= ruleArgument )
                    {
                    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:902:1: (lv_arguments_3_0= ruleArgument )
                    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:903:3: lv_arguments_3_0= ruleArgument
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getConstructorAccess().getArgumentsArgumentParserRuleCall_2_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleArgument_in_ruleConstructor1657);
                    lv_arguments_3_0=ruleArgument();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getConstructorRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        try {
                      	       		add(
                      	       			current, 
                      	       			"arguments",
                      	        		lv_arguments_3_0, 
                      	        		"Argument", 
                      	        		currentNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }


                    }

                    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:925:2: ( ',' ( (lv_arguments_5_0= ruleArgument ) ) )*
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( (LA13_0==34) ) {
                            alt13=1;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:925:4: ',' ( (lv_arguments_5_0= ruleArgument ) )
                    	    {
                    	    match(input,34,FOLLOW_34_in_ruleConstructor1668); if (failed) return current;
                    	    if ( backtracking==0 ) {

                    	              createLeafNode(grammarAccess.getConstructorAccess().getCommaKeyword_2_2_0(), null); 
                    	          
                    	    }
                    	    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:929:1: ( (lv_arguments_5_0= ruleArgument ) )
                    	    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:930:1: (lv_arguments_5_0= ruleArgument )
                    	    {
                    	    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:930:1: (lv_arguments_5_0= ruleArgument )
                    	    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:931:3: lv_arguments_5_0= ruleArgument
                    	    {
                    	    if ( backtracking==0 ) {
                    	       
                    	      	        currentNode=createCompositeNode(grammarAccess.getConstructorAccess().getArgumentsArgumentParserRuleCall_2_2_1_0(), currentNode); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleArgument_in_ruleConstructor1689);
                    	    lv_arguments_5_0=ruleArgument();
                    	    _fsp--;
                    	    if (failed) return current;
                    	    if ( backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = factory.create(grammarAccess.getConstructorRule().getType().getClassifier());
                    	      	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	      	        }
                    	      	        try {
                    	      	       		add(
                    	      	       			current, 
                    	      	       			"arguments",
                    	      	        		lv_arguments_5_0, 
                    	      	        		"Argument", 
                    	      	        		currentNode);
                    	      	        } catch (ValueConverterException vce) {
                    	      				handleValueConverterException(vce);
                    	      	        }
                    	      	        currentNode = currentNode.getParent();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop13;
                        }
                    } while (true);

                    match(input,35,FOLLOW_35_in_ruleConstructor1701); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getConstructorAccess().getRightParenthesisKeyword_2_3(), null); 
                          
                    }

                    }
                    break;

            }


            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
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
    // $ANTLR end ruleConstructor


    // $ANTLR start entryRuleNamedConstructor
    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:965:1: entryRuleNamedConstructor returns [EObject current=null] : iv_ruleNamedConstructor= ruleNamedConstructor EOF ;
    public final EObject entryRuleNamedConstructor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNamedConstructor = null;


        try {
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:966:2: (iv_ruleNamedConstructor= ruleNamedConstructor EOF )
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:967:2: iv_ruleNamedConstructor= ruleNamedConstructor EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getNamedConstructorRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleNamedConstructor_in_entryRuleNamedConstructor1739);
            iv_ruleNamedConstructor=ruleNamedConstructor();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleNamedConstructor; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNamedConstructor1749); if (failed) return current;

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
    // $ANTLR end entryRuleNamedConstructor


    // $ANTLR start ruleNamedConstructor
    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:974:1: ruleNamedConstructor returns [EObject current=null] : ( 'NamedConstructor' () '=' ( (lv_name_3_0= RULE_ID ) ) ( '(' ( ( (lv_arguments_5_0= ruleArgument ) ) ( ',' ( (lv_arguments_7_0= ruleArgument ) ) )* )? ')' )? ) ;
    public final EObject ruleNamedConstructor() throws RecognitionException {
        EObject current = null;

        Token lv_name_3_0=null;
        EObject lv_arguments_5_0 = null;

        EObject lv_arguments_7_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:979:6: ( ( 'NamedConstructor' () '=' ( (lv_name_3_0= RULE_ID ) ) ( '(' ( ( (lv_arguments_5_0= ruleArgument ) ) ( ',' ( (lv_arguments_7_0= ruleArgument ) ) )* )? ')' )? ) )
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:980:1: ( 'NamedConstructor' () '=' ( (lv_name_3_0= RULE_ID ) ) ( '(' ( ( (lv_arguments_5_0= ruleArgument ) ) ( ',' ( (lv_arguments_7_0= ruleArgument ) ) )* )? ')' )? )
            {
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:980:1: ( 'NamedConstructor' () '=' ( (lv_name_3_0= RULE_ID ) ) ( '(' ( ( (lv_arguments_5_0= ruleArgument ) ) ( ',' ( (lv_arguments_7_0= ruleArgument ) ) )* )? ')' )? )
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:980:3: 'NamedConstructor' () '=' ( (lv_name_3_0= RULE_ID ) ) ( '(' ( ( (lv_arguments_5_0= ruleArgument ) ) ( ',' ( (lv_arguments_7_0= ruleArgument ) ) )* )? ')' )?
            {
            match(input,36,FOLLOW_36_in_ruleNamedConstructor1784); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getNamedConstructorAccess().getNamedConstructorKeyword_0(), null); 
                  
            }
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:984:1: ()
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:985:2: 
            {
            if ( backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( backtracking==0 ) {
               
                      temp=factory.create(grammarAccess.getNamedConstructorAccess().getConstructorAction_1().getType().getClassifier());
                      current = temp; 
                      temp = null;
                      CompositeNode newNode = createCompositeNode(grammarAccess.getNamedConstructorAccess().getConstructorAction_1(), currentNode.getParent());
                  newNode.getChildren().add(currentNode);
                  moveLookaheadInfo(currentNode, newNode);
                  currentNode = newNode; 
                      associateNodeWithAstElement(currentNode, current); 
                  
            }

            }

            match(input,37,FOLLOW_37_in_ruleNamedConstructor1806); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getNamedConstructorAccess().getEqualsSignKeyword_2(), null); 
                  
            }
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:1002:1: ( (lv_name_3_0= RULE_ID ) )
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:1003:1: (lv_name_3_0= RULE_ID )
            {
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:1003:1: (lv_name_3_0= RULE_ID )
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:1004:3: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleNamedConstructor1823); if (failed) return current;
            if ( backtracking==0 ) {

              			createLeafNode(grammarAccess.getNamedConstructorAccess().getNameIDTerminalRuleCall_3_0(), "name"); 
              		
            }
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getNamedConstructorRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode, current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"name",
              	        		lv_name_3_0, 
              	        		"ID", 
              	        		lastConsumedNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	    
            }

            }


            }

            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:1026:2: ( '(' ( ( (lv_arguments_5_0= ruleArgument ) ) ( ',' ( (lv_arguments_7_0= ruleArgument ) ) )* )? ')' )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==33) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:1026:4: '(' ( ( (lv_arguments_5_0= ruleArgument ) ) ( ',' ( (lv_arguments_7_0= ruleArgument ) ) )* )? ')'
                    {
                    match(input,33,FOLLOW_33_in_ruleNamedConstructor1839); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getNamedConstructorAccess().getLeftParenthesisKeyword_4_0(), null); 
                          
                    }
                    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:1030:1: ( ( (lv_arguments_5_0= ruleArgument ) ) ( ',' ( (lv_arguments_7_0= ruleArgument ) ) )* )?
                    int alt16=2;
                    int LA16_0 = input.LA(1);

                    if ( (LA16_0==RULE_ID||(LA16_0>=15 && LA16_0<=27)||LA16_0==29||LA16_0==54||(LA16_0>=76 && LA16_0<=77)) ) {
                        alt16=1;
                    }
                    switch (alt16) {
                        case 1 :
                            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:1030:2: ( (lv_arguments_5_0= ruleArgument ) ) ( ',' ( (lv_arguments_7_0= ruleArgument ) ) )*
                            {
                            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:1030:2: ( (lv_arguments_5_0= ruleArgument ) )
                            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:1031:1: (lv_arguments_5_0= ruleArgument )
                            {
                            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:1031:1: (lv_arguments_5_0= ruleArgument )
                            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:1032:3: lv_arguments_5_0= ruleArgument
                            {
                            if ( backtracking==0 ) {
                               
                              	        currentNode=createCompositeNode(grammarAccess.getNamedConstructorAccess().getArgumentsArgumentParserRuleCall_4_1_0_0(), currentNode); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleArgument_in_ruleNamedConstructor1861);
                            lv_arguments_5_0=ruleArgument();
                            _fsp--;
                            if (failed) return current;
                            if ( backtracking==0 ) {

                              	        if (current==null) {
                              	            current = factory.create(grammarAccess.getNamedConstructorRule().getType().getClassifier());
                              	            associateNodeWithAstElement(currentNode.getParent(), current);
                              	        }
                              	        try {
                              	       		add(
                              	       			current, 
                              	       			"arguments",
                              	        		lv_arguments_5_0, 
                              	        		"Argument", 
                              	        		currentNode);
                              	        } catch (ValueConverterException vce) {
                              				handleValueConverterException(vce);
                              	        }
                              	        currentNode = currentNode.getParent();
                              	    
                            }

                            }


                            }

                            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:1054:2: ( ',' ( (lv_arguments_7_0= ruleArgument ) ) )*
                            loop15:
                            do {
                                int alt15=2;
                                int LA15_0 = input.LA(1);

                                if ( (LA15_0==34) ) {
                                    alt15=1;
                                }


                                switch (alt15) {
                            	case 1 :
                            	    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:1054:4: ',' ( (lv_arguments_7_0= ruleArgument ) )
                            	    {
                            	    match(input,34,FOLLOW_34_in_ruleNamedConstructor1872); if (failed) return current;
                            	    if ( backtracking==0 ) {

                            	              createLeafNode(grammarAccess.getNamedConstructorAccess().getCommaKeyword_4_1_1_0(), null); 
                            	          
                            	    }
                            	    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:1058:1: ( (lv_arguments_7_0= ruleArgument ) )
                            	    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:1059:1: (lv_arguments_7_0= ruleArgument )
                            	    {
                            	    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:1059:1: (lv_arguments_7_0= ruleArgument )
                            	    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:1060:3: lv_arguments_7_0= ruleArgument
                            	    {
                            	    if ( backtracking==0 ) {
                            	       
                            	      	        currentNode=createCompositeNode(grammarAccess.getNamedConstructorAccess().getArgumentsArgumentParserRuleCall_4_1_1_1_0(), currentNode); 
                            	      	    
                            	    }
                            	    pushFollow(FOLLOW_ruleArgument_in_ruleNamedConstructor1893);
                            	    lv_arguments_7_0=ruleArgument();
                            	    _fsp--;
                            	    if (failed) return current;
                            	    if ( backtracking==0 ) {

                            	      	        if (current==null) {
                            	      	            current = factory.create(grammarAccess.getNamedConstructorRule().getType().getClassifier());
                            	      	            associateNodeWithAstElement(currentNode.getParent(), current);
                            	      	        }
                            	      	        try {
                            	      	       		add(
                            	      	       			current, 
                            	      	       			"arguments",
                            	      	        		lv_arguments_7_0, 
                            	      	        		"Argument", 
                            	      	        		currentNode);
                            	      	        } catch (ValueConverterException vce) {
                            	      				handleValueConverterException(vce);
                            	      	        }
                            	      	        currentNode = currentNode.getParent();
                            	      	    
                            	    }

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop15;
                                }
                            } while (true);


                            }
                            break;

                    }

                    match(input,35,FOLLOW_35_in_ruleNamedConstructor1907); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getNamedConstructorAccess().getRightParenthesisKeyword_4_2(), null); 
                          
                    }

                    }
                    break;

            }


            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
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
    // $ANTLR end ruleNamedConstructor


    // $ANTLR start entryRuleCallback
    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:1094:1: entryRuleCallback returns [EObject current=null] : iv_ruleCallback= ruleCallback EOF ;
    public final EObject entryRuleCallback() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCallback = null;


        try {
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:1095:2: (iv_ruleCallback= ruleCallback EOF )
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:1096:2: iv_ruleCallback= ruleCallback EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getCallbackRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleCallback_in_entryRuleCallback1945);
            iv_ruleCallback=ruleCallback();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleCallback; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCallback1955); if (failed) return current;

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
    // $ANTLR end entryRuleCallback


    // $ANTLR start ruleCallback
    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:1103:1: ruleCallback returns [EObject current=null] : ( ( 'Callback' () ) | ( 'Callback' '=' ( (lv_functionOnly_4_0= 'FunctionOnly' ) ) ) | ( 'Callback' '=' ( (lv_propertyOnly_7_0= 'PropertyOnly' ) ) ) ) ;
    public final EObject ruleCallback() throws RecognitionException {
        EObject current = null;

        Token lv_functionOnly_4_0=null;
        Token lv_propertyOnly_7_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:1108:6: ( ( ( 'Callback' () ) | ( 'Callback' '=' ( (lv_functionOnly_4_0= 'FunctionOnly' ) ) ) | ( 'Callback' '=' ( (lv_propertyOnly_7_0= 'PropertyOnly' ) ) ) ) )
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:1109:1: ( ( 'Callback' () ) | ( 'Callback' '=' ( (lv_functionOnly_4_0= 'FunctionOnly' ) ) ) | ( 'Callback' '=' ( (lv_propertyOnly_7_0= 'PropertyOnly' ) ) ) )
            {
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:1109:1: ( ( 'Callback' () ) | ( 'Callback' '=' ( (lv_functionOnly_4_0= 'FunctionOnly' ) ) ) | ( 'Callback' '=' ( (lv_propertyOnly_7_0= 'PropertyOnly' ) ) ) )
            int alt18=3;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==38) ) {
                int LA18_1 = input.LA(2);

                if ( (LA18_1==37) ) {
                    int LA18_2 = input.LA(3);

                    if ( (LA18_2==40) ) {
                        alt18=3;
                    }
                    else if ( (LA18_2==39) ) {
                        alt18=2;
                    }
                    else {
                        if (backtracking>0) {failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("1109:1: ( ( 'Callback' () ) | ( 'Callback' '=' ( (lv_functionOnly_4_0= 'FunctionOnly' ) ) ) | ( 'Callback' '=' ( (lv_propertyOnly_7_0= 'PropertyOnly' ) ) ) )", 18, 2, input);

                        throw nvae;
                    }
                }
                else if ( (LA18_1==EOF||LA18_1==34||LA18_1==55) ) {
                    alt18=1;
                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("1109:1: ( ( 'Callback' () ) | ( 'Callback' '=' ( (lv_functionOnly_4_0= 'FunctionOnly' ) ) ) | ( 'Callback' '=' ( (lv_propertyOnly_7_0= 'PropertyOnly' ) ) ) )", 18, 1, input);

                    throw nvae;
                }
            }
            else {
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("1109:1: ( ( 'Callback' () ) | ( 'Callback' '=' ( (lv_functionOnly_4_0= 'FunctionOnly' ) ) ) | ( 'Callback' '=' ( (lv_propertyOnly_7_0= 'PropertyOnly' ) ) ) )", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:1109:2: ( 'Callback' () )
                    {
                    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:1109:2: ( 'Callback' () )
                    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:1109:4: 'Callback' ()
                    {
                    match(input,38,FOLLOW_38_in_ruleCallback1991); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getCallbackAccess().getCallbackKeyword_0_0(), null); 
                          
                    }
                    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:1113:1: ()
                    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:1114:2: 
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              temp=factory.create(grammarAccess.getCallbackAccess().getCallbackAction_0_1().getType().getClassifier());
                              current = temp; 
                              temp = null;
                              CompositeNode newNode = createCompositeNode(grammarAccess.getCallbackAccess().getCallbackAction_0_1(), currentNode.getParent());
                          newNode.getChildren().add(currentNode);
                          moveLookaheadInfo(currentNode, newNode);
                          currentNode = newNode; 
                              associateNodeWithAstElement(currentNode, current); 
                          
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:1128:6: ( 'Callback' '=' ( (lv_functionOnly_4_0= 'FunctionOnly' ) ) )
                    {
                    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:1128:6: ( 'Callback' '=' ( (lv_functionOnly_4_0= 'FunctionOnly' ) ) )
                    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:1128:8: 'Callback' '=' ( (lv_functionOnly_4_0= 'FunctionOnly' ) )
                    {
                    match(input,38,FOLLOW_38_in_ruleCallback2021); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getCallbackAccess().getCallbackKeyword_1_0(), null); 
                          
                    }
                    match(input,37,FOLLOW_37_in_ruleCallback2031); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getCallbackAccess().getEqualsSignKeyword_1_1(), null); 
                          
                    }
                    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:1136:1: ( (lv_functionOnly_4_0= 'FunctionOnly' ) )
                    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:1137:1: (lv_functionOnly_4_0= 'FunctionOnly' )
                    {
                    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:1137:1: (lv_functionOnly_4_0= 'FunctionOnly' )
                    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:1138:3: lv_functionOnly_4_0= 'FunctionOnly'
                    {
                    lv_functionOnly_4_0=(Token)input.LT(1);
                    match(input,39,FOLLOW_39_in_ruleCallback2049); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getCallbackAccess().getFunctionOnlyFunctionOnlyKeyword_1_2_0(), "functionOnly"); 
                          
                    }
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getCallbackRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode, current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "functionOnly", true, "FunctionOnly", lastConsumedNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:1158:6: ( 'Callback' '=' ( (lv_propertyOnly_7_0= 'PropertyOnly' ) ) )
                    {
                    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:1158:6: ( 'Callback' '=' ( (lv_propertyOnly_7_0= 'PropertyOnly' ) ) )
                    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:1158:8: 'Callback' '=' ( (lv_propertyOnly_7_0= 'PropertyOnly' ) )
                    {
                    match(input,38,FOLLOW_38_in_ruleCallback2080); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getCallbackAccess().getCallbackKeyword_2_0(), null); 
                          
                    }
                    match(input,37,FOLLOW_37_in_ruleCallback2090); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getCallbackAccess().getEqualsSignKeyword_2_1(), null); 
                          
                    }
                    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:1166:1: ( (lv_propertyOnly_7_0= 'PropertyOnly' ) )
                    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:1167:1: (lv_propertyOnly_7_0= 'PropertyOnly' )
                    {
                    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:1167:1: (lv_propertyOnly_7_0= 'PropertyOnly' )
                    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:1168:3: lv_propertyOnly_7_0= 'PropertyOnly'
                    {
                    lv_propertyOnly_7_0=(Token)input.LT(1);
                    match(input,40,FOLLOW_40_in_ruleCallback2108); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getCallbackAccess().getPropertyOnlyPropertyOnlyKeyword_2_2_0(), "propertyOnly"); 
                          
                    }
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getCallbackRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode, current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "propertyOnly", true, "PropertyOnly", lastConsumedNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;

            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
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
    // $ANTLR end ruleCallback


    // $ANTLR start entryRuleNoInterfaceObject
    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:1195:1: entryRuleNoInterfaceObject returns [EObject current=null] : iv_ruleNoInterfaceObject= ruleNoInterfaceObject EOF ;
    public final EObject entryRuleNoInterfaceObject() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNoInterfaceObject = null;


        try {
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:1196:2: (iv_ruleNoInterfaceObject= ruleNoInterfaceObject EOF )
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:1197:2: iv_ruleNoInterfaceObject= ruleNoInterfaceObject EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getNoInterfaceObjectRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleNoInterfaceObject_in_entryRuleNoInterfaceObject2158);
            iv_ruleNoInterfaceObject=ruleNoInterfaceObject();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleNoInterfaceObject; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNoInterfaceObject2168); if (failed) return current;

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
    // $ANTLR end entryRuleNoInterfaceObject


    // $ANTLR start ruleNoInterfaceObject
    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:1204:1: ruleNoInterfaceObject returns [EObject current=null] : ( () 'NoInterfaceObject' ) ;
    public final EObject ruleNoInterfaceObject() throws RecognitionException {
        EObject current = null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:1209:6: ( ( () 'NoInterfaceObject' ) )
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:1210:1: ( () 'NoInterfaceObject' )
            {
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:1210:1: ( () 'NoInterfaceObject' )
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:1210:2: () 'NoInterfaceObject'
            {
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:1210:2: ()
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:1211:2: 
            {
            if ( backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( backtracking==0 ) {
               
                      temp=factory.create(grammarAccess.getNoInterfaceObjectAccess().getNoInterfaceObjectAction_0().getType().getClassifier());
                      current = temp; 
                      temp = null;
                      CompositeNode newNode = createCompositeNode(grammarAccess.getNoInterfaceObjectAccess().getNoInterfaceObjectAction_0(), currentNode.getParent());
                  newNode.getChildren().add(currentNode);
                  moveLookaheadInfo(currentNode, newNode);
                  currentNode = newNode; 
                      associateNodeWithAstElement(currentNode, current); 
                  
            }

            }

            match(input,41,FOLLOW_41_in_ruleNoInterfaceObject2215); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getNoInterfaceObjectAccess().getNoInterfaceObjectKeyword_1(), null); 
                  
            }

            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
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
    // $ANTLR end ruleNoInterfaceObject


    // $ANTLR start entryRuleOverrideBuiltins
    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:1236:1: entryRuleOverrideBuiltins returns [String current=null] : iv_ruleOverrideBuiltins= ruleOverrideBuiltins EOF ;
    public final String entryRuleOverrideBuiltins() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOverrideBuiltins = null;


        try {
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:1237:2: (iv_ruleOverrideBuiltins= ruleOverrideBuiltins EOF )
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:1238:2: iv_ruleOverrideBuiltins= ruleOverrideBuiltins EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getOverrideBuiltinsRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleOverrideBuiltins_in_entryRuleOverrideBuiltins2252);
            iv_ruleOverrideBuiltins=ruleOverrideBuiltins();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleOverrideBuiltins.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOverrideBuiltins2263); if (failed) return current;

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
    // $ANTLR end entryRuleOverrideBuiltins


    // $ANTLR start ruleOverrideBuiltins
    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:1245:1: ruleOverrideBuiltins returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'OverrideBuiltins' ;
    public final AntlrDatatypeRuleToken ruleOverrideBuiltins() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:1250:6: (kw= 'OverrideBuiltins' )
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:1252:2: kw= 'OverrideBuiltins'
            {
            kw=(Token)input.LT(1);
            match(input,42,FOLLOW_42_in_ruleOverrideBuiltins2300); if (failed) return current;
            if ( backtracking==0 ) {

                      current.merge(kw);
                      createLeafNode(grammarAccess.getOverrideBuiltinsAccess().getOverrideBuiltinsKeyword(), null); 
                  
            }

            }

            if ( backtracking==0 ) {
               resetLookahead(); 
              	    lastConsumedNode = currentNode;
                  
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
    // $ANTLR end ruleOverrideBuiltins


    // $ANTLR start entryRulePrototypeRoot
    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:1265:1: entryRulePrototypeRoot returns [EObject current=null] : iv_rulePrototypeRoot= rulePrototypeRoot EOF ;
    public final EObject entryRulePrototypeRoot() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrototypeRoot = null;


        try {
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:1266:2: (iv_rulePrototypeRoot= rulePrototypeRoot EOF )
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:1267:2: iv_rulePrototypeRoot= rulePrototypeRoot EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getPrototypeRootRule(), currentNode); 
            }
            pushFollow(FOLLOW_rulePrototypeRoot_in_entryRulePrototypeRoot2339);
            iv_rulePrototypeRoot=rulePrototypeRoot();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_rulePrototypeRoot; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePrototypeRoot2349); if (failed) return current;

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
    // $ANTLR end entryRulePrototypeRoot


    // $ANTLR start rulePrototypeRoot
    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:1274:1: rulePrototypeRoot returns [EObject current=null] : ( () 'PrototypeRoot' ) ;
    public final EObject rulePrototypeRoot() throws RecognitionException {
        EObject current = null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:1279:6: ( ( () 'PrototypeRoot' ) )
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:1280:1: ( () 'PrototypeRoot' )
            {
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:1280:1: ( () 'PrototypeRoot' )
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:1280:2: () 'PrototypeRoot'
            {
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:1280:2: ()
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:1281:2: 
            {
            if ( backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( backtracking==0 ) {
               
                      temp=factory.create(grammarAccess.getPrototypeRootAccess().getPrototypeRootAction_0().getType().getClassifier());
                      current = temp; 
                      temp = null;
                      CompositeNode newNode = createCompositeNode(grammarAccess.getPrototypeRootAccess().getPrototypeRootAction_0(), currentNode.getParent());
                  newNode.getChildren().add(currentNode);
                  moveLookaheadInfo(currentNode, newNode);
                  currentNode = newNode; 
                      associateNodeWithAstElement(currentNode, current); 
                  
            }

            }

            match(input,43,FOLLOW_43_in_rulePrototypeRoot2396); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getPrototypeRootAccess().getPrototypeRootKeyword_1(), null); 
                  
            }

            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
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
    // $ANTLR end rulePrototypeRoot


    // $ANTLR start entryRulePutForwards
    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:1306:1: entryRulePutForwards returns [EObject current=null] : iv_rulePutForwards= rulePutForwards EOF ;
    public final EObject entryRulePutForwards() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePutForwards = null;


        try {
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:1307:2: (iv_rulePutForwards= rulePutForwards EOF )
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:1308:2: iv_rulePutForwards= rulePutForwards EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getPutForwardsRule(), currentNode); 
            }
            pushFollow(FOLLOW_rulePutForwards_in_entryRulePutForwards2432);
            iv_rulePutForwards=rulePutForwards();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_rulePutForwards; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePutForwards2442); if (failed) return current;

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
    // $ANTLR end entryRulePutForwards


    // $ANTLR start rulePutForwards
    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:1315:1: rulePutForwards returns [EObject current=null] : ( 'PutForwards' '=' ( ( RULE_ID ) ) ) ;
    public final EObject rulePutForwards() throws RecognitionException {
        EObject current = null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:1320:6: ( ( 'PutForwards' '=' ( ( RULE_ID ) ) ) )
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:1321:1: ( 'PutForwards' '=' ( ( RULE_ID ) ) )
            {
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:1321:1: ( 'PutForwards' '=' ( ( RULE_ID ) ) )
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:1321:3: 'PutForwards' '=' ( ( RULE_ID ) )
            {
            match(input,44,FOLLOW_44_in_rulePutForwards2477); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getPutForwardsAccess().getPutForwardsKeyword_0(), null); 
                  
            }
            match(input,37,FOLLOW_37_in_rulePutForwards2487); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getPutForwardsAccess().getEqualsSignKeyword_1(), null); 
                  
            }
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:1329:1: ( ( RULE_ID ) )
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:1330:1: ( RULE_ID )
            {
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:1330:1: ( RULE_ID )
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:1331:3: RULE_ID
            {
            if ( backtracking==0 ) {
               
              		  /* */ 
              		
            }
            if ( backtracking==0 ) {

              			if (current==null) {
              	            current = factory.create(grammarAccess.getPutForwardsRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode, current);
              	        }
                      
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePutForwards2509); if (failed) return current;
            if ( backtracking==0 ) {

              		createLeafNode(grammarAccess.getPutForwardsAccess().getTargetAttributeCrossReference_2_0(), "target"); 
              	
            }

            }


            }


            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
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
    // $ANTLR end rulePutForwards


    // $ANTLR start entryRuleTreatNullAs
    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:1354:1: entryRuleTreatNullAs returns [EObject current=null] : iv_ruleTreatNullAs= ruleTreatNullAs EOF ;
    public final EObject entryRuleTreatNullAs() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTreatNullAs = null;


        try {
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:1355:2: (iv_ruleTreatNullAs= ruleTreatNullAs EOF )
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:1356:2: iv_ruleTreatNullAs= ruleTreatNullAs EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getTreatNullAsRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleTreatNullAs_in_entryRuleTreatNullAs2545);
            iv_ruleTreatNullAs=ruleTreatNullAs();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleTreatNullAs; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTreatNullAs2555); if (failed) return current;

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
    // $ANTLR end entryRuleTreatNullAs


    // $ANTLR start ruleTreatNullAs
    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:1363:1: ruleTreatNullAs returns [EObject current=null] : ( () 'TreatNullAs' '=' 'EmptyString' ) ;
    public final EObject ruleTreatNullAs() throws RecognitionException {
        EObject current = null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:1368:6: ( ( () 'TreatNullAs' '=' 'EmptyString' ) )
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:1369:1: ( () 'TreatNullAs' '=' 'EmptyString' )
            {
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:1369:1: ( () 'TreatNullAs' '=' 'EmptyString' )
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:1369:2: () 'TreatNullAs' '=' 'EmptyString'
            {
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:1369:2: ()
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:1370:2: 
            {
            if ( backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( backtracking==0 ) {
               
                      temp=factory.create(grammarAccess.getTreatNullAsAccess().getTreatNullAsAction_0().getType().getClassifier());
                      current = temp; 
                      temp = null;
                      CompositeNode newNode = createCompositeNode(grammarAccess.getTreatNullAsAccess().getTreatNullAsAction_0(), currentNode.getParent());
                  newNode.getChildren().add(currentNode);
                  moveLookaheadInfo(currentNode, newNode);
                  currentNode = newNode; 
                      associateNodeWithAstElement(currentNode, current); 
                  
            }

            }

            match(input,45,FOLLOW_45_in_ruleTreatNullAs2602); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getTreatNullAsAccess().getTreatNullAsKeyword_1(), null); 
                  
            }
            match(input,37,FOLLOW_37_in_ruleTreatNullAs2612); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getTreatNullAsAccess().getEqualsSignKeyword_2(), null); 
                  
            }
            match(input,46,FOLLOW_46_in_ruleTreatNullAs2622); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getTreatNullAsAccess().getEmptyStringKeyword_3(), null); 
                  
            }

            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
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
    // $ANTLR end ruleTreatNullAs


    // $ANTLR start entryRuleTreatUndefinedAs
    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:1403:1: entryRuleTreatUndefinedAs returns [EObject current=null] : iv_ruleTreatUndefinedAs= ruleTreatUndefinedAs EOF ;
    public final EObject entryRuleTreatUndefinedAs() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTreatUndefinedAs = null;


        try {
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:1404:2: (iv_ruleTreatUndefinedAs= ruleTreatUndefinedAs EOF )
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:1405:2: iv_ruleTreatUndefinedAs= ruleTreatUndefinedAs EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getTreatUndefinedAsRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleTreatUndefinedAs_in_entryRuleTreatUndefinedAs2658);
            iv_ruleTreatUndefinedAs=ruleTreatUndefinedAs();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleTreatUndefinedAs; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTreatUndefinedAs2668); if (failed) return current;

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
    // $ANTLR end entryRuleTreatUndefinedAs


    // $ANTLR start ruleTreatUndefinedAs
    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:1412:1: ruleTreatUndefinedAs returns [EObject current=null] : ( ( () 'TreatUndefinedAs' '=' ( (lv_asEmptyString_3_0= 'EmptyString' ) ) ) | ( () 'TreatUndefinedAs' '=' ( (lv_asNull_7_0= 'null' ) ) ) ) ;
    public final EObject ruleTreatUndefinedAs() throws RecognitionException {
        EObject current = null;

        Token lv_asEmptyString_3_0=null;
        Token lv_asNull_7_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:1417:6: ( ( ( () 'TreatUndefinedAs' '=' ( (lv_asEmptyString_3_0= 'EmptyString' ) ) ) | ( () 'TreatUndefinedAs' '=' ( (lv_asNull_7_0= 'null' ) ) ) ) )
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:1418:1: ( ( () 'TreatUndefinedAs' '=' ( (lv_asEmptyString_3_0= 'EmptyString' ) ) ) | ( () 'TreatUndefinedAs' '=' ( (lv_asNull_7_0= 'null' ) ) ) )
            {
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:1418:1: ( ( () 'TreatUndefinedAs' '=' ( (lv_asEmptyString_3_0= 'EmptyString' ) ) ) | ( () 'TreatUndefinedAs' '=' ( (lv_asNull_7_0= 'null' ) ) ) )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==47) ) {
                int LA19_1 = input.LA(2);

                if ( (LA19_1==37) ) {
                    int LA19_2 = input.LA(3);

                    if ( (LA19_2==46) ) {
                        alt19=1;
                    }
                    else if ( (LA19_2==48) ) {
                        alt19=2;
                    }
                    else {
                        if (backtracking>0) {failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("1418:1: ( ( () 'TreatUndefinedAs' '=' ( (lv_asEmptyString_3_0= 'EmptyString' ) ) ) | ( () 'TreatUndefinedAs' '=' ( (lv_asNull_7_0= 'null' ) ) ) )", 19, 2, input);

                        throw nvae;
                    }
                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("1418:1: ( ( () 'TreatUndefinedAs' '=' ( (lv_asEmptyString_3_0= 'EmptyString' ) ) ) | ( () 'TreatUndefinedAs' '=' ( (lv_asNull_7_0= 'null' ) ) ) )", 19, 1, input);

                    throw nvae;
                }
            }
            else {
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("1418:1: ( ( () 'TreatUndefinedAs' '=' ( (lv_asEmptyString_3_0= 'EmptyString' ) ) ) | ( () 'TreatUndefinedAs' '=' ( (lv_asNull_7_0= 'null' ) ) ) )", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:1418:2: ( () 'TreatUndefinedAs' '=' ( (lv_asEmptyString_3_0= 'EmptyString' ) ) )
                    {
                    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:1418:2: ( () 'TreatUndefinedAs' '=' ( (lv_asEmptyString_3_0= 'EmptyString' ) ) )
                    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:1418:3: () 'TreatUndefinedAs' '=' ( (lv_asEmptyString_3_0= 'EmptyString' ) )
                    {
                    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:1418:3: ()
                    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:1419:2: 
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              temp=factory.create(grammarAccess.getTreatUndefinedAsAccess().getTreatUndefinedAsAction_0_0().getType().getClassifier());
                              current = temp; 
                              temp = null;
                              CompositeNode newNode = createCompositeNode(grammarAccess.getTreatUndefinedAsAccess().getTreatUndefinedAsAction_0_0(), currentNode.getParent());
                          newNode.getChildren().add(currentNode);
                          moveLookaheadInfo(currentNode, newNode);
                          currentNode = newNode; 
                              associateNodeWithAstElement(currentNode, current); 
                          
                    }

                    }

                    match(input,47,FOLLOW_47_in_ruleTreatUndefinedAs2716); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getTreatUndefinedAsAccess().getTreatUndefinedAsKeyword_0_1(), null); 
                          
                    }
                    match(input,37,FOLLOW_37_in_ruleTreatUndefinedAs2726); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getTreatUndefinedAsAccess().getEqualsSignKeyword_0_2(), null); 
                          
                    }
                    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:1440:1: ( (lv_asEmptyString_3_0= 'EmptyString' ) )
                    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:1441:1: (lv_asEmptyString_3_0= 'EmptyString' )
                    {
                    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:1441:1: (lv_asEmptyString_3_0= 'EmptyString' )
                    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:1442:3: lv_asEmptyString_3_0= 'EmptyString'
                    {
                    lv_asEmptyString_3_0=(Token)input.LT(1);
                    match(input,46,FOLLOW_46_in_ruleTreatUndefinedAs2744); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getTreatUndefinedAsAccess().getAsEmptyStringEmptyStringKeyword_0_3_0(), "asEmptyString"); 
                          
                    }
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getTreatUndefinedAsRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode, current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "asEmptyString", true, "EmptyString", lastConsumedNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:1462:6: ( () 'TreatUndefinedAs' '=' ( (lv_asNull_7_0= 'null' ) ) )
                    {
                    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:1462:6: ( () 'TreatUndefinedAs' '=' ( (lv_asNull_7_0= 'null' ) ) )
                    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:1462:7: () 'TreatUndefinedAs' '=' ( (lv_asNull_7_0= 'null' ) )
                    {
                    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:1462:7: ()
                    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:1463:2: 
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              temp=factory.create(grammarAccess.getTreatUndefinedAsAccess().getTreatUndefinedAsAction_1_0().getType().getClassifier());
                              current = temp; 
                              temp = null;
                              CompositeNode newNode = createCompositeNode(grammarAccess.getTreatUndefinedAsAccess().getTreatUndefinedAsAction_1_0(), currentNode.getParent());
                          newNode.getChildren().add(currentNode);
                          moveLookaheadInfo(currentNode, newNode);
                          currentNode = newNode; 
                              associateNodeWithAstElement(currentNode, current); 
                          
                    }

                    }

                    match(input,47,FOLLOW_47_in_ruleTreatUndefinedAs2787); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getTreatUndefinedAsAccess().getTreatUndefinedAsKeyword_1_1(), null); 
                          
                    }
                    match(input,37,FOLLOW_37_in_ruleTreatUndefinedAs2797); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getTreatUndefinedAsAccess().getEqualsSignKeyword_1_2(), null); 
                          
                    }
                    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:1484:1: ( (lv_asNull_7_0= 'null' ) )
                    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:1485:1: (lv_asNull_7_0= 'null' )
                    {
                    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:1485:1: (lv_asNull_7_0= 'null' )
                    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:1486:3: lv_asNull_7_0= 'null'
                    {
                    lv_asNull_7_0=(Token)input.LT(1);
                    match(input,48,FOLLOW_48_in_ruleTreatUndefinedAs2815); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getTreatUndefinedAsAccess().getAsNullNullKeyword_1_3_0(), "asNull"); 
                          
                    }
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getTreatUndefinedAsRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode, current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "asNull", true, "null", lastConsumedNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;

            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
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
    // $ANTLR end ruleTreatUndefinedAs


    // $ANTLR start entryRuleAllowAny
    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:1513:1: entryRuleAllowAny returns [EObject current=null] : iv_ruleAllowAny= ruleAllowAny EOF ;
    public final EObject entryRuleAllowAny() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAllowAny = null;


        try {
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:1514:2: (iv_ruleAllowAny= ruleAllowAny EOF )
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:1515:2: iv_ruleAllowAny= ruleAllowAny EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getAllowAnyRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleAllowAny_in_entryRuleAllowAny2865);
            iv_ruleAllowAny=ruleAllowAny();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleAllowAny; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAllowAny2875); if (failed) return current;

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
    // $ANTLR end entryRuleAllowAny


    // $ANTLR start ruleAllowAny
    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:1522:1: ruleAllowAny returns [EObject current=null] : ( () 'AllowAny' ) ;
    public final EObject ruleAllowAny() throws RecognitionException {
        EObject current = null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:1527:6: ( ( () 'AllowAny' ) )
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:1528:1: ( () 'AllowAny' )
            {
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:1528:1: ( () 'AllowAny' )
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:1528:2: () 'AllowAny'
            {
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:1528:2: ()
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:1529:2: 
            {
            if ( backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( backtracking==0 ) {
               
                      temp=factory.create(grammarAccess.getAllowAnyAccess().getAllowAnyAction_0().getType().getClassifier());
                      current = temp; 
                      temp = null;
                      CompositeNode newNode = createCompositeNode(grammarAccess.getAllowAnyAccess().getAllowAnyAction_0(), currentNode.getParent());
                  newNode.getChildren().add(currentNode);
                  moveLookaheadInfo(currentNode, newNode);
                  currentNode = newNode; 
                      associateNodeWithAstElement(currentNode, current); 
                  
            }

            }

            match(input,49,FOLLOW_49_in_ruleAllowAny2922); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getAllowAnyAccess().getAllowAnyKeyword_1(), null); 
                  
            }

            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
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
    // $ANTLR end ruleAllowAny


    // $ANTLR start entryRuleReplaceable
    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:1554:1: entryRuleReplaceable returns [EObject current=null] : iv_ruleReplaceable= ruleReplaceable EOF ;
    public final EObject entryRuleReplaceable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReplaceable = null;


        try {
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:1555:2: (iv_ruleReplaceable= ruleReplaceable EOF )
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:1556:2: iv_ruleReplaceable= ruleReplaceable EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getReplaceableRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleReplaceable_in_entryRuleReplaceable2958);
            iv_ruleReplaceable=ruleReplaceable();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleReplaceable; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleReplaceable2968); if (failed) return current;

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
    // $ANTLR end entryRuleReplaceable


    // $ANTLR start ruleReplaceable
    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:1563:1: ruleReplaceable returns [EObject current=null] : ( () 'Replaceable' ) ;
    public final EObject ruleReplaceable() throws RecognitionException {
        EObject current = null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:1568:6: ( ( () 'Replaceable' ) )
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:1569:1: ( () 'Replaceable' )
            {
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:1569:1: ( () 'Replaceable' )
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:1569:2: () 'Replaceable'
            {
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:1569:2: ()
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:1570:2: 
            {
            if ( backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( backtracking==0 ) {
               
                      temp=factory.create(grammarAccess.getReplaceableAccess().getReplaceableAction_0().getType().getClassifier());
                      current = temp; 
                      temp = null;
                      CompositeNode newNode = createCompositeNode(grammarAccess.getReplaceableAccess().getReplaceableAction_0(), currentNode.getParent());
                  newNode.getChildren().add(currentNode);
                  moveLookaheadInfo(currentNode, newNode);
                  currentNode = newNode; 
                      associateNodeWithAstElement(currentNode, current); 
                  
            }

            }

            match(input,50,FOLLOW_50_in_ruleReplaceable3015); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getReplaceableAccess().getReplaceableKeyword_1(), null); 
                  
            }

            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
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
    // $ANTLR end ruleReplaceable


    // $ANTLR start entryRuleSupplemental
    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:1595:1: entryRuleSupplemental returns [EObject current=null] : iv_ruleSupplemental= ruleSupplemental EOF ;
    public final EObject entryRuleSupplemental() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSupplemental = null;


        try {
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:1596:2: (iv_ruleSupplemental= ruleSupplemental EOF )
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:1597:2: iv_ruleSupplemental= ruleSupplemental EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getSupplementalRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleSupplemental_in_entryRuleSupplemental3051);
            iv_ruleSupplemental=ruleSupplemental();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleSupplemental; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSupplemental3061); if (failed) return current;

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
    // $ANTLR end entryRuleSupplemental


    // $ANTLR start ruleSupplemental
    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:1604:1: ruleSupplemental returns [EObject current=null] : ( () 'Supplemental' ) ;
    public final EObject ruleSupplemental() throws RecognitionException {
        EObject current = null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:1609:6: ( ( () 'Supplemental' ) )
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:1610:1: ( () 'Supplemental' )
            {
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:1610:1: ( () 'Supplemental' )
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:1610:2: () 'Supplemental'
            {
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:1610:2: ()
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:1611:2: 
            {
            if ( backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( backtracking==0 ) {
               
                      temp=factory.create(grammarAccess.getSupplementalAccess().getSupplementalAction_0().getType().getClassifier());
                      current = temp; 
                      temp = null;
                      CompositeNode newNode = createCompositeNode(grammarAccess.getSupplementalAccess().getSupplementalAction_0(), currentNode.getParent());
                  newNode.getChildren().add(currentNode);
                  moveLookaheadInfo(currentNode, newNode);
                  currentNode = newNode; 
                      associateNodeWithAstElement(currentNode, current); 
                  
            }

            }

            match(input,51,FOLLOW_51_in_ruleSupplemental3108); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getSupplementalAccess().getSupplementalKeyword_1(), null); 
                  
            }

            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
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
    // $ANTLR end ruleSupplemental


    // $ANTLR start entryRuleReplaceableNamedProperties
    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:1636:1: entryRuleReplaceableNamedProperties returns [EObject current=null] : iv_ruleReplaceableNamedProperties= ruleReplaceableNamedProperties EOF ;
    public final EObject entryRuleReplaceableNamedProperties() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReplaceableNamedProperties = null;


        try {
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:1637:2: (iv_ruleReplaceableNamedProperties= ruleReplaceableNamedProperties EOF )
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:1638:2: iv_ruleReplaceableNamedProperties= ruleReplaceableNamedProperties EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getReplaceableNamedPropertiesRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleReplaceableNamedProperties_in_entryRuleReplaceableNamedProperties3144);
            iv_ruleReplaceableNamedProperties=ruleReplaceableNamedProperties();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleReplaceableNamedProperties; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleReplaceableNamedProperties3154); if (failed) return current;

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
    // $ANTLR end entryRuleReplaceableNamedProperties


    // $ANTLR start ruleReplaceableNamedProperties
    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:1645:1: ruleReplaceableNamedProperties returns [EObject current=null] : ( () 'ReplaceableNamedProperties' ) ;
    public final EObject ruleReplaceableNamedProperties() throws RecognitionException {
        EObject current = null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:1650:6: ( ( () 'ReplaceableNamedProperties' ) )
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:1651:1: ( () 'ReplaceableNamedProperties' )
            {
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:1651:1: ( () 'ReplaceableNamedProperties' )
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:1651:2: () 'ReplaceableNamedProperties'
            {
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:1651:2: ()
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:1652:2: 
            {
            if ( backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( backtracking==0 ) {
               
                      temp=factory.create(grammarAccess.getReplaceableNamedPropertiesAccess().getReplaceableNamedPropertiesAction_0().getType().getClassifier());
                      current = temp; 
                      temp = null;
                      CompositeNode newNode = createCompositeNode(grammarAccess.getReplaceableNamedPropertiesAccess().getReplaceableNamedPropertiesAction_0(), currentNode.getParent());
                  newNode.getChildren().add(currentNode);
                  moveLookaheadInfo(currentNode, newNode);
                  currentNode = newNode; 
                      associateNodeWithAstElement(currentNode, current); 
                  
            }

            }

            match(input,52,FOLLOW_52_in_ruleReplaceableNamedProperties3201); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getReplaceableNamedPropertiesAccess().getReplaceableNamedPropertiesKeyword_1(), null); 
                  
            }

            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
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
    // $ANTLR end ruleReplaceableNamedProperties


    // $ANTLR start entryRuleAbstractDefinitions
    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:1677:1: entryRuleAbstractDefinitions returns [EObject current=null] : iv_ruleAbstractDefinitions= ruleAbstractDefinitions EOF ;
    public final EObject entryRuleAbstractDefinitions() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractDefinitions = null;


        try {
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:1678:2: (iv_ruleAbstractDefinitions= ruleAbstractDefinitions EOF )
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:1679:2: iv_ruleAbstractDefinitions= ruleAbstractDefinitions EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getAbstractDefinitionsRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleAbstractDefinitions_in_entryRuleAbstractDefinitions3237);
            iv_ruleAbstractDefinitions=ruleAbstractDefinitions();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleAbstractDefinitions; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAbstractDefinitions3247); if (failed) return current;

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
    // $ANTLR end entryRuleAbstractDefinitions


    // $ANTLR start ruleAbstractDefinitions
    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:1686:1: ruleAbstractDefinitions returns [EObject current=null] : (this_Definitions_0= ruleDefinitions | this_Module_1= ruleModule ) ;
    public final EObject ruleAbstractDefinitions() throws RecognitionException {
        EObject current = null;

        EObject this_Definitions_0 = null;

        EObject this_Module_1 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:1691:6: ( (this_Definitions_0= ruleDefinitions | this_Module_1= ruleModule ) )
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:1692:1: (this_Definitions_0= ruleDefinitions | this_Module_1= ruleModule )
            {
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:1692:1: (this_Definitions_0= ruleDefinitions | this_Module_1= ruleModule )
            int alt20=2;
            switch ( input.LA(1) ) {
            case 54:
                {
                int LA20_1 = input.LA(2);

                if ( (LA20_1==32||LA20_1==36||LA20_1==38||(LA20_1>=41 && LA20_1<=43)||(LA20_1>=51 && LA20_1<=52)) ) {
                    alt20=1;
                }
                else if ( ((LA20_1>=59 && LA20_1<=60)) ) {
                    alt20=2;
                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("1692:1: (this_Definitions_0= ruleDefinitions | this_Module_1= ruleModule )", 20, 1, input);

                    throw nvae;
                }
                }
                break;
            case RULE_ID:
            case 13:
            case 61:
            case 75:
                {
                alt20=1;
                }
                break;
            case 56:
                {
                alt20=2;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("1692:1: (this_Definitions_0= ruleDefinitions | this_Module_1= ruleModule )", 20, 0, input);

                throw nvae;
            }

            switch (alt20) {
                case 1 :
                    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:1693:2: this_Definitions_0= ruleDefinitions
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getAbstractDefinitionsAccess().getDefinitionsParserRuleCall_0(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleDefinitions_in_ruleAbstractDefinitions3297);
                    this_Definitions_0=ruleDefinitions();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_Definitions_0; 
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:1706:2: this_Module_1= ruleModule
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getAbstractDefinitionsAccess().getModuleParserRuleCall_1(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleModule_in_ruleAbstractDefinitions3327);
                    this_Module_1=ruleModule();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_Module_1; 
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;

            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
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
    // $ANTLR end ruleAbstractDefinitions


    // $ANTLR start entryRuleDefinitions
    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:1725:1: entryRuleDefinitions returns [EObject current=null] : iv_ruleDefinitions= ruleDefinitions EOF ;
    public final EObject entryRuleDefinitions() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefinitions = null;


        try {
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:1726:2: (iv_ruleDefinitions= ruleDefinitions EOF )
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:1727:2: iv_ruleDefinitions= ruleDefinitions EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getDefinitionsRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleDefinitions_in_entryRuleDefinitions3362);
            iv_ruleDefinitions=ruleDefinitions();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleDefinitions; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDefinitions3372); if (failed) return current;

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
    // $ANTLR end entryRuleDefinitions


    // $ANTLR start ruleDefinitions
    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:1734:1: ruleDefinitions returns [EObject current=null] : (this_Interface_0= ruleInterface | this_Exception_1= ruleException | this_TypeDef_2= ruleTypeDef | this_ImplementStatement_3= ruleImplementStatement ) ;
    public final EObject ruleDefinitions() throws RecognitionException {
        EObject current = null;

        EObject this_Interface_0 = null;

        EObject this_Exception_1 = null;

        EObject this_TypeDef_2 = null;

        EObject this_ImplementStatement_3 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:1739:6: ( (this_Interface_0= ruleInterface | this_Exception_1= ruleException | this_TypeDef_2= ruleTypeDef | this_ImplementStatement_3= ruleImplementStatement ) )
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:1740:1: (this_Interface_0= ruleInterface | this_Exception_1= ruleException | this_TypeDef_2= ruleTypeDef | this_ImplementStatement_3= ruleImplementStatement )
            {
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:1740:1: (this_Interface_0= ruleInterface | this_Exception_1= ruleException | this_TypeDef_2= ruleTypeDef | this_ImplementStatement_3= ruleImplementStatement )
            int alt21=4;
            alt21 = dfa21.predict(input);
            switch (alt21) {
                case 1 :
                    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:1741:2: this_Interface_0= ruleInterface
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getDefinitionsAccess().getInterfaceParserRuleCall_0(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleInterface_in_ruleDefinitions3422);
                    this_Interface_0=ruleInterface();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_Interface_0; 
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:1754:2: this_Exception_1= ruleException
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getDefinitionsAccess().getExceptionParserRuleCall_1(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleException_in_ruleDefinitions3452);
                    this_Exception_1=ruleException();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_Exception_1; 
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:1767:2: this_TypeDef_2= ruleTypeDef
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getDefinitionsAccess().getTypeDefParserRuleCall_2(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleTypeDef_in_ruleDefinitions3482);
                    this_TypeDef_2=ruleTypeDef();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_TypeDef_2; 
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:1780:2: this_ImplementStatement_3= ruleImplementStatement
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getDefinitionsAccess().getImplementStatementParserRuleCall_3(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleImplementStatement_in_ruleDefinitions3512);
                    this_ImplementStatement_3=ruleImplementStatement();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_ImplementStatement_3; 
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;

            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
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
    // $ANTLR end ruleDefinitions


    // $ANTLR start entryRuleImplementStatement
    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:1799:1: entryRuleImplementStatement returns [EObject current=null] : iv_ruleImplementStatement= ruleImplementStatement EOF ;
    public final EObject entryRuleImplementStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImplementStatement = null;


        try {
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:1800:2: (iv_ruleImplementStatement= ruleImplementStatement EOF )
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:1801:2: iv_ruleImplementStatement= ruleImplementStatement EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getImplementStatementRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleImplementStatement_in_entryRuleImplementStatement3547);
            iv_ruleImplementStatement=ruleImplementStatement();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleImplementStatement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleImplementStatement3557); if (failed) return current;

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
    // $ANTLR end entryRuleImplementStatement


    // $ANTLR start ruleImplementStatement
    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:1808:1: ruleImplementStatement returns [EObject current=null] : ( ( ( ruleScopedName ) ) 'implements' ( ( ruleScopedName ) ) ';' ) ;
    public final EObject ruleImplementStatement() throws RecognitionException {
        EObject current = null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:1813:6: ( ( ( ( ruleScopedName ) ) 'implements' ( ( ruleScopedName ) ) ';' ) )
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:1814:1: ( ( ( ruleScopedName ) ) 'implements' ( ( ruleScopedName ) ) ';' )
            {
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:1814:1: ( ( ( ruleScopedName ) ) 'implements' ( ( ruleScopedName ) ) ';' )
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:1814:2: ( ( ruleScopedName ) ) 'implements' ( ( ruleScopedName ) ) ';'
            {
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:1814:2: ( ( ruleScopedName ) )
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:1815:1: ( ruleScopedName )
            {
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:1815:1: ( ruleScopedName )
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:1816:3: ruleScopedName
            {
            if ( backtracking==0 ) {
               
              		  /* */ 
              		
            }
            if ( backtracking==0 ) {

              			if (current==null) {
              	            current = factory.create(grammarAccess.getImplementStatementRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode, current);
              	        }
                      
            }
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getImplementStatementAccess().getSourceInterfaceCrossReference_0_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleScopedName_in_ruleImplementStatement3609);
            ruleScopedName();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               
              	        currentNode = currentNode.getParent();
              	    
            }

            }


            }

            match(input,53,FOLLOW_53_in_ruleImplementStatement3619); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getImplementStatementAccess().getImplementsKeyword_1(), null); 
                  
            }
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:1837:1: ( ( ruleScopedName ) )
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:1838:1: ( ruleScopedName )
            {
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:1838:1: ( ruleScopedName )
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:1839:3: ruleScopedName
            {
            if ( backtracking==0 ) {
               
              		  /* */ 
              		
            }
            if ( backtracking==0 ) {

              			if (current==null) {
              	            current = factory.create(grammarAccess.getImplementStatementRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode, current);
              	        }
                      
            }
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getImplementStatementAccess().getTargetInterfaceCrossReference_2_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleScopedName_in_ruleImplementStatement3646);
            ruleScopedName();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               
              	        currentNode = currentNode.getParent();
              	    
            }

            }


            }

            match(input,12,FOLLOW_12_in_ruleImplementStatement3656); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getImplementStatementAccess().getSemicolonKeyword_3(), null); 
                  
            }

            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
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
    // $ANTLR end ruleImplementStatement


    // $ANTLR start entryRuleModule
    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:1868:1: entryRuleModule returns [EObject current=null] : iv_ruleModule= ruleModule EOF ;
    public final EObject entryRuleModule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModule = null;


        try {
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:1869:2: (iv_ruleModule= ruleModule EOF )
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:1870:2: iv_ruleModule= ruleModule EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getModuleRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleModule_in_entryRuleModule3692);
            iv_ruleModule=ruleModule();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleModule; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleModule3702); if (failed) return current;

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
    // $ANTLR end entryRuleModule


    // $ANTLR start ruleModule
    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:1877:1: ruleModule returns [EObject current=null] : ( ( '[' ( (lv_extendedAttributes_1_0= ruleModuleExtendedAttribute ) ) ( ',' ( (lv_extendedAttributes_3_0= ruleModuleExtendedAttribute ) ) )* ']' )? 'module' ( (lv_name_6_0= ruleScopedName ) ) '{' ( (lv_definitions_8_0= ruleAbstractDefinitions ) )+ '}' ';' ) ;
    public final EObject ruleModule() throws RecognitionException {
        EObject current = null;

        EObject lv_extendedAttributes_1_0 = null;

        EObject lv_extendedAttributes_3_0 = null;

        AntlrDatatypeRuleToken lv_name_6_0 = null;

        EObject lv_definitions_8_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:1882:6: ( ( ( '[' ( (lv_extendedAttributes_1_0= ruleModuleExtendedAttribute ) ) ( ',' ( (lv_extendedAttributes_3_0= ruleModuleExtendedAttribute ) ) )* ']' )? 'module' ( (lv_name_6_0= ruleScopedName ) ) '{' ( (lv_definitions_8_0= ruleAbstractDefinitions ) )+ '}' ';' ) )
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:1883:1: ( ( '[' ( (lv_extendedAttributes_1_0= ruleModuleExtendedAttribute ) ) ( ',' ( (lv_extendedAttributes_3_0= ruleModuleExtendedAttribute ) ) )* ']' )? 'module' ( (lv_name_6_0= ruleScopedName ) ) '{' ( (lv_definitions_8_0= ruleAbstractDefinitions ) )+ '}' ';' )
            {
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:1883:1: ( ( '[' ( (lv_extendedAttributes_1_0= ruleModuleExtendedAttribute ) ) ( ',' ( (lv_extendedAttributes_3_0= ruleModuleExtendedAttribute ) ) )* ']' )? 'module' ( (lv_name_6_0= ruleScopedName ) ) '{' ( (lv_definitions_8_0= ruleAbstractDefinitions ) )+ '}' ';' )
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:1883:2: ( '[' ( (lv_extendedAttributes_1_0= ruleModuleExtendedAttribute ) ) ( ',' ( (lv_extendedAttributes_3_0= ruleModuleExtendedAttribute ) ) )* ']' )? 'module' ( (lv_name_6_0= ruleScopedName ) ) '{' ( (lv_definitions_8_0= ruleAbstractDefinitions ) )+ '}' ';'
            {
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:1883:2: ( '[' ( (lv_extendedAttributes_1_0= ruleModuleExtendedAttribute ) ) ( ',' ( (lv_extendedAttributes_3_0= ruleModuleExtendedAttribute ) ) )* ']' )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==54) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:1883:4: '[' ( (lv_extendedAttributes_1_0= ruleModuleExtendedAttribute ) ) ( ',' ( (lv_extendedAttributes_3_0= ruleModuleExtendedAttribute ) ) )* ']'
                    {
                    match(input,54,FOLLOW_54_in_ruleModule3738); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getModuleAccess().getLeftSquareBracketKeyword_0_0(), null); 
                          
                    }
                    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:1887:1: ( (lv_extendedAttributes_1_0= ruleModuleExtendedAttribute ) )
                    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:1888:1: (lv_extendedAttributes_1_0= ruleModuleExtendedAttribute )
                    {
                    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:1888:1: (lv_extendedAttributes_1_0= ruleModuleExtendedAttribute )
                    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:1889:3: lv_extendedAttributes_1_0= ruleModuleExtendedAttribute
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getModuleAccess().getExtendedAttributesModuleExtendedAttributeParserRuleCall_0_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleModuleExtendedAttribute_in_ruleModule3759);
                    lv_extendedAttributes_1_0=ruleModuleExtendedAttribute();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getModuleRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        try {
                      	       		add(
                      	       			current, 
                      	       			"extendedAttributes",
                      	        		lv_extendedAttributes_1_0, 
                      	        		"ModuleExtendedAttribute", 
                      	        		currentNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }


                    }

                    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:1911:2: ( ',' ( (lv_extendedAttributes_3_0= ruleModuleExtendedAttribute ) ) )*
                    loop22:
                    do {
                        int alt22=2;
                        int LA22_0 = input.LA(1);

                        if ( (LA22_0==34) ) {
                            alt22=1;
                        }


                        switch (alt22) {
                    	case 1 :
                    	    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:1911:4: ',' ( (lv_extendedAttributes_3_0= ruleModuleExtendedAttribute ) )
                    	    {
                    	    match(input,34,FOLLOW_34_in_ruleModule3770); if (failed) return current;
                    	    if ( backtracking==0 ) {

                    	              createLeafNode(grammarAccess.getModuleAccess().getCommaKeyword_0_2_0(), null); 
                    	          
                    	    }
                    	    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:1915:1: ( (lv_extendedAttributes_3_0= ruleModuleExtendedAttribute ) )
                    	    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:1916:1: (lv_extendedAttributes_3_0= ruleModuleExtendedAttribute )
                    	    {
                    	    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:1916:1: (lv_extendedAttributes_3_0= ruleModuleExtendedAttribute )
                    	    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:1917:3: lv_extendedAttributes_3_0= ruleModuleExtendedAttribute
                    	    {
                    	    if ( backtracking==0 ) {
                    	       
                    	      	        currentNode=createCompositeNode(grammarAccess.getModuleAccess().getExtendedAttributesModuleExtendedAttributeParserRuleCall_0_2_1_0(), currentNode); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleModuleExtendedAttribute_in_ruleModule3791);
                    	    lv_extendedAttributes_3_0=ruleModuleExtendedAttribute();
                    	    _fsp--;
                    	    if (failed) return current;
                    	    if ( backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = factory.create(grammarAccess.getModuleRule().getType().getClassifier());
                    	      	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	      	        }
                    	      	        try {
                    	      	       		add(
                    	      	       			current, 
                    	      	       			"extendedAttributes",
                    	      	        		lv_extendedAttributes_3_0, 
                    	      	        		"ModuleExtendedAttribute", 
                    	      	        		currentNode);
                    	      	        } catch (ValueConverterException vce) {
                    	      				handleValueConverterException(vce);
                    	      	        }
                    	      	        currentNode = currentNode.getParent();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop22;
                        }
                    } while (true);

                    match(input,55,FOLLOW_55_in_ruleModule3803); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getModuleAccess().getRightSquareBracketKeyword_0_3(), null); 
                          
                    }

                    }
                    break;

            }

            match(input,56,FOLLOW_56_in_ruleModule3815); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getModuleAccess().getModuleKeyword_1(), null); 
                  
            }
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:1947:1: ( (lv_name_6_0= ruleScopedName ) )
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:1948:1: (lv_name_6_0= ruleScopedName )
            {
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:1948:1: (lv_name_6_0= ruleScopedName )
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:1949:3: lv_name_6_0= ruleScopedName
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getModuleAccess().getNameScopedNameParserRuleCall_2_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleScopedName_in_ruleModule3836);
            lv_name_6_0=ruleScopedName();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getModuleRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"name",
              	        		lv_name_6_0, 
              	        		"ScopedName", 
              	        		currentNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	        currentNode = currentNode.getParent();
              	    
            }

            }


            }

            match(input,57,FOLLOW_57_in_ruleModule3846); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getModuleAccess().getLeftCurlyBracketKeyword_3(), null); 
                  
            }
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:1975:1: ( (lv_definitions_8_0= ruleAbstractDefinitions ) )+
            int cnt24=0;
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==RULE_ID||LA24_0==13||LA24_0==54||LA24_0==56||LA24_0==61||LA24_0==75) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:1976:1: (lv_definitions_8_0= ruleAbstractDefinitions )
            	    {
            	    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:1976:1: (lv_definitions_8_0= ruleAbstractDefinitions )
            	    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:1977:3: lv_definitions_8_0= ruleAbstractDefinitions
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getModuleAccess().getDefinitionsAbstractDefinitionsParserRuleCall_4_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleAbstractDefinitions_in_ruleModule3867);
            	    lv_definitions_8_0=ruleAbstractDefinitions();
            	    _fsp--;
            	    if (failed) return current;
            	    if ( backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = factory.create(grammarAccess.getModuleRule().getType().getClassifier());
            	      	            associateNodeWithAstElement(currentNode.getParent(), current);
            	      	        }
            	      	        try {
            	      	       		add(
            	      	       			current, 
            	      	       			"definitions",
            	      	        		lv_definitions_8_0, 
            	      	        		"AbstractDefinitions", 
            	      	        		currentNode);
            	      	        } catch (ValueConverterException vce) {
            	      				handleValueConverterException(vce);
            	      	        }
            	      	        currentNode = currentNode.getParent();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt24 >= 1 ) break loop24;
            	    if (backtracking>0) {failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(24, input);
                        throw eee;
                }
                cnt24++;
            } while (true);

            match(input,58,FOLLOW_58_in_ruleModule3878); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getModuleAccess().getRightCurlyBracketKeyword_5(), null); 
                  
            }
            match(input,12,FOLLOW_12_in_ruleModule3888); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getModuleAccess().getSemicolonKeyword_6(), null); 
                  
            }

            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
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
    // $ANTLR end ruleModule


    // $ANTLR start entryRuleModuleExtendedAttribute
    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:2015:1: entryRuleModuleExtendedAttribute returns [EObject current=null] : iv_ruleModuleExtendedAttribute= ruleModuleExtendedAttribute EOF ;
    public final EObject entryRuleModuleExtendedAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModuleExtendedAttribute = null;


        try {
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:2016:2: (iv_ruleModuleExtendedAttribute= ruleModuleExtendedAttribute EOF )
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:2017:2: iv_ruleModuleExtendedAttribute= ruleModuleExtendedAttribute EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getModuleExtendedAttributeRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleModuleExtendedAttribute_in_entryRuleModuleExtendedAttribute3924);
            iv_ruleModuleExtendedAttribute=ruleModuleExtendedAttribute();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleModuleExtendedAttribute; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleModuleExtendedAttribute3934); if (failed) return current;

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
    // $ANTLR end entryRuleModuleExtendedAttribute


    // $ANTLR start ruleModuleExtendedAttribute
    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:2024:1: ruleModuleExtendedAttribute returns [EObject current=null] : (this_Prefix_0= rulePrefix | this_NamespaceObject_1= ruleNamespaceObject ) ;
    public final EObject ruleModuleExtendedAttribute() throws RecognitionException {
        EObject current = null;

        EObject this_Prefix_0 = null;

        EObject this_NamespaceObject_1 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:2029:6: ( (this_Prefix_0= rulePrefix | this_NamespaceObject_1= ruleNamespaceObject ) )
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:2030:1: (this_Prefix_0= rulePrefix | this_NamespaceObject_1= ruleNamespaceObject )
            {
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:2030:1: (this_Prefix_0= rulePrefix | this_NamespaceObject_1= ruleNamespaceObject )
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==59) ) {
                alt25=1;
            }
            else if ( (LA25_0==60) ) {
                alt25=2;
            }
            else {
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("2030:1: (this_Prefix_0= rulePrefix | this_NamespaceObject_1= ruleNamespaceObject )", 25, 0, input);

                throw nvae;
            }
            switch (alt25) {
                case 1 :
                    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:2031:2: this_Prefix_0= rulePrefix
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getModuleExtendedAttributeAccess().getPrefixParserRuleCall_0(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_rulePrefix_in_ruleModuleExtendedAttribute3984);
                    this_Prefix_0=rulePrefix();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_Prefix_0; 
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:2044:2: this_NamespaceObject_1= ruleNamespaceObject
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getModuleExtendedAttributeAccess().getNamespaceObjectParserRuleCall_1(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleNamespaceObject_in_ruleModuleExtendedAttribute4014);
                    this_NamespaceObject_1=ruleNamespaceObject();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_NamespaceObject_1; 
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;

            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
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
    // $ANTLR end ruleModuleExtendedAttribute


    // $ANTLR start entryRulePrefix
    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:2063:1: entryRulePrefix returns [EObject current=null] : iv_rulePrefix= rulePrefix EOF ;
    public final EObject entryRulePrefix() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrefix = null;


        try {
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:2064:2: (iv_rulePrefix= rulePrefix EOF )
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:2065:2: iv_rulePrefix= rulePrefix EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getPrefixRule(), currentNode); 
            }
            pushFollow(FOLLOW_rulePrefix_in_entryRulePrefix4049);
            iv_rulePrefix=rulePrefix();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_rulePrefix; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePrefix4059); if (failed) return current;

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
    // $ANTLR end entryRulePrefix


    // $ANTLR start rulePrefix
    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:2072:1: rulePrefix returns [EObject current=null] : ( 'Prefix' '=' ( (lv_value_2_0= ruleScopedName ) ) ) ;
    public final EObject rulePrefix() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_2_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:2077:6: ( ( 'Prefix' '=' ( (lv_value_2_0= ruleScopedName ) ) ) )
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:2078:1: ( 'Prefix' '=' ( (lv_value_2_0= ruleScopedName ) ) )
            {
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:2078:1: ( 'Prefix' '=' ( (lv_value_2_0= ruleScopedName ) ) )
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:2078:3: 'Prefix' '=' ( (lv_value_2_0= ruleScopedName ) )
            {
            match(input,59,FOLLOW_59_in_rulePrefix4094); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getPrefixAccess().getPrefixKeyword_0(), null); 
                  
            }
            match(input,37,FOLLOW_37_in_rulePrefix4104); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getPrefixAccess().getEqualsSignKeyword_1(), null); 
                  
            }
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:2086:1: ( (lv_value_2_0= ruleScopedName ) )
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:2087:1: (lv_value_2_0= ruleScopedName )
            {
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:2087:1: (lv_value_2_0= ruleScopedName )
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:2088:3: lv_value_2_0= ruleScopedName
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getPrefixAccess().getValueScopedNameParserRuleCall_2_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleScopedName_in_rulePrefix4125);
            lv_value_2_0=ruleScopedName();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getPrefixRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        try {
              	       		add(
              	       			current, 
              	       			"value",
              	        		lv_value_2_0, 
              	        		"ScopedName", 
              	        		currentNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	        currentNode = currentNode.getParent();
              	    
            }

            }


            }


            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
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
    // $ANTLR end rulePrefix


    // $ANTLR start entryRuleNamespaceObject
    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:2118:1: entryRuleNamespaceObject returns [EObject current=null] : iv_ruleNamespaceObject= ruleNamespaceObject EOF ;
    public final EObject entryRuleNamespaceObject() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNamespaceObject = null;


        try {
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:2119:2: (iv_ruleNamespaceObject= ruleNamespaceObject EOF )
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:2120:2: iv_ruleNamespaceObject= ruleNamespaceObject EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getNamespaceObjectRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleNamespaceObject_in_entryRuleNamespaceObject4161);
            iv_ruleNamespaceObject=ruleNamespaceObject();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleNamespaceObject; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNamespaceObject4171); if (failed) return current;

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
    // $ANTLR end entryRuleNamespaceObject


    // $ANTLR start ruleNamespaceObject
    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:2127:1: ruleNamespaceObject returns [EObject current=null] : ( 'NamespaceObject' () ) ;
    public final EObject ruleNamespaceObject() throws RecognitionException {
        EObject current = null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:2132:6: ( ( 'NamespaceObject' () ) )
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:2133:1: ( 'NamespaceObject' () )
            {
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:2133:1: ( 'NamespaceObject' () )
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:2133:3: 'NamespaceObject' ()
            {
            match(input,60,FOLLOW_60_in_ruleNamespaceObject4206); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getNamespaceObjectAccess().getNamespaceObjectKeyword_0(), null); 
                  
            }
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:2137:1: ()
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:2138:2: 
            {
            if ( backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( backtracking==0 ) {
               
                      temp=factory.create(grammarAccess.getNamespaceObjectAccess().getNamespaceObjectAction_1().getType().getClassifier());
                      current = temp; 
                      temp = null;
                      CompositeNode newNode = createCompositeNode(grammarAccess.getNamespaceObjectAccess().getNamespaceObjectAction_1(), currentNode.getParent());
                  newNode.getChildren().add(currentNode);
                  moveLookaheadInfo(currentNode, newNode);
                  currentNode = newNode; 
                      associateNodeWithAstElement(currentNode, current); 
                  
            }

            }


            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
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
    // $ANTLR end ruleNamespaceObject


    // $ANTLR start entryRuleInterface
    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:2159:1: entryRuleInterface returns [EObject current=null] : iv_ruleInterface= ruleInterface EOF ;
    public final EObject entryRuleInterface() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInterface = null;


        try {
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:2160:2: (iv_ruleInterface= ruleInterface EOF )
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:2161:2: iv_ruleInterface= ruleInterface EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getInterfaceRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleInterface_in_entryRuleInterface4254);
            iv_ruleInterface=ruleInterface();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleInterface; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleInterface4264); if (failed) return current;

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
    // $ANTLR end entryRuleInterface


    // $ANTLR start ruleInterface
    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:2168:1: ruleInterface returns [EObject current=null] : ( ( '[' ( (lv_extendedAttributes_1_0= ruleInterfaceExtendedAttribute ) ) ( ',' ( (lv_extendedAttribute_3_0= ruleInterfaceExtendedAttribute ) ) )* ']' )? 'interface' ( (lv_name_6_0= RULE_ID ) ) ( ( ':' ( ( ruleScopedName ) ) ) ( ',' ( ( ruleScopedName ) ) )* )? ( '{' ( (lv_members_12_0= ruleInterfaceMember ) )* '}' )? ';' ) ;
    public final EObject ruleInterface() throws RecognitionException {
        EObject current = null;

        Token lv_name_6_0=null;
        EObject lv_extendedAttributes_1_0 = null;

        EObject lv_extendedAttribute_3_0 = null;

        EObject lv_members_12_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:2173:6: ( ( ( '[' ( (lv_extendedAttributes_1_0= ruleInterfaceExtendedAttribute ) ) ( ',' ( (lv_extendedAttribute_3_0= ruleInterfaceExtendedAttribute ) ) )* ']' )? 'interface' ( (lv_name_6_0= RULE_ID ) ) ( ( ':' ( ( ruleScopedName ) ) ) ( ',' ( ( ruleScopedName ) ) )* )? ( '{' ( (lv_members_12_0= ruleInterfaceMember ) )* '}' )? ';' ) )
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:2174:1: ( ( '[' ( (lv_extendedAttributes_1_0= ruleInterfaceExtendedAttribute ) ) ( ',' ( (lv_extendedAttribute_3_0= ruleInterfaceExtendedAttribute ) ) )* ']' )? 'interface' ( (lv_name_6_0= RULE_ID ) ) ( ( ':' ( ( ruleScopedName ) ) ) ( ',' ( ( ruleScopedName ) ) )* )? ( '{' ( (lv_members_12_0= ruleInterfaceMember ) )* '}' )? ';' )
            {
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:2174:1: ( ( '[' ( (lv_extendedAttributes_1_0= ruleInterfaceExtendedAttribute ) ) ( ',' ( (lv_extendedAttribute_3_0= ruleInterfaceExtendedAttribute ) ) )* ']' )? 'interface' ( (lv_name_6_0= RULE_ID ) ) ( ( ':' ( ( ruleScopedName ) ) ) ( ',' ( ( ruleScopedName ) ) )* )? ( '{' ( (lv_members_12_0= ruleInterfaceMember ) )* '}' )? ';' )
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:2174:2: ( '[' ( (lv_extendedAttributes_1_0= ruleInterfaceExtendedAttribute ) ) ( ',' ( (lv_extendedAttribute_3_0= ruleInterfaceExtendedAttribute ) ) )* ']' )? 'interface' ( (lv_name_6_0= RULE_ID ) ) ( ( ':' ( ( ruleScopedName ) ) ) ( ',' ( ( ruleScopedName ) ) )* )? ( '{' ( (lv_members_12_0= ruleInterfaceMember ) )* '}' )? ';'
            {
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:2174:2: ( '[' ( (lv_extendedAttributes_1_0= ruleInterfaceExtendedAttribute ) ) ( ',' ( (lv_extendedAttribute_3_0= ruleInterfaceExtendedAttribute ) ) )* ']' )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==54) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:2174:4: '[' ( (lv_extendedAttributes_1_0= ruleInterfaceExtendedAttribute ) ) ( ',' ( (lv_extendedAttribute_3_0= ruleInterfaceExtendedAttribute ) ) )* ']'
                    {
                    match(input,54,FOLLOW_54_in_ruleInterface4300); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getInterfaceAccess().getLeftSquareBracketKeyword_0_0(), null); 
                          
                    }
                    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:2178:1: ( (lv_extendedAttributes_1_0= ruleInterfaceExtendedAttribute ) )
                    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:2179:1: (lv_extendedAttributes_1_0= ruleInterfaceExtendedAttribute )
                    {
                    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:2179:1: (lv_extendedAttributes_1_0= ruleInterfaceExtendedAttribute )
                    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:2180:3: lv_extendedAttributes_1_0= ruleInterfaceExtendedAttribute
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getInterfaceAccess().getExtendedAttributesInterfaceExtendedAttributeParserRuleCall_0_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleInterfaceExtendedAttribute_in_ruleInterface4321);
                    lv_extendedAttributes_1_0=ruleInterfaceExtendedAttribute();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getInterfaceRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        try {
                      	       		add(
                      	       			current, 
                      	       			"extendedAttributes",
                      	        		lv_extendedAttributes_1_0, 
                      	        		"InterfaceExtendedAttribute", 
                      	        		currentNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }


                    }

                    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:2202:2: ( ',' ( (lv_extendedAttribute_3_0= ruleInterfaceExtendedAttribute ) ) )*
                    loop26:
                    do {
                        int alt26=2;
                        int LA26_0 = input.LA(1);

                        if ( (LA26_0==34) ) {
                            alt26=1;
                        }


                        switch (alt26) {
                    	case 1 :
                    	    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:2202:4: ',' ( (lv_extendedAttribute_3_0= ruleInterfaceExtendedAttribute ) )
                    	    {
                    	    match(input,34,FOLLOW_34_in_ruleInterface4332); if (failed) return current;
                    	    if ( backtracking==0 ) {

                    	              createLeafNode(grammarAccess.getInterfaceAccess().getCommaKeyword_0_2_0(), null); 
                    	          
                    	    }
                    	    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:2206:1: ( (lv_extendedAttribute_3_0= ruleInterfaceExtendedAttribute ) )
                    	    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:2207:1: (lv_extendedAttribute_3_0= ruleInterfaceExtendedAttribute )
                    	    {
                    	    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:2207:1: (lv_extendedAttribute_3_0= ruleInterfaceExtendedAttribute )
                    	    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:2208:3: lv_extendedAttribute_3_0= ruleInterfaceExtendedAttribute
                    	    {
                    	    if ( backtracking==0 ) {
                    	       
                    	      	        currentNode=createCompositeNode(grammarAccess.getInterfaceAccess().getExtendedAttributeInterfaceExtendedAttributeParserRuleCall_0_2_1_0(), currentNode); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleInterfaceExtendedAttribute_in_ruleInterface4353);
                    	    lv_extendedAttribute_3_0=ruleInterfaceExtendedAttribute();
                    	    _fsp--;
                    	    if (failed) return current;
                    	    if ( backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = factory.create(grammarAccess.getInterfaceRule().getType().getClassifier());
                    	      	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	      	        }
                    	      	        try {
                    	      	       		add(
                    	      	       			current, 
                    	      	       			"extendedAttribute",
                    	      	        		lv_extendedAttribute_3_0, 
                    	      	        		"InterfaceExtendedAttribute", 
                    	      	        		currentNode);
                    	      	        } catch (ValueConverterException vce) {
                    	      				handleValueConverterException(vce);
                    	      	        }
                    	      	        currentNode = currentNode.getParent();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop26;
                        }
                    } while (true);

                    match(input,55,FOLLOW_55_in_ruleInterface4365); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getInterfaceAccess().getRightSquareBracketKeyword_0_3(), null); 
                          
                    }

                    }
                    break;

            }

            match(input,61,FOLLOW_61_in_ruleInterface4377); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getInterfaceAccess().getInterfaceKeyword_1(), null); 
                  
            }
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:2238:1: ( (lv_name_6_0= RULE_ID ) )
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:2239:1: (lv_name_6_0= RULE_ID )
            {
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:2239:1: (lv_name_6_0= RULE_ID )
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:2240:3: lv_name_6_0= RULE_ID
            {
            lv_name_6_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleInterface4394); if (failed) return current;
            if ( backtracking==0 ) {

              			createLeafNode(grammarAccess.getInterfaceAccess().getNameIDTerminalRuleCall_2_0(), "name"); 
              		
            }
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getInterfaceRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode, current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"name",
              	        		lv_name_6_0, 
              	        		"ID", 
              	        		lastConsumedNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	    
            }

            }


            }

            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:2262:2: ( ( ':' ( ( ruleScopedName ) ) ) ( ',' ( ( ruleScopedName ) ) )* )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==62) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:2262:3: ( ':' ( ( ruleScopedName ) ) ) ( ',' ( ( ruleScopedName ) ) )*
                    {
                    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:2262:3: ( ':' ( ( ruleScopedName ) ) )
                    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:2262:5: ':' ( ( ruleScopedName ) )
                    {
                    match(input,62,FOLLOW_62_in_ruleInterface4411); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getInterfaceAccess().getColonKeyword_3_0_0(), null); 
                          
                    }
                    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:2266:1: ( ( ruleScopedName ) )
                    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:2267:1: ( ruleScopedName )
                    {
                    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:2267:1: ( ruleScopedName )
                    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:2268:3: ruleScopedName
                    {
                    if ( backtracking==0 ) {
                       
                      		  /* */ 
                      		
                    }
                    if ( backtracking==0 ) {

                      			if (current==null) {
                      	            current = factory.create(grammarAccess.getInterfaceRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode, current);
                      	        }
                              
                    }
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getInterfaceAccess().getSuperTypeInterfaceCrossReference_3_0_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleScopedName_in_ruleInterface4438);
                    ruleScopedName();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }


                    }


                    }

                    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:2285:3: ( ',' ( ( ruleScopedName ) ) )*
                    loop28:
                    do {
                        int alt28=2;
                        int LA28_0 = input.LA(1);

                        if ( (LA28_0==34) ) {
                            alt28=1;
                        }


                        switch (alt28) {
                    	case 1 :
                    	    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:2285:5: ',' ( ( ruleScopedName ) )
                    	    {
                    	    match(input,34,FOLLOW_34_in_ruleInterface4450); if (failed) return current;
                    	    if ( backtracking==0 ) {

                    	              createLeafNode(grammarAccess.getInterfaceAccess().getCommaKeyword_3_1_0(), null); 
                    	          
                    	    }
                    	    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:2289:1: ( ( ruleScopedName ) )
                    	    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:2290:1: ( ruleScopedName )
                    	    {
                    	    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:2290:1: ( ruleScopedName )
                    	    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:2291:3: ruleScopedName
                    	    {
                    	    if ( backtracking==0 ) {
                    	       
                    	      		  /* */ 
                    	      		
                    	    }
                    	    if ( backtracking==0 ) {

                    	      			if (current==null) {
                    	      	            current = factory.create(grammarAccess.getInterfaceRule().getType().getClassifier());
                    	      	            associateNodeWithAstElement(currentNode, current);
                    	      	        }
                    	              
                    	    }
                    	    if ( backtracking==0 ) {
                    	       
                    	      	        currentNode=createCompositeNode(grammarAccess.getInterfaceAccess().getSuperTypeInterfaceCrossReference_3_1_1_0(), currentNode); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleScopedName_in_ruleInterface4477);
                    	    ruleScopedName();
                    	    _fsp--;
                    	    if (failed) return current;
                    	    if ( backtracking==0 ) {
                    	       
                    	      	        currentNode = currentNode.getParent();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop28;
                        }
                    } while (true);


                    }
                    break;

            }

            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:2308:6: ( '{' ( (lv_members_12_0= ruleInterfaceMember ) )* '}' )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==57) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:2308:8: '{' ( (lv_members_12_0= ruleInterfaceMember ) )* '}'
                    {
                    match(input,57,FOLLOW_57_in_ruleInterface4492); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getInterfaceAccess().getLeftCurlyBracketKeyword_4_0(), null); 
                          
                    }
                    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:2312:1: ( (lv_members_12_0= ruleInterfaceMember ) )*
                    loop30:
                    do {
                        int alt30=2;
                        int LA30_0 = input.LA(1);

                        if ( (LA30_0==RULE_ID||(LA30_0>=15 && LA30_0<=27)||LA30_0==29||LA30_0==54||(LA30_0>=63 && LA30_0<=64)||(LA30_0>=66 && LA30_0<=72)||LA30_0==79) ) {
                            alt30=1;
                        }


                        switch (alt30) {
                    	case 1 :
                    	    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:2313:1: (lv_members_12_0= ruleInterfaceMember )
                    	    {
                    	    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:2313:1: (lv_members_12_0= ruleInterfaceMember )
                    	    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:2314:3: lv_members_12_0= ruleInterfaceMember
                    	    {
                    	    if ( backtracking==0 ) {
                    	       
                    	      	        currentNode=createCompositeNode(grammarAccess.getInterfaceAccess().getMembersInterfaceMemberParserRuleCall_4_1_0(), currentNode); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleInterfaceMember_in_ruleInterface4513);
                    	    lv_members_12_0=ruleInterfaceMember();
                    	    _fsp--;
                    	    if (failed) return current;
                    	    if ( backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = factory.create(grammarAccess.getInterfaceRule().getType().getClassifier());
                    	      	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	      	        }
                    	      	        try {
                    	      	       		add(
                    	      	       			current, 
                    	      	       			"members",
                    	      	        		lv_members_12_0, 
                    	      	        		"InterfaceMember", 
                    	      	        		currentNode);
                    	      	        } catch (ValueConverterException vce) {
                    	      				handleValueConverterException(vce);
                    	      	        }
                    	      	        currentNode = currentNode.getParent();
                    	      	    
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop30;
                        }
                    } while (true);

                    match(input,58,FOLLOW_58_in_ruleInterface4524); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getInterfaceAccess().getRightCurlyBracketKeyword_4_2(), null); 
                          
                    }

                    }
                    break;

            }

            match(input,12,FOLLOW_12_in_ruleInterface4536); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getInterfaceAccess().getSemicolonKeyword_5(), null); 
                  
            }

            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
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
    // $ANTLR end ruleInterface


    // $ANTLR start entryRuleInterfaceExtendedAttribute
    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:2352:1: entryRuleInterfaceExtendedAttribute returns [EObject current=null] : iv_ruleInterfaceExtendedAttribute= ruleInterfaceExtendedAttribute EOF ;
    public final EObject entryRuleInterfaceExtendedAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInterfaceExtendedAttribute = null;


        try {
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:2353:2: (iv_ruleInterfaceExtendedAttribute= ruleInterfaceExtendedAttribute EOF )
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:2354:2: iv_ruleInterfaceExtendedAttribute= ruleInterfaceExtendedAttribute EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getInterfaceExtendedAttributeRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleInterfaceExtendedAttribute_in_entryRuleInterfaceExtendedAttribute4572);
            iv_ruleInterfaceExtendedAttribute=ruleInterfaceExtendedAttribute();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleInterfaceExtendedAttribute; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleInterfaceExtendedAttribute4582); if (failed) return current;

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
    // $ANTLR end entryRuleInterfaceExtendedAttribute


    // $ANTLR start ruleInterfaceExtendedAttribute
    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:2361:1: ruleInterfaceExtendedAttribute returns [EObject current=null] : (this_Callback_0= ruleCallback | this_Constructor_1= ruleConstructor | this_NamedConstructor_2= ruleNamedConstructor | this_NoInterfaceObject_3= ruleNoInterfaceObject | this_PrototypeRoot_4= rulePrototypeRoot | this_Supplemental_5= ruleSupplemental | ruleOverrideBuiltins | this_ReplaceableNamedProperties_7= ruleReplaceableNamedProperties ) ;
    public final EObject ruleInterfaceExtendedAttribute() throws RecognitionException {
        EObject current = null;

        EObject this_Callback_0 = null;

        EObject this_Constructor_1 = null;

        EObject this_NamedConstructor_2 = null;

        EObject this_NoInterfaceObject_3 = null;

        EObject this_PrototypeRoot_4 = null;

        EObject this_Supplemental_5 = null;

        EObject this_ReplaceableNamedProperties_7 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:2366:6: ( (this_Callback_0= ruleCallback | this_Constructor_1= ruleConstructor | this_NamedConstructor_2= ruleNamedConstructor | this_NoInterfaceObject_3= ruleNoInterfaceObject | this_PrototypeRoot_4= rulePrototypeRoot | this_Supplemental_5= ruleSupplemental | ruleOverrideBuiltins | this_ReplaceableNamedProperties_7= ruleReplaceableNamedProperties ) )
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:2367:1: (this_Callback_0= ruleCallback | this_Constructor_1= ruleConstructor | this_NamedConstructor_2= ruleNamedConstructor | this_NoInterfaceObject_3= ruleNoInterfaceObject | this_PrototypeRoot_4= rulePrototypeRoot | this_Supplemental_5= ruleSupplemental | ruleOverrideBuiltins | this_ReplaceableNamedProperties_7= ruleReplaceableNamedProperties )
            {
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:2367:1: (this_Callback_0= ruleCallback | this_Constructor_1= ruleConstructor | this_NamedConstructor_2= ruleNamedConstructor | this_NoInterfaceObject_3= ruleNoInterfaceObject | this_PrototypeRoot_4= rulePrototypeRoot | this_Supplemental_5= ruleSupplemental | ruleOverrideBuiltins | this_ReplaceableNamedProperties_7= ruleReplaceableNamedProperties )
            int alt32=8;
            switch ( input.LA(1) ) {
            case 38:
                {
                alt32=1;
                }
                break;
            case 32:
                {
                alt32=2;
                }
                break;
            case 36:
                {
                alt32=3;
                }
                break;
            case 41:
                {
                alt32=4;
                }
                break;
            case 43:
                {
                alt32=5;
                }
                break;
            case 51:
                {
                alt32=6;
                }
                break;
            case 42:
                {
                alt32=7;
                }
                break;
            case 52:
                {
                alt32=8;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("2367:1: (this_Callback_0= ruleCallback | this_Constructor_1= ruleConstructor | this_NamedConstructor_2= ruleNamedConstructor | this_NoInterfaceObject_3= ruleNoInterfaceObject | this_PrototypeRoot_4= rulePrototypeRoot | this_Supplemental_5= ruleSupplemental | ruleOverrideBuiltins | this_ReplaceableNamedProperties_7= ruleReplaceableNamedProperties )", 32, 0, input);

                throw nvae;
            }

            switch (alt32) {
                case 1 :
                    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:2368:2: this_Callback_0= ruleCallback
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getInterfaceExtendedAttributeAccess().getCallbackParserRuleCall_0(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleCallback_in_ruleInterfaceExtendedAttribute4632);
                    this_Callback_0=ruleCallback();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_Callback_0; 
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:2381:2: this_Constructor_1= ruleConstructor
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getInterfaceExtendedAttributeAccess().getConstructorParserRuleCall_1(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleConstructor_in_ruleInterfaceExtendedAttribute4662);
                    this_Constructor_1=ruleConstructor();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_Constructor_1; 
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:2394:2: this_NamedConstructor_2= ruleNamedConstructor
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getInterfaceExtendedAttributeAccess().getNamedConstructorParserRuleCall_2(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleNamedConstructor_in_ruleInterfaceExtendedAttribute4692);
                    this_NamedConstructor_2=ruleNamedConstructor();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_NamedConstructor_2; 
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:2407:2: this_NoInterfaceObject_3= ruleNoInterfaceObject
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getInterfaceExtendedAttributeAccess().getNoInterfaceObjectParserRuleCall_3(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleNoInterfaceObject_in_ruleInterfaceExtendedAttribute4722);
                    this_NoInterfaceObject_3=ruleNoInterfaceObject();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_NoInterfaceObject_3; 
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;
                case 5 :
                    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:2420:2: this_PrototypeRoot_4= rulePrototypeRoot
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getInterfaceExtendedAttributeAccess().getPrototypeRootParserRuleCall_4(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_rulePrototypeRoot_in_ruleInterfaceExtendedAttribute4752);
                    this_PrototypeRoot_4=rulePrototypeRoot();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_PrototypeRoot_4; 
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;
                case 6 :
                    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:2433:2: this_Supplemental_5= ruleSupplemental
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getInterfaceExtendedAttributeAccess().getSupplementalParserRuleCall_5(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleSupplemental_in_ruleInterfaceExtendedAttribute4782);
                    this_Supplemental_5=ruleSupplemental();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_Supplemental_5; 
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;
                case 7 :
                    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:2446:2: ruleOverrideBuiltins
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getInterfaceExtendedAttributeAccess().getOverrideBuiltinsParserRuleCall_6(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleOverrideBuiltins_in_ruleInterfaceExtendedAttribute4806);
                    ruleOverrideBuiltins();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;
                case 8 :
                    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:2458:2: this_ReplaceableNamedProperties_7= ruleReplaceableNamedProperties
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getInterfaceExtendedAttributeAccess().getReplaceableNamedPropertiesParserRuleCall_7(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleReplaceableNamedProperties_in_ruleInterfaceExtendedAttribute4836);
                    this_ReplaceableNamedProperties_7=ruleReplaceableNamedProperties();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_ReplaceableNamedProperties_7; 
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;

            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
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
    // $ANTLR end ruleInterfaceExtendedAttribute


    // $ANTLR start entryRuleInterfaceMember
    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:2477:1: entryRuleInterfaceMember returns [EObject current=null] : iv_ruleInterfaceMember= ruleInterfaceMember EOF ;
    public final EObject entryRuleInterfaceMember() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInterfaceMember = null;


        try {
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:2478:2: (iv_ruleInterfaceMember= ruleInterfaceMember EOF )
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:2479:2: iv_ruleInterfaceMember= ruleInterfaceMember EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getInterfaceMemberRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleInterfaceMember_in_entryRuleInterfaceMember4871);
            iv_ruleInterfaceMember=ruleInterfaceMember();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleInterfaceMember; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleInterfaceMember4881); if (failed) return current;

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
    // $ANTLR end entryRuleInterfaceMember


    // $ANTLR start ruleInterfaceMember
    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:2486:1: ruleInterfaceMember returns [EObject current=null] : (this_Const_0= ruleConst | this_InterfaceFeature_1= ruleInterfaceFeature ) ;
    public final EObject ruleInterfaceMember() throws RecognitionException {
        EObject current = null;

        EObject this_Const_0 = null;

        EObject this_InterfaceFeature_1 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:2491:6: ( (this_Const_0= ruleConst | this_InterfaceFeature_1= ruleInterfaceFeature ) )
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:2492:1: (this_Const_0= ruleConst | this_InterfaceFeature_1= ruleInterfaceFeature )
            {
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:2492:1: (this_Const_0= ruleConst | this_InterfaceFeature_1= ruleInterfaceFeature )
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==79) ) {
                alt33=1;
            }
            else if ( (LA33_0==RULE_ID||(LA33_0>=15 && LA33_0<=27)||LA33_0==29||LA33_0==54||(LA33_0>=63 && LA33_0<=64)||(LA33_0>=66 && LA33_0<=72)) ) {
                alt33=2;
            }
            else {
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("2492:1: (this_Const_0= ruleConst | this_InterfaceFeature_1= ruleInterfaceFeature )", 33, 0, input);

                throw nvae;
            }
            switch (alt33) {
                case 1 :
                    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:2493:2: this_Const_0= ruleConst
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getInterfaceMemberAccess().getConstParserRuleCall_0(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleConst_in_ruleInterfaceMember4931);
                    this_Const_0=ruleConst();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_Const_0; 
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:2506:2: this_InterfaceFeature_1= ruleInterfaceFeature
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getInterfaceMemberAccess().getInterfaceFeatureParserRuleCall_1(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleInterfaceFeature_in_ruleInterfaceMember4961);
                    this_InterfaceFeature_1=ruleInterfaceFeature();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_InterfaceFeature_1; 
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;

            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
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
    // $ANTLR end ruleInterfaceMember


    // $ANTLR start entryRuleInterfaceFeature
    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:2525:1: entryRuleInterfaceFeature returns [EObject current=null] : iv_ruleInterfaceFeature= ruleInterfaceFeature EOF ;
    public final EObject entryRuleInterfaceFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInterfaceFeature = null;


        try {
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:2526:2: (iv_ruleInterfaceFeature= ruleInterfaceFeature EOF )
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:2527:2: iv_ruleInterfaceFeature= ruleInterfaceFeature EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getInterfaceFeatureRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleInterfaceFeature_in_entryRuleInterfaceFeature4996);
            iv_ruleInterfaceFeature=ruleInterfaceFeature();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleInterfaceFeature; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleInterfaceFeature5006); if (failed) return current;

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
    // $ANTLR end entryRuleInterfaceFeature


    // $ANTLR start ruleInterfaceFeature
    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:2534:1: ruleInterfaceFeature returns [EObject current=null] : (this_Attribute_0= ruleAttribute | this_Operation_1= ruleOperation ) ;
    public final EObject ruleInterfaceFeature() throws RecognitionException {
        EObject current = null;

        EObject this_Attribute_0 = null;

        EObject this_Operation_1 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:2539:6: ( (this_Attribute_0= ruleAttribute | this_Operation_1= ruleOperation ) )
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:2540:1: (this_Attribute_0= ruleAttribute | this_Operation_1= ruleOperation )
            {
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:2540:1: (this_Attribute_0= ruleAttribute | this_Operation_1= ruleOperation )
            int alt34=2;
            alt34 = dfa34.predict(input);
            switch (alt34) {
                case 1 :
                    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:2541:2: this_Attribute_0= ruleAttribute
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getInterfaceFeatureAccess().getAttributeParserRuleCall_0(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleAttribute_in_ruleInterfaceFeature5056);
                    this_Attribute_0=ruleAttribute();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_Attribute_0; 
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:2554:2: this_Operation_1= ruleOperation
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getInterfaceFeatureAccess().getOperationParserRuleCall_1(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleOperation_in_ruleInterfaceFeature5086);
                    this_Operation_1=ruleOperation();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_Operation_1; 
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;

            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
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
    // $ANTLR end ruleInterfaceFeature


    // $ANTLR start entryRuleOperation
    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:2573:1: entryRuleOperation returns [EObject current=null] : iv_ruleOperation= ruleOperation EOF ;
    public final EObject entryRuleOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperation = null;


        try {
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:2574:2: (iv_ruleOperation= ruleOperation EOF )
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:2575:2: iv_ruleOperation= ruleOperation EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getOperationRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleOperation_in_entryRuleOperation5121);
            iv_ruleOperation=ruleOperation();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleOperation; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOperation5131); if (failed) return current;

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
    // $ANTLR end entryRuleOperation


    // $ANTLR start ruleOperation
    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:2582:1: ruleOperation returns [EObject current=null] : ( ( '[' ( (lv_extendedAttributes_1_0= ruleOperationExtendedAttribute ) ) ( ',' ( (lv_extendedAttributes_3_0= ruleOperationExtendedAttribute ) ) )* ']' )? ( (lv_stringifier_5_0= 'stringifier' ) )? ( (lv_omittable_6_0= 'omittable' ) )? ( (lv_specials_7_0= ruleOperationSpecial ) )* ( (lv_return_8_0= ruleTypeRef ) ) ( (lv_name_9_0= RULE_ID ) )? '(' ( ( (lv_arguments_11_0= ruleArgument ) ) ( ',' ( (lv_arguments_13_0= ruleArgument ) ) )* )? ')' ( 'raises' '(' ( ( ruleScopedName ) ) ( ',' ( ( ruleScopedName ) ) )* ')' )? ';' ) ;
    public final EObject ruleOperation() throws RecognitionException {
        EObject current = null;

        Token lv_stringifier_5_0=null;
        Token lv_omittable_6_0=null;
        Token lv_name_9_0=null;
        EObject lv_extendedAttributes_1_0 = null;

        EObject lv_extendedAttributes_3_0 = null;

        EObject lv_specials_7_0 = null;

        EObject lv_return_8_0 = null;

        EObject lv_arguments_11_0 = null;

        EObject lv_arguments_13_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:2587:6: ( ( ( '[' ( (lv_extendedAttributes_1_0= ruleOperationExtendedAttribute ) ) ( ',' ( (lv_extendedAttributes_3_0= ruleOperationExtendedAttribute ) ) )* ']' )? ( (lv_stringifier_5_0= 'stringifier' ) )? ( (lv_omittable_6_0= 'omittable' ) )? ( (lv_specials_7_0= ruleOperationSpecial ) )* ( (lv_return_8_0= ruleTypeRef ) ) ( (lv_name_9_0= RULE_ID ) )? '(' ( ( (lv_arguments_11_0= ruleArgument ) ) ( ',' ( (lv_arguments_13_0= ruleArgument ) ) )* )? ')' ( 'raises' '(' ( ( ruleScopedName ) ) ( ',' ( ( ruleScopedName ) ) )* ')' )? ';' ) )
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:2588:1: ( ( '[' ( (lv_extendedAttributes_1_0= ruleOperationExtendedAttribute ) ) ( ',' ( (lv_extendedAttributes_3_0= ruleOperationExtendedAttribute ) ) )* ']' )? ( (lv_stringifier_5_0= 'stringifier' ) )? ( (lv_omittable_6_0= 'omittable' ) )? ( (lv_specials_7_0= ruleOperationSpecial ) )* ( (lv_return_8_0= ruleTypeRef ) ) ( (lv_name_9_0= RULE_ID ) )? '(' ( ( (lv_arguments_11_0= ruleArgument ) ) ( ',' ( (lv_arguments_13_0= ruleArgument ) ) )* )? ')' ( 'raises' '(' ( ( ruleScopedName ) ) ( ',' ( ( ruleScopedName ) ) )* ')' )? ';' )
            {
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:2588:1: ( ( '[' ( (lv_extendedAttributes_1_0= ruleOperationExtendedAttribute ) ) ( ',' ( (lv_extendedAttributes_3_0= ruleOperationExtendedAttribute ) ) )* ']' )? ( (lv_stringifier_5_0= 'stringifier' ) )? ( (lv_omittable_6_0= 'omittable' ) )? ( (lv_specials_7_0= ruleOperationSpecial ) )* ( (lv_return_8_0= ruleTypeRef ) ) ( (lv_name_9_0= RULE_ID ) )? '(' ( ( (lv_arguments_11_0= ruleArgument ) ) ( ',' ( (lv_arguments_13_0= ruleArgument ) ) )* )? ')' ( 'raises' '(' ( ( ruleScopedName ) ) ( ',' ( ( ruleScopedName ) ) )* ')' )? ';' )
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:2588:2: ( '[' ( (lv_extendedAttributes_1_0= ruleOperationExtendedAttribute ) ) ( ',' ( (lv_extendedAttributes_3_0= ruleOperationExtendedAttribute ) ) )* ']' )? ( (lv_stringifier_5_0= 'stringifier' ) )? ( (lv_omittable_6_0= 'omittable' ) )? ( (lv_specials_7_0= ruleOperationSpecial ) )* ( (lv_return_8_0= ruleTypeRef ) ) ( (lv_name_9_0= RULE_ID ) )? '(' ( ( (lv_arguments_11_0= ruleArgument ) ) ( ',' ( (lv_arguments_13_0= ruleArgument ) ) )* )? ')' ( 'raises' '(' ( ( ruleScopedName ) ) ( ',' ( ( ruleScopedName ) ) )* ')' )? ';'
            {
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:2588:2: ( '[' ( (lv_extendedAttributes_1_0= ruleOperationExtendedAttribute ) ) ( ',' ( (lv_extendedAttributes_3_0= ruleOperationExtendedAttribute ) ) )* ']' )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==54) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:2588:4: '[' ( (lv_extendedAttributes_1_0= ruleOperationExtendedAttribute ) ) ( ',' ( (lv_extendedAttributes_3_0= ruleOperationExtendedAttribute ) ) )* ']'
                    {
                    match(input,54,FOLLOW_54_in_ruleOperation5167); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getOperationAccess().getLeftSquareBracketKeyword_0_0(), null); 
                          
                    }
                    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:2592:1: ( (lv_extendedAttributes_1_0= ruleOperationExtendedAttribute ) )
                    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:2593:1: (lv_extendedAttributes_1_0= ruleOperationExtendedAttribute )
                    {
                    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:2593:1: (lv_extendedAttributes_1_0= ruleOperationExtendedAttribute )
                    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:2594:3: lv_extendedAttributes_1_0= ruleOperationExtendedAttribute
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getOperationAccess().getExtendedAttributesOperationExtendedAttributeParserRuleCall_0_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleOperationExtendedAttribute_in_ruleOperation5188);
                    lv_extendedAttributes_1_0=ruleOperationExtendedAttribute();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getOperationRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        try {
                      	       		add(
                      	       			current, 
                      	       			"extendedAttributes",
                      	        		lv_extendedAttributes_1_0, 
                      	        		"OperationExtendedAttribute", 
                      	        		currentNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }


                    }

                    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:2616:2: ( ',' ( (lv_extendedAttributes_3_0= ruleOperationExtendedAttribute ) ) )*
                    loop35:
                    do {
                        int alt35=2;
                        int LA35_0 = input.LA(1);

                        if ( (LA35_0==34) ) {
                            alt35=1;
                        }


                        switch (alt35) {
                    	case 1 :
                    	    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:2616:4: ',' ( (lv_extendedAttributes_3_0= ruleOperationExtendedAttribute ) )
                    	    {
                    	    match(input,34,FOLLOW_34_in_ruleOperation5199); if (failed) return current;
                    	    if ( backtracking==0 ) {

                    	              createLeafNode(grammarAccess.getOperationAccess().getCommaKeyword_0_2_0(), null); 
                    	          
                    	    }
                    	    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:2620:1: ( (lv_extendedAttributes_3_0= ruleOperationExtendedAttribute ) )
                    	    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:2621:1: (lv_extendedAttributes_3_0= ruleOperationExtendedAttribute )
                    	    {
                    	    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:2621:1: (lv_extendedAttributes_3_0= ruleOperationExtendedAttribute )
                    	    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:2622:3: lv_extendedAttributes_3_0= ruleOperationExtendedAttribute
                    	    {
                    	    if ( backtracking==0 ) {
                    	       
                    	      	        currentNode=createCompositeNode(grammarAccess.getOperationAccess().getExtendedAttributesOperationExtendedAttributeParserRuleCall_0_2_1_0(), currentNode); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleOperationExtendedAttribute_in_ruleOperation5220);
                    	    lv_extendedAttributes_3_0=ruleOperationExtendedAttribute();
                    	    _fsp--;
                    	    if (failed) return current;
                    	    if ( backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = factory.create(grammarAccess.getOperationRule().getType().getClassifier());
                    	      	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	      	        }
                    	      	        try {
                    	      	       		add(
                    	      	       			current, 
                    	      	       			"extendedAttributes",
                    	      	        		lv_extendedAttributes_3_0, 
                    	      	        		"OperationExtendedAttribute", 
                    	      	        		currentNode);
                    	      	        } catch (ValueConverterException vce) {
                    	      				handleValueConverterException(vce);
                    	      	        }
                    	      	        currentNode = currentNode.getParent();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop35;
                        }
                    } while (true);

                    match(input,55,FOLLOW_55_in_ruleOperation5232); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getOperationAccess().getRightSquareBracketKeyword_0_3(), null); 
                          
                    }

                    }
                    break;

            }

            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:2648:3: ( (lv_stringifier_5_0= 'stringifier' ) )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==63) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:2649:1: (lv_stringifier_5_0= 'stringifier' )
                    {
                    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:2649:1: (lv_stringifier_5_0= 'stringifier' )
                    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:2650:3: lv_stringifier_5_0= 'stringifier'
                    {
                    lv_stringifier_5_0=(Token)input.LT(1);
                    match(input,63,FOLLOW_63_in_ruleOperation5252); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getOperationAccess().getStringifierStringifierKeyword_1_0(), "stringifier"); 
                          
                    }
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getOperationRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode, current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "stringifier", true, "stringifier", lastConsumedNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:2669:3: ( (lv_omittable_6_0= 'omittable' ) )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==64) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:2670:1: (lv_omittable_6_0= 'omittable' )
                    {
                    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:2670:1: (lv_omittable_6_0= 'omittable' )
                    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:2671:3: lv_omittable_6_0= 'omittable'
                    {
                    lv_omittable_6_0=(Token)input.LT(1);
                    match(input,64,FOLLOW_64_in_ruleOperation5284); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getOperationAccess().getOmittableOmittableKeyword_2_0(), "omittable"); 
                          
                    }
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getOperationRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode, current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "omittable", true, "omittable", lastConsumedNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:2690:3: ( (lv_specials_7_0= ruleOperationSpecial ) )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( ((LA39_0>=66 && LA39_0<=70)) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:2691:1: (lv_specials_7_0= ruleOperationSpecial )
            	    {
            	    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:2691:1: (lv_specials_7_0= ruleOperationSpecial )
            	    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:2692:3: lv_specials_7_0= ruleOperationSpecial
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getOperationAccess().getSpecialsOperationSpecialParserRuleCall_3_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOperationSpecial_in_ruleOperation5319);
            	    lv_specials_7_0=ruleOperationSpecial();
            	    _fsp--;
            	    if (failed) return current;
            	    if ( backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = factory.create(grammarAccess.getOperationRule().getType().getClassifier());
            	      	            associateNodeWithAstElement(currentNode.getParent(), current);
            	      	        }
            	      	        try {
            	      	       		add(
            	      	       			current, 
            	      	       			"specials",
            	      	        		lv_specials_7_0, 
            	      	        		"OperationSpecial", 
            	      	        		currentNode);
            	      	        } catch (ValueConverterException vce) {
            	      				handleValueConverterException(vce);
            	      	        }
            	      	        currentNode = currentNode.getParent();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop39;
                }
            } while (true);

            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:2714:3: ( (lv_return_8_0= ruleTypeRef ) )
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:2715:1: (lv_return_8_0= ruleTypeRef )
            {
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:2715:1: (lv_return_8_0= ruleTypeRef )
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:2716:3: lv_return_8_0= ruleTypeRef
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getOperationAccess().getReturnTypeRefParserRuleCall_4_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleTypeRef_in_ruleOperation5341);
            lv_return_8_0=ruleTypeRef();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getOperationRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"return",
              	        		lv_return_8_0, 
              	        		"TypeRef", 
              	        		currentNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	        currentNode = currentNode.getParent();
              	    
            }

            }


            }

            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:2738:2: ( (lv_name_9_0= RULE_ID ) )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==RULE_ID) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:2739:1: (lv_name_9_0= RULE_ID )
                    {
                    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:2739:1: (lv_name_9_0= RULE_ID )
                    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:2740:3: lv_name_9_0= RULE_ID
                    {
                    lv_name_9_0=(Token)input.LT(1);
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleOperation5358); if (failed) return current;
                    if ( backtracking==0 ) {

                      			createLeafNode(grammarAccess.getOperationAccess().getNameIDTerminalRuleCall_5_0(), "name"); 
                      		
                    }
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getOperationRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode, current);
                      	        }
                      	        try {
                      	       		set(
                      	       			current, 
                      	       			"name",
                      	        		lv_name_9_0, 
                      	        		"ID", 
                      	        		lastConsumedNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	    
                    }

                    }


                    }
                    break;

            }

            match(input,33,FOLLOW_33_in_ruleOperation5374); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getOperationAccess().getLeftParenthesisKeyword_6(), null); 
                  
            }
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:2766:1: ( ( (lv_arguments_11_0= ruleArgument ) ) ( ',' ( (lv_arguments_13_0= ruleArgument ) ) )* )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==RULE_ID||(LA42_0>=15 && LA42_0<=27)||LA42_0==29||LA42_0==54||(LA42_0>=76 && LA42_0<=77)) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:2766:2: ( (lv_arguments_11_0= ruleArgument ) ) ( ',' ( (lv_arguments_13_0= ruleArgument ) ) )*
                    {
                    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:2766:2: ( (lv_arguments_11_0= ruleArgument ) )
                    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:2767:1: (lv_arguments_11_0= ruleArgument )
                    {
                    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:2767:1: (lv_arguments_11_0= ruleArgument )
                    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:2768:3: lv_arguments_11_0= ruleArgument
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getOperationAccess().getArgumentsArgumentParserRuleCall_7_0_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleArgument_in_ruleOperation5396);
                    lv_arguments_11_0=ruleArgument();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getOperationRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        try {
                      	       		add(
                      	       			current, 
                      	       			"arguments",
                      	        		lv_arguments_11_0, 
                      	        		"Argument", 
                      	        		currentNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }


                    }

                    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:2790:2: ( ',' ( (lv_arguments_13_0= ruleArgument ) ) )*
                    loop41:
                    do {
                        int alt41=2;
                        int LA41_0 = input.LA(1);

                        if ( (LA41_0==34) ) {
                            alt41=1;
                        }


                        switch (alt41) {
                    	case 1 :
                    	    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:2790:4: ',' ( (lv_arguments_13_0= ruleArgument ) )
                    	    {
                    	    match(input,34,FOLLOW_34_in_ruleOperation5407); if (failed) return current;
                    	    if ( backtracking==0 ) {

                    	              createLeafNode(grammarAccess.getOperationAccess().getCommaKeyword_7_1_0(), null); 
                    	          
                    	    }
                    	    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:2794:1: ( (lv_arguments_13_0= ruleArgument ) )
                    	    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:2795:1: (lv_arguments_13_0= ruleArgument )
                    	    {
                    	    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:2795:1: (lv_arguments_13_0= ruleArgument )
                    	    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:2796:3: lv_arguments_13_0= ruleArgument
                    	    {
                    	    if ( backtracking==0 ) {
                    	       
                    	      	        currentNode=createCompositeNode(grammarAccess.getOperationAccess().getArgumentsArgumentParserRuleCall_7_1_1_0(), currentNode); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleArgument_in_ruleOperation5428);
                    	    lv_arguments_13_0=ruleArgument();
                    	    _fsp--;
                    	    if (failed) return current;
                    	    if ( backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = factory.create(grammarAccess.getOperationRule().getType().getClassifier());
                    	      	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	      	        }
                    	      	        try {
                    	      	       		add(
                    	      	       			current, 
                    	      	       			"arguments",
                    	      	        		lv_arguments_13_0, 
                    	      	        		"Argument", 
                    	      	        		currentNode);
                    	      	        } catch (ValueConverterException vce) {
                    	      				handleValueConverterException(vce);
                    	      	        }
                    	      	        currentNode = currentNode.getParent();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop41;
                        }
                    } while (true);


                    }
                    break;

            }

            match(input,35,FOLLOW_35_in_ruleOperation5442); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getOperationAccess().getRightParenthesisKeyword_8(), null); 
                  
            }
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:2822:1: ( 'raises' '(' ( ( ruleScopedName ) ) ( ',' ( ( ruleScopedName ) ) )* ')' )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==65) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:2822:3: 'raises' '(' ( ( ruleScopedName ) ) ( ',' ( ( ruleScopedName ) ) )* ')'
                    {
                    match(input,65,FOLLOW_65_in_ruleOperation5453); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getOperationAccess().getRaisesKeyword_9_0(), null); 
                          
                    }
                    match(input,33,FOLLOW_33_in_ruleOperation5463); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getOperationAccess().getLeftParenthesisKeyword_9_1(), null); 
                          
                    }
                    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:2830:1: ( ( ruleScopedName ) )
                    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:2831:1: ( ruleScopedName )
                    {
                    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:2831:1: ( ruleScopedName )
                    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:2832:3: ruleScopedName
                    {
                    if ( backtracking==0 ) {
                       
                      		  /* */ 
                      		
                    }
                    if ( backtracking==0 ) {

                      			if (current==null) {
                      	            current = factory.create(grammarAccess.getOperationRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode, current);
                      	        }
                              
                    }
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getOperationAccess().getRaisesExceptionCrossReference_9_2_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleScopedName_in_ruleOperation5490);
                    ruleScopedName();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }


                    }

                    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:2849:2: ( ',' ( ( ruleScopedName ) ) )*
                    loop43:
                    do {
                        int alt43=2;
                        int LA43_0 = input.LA(1);

                        if ( (LA43_0==34) ) {
                            alt43=1;
                        }


                        switch (alt43) {
                    	case 1 :
                    	    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:2849:4: ',' ( ( ruleScopedName ) )
                    	    {
                    	    match(input,34,FOLLOW_34_in_ruleOperation5501); if (failed) return current;
                    	    if ( backtracking==0 ) {

                    	              createLeafNode(grammarAccess.getOperationAccess().getCommaKeyword_9_3_0(), null); 
                    	          
                    	    }
                    	    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:2853:1: ( ( ruleScopedName ) )
                    	    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:2854:1: ( ruleScopedName )
                    	    {
                    	    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:2854:1: ( ruleScopedName )
                    	    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:2855:3: ruleScopedName
                    	    {
                    	    if ( backtracking==0 ) {
                    	       
                    	      		  /* */ 
                    	      		
                    	    }
                    	    if ( backtracking==0 ) {

                    	      			if (current==null) {
                    	      	            current = factory.create(grammarAccess.getOperationRule().getType().getClassifier());
                    	      	            associateNodeWithAstElement(currentNode, current);
                    	      	        }
                    	              
                    	    }
                    	    if ( backtracking==0 ) {
                    	       
                    	      	        currentNode=createCompositeNode(grammarAccess.getOperationAccess().getRaisesExceptionCrossReference_9_3_1_0(), currentNode); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleScopedName_in_ruleOperation5528);
                    	    ruleScopedName();
                    	    _fsp--;
                    	    if (failed) return current;
                    	    if ( backtracking==0 ) {
                    	       
                    	      	        currentNode = currentNode.getParent();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop43;
                        }
                    } while (true);

                    match(input,35,FOLLOW_35_in_ruleOperation5540); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getOperationAccess().getRightParenthesisKeyword_9_4(), null); 
                          
                    }

                    }
                    break;

            }

            match(input,12,FOLLOW_12_in_ruleOperation5552); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getOperationAccess().getSemicolonKeyword_10(), null); 
                  
            }

            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
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
    // $ANTLR end ruleOperation


    // $ANTLR start entryRuleOperationExtendedAttribute
    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:2888:1: entryRuleOperationExtendedAttribute returns [EObject current=null] : iv_ruleOperationExtendedAttribute= ruleOperationExtendedAttribute EOF ;
    public final EObject entryRuleOperationExtendedAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperationExtendedAttribute = null;


        try {
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:2889:2: (iv_ruleOperationExtendedAttribute= ruleOperationExtendedAttribute EOF )
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:2890:2: iv_ruleOperationExtendedAttribute= ruleOperationExtendedAttribute EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getOperationExtendedAttributeRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleOperationExtendedAttribute_in_entryRuleOperationExtendedAttribute5588);
            iv_ruleOperationExtendedAttribute=ruleOperationExtendedAttribute();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleOperationExtendedAttribute; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOperationExtendedAttribute5598); if (failed) return current;

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
    // $ANTLR end entryRuleOperationExtendedAttribute


    // $ANTLR start ruleOperationExtendedAttribute
    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:2897:1: ruleOperationExtendedAttribute returns [EObject current=null] : (this_TreatNullAs_0= ruleTreatNullAs | this_TreatUndefinedAs_1= ruleTreatUndefinedAs ) ;
    public final EObject ruleOperationExtendedAttribute() throws RecognitionException {
        EObject current = null;

        EObject this_TreatNullAs_0 = null;

        EObject this_TreatUndefinedAs_1 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:2902:6: ( (this_TreatNullAs_0= ruleTreatNullAs | this_TreatUndefinedAs_1= ruleTreatUndefinedAs ) )
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:2903:1: (this_TreatNullAs_0= ruleTreatNullAs | this_TreatUndefinedAs_1= ruleTreatUndefinedAs )
            {
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:2903:1: (this_TreatNullAs_0= ruleTreatNullAs | this_TreatUndefinedAs_1= ruleTreatUndefinedAs )
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==45) ) {
                alt45=1;
            }
            else if ( (LA45_0==47) ) {
                alt45=2;
            }
            else {
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("2903:1: (this_TreatNullAs_0= ruleTreatNullAs | this_TreatUndefinedAs_1= ruleTreatUndefinedAs )", 45, 0, input);

                throw nvae;
            }
            switch (alt45) {
                case 1 :
                    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:2904:2: this_TreatNullAs_0= ruleTreatNullAs
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getOperationExtendedAttributeAccess().getTreatNullAsParserRuleCall_0(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleTreatNullAs_in_ruleOperationExtendedAttribute5648);
                    this_TreatNullAs_0=ruleTreatNullAs();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_TreatNullAs_0; 
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:2917:2: this_TreatUndefinedAs_1= ruleTreatUndefinedAs
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getOperationExtendedAttributeAccess().getTreatUndefinedAsParserRuleCall_1(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleTreatUndefinedAs_in_ruleOperationExtendedAttribute5678);
                    this_TreatUndefinedAs_1=ruleTreatUndefinedAs();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_TreatUndefinedAs_1; 
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;

            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
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
    // $ANTLR end ruleOperationExtendedAttribute


    // $ANTLR start entryRuleOperationSpecial
    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:2936:1: entryRuleOperationSpecial returns [EObject current=null] : iv_ruleOperationSpecial= ruleOperationSpecial EOF ;
    public final EObject entryRuleOperationSpecial() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperationSpecial = null;


        try {
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:2937:2: (iv_ruleOperationSpecial= ruleOperationSpecial EOF )
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:2938:2: iv_ruleOperationSpecial= ruleOperationSpecial EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getOperationSpecialRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleOperationSpecial_in_entryRuleOperationSpecial5713);
            iv_ruleOperationSpecial=ruleOperationSpecial();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleOperationSpecial; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOperationSpecial5723); if (failed) return current;

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
    // $ANTLR end entryRuleOperationSpecial


    // $ANTLR start ruleOperationSpecial
    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:2945:1: ruleOperationSpecial returns [EObject current=null] : ( ( () 'getter' ) | ( () 'setter' ) | ( () 'creator' ) | ( () 'deleter' ) | ( () 'caller' ) ) ;
    public final EObject ruleOperationSpecial() throws RecognitionException {
        EObject current = null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:2950:6: ( ( ( () 'getter' ) | ( () 'setter' ) | ( () 'creator' ) | ( () 'deleter' ) | ( () 'caller' ) ) )
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:2951:1: ( ( () 'getter' ) | ( () 'setter' ) | ( () 'creator' ) | ( () 'deleter' ) | ( () 'caller' ) )
            {
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:2951:1: ( ( () 'getter' ) | ( () 'setter' ) | ( () 'creator' ) | ( () 'deleter' ) | ( () 'caller' ) )
            int alt46=5;
            switch ( input.LA(1) ) {
            case 66:
                {
                alt46=1;
                }
                break;
            case 67:
                {
                alt46=2;
                }
                break;
            case 68:
                {
                alt46=3;
                }
                break;
            case 69:
                {
                alt46=4;
                }
                break;
            case 70:
                {
                alt46=5;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("2951:1: ( ( () 'getter' ) | ( () 'setter' ) | ( () 'creator' ) | ( () 'deleter' ) | ( () 'caller' ) )", 46, 0, input);

                throw nvae;
            }

            switch (alt46) {
                case 1 :
                    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:2951:2: ( () 'getter' )
                    {
                    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:2951:2: ( () 'getter' )
                    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:2951:3: () 'getter'
                    {
                    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:2951:3: ()
                    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:2952:2: 
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              temp=factory.create(grammarAccess.getOperationSpecialAccess().getOperationSpecialGetterAction_0_0().getType().getClassifier());
                              current = temp; 
                              temp = null;
                              CompositeNode newNode = createCompositeNode(grammarAccess.getOperationSpecialAccess().getOperationSpecialGetterAction_0_0(), currentNode.getParent());
                          newNode.getChildren().add(currentNode);
                          moveLookaheadInfo(currentNode, newNode);
                          currentNode = newNode; 
                              associateNodeWithAstElement(currentNode, current); 
                          
                    }

                    }

                    match(input,66,FOLLOW_66_in_ruleOperationSpecial5771); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getOperationSpecialAccess().getGetterKeyword_0_1(), null); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:2970:6: ( () 'setter' )
                    {
                    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:2970:6: ( () 'setter' )
                    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:2970:7: () 'setter'
                    {
                    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:2970:7: ()
                    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:2971:2: 
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              temp=factory.create(grammarAccess.getOperationSpecialAccess().getOperationSpecialSetterAction_1_0().getType().getClassifier());
                              current = temp; 
                              temp = null;
                              CompositeNode newNode = createCompositeNode(grammarAccess.getOperationSpecialAccess().getOperationSpecialSetterAction_1_0(), currentNode.getParent());
                          newNode.getChildren().add(currentNode);
                          moveLookaheadInfo(currentNode, newNode);
                          currentNode = newNode; 
                              associateNodeWithAstElement(currentNode, current); 
                          
                    }

                    }

                    match(input,67,FOLLOW_67_in_ruleOperationSpecial5801); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getOperationSpecialAccess().getSetterKeyword_1_1(), null); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:2989:6: ( () 'creator' )
                    {
                    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:2989:6: ( () 'creator' )
                    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:2989:7: () 'creator'
                    {
                    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:2989:7: ()
                    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:2990:2: 
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              temp=factory.create(grammarAccess.getOperationSpecialAccess().getOperationSpecialCreatorAction_2_0().getType().getClassifier());
                              current = temp; 
                              temp = null;
                              CompositeNode newNode = createCompositeNode(grammarAccess.getOperationSpecialAccess().getOperationSpecialCreatorAction_2_0(), currentNode.getParent());
                          newNode.getChildren().add(currentNode);
                          moveLookaheadInfo(currentNode, newNode);
                          currentNode = newNode; 
                              associateNodeWithAstElement(currentNode, current); 
                          
                    }

                    }

                    match(input,68,FOLLOW_68_in_ruleOperationSpecial5831); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getOperationSpecialAccess().getCreatorKeyword_2_1(), null); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:3008:6: ( () 'deleter' )
                    {
                    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:3008:6: ( () 'deleter' )
                    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:3008:7: () 'deleter'
                    {
                    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:3008:7: ()
                    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:3009:2: 
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              temp=factory.create(grammarAccess.getOperationSpecialAccess().getOperationSpecialDeleterAction_3_0().getType().getClassifier());
                              current = temp; 
                              temp = null;
                              CompositeNode newNode = createCompositeNode(grammarAccess.getOperationSpecialAccess().getOperationSpecialDeleterAction_3_0(), currentNode.getParent());
                          newNode.getChildren().add(currentNode);
                          moveLookaheadInfo(currentNode, newNode);
                          currentNode = newNode; 
                              associateNodeWithAstElement(currentNode, current); 
                          
                    }

                    }

                    match(input,69,FOLLOW_69_in_ruleOperationSpecial5861); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getOperationSpecialAccess().getDeleterKeyword_3_1(), null); 
                          
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:3027:6: ( () 'caller' )
                    {
                    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:3027:6: ( () 'caller' )
                    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:3027:7: () 'caller'
                    {
                    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:3027:7: ()
                    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:3028:2: 
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              temp=factory.create(grammarAccess.getOperationSpecialAccess().getOperationSpecialCallerAction_4_0().getType().getClassifier());
                              current = temp; 
                              temp = null;
                              CompositeNode newNode = createCompositeNode(grammarAccess.getOperationSpecialAccess().getOperationSpecialCallerAction_4_0(), currentNode.getParent());
                          newNode.getChildren().add(currentNode);
                          moveLookaheadInfo(currentNode, newNode);
                          currentNode = newNode; 
                              associateNodeWithAstElement(currentNode, current); 
                          
                    }

                    }

                    match(input,70,FOLLOW_70_in_ruleOperationSpecial5891); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getOperationSpecialAccess().getCallerKeyword_4_1(), null); 
                          
                    }

                    }


                    }
                    break;

            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
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
    // $ANTLR end ruleOperationSpecial


    // $ANTLR start entryRuleAttribute
    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:3053:1: entryRuleAttribute returns [EObject current=null] : iv_ruleAttribute= ruleAttribute EOF ;
    public final EObject entryRuleAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttribute = null;


        try {
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:3054:2: (iv_ruleAttribute= ruleAttribute EOF )
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:3055:2: iv_ruleAttribute= ruleAttribute EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getAttributeRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleAttribute_in_entryRuleAttribute5928);
            iv_ruleAttribute=ruleAttribute();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleAttribute; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttribute5938); if (failed) return current;

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
    // $ANTLR end entryRuleAttribute


    // $ANTLR start ruleAttribute
    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:3062:1: ruleAttribute returns [EObject current=null] : ( ( '[' ( (lv_extendedAttributes_1_0= ruleAttributeExtendedAttribute ) ) ( ',' ( (lv_extendedAttributes_3_0= ruleAttributeExtendedAttribute ) ) )* ']' )? ( (lv_stringifier_5_0= 'stringifier' ) )? ( 'readonly' )? 'attribute' ( (lv_type_8_0= ruleTypeRef ) ) ( (lv_name_9_0= ruleScopedName ) ) ( ( 'getraises' '(' ( ( ruleScopedName ) ) ( ',' ( ( ruleScopedName ) ) )* ')' )? ( 'setraises' '(' ( ( ruleScopedName ) ) ( ',' ( ( ruleScopedName ) ) )* ')' )? ) ';' ) ;
    public final EObject ruleAttribute() throws RecognitionException {
        EObject current = null;

        Token lv_stringifier_5_0=null;
        EObject lv_extendedAttributes_1_0 = null;

        EObject lv_extendedAttributes_3_0 = null;

        EObject lv_type_8_0 = null;

        AntlrDatatypeRuleToken lv_name_9_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:3067:6: ( ( ( '[' ( (lv_extendedAttributes_1_0= ruleAttributeExtendedAttribute ) ) ( ',' ( (lv_extendedAttributes_3_0= ruleAttributeExtendedAttribute ) ) )* ']' )? ( (lv_stringifier_5_0= 'stringifier' ) )? ( 'readonly' )? 'attribute' ( (lv_type_8_0= ruleTypeRef ) ) ( (lv_name_9_0= ruleScopedName ) ) ( ( 'getraises' '(' ( ( ruleScopedName ) ) ( ',' ( ( ruleScopedName ) ) )* ')' )? ( 'setraises' '(' ( ( ruleScopedName ) ) ( ',' ( ( ruleScopedName ) ) )* ')' )? ) ';' ) )
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:3068:1: ( ( '[' ( (lv_extendedAttributes_1_0= ruleAttributeExtendedAttribute ) ) ( ',' ( (lv_extendedAttributes_3_0= ruleAttributeExtendedAttribute ) ) )* ']' )? ( (lv_stringifier_5_0= 'stringifier' ) )? ( 'readonly' )? 'attribute' ( (lv_type_8_0= ruleTypeRef ) ) ( (lv_name_9_0= ruleScopedName ) ) ( ( 'getraises' '(' ( ( ruleScopedName ) ) ( ',' ( ( ruleScopedName ) ) )* ')' )? ( 'setraises' '(' ( ( ruleScopedName ) ) ( ',' ( ( ruleScopedName ) ) )* ')' )? ) ';' )
            {
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:3068:1: ( ( '[' ( (lv_extendedAttributes_1_0= ruleAttributeExtendedAttribute ) ) ( ',' ( (lv_extendedAttributes_3_0= ruleAttributeExtendedAttribute ) ) )* ']' )? ( (lv_stringifier_5_0= 'stringifier' ) )? ( 'readonly' )? 'attribute' ( (lv_type_8_0= ruleTypeRef ) ) ( (lv_name_9_0= ruleScopedName ) ) ( ( 'getraises' '(' ( ( ruleScopedName ) ) ( ',' ( ( ruleScopedName ) ) )* ')' )? ( 'setraises' '(' ( ( ruleScopedName ) ) ( ',' ( ( ruleScopedName ) ) )* ')' )? ) ';' )
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:3068:2: ( '[' ( (lv_extendedAttributes_1_0= ruleAttributeExtendedAttribute ) ) ( ',' ( (lv_extendedAttributes_3_0= ruleAttributeExtendedAttribute ) ) )* ']' )? ( (lv_stringifier_5_0= 'stringifier' ) )? ( 'readonly' )? 'attribute' ( (lv_type_8_0= ruleTypeRef ) ) ( (lv_name_9_0= ruleScopedName ) ) ( ( 'getraises' '(' ( ( ruleScopedName ) ) ( ',' ( ( ruleScopedName ) ) )* ')' )? ( 'setraises' '(' ( ( ruleScopedName ) ) ( ',' ( ( ruleScopedName ) ) )* ')' )? ) ';'
            {
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:3068:2: ( '[' ( (lv_extendedAttributes_1_0= ruleAttributeExtendedAttribute ) ) ( ',' ( (lv_extendedAttributes_3_0= ruleAttributeExtendedAttribute ) ) )* ']' )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==54) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:3068:4: '[' ( (lv_extendedAttributes_1_0= ruleAttributeExtendedAttribute ) ) ( ',' ( (lv_extendedAttributes_3_0= ruleAttributeExtendedAttribute ) ) )* ']'
                    {
                    match(input,54,FOLLOW_54_in_ruleAttribute5974); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getAttributeAccess().getLeftSquareBracketKeyword_0_0(), null); 
                          
                    }
                    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:3072:1: ( (lv_extendedAttributes_1_0= ruleAttributeExtendedAttribute ) )
                    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:3073:1: (lv_extendedAttributes_1_0= ruleAttributeExtendedAttribute )
                    {
                    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:3073:1: (lv_extendedAttributes_1_0= ruleAttributeExtendedAttribute )
                    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:3074:3: lv_extendedAttributes_1_0= ruleAttributeExtendedAttribute
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getAttributeAccess().getExtendedAttributesAttributeExtendedAttributeParserRuleCall_0_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleAttributeExtendedAttribute_in_ruleAttribute5995);
                    lv_extendedAttributes_1_0=ruleAttributeExtendedAttribute();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getAttributeRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        try {
                      	       		add(
                      	       			current, 
                      	       			"extendedAttributes",
                      	        		lv_extendedAttributes_1_0, 
                      	        		"AttributeExtendedAttribute", 
                      	        		currentNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }


                    }

                    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:3096:2: ( ',' ( (lv_extendedAttributes_3_0= ruleAttributeExtendedAttribute ) ) )*
                    loop47:
                    do {
                        int alt47=2;
                        int LA47_0 = input.LA(1);

                        if ( (LA47_0==34) ) {
                            alt47=1;
                        }


                        switch (alt47) {
                    	case 1 :
                    	    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:3096:4: ',' ( (lv_extendedAttributes_3_0= ruleAttributeExtendedAttribute ) )
                    	    {
                    	    match(input,34,FOLLOW_34_in_ruleAttribute6006); if (failed) return current;
                    	    if ( backtracking==0 ) {

                    	              createLeafNode(grammarAccess.getAttributeAccess().getCommaKeyword_0_2_0(), null); 
                    	          
                    	    }
                    	    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:3100:1: ( (lv_extendedAttributes_3_0= ruleAttributeExtendedAttribute ) )
                    	    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:3101:1: (lv_extendedAttributes_3_0= ruleAttributeExtendedAttribute )
                    	    {
                    	    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:3101:1: (lv_extendedAttributes_3_0= ruleAttributeExtendedAttribute )
                    	    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:3102:3: lv_extendedAttributes_3_0= ruleAttributeExtendedAttribute
                    	    {
                    	    if ( backtracking==0 ) {
                    	       
                    	      	        currentNode=createCompositeNode(grammarAccess.getAttributeAccess().getExtendedAttributesAttributeExtendedAttributeParserRuleCall_0_2_1_0(), currentNode); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleAttributeExtendedAttribute_in_ruleAttribute6027);
                    	    lv_extendedAttributes_3_0=ruleAttributeExtendedAttribute();
                    	    _fsp--;
                    	    if (failed) return current;
                    	    if ( backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = factory.create(grammarAccess.getAttributeRule().getType().getClassifier());
                    	      	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	      	        }
                    	      	        try {
                    	      	       		add(
                    	      	       			current, 
                    	      	       			"extendedAttributes",
                    	      	        		lv_extendedAttributes_3_0, 
                    	      	        		"AttributeExtendedAttribute", 
                    	      	        		currentNode);
                    	      	        } catch (ValueConverterException vce) {
                    	      				handleValueConverterException(vce);
                    	      	        }
                    	      	        currentNode = currentNode.getParent();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop47;
                        }
                    } while (true);

                    match(input,55,FOLLOW_55_in_ruleAttribute6039); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getAttributeAccess().getRightSquareBracketKeyword_0_3(), null); 
                          
                    }

                    }
                    break;

            }

            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:3128:3: ( (lv_stringifier_5_0= 'stringifier' ) )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==63) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:3129:1: (lv_stringifier_5_0= 'stringifier' )
                    {
                    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:3129:1: (lv_stringifier_5_0= 'stringifier' )
                    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:3130:3: lv_stringifier_5_0= 'stringifier'
                    {
                    lv_stringifier_5_0=(Token)input.LT(1);
                    match(input,63,FOLLOW_63_in_ruleAttribute6059); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getAttributeAccess().getStringifierStringifierKeyword_1_0(), "stringifier"); 
                          
                    }
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getAttributeRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode, current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "stringifier", true, "stringifier", lastConsumedNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:3149:3: ( 'readonly' )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==71) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:3149:5: 'readonly'
                    {
                    match(input,71,FOLLOW_71_in_ruleAttribute6084); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getAttributeAccess().getReadonlyKeyword_2(), null); 
                          
                    }

                    }
                    break;

            }

            match(input,72,FOLLOW_72_in_ruleAttribute6096); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getAttributeAccess().getAttributeKeyword_3(), null); 
                  
            }
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:3157:1: ( (lv_type_8_0= ruleTypeRef ) )
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:3158:1: (lv_type_8_0= ruleTypeRef )
            {
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:3158:1: (lv_type_8_0= ruleTypeRef )
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:3159:3: lv_type_8_0= ruleTypeRef
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getAttributeAccess().getTypeTypeRefParserRuleCall_4_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleTypeRef_in_ruleAttribute6117);
            lv_type_8_0=ruleTypeRef();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getAttributeRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"type",
              	        		lv_type_8_0, 
              	        		"TypeRef", 
              	        		currentNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	        currentNode = currentNode.getParent();
              	    
            }

            }


            }

            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:3181:2: ( (lv_name_9_0= ruleScopedName ) )
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:3182:1: (lv_name_9_0= ruleScopedName )
            {
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:3182:1: (lv_name_9_0= ruleScopedName )
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:3183:3: lv_name_9_0= ruleScopedName
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getAttributeAccess().getNameScopedNameParserRuleCall_5_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleScopedName_in_ruleAttribute6138);
            lv_name_9_0=ruleScopedName();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getAttributeRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"name",
              	        		lv_name_9_0, 
              	        		"ScopedName", 
              	        		currentNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	        currentNode = currentNode.getParent();
              	    
            }

            }


            }

            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:3205:2: ( ( 'getraises' '(' ( ( ruleScopedName ) ) ( ',' ( ( ruleScopedName ) ) )* ')' )? ( 'setraises' '(' ( ( ruleScopedName ) ) ( ',' ( ( ruleScopedName ) ) )* ')' )? )
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:3205:3: ( 'getraises' '(' ( ( ruleScopedName ) ) ( ',' ( ( ruleScopedName ) ) )* ')' )? ( 'setraises' '(' ( ( ruleScopedName ) ) ( ',' ( ( ruleScopedName ) ) )* ')' )?
            {
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:3205:3: ( 'getraises' '(' ( ( ruleScopedName ) ) ( ',' ( ( ruleScopedName ) ) )* ')' )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==73) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:3205:5: 'getraises' '(' ( ( ruleScopedName ) ) ( ',' ( ( ruleScopedName ) ) )* ')'
                    {
                    match(input,73,FOLLOW_73_in_ruleAttribute6150); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getAttributeAccess().getGetraisesKeyword_6_0_0(), null); 
                          
                    }
                    match(input,33,FOLLOW_33_in_ruleAttribute6160); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getAttributeAccess().getLeftParenthesisKeyword_6_0_1(), null); 
                          
                    }
                    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:3213:1: ( ( ruleScopedName ) )
                    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:3214:1: ( ruleScopedName )
                    {
                    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:3214:1: ( ruleScopedName )
                    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:3215:3: ruleScopedName
                    {
                    if ( backtracking==0 ) {
                       
                      		  /* */ 
                      		
                    }
                    if ( backtracking==0 ) {

                      			if (current==null) {
                      	            current = factory.create(grammarAccess.getAttributeRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode, current);
                      	        }
                              
                    }
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getAttributeAccess().getGetRaisesExceptionCrossReference_6_0_2_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleScopedName_in_ruleAttribute6187);
                    ruleScopedName();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }


                    }

                    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:3232:2: ( ',' ( ( ruleScopedName ) ) )*
                    loop51:
                    do {
                        int alt51=2;
                        int LA51_0 = input.LA(1);

                        if ( (LA51_0==34) ) {
                            alt51=1;
                        }


                        switch (alt51) {
                    	case 1 :
                    	    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:3232:4: ',' ( ( ruleScopedName ) )
                    	    {
                    	    match(input,34,FOLLOW_34_in_ruleAttribute6198); if (failed) return current;
                    	    if ( backtracking==0 ) {

                    	              createLeafNode(grammarAccess.getAttributeAccess().getCommaKeyword_6_0_3_0(), null); 
                    	          
                    	    }
                    	    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:3236:1: ( ( ruleScopedName ) )
                    	    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:3237:1: ( ruleScopedName )
                    	    {
                    	    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:3237:1: ( ruleScopedName )
                    	    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:3238:3: ruleScopedName
                    	    {
                    	    if ( backtracking==0 ) {
                    	       
                    	      		  /* */ 
                    	      		
                    	    }
                    	    if ( backtracking==0 ) {

                    	      			if (current==null) {
                    	      	            current = factory.create(grammarAccess.getAttributeRule().getType().getClassifier());
                    	      	            associateNodeWithAstElement(currentNode, current);
                    	      	        }
                    	              
                    	    }
                    	    if ( backtracking==0 ) {
                    	       
                    	      	        currentNode=createCompositeNode(grammarAccess.getAttributeAccess().getGetRaisesExceptionCrossReference_6_0_3_1_0(), currentNode); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleScopedName_in_ruleAttribute6225);
                    	    ruleScopedName();
                    	    _fsp--;
                    	    if (failed) return current;
                    	    if ( backtracking==0 ) {
                    	       
                    	      	        currentNode = currentNode.getParent();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop51;
                        }
                    } while (true);

                    match(input,35,FOLLOW_35_in_ruleAttribute6237); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getAttributeAccess().getRightParenthesisKeyword_6_0_4(), null); 
                          
                    }

                    }
                    break;

            }

            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:3259:3: ( 'setraises' '(' ( ( ruleScopedName ) ) ( ',' ( ( ruleScopedName ) ) )* ')' )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==74) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:3259:5: 'setraises' '(' ( ( ruleScopedName ) ) ( ',' ( ( ruleScopedName ) ) )* ')'
                    {
                    match(input,74,FOLLOW_74_in_ruleAttribute6250); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getAttributeAccess().getSetraisesKeyword_6_1_0(), null); 
                          
                    }
                    match(input,33,FOLLOW_33_in_ruleAttribute6260); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getAttributeAccess().getLeftParenthesisKeyword_6_1_1(), null); 
                          
                    }
                    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:3267:1: ( ( ruleScopedName ) )
                    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:3268:1: ( ruleScopedName )
                    {
                    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:3268:1: ( ruleScopedName )
                    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:3269:3: ruleScopedName
                    {
                    if ( backtracking==0 ) {
                       
                      		  /* */ 
                      		
                    }
                    if ( backtracking==0 ) {

                      			if (current==null) {
                      	            current = factory.create(grammarAccess.getAttributeRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode, current);
                      	        }
                              
                    }
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getAttributeAccess().getSetRaisesExceptionCrossReference_6_1_2_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleScopedName_in_ruleAttribute6287);
                    ruleScopedName();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }


                    }

                    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:3286:2: ( ',' ( ( ruleScopedName ) ) )*
                    loop53:
                    do {
                        int alt53=2;
                        int LA53_0 = input.LA(1);

                        if ( (LA53_0==34) ) {
                            alt53=1;
                        }


                        switch (alt53) {
                    	case 1 :
                    	    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:3286:4: ',' ( ( ruleScopedName ) )
                    	    {
                    	    match(input,34,FOLLOW_34_in_ruleAttribute6298); if (failed) return current;
                    	    if ( backtracking==0 ) {

                    	              createLeafNode(grammarAccess.getAttributeAccess().getCommaKeyword_6_1_3_0(), null); 
                    	          
                    	    }
                    	    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:3290:1: ( ( ruleScopedName ) )
                    	    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:3291:1: ( ruleScopedName )
                    	    {
                    	    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:3291:1: ( ruleScopedName )
                    	    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:3292:3: ruleScopedName
                    	    {
                    	    if ( backtracking==0 ) {
                    	       
                    	      		  /* */ 
                    	      		
                    	    }
                    	    if ( backtracking==0 ) {

                    	      			if (current==null) {
                    	      	            current = factory.create(grammarAccess.getAttributeRule().getType().getClassifier());
                    	      	            associateNodeWithAstElement(currentNode, current);
                    	      	        }
                    	              
                    	    }
                    	    if ( backtracking==0 ) {
                    	       
                    	      	        currentNode=createCompositeNode(grammarAccess.getAttributeAccess().getSetRaisesExceptionCrossReference_6_1_3_1_0(), currentNode); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleScopedName_in_ruleAttribute6325);
                    	    ruleScopedName();
                    	    _fsp--;
                    	    if (failed) return current;
                    	    if ( backtracking==0 ) {
                    	       
                    	      	        currentNode = currentNode.getParent();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop53;
                        }
                    } while (true);

                    match(input,35,FOLLOW_35_in_ruleAttribute6337); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getAttributeAccess().getRightParenthesisKeyword_6_1_4(), null); 
                          
                    }

                    }
                    break;

            }


            }

            match(input,12,FOLLOW_12_in_ruleAttribute6350); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getAttributeAccess().getSemicolonKeyword_7(), null); 
                  
            }

            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
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
    // $ANTLR end ruleAttribute


    // $ANTLR start entryRuleAttributeExtendedAttribute
    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:3325:1: entryRuleAttributeExtendedAttribute returns [EObject current=null] : iv_ruleAttributeExtendedAttribute= ruleAttributeExtendedAttribute EOF ;
    public final EObject entryRuleAttributeExtendedAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttributeExtendedAttribute = null;


        try {
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:3326:2: (iv_ruleAttributeExtendedAttribute= ruleAttributeExtendedAttribute EOF )
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:3327:2: iv_ruleAttributeExtendedAttribute= ruleAttributeExtendedAttribute EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getAttributeExtendedAttributeRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleAttributeExtendedAttribute_in_entryRuleAttributeExtendedAttribute6386);
            iv_ruleAttributeExtendedAttribute=ruleAttributeExtendedAttribute();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleAttributeExtendedAttribute; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttributeExtendedAttribute6396); if (failed) return current;

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
    // $ANTLR end entryRuleAttributeExtendedAttribute


    // $ANTLR start ruleAttributeExtendedAttribute
    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:3334:1: ruleAttributeExtendedAttribute returns [EObject current=null] : (this_PutForwards_0= rulePutForwards | this_Replaceable_1= ruleReplaceable | this_TreatNullAs_2= ruleTreatNullAs | this_TreatUndefinedAs_3= ruleTreatUndefinedAs ) ;
    public final EObject ruleAttributeExtendedAttribute() throws RecognitionException {
        EObject current = null;

        EObject this_PutForwards_0 = null;

        EObject this_Replaceable_1 = null;

        EObject this_TreatNullAs_2 = null;

        EObject this_TreatUndefinedAs_3 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:3339:6: ( (this_PutForwards_0= rulePutForwards | this_Replaceable_1= ruleReplaceable | this_TreatNullAs_2= ruleTreatNullAs | this_TreatUndefinedAs_3= ruleTreatUndefinedAs ) )
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:3340:1: (this_PutForwards_0= rulePutForwards | this_Replaceable_1= ruleReplaceable | this_TreatNullAs_2= ruleTreatNullAs | this_TreatUndefinedAs_3= ruleTreatUndefinedAs )
            {
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:3340:1: (this_PutForwards_0= rulePutForwards | this_Replaceable_1= ruleReplaceable | this_TreatNullAs_2= ruleTreatNullAs | this_TreatUndefinedAs_3= ruleTreatUndefinedAs )
            int alt55=4;
            switch ( input.LA(1) ) {
            case 44:
                {
                alt55=1;
                }
                break;
            case 50:
                {
                alt55=2;
                }
                break;
            case 45:
                {
                alt55=3;
                }
                break;
            case 47:
                {
                alt55=4;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("3340:1: (this_PutForwards_0= rulePutForwards | this_Replaceable_1= ruleReplaceable | this_TreatNullAs_2= ruleTreatNullAs | this_TreatUndefinedAs_3= ruleTreatUndefinedAs )", 55, 0, input);

                throw nvae;
            }

            switch (alt55) {
                case 1 :
                    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:3341:2: this_PutForwards_0= rulePutForwards
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getAttributeExtendedAttributeAccess().getPutForwardsParserRuleCall_0(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_rulePutForwards_in_ruleAttributeExtendedAttribute6446);
                    this_PutForwards_0=rulePutForwards();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_PutForwards_0; 
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:3354:2: this_Replaceable_1= ruleReplaceable
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getAttributeExtendedAttributeAccess().getReplaceableParserRuleCall_1(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleReplaceable_in_ruleAttributeExtendedAttribute6476);
                    this_Replaceable_1=ruleReplaceable();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_Replaceable_1; 
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:3367:2: this_TreatNullAs_2= ruleTreatNullAs
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getAttributeExtendedAttributeAccess().getTreatNullAsParserRuleCall_2(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleTreatNullAs_in_ruleAttributeExtendedAttribute6506);
                    this_TreatNullAs_2=ruleTreatNullAs();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_TreatNullAs_2; 
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:3380:2: this_TreatUndefinedAs_3= ruleTreatUndefinedAs
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getAttributeExtendedAttributeAccess().getTreatUndefinedAsParserRuleCall_3(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleTreatUndefinedAs_in_ruleAttributeExtendedAttribute6536);
                    this_TreatUndefinedAs_3=ruleTreatUndefinedAs();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_TreatUndefinedAs_3; 
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;

            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
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
    // $ANTLR end ruleAttributeExtendedAttribute


    // $ANTLR start entryRuleException
    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:3399:1: entryRuleException returns [EObject current=null] : iv_ruleException= ruleException EOF ;
    public final EObject entryRuleException() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleException = null;


        try {
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:3400:2: (iv_ruleException= ruleException EOF )
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:3401:2: iv_ruleException= ruleException EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getExceptionRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleException_in_entryRuleException6571);
            iv_ruleException=ruleException();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleException; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleException6581); if (failed) return current;

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
    // $ANTLR end entryRuleException


    // $ANTLR start ruleException
    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:3408:1: ruleException returns [EObject current=null] : ( ( '[' ( (lv_extendedAttributes_1_0= ruleExceptionExtendedAttribute ) ) ( ',' ( (lv_extendedAttributes_3_0= ruleExceptionExtendedAttribute ) ) )* ']' )? 'exception' ( (lv_name_6_0= RULE_ID ) ) '{' ( (lv_members_8_0= ruleExceptionMember ) )* '}' ';' ) ;
    public final EObject ruleException() throws RecognitionException {
        EObject current = null;

        Token lv_name_6_0=null;
        EObject lv_extendedAttributes_1_0 = null;

        EObject lv_extendedAttributes_3_0 = null;

        EObject lv_members_8_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:3413:6: ( ( ( '[' ( (lv_extendedAttributes_1_0= ruleExceptionExtendedAttribute ) ) ( ',' ( (lv_extendedAttributes_3_0= ruleExceptionExtendedAttribute ) ) )* ']' )? 'exception' ( (lv_name_6_0= RULE_ID ) ) '{' ( (lv_members_8_0= ruleExceptionMember ) )* '}' ';' ) )
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:3414:1: ( ( '[' ( (lv_extendedAttributes_1_0= ruleExceptionExtendedAttribute ) ) ( ',' ( (lv_extendedAttributes_3_0= ruleExceptionExtendedAttribute ) ) )* ']' )? 'exception' ( (lv_name_6_0= RULE_ID ) ) '{' ( (lv_members_8_0= ruleExceptionMember ) )* '}' ';' )
            {
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:3414:1: ( ( '[' ( (lv_extendedAttributes_1_0= ruleExceptionExtendedAttribute ) ) ( ',' ( (lv_extendedAttributes_3_0= ruleExceptionExtendedAttribute ) ) )* ']' )? 'exception' ( (lv_name_6_0= RULE_ID ) ) '{' ( (lv_members_8_0= ruleExceptionMember ) )* '}' ';' )
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:3414:2: ( '[' ( (lv_extendedAttributes_1_0= ruleExceptionExtendedAttribute ) ) ( ',' ( (lv_extendedAttributes_3_0= ruleExceptionExtendedAttribute ) ) )* ']' )? 'exception' ( (lv_name_6_0= RULE_ID ) ) '{' ( (lv_members_8_0= ruleExceptionMember ) )* '}' ';'
            {
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:3414:2: ( '[' ( (lv_extendedAttributes_1_0= ruleExceptionExtendedAttribute ) ) ( ',' ( (lv_extendedAttributes_3_0= ruleExceptionExtendedAttribute ) ) )* ']' )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==54) ) {
                alt57=1;
            }
            switch (alt57) {
                case 1 :
                    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:3414:4: '[' ( (lv_extendedAttributes_1_0= ruleExceptionExtendedAttribute ) ) ( ',' ( (lv_extendedAttributes_3_0= ruleExceptionExtendedAttribute ) ) )* ']'
                    {
                    match(input,54,FOLLOW_54_in_ruleException6617); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getExceptionAccess().getLeftSquareBracketKeyword_0_0(), null); 
                          
                    }
                    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:3418:1: ( (lv_extendedAttributes_1_0= ruleExceptionExtendedAttribute ) )
                    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:3419:1: (lv_extendedAttributes_1_0= ruleExceptionExtendedAttribute )
                    {
                    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:3419:1: (lv_extendedAttributes_1_0= ruleExceptionExtendedAttribute )
                    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:3420:3: lv_extendedAttributes_1_0= ruleExceptionExtendedAttribute
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getExceptionAccess().getExtendedAttributesExceptionExtendedAttributeParserRuleCall_0_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExceptionExtendedAttribute_in_ruleException6638);
                    lv_extendedAttributes_1_0=ruleExceptionExtendedAttribute();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getExceptionRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        try {
                      	       		add(
                      	       			current, 
                      	       			"extendedAttributes",
                      	        		lv_extendedAttributes_1_0, 
                      	        		"ExceptionExtendedAttribute", 
                      	        		currentNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }


                    }

                    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:3442:2: ( ',' ( (lv_extendedAttributes_3_0= ruleExceptionExtendedAttribute ) ) )*
                    loop56:
                    do {
                        int alt56=2;
                        int LA56_0 = input.LA(1);

                        if ( (LA56_0==34) ) {
                            alt56=1;
                        }


                        switch (alt56) {
                    	case 1 :
                    	    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:3442:4: ',' ( (lv_extendedAttributes_3_0= ruleExceptionExtendedAttribute ) )
                    	    {
                    	    match(input,34,FOLLOW_34_in_ruleException6649); if (failed) return current;
                    	    if ( backtracking==0 ) {

                    	              createLeafNode(grammarAccess.getExceptionAccess().getCommaKeyword_0_2_0(), null); 
                    	          
                    	    }
                    	    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:3446:1: ( (lv_extendedAttributes_3_0= ruleExceptionExtendedAttribute ) )
                    	    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:3447:1: (lv_extendedAttributes_3_0= ruleExceptionExtendedAttribute )
                    	    {
                    	    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:3447:1: (lv_extendedAttributes_3_0= ruleExceptionExtendedAttribute )
                    	    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:3448:3: lv_extendedAttributes_3_0= ruleExceptionExtendedAttribute
                    	    {
                    	    if ( backtracking==0 ) {
                    	       
                    	      	        currentNode=createCompositeNode(grammarAccess.getExceptionAccess().getExtendedAttributesExceptionExtendedAttributeParserRuleCall_0_2_1_0(), currentNode); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleExceptionExtendedAttribute_in_ruleException6670);
                    	    lv_extendedAttributes_3_0=ruleExceptionExtendedAttribute();
                    	    _fsp--;
                    	    if (failed) return current;
                    	    if ( backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = factory.create(grammarAccess.getExceptionRule().getType().getClassifier());
                    	      	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	      	        }
                    	      	        try {
                    	      	       		add(
                    	      	       			current, 
                    	      	       			"extendedAttributes",
                    	      	        		lv_extendedAttributes_3_0, 
                    	      	        		"ExceptionExtendedAttribute", 
                    	      	        		currentNode);
                    	      	        } catch (ValueConverterException vce) {
                    	      				handleValueConverterException(vce);
                    	      	        }
                    	      	        currentNode = currentNode.getParent();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop56;
                        }
                    } while (true);

                    match(input,55,FOLLOW_55_in_ruleException6682); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getExceptionAccess().getRightSquareBracketKeyword_0_3(), null); 
                          
                    }

                    }
                    break;

            }

            match(input,75,FOLLOW_75_in_ruleException6694); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getExceptionAccess().getExceptionKeyword_1(), null); 
                  
            }
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:3478:1: ( (lv_name_6_0= RULE_ID ) )
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:3479:1: (lv_name_6_0= RULE_ID )
            {
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:3479:1: (lv_name_6_0= RULE_ID )
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:3480:3: lv_name_6_0= RULE_ID
            {
            lv_name_6_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleException6711); if (failed) return current;
            if ( backtracking==0 ) {

              			createLeafNode(grammarAccess.getExceptionAccess().getNameIDTerminalRuleCall_2_0(), "name"); 
              		
            }
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getExceptionRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode, current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"name",
              	        		lv_name_6_0, 
              	        		"ID", 
              	        		lastConsumedNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	    
            }

            }


            }

            match(input,57,FOLLOW_57_in_ruleException6726); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getExceptionAccess().getLeftCurlyBracketKeyword_3(), null); 
                  
            }
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:3506:1: ( (lv_members_8_0= ruleExceptionMember ) )*
            loop58:
            do {
                int alt58=2;
                int LA58_0 = input.LA(1);

                if ( (LA58_0==RULE_ID||(LA58_0>=15 && LA58_0<=27)||LA58_0==29||LA58_0==79) ) {
                    alt58=1;
                }


                switch (alt58) {
            	case 1 :
            	    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:3507:1: (lv_members_8_0= ruleExceptionMember )
            	    {
            	    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:3507:1: (lv_members_8_0= ruleExceptionMember )
            	    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:3508:3: lv_members_8_0= ruleExceptionMember
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getExceptionAccess().getMembersExceptionMemberParserRuleCall_4_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleExceptionMember_in_ruleException6747);
            	    lv_members_8_0=ruleExceptionMember();
            	    _fsp--;
            	    if (failed) return current;
            	    if ( backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = factory.create(grammarAccess.getExceptionRule().getType().getClassifier());
            	      	            associateNodeWithAstElement(currentNode.getParent(), current);
            	      	        }
            	      	        try {
            	      	       		add(
            	      	       			current, 
            	      	       			"members",
            	      	        		lv_members_8_0, 
            	      	        		"ExceptionMember", 
            	      	        		currentNode);
            	      	        } catch (ValueConverterException vce) {
            	      				handleValueConverterException(vce);
            	      	        }
            	      	        currentNode = currentNode.getParent();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop58;
                }
            } while (true);

            match(input,58,FOLLOW_58_in_ruleException6758); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getExceptionAccess().getRightCurlyBracketKeyword_5(), null); 
                  
            }
            match(input,12,FOLLOW_12_in_ruleException6768); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getExceptionAccess().getSemicolonKeyword_6(), null); 
                  
            }

            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
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
    // $ANTLR end ruleException


    // $ANTLR start entryRuleExceptionMember
    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:3546:1: entryRuleExceptionMember returns [EObject current=null] : iv_ruleExceptionMember= ruleExceptionMember EOF ;
    public final EObject entryRuleExceptionMember() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExceptionMember = null;


        try {
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:3547:2: (iv_ruleExceptionMember= ruleExceptionMember EOF )
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:3548:2: iv_ruleExceptionMember= ruleExceptionMember EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getExceptionMemberRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleExceptionMember_in_entryRuleExceptionMember6804);
            iv_ruleExceptionMember=ruleExceptionMember();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleExceptionMember; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExceptionMember6814); if (failed) return current;

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
    // $ANTLR end entryRuleExceptionMember


    // $ANTLR start ruleExceptionMember
    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:3555:1: ruleExceptionMember returns [EObject current=null] : (this_Const_0= ruleConst | this_ExceptionField_1= ruleExceptionField ) ;
    public final EObject ruleExceptionMember() throws RecognitionException {
        EObject current = null;

        EObject this_Const_0 = null;

        EObject this_ExceptionField_1 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:3560:6: ( (this_Const_0= ruleConst | this_ExceptionField_1= ruleExceptionField ) )
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:3561:1: (this_Const_0= ruleConst | this_ExceptionField_1= ruleExceptionField )
            {
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:3561:1: (this_Const_0= ruleConst | this_ExceptionField_1= ruleExceptionField )
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==79) ) {
                alt59=1;
            }
            else if ( (LA59_0==RULE_ID||(LA59_0>=15 && LA59_0<=27)||LA59_0==29) ) {
                alt59=2;
            }
            else {
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("3561:1: (this_Const_0= ruleConst | this_ExceptionField_1= ruleExceptionField )", 59, 0, input);

                throw nvae;
            }
            switch (alt59) {
                case 1 :
                    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:3562:2: this_Const_0= ruleConst
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getExceptionMemberAccess().getConstParserRuleCall_0(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleConst_in_ruleExceptionMember6864);
                    this_Const_0=ruleConst();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_Const_0; 
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:3575:2: this_ExceptionField_1= ruleExceptionField
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getExceptionMemberAccess().getExceptionFieldParserRuleCall_1(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleExceptionField_in_ruleExceptionMember6894);
                    this_ExceptionField_1=ruleExceptionField();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_ExceptionField_1; 
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;

            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
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
    // $ANTLR end ruleExceptionMember


    // $ANTLR start entryRuleExceptionField
    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:3594:1: entryRuleExceptionField returns [EObject current=null] : iv_ruleExceptionField= ruleExceptionField EOF ;
    public final EObject entryRuleExceptionField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExceptionField = null;


        try {
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:3595:2: (iv_ruleExceptionField= ruleExceptionField EOF )
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:3596:2: iv_ruleExceptionField= ruleExceptionField EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getExceptionFieldRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleExceptionField_in_entryRuleExceptionField6929);
            iv_ruleExceptionField=ruleExceptionField();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleExceptionField; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExceptionField6939); if (failed) return current;

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
    // $ANTLR end entryRuleExceptionField


    // $ANTLR start ruleExceptionField
    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:3603:1: ruleExceptionField returns [EObject current=null] : ( ( (lv_type_0_0= ruleTypeRef ) ) ( (lv_name_1_0= RULE_ID ) ) ';' ) ;
    public final EObject ruleExceptionField() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        EObject lv_type_0_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:3608:6: ( ( ( (lv_type_0_0= ruleTypeRef ) ) ( (lv_name_1_0= RULE_ID ) ) ';' ) )
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:3609:1: ( ( (lv_type_0_0= ruleTypeRef ) ) ( (lv_name_1_0= RULE_ID ) ) ';' )
            {
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:3609:1: ( ( (lv_type_0_0= ruleTypeRef ) ) ( (lv_name_1_0= RULE_ID ) ) ';' )
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:3609:2: ( (lv_type_0_0= ruleTypeRef ) ) ( (lv_name_1_0= RULE_ID ) ) ';'
            {
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:3609:2: ( (lv_type_0_0= ruleTypeRef ) )
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:3610:1: (lv_type_0_0= ruleTypeRef )
            {
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:3610:1: (lv_type_0_0= ruleTypeRef )
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:3611:3: lv_type_0_0= ruleTypeRef
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getExceptionFieldAccess().getTypeTypeRefParserRuleCall_0_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleTypeRef_in_ruleExceptionField6985);
            lv_type_0_0=ruleTypeRef();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getExceptionFieldRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"type",
              	        		lv_type_0_0, 
              	        		"TypeRef", 
              	        		currentNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	        currentNode = currentNode.getParent();
              	    
            }

            }


            }

            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:3633:2: ( (lv_name_1_0= RULE_ID ) )
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:3634:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:3634:1: (lv_name_1_0= RULE_ID )
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:3635:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleExceptionField7002); if (failed) return current;
            if ( backtracking==0 ) {

              			createLeafNode(grammarAccess.getExceptionFieldAccess().getNameIDTerminalRuleCall_1_0(), "name"); 
              		
            }
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getExceptionFieldRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode, current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"name",
              	        		lv_name_1_0, 
              	        		"ID", 
              	        		lastConsumedNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	    
            }

            }


            }

            match(input,12,FOLLOW_12_in_ruleExceptionField7017); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getExceptionFieldAccess().getSemicolonKeyword_2(), null); 
                  
            }

            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
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
    // $ANTLR end ruleExceptionField


    // $ANTLR start entryRuleExceptionExtendedAttribute
    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:3669:1: entryRuleExceptionExtendedAttribute returns [EObject current=null] : iv_ruleExceptionExtendedAttribute= ruleExceptionExtendedAttribute EOF ;
    public final EObject entryRuleExceptionExtendedAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExceptionExtendedAttribute = null;


        try {
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:3670:2: (iv_ruleExceptionExtendedAttribute= ruleExceptionExtendedAttribute EOF )
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:3671:2: iv_ruleExceptionExtendedAttribute= ruleExceptionExtendedAttribute EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getExceptionExtendedAttributeRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleExceptionExtendedAttribute_in_entryRuleExceptionExtendedAttribute7053);
            iv_ruleExceptionExtendedAttribute=ruleExceptionExtendedAttribute();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleExceptionExtendedAttribute; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExceptionExtendedAttribute7063); if (failed) return current;

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
    // $ANTLR end entryRuleExceptionExtendedAttribute


    // $ANTLR start ruleExceptionExtendedAttribute
    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:3678:1: ruleExceptionExtendedAttribute returns [EObject current=null] : this_NoInterfaceObject_0= ruleNoInterfaceObject ;
    public final EObject ruleExceptionExtendedAttribute() throws RecognitionException {
        EObject current = null;

        EObject this_NoInterfaceObject_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:3683:6: (this_NoInterfaceObject_0= ruleNoInterfaceObject )
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:3685:2: this_NoInterfaceObject_0= ruleNoInterfaceObject
            {
            if ( backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( backtracking==0 ) {
               
                      currentNode=createCompositeNode(grammarAccess.getExceptionExtendedAttributeAccess().getNoInterfaceObjectParserRuleCall(), currentNode); 
                  
            }
            pushFollow(FOLLOW_ruleNoInterfaceObject_in_ruleExceptionExtendedAttribute7112);
            this_NoInterfaceObject_0=ruleNoInterfaceObject();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               
                      current = this_NoInterfaceObject_0; 
                      currentNode = currentNode.getParent();
                  
            }

            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
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
    // $ANTLR end ruleExceptionExtendedAttribute


    // $ANTLR start entryRuleArgument
    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:3704:1: entryRuleArgument returns [EObject current=null] : iv_ruleArgument= ruleArgument EOF ;
    public final EObject entryRuleArgument() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArgument = null;


        try {
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:3705:2: (iv_ruleArgument= ruleArgument EOF )
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:3706:2: iv_ruleArgument= ruleArgument EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getArgumentRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleArgument_in_entryRuleArgument7146);
            iv_ruleArgument=ruleArgument();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleArgument; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleArgument7156); if (failed) return current;

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
    // $ANTLR end entryRuleArgument


    // $ANTLR start ruleArgument
    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:3713:1: ruleArgument returns [EObject current=null] : ( ( '[' ( (lv_extendedAttributes_1_0= ruleArgumentExtendedAttribute ) ) ( ',' ( (lv_extendedAttributes_3_0= ruleArgumentExtendedAttribute ) ) )* ']' )? ( (lv_in_5_0= 'in' ) )? ( (lv_optional_6_0= 'optional' ) )? ( (lv_type_7_0= ruleTypeRef ) ) ( (lv_ellipsis_8_0= '...' ) )? ( (lv_name_9_0= RULE_ID ) ) ) ;
    public final EObject ruleArgument() throws RecognitionException {
        EObject current = null;

        Token lv_in_5_0=null;
        Token lv_optional_6_0=null;
        Token lv_ellipsis_8_0=null;
        Token lv_name_9_0=null;
        EObject lv_extendedAttributes_1_0 = null;

        EObject lv_extendedAttributes_3_0 = null;

        EObject lv_type_7_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:3718:6: ( ( ( '[' ( (lv_extendedAttributes_1_0= ruleArgumentExtendedAttribute ) ) ( ',' ( (lv_extendedAttributes_3_0= ruleArgumentExtendedAttribute ) ) )* ']' )? ( (lv_in_5_0= 'in' ) )? ( (lv_optional_6_0= 'optional' ) )? ( (lv_type_7_0= ruleTypeRef ) ) ( (lv_ellipsis_8_0= '...' ) )? ( (lv_name_9_0= RULE_ID ) ) ) )
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:3719:1: ( ( '[' ( (lv_extendedAttributes_1_0= ruleArgumentExtendedAttribute ) ) ( ',' ( (lv_extendedAttributes_3_0= ruleArgumentExtendedAttribute ) ) )* ']' )? ( (lv_in_5_0= 'in' ) )? ( (lv_optional_6_0= 'optional' ) )? ( (lv_type_7_0= ruleTypeRef ) ) ( (lv_ellipsis_8_0= '...' ) )? ( (lv_name_9_0= RULE_ID ) ) )
            {
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:3719:1: ( ( '[' ( (lv_extendedAttributes_1_0= ruleArgumentExtendedAttribute ) ) ( ',' ( (lv_extendedAttributes_3_0= ruleArgumentExtendedAttribute ) ) )* ']' )? ( (lv_in_5_0= 'in' ) )? ( (lv_optional_6_0= 'optional' ) )? ( (lv_type_7_0= ruleTypeRef ) ) ( (lv_ellipsis_8_0= '...' ) )? ( (lv_name_9_0= RULE_ID ) ) )
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:3719:2: ( '[' ( (lv_extendedAttributes_1_0= ruleArgumentExtendedAttribute ) ) ( ',' ( (lv_extendedAttributes_3_0= ruleArgumentExtendedAttribute ) ) )* ']' )? ( (lv_in_5_0= 'in' ) )? ( (lv_optional_6_0= 'optional' ) )? ( (lv_type_7_0= ruleTypeRef ) ) ( (lv_ellipsis_8_0= '...' ) )? ( (lv_name_9_0= RULE_ID ) )
            {
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:3719:2: ( '[' ( (lv_extendedAttributes_1_0= ruleArgumentExtendedAttribute ) ) ( ',' ( (lv_extendedAttributes_3_0= ruleArgumentExtendedAttribute ) ) )* ']' )?
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==54) ) {
                alt61=1;
            }
            switch (alt61) {
                case 1 :
                    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:3719:4: '[' ( (lv_extendedAttributes_1_0= ruleArgumentExtendedAttribute ) ) ( ',' ( (lv_extendedAttributes_3_0= ruleArgumentExtendedAttribute ) ) )* ']'
                    {
                    match(input,54,FOLLOW_54_in_ruleArgument7192); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getArgumentAccess().getLeftSquareBracketKeyword_0_0(), null); 
                          
                    }
                    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:3723:1: ( (lv_extendedAttributes_1_0= ruleArgumentExtendedAttribute ) )
                    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:3724:1: (lv_extendedAttributes_1_0= ruleArgumentExtendedAttribute )
                    {
                    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:3724:1: (lv_extendedAttributes_1_0= ruleArgumentExtendedAttribute )
                    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:3725:3: lv_extendedAttributes_1_0= ruleArgumentExtendedAttribute
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getArgumentAccess().getExtendedAttributesArgumentExtendedAttributeParserRuleCall_0_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleArgumentExtendedAttribute_in_ruleArgument7213);
                    lv_extendedAttributes_1_0=ruleArgumentExtendedAttribute();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getArgumentRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        try {
                      	       		add(
                      	       			current, 
                      	       			"extendedAttributes",
                      	        		lv_extendedAttributes_1_0, 
                      	        		"ArgumentExtendedAttribute", 
                      	        		currentNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }


                    }

                    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:3747:2: ( ',' ( (lv_extendedAttributes_3_0= ruleArgumentExtendedAttribute ) ) )*
                    loop60:
                    do {
                        int alt60=2;
                        int LA60_0 = input.LA(1);

                        if ( (LA60_0==34) ) {
                            alt60=1;
                        }


                        switch (alt60) {
                    	case 1 :
                    	    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:3747:4: ',' ( (lv_extendedAttributes_3_0= ruleArgumentExtendedAttribute ) )
                    	    {
                    	    match(input,34,FOLLOW_34_in_ruleArgument7224); if (failed) return current;
                    	    if ( backtracking==0 ) {

                    	              createLeafNode(grammarAccess.getArgumentAccess().getCommaKeyword_0_2_0(), null); 
                    	          
                    	    }
                    	    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:3751:1: ( (lv_extendedAttributes_3_0= ruleArgumentExtendedAttribute ) )
                    	    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:3752:1: (lv_extendedAttributes_3_0= ruleArgumentExtendedAttribute )
                    	    {
                    	    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:3752:1: (lv_extendedAttributes_3_0= ruleArgumentExtendedAttribute )
                    	    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:3753:3: lv_extendedAttributes_3_0= ruleArgumentExtendedAttribute
                    	    {
                    	    if ( backtracking==0 ) {
                    	       
                    	      	        currentNode=createCompositeNode(grammarAccess.getArgumentAccess().getExtendedAttributesArgumentExtendedAttributeParserRuleCall_0_2_1_0(), currentNode); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleArgumentExtendedAttribute_in_ruleArgument7245);
                    	    lv_extendedAttributes_3_0=ruleArgumentExtendedAttribute();
                    	    _fsp--;
                    	    if (failed) return current;
                    	    if ( backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = factory.create(grammarAccess.getArgumentRule().getType().getClassifier());
                    	      	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	      	        }
                    	      	        try {
                    	      	       		add(
                    	      	       			current, 
                    	      	       			"extendedAttributes",
                    	      	        		lv_extendedAttributes_3_0, 
                    	      	        		"ArgumentExtendedAttribute", 
                    	      	        		currentNode);
                    	      	        } catch (ValueConverterException vce) {
                    	      				handleValueConverterException(vce);
                    	      	        }
                    	      	        currentNode = currentNode.getParent();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop60;
                        }
                    } while (true);

                    match(input,55,FOLLOW_55_in_ruleArgument7257); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getArgumentAccess().getRightSquareBracketKeyword_0_3(), null); 
                          
                    }

                    }
                    break;

            }

            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:3779:3: ( (lv_in_5_0= 'in' ) )?
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==76) ) {
                alt62=1;
            }
            switch (alt62) {
                case 1 :
                    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:3780:1: (lv_in_5_0= 'in' )
                    {
                    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:3780:1: (lv_in_5_0= 'in' )
                    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:3781:3: lv_in_5_0= 'in'
                    {
                    lv_in_5_0=(Token)input.LT(1);
                    match(input,76,FOLLOW_76_in_ruleArgument7277); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getArgumentAccess().getInInKeyword_1_0(), "in"); 
                          
                    }
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getArgumentRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode, current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "in", true, "in", lastConsumedNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:3800:3: ( (lv_optional_6_0= 'optional' ) )?
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==77) ) {
                alt63=1;
            }
            switch (alt63) {
                case 1 :
                    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:3801:1: (lv_optional_6_0= 'optional' )
                    {
                    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:3801:1: (lv_optional_6_0= 'optional' )
                    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:3802:3: lv_optional_6_0= 'optional'
                    {
                    lv_optional_6_0=(Token)input.LT(1);
                    match(input,77,FOLLOW_77_in_ruleArgument7309); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getArgumentAccess().getOptionalOptionalKeyword_2_0(), "optional"); 
                          
                    }
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getArgumentRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode, current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "optional", true, "optional", lastConsumedNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:3821:3: ( (lv_type_7_0= ruleTypeRef ) )
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:3822:1: (lv_type_7_0= ruleTypeRef )
            {
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:3822:1: (lv_type_7_0= ruleTypeRef )
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:3823:3: lv_type_7_0= ruleTypeRef
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getArgumentAccess().getTypeTypeRefParserRuleCall_3_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleTypeRef_in_ruleArgument7344);
            lv_type_7_0=ruleTypeRef();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getArgumentRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"type",
              	        		lv_type_7_0, 
              	        		"TypeRef", 
              	        		currentNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	        currentNode = currentNode.getParent();
              	    
            }

            }


            }

            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:3845:2: ( (lv_ellipsis_8_0= '...' ) )?
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( (LA64_0==78) ) {
                alt64=1;
            }
            switch (alt64) {
                case 1 :
                    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:3846:1: (lv_ellipsis_8_0= '...' )
                    {
                    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:3846:1: (lv_ellipsis_8_0= '...' )
                    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:3847:3: lv_ellipsis_8_0= '...'
                    {
                    lv_ellipsis_8_0=(Token)input.LT(1);
                    match(input,78,FOLLOW_78_in_ruleArgument7362); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getArgumentAccess().getEllipsisFullStopFullStopFullStopKeyword_4_0(), "ellipsis"); 
                          
                    }
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getArgumentRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode, current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "ellipsis", true, "...", lastConsumedNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:3866:3: ( (lv_name_9_0= RULE_ID ) )
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:3867:1: (lv_name_9_0= RULE_ID )
            {
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:3867:1: (lv_name_9_0= RULE_ID )
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:3868:3: lv_name_9_0= RULE_ID
            {
            lv_name_9_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleArgument7393); if (failed) return current;
            if ( backtracking==0 ) {

              			createLeafNode(grammarAccess.getArgumentAccess().getNameIDTerminalRuleCall_5_0(), "name"); 
              		
            }
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getArgumentRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode, current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"name",
              	        		lv_name_9_0, 
              	        		"ID", 
              	        		lastConsumedNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	    
            }

            }


            }


            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
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
    // $ANTLR end ruleArgument


    // $ANTLR start entryRuleArgumentExtendedAttribute
    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:3898:1: entryRuleArgumentExtendedAttribute returns [EObject current=null] : iv_ruleArgumentExtendedAttribute= ruleArgumentExtendedAttribute EOF ;
    public final EObject entryRuleArgumentExtendedAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArgumentExtendedAttribute = null;


        try {
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:3899:2: (iv_ruleArgumentExtendedAttribute= ruleArgumentExtendedAttribute EOF )
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:3900:2: iv_ruleArgumentExtendedAttribute= ruleArgumentExtendedAttribute EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getArgumentExtendedAttributeRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleArgumentExtendedAttribute_in_entryRuleArgumentExtendedAttribute7434);
            iv_ruleArgumentExtendedAttribute=ruleArgumentExtendedAttribute();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleArgumentExtendedAttribute; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleArgumentExtendedAttribute7444); if (failed) return current;

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
    // $ANTLR end entryRuleArgumentExtendedAttribute


    // $ANTLR start ruleArgumentExtendedAttribute
    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:3907:1: ruleArgumentExtendedAttribute returns [EObject current=null] : (this_AllowAny_0= ruleAllowAny | this_TreatNullAs_1= ruleTreatNullAs | this_TreatUndefinedAs_2= ruleTreatUndefinedAs ) ;
    public final EObject ruleArgumentExtendedAttribute() throws RecognitionException {
        EObject current = null;

        EObject this_AllowAny_0 = null;

        EObject this_TreatNullAs_1 = null;

        EObject this_TreatUndefinedAs_2 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:3912:6: ( (this_AllowAny_0= ruleAllowAny | this_TreatNullAs_1= ruleTreatNullAs | this_TreatUndefinedAs_2= ruleTreatUndefinedAs ) )
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:3913:1: (this_AllowAny_0= ruleAllowAny | this_TreatNullAs_1= ruleTreatNullAs | this_TreatUndefinedAs_2= ruleTreatUndefinedAs )
            {
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:3913:1: (this_AllowAny_0= ruleAllowAny | this_TreatNullAs_1= ruleTreatNullAs | this_TreatUndefinedAs_2= ruleTreatUndefinedAs )
            int alt65=3;
            switch ( input.LA(1) ) {
            case 49:
                {
                alt65=1;
                }
                break;
            case 45:
                {
                alt65=2;
                }
                break;
            case 47:
                {
                alt65=3;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("3913:1: (this_AllowAny_0= ruleAllowAny | this_TreatNullAs_1= ruleTreatNullAs | this_TreatUndefinedAs_2= ruleTreatUndefinedAs )", 65, 0, input);

                throw nvae;
            }

            switch (alt65) {
                case 1 :
                    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:3914:2: this_AllowAny_0= ruleAllowAny
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getArgumentExtendedAttributeAccess().getAllowAnyParserRuleCall_0(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleAllowAny_in_ruleArgumentExtendedAttribute7494);
                    this_AllowAny_0=ruleAllowAny();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_AllowAny_0; 
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:3927:2: this_TreatNullAs_1= ruleTreatNullAs
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getArgumentExtendedAttributeAccess().getTreatNullAsParserRuleCall_1(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleTreatNullAs_in_ruleArgumentExtendedAttribute7524);
                    this_TreatNullAs_1=ruleTreatNullAs();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_TreatNullAs_1; 
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:3940:2: this_TreatUndefinedAs_2= ruleTreatUndefinedAs
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getArgumentExtendedAttributeAccess().getTreatUndefinedAsParserRuleCall_2(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleTreatUndefinedAs_in_ruleArgumentExtendedAttribute7554);
                    this_TreatUndefinedAs_2=ruleTreatUndefinedAs();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_TreatUndefinedAs_2; 
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;

            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
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
    // $ANTLR end ruleArgumentExtendedAttribute


    // $ANTLR start entryRuleConst
    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:3959:1: entryRuleConst returns [EObject current=null] : iv_ruleConst= ruleConst EOF ;
    public final EObject entryRuleConst() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConst = null;


        try {
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:3960:2: (iv_ruleConst= ruleConst EOF )
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:3961:2: iv_ruleConst= ruleConst EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getConstRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleConst_in_entryRuleConst7589);
            iv_ruleConst=ruleConst();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleConst; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleConst7599); if (failed) return current;

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
    // $ANTLR end entryRuleConst


    // $ANTLR start ruleConst
    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:3968:1: ruleConst returns [EObject current=null] : ( 'const' ( (lv_type_1_0= ruleTypeRef ) ) ( (lv_name_2_0= RULE_ID ) ) '=' ( (lv_expr_4_0= ruleConstExpr ) ) ';' ) ;
    public final EObject ruleConst() throws RecognitionException {
        EObject current = null;

        Token lv_name_2_0=null;
        EObject lv_type_1_0 = null;

        EObject lv_expr_4_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:3973:6: ( ( 'const' ( (lv_type_1_0= ruleTypeRef ) ) ( (lv_name_2_0= RULE_ID ) ) '=' ( (lv_expr_4_0= ruleConstExpr ) ) ';' ) )
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:3974:1: ( 'const' ( (lv_type_1_0= ruleTypeRef ) ) ( (lv_name_2_0= RULE_ID ) ) '=' ( (lv_expr_4_0= ruleConstExpr ) ) ';' )
            {
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:3974:1: ( 'const' ( (lv_type_1_0= ruleTypeRef ) ) ( (lv_name_2_0= RULE_ID ) ) '=' ( (lv_expr_4_0= ruleConstExpr ) ) ';' )
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:3974:3: 'const' ( (lv_type_1_0= ruleTypeRef ) ) ( (lv_name_2_0= RULE_ID ) ) '=' ( (lv_expr_4_0= ruleConstExpr ) ) ';'
            {
            match(input,79,FOLLOW_79_in_ruleConst7634); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getConstAccess().getConstKeyword_0(), null); 
                  
            }
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:3978:1: ( (lv_type_1_0= ruleTypeRef ) )
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:3979:1: (lv_type_1_0= ruleTypeRef )
            {
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:3979:1: (lv_type_1_0= ruleTypeRef )
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:3980:3: lv_type_1_0= ruleTypeRef
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getConstAccess().getTypeTypeRefParserRuleCall_1_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleTypeRef_in_ruleConst7655);
            lv_type_1_0=ruleTypeRef();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getConstRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"type",
              	        		lv_type_1_0, 
              	        		"TypeRef", 
              	        		currentNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	        currentNode = currentNode.getParent();
              	    
            }

            }


            }

            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:4002:2: ( (lv_name_2_0= RULE_ID ) )
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:4003:1: (lv_name_2_0= RULE_ID )
            {
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:4003:1: (lv_name_2_0= RULE_ID )
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:4004:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleConst7672); if (failed) return current;
            if ( backtracking==0 ) {

              			createLeafNode(grammarAccess.getConstAccess().getNameIDTerminalRuleCall_2_0(), "name"); 
              		
            }
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getConstRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode, current);
              	        }
              	        try {
              	       		add(
              	       			current, 
              	       			"name",
              	        		lv_name_2_0, 
              	        		"ID", 
              	        		lastConsumedNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	    
            }

            }


            }

            match(input,37,FOLLOW_37_in_ruleConst7687); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getConstAccess().getEqualsSignKeyword_3(), null); 
                  
            }
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:4030:1: ( (lv_expr_4_0= ruleConstExpr ) )
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:4031:1: (lv_expr_4_0= ruleConstExpr )
            {
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:4031:1: (lv_expr_4_0= ruleConstExpr )
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:4032:3: lv_expr_4_0= ruleConstExpr
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getConstAccess().getExprConstExprParserRuleCall_4_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleConstExpr_in_ruleConst7708);
            lv_expr_4_0=ruleConstExpr();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getConstRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"expr",
              	        		lv_expr_4_0, 
              	        		"ConstExpr", 
              	        		currentNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	        currentNode = currentNode.getParent();
              	    
            }

            }


            }

            match(input,12,FOLLOW_12_in_ruleConst7718); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getConstAccess().getSemicolonKeyword_5(), null); 
                  
            }

            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
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
    // $ANTLR end ruleConst


    // $ANTLR start entryRuleConstExpr
    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:4066:1: entryRuleConstExpr returns [EObject current=null] : iv_ruleConstExpr= ruleConstExpr EOF ;
    public final EObject entryRuleConstExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstExpr = null;


        try {
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:4067:2: (iv_ruleConstExpr= ruleConstExpr EOF )
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:4068:2: iv_ruleConstExpr= ruleConstExpr EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getConstExprRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleConstExpr_in_entryRuleConstExpr7754);
            iv_ruleConstExpr=ruleConstExpr();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleConstExpr; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleConstExpr7764); if (failed) return current;

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
    // $ANTLR end entryRuleConstExpr


    // $ANTLR start ruleConstExpr
    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:4075:1: ruleConstExpr returns [EObject current=null] : ( ( () RULE_STRING ) | ( () ( '0x' )? RULE_INT ) ) ;
    public final EObject ruleConstExpr() throws RecognitionException {
        EObject current = null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:4080:6: ( ( ( () RULE_STRING ) | ( () ( '0x' )? RULE_INT ) ) )
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:4081:1: ( ( () RULE_STRING ) | ( () ( '0x' )? RULE_INT ) )
            {
            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:4081:1: ( ( () RULE_STRING ) | ( () ( '0x' )? RULE_INT ) )
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( (LA67_0==RULE_STRING) ) {
                alt67=1;
            }
            else if ( (LA67_0==RULE_INT||LA67_0==80) ) {
                alt67=2;
            }
            else {
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("4081:1: ( ( () RULE_STRING ) | ( () ( '0x' )? RULE_INT ) )", 67, 0, input);

                throw nvae;
            }
            switch (alt67) {
                case 1 :
                    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:4081:2: ( () RULE_STRING )
                    {
                    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:4081:2: ( () RULE_STRING )
                    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:4081:3: () RULE_STRING
                    {
                    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:4081:3: ()
                    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:4082:2: 
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              temp=factory.create(grammarAccess.getConstExprAccess().getConstExprAction_0_0().getType().getClassifier());
                              current = temp; 
                              temp = null;
                              CompositeNode newNode = createCompositeNode(grammarAccess.getConstExprAccess().getConstExprAction_0_0(), currentNode.getParent());
                          newNode.getChildren().add(currentNode);
                          moveLookaheadInfo(currentNode, newNode);
                          currentNode = newNode; 
                              associateNodeWithAstElement(currentNode, current); 
                          
                    }

                    }

                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleConstExpr7811); if (failed) return current;
                    if ( backtracking==0 ) {
                       
                          createLeafNode(grammarAccess.getConstExprAccess().getSTRINGTerminalRuleCall_0_1(), null); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:4100:6: ( () ( '0x' )? RULE_INT )
                    {
                    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:4100:6: ( () ( '0x' )? RULE_INT )
                    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:4100:7: () ( '0x' )? RULE_INT
                    {
                    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:4100:7: ()
                    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:4101:2: 
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              temp=factory.create(grammarAccess.getConstExprAccess().getConstExprAction_1_0().getType().getClassifier());
                              current = temp; 
                              temp = null;
                              CompositeNode newNode = createCompositeNode(grammarAccess.getConstExprAccess().getConstExprAction_1_0(), currentNode.getParent());
                          newNode.getChildren().add(currentNode);
                          moveLookaheadInfo(currentNode, newNode);
                          currentNode = newNode; 
                              associateNodeWithAstElement(currentNode, current); 
                          
                    }

                    }

                    // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:4114:2: ( '0x' )?
                    int alt66=2;
                    int LA66_0 = input.LA(1);

                    if ( (LA66_0==80) ) {
                        alt66=1;
                    }
                    switch (alt66) {
                        case 1 :
                            // ../org.waml.w3c.webidl/src-gen/org/waml/w3c/webidl/parser/antlr/internal/InternalWebIDL.g:4114:4: '0x'
                            {
                            match(input,80,FOLLOW_80_in_ruleConstExpr7841); if (failed) return current;
                            if ( backtracking==0 ) {

                                      createLeafNode(grammarAccess.getConstExprAccess().getXKeyword_1_1(), null); 
                                  
                            }

                            }
                            break;

                    }

                    match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleConstExpr7852); if (failed) return current;
                    if ( backtracking==0 ) {
                       
                          createLeafNode(grammarAccess.getConstExprAccess().getINTTerminalRuleCall_1_2(), null); 
                          
                    }

                    }


                    }
                    break;

            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
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
    // $ANTLR end ruleConstExpr


    protected DFA21 dfa21 = new DFA21(this);
    protected DFA34 dfa34 = new DFA34(this);
    static final String DFA21_eotS =
        "\12\uffff";
    static final String DFA21_eofS =
        "\12\uffff";
    static final String DFA21_minS =
        "\1\5\1\40\4\uffff\1\42\1\40\1\75\1\42";
    static final String DFA21_maxS =
        "\1\113\1\64\4\uffff\1\67\1\64\1\113\1\67";
    static final String DFA21_acceptS =
        "\2\uffff\1\1\1\2\1\3\1\4\4\uffff";
    static final String DFA21_specialS =
        "\12\uffff}>";
    static final String[] DFA21_transitionS = {
            "\1\5\7\uffff\1\4\50\uffff\1\1\6\uffff\1\2\15\uffff\1\3",
            "\1\2\3\uffff\1\2\1\uffff\1\2\2\uffff\1\6\2\2\7\uffff\2\2",
            "",
            "",
            "",
            "",
            "\1\7\24\uffff\1\10",
            "\1\2\3\uffff\1\2\1\uffff\1\2\2\uffff\1\11\2\2\7\uffff\2\2",
            "\1\2\15\uffff\1\3",
            "\1\7\24\uffff\1\10"
    };

    static final short[] DFA21_eot = DFA.unpackEncodedString(DFA21_eotS);
    static final short[] DFA21_eof = DFA.unpackEncodedString(DFA21_eofS);
    static final char[] DFA21_min = DFA.unpackEncodedStringToUnsignedChars(DFA21_minS);
    static final char[] DFA21_max = DFA.unpackEncodedStringToUnsignedChars(DFA21_maxS);
    static final short[] DFA21_accept = DFA.unpackEncodedString(DFA21_acceptS);
    static final short[] DFA21_special = DFA.unpackEncodedString(DFA21_specialS);
    static final short[][] DFA21_transition;

    static {
        int numStates = DFA21_transitionS.length;
        DFA21_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA21_transition[i] = DFA.unpackEncodedString(DFA21_transitionS[i]);
        }
    }

    class DFA21 extends DFA {

        public DFA21(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 21;
            this.eot = DFA21_eot;
            this.eof = DFA21_eof;
            this.min = DFA21_min;
            this.max = DFA21_max;
            this.accept = DFA21_accept;
            this.special = DFA21_special;
            this.transition = DFA21_transition;
        }
        public String getDescription() {
            return "1740:1: (this_Interface_0= ruleInterface | this_Exception_1= ruleException | this_TypeDef_2= ruleTypeDef | this_ImplementStatement_3= ruleImplementStatement )";
        }
    }
    static final String DFA34_eotS =
        "\25\uffff";
    static final String DFA34_eofS =
        "\25\uffff";
    static final String DFA34_minS =
        "\1\5\1\54\1\5\2\uffff\2\45\2\56\3\42\1\54\1\5\2\45\2\56\3\42";
    static final String DFA34_maxS =
        "\1\110\1\62\1\110\2\uffff\2\45\1\56\1\60\3\67\1\62\1\110\2\45\1"+
        "\56\1\60\3\67";
    static final String DFA34_acceptS =
        "\3\uffff\1\1\1\2\20\uffff";
    static final String DFA34_specialS =
        "\25\uffff}>";
    static final String[] DFA34_transitionS = {
            "\1\4\11\uffff\15\4\1\uffff\1\4\30\uffff\1\1\10\uffff\1\2\1\4"+
            "\1\uffff\5\4\2\3",
            "\1\3\1\5\1\uffff\1\6\2\uffff\1\3",
            "\1\4\11\uffff\15\4\1\uffff\1\4\42\uffff\1\4\1\uffff\5\4\2\3",
            "",
            "",
            "\1\7",
            "\1\10",
            "\1\11",
            "\1\13\1\uffff\1\12",
            "\1\14\24\uffff\1\15",
            "\1\14\24\uffff\1\15",
            "\1\14\24\uffff\1\15",
            "\1\3\1\16\1\uffff\1\17\2\uffff\1\3",
            "\1\4\11\uffff\15\4\1\uffff\1\4\41\uffff\1\2\1\4\1\uffff\5\4"+
            "\2\3",
            "\1\20",
            "\1\21",
            "\1\22",
            "\1\24\1\uffff\1\23",
            "\1\14\24\uffff\1\15",
            "\1\14\24\uffff\1\15",
            "\1\14\24\uffff\1\15"
    };

    static final short[] DFA34_eot = DFA.unpackEncodedString(DFA34_eotS);
    static final short[] DFA34_eof = DFA.unpackEncodedString(DFA34_eofS);
    static final char[] DFA34_min = DFA.unpackEncodedStringToUnsignedChars(DFA34_minS);
    static final char[] DFA34_max = DFA.unpackEncodedStringToUnsignedChars(DFA34_maxS);
    static final short[] DFA34_accept = DFA.unpackEncodedString(DFA34_acceptS);
    static final short[] DFA34_special = DFA.unpackEncodedString(DFA34_specialS);
    static final short[][] DFA34_transition;

    static {
        int numStates = DFA34_transitionS.length;
        DFA34_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA34_transition[i] = DFA.unpackEncodedString(DFA34_transitionS[i]);
        }
    }

    class DFA34 extends DFA {

        public DFA34(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 34;
            this.eot = DFA34_eot;
            this.eof = DFA34_eof;
            this.min = DFA34_min;
            this.max = DFA34_max;
            this.accept = DFA34_accept;
            this.special = DFA34_special;
            this.transition = DFA34_transition;
        }
        public String getDescription() {
            return "2540:1: (this_Attribute_0= ruleAttribute | this_Operation_1= ruleOperation )";
        }
    }
 

    public static final BitSet FOLLOW_ruleIDLDefinitions_in_entryRuleIDLDefinitions81 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIDLDefinitions91 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_ruleIDLDefinitions137 = new BitSet(new long[]{0x2140000000002822L,0x0000000000000800L});
    public static final BitSet FOLLOW_ruleAbstractDefinitions_in_ruleIDLDefinitions159 = new BitSet(new long[]{0x2140000000002022L,0x0000000000000800L});
    public static final BitSet FOLLOW_ruleImport_in_entryRuleImport196 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImport206 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleImport241 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleImport258 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleImport273 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeDef_in_entryRuleTypeDef309 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTypeDef319 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_ruleTypeDef354 = new BitSet(new long[]{0x000000002FFF8020L});
    public static final BitSet FOLLOW_ruleTypeRef_in_ruleTypeDef375 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTypeDef392 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleTypeDef407 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeRef_in_entryRuleTypeRef443 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTypeRef453 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimitiveTypeRef_in_ruleTypeRef504 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_14_in_ruleTypeRef521 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSequenceType_in_ruleTypeRef568 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_14_in_ruleTypeRef585 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUserTypeRef_in_ruleTypeRef632 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_14_in_ruleTypeRef649 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUserTypeRef_in_entryRuleUserTypeRef700 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUserTypeRef710 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleScopedName_in_ruleUserTypeRef761 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimitiveTypeRef_in_entryRulePrimitiveTypeRef798 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrimitiveTypeRef808 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rulePrimitiveTypeRef851 = new BitSet(new long[]{0x000000000FFF0000L});
    public static final BitSet FOLLOW_16_in_rulePrimitiveTypeRef885 = new BitSet(new long[]{0x000000001FFF0002L});
    public static final BitSet FOLLOW_17_in_rulePrimitiveTypeRef914 = new BitSet(new long[]{0x000000001FFF0002L});
    public static final BitSet FOLLOW_18_in_rulePrimitiveTypeRef943 = new BitSet(new long[]{0x000000001FFF0002L});
    public static final BitSet FOLLOW_19_in_rulePrimitiveTypeRef972 = new BitSet(new long[]{0x000000001FFF0002L});
    public static final BitSet FOLLOW_20_in_rulePrimitiveTypeRef1001 = new BitSet(new long[]{0x000000001FFF0002L});
    public static final BitSet FOLLOW_21_in_rulePrimitiveTypeRef1030 = new BitSet(new long[]{0x000000001FFF0002L});
    public static final BitSet FOLLOW_22_in_rulePrimitiveTypeRef1059 = new BitSet(new long[]{0x000000001FFF0002L});
    public static final BitSet FOLLOW_23_in_rulePrimitiveTypeRef1088 = new BitSet(new long[]{0x000000001FFF0002L});
    public static final BitSet FOLLOW_24_in_rulePrimitiveTypeRef1117 = new BitSet(new long[]{0x000000001FFF0002L});
    public static final BitSet FOLLOW_25_in_rulePrimitiveTypeRef1146 = new BitSet(new long[]{0x000000001FFF0002L});
    public static final BitSet FOLLOW_26_in_rulePrimitiveTypeRef1175 = new BitSet(new long[]{0x000000001FFF0002L});
    public static final BitSet FOLLOW_27_in_rulePrimitiveTypeRef1204 = new BitSet(new long[]{0x000000001FFF0002L});
    public static final BitSet FOLLOW_28_in_rulePrimitiveTypeRef1239 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSequenceType_in_entryRuleSequenceType1289 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSequenceType1299 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleSequenceType1334 = new BitSet(new long[]{0x000000002FFF8020L});
    public static final BitSet FOLLOW_ruleTypeRef_in_ruleSequenceType1355 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_ruleSequenceType1365 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_28_in_ruleSequenceType1383 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleScopedName_in_entryRuleScopedName1434 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleScopedName1445 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleScopedName1485 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_31_in_ruleScopedName1504 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleScopedName1519 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_ruleConstructor_in_entryRuleConstructor1568 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConstructor1578 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleConstructor1613 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_33_in_ruleConstructor1636 = new BitSet(new long[]{0x004000002FFF8020L,0x0000000000003000L});
    public static final BitSet FOLLOW_ruleArgument_in_ruleConstructor1657 = new BitSet(new long[]{0x0000000C00000000L});
    public static final BitSet FOLLOW_34_in_ruleConstructor1668 = new BitSet(new long[]{0x004000002FFF8020L,0x0000000000003000L});
    public static final BitSet FOLLOW_ruleArgument_in_ruleConstructor1689 = new BitSet(new long[]{0x0000000C00000000L});
    public static final BitSet FOLLOW_35_in_ruleConstructor1701 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNamedConstructor_in_entryRuleNamedConstructor1739 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNamedConstructor1749 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleNamedConstructor1784 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_ruleNamedConstructor1806 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleNamedConstructor1823 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_33_in_ruleNamedConstructor1839 = new BitSet(new long[]{0x004000082FFF8020L,0x0000000000003000L});
    public static final BitSet FOLLOW_ruleArgument_in_ruleNamedConstructor1861 = new BitSet(new long[]{0x0000000C00000000L});
    public static final BitSet FOLLOW_34_in_ruleNamedConstructor1872 = new BitSet(new long[]{0x004000002FFF8020L,0x0000000000003000L});
    public static final BitSet FOLLOW_ruleArgument_in_ruleNamedConstructor1893 = new BitSet(new long[]{0x0000000C00000000L});
    public static final BitSet FOLLOW_35_in_ruleNamedConstructor1907 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCallback_in_entryRuleCallback1945 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCallback1955 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleCallback1991 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleCallback2021 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_ruleCallback2031 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_ruleCallback2049 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleCallback2080 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_ruleCallback2090 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_ruleCallback2108 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNoInterfaceObject_in_entryRuleNoInterfaceObject2158 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNoInterfaceObject2168 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_ruleNoInterfaceObject2215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOverrideBuiltins_in_entryRuleOverrideBuiltins2252 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOverrideBuiltins2263 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleOverrideBuiltins2300 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrototypeRoot_in_entryRulePrototypeRoot2339 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrototypeRoot2349 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_rulePrototypeRoot2396 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePutForwards_in_entryRulePutForwards2432 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePutForwards2442 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_rulePutForwards2477 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_rulePutForwards2487 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePutForwards2509 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTreatNullAs_in_entryRuleTreatNullAs2545 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTreatNullAs2555 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_ruleTreatNullAs2602 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_ruleTreatNullAs2612 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_ruleTreatNullAs2622 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTreatUndefinedAs_in_entryRuleTreatUndefinedAs2658 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTreatUndefinedAs2668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_ruleTreatUndefinedAs2716 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_ruleTreatUndefinedAs2726 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_ruleTreatUndefinedAs2744 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_ruleTreatUndefinedAs2787 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_ruleTreatUndefinedAs2797 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_48_in_ruleTreatUndefinedAs2815 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAllowAny_in_entryRuleAllowAny2865 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAllowAny2875 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_ruleAllowAny2922 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReplaceable_in_entryRuleReplaceable2958 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleReplaceable2968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_ruleReplaceable3015 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSupplemental_in_entryRuleSupplemental3051 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSupplemental3061 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_ruleSupplemental3108 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReplaceableNamedProperties_in_entryRuleReplaceableNamedProperties3144 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleReplaceableNamedProperties3154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_ruleReplaceableNamedProperties3201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractDefinitions_in_entryRuleAbstractDefinitions3237 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAbstractDefinitions3247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDefinitions_in_ruleAbstractDefinitions3297 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModule_in_ruleAbstractDefinitions3327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDefinitions_in_entryRuleDefinitions3362 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDefinitions3372 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterface_in_ruleDefinitions3422 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleException_in_ruleDefinitions3452 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeDef_in_ruleDefinitions3482 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImplementStatement_in_ruleDefinitions3512 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImplementStatement_in_entryRuleImplementStatement3547 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImplementStatement3557 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleScopedName_in_ruleImplementStatement3609 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_53_in_ruleImplementStatement3619 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleScopedName_in_ruleImplementStatement3646 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleImplementStatement3656 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModule_in_entryRuleModule3692 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModule3702 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_ruleModule3738 = new BitSet(new long[]{0x1800000000000000L});
    public static final BitSet FOLLOW_ruleModuleExtendedAttribute_in_ruleModule3759 = new BitSet(new long[]{0x0080000400000000L});
    public static final BitSet FOLLOW_34_in_ruleModule3770 = new BitSet(new long[]{0x1800000000000000L});
    public static final BitSet FOLLOW_ruleModuleExtendedAttribute_in_ruleModule3791 = new BitSet(new long[]{0x0080000400000000L});
    public static final BitSet FOLLOW_55_in_ruleModule3803 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_56_in_ruleModule3815 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleScopedName_in_ruleModule3836 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_57_in_ruleModule3846 = new BitSet(new long[]{0x2140000000002020L,0x0000000000000800L});
    public static final BitSet FOLLOW_ruleAbstractDefinitions_in_ruleModule3867 = new BitSet(new long[]{0x2540000000002020L,0x0000000000000800L});
    public static final BitSet FOLLOW_58_in_ruleModule3878 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleModule3888 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModuleExtendedAttribute_in_entryRuleModuleExtendedAttribute3924 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModuleExtendedAttribute3934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrefix_in_ruleModuleExtendedAttribute3984 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNamespaceObject_in_ruleModuleExtendedAttribute4014 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrefix_in_entryRulePrefix4049 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrefix4059 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_rulePrefix4094 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_rulePrefix4104 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleScopedName_in_rulePrefix4125 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNamespaceObject_in_entryRuleNamespaceObject4161 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNamespaceObject4171 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_ruleNamespaceObject4206 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterface_in_entryRuleInterface4254 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInterface4264 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_ruleInterface4300 = new BitSet(new long[]{0x00180E5100000000L});
    public static final BitSet FOLLOW_ruleInterfaceExtendedAttribute_in_ruleInterface4321 = new BitSet(new long[]{0x0080000400000000L});
    public static final BitSet FOLLOW_34_in_ruleInterface4332 = new BitSet(new long[]{0x00180E5100000000L});
    public static final BitSet FOLLOW_ruleInterfaceExtendedAttribute_in_ruleInterface4353 = new BitSet(new long[]{0x0080000400000000L});
    public static final BitSet FOLLOW_55_in_ruleInterface4365 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_61_in_ruleInterface4377 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleInterface4394 = new BitSet(new long[]{0x4200000000001000L});
    public static final BitSet FOLLOW_62_in_ruleInterface4411 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleScopedName_in_ruleInterface4438 = new BitSet(new long[]{0x0200000400001000L});
    public static final BitSet FOLLOW_34_in_ruleInterface4450 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleScopedName_in_ruleInterface4477 = new BitSet(new long[]{0x0200000400001000L});
    public static final BitSet FOLLOW_57_in_ruleInterface4492 = new BitSet(new long[]{0x844000002FFF8020L,0x00000000000081FDL});
    public static final BitSet FOLLOW_ruleInterfaceMember_in_ruleInterface4513 = new BitSet(new long[]{0x844000002FFF8020L,0x00000000000081FDL});
    public static final BitSet FOLLOW_58_in_ruleInterface4524 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleInterface4536 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterfaceExtendedAttribute_in_entryRuleInterfaceExtendedAttribute4572 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInterfaceExtendedAttribute4582 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCallback_in_ruleInterfaceExtendedAttribute4632 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstructor_in_ruleInterfaceExtendedAttribute4662 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNamedConstructor_in_ruleInterfaceExtendedAttribute4692 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNoInterfaceObject_in_ruleInterfaceExtendedAttribute4722 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrototypeRoot_in_ruleInterfaceExtendedAttribute4752 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSupplemental_in_ruleInterfaceExtendedAttribute4782 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOverrideBuiltins_in_ruleInterfaceExtendedAttribute4806 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReplaceableNamedProperties_in_ruleInterfaceExtendedAttribute4836 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterfaceMember_in_entryRuleInterfaceMember4871 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInterfaceMember4881 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConst_in_ruleInterfaceMember4931 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterfaceFeature_in_ruleInterfaceMember4961 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterfaceFeature_in_entryRuleInterfaceFeature4996 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInterfaceFeature5006 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttribute_in_ruleInterfaceFeature5056 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOperation_in_ruleInterfaceFeature5086 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOperation_in_entryRuleOperation5121 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOperation5131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_ruleOperation5167 = new BitSet(new long[]{0x0000A00000000000L});
    public static final BitSet FOLLOW_ruleOperationExtendedAttribute_in_ruleOperation5188 = new BitSet(new long[]{0x0080000400000000L});
    public static final BitSet FOLLOW_34_in_ruleOperation5199 = new BitSet(new long[]{0x0000A00000000000L});
    public static final BitSet FOLLOW_ruleOperationExtendedAttribute_in_ruleOperation5220 = new BitSet(new long[]{0x0080000400000000L});
    public static final BitSet FOLLOW_55_in_ruleOperation5232 = new BitSet(new long[]{0x800000002FFF8020L,0x000000000000007DL});
    public static final BitSet FOLLOW_63_in_ruleOperation5252 = new BitSet(new long[]{0x000000002FFF8020L,0x000000000000007DL});
    public static final BitSet FOLLOW_64_in_ruleOperation5284 = new BitSet(new long[]{0x000000002FFF8020L,0x000000000000007CL});
    public static final BitSet FOLLOW_ruleOperationSpecial_in_ruleOperation5319 = new BitSet(new long[]{0x000000002FFF8020L,0x000000000000007CL});
    public static final BitSet FOLLOW_ruleTypeRef_in_ruleOperation5341 = new BitSet(new long[]{0x0000000200000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleOperation5358 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_ruleOperation5374 = new BitSet(new long[]{0x004000082FFF8020L,0x0000000000003000L});
    public static final BitSet FOLLOW_ruleArgument_in_ruleOperation5396 = new BitSet(new long[]{0x0000000C00000000L});
    public static final BitSet FOLLOW_34_in_ruleOperation5407 = new BitSet(new long[]{0x004000002FFF8020L,0x0000000000003000L});
    public static final BitSet FOLLOW_ruleArgument_in_ruleOperation5428 = new BitSet(new long[]{0x0000000C00000000L});
    public static final BitSet FOLLOW_35_in_ruleOperation5442 = new BitSet(new long[]{0x0000000000001000L,0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_ruleOperation5453 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_ruleOperation5463 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleScopedName_in_ruleOperation5490 = new BitSet(new long[]{0x0000000C00000000L});
    public static final BitSet FOLLOW_34_in_ruleOperation5501 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleScopedName_in_ruleOperation5528 = new BitSet(new long[]{0x0000000C00000000L});
    public static final BitSet FOLLOW_35_in_ruleOperation5540 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleOperation5552 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOperationExtendedAttribute_in_entryRuleOperationExtendedAttribute5588 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOperationExtendedAttribute5598 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTreatNullAs_in_ruleOperationExtendedAttribute5648 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTreatUndefinedAs_in_ruleOperationExtendedAttribute5678 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOperationSpecial_in_entryRuleOperationSpecial5713 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOperationSpecial5723 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_ruleOperationSpecial5771 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_ruleOperationSpecial5801 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_68_in_ruleOperationSpecial5831 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_69_in_ruleOperationSpecial5861 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_70_in_ruleOperationSpecial5891 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttribute_in_entryRuleAttribute5928 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttribute5938 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_ruleAttribute5974 = new BitSet(new long[]{0x0004B00000000000L});
    public static final BitSet FOLLOW_ruleAttributeExtendedAttribute_in_ruleAttribute5995 = new BitSet(new long[]{0x0080000400000000L});
    public static final BitSet FOLLOW_34_in_ruleAttribute6006 = new BitSet(new long[]{0x0004B00000000000L});
    public static final BitSet FOLLOW_ruleAttributeExtendedAttribute_in_ruleAttribute6027 = new BitSet(new long[]{0x0080000400000000L});
    public static final BitSet FOLLOW_55_in_ruleAttribute6039 = new BitSet(new long[]{0x8000000000000000L,0x0000000000000180L});
    public static final BitSet FOLLOW_63_in_ruleAttribute6059 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000180L});
    public static final BitSet FOLLOW_71_in_ruleAttribute6084 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_72_in_ruleAttribute6096 = new BitSet(new long[]{0x000000002FFF8020L});
    public static final BitSet FOLLOW_ruleTypeRef_in_ruleAttribute6117 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleScopedName_in_ruleAttribute6138 = new BitSet(new long[]{0x0000000000001000L,0x0000000000000600L});
    public static final BitSet FOLLOW_73_in_ruleAttribute6150 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_ruleAttribute6160 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleScopedName_in_ruleAttribute6187 = new BitSet(new long[]{0x0000000C00000000L});
    public static final BitSet FOLLOW_34_in_ruleAttribute6198 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleScopedName_in_ruleAttribute6225 = new BitSet(new long[]{0x0000000C00000000L});
    public static final BitSet FOLLOW_35_in_ruleAttribute6237 = new BitSet(new long[]{0x0000000000001000L,0x0000000000000400L});
    public static final BitSet FOLLOW_74_in_ruleAttribute6250 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_ruleAttribute6260 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleScopedName_in_ruleAttribute6287 = new BitSet(new long[]{0x0000000C00000000L});
    public static final BitSet FOLLOW_34_in_ruleAttribute6298 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleScopedName_in_ruleAttribute6325 = new BitSet(new long[]{0x0000000C00000000L});
    public static final BitSet FOLLOW_35_in_ruleAttribute6337 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleAttribute6350 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttributeExtendedAttribute_in_entryRuleAttributeExtendedAttribute6386 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttributeExtendedAttribute6396 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePutForwards_in_ruleAttributeExtendedAttribute6446 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReplaceable_in_ruleAttributeExtendedAttribute6476 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTreatNullAs_in_ruleAttributeExtendedAttribute6506 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTreatUndefinedAs_in_ruleAttributeExtendedAttribute6536 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleException_in_entryRuleException6571 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleException6581 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_ruleException6617 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_ruleExceptionExtendedAttribute_in_ruleException6638 = new BitSet(new long[]{0x0080000400000000L});
    public static final BitSet FOLLOW_34_in_ruleException6649 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_ruleExceptionExtendedAttribute_in_ruleException6670 = new BitSet(new long[]{0x0080000400000000L});
    public static final BitSet FOLLOW_55_in_ruleException6682 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_75_in_ruleException6694 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleException6711 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_57_in_ruleException6726 = new BitSet(new long[]{0x040000002FFF8020L,0x0000000000008000L});
    public static final BitSet FOLLOW_ruleExceptionMember_in_ruleException6747 = new BitSet(new long[]{0x040000002FFF8020L,0x0000000000008000L});
    public static final BitSet FOLLOW_58_in_ruleException6758 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleException6768 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExceptionMember_in_entryRuleExceptionMember6804 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExceptionMember6814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConst_in_ruleExceptionMember6864 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExceptionField_in_ruleExceptionMember6894 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExceptionField_in_entryRuleExceptionField6929 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExceptionField6939 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeRef_in_ruleExceptionField6985 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleExceptionField7002 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleExceptionField7017 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExceptionExtendedAttribute_in_entryRuleExceptionExtendedAttribute7053 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExceptionExtendedAttribute7063 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNoInterfaceObject_in_ruleExceptionExtendedAttribute7112 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArgument_in_entryRuleArgument7146 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleArgument7156 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_ruleArgument7192 = new BitSet(new long[]{0x0002A00000000000L});
    public static final BitSet FOLLOW_ruleArgumentExtendedAttribute_in_ruleArgument7213 = new BitSet(new long[]{0x0080000400000000L});
    public static final BitSet FOLLOW_34_in_ruleArgument7224 = new BitSet(new long[]{0x0002A00000000000L});
    public static final BitSet FOLLOW_ruleArgumentExtendedAttribute_in_ruleArgument7245 = new BitSet(new long[]{0x0080000400000000L});
    public static final BitSet FOLLOW_55_in_ruleArgument7257 = new BitSet(new long[]{0x000000002FFF8020L,0x0000000000003000L});
    public static final BitSet FOLLOW_76_in_ruleArgument7277 = new BitSet(new long[]{0x000000002FFF8020L,0x0000000000002000L});
    public static final BitSet FOLLOW_77_in_ruleArgument7309 = new BitSet(new long[]{0x000000002FFF8020L});
    public static final BitSet FOLLOW_ruleTypeRef_in_ruleArgument7344 = new BitSet(new long[]{0x0000000000000020L,0x0000000000004000L});
    public static final BitSet FOLLOW_78_in_ruleArgument7362 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleArgument7393 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArgumentExtendedAttribute_in_entryRuleArgumentExtendedAttribute7434 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleArgumentExtendedAttribute7444 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAllowAny_in_ruleArgumentExtendedAttribute7494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTreatNullAs_in_ruleArgumentExtendedAttribute7524 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTreatUndefinedAs_in_ruleArgumentExtendedAttribute7554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConst_in_entryRuleConst7589 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConst7599 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_79_in_ruleConst7634 = new BitSet(new long[]{0x000000002FFF8020L});
    public static final BitSet FOLLOW_ruleTypeRef_in_ruleConst7655 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleConst7672 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_ruleConst7687 = new BitSet(new long[]{0x0000000000000050L,0x0000000000010000L});
    public static final BitSet FOLLOW_ruleConstExpr_in_ruleConst7708 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleConst7718 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstExpr_in_entryRuleConstExpr7754 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConstExpr7764 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleConstExpr7811 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_80_in_ruleConstExpr7841 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleConstExpr7852 = new BitSet(new long[]{0x0000000000000002L});

}