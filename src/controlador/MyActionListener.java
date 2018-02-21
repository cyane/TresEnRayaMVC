package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class MyActionListener implements ActionListener {

	TresNRaya control;
	
	public MyActionListener(TresNRaya control) {
		super();
		this.control = control;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		((JButton)e.getSource()).setText("d");
	}

}
