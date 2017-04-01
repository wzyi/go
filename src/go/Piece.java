package go;

import java.awt.Color;
import java.awt.Graphics;

public class Piece {

	int size=30;
	int x;
	int y;
	
	boolean isWhite=true;

	public Piece(int x, int y, boolean isWhite) {
		super();
		this.x = x-size/2;
		this.y = y-size/2;
		this.isWhite = isWhite;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public boolean isWhite() {
		return isWhite;
	}
	public void draw(Graphics g){
		g.setColor(isWhite? Color.WHITE:Color.BLACK);
		
		g.fillOval(x,y,size,size);
	}
}
