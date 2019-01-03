package doubles_and_booleans;

import javax.swing.JOptionPane;

public class TestScores {
public static void main(String[] args) {
	
	String score = JOptionPane.showInputDialog("What was your test score?");
	double test = Integer.parseInt(score);
if (test>=90) {
		JOptionPane.showMessageDialog(null, "Wow you must have worked really hard!");
	}
if (test<=89&& test>=80) {
	JOptionPane.showMessageDialog(null, "That's not too bad!");
}
if (test<=79 && test>=70) {
	
	JOptionPane.showMessageDialog(null, "At least it's passing...");
}
if (test<=69 && test>=60) {
	JOptionPane.showMessageDialog(null, "Yikes! I hope you do better next time...");
}
if (test<=59) {
	JOptionPane.showMessageDialog(null, "You need to fix that!");
}


}
}
