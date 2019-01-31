package charAt_scanners_optionDialogs;

import javax.swing.JOptionPane;

public class ChooseYourOwnAdventure {
public static void main(String[] args) {
	
	JOptionPane.showMessageDialog(null, "The story begins with the"
			+ " birth of a new hero!", "Choose your Adventure",JOptionPane.DEFAULT_OPTION);
String heroName = JOptionPane.showInputDialog(null, "This hero was named", "Start your Adventure",
		JOptionPane.PLAIN_MESSAGE);
int gender = JOptionPane.showOptionDialog(null, heroName + " is a ", "Gender Selection", 0, JOptionPane.INFORMATION_MESSAGE, 
			null, new String[] {"BOY","GIRL", "THEY"}, null);


if(gender == 1) {
JOptionPane.showMessageDialog(null, heroName + " lived in poverty with her family since a young age."
		+  "\n It was practically decided since she was born that"
		+ " \n as soon as she could, she would start working to help "
		+ "her family.", "Early Life", JOptionPane.DEFAULT_OPTION);
JOptionPane.showMessageDialog(null, "One day while on her way to find work, \n"
		+" she encountered a very old beggar.");


int beggar = JOptionPane.showOptionDialog(null, "The beggar asks for money.", "THE BEGGAR", 0, 
		JOptionPane.INFORMATION_MESSAGE, null, new String[] {"Give all of what little you have","Lie and tell "
				+ "the old man you have nothing to give"}, null);
if (beggar==0) {
JOptionPane.showMessageDialog(null, "He happily accepts the change you give him.", "THE BEGGAR", 
		JOptionPane.DEFAULT_OPTION);
JOptionPane.showMessageDialog(null, "As he looks at you, he speaks \n"
		+ "''Despite not having enough for yourself, you still choose to give! \n"
		+ "I am in awe of your generosity.''\n"
		+ "You tell him you are looking for work and he says he can help you!", "THE BEGGAR", JOptionPane.DEFAULT_OPTION);


int joboffer = JOptionPane.showOptionDialog(null, "The beggar rips off his rags to reveal "
		+ "himself as a sorcerer! "
		+ "\n ''Indeed, I am the sorcerer of the forest! After seeing your \n"
		+ "kindess I extend my own! Will you join me as my apprentice?", "THE JOB", 0, 
		JOptionPane.INFORMATION_MESSAGE, null, new String[] {"Become the sorcerer's \n apprentice","Refuse "
				+ "the the sorcerer and \n look for work elsewhere"}, null);
	if (joboffer == 0) {
		JOptionPane.showMessageDialog(null, "You take the sorcerer's hand and he brings you to his tower where \n "
				+ "he trains you to be a strong sorcerer!", "THE APPRENTICE",JOptionPane.DEFAULT_OPTION);
		JOptionPane.showMessageDialog(null, "With your new job, you're able to sustain your family", "THE APPRENTICE",JOptionPane.DEFAULT_OPTION);
		JOptionPane.showMessageDialog(null, "With your newfound wealth and fame as a \n renowned sorcerer, you're forever happy!"
				,"THE END?", JOptionPane.DEFAULT_OPTION);
		JOptionPane.showMessageDialog(null, "THE END?\n ENDING 3 ACHEIVED", "THE END", JOptionPane.DEFAULT_OPTION);
	}
	if (joboffer==1) {
		JOptionPane.showMessageDialog(null, "Xanith the sorcerer's jaw drops. \n He watches, wide eyed as you walk away to \n"
				+ "find work somewhere else", "THE REFUSAL",JOptionPane.DEFAULT_OPTION);
		JOptionPane.showMessageDialog(null, "You find work in a bakery, and work hard over the years. \n"
				+ "When the owner passes away, he gives you the bakery! You continue to\n"
				+ "work there through the rest of your days. "
				, "THE END?", JOptionPane.DEFAULT_OPTION);
		JOptionPane.showMessageDialog(null, "THE END?\n ENDING 4 ACHEIVED", "THE END", JOptionPane.DEFAULT_OPTION);}
		if (joboffer == 0) {
			JOptionPane.showMessageDialog(null, "You take the sorcerer's hand and he brings you to his tower where \n "
					+ "he trains you to be a strong sorcerer!");
			JOptionPane.showMessageDialog(null, "With your new job, you're able to sustain your family");
			JOptionPane.showMessageDialog(null, "With your newfound wealth and fame as a \n renowned sorcerer, you're forever happy!"
					,"THE END?", JOptionPane.DEFAULT_OPTION);
			JOptionPane.showMessageDialog(null, "THE END?\n ENDING 3 ACHEIVED", "THE END", JOptionPane.DEFAULT_OPTION);
		}
	}

if (beggar ==1) {
	JOptionPane.showMessageDialog(null, "The beggar rips off his rags to reveal "
		+ "himself as a sorcerer! ", "THE BEGGAR", JOptionPane.DEFAULT_OPTION);
	JOptionPane.showMessageDialog(null, "The sorcerer stands above you in rage! \n"
			+ "''HOW DARE YOU MOCK AND LIE TO XANITH THE FOREST SORCERER!'', he yells at you! \n"
			+ "Xanith casts arcane missiles, hitting you in the chest! ", "THE MISSILES", JOptionPane.DEFAULT_OPTION
			);
	
	
	
	int arcanemissiles = JOptionPane.showOptionDialog(null, "The sorcerer prepares his second round of missiles!", "THE MISSILES", 0, 
			JOptionPane.INFORMATION_MESSAGE, null, new String[] {"Try and dodge the missiles","Punch Xanith"
					}, null);
	
	if (arcanemissiles==0) {
		JOptionPane.showMessageDialog(null, "Although you try and dodge, the missiles seek you!\n"
				+ " You get hit with another round of missiles, knocking you out!", "THE MISSILES", JOptionPane.DEFAULT_OPTION);
		JOptionPane.showMessageDialog(null, "When you wake up, all your stuff is gone! \n"
				+ "You head home with empty pockets...", "THE END?", JOptionPane.DEFAULT_OPTION);
		JOptionPane.showMessageDialog(null, "THE END?\n ENDING 1 ACHEIVED", "THE END", JOptionPane.DEFAULT_OPTION);
		
	}
	
	if (arcanemissiles==1) {
		JOptionPane.showMessageDialog(null, "You punch Xanith in the gut! Xanith falls to \n"
				+ "the ground, but quickly get backs up! Angrily he casts\n"
				+ "a smolering fireball spell!", "THE FIREBALL", JOptionPane.DEFAULT_OPTION);
		JOptionPane.showMessageDialog(null, "The fireball hits you burning you to ashes!", "THE FIREBALL",JOptionPane.DEFAULT_OPTION);
	JOptionPane.showMessageDialog(null, "Maybe pissing off that sorcerer was a bad idea...", "THE END?", 
			JOptionPane.DEFAULT_OPTION);
	JOptionPane.showMessageDialog(null, "THE END?\n ENDING 2 ACHEIVED", "THE END", JOptionPane.DEFAULT_OPTION);
	}
}
}



if(gender == 0) {
JOptionPane.showMessageDialog(null, heroName + " lived in poverty with his family since a young age."
		+  "\n It was practically decided since he was born that"
		+ " \n as soon as he could, he would start working to help "
		+ "his family.", "Early Life", JOptionPane.DEFAULT_OPTION);
JOptionPane.showMessageDialog(null, "One day while on his way to find work, \n"
		+" he encountered a very old beggar.");


int beggar = JOptionPane.showOptionDialog(null, "The beggar asks for money.", "THE BEGGAR", 0, 
		JOptionPane.INFORMATION_MESSAGE, null, new String[] {"Give all of what little you have","Lie and tell "
				+ "the old man you have nothing to give"}, null);
if (beggar==0) {
JOptionPane.showMessageDialog(null, "He happily accepts the change you give him.", "THE BEGGAR", 
		JOptionPane.DEFAULT_OPTION);
JOptionPane.showMessageDialog(null, "As he looks at you, he speaks \n"
		+ "''Despite not having enough for yourself, you still choose to give! \n"
		+ "I am in awe of your generosity.''\n"
		+ "You tell him you are looking for work and he says he can help you!", "THE BEGGAR", JOptionPane.DEFAULT_OPTION);


int joboffer = JOptionPane.showOptionDialog(null, "The beggar rips off his rags to reveal "
		+ "himself as a sorcerer! "
		+ "\n ''Indeed, I am the sorcerer of the forest! After seeing your \n"
		+ "kindess I extend my own! Will you join me as my apprentice?", "THE JOB", 0, 
		JOptionPane.INFORMATION_MESSAGE, null, new String[] {"Become the sorcerer's \n apprentice","Refuse "
				+ "the the sorcerer and \n look for work elsewhere"}, null);
if (joboffer==1) {
	JOptionPane.showMessageDialog(null, "Xanith the sorcerer's jaw drops. \n He watches, wide eyed as you walk away to \n"
			+ "find work somewhere else", "THE REFUSAL",JOptionPane.DEFAULT_OPTION);
	JOptionPane.showMessageDialog(null, "You find work in a bakery, and work hard over the years. \n"
			+ "When the owner passes away, he gives you the bakery! You continue to\n"
			+ "work there through the rest of your days. "
			, "THE END?", JOptionPane.DEFAULT_OPTION);
	if (joboffer==1) {
		JOptionPane.showMessageDialog(null, "Xanith the sorcerer's jaw drops. \n He watches, wide eyed as you walk away to \n"
				+ "find work somewhere else", "THE REFUSAL",JOptionPane.DEFAULT_OPTION);
		JOptionPane.showMessageDialog(null, "You find work in a bakery, and work hard over the years. \n"
				+ "When the owner passes away, he gives you the bakery! You continue to\n"
				+ "work there through the rest of your days. "
				, "THE END?", JOptionPane.DEFAULT_OPTION);
		JOptionPane.showMessageDialog(null, "THE END?\n ENDING 4 ACHEIVED", "THE END", JOptionPane.DEFAULT_OPTION);}
if (joboffer == 0) {
	JOptionPane.showMessageDialog(null, "You take the sorcerer's hand and he brings you to his tower where \n "
			+ "he trains you to be a strong sorcerer!", "THE APPRENTICE",JOptionPane.DEFAULT_OPTION);
	JOptionPane.showMessageDialog(null, "With your new job, you're able to sustain your family", "THE APPRENTICE",JOptionPane.DEFAULT_OPTION);
	JOptionPane.showMessageDialog(null, "With your newfound wealth and fame as a \n renowned sorcerer, you're forever happy!"
			,"THE END?", JOptionPane.DEFAULT_OPTION);
	JOptionPane.showMessageDialog(null, "THE END?\n ENDING 3 ACHEIVED", "THE END", JOptionPane.DEFAULT_OPTION);
}
}
if (beggar ==1) {
	JOptionPane.showMessageDialog(null, "The beggar rips off his rags to reveal "
		+ "himself as a sorcerer! ", "THE BEGGAR", JOptionPane.DEFAULT_OPTION);
	JOptionPane.showMessageDialog(null, "The sorcerer stands above you in rage! \n"
			+ "''HOW DARE YOU MOCK AND LIE TO XANITH THE FOREST SORCERER!'', he yells at you! \n"
			+ "Xanith casts arcane missiles, hitting you in the chest! ", "THE MISSILES", JOptionPane.DEFAULT_OPTION
			);
	
	
	
	int arcanemissiles = JOptionPane.showOptionDialog(null, "The sorcerer prepares his second round of missiles!", "THE MISSILES", 0, 
			JOptionPane.INFORMATION_MESSAGE, null, new String[] {"Try and dodge the missiles","Punch Xanith"
					}, null);
	
	if (arcanemissiles==0) {
		JOptionPane.showMessageDialog(null, "Although you try and dodge, the missiles seek you!\n"
				+ " You get hit with another round of missiles, knocking you out!", "THE MISSILES", JOptionPane.DEFAULT_OPTION);
		JOptionPane.showMessageDialog(null, "When you wake up, all your stuff is gone! \n"
				+ "You head home with empty pockets...", "THE END?", JOptionPane.DEFAULT_OPTION);
		JOptionPane.showMessageDialog(null, "THE END?\n ENDING 1 ACHEIVED", "THE END", JOptionPane.DEFAULT_OPTION);
		
	}
	
	if (arcanemissiles==1) {
		JOptionPane.showMessageDialog(null, "You punch Xanith in the gut! Xanith falls to \n"
				+ "the ground, but quickly get backs up! Angrily he casts\n"
				+ "a smolering fireball spell!", "THE FIREBALL", JOptionPane.DEFAULT_OPTION);
		JOptionPane.showMessageDialog(null, "The fireball hits you burning you to ashes!", "THE FIREBALL",JOptionPane.DEFAULT_OPTION);
	JOptionPane.showMessageDialog(null, "Maybe pissing off that sorcerer was a bad idea...", "THE END?", 
			JOptionPane.DEFAULT_OPTION);
	JOptionPane.showMessageDialog(null, "THE END?\n ENDING 2 ACHEIVED", "THE END", JOptionPane.DEFAULT_OPTION);
	}
}
}


}
if(gender == 2) {
JOptionPane.showMessageDialog(null, heroName + " lived in poverty with their family since a young age."
		+  "\n It was practically decided since they was born that"
		+ " \n as soon as they could, they would start working to help "
		+ "their family.", "Early Life", JOptionPane.DEFAULT_OPTION);
JOptionPane.showMessageDialog(null, "One day while on their way to find work, \n"
		+" they encountered a very old beggar.");


int beggar = JOptionPane.showOptionDialog(null, "The beggar asks for money.", "THE BEGGAR", 0, 
		JOptionPane.INFORMATION_MESSAGE, null, new String[] {"Give all of what little you have","Lie and tell "
				+ "the old man you have nothing to give"}, null);
if (beggar==0) {
JOptionPane.showMessageDialog(null, "He happily accepts the change you give him.", "THE BEGGAR", 
		JOptionPane.DEFAULT_OPTION);
JOptionPane.showMessageDialog(null, "As he looks at you, he speaks \n"
		+ "''Despite not having enough for yourself, you still choose to give! \n"
		+ "I am in awe of your generosity.''\n"
		+ "You tell him you are looking for work and he says he can help you!", "THE BEGGAR", JOptionPane.DEFAULT_OPTION);


int joboffer = JOptionPane.showOptionDialog(null, "The beggar rips off his rags to reveal "
		+ "himself as a sorcerer! "
		+ "\n ''Indeed, I am the sorcerer of the forest! After seeing your \n"
		+ "kindess I extend my own! Will you join me as my apprentice?", "THE JOB", 0, 
		JOptionPane.INFORMATION_MESSAGE, null, new String[] {"Become the sorcerer's \n apprentice","Refuse "
				+ "the the sorcerer and \n look for work elsewhere"}, null);
if (joboffer==1) {
	JOptionPane.showMessageDialog(null, "Xanith the sorcerer's jaw drops. \n He watches, wide eyed as you walk away to \n"
			+ "find work somewhere else", "THE REFUSAL",JOptionPane.DEFAULT_OPTION);
	JOptionPane.showMessageDialog(null, "You find work in a bakery, and work hard over the years. \n"
			+ "When the owner passes away, he gives you the bakery! You continue to\n"
			+ "work there through the rest of your days. "
			, "THE END?", JOptionPane.DEFAULT_OPTION);
	JOptionPane.showMessageDialog(null, "THE END?\n ENDING 4 ACHEIVED", "THE END", JOptionPane.DEFAULT_OPTION);}
if (joboffer == 0) {
	JOptionPane.showMessageDialog(null, "You take the sorcerer's hand and he brings you to his tower where \n "
			+ "he trains you to be a strong sorcerer!", "THE APPRENTICE",JOptionPane.DEFAULT_OPTION);
	JOptionPane.showMessageDialog(null, "With your new job, you're able to sustain your family", "THE APPRENTICE",JOptionPane.DEFAULT_OPTION);
	JOptionPane.showMessageDialog(null, "With your newfound wealth and fame as a \n renowned sorcerer, you're forever happy!"
			,"THE END?", JOptionPane.DEFAULT_OPTION);
	JOptionPane.showMessageDialog(null, "THE END?\n ENDING 3 ACHEIVED", "THE END", JOptionPane.DEFAULT_OPTION);
}
}
if (beggar ==1) {
	JOptionPane.showMessageDialog(null, "The beggar rips off his rags to reveal "
		+ "himself as a sorcerer! ", "THE BEGGAR", JOptionPane.DEFAULT_OPTION);
	JOptionPane.showMessageDialog(null, "The sorcerer stands above you in rage! \n"
			+ "''HOW DARE YOU MOCK AND LIE TO XANITH THE FOREST SORCERER!'', he yells at you! \n"
			+ "Xanith casts arcane missiles, hitting you in the chest! ", "THE MISSILES", JOptionPane.DEFAULT_OPTION
			);
	
	
	
	int arcanemissiles = JOptionPane.showOptionDialog(null, "The sorcerer prepares his second round of missiles!", "THE MISSILES", 0, 
			JOptionPane.INFORMATION_MESSAGE, null, new String[] {"Try and dodge the missiles","Punch Xanith"
					}, null);
	
	if (arcanemissiles==0) {
		JOptionPane.showMessageDialog(null, "Although you try and dodge, the missiles seek you!\n"
				+ " You get hit with another round of missiles, knocking you out!", "THE MISSILES", JOptionPane.DEFAULT_OPTION);
		JOptionPane.showMessageDialog(null, "When you wake up, all your stuff is gone! \n"
				+ "You head home with empty pockets...", "THE END?", JOptionPane.DEFAULT_OPTION);
		JOptionPane.showMessageDialog(null, "THE END?\n ENDING 1 ACHEIVED", "THE END", JOptionPane.DEFAULT_OPTION);
		
	}
	
	if (arcanemissiles==1) {
		JOptionPane.showMessageDialog(null, "You punch Xanith in the gut! Xanith falls to \n"
				+ "the ground, but quickly get backs up! Angrily he casts\n"
				+ "a smolering fireball spell!", "THE FIREBALL", JOptionPane.DEFAULT_OPTION);
		JOptionPane.showMessageDialog(null, "The fireball hits you burning you to ashes!", "THE FIREBALL",JOptionPane.DEFAULT_OPTION);
	JOptionPane.showMessageDialog(null, "Maybe pissing off that sorcerer was a bad idea...", "THE END?", 
			JOptionPane.DEFAULT_OPTION);
	JOptionPane.showMessageDialog(null, "THE END?\n ENDING 2 ACHEIVED", "THE END", JOptionPane.DEFAULT_OPTION);
	}
}
}
	
	
	
	
	
}
}
