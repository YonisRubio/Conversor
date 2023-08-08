package Pruebas;

import javax.swing.JOptionPane;

public class PruebaTest {
	
	public static void main(String[] args) {
		
		String inputValue = JOptionPane.showInputDialog("Please input a value");
		System.out.println(inputValue);
		
		JOptionPane.showMessageDialog(null, "alert", "alert", JOptionPane.ERROR_MESSAGE);
		
		JOptionPane.showConfirmDialog(null,
	             "choose one", "choose one", JOptionPane.YES_NO_OPTION);
		
		 Object[] options = { "OK", "CANCEL" };
		 JOptionPane.showOptionDialog(null, "Click OK to continue", "Warning",
		             JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE,
		             null, options, options[0]);
		 
		 
		 Object[] possibleValues = { "First", "Second", "Third" };

		 Object selectedValue = JOptionPane.showInputDialog(null,
		             "Choose one", "Input",
		             JOptionPane.INFORMATION_MESSAGE, null,
		             possibleValues, possibleValues[0]);
		
	}

}
