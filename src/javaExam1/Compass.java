package javaExam1;

public class Compass {

	int seekX = 2;
	int seekY = 0;
	int posX = 2;
	int posY = 3;
	
	double disp = Math.sqrt(((seekX - posX)*(seekX - posX)) + ((seekY - posY)*(seekY - posY)));
	
	public void setPos(String direction) {
		
		switch(direction) {
			case "north":
				posY--;
				if (posY < 0) {
					posY = 4;
				}
				disp = Math.sqrt(((seekX - posX)*(seekX - posX)) + ((seekY - posY)*(seekY - posY)));
				break;
			case "south":
				posY++;
				if (posY > 4) {
					posY = 0;
				}
				disp = Math.sqrt(((seekX - posX)*(seekX - posX)) + ((seekY - posY)*(seekY - posY)));
				break;
			case "east":
				posX++;
				if (posX > 4) {
					posX = 0;
				}
				disp = Math.sqrt(((seekX - posX)*(seekX - posX)) + ((seekY - posY)*(seekY - posY)));
				break;
			case "west":
				posX--;
				if (posX < 0) {
					posX = 4;
				}
				disp = Math.sqrt(((seekX - posX)*(seekX - posX)) + ((seekY - posY)*(seekY - posY)));
				break;
			default:
				break;
		}	
	}
	
	public void setSeek() {
		
	}
	
}