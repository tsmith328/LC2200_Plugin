package org.team38.assembly.ui

import org.eclipse.swt.graphics.RGB
import org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightingConfiguration
import org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightingConfigurationAcceptor
import org.eclipse.xtext.ui.editor.utils.TextStyle

import static org.eclipse.swt.SWT.*

/*
 * Specifies the syntax color for each type of element for an LC2200 program
 */
public class LC2200HighlightingConfiguration implements IHighlightingConfiguration {
	
	/*
	 * Global variables for distinguishing between different elements
	 */
	public static final String INSTRUCTION_ID = "instruction";
	public static final String WORD_ID = ".word";
	public static final String REG_ID = "register";
	public static final String LABEL_ID = "label";
	public static final String COMMENT_ID = "comment";
	
	/*
	 * Configuration method for specifying color of each element
	 * 
	 * @param acceptor binds the color info for an element
	 */
	override configure(IHighlightingConfigurationAcceptor acceptor) {
		//.word
		acceptor.acceptDefaultHighlighting(
			WORD_ID, ".word",
			keywordTextStyle(240, 46, 224, NORMAL)
		);
		
		//Instructions
		acceptor.acceptDefaultHighlighting(
			INSTRUCTION_ID, "Instruction",
			keywordTextStyle(20, 110, 12, NORMAL)
		);

		//Registers
		acceptor.acceptDefaultHighlighting(
			REG_ID, "Register",
			keywordTextStyle(145, 54, 168, NORMAL)
		);

		//Labels
		acceptor.acceptDefaultHighlighting(
			LABEL_ID, "Label",
			keywordTextStyle(0, 0, 200, NORMAL)
		);

		//Comments
		acceptor.acceptDefaultHighlighting(
			COMMENT_ID, "Comment",
			keywordTextStyle(150, 200, 200, NORMAL)
		);
	}
	
	/*
	 * Calculates syntax coloring info as a TextStyle
	 * 
	 * @param r red
	 * @param g green
	 * @param b blue
	 * @param style text style i.e. bold, italics, etc.
	 * @return the TextStyle
	 */
	def public TextStyle keywordTextStyle(int r, int g, int b, int style) {
		var TextStyle textStyle = new TextStyle();
		textStyle.setColor(new RGB(r, g, b));
		textStyle.setStyle(style);
		return textStyle;
	}
}