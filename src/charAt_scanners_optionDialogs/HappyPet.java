package charAt_scanners_optionDialogs;
import javax.swing.JOptionPane;

public class HappyPet {
	
	// 2. Add the following variable to the next line: static int happinessLevel = 0;
	// this will be used to store the happiness of your pet
	static int happinessLevel = 0;
	public static void main(String[] args) {
		// 1. Ask the user what kind of pet they want to buy, and store their answer in a variable
String petType = JOptionPane.showInputDialog("What kind of pet do you want?");

		// 7. REPEAT steps 3 - 6 enough times to make your pet happy!
		
			// 3. Use showOptionDialog to ask the user what they want to do to make their pet happy

			//    (eg: cuddle, food, water, take a walk, groom, clean up poop).
			//    Make sure to customize the title and question too.
for(int i = 0; i<30; i++) {
			int task = JOptionPane.showOptionDialog(null, "What do you want to do to make your pet happy?"
					, "Pet Care", 0, JOptionPane.INFORMATION_MESSAGE, null,
					new String[] { "Go for a walk", "Food", "Groom", "Pet", "Clean" }, null);
System.out.println(task);
			// 5. Use user input to call the appropriate method created in step 4.
if (task==0) {
	walk(petType);
}

if (task==1) {
feed(petType);
}
if (task==2) {
	groom(petType);
}
if (task==3) {
	pet(petType);
}
if (task==4) {
	clean(petType);
}

			// 6. If you determine the happiness level is large enough, tell the
			//    user that he loves his pet and use break; to exit for loop.
if (happinessLevel>=150) {
	JOptionPane.showMessageDialog(null, "Your "+ petType + " loves you to the moon and back!! Congratulations");
break;
}
}
	}

	
	
	
	
	static // 4. Create methods to handle each of your user selections.
	//    Each method should create a pop-up with the pet's response (eg. cat might purr when pet), 
	//    and INCREMENT the pet's happiness Level.
void walk(String petType) {
JOptionPane.showMessageDialog(null,"Your " + petType +" enjoyed the walk!");
happinessLevel+=25;
JOptionPane.showMessageDialog(null,"Your " + petType +"'s happiness level is " + happinessLevel);

}
static void groom(String petType) {
JOptionPane.showMessageDialog(null,"Your "+ petType +" feels softer!");
happinessLevel+=15;
JOptionPane.showMessageDialog(null,"Your " + petType +"'s happiness level is " + happinessLevel);

}
static void feed(String petType) {
JOptionPane.showMessageDialog(null,"Your "+ petType +" enjoyed the meal.");
happinessLevel+=5;
JOptionPane.showMessageDialog(null,"Your " + petType +"'s happiness level is " + happinessLevel);

}
static void pet(String petType) {
JOptionPane.showMessageDialog(null,"Your "+ petType +" nuzzles into your touch");
happinessLevel+=10;
JOptionPane.showMessageDialog(null,"Your " + petType +"'s happiness level is " + happinessLevel);

}
static void clean(String petType) {
JOptionPane.showMessageDialog(null,"The water was too hot! Your "+ petType +" didn't have fun...");
happinessLevel-=20;
JOptionPane.showMessageDialog(null,"Your " + petType +"'s happiness level is " + happinessLevel);

}
}
