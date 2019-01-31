package extra;


import javax.swing.JOptionPane;

public class SimpleCalculator {
	public static void main(String[] args) {
for (int i =0; i<5; i++) {
		// 1. Get 2 numbers from the user and convert them to integer.
String number = JOptionPane.showInputDialog("INPUT YOUR FIRST NUMBER");
String number2 = JOptionPane.showInputDialog("INPUT YOUR SECOND NUMBER");
int num = Integer.parseInt(number);
int num2 = Integer.parseInt(number2);
		// 2. Customize pop-up to support add/subtract/multiply/divide operations.
		int operation = JOptionPane.showOptionDialog(null, "OPERATION TO PERFORM:", "CALCULATOR-BOT", 0,
				JOptionPane.INFORMATION_MESSAGE, null, new String[] { "ADDITION", "SUBTRACTION", "MULTIPLICATION", "DIVISION" },
				null);

		// 5. Call the methods created in steps 3 and 4 to perform the appropriate operation.
if (operation==0) {
	add(num, num2);
}
if(operation==1) {
	subtract(num, num2);
}
if(operation==2) {
	multiply(num,num2);
}
if(operation==3) {
	division(num, num2);
}
}
		// 6. Wrap steps 1, 2 and 5 in a for loop to repeat calculator operations
	}

	// 3. Create method for addition operation.
	//    Method should create pop-up that shows equation and solution, eg. 45 + 25 = 70.
	//    HINT: use 'static void add(int num1, num2) { ... }
static void add(int num, int num2) {
JOptionPane.showMessageDialog(null, num + " + " + num2 + " = " + (num+=num2));	
}
static void subtract(int num, int num2) {
	JOptionPane.showMessageDialog(null, num + " - " + num2 + " = " +(num-=num2));	

}
static void multiply(int num, int num2) {
	JOptionPane.showMessageDialog(null, num + " x " + num2 + " = " +(num*=num2));	
	
}
static void division(int num, int num2) {
	JOptionPane.showMessageDialog(null, num + " / " + num2 + " = " +(num/=num2));	

}
	// 4. Create similar methods for subtraction, multiplication and division.
}