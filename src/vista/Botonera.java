package vista;

import javax.swing.JPanel;

import controlador.MyActionListener;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.BoxLayout;
import javax.swing.JButton;

public class Botonera extends JPanel {

	public JButton botones[][];
	int anchoPanel=150,altoPanel=150;
	int ladoBoton=100;	
	/**
	 * Create the panel.
	 */
	public Botonera(int x,int y) {
		setLayout(null);
		this.setBounds(x, y, this.anchoPanel, this.altoPanel);
		iniciarBotonera();
	}
	private void iniciarBotonera(){
		this.botones = new JButton[3][3];
		int x=0,y=0;
		for (int i = 0; i < this.botones.length; i++) {
			for (int j = 0; j < this.botones[i].length; j++) {
				this.botones[i][j] = new JButton();
				this.botones[i][j].setName(String.valueOf(i)+String.valueOf(j));
				this.botones[i][j].setBounds(x, y, this.ladoBoton, this.ladoBoton);	
				this.botones[i][j].setBackground(Color.DARK_GRAY);
				this.botones[i][j].setForeground(Color.ORANGE);
				this.botones[i][j].setFont(new Font("Comic Sans MS", Font.BOLD, 30));
				int a=i,b=j;
				this.botones[i][j].addMouseListener(new MouseAdapter() {
		            public void mouseEntered(MouseEvent arg0) {
		            	 botones[a][b].setBackground(Color.LIGHT_GRAY);
		            }
		            public void mouseExited(MouseEvent e) {
		            	 botones[a][b].setBackground(Color.DARK_GRAY);
		            }
		        }); 
				this.add(this.botones[i][j]);
				x+=this.ladoBoton;
			}
			x=0;
			y+=this.ladoBoton;
		}
	}
}