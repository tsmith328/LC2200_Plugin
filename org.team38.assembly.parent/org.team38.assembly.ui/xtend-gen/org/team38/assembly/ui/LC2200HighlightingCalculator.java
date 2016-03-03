package org.team38.assembly.ui;

import com.google.common.base.Objects;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.ide.editor.syntaxcoloring.IHighlightedPositionAcceptor;
import org.eclipse.xtext.ide.editor.syntaxcoloring.ISemanticHighlightingCalculator;
import org.eclipse.xtext.nodemodel.BidiTreeIterable;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.parser.IParseResult;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.util.CancelIndicator;
import org.team38.assembly.lC2200.CommentTrans;
import org.team38.assembly.lC2200.IInstructionImmTrans;
import org.team38.assembly.lC2200.IInstructionLabelTrans;
import org.team38.assembly.lC2200.IInstructionOffsetTrans;
import org.team38.assembly.lC2200.JInstructionTrans;
import org.team38.assembly.lC2200.LabelBeg;
import org.team38.assembly.lC2200.LabelEnd;
import org.team38.assembly.lC2200.NOOPDirective;
import org.team38.assembly.lC2200.OInstruction;
import org.team38.assembly.lC2200.RInstructionTrans;
import org.team38.assembly.lC2200.RegTrans;
import org.team38.assembly.lC2200.WordTrans;
import org.team38.assembly.ui.LC2200HighlightingConfiguration;

@SuppressWarnings("all")
public class LC2200HighlightingCalculator implements ISemanticHighlightingCalculator {
  @Override
  public void provideHighlightingFor(final XtextResource resource, final IHighlightedPositionAcceptor acceptor, final CancelIndicator arg2) {
    boolean _or = false;
    boolean _equals = Objects.equal(resource, null);
    if (_equals) {
      _or = true;
    } else {
      IParseResult _parseResult = resource.getParseResult();
      boolean _equals_1 = Objects.equal(_parseResult, null);
      _or = _equals_1;
    }
    if (_or) {
      return;
    }
    IParseResult _parseResult_1 = resource.getParseResult();
    INode root = _parseResult_1.getRootNode();
    BidiTreeIterable<INode> _asTreeIterable = root.getAsTreeIterable();
    for (final INode node : _asTreeIterable) {
      EObject _semanticElement = node.getSemanticElement();
      if ((_semanticElement instanceof WordTrans)) {
        int _offset = node.getOffset();
        int _length = node.getLength();
        acceptor.addPosition(_offset, _length, 
          LC2200HighlightingConfiguration.WORD_ID);
      } else {
        boolean _or_1 = false;
        boolean _or_2 = false;
        boolean _or_3 = false;
        boolean _or_4 = false;
        boolean _or_5 = false;
        boolean _or_6 = false;
        EObject _semanticElement_1 = node.getSemanticElement();
        if ((_semanticElement_1 instanceof RInstructionTrans)) {
          _or_6 = true;
        } else {
          EObject _semanticElement_2 = node.getSemanticElement();
          _or_6 = (_semanticElement_2 instanceof IInstructionImmTrans);
        }
        if (_or_6) {
          _or_5 = true;
        } else {
          EObject _semanticElement_3 = node.getSemanticElement();
          _or_5 = (_semanticElement_3 instanceof IInstructionOffsetTrans);
        }
        if (_or_5) {
          _or_4 = true;
        } else {
          EObject _semanticElement_4 = node.getSemanticElement();
          _or_4 = (_semanticElement_4 instanceof IInstructionLabelTrans);
        }
        if (_or_4) {
          _or_3 = true;
        } else {
          EObject _semanticElement_5 = node.getSemanticElement();
          _or_3 = (_semanticElement_5 instanceof JInstructionTrans);
        }
        if (_or_3) {
          _or_2 = true;
        } else {
          EObject _semanticElement_6 = node.getSemanticElement();
          _or_2 = (_semanticElement_6 instanceof OInstruction);
        }
        if (_or_2) {
          _or_1 = true;
        } else {
          EObject _semanticElement_7 = node.getSemanticElement();
          _or_1 = (_semanticElement_7 instanceof NOOPDirective);
        }
        if (_or_1) {
          int _offset_1 = node.getOffset();
          int _length_1 = node.getLength();
          acceptor.addPosition(_offset_1, _length_1, 
            LC2200HighlightingConfiguration.INSTRUCTION_ID);
        } else {
          EObject _semanticElement_8 = node.getSemanticElement();
          if ((_semanticElement_8 instanceof RegTrans)) {
            int _offset_2 = node.getOffset();
            int _length_2 = node.getLength();
            acceptor.addPosition(_offset_2, _length_2, 
              LC2200HighlightingConfiguration.REG_ID);
          } else {
            boolean _or_7 = false;
            EObject _semanticElement_9 = node.getSemanticElement();
            if ((_semanticElement_9 instanceof LabelBeg)) {
              _or_7 = true;
            } else {
              EObject _semanticElement_10 = node.getSemanticElement();
              _or_7 = (_semanticElement_10 instanceof LabelEnd);
            }
            if (_or_7) {
              int _offset_3 = node.getOffset();
              int _length_3 = node.getLength();
              acceptor.addPosition(_offset_3, _length_3, 
                LC2200HighlightingConfiguration.LABEL_ID);
            } else {
              EObject _semanticElement_11 = node.getSemanticElement();
              if ((_semanticElement_11 instanceof CommentTrans)) {
                int _offset_4 = node.getOffset();
                int _length_4 = node.getLength();
                acceptor.addPosition(_offset_4, _length_4, 
                  LC2200HighlightingConfiguration.COMMENT_ID);
              }
            }
          }
        }
      }
    }
  }
}
