

import javax.swing.JOptionPane;

public class SimpleCalculator {
	public static void main(String[] args) {

		// 1. Get 2 numbers from the user and convert them to integer.
String ans = JOptionPane.showInputDialog("Give me one number");
		int r2 = Integer.parseInt(ans);
		String ans1 = JOptionPane.showInputDialog("Give me another number");
		int r2d = Integer.parseInt(ans1);
		// 2. Customize pop-up to support add/subtract/multiply/divide operations.
		int operation = JOptionPane.showOptionDialog(null, "what do you want to do", "Pop-up Title", 0,
				JOptionPane.INFORMATION_MESSAGE, null, new String[] { "Add", "Subtract", "Multiply", "Divide" },
				null);

		// 5. Call the methods created in steps 3 and 4 to perform the appropriate operation.
if (operation == 0) {
	add(r2 , r2d);
}
if (operation == 1) {
	sub(r2 , r2d);
}
if (operation == 2) {
	multiply(r2 , r2d);
}
if (operation == 3) {
	divide(r2 , r2d);
}

// 6. Wrap steps 1, 2 and 5 in a for loop to repeat calculator operations
	}

	// 3. Create method for addition operation.
	//    Method should create pop-up that shows equation and solution, eg. 45 + 25 = 70.
	//    HINT: use 'static void add(int num1, num2) { ... }
static void add(int num1, int num2){
JOptionPane.showMessageDialog(null, num1 + num2 +" is the number");
}
static void sub(int num1, int num2){
	JOptionPane.showMessageDialog(null, num1 - num2 +" is the number");
}
static void multiply(int num1, int num2){
	JOptionPane.showMessageDialog(null, num1 * num2 +" is the number");
}
static void divide(int num1, int num2){
	JOptionPane.showMessageDialog(null, num1 / num2 +" is the number");
}

// 4. Create similar methods for subtraction, multiplication and division.
}