package org.team38.assembly

import org.team38.assembly.lC2200.Program
import org.eclipse.emf.common.util.EList
import org.team38.assembly.lC2200.Directive
import org.team38.assembly.lC2200.Instruction
import java.util.HashMap
import org.team38.assembly.lC2200.Line
import org.team38.assembly.lC2200.LabelBeg

class LabelHandler {
	
	/**
	 * Stores labels and their position into a hash map
	 * 
	 * @param root
	 */
	def static HashMap<String, Integer> populateLabels(Program root) {
		var offset = 0;
		var HashMap<String, Integer> labelTable = new HashMap<String, Integer>();
		
		var EList<Line> lines = root.getLines();

		for(line : lines) {
			if (line.eClass().getName().equals("Directive")) {
				var dir = (line as Directive);
				var labelBeg = dir.getLabel();
				addLabel(labelBeg, labelTable, offset);
			}
			else if (line.eClass().getName().equals("Instruction")) {
				var instr = (line as Instruction);
				var labelBeg = instr.getLabel();
				addLabel(labelBeg, labelTable, offset);
			}
			offset++
		}	
		return labelTable
	}
	def static addLabel(LabelBeg labelBeg, HashMap<String, Integer> labelTable, int offset) {
		if(labelBeg != null) {
			var label = labelBeg.getLabel();
			if (label != null) {
				label = label.replace(":","")
				if(labelTable.get(label) == null) {
					labelTable.put(label, offset);
				} else {
					labelTable.put(label, -1);
				}
			}
		}
	}
}