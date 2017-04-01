package go;

import javax.swing.JFrame;

public class AppFrame extends JFrame{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public AppFrame(){
		initUi();
		setVisible(true);
	}

	private void initUi() {
		setTitle("Îå×ÓÆå");
		setSize(506,528);
		setLocationRelativeTo(null);
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		GoPanal  goPanel=new GoPanal();
		add(goPanel);
	}
}
