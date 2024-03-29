package org.team38.assembly.ui;

import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.RGB;
import org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightingConfiguration;
import org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightingConfigurationAcceptor;
import org.eclipse.xtext.ui.editor.utils.TextStyle;

/**
 * Specifies the syntax color for each type of element for an LC2200 program
 */
@SuppressWarnings("all")
public class LC2200HighlightingConfiguration implements IHighlightingConfiguration {
  /**
   * Global variables for distinguishing between different elements
   */
  public final static String INSTRUCTION_ID = "instruction";
  
  public final static String WORD_ID = ".word";
  
  public final static String REG_ID = "register";
  
  public final static String LABEL_ID = "label";
  
  public final static String COMMENT_ID = "comment";
  
  /**
   * Configuration method for specifying color of each element
   * 
   * @param acceptor binds the color info for an element
   */
  @Override
  public void configure(final IHighlightingConfigurationAcceptor acceptor) {
    TextStyle _keywordTextStyle = this.keywordTextStyle(240, 46, 224, SWT.NORMAL);
    acceptor.acceptDefaultHighlighting(
      LC2200HighlightingConfiguration.WORD_ID, ".word", _keywordTextStyle);
    TextStyle _keywordTextStyle_1 = this.keywordTextStyle(20, 110, 12, SWT.NORMAL);
    acceptor.acceptDefaultHighlighting(
      LC2200HighlightingConfiguration.INSTRUCTION_ID, "Instruction", _keywordTextStyle_1);
    TextStyle _keywordTextStyle_2 = this.keywordTextStyle(145, 54, 168, SWT.NORMAL);
    acceptor.acceptDefaultHighlighting(
      LC2200HighlightingConfiguration.REG_ID, "Register", _keywordTextStyle_2);
    TextStyle _keywordTextStyle_3 = this.keywordTextStyle(0, 0, 200, SWT.NORMAL);
    acceptor.acceptDefaultHighlighting(
      LC2200HighlightingConfiguration.LABEL_ID, "Label", _keywordTextStyle_3);
    TextStyle _keywordTextStyle_4 = this.keywordTextStyle(150, 200, 200, SWT.NORMAL);
    acceptor.acceptDefaultHighlighting(
      LC2200HighlightingConfiguration.COMMENT_ID, "Comment", _keywordTextStyle_4);
  }
  
  /**
   * Calculates syntax coloring info as a TextStyle
   * 
   * @param r red
   * @param g green
   * @param b blue
   * @param style text style i.e. bold, italics, etc.
   * @return the TextStyle
   */
  public TextStyle keywordTextStyle(final int r, final int g, final int b, final int style) {
    TextStyle textStyle = new TextStyle();
    RGB _rGB = new RGB(r, g, b);
    textStyle.setColor(_rGB);
    textStyle.setStyle(style);
    return textStyle;
  }
}
