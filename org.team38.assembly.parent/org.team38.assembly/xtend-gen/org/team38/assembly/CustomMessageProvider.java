package org.team38.assembly;

import org.antlr.runtime.RecognitionException;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.nodemodel.SyntaxErrorMessage;
import org.eclipse.xtext.parser.antlr.ISyntaxErrorMessageProvider;
import org.eclipse.xtext.parser.antlr.SyntaxErrorMessageProvider;

/**
 * Provides custom, user-readable error messages for incorrect
 * pieces of LC2200 code
 */
@SuppressWarnings("all")
public class CustomMessageProvider extends SyntaxErrorMessageProvider {
  /**
   * Global variables for distinguishing between different error types
   */
  public final static String IMMEDIATE = "immediate";
  
  public final static String RULE_REG = "register";
  
  public final static String COMMA = "comma";
  
  public final static String INSTR_START = "start_instruction";
  
  public final static String INSTR_END = "end_instruction";
  
  public final static String LABEL = "label";
  
  public final static String PAREN = "parenthesis";
  
  /**
   * Gets the default message and updates it to a more
   * readable message for the user.
   * 
   * @param context the current context in which the error
   * 		  message shows up
   * @return a new, custom error message
   */
  @Override
  public SyntaxErrorMessage getSyntaxErrorMessage(final ISyntaxErrorMessageProvider.IParserErrorContext context) {
    SyntaxErrorMessage _xblockexpression = null;
    {
      final String msgDefault = context.getDefaultMessage();
      boolean _contains = msgDefault.contains("IMMEDIATE");
      if (_contains) {
        return new SyntaxErrorMessage("Expecting an immediate value, i.e. an integer.", CustomMessageProvider.IMMEDIATE);
      } else {
        boolean _contains_1 = msgDefault.contains("RULE_REG");
        if (_contains_1) {
          return new SyntaxErrorMessage("Expecting a valid register, e.g. $t0.", CustomMessageProvider.RULE_REG);
        } else {
          boolean _contains_2 = msgDefault.contains("COMMA");
          if (_contains_2) {
            return new SyntaxErrorMessage("Expecting a comma.", CustomMessageProvider.COMMA);
          } else {
            boolean _contains_3 = msgDefault.contains("LABEL_IMM");
            if (_contains_3) {
              return new SyntaxErrorMessage("Missing label", CustomMessageProvider.LABEL);
            } else {
              boolean _contains_4 = msgDefault.contains("extraneous");
              if (_contains_4) {
                return new SyntaxErrorMessage("Expecting label or instruction.", CustomMessageProvider.INSTR_START);
              } else {
                boolean _contains_5 = msgDefault.contains("EOF");
                if (_contains_5) {
                  return new SyntaxErrorMessage("Expecting end of instruction.", CustomMessageProvider.INSTR_END);
                } else {
                  boolean _contains_6 = msgDefault.contains("LABEL");
                  if (_contains_6) {
                    return new SyntaxErrorMessage("Expecting a pre-defined label.", CustomMessageProvider.LABEL);
                  } else {
                    boolean _contains_7 = msgDefault.contains("PAREN");
                    if (_contains_7) {
                      return new SyntaxErrorMessage("Missing a parenthesis.", CustomMessageProvider.PAREN);
                    } else {
                      boolean _contains_8 = msgDefault.contains("viable");
                      if (_contains_8) {
                        return new SyntaxErrorMessage("Expecting instruction afterwards", CustomMessageProvider.LABEL);
                      }
                    }
                  }
                }
              }
            }
          }
        }
      }
      String[] tokens = context.getTokenNames();
      for (final String token : tokens) {
        System.out.println(token);
      }
      System.out.println(context);
      INode _currentNode = context.getCurrentNode();
      System.out.println(_currentNode);
      EObject _currentContext = context.getCurrentContext();
      System.out.println(_currentContext);
      RecognitionException _recognitionException = context.getRecognitionException();
      System.out.println(_recognitionException);
      _xblockexpression = super.getSyntaxErrorMessage(context);
    }
    return _xblockexpression;
  }
}
