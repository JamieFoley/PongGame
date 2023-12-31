import java.awt.Color;

public class Ball extends Sprite {
	final static Color BALL_COLOUR = Color.WHITE;
	final static int BALL_WIDTH = 25;
	final static int BALL_HEIGHT = 25;
	
	public Ball(int panelWidth, int panelHeight) {
		setColour(BALL_COLOUR);
		setWidth(BALL_WIDTH);
		setHeight(BALL_HEIGHT);
		setInitialPosition(panelWidth/ 2 - (getWidth()/ 2), panelHeight / 2 - (getHeight() /2));
		resetToInitialPosition();
	}
}
