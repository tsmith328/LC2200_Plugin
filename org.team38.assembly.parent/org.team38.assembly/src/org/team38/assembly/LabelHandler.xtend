package org.team38.assembly

import org.team38.assembly.lC2200.Program
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.common.util.EList
import org.team38.assembly.lC2200.Directive
import org.team38.assembly.lC2200.Instruction
import java.util.HashMap

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
				if(labelBeg != null) {
					var label = labelBeg.getLabel();
					if (label != null) {
						labelTable.put(label.replace(":",""), offset);
					}
				}
			}
			else if (line.eClass().getName().equals("Instruction")) {
				var instr = (line as Instruction);
				var labelBeg = instr.getLabel();
				if(labelBeg != null) {
					var label = labelBeg.getLabel();
					if (label != null) {
						labelTable.put(label.replace(":",""), offset);
					}
				}
			}
			offset++
		}	
		
		return labelTable
	}
}