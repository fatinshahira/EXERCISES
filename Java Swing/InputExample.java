
package guiexample;

import javax.swing.JOptionPane;

public class GuiExample {

    public static void main(String[] args) {
        
        String firstName = JOptionPane.showInputDialog("Enter First Number");
        String secondName = JOptionPane.showInputDialog("Enter Second Number");
        
        int num1 = Integer.parseInt(firstName);
        int num2 = Integer.parseInt(secondName);
        int sum = num1 + num2;
        
        JOptionPane.showConfirmDialog(null, "The Answer is" + sum, "SUM",JOptionPane.PLAIN_MESSAGE);
    }
    
}
