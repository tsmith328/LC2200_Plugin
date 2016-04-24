/**
 * generated by Xtext 2.9.1
 */
package org.team38.assembly.ui.quickfix;

import org.eclipse.xtext.ui.editor.model.IXtextDocument;
import org.eclipse.xtext.ui.editor.model.edit.IModification;
import org.eclipse.xtext.ui.editor.model.edit.IModificationContext;
import org.eclipse.xtext.ui.editor.quickfix.DefaultQuickfixProvider;
import org.eclipse.xtext.ui.editor.quickfix.Fix;
import org.eclipse.xtext.ui.editor.quickfix.IssueResolutionAcceptor;
import org.eclipse.xtext.validation.Issue;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.team38.assembly.validation.LC2200Validator;

/**
 * Custom quickfixes.
 * 
 * See https://www.eclipse.org/Xtext/documentation/304_ide_concepts.html#quick-fixes
 */
@SuppressWarnings("all")
public class LC2200QuickfixProvider extends DefaultQuickfixProvider {
  @Fix(LC2200Validator.DECIMAL_IMMEDIATE_VALUE)
  public void removeFractionalPart(final Issue issue, final IssueResolutionAcceptor acceptor) {
    final IModification _function = (IModificationContext context) -> {
      final IXtextDocument xtextDocument = context.getXtextDocument();
      Integer _offset = issue.getOffset();
      Integer _length = issue.getLength();
      final String number = xtextDocument.get((_offset).intValue(), (_length).intValue());
      final int decimalPoint = number.indexOf(".");
      Integer _offset_1 = issue.getOffset();
      int _plus = ((_offset_1).intValue() + decimalPoint);
      Integer _length_1 = issue.getLength();
      int _minus = ((_length_1).intValue() - decimalPoint);
      xtextDocument.replace(_plus, _minus, "");
    };
    acceptor.accept(issue, "Remove Fractional Part", "Remove the digits after the decimal point.", "", _function);
  }
  
  @Fix(LC2200Validator.EXTREME_IMMEDIATE_VALUE)
  public void setWithinBounds(final Issue issue, final IssueResolutionAcceptor acceptor) {
    String[] _data = issue.getData();
    String _head = IterableExtensions.<String>head(((Iterable<String>)Conversions.doWrapArray(_data)));
    String _plus = ("Set to" + _head);
    final IModification _function = (IModificationContext context) -> {
      final IXtextDocument xtextDocument = context.getXtextDocument();
      Integer _offset = issue.getOffset();
      Integer _length = issue.getLength();
      String[] _data_1 = issue.getData();
      String _head_1 = IterableExtensions.<String>head(((Iterable<String>)Conversions.doWrapArray(_data_1)));
      xtextDocument.replace((_offset).intValue(), (_length).intValue(), _head_1);
    };
    acceptor.accept(issue, _plus, "Set immediate value to nearest value within bounds.", "", _function);
  }
  
  @Fix(LC2200Validator.DUPLICATE_LABEL)
  public void renameLabel(final Issue issue, final IssueResolutionAcceptor acceptor) {
    final IModification _function = (IModificationContext context) -> {
      final IXtextDocument xtextDocument = context.getXtextDocument();
      Integer _offset = issue.getOffset();
      Integer _length = issue.getLength();
      xtextDocument.replace((_offset).intValue(), (_length).intValue(), "");
    };
    acceptor.accept(issue, "Rename Label", "Enter a new name for the label.", "", _function);
  }
  
  @Fix(LC2200Validator.INVALID_LABEL)
  public void replaceLabel(final Issue issue, final IssueResolutionAcceptor acceptor) {
    String[] _data = issue.getData();
    for (final String str : _data) {
      final IModification _function = (IModificationContext context) -> {
        final IXtextDocument xtextDocument = context.getXtextDocument();
        Integer _offset = issue.getOffset();
        Integer _length = issue.getLength();
        xtextDocument.replace((_offset).intValue(), (_length).intValue(), str);
      };
      acceptor.accept(issue, ("Replace Label with " + str), (("Replace with " + str) + "."), "", _function);
    }
  }
}
