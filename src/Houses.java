import org.jointheleague.graphical.robot.Robot;

import java.awt.Color;
import java.util.Random;
public class Houses {
	static Robot robo = new Robot("mini");
	static Houses program = new Houses();

 
	public static void main(String[] args) {
		
		
		robo.moveTo(0, 940);
		Robot.setWindowColor(Color.BLACK);
		robo.penDown();
		robo.setSpeed(10);
		
	
		for(int i=0;i<10;i++){
			int random = new Random().nextInt(3);
			String size="";
			if (random==0){
				size ="small";
			}
			else if(random==1){
				size="medium";
			}
			else if(random==2){
				size="large";
			}
			program.makeHouse(size, Color.BLUE);
		}
	}

	void makeHouse(String size, Color color){
		
		robo.setPenColor(color);
		
		if(size.equalsIgnoreCase("small")){
			int height = 60;
			robo.move(height);
			program.drawPointyRoof();
			robo.move(height);
			robo.turn(-90);
			
		}
		else if(size.equalsIgnoreCase("medium")){
			int height = 120;
			robo.move(height);
			program.drawPointyRoof();
			robo.move(height);
			robo.turn(-90);
		
		}
		else if(size.equalsIgnoreCase("large")){
			int height = 250;
			robo.move(height);
			program.drawFlatRoof();
			robo.move(height);
			robo.turn(-90);
			
		}
		robo.setPenColor(Color.green);
		robo.move(20);
		robo.turn(-90);
		
	}
	void drawPointyRoof(){
		robo.turn(45);
		robo.move(20);
		robo.turn(90);
		robo.move(20);
		robo.turn(45);	
	}
	
	void drawFlatRoof(){
		robo.turn(90);
		robo.move(20);
		robo.turn(90);

	}

}
