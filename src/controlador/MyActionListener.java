package controlador;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;

public class MyActionListener implements ActionListener, MouseListener {

	private ParaTresNRayaUI paraTresNRayaUI;

	public MyActionListener(ParaTresNRayaUI paraTresNRayaUI) {
		super();
		this.paraTresNRayaUI = paraTresNRayaUI;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// pone el action listener dependiendo del boton que sea
		if (((JButton) e.getSource()).getName() == "btnCerrar") {
			System.exit(0);
		} else if (((JButton) e.getSource()).getName() == "btnReboot") {
			int[][] tableroVacio = { { 0, 0, 0 }, { 0, 1, 0 }, { 0, 0, 0 } };
			paraTresNRayaUI.rebootGame(tableroVacio);
		} else {
			paraTresNRayaUI.pseudoMain(((JButton) e.getSource()).getName());
		}
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		if(!paraTresNRayaUI.isCerrarBotonera())
			((JButton) e.getSource()).setBackground(Color.LIGHT_GRAY);
	}

	@Override
	public void mouseExited(MouseEvent e) {
		if(!paraTresNRayaUI.isCerrarBotonera())
			((JButton) e.getSource()).setBackground(Color.DARK_GRAY);
	}

	@Override
	public void mousePressed(MouseEvent e) {
		((JButton) e.getSource()).setBackground(Color.BLACK);
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		
		
	}
	
	
	

}