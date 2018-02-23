package controlador;

import javax.swing.JButton;

import vista.TresNRayaUI;
import java.awt.event.ActionListener;
import java.awt.Color;
import java.awt.event.ActionEvent;

public class ParaTresNRayaUI extends TresNRayaUI {
	TresNRaya control = new TresNRaya();
	MyActionListener listener = new MyActionListener(control, this);

	public ParaTresNRayaUI() {
		super();
		btnCerrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit( 0 );
			}
		});

		// empiezan laas O en 1,1
		this.botonera.botones[1][1].setText("O");
		txtJugada.setText(String.valueOf(control.numerojugada));
		txtJugador.setText(String.valueOf(control.verTurno()));
		txtMensajeDos.setText(control.muestraLetrero());
		// prepara botonera
		for (int i = 0; i < this.botonera.botones.length; i++) {
			for (int j = 0; j < this.botonera.botones[i].length; j++) {
				this.botonera.botones[i][j].addActionListener(listener);
			}
		}
		btnReboot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int[][] tableroVacio={{0,0,0},{0,1,0},{0,0,0}};;
				control.tablero=tableroVacio;
				control.numerojugada=2;
				control.mover=true;
				panelInGame.setVisible(true);
				for (int i = 0; i < botonera.botones.length; i++) {
					for (int j = 0; j < botonera.botones[i].length; j++) {
						botonera.botones[i][j].setEnabled(true);
						ponerMalditosTextos(false);
						botonera.botones[i][j].setBackground(Color.LIGHT_GRAY);
					}
				}
			}
		});
	}

	public void pseudoMain(String coord) {
		int x = Character.getNumericValue(coord.charAt(0));
		int y = Character.getNumericValue(coord.charAt(1));
		control.destinox = x;
		control.destinoy = y;

//		System.out.println("turno: " + control.verTurno());
//		System.out.println("numeroJugada: " + control.numerojugada);

		if (control.realizarJugada()) {
			botonera.botones[x][y].setText(String.valueOf(control.retornaSimbolo(control.verTurno())));
		} else {
			txtMensaje.setText(control.indicarAnomalia());
		}
		txtMensajeDos.setText(control.muestraLetrero());

		if (control.numerojugada >= 4) {
			if (control.comprobarTresEnRaya()) {
				control.numerojugada++;
				txtGanador.setText("GANA EL JUGADOR '" + control.retornaSimbolo(control.verTurno())+"' EN "+String.valueOf(control.numerojugada-1)+" JUGADAS.");
				ponerMalditosTextos(true);
			}
		}
//		for (int i = 0; i < botonera.botones.length; i++) {
//			for (int j = 0; j < botonera.botones[i].length; j++) {
//				System.out.print(control.tablero[i][j]);
//			}
//			System.out.println();
//		}
//		System.out.println("_______________________");
		ponerMalditosTextos(false);
	}

	private void ponerMalditosTextos(boolean cerrarBotonera) {
		txtJugada.setText(String.valueOf(control.numerojugada));
		txtJugador.setText(String.valueOf(control.verTurno()));
		for (int i = 0; i < botonera.botones.length; i++) {
			for (int j = 0; j < botonera.botones[i].length; j++) {
				botonera.botones[i][j].setText(String.valueOf(control.retornaSimbolo(control.tablero[i][j])));
				if(cerrarBotonera){
					panelInGame.setVisible(false);
					panelPostGame.setVisible(true);
					botonera.botones[i][j].setEnabled(false);
					if(control.tablero[i][j]==control.verTurno()) 
						botonera.botones[i][j].setBackground(Color.cyan);
					else
						botonera.botones[i][j].setBackground(Color.red);
				}
			}
		}
	}

}
