import java.awt.Color;
import java.awt.Rectangle;

public class Sprite {
	private int xPosition, yPosition, xVelocity, yVelocity, width, height;
	private Color colour;
	private int initialXPosition, initialYPosition;
	
	public int getxPosition() {
		return this.xPosition;
	}
	
	public void setxPosition(int xPosition) {
		this.xPosition = xPosition;
	}
	
	public int getyPosition() {
		return this.yPosition;
	}
	
	public void setyPosition(int yPosition) {
		this.yPosition = yPosition;
	}
	
	public int getxVelocity() {
		return this.xVelocity;
	}
	
	public void setxVelocity(int xVelocity) {
		this.xVelocity = xVelocity;
	}
	
	public int getyVelocity() {
		return this.yVelocity;
	}
	
	public void setyVelocity(int yVelocity) {
		this.yVelocity = yVelocity;
	}
	
	public int getWidth() {
		return this.width;
	}
	
	public void setWidth(int width) {
		this.width = width;
	}
	
	public int getHeight() {
		return this.height;
	}
	
	public void setHeight(int height) {
		this.height = height;
	}
	
	public Color getColour() {
		return this.colour; 
	}
	
	public void setColour(Color colour) {
		this.colour = colour;
	}
	
	public void setxPosition(int newX, int panelWidth) {
		xPosition = newX;
		
		if(xPosition < 0) {
			xPosition = 0;
		} else if(xPosition + width > panelWidth) {
			xPosition = panelWidth - width;
		}
	}
	
	public void setyPosition(int newY, int panelHeight) {
		yPosition = newY;
		if(yPosition < 0) {
			yPosition = 0;
		} else if(yPosition + height > panelHeight) {
			yPosition = panelHeight - height;
		}
	}
	
	public void setInitialPosition(int initialXPosition, int initialYPosition) {
		this.initialXPosition = initialXPosition;
		this.initialYPosition = initialYPosition;
	}
	
	public void resetToInitialPosition() {
		setxPosition(initialXPosition);
		setyPosition(initialYPosition);
	}
	
	public Rectangle getRectangle() {
		return new Rectangle(getxPosition(), getyPosition(), getWidth(), getHeight());
	}
	
}
