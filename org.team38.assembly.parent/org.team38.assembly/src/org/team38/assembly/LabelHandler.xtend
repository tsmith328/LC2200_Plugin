package org.team38.assembly

import java.util.HashMap
import org.eclipse.emf.common.util.EList
import org.eclipse.emf.ecore.EObject
import org.team38.assembly.lC2200.Directive
import org.team38.assembly.lC2200.Instruction
import org.team38.assembly.lC2200.LabelBeg
import org.team38.assembly.lC2200.Program

class LabelHandler {
	
	/**
	 * Stores labels and their position into a hash map
	 * 
	 * @param root
	 */
	def static HashMap<String, Integer> populateLabels(Program root) {
		var offset = 0;
		var HashMap<String, Integer> labelTable = new HashMap<String, Integer>();
		
		var EList<EObject> lines = root.getLines();

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
			if(!line.eClass().getName().equals("LineEnd")) {
				offset++
			}
		}	
		return labelTable
	}
	def private static addLabel(LabelBeg labelBeg, HashMap<String, Integer> labelTable, int offset) {
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