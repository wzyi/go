package go;

import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class GoPanal extends JPanel{

	BufferedImage image;
	private List<Piece> piece = new ArrayList<>();
	
	public GoPanal(){
		try {
			image = ImageIO.read(new File("qipan"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//×¢²áÒ»¸ö¼àÌýÆ÷
		addMouseListener(new PanelListener());
	}
public  void paint(Graphics g){
		super.paint(g);
		
		g.drawImage(image, 0,0,getWidth(),getHeight(),null);
		
		//»­Æå×Ó
		for(Piece t:piece){
			t.draw(g);
		}
//		System.out.printf("w=%d,h=%d\n",getWidth(),getHeight());
//		g.drawLine(0, 0, 500, 500);
	}

class PanelListener extends MouseAdapter{
	
	boolean isWhite = true;
	
	public void mouseClicked(MouseEvent e){
		super.mouseClicked(e);
		
		System.out.printf("%d,%d\n",e.getX(),e.getY());
		
		Piece p = new Piece(e.getX(),e.getY(),isWhite);
		piece.add(p);
		isWhite = !isWhite;
		repaint();
		
	}
}
}
