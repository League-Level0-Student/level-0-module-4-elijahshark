package extra;

import javax.swing.JOptionPane;

public class Test_Scores {
public static void main(String[] args) {
	String ans = JOptionPane.showInputDialog("what did you get on your last test");
	int r2 = Integer.parseInt(ans);
	if (r2 > 50.0) {
		JOptionPane.showMessageDialog(null, "YOUR THE WORST PERSON TO TAKE A TEST!");
	}
	














}
}
