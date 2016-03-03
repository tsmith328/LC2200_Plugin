package org.team38.assembly.ui;

import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.RGB;
import org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightingConfiguration;
import org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightingConfigurationAcceptor;
import org.eclipse.xtext.ui.editor.utils.TextStyle;

@SuppressWarnings("all")
public class LC2200HighlightingConfiguration implements IHighlightingConfiguration {
  public final static String INSTRUCTION_ID = "instruction";
  
  public final static String WORD_ID = ".word";
  
  public final static String REG_ID = "register";
  
  public final static String LABEL_ID = "label";
  
  public final static String COMMENT_ID = "comment";
  
  @Override
  public void configure(final IHighlightingConfigurationAcceptor acceptor) {
    TextStyle _keywordTextStyle = this.keywordTextStyle(200, 0, 0, SWT.NORMAL);
    acceptor.acceptDefaultHighlighting(
      LC2200HighlightingConfiguration.WORD_ID, ".word", _keywordTextStyle);
    TextStyle _keywordTextStyle_1 = this.keywordTextStyle(200, 0, 0, SWT.NORMAL);
    acceptor.acceptDefaultHighlighting(
      LC2200HighlightingConfiguration.INSTRUCTION_ID, "Instruction", _keywordTextStyle_1);
    TextStyle _keywordTextStyle_2 = this.keywordTextStyle(0, 200, 0, SWT.NORMAL);
    acceptor.acceptDefaultHighlighting(
      LC2200HighlightingConfiguration.REG_ID, "Register", _keywordTextStyle_2);
    TextStyle _keywordTextStyle_3 = this.keywordTextStyle(0, 0, 200, SWT.NORMAL);
    acceptor.acceptDefaultHighlighting(
      LC2200HighlightingConfiguration.LABEL_ID, "Label", _keywordTextStyle_3);
    TextStyle _keywordTextStyle_4 = this.keywordTextStyle(150, 200, 200, SWT.NORMAL);
    acceptor.acceptDefaultHighlighting(
      LC2200HighlightingConfiguration.COMMENT_ID, "Comment", _keywordTextStyle_4);
  }
  
  public TextStyle keywordTextStyle(final int r, final int g, final int b, final int style) {
    TextStyle textStyle = new TextStyle();
    RGB _rGB = new RGB(r, g, b);
    textStyle.setColor(_rGB);
    textStyle.setStyle(style);
    return textStyle;
  }
}
