import java.awt.Color;
public class Paddle extends Sprite {
	final static Color PADDLE_COLOUR = Color.WHITE;
	final static int PADDLE_WIDTH = 10;
	final static int PADDLE_HEIGHT = 100;
	final static int DISTANCE_FROM_EDGE = 40;

	
	public Paddle(Player playerNumber, int panelWidth, int panelHeight){
		 setWidth(PADDLE_WIDTH);
		 setHeight(PADDLE_HEIGHT);
		 setColour(PADDLE_COLOUR);
		 int xPos;
		 
		 if(playerNumber == Player.One) {
			 xPos = DISTANCE_FROM_EDGE;
		 } else {
			 xPos = panelWidth - DISTANCE_FROM_EDGE - getWidth();
		 }
		 
		 setInitialPosition(xPos, panelHeight / 2 - (getHeight() / 2));
		 resetToInitialPosition();
	}

}
