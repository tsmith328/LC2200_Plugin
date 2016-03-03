package org.team38.assembly.ui

import org.eclipse.xtext.ide.editor.syntaxcoloring.IHighlightedPositionAcceptor
import org.eclipse.xtext.ide.editor.syntaxcoloring.ISemanticHighlightingCalculator
import org.eclipse.xtext.nodemodel.INode
import org.eclipse.xtext.resource.XtextResource
import org.eclipse.xtext.util.CancelIndicator
import org.team38.assembly.lC2200.CommentTrans
import org.team38.assembly.lC2200.IInstructionImmTrans
import org.team38.assembly.lC2200.IInstructionLabelTrans
import org.team38.assembly.lC2200.IInstructionOffsetTrans
import org.team38.assembly.lC2200.JInstructionTrans
import org.team38.assembly.lC2200.LabelBeg
import org.team38.assembly.lC2200.LabelEnd
import org.team38.assembly.lC2200.NOOPDirective
import org.team38.assembly.lC2200.OInstruction
import org.team38.assembly.lC2200.RInstructionTrans
import org.team38.assembly.lC2200.RegTrans
import org.team38.assembly.lC2200.WordTrans

public class LC2200HighlightingCalculator implements ISemanticHighlightingCalculator {
	
	override provideHighlightingFor(XtextResource resource, 
		IHighlightedPositionAcceptor acceptor,
		CancelIndicator arg2) {
  		if (resource == null || resource.getParseResult() == null)
    		return;
        	
  		var INode root = resource.getParseResult().getRootNode();
  		for (INode node : root.getAsTreeIterable()) {
  			//.word
    		if (node.getSemanticElement() instanceof WordTrans) {
      			acceptor.addPosition(node.getOffset(), node.getLength(), 
        			LC2200HighlightingConfiguration.WORD_ID);
        	//Instructions
    		} else if (node.getSemanticElement() instanceof RInstructionTrans ||
    			node.getSemanticElement() instanceof IInstructionImmTrans ||
    			node.getSemanticElement() instanceof IInstructionOffsetTrans ||
    			node.getSemanticElement() instanceof IInstructionLabelTrans ||
    			node.getSemanticElement() instanceof JInstructionTrans ||
    			node.getSemanticElement() instanceof OInstruction ||
    			node.getSemanticElement() instanceof NOOPDirective) {
      			acceptor.addPosition(node.getOffset(), node.getLength(), 
        			LC2200HighlightingConfiguration.INSTRUCTION_ID);
        	//Registers
        	} else if (node.getSemanticElement() instanceof RegTrans) {
      			acceptor.addPosition(node.getOffset(), node.getLength(), 
        			LC2200HighlightingConfiguration.REG_ID);
        	//Labels
        	} else if (node.getSemanticElement() instanceof LabelBeg ||
        		node.getSemanticElement() instanceof LabelEnd) {
      			acceptor.addPosition(node.getOffset(), node.getLength(), 
        			LC2200HighlightingConfiguration.LABEL_ID);
        	//Comments
        	} else if (node.getSemanticElement() instanceof CommentTrans) {
      			acceptor.addPosition(node.getOffset(), node.getLength(), 
        			LC2200HighlightingConfiguration.COMMENT_ID);
  			}
		}
	}
}
