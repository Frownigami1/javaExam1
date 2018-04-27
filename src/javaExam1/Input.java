package javaExam1;

import java.util.Scanner;

public class Input {
	
	static Scanner read = new Scanner(System.in);
	static String input;

	static Compass processInput(Compass compassObj, Map[][] mapObj, Player playerObj) {
			
		boolean invalid = true;
		
		while (invalid == true) {
			if (compassObj.posX == 1 & compassObj.posY == 3) {
				System.out.println("YOU ARE DEAD");
				System.out.println("Try again? (y/n)");
				System.out.print("> ");
				input = read.next();
				input = input.toLowerCase();
				
				if ((input.equals("yes")) | (input.equals("y"))) {
					break;
				} else if ((input.equals("no")) | (input.equals("n"))) {
					System.out.println("");
					System.err.println("Application closed");
					System.exit(1);
				}
			}
			if (compassObj.posX == 2 & compassObj.posY == 0) {
				System.out.println("CONGRATULATIONS - YOU WON!");
				System.out.println("Try again? (y/n)");
				System.out.print("> ");
				input = read.next();
				input = input.toLowerCase();
				
				if ((input.equals("yes")) | (input.equals("y"))) {
					break;
				} else if ((input.equals("no")) | (input.equals("n"))) {
					System.out.println("");
					System.err.println("Application closed");
					System.exit(1);
				}
			}
			
			System.out.println("What would you like to do?");
			System.out.print("> ");
			input = read.next();
			input = input.toLowerCase();
			
			switch(input) {
				case "look":
					System.out.println("Where do you want to look?");
					System.out.print("> ");
					look(compassObj, mapObj);
					break;
				case "go":
					System.out.println("Where do you want to go?");
					System.out.print("> ");
					go(compassObj, mapObj);
					break;
				case "take":
					System.out.println("What do you want to take?");
					System.out.print("> ");
					take(compassObj, mapObj, playerObj);
					break;
				case "use":
					System.out.println("What do you want to use?");
					System.out.print("> ");
					//use();
					break;
				case "attack":
					System.out.println("What do you want to attack?");
					System.out.print("> ");
					//attack();
					break;
				case "jump":
					jump();
					break;
				case "search":
					System.out.println("What do you want to search?");
					System.out.print("> ");
					//search();
					break;
				default:
					System.out.print("That input is not recognized. ");
					break;
				}
			}
		read.close();
		
		return compassObj;
	}
		
	static void look(Compass compassObj, Map[][] mapObj) {
		
		boolean invalid = true;
		input = read.next();
		input = input.toLowerCase();
		
		switch(input) {
			case "watch":
				System.out.println("The device on your arm remains fixed firmly in place. The display reads: " + compassObj.disp);
				invalid = false;
				break;
			case "compass":
				System.out.println("The device on your arm remains fixed firmly in place. The display reads: " + compassObj.disp);
				invalid = false;
				break;
			case "self":
				System.out.println("Save for your clothes, all of your belongings are gone. Despite being a little worse for wear, you are still alive. For now.");
				invalid = false;
				break;
			case "north":
				System.out.println("The fog obscures everything beyond a few metres of you.");
				invalid = false;
				break;
			case "south":
				System.out.println("The fog obscures everything beyond a few metres of you.");
				invalid = false;
				break;
			case "east":
				System.out.println("The fog obscures everything beyond a few metres of you.");
				invalid = false;
				break;
			case "west":
				System.out.println("The fog obscures everything beyond a few metres of you.");
				invalid = false;
				break;
		}
			
		// TILE SPECIFIC ACTIONS
		if (invalid == true) {
			if (compassObj.posX == 0 & compassObj.posY == 0) {
				switch(input) {
					
					default:
						System.out.print("That input is not recognised. ");
						break;
				}
			} else if (compassObj.posX == 0 & compassObj.posY == 1) {
				switch(input) {
				
					default:
						System.out.print("That input is not recognised. ");
						break;
				}	
			} else if (compassObj.posX == 0 & compassObj.posY == 2) {
				switch(input) {
				
					default:
						System.out.print("That input is not recognised. ");
						break;
				}	
			} else if (compassObj.posX == 0 & compassObj.posY == 3) {
				switch(input) {
				
					default:
						System.out.print("That input is not recognised. ");
						break;
				}	
			} else if (compassObj.posX == 0 & compassObj.posY == 4) {
				switch(input) {
				
					default:
						System.out.print("That input is not recognised. ");
						break;
				}	
			} else if (compassObj.posX == 1 & compassObj.posY == 0) {
				switch(input) {
				
					default:
						System.out.print("That input is not recognised. ");
						break;
				}	
			} else if (compassObj.posX == 1 & compassObj.posY == 1) {
				switch(input) {
				
					default:
						System.out.print("That input is not recognised. ");
						break;
				}	
			} else if (compassObj.posX == 1 & compassObj.posY == 2) {
				switch(input) {
				
					default:
						System.out.print("That input is not recognised. ");
						break;
				}	
			} else if (compassObj.posX == 1 & compassObj.posY == 3) {
				switch(input) {
				
					default:
						System.out.print("That input is not recognised. ");
						break;
				}	
			} else if (compassObj.posX == 1 & compassObj.posY == 4) {
				switch(input) {
				
					default:
						System.out.print("That input is not recognised. ");
						break;
				}	
			} else if (compassObj.posX == 2 & compassObj.posY == 0) {
				switch(input) {
				
					default:
						System.out.print("That input is not recognised. ");
						break;
				}	
			} else if (compassObj.posX == 2 & compassObj.posY == 1) {
				switch(input) {
				
					default:
						System.out.print("That input is not recognised. ");
						break;
				}	
			} else if (compassObj.posX == 2 & compassObj.posY == 2) {
				switch(input) {
				
					default:
						System.out.print("That input is not recognised. ");
						break;
				}	
			} else if (compassObj.posX == 2 & compassObj.posY == 3) {
				switch(input) {
				
					default:
						System.out.print("That input is not recognised. ");
						break;
				}	
			} else if (compassObj.posX == 2 & compassObj.posY == 4) {
				switch(input) {
				
					default:
						System.out.print("That input is not recognised. ");
						break;
				}	
			} else if (compassObj.posX == 3 & compassObj.posY == 0) {
				switch(input) {
				
					default:
						System.out.print("That input is not recognised. ");
						break;
				}	
			} else if (compassObj.posX == 3 & compassObj.posY == 1) {
				switch(input) {
				
					default:
						System.out.print("That input is not recognised. ");
						break;
				}	
			} else if (compassObj.posX == 3 & compassObj.posY == 2) {
				switch(input) {
				
					default:
						System.out.print("That input is not recognised. ");
						break;
				}	
			} else if (compassObj.posX == 3 & compassObj.posY == 3) {
				switch(input) {
				
					default:
						System.out.print("That input is not recognised. ");
						break;
				}	
			} else if (compassObj.posX == 3 & compassObj.posY == 4) {
				switch(input) {
				
					default:
						System.out.print("That input is not recognised. ");
						break;
				}	
			} else if (compassObj.posX == 4 & compassObj.posY == 0) {
				switch(input) {
				
					default:
						System.out.print("That input is not recognised. ");
						break;
				}	
			} else if (compassObj.posX == 4 & compassObj.posY == 1) {
				switch(input) {
				
					default:
						System.out.print("That input is not recognised. ");
						break;
				}	
			} else if (compassObj.posX == 4 & compassObj.posY == 2) {
				switch(input) {
				
					default:
						System.out.print("That input is not recognised. ");
						break;
				}	
			} else if (compassObj.posX == 4 & compassObj.posY == 3) {
				switch(input) {
				
					default:
						System.out.print("That input is not recognised. ");
						break;
				}	
			} else if (compassObj.posX == 0 & compassObj.posY == 4) {
				switch(input) {
				
					default:
						System.out.print("That input is not recognised. ");
						break;
				}	
			}	
		}
	}
		
	static void go(Compass compassObj, Map[][] mapObj) {
		
		boolean invalid = true;
		input = read.next();
		input = input.toLowerCase();
		
		switch(input) {
			case "north":
				compassObj.setPos(input);
				System.out.println(mapObj[compassObj.posX][compassObj.posY].flavourText);
				invalid = false;
				break;
			case "south":
				compassObj.setPos(input);
				System.out.println(mapObj[compassObj.posX][compassObj.posY].flavourText);
				invalid = false;
				break;
			case "east":
				compassObj.setPos(input);
				System.out.println(mapObj[compassObj.posX][compassObj.posY].flavourText);
				invalid = false;
				break;
			case "west":
				compassObj.setPos(input);
				System.out.println(mapObj[compassObj.posX][compassObj.posY].flavourText);
				invalid = false;
				break;
		}
		
		// TILE SPECIFIC ACTIONS
		if (invalid == true) {
			if (compassObj.posX == 0 & compassObj.posY == 0) {
				switch(input) {
					
					default:
						System.out.print("That input is not recognised. ");
						break;
				}
			} else if (compassObj.posX == 0 & compassObj.posY == 1) {
				switch(input) {
				
					default:
						System.out.print("That input is not recognised. ");
						break;
				}	
			} else if (compassObj.posX == 0 & compassObj.posY == 2) {
				switch(input) {
				
					default:
						System.out.print("That input is not recognised. ");
						break;
				}	
			} else if (compassObj.posX == 0 & compassObj.posY == 3) {
				switch(input) {
				
					default:
						System.out.print("That input is not recognised. ");
						break;
				}	
			} else if (compassObj.posX == 0 & compassObj.posY == 4) {
				switch(input) {
				
					default:
						System.out.print("That input is not recognised. ");
						break;
				}	
			} else if (compassObj.posX == 1 & compassObj.posY == 0) {
				switch(input) {
				
					default:
						System.out.print("That input is not recognised. ");
						break;
				}	
			} else if (compassObj.posX == 1 & compassObj.posY == 1) {
				switch(input) {
				
					default:
						System.out.print("That input is not recognised. ");
						break;
				}	
			} else if (compassObj.posX == 1 & compassObj.posY == 2) {
				switch(input) {
				
					default:
						System.out.print("That input is not recognised. ");
						break;
				}	
			} else if (compassObj.posX == 1 & compassObj.posY == 3) {
				switch(input) {
				
					default:
						System.out.print("That input is not recognised. ");
						break;
				}	
			} else if (compassObj.posX == 1 & compassObj.posY == 4) {
				switch(input) {
				
					default:
						System.out.print("That input is not recognised. ");
						break;
				}	
			} else if (compassObj.posX == 2 & compassObj.posY == 0) {
				switch(input) {
				
					default:
						System.out.print("That input is not recognised. ");
						break;
				}	
			} else if (compassObj.posX == 2 & compassObj.posY == 1) {
				switch(input) {
				
					default:
						System.out.print("That input is not recognised. ");
						break;
				}	
			} else if (compassObj.posX == 2 & compassObj.posY == 2) {
				switch(input) {
				
					default:
						System.out.print("That input is not recognised. ");
						break;
				}	
			} else if (compassObj.posX == 2 & compassObj.posY == 3) {
				switch(input) {
				
					default:
						System.out.print("That input is not recognised. ");
						break;
				}	
			} else if (compassObj.posX == 2 & compassObj.posY == 4) {
				switch(input) {
				
					default:
						System.out.print("That input is not recognised. ");
						break;
				}	
			} else if (compassObj.posX == 3 & compassObj.posY == 0) {
				switch(input) {
				
					default:
						System.out.print("That input is not recognised. ");
						break;
				}	
			} else if (compassObj.posX == 3 & compassObj.posY == 1) {
				switch(input) {
				
					default:
						System.out.print("That input is not recognised. ");
						break;
				}	
			} else if (compassObj.posX == 3 & compassObj.posY == 2) {
				switch(input) {
				
					default:
						System.out.print("That input is not recognised. ");
						break;
				}	
			} else if (compassObj.posX == 3 & compassObj.posY == 3) {
				switch(input) {
				
					default:
						System.out.print("That input is not recognised. ");
						break;
				}	
			} else if (compassObj.posX == 3 & compassObj.posY == 4) {
				switch(input) {
				
					default:
						System.out.print("That input is not recognised. ");
						break;
				}	
			} else if (compassObj.posX == 4 & compassObj.posY == 0) {
				switch(input) {
				
					default:
						System.out.print("That input is not recognised. ");
						break;
				}	
			} else if (compassObj.posX == 4 & compassObj.posY == 1) {
				switch(input) {
				
					default:
						System.out.print("That input is not recognised. ");
						break;
				}	
			} else if (compassObj.posX == 4 & compassObj.posY == 2) {
				switch(input) {
				
					default:
						System.out.print("That input is not recognised. ");
						break;
				}	
			} else if (compassObj.posX == 4 & compassObj.posY == 3) {
				switch(input) {
				
					default:
						System.out.print("That input is not recognised. ");
						break;
				}	
			} else if (compassObj.posX == 0 & compassObj.posY == 4) {
				switch(input) {
				
					default:
						System.out.print("That input is not recognised. ");
						break;
				}	
			}	
		}
		
		
	}
	
	static void take(Compass compassObj, Map[][] mapObj, Player playerObj) {
		
		boolean invalid = true;
		input = read.next();
		input = input.toLowerCase();
		
		// TILE SPECIFIC ACTIONS
		if (invalid == true) {
			if (compassObj.posX == 0 & compassObj.posY == 0) {
				switch(input) {
					
					default:
						System.out.print("That input is not recognised. ");
						break;
				}
			} else if (compassObj.posX == 0 & compassObj.posY == 1) {
				switch(input) {
				
					default:
						System.out.print("That input is not recognised. ");
						break;
				}	
			} else if (compassObj.posX == 0 & compassObj.posY == 2) {
				switch(input) {
				
					default:
						System.out.print("That input is not recognised. ");
						break;
				}	
			} else if (compassObj.posX == 0 & compassObj.posY == 3) {
				switch(input) {
					case "sword":
						playerObj.hasRustySword = true;
						System.out.println("You take the rusty sword. You tuck it in your belt for the time being.");
						mapObj[0][3].flavourText = "This is where you found the rusty sword, but there's nothing here now.";
						break;
					case "rusty sword":
						playerObj.hasRustySword = true;
						System.out.println("You take the rusty sword. You tuck it in your belt for the time being.");
						mapObj[0][3].flavourText = "This is where you found the rusty sword, but there's nothing here now.";
						break;
					case "blade":
						playerObj.hasRustySword = true;
						System.out.println("You take the rusty sword. You tuck it in your belt for the time being.");
						mapObj[0][3].flavourText = "This is where you found the rusty sword, but there's nothing here now.";
						break;
					case "weapon":
						playerObj.hasRustySword = true;
						System.out.println("You take the rusty sword. You tuck it in your belt for the time being.");
						mapObj[0][3].flavourText = "This is where you found the rusty sword, but there's nothing here now.";
						break;
					default:
						System.out.print("That input is not recognised. ");
						break;
				}	
			} else if (compassObj.posX == 0 & compassObj.posY == 4) {
				switch(input) {
				
					default:
						System.out.print("That input is not recognised. ");
						break;
				}	
			} else if (compassObj.posX == 1 & compassObj.posY == 0) {
				switch(input) {
				
					default:
						System.out.print("That input is not recognised. ");
						break;
				}	
			} else if (compassObj.posX == 1 & compassObj.posY == 1) {
				switch(input) {
				
					default:
						System.out.print("That input is not recognised. ");
						break;
				}	
			} else if (compassObj.posX == 1 & compassObj.posY == 2) {
				switch(input) {
				
					default:
						System.out.print("That input is not recognised. ");
						break;
				}	
			} else if (compassObj.posX == 1 & compassObj.posY == 3) {
				switch(input) {
				
					default:
						System.out.print("That input is not recognised. ");
						break;
				}	
			} else if (compassObj.posX == 1 & compassObj.posY == 4) {
				switch(input) {
				
					default:
						System.out.print("That input is not recognised. ");
						break;
				}	
			} else if (compassObj.posX == 2 & compassObj.posY == 0) {
				switch(input) {
				
					default:
						System.out.print("That input is not recognised. ");
						break;
				}	
			} else if (compassObj.posX == 2 & compassObj.posY == 1) {
				switch(input) {
				
					default:
						System.out.print("That input is not recognised. ");
						break;
				}	
			} else if (compassObj.posX == 2 & compassObj.posY == 2) {
				switch(input) {
				
					default:
						System.out.print("That input is not recognised. ");
						break;
				}	
			} else if (compassObj.posX == 2 & compassObj.posY == 3) {
				switch(input) {
				
					default:
						System.out.print("That input is not recognised. ");
						break;
				}	
			} else if (compassObj.posX == 2 & compassObj.posY == 4) {
				switch(input) {
					case "boat":
						playerObj.hasBoat = true;
						System.out.println("Thankfully, the boat is lightweight and you easily drag it along behind you.");
						mapObj[2][4].flavourText = "You have already taken the boat. There is nothing left for you here.";
						break;
					case "kayak":
						System.out.println("Thankfully, the kayak is lightweight and you easily drag it along behind you.");
						mapObj[2][4].flavourText = "You have already taken the kayak. There is nothing left for you here.";
						playerObj.hasBoat = true;
						break;
					default:
						System.out.print("That input is not recognised. ");
						break;
				}	
			} else if (compassObj.posX == 3 & compassObj.posY == 0) {
				switch(input) {
				
					default:
						System.out.print("That input is not recognised. ");
						break;
				}	
			} else if (compassObj.posX == 3 & compassObj.posY == 1) {
				switch(input) {
					case "sword":
						playerObj.hasRustySword = true;
						System.out.println("With some effort, you manage to pull the sword from its pedestal. Before you can finish admiring it, the trees come to life and begin to move towards you menacingly.");
						mapObj[3][1].flavourText = "The rusty sword sits embedded in the pedestal. A worthwhile trade for sure.";
						break;
					default:
						System.out.print("That input is not recognised. ");
						break;
				}	
			} else if (compassObj.posX == 3 & compassObj.posY == 2) {
				switch(input) {
				
					default:
						System.out.print("That input is not recognised. ");
						break;
				}	
			} else if (compassObj.posX == 3 & compassObj.posY == 3) {
				switch(input) {
				
					default:
						System.out.print("That input is not recognised. ");
						break;
				}	
			} else if (compassObj.posX == 3 & compassObj.posY == 4) {
				switch(input) {
				
					default:
						System.out.print("That input is not recognised. ");
						break;
				}	
			} else if (compassObj.posX == 4 & compassObj.posY == 0) {
				switch(input) {
				
					default:
						System.out.print("That input is not recognised. ");
						break;
				}	
			} else if (compassObj.posX == 4 & compassObj.posY == 1) {
				switch(input) {
				
					default:
						System.out.print("That input is not recognised. ");
						break;
				}	
			} else if (compassObj.posX == 4 & compassObj.posY == 2) {
				switch(input) {
				
					default:
						System.out.print("That input is not recognised. ");
						break;
				}	
			} else if (compassObj.posX == 4 & compassObj.posY == 3) {
				switch(input) {
				
					default:
						System.out.print("That input is not recognised. ");
						break;
				}	
			} else if (compassObj.posX == 0 & compassObj.posY == 4) {
				switch(input) {
				
					default:
						System.out.print("That input is not recognised. ");
						break;
				}	
			}	
		}
		
	}
	
	/*
	static void use() {
		
		
		
	}
	
	static void attack() {
		
		
		
	}
	*/
	
	static void jump() {
		
		System.out.println("You jumped.");
		
	}
	/*
	
	static void search() {
		
		
		
	} 
	*/
}