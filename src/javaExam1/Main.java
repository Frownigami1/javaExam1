package javaExam1;

public class Main {

	public static void main(String[] args) {
		
		Map[][] mapObj = new Map[5][5];
		Compass compassObj = new Compass();
		Player playerObj = new Player();
		String brk = System.getProperty("line.separator");
		
		mapObj[0][0] = new Map();
		mapObj[0][0].feature = "";
		mapObj[0][0].flavourText = "The fog creeps in closer to the point where you can barely see your hand in front of your face. If there is anything here. You haven't found it.";
		
		// Crypt tile
		mapObj[0][1] = new Map();
		mapObj[0][1].feature = "";
		mapObj[0][1].flavourText = "You come across a small graveyard. The entrance to a crypt lies before you. You see its steps leading down into the darkness.";
		
		mapObj[0][2] = new Map();
		mapObj[0][2].feature = "";
		mapObj[0][2].flavourText = "A deep bog stretches before you to the West. You spot the edge of an island on the other side.";
		
		mapObj[0][3] = new Map();
		mapObj[0][3].feature = "";
		mapObj[0][3].flavourText = "You come across an old, rusty sword lying in the grass. Its edges are dull and wouldn't be much use in a fight.";
		
		mapObj[0][4] = new Map();
		mapObj[0][4].feature = "";
		mapObj[0][4].flavourText = "As you wander, a loud, monstrous roar echoes from the East. Something is close.";
		
		mapObj[1][0] = new Map();
		mapObj[1][0].feature = "";
		mapObj[1][0].flavourText = "Shambling footsteps and quiet moans can be heard from the South. The sound unsettles you.";
		
		mapObj[1][1] = new Map();
		mapObj[1][1].feature = "";
		mapObj[1][1].flavourText = "Through the foliage, you spot a clearing. Three zombies wander around aimlessly.";
		
		mapObj[1][2] = new Map();
		mapObj[1][2].feature = "";
		mapObj[1][2].flavourText = "You come upon a crumbling statue of a long-forgotten god. A peaceful sensation washes over you.";
		
		mapObj[1][3] = new Map();
		mapObj[1][3].feature = "";
		mapObj[1][3].flavourText = "You unwittingly step into a pool of quicksand and begin to sink. As you sink below the surface, you feel your life slipping away.";
		
		// Monster cave tile
		mapObj[1][4] = new Map();
		mapObj[1][4].feature = "";
		mapObj[1][4].flavourText = "You see an entrance to a cave. Inside you see a large, horned beast guarding a glowing, spherical orb.";
		
		// Escape portal tile
		mapObj[2][0] = new Map();
		mapObj[2][0].feature = "";
		//mapObj[2][0].flavourText = "Before you stands a deactivated portal. Four spherical indentations are worked into the stone. Each seems built to hold some kind of orb.";
		mapObj[2][0].flavourText = "Before you stands a portal. You step through he threshold and escape from the Barren Moor.";
		
		mapObj[2][1] = new Map();
		mapObj[2][1].feature = "";
		mapObj[2][1].flavourText = "You almost trip over a man's corpse lying in your path. He seems only recently deceased. One of his arms is outstretched, pointing to the North.";
		
		// House tile
		mapObj[2][2] = new Map();
		mapObj[2][2].feature = "";
		mapObj[2][2].flavourText = "You push through the fog and find yourself standing before a run-down house. The windows have been boarded up and the door features a heavy iron lock.";
		
		// Starting tile
		mapObj[2][3] = new Map();
		mapObj[2][3].feature = "";
		mapObj[2][3].flavourText = "You find yourself back in the dingy clearing where you started.";
		
		mapObj[2][4] = new Map();
		mapObj[2][4].feature = "";
		mapObj[2][4].flavourText = "You find an old kayak lying in the open. It's seen better days, but should still float just fine.";
		
		mapObj[3][0] = new Map();
		mapObj[3][0].feature = "";
		mapObj[3][0].flavourText = "The silence here is suffocating. You think it best to move on.";
		
		mapObj[3][1] = new Map();
		mapObj[3][1].feature = "";
		mapObj[3][1].flavourText = "A stone pedestal sits in a clearing with a masterfully-crafted, razor-sharp sword embedded in it.";
		
		mapObj[3][2] = new Map();
		mapObj[3][2].feature = "";
		mapObj[3][2].flavourText = "A deep bog stretches before you to the East. You spot the edge of an island on the other side.";
		
		mapObj[3][3] = new Map();
		mapObj[3][3].feature = "";
		mapObj[3][3].flavourText = "A horrible smell creeps into your nostrils. Something nearby stinks.";
		
		mapObj[3][4] = new Map();
		mapObj[3][4].feature = "";
		mapObj[3][4].flavourText = "A single tree stands out from its dead cousins, still alive and beautiful. Several juicy green fruits hang from its branches within reach.";
		
		mapObj[4][0] = new Map();
		mapObj[4][0].feature = "";
		mapObj[4][0].flavourText = "There is nothing here.";
		
		mapObj[4][1] = new Map();
		mapObj[4][1].feature = "";
		mapObj[4][1].flavourText = "A deep bog stretches before you to the South. You spot the edge of an island on the other side.";
		
		mapObj[4][2] = new Map();
		mapObj[4][2].feature = "";
		mapObj[4][2].flavourText = ("A single, large tree with a carved face is all you find on the island. Suddenly, it speaks to you:" + brk + "'Answer my riddle and you shall have your prize. Answer incorrectly and you shall die. You have three guesses.'" + brk + "'To all things and men I appertain, and yet by some am shunned and disdained.'" + brk + "'Fondle me and ogle me til you're insane, but no blow can harm me, cause me pain.'" + brk + "'Children delight in me, elders take fright. Fair maids rejoice and spin.'" + brk + "'Cry and I weep, yawn and I sleep. Smile, and I too shall grin.'" + brk + "'What am I?'");
		
		mapObj[4][3] = new Map();
		mapObj[4][3].feature = "";
		mapObj[4][3].flavourText = "A deep bog stretches before you to the North. You spot the edge of an island on the other side.";
		
		mapObj[4][4] = new Map();
		mapObj[4][4].feature = "";
		mapObj[4][4].flavourText = "A delightful, fruity scent catches the attention of your noise. It's coming from the West.";
		
		for (boolean cont = true; cont == true;) {
			compassObj.posX = 2;
			compassObj.posY = 3;
			System.out.println("");
			
			// Game start
			System.out.println("<------------------------------------------------------------ THE ADVENTURE OF THE BARREN MOOR ------------------------------------------------------------>");
			System.out.println("");
			System.out.println("TUTORIAL: Communicate your intents to the program with the keywords: 'look', 'go' and 'take'");
			System.out.println("You will then be prompted for further details. Example: 'go' -> 'north'.");
			System.out.println("");
			System.out.println("You awake in a featureless, grey swamp choked with fog. Mire and bog stretch into the mist all around you, while sickened, disease-ridden trees tangle above");
			System.out.println("- allowing only the faintest sunlight to trickle through. A sense of dread washes over you. You must get out of here before night falls and what little ");
			System.out.println("light you have fades. You notice a small device strapped to your arm - similar to a digital watch. There are no noticeable buttons or controls on the watch.");
			System.out.println("The display reads: '3'.");
			System.out.println("");
			compassObj = Input.processInput(compassObj, mapObj, playerObj);
		
		}
		
		// Game end
	}
	
}