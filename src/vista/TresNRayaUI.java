package vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.CardLayout;
import java.awt.FlowLayout;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import java.awt.Component;
import java.awt.Color;

public class TresNRayaUI extends JFrame {

	protected JPanel contentPane;
	protected Botonera botonera;
	protected JPanel panel;
	protected JPanel panelInGame;
	protected JPanel panelPostGame;
	protected JTextField txtMensaje;
	protected JButton btnCerrar;
	protected JButton btnReboot;
	protected JTextField txtMensajeDos;
	protected JTextField txtJugada;
	protected JTextField txtJugador;
	private JLabel lblNJugada;
	private JLabel lblTurnoJugador;
	protected JTextField txtGanador;
	/**
	 * Create the frame.
	 */
	public TresNRayaUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 400, 444);
		contentPane = new JPanel();
		contentPane.setBackground(Color.BLACK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{50, 320, 50, 0};
		gbl_contentPane.rowHeights = new int[]{50, 320, 50, 0};
		gbl_contentPane.columnWeights = new double[]{1.0, 1.0, 1.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{1.0, 1.0, 1.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		
		JLabel lblTresEnRaya = new JLabel("TRES EN RAYA");
		lblTresEnRaya.setForeground(Color.ORANGE);
		lblTresEnRaya.setFont(new Font("Comic Sans MS", Font.BOLD, 30));
		GridBagConstraints gbc_lblTresEnRaya = new GridBagConstraints();
		gbc_lblTresEnRaya.insets = new Insets(0, 0, 5, 5);
		gbc_lblTresEnRaya.gridx = 1;
		gbc_lblTresEnRaya.gridy = 0;
		contentPane.add(lblTresEnRaya, gbc_lblTresEnRaya);
		botonera=new Botonera(50, 50);
		botonera.setBackground(Color.BLACK);
        botonera.setBounds(5, 5, 424, 251);
        contentPane.add(botonera);
        botonera.setLayout(new GridLayout(3, 3, 0, 0));
        GridBagConstraints gbc_botonera = new GridBagConstraints();
		gbc_botonera.insets = new Insets(0, 0, 5, 5);
		gbc_botonera.fill = GridBagConstraints.BOTH;
		gbc_botonera.gridx = 1;
		gbc_botonera.gridy = 1;
		contentPane.add(botonera, gbc_botonera);
		
		panel = new JPanel();
		GridBagConstraints gbc_panel = new GridBagConstraints();
		gbc_panel.insets = new Insets(0, 0, 0, 5);
		gbc_panel.fill = GridBagConstraints.BOTH;
		gbc_panel.gridx = 1;
		gbc_panel.gridy = 2;
		contentPane.add(panel, gbc_panel);
		panel.setLayout(new CardLayout(0, 0));
		
		panelInGame = new JPanel();
		panelInGame.setBackground(Color.BLACK);
		panelInGame.setAlignmentY(Component.TOP_ALIGNMENT);
		panel.add(panelInGame, "name_1434488949460406");
		GridBagLayout gbl_panelInGame = new GridBagLayout();
		gbl_panelInGame.columnWidths = new int[]{82, 121, 86, 29, 0};
		gbl_panelInGame.rowHeights = new int[]{20, 20, 0};
		gbl_panelInGame.columnWeights = new double[]{1.0, 1.0, 1.0, 1.0, Double.MIN_VALUE};
		gbl_panelInGame.rowWeights = new double[]{1.0, 1.0, Double.MIN_VALUE};
		panelInGame.setLayout(gbl_panelInGame);
		
		txtMensaje = new JTextField();
		txtMensaje.setBackground(Color.DARK_GRAY);
		txtMensaje.setForeground(Color.RED);
		txtMensaje.setFont(new Font("Arial Black", Font.PLAIN, 11));
		txtMensaje.setMargin(new Insets(0, 0, 0, 0));
		txtMensaje.setAlignmentY(Component.TOP_ALIGNMENT);
		txtMensaje.setAlignmentX(Component.LEFT_ALIGNMENT);
		txtMensaje.setEditable(false);
		GridBagConstraints gbc_txtMensaje = new GridBagConstraints();
		gbc_txtMensaje.fill = GridBagConstraints.BOTH;
		gbc_txtMensaje.gridwidth = 2;
		gbc_txtMensaje.insets = new Insets(0, 0, 5, 5);
		gbc_txtMensaje.gridx = 0;
		gbc_txtMensaje.gridy = 0;
		panelInGame.add(txtMensaje, gbc_txtMensaje);
		txtMensaje.setColumns(10);
		
		lblNJugada = new JLabel("N\u00BA Jugada");
		lblNJugada.setForeground(Color.LIGHT_GRAY);
		GridBagConstraints gbc_lblNJugada = new GridBagConstraints();
		gbc_lblNJugada.insets = new Insets(0, 0, 5, 5);
		gbc_lblNJugada.gridx = 2;
		gbc_lblNJugada.gridy = 0;
		panelInGame.add(lblNJugada, gbc_lblNJugada);
		
		txtJugada = new JTextField();
		txtJugada.setEditable(false);
		GridBagConstraints gbc_txtJugada = new GridBagConstraints();
		gbc_txtJugada.fill = GridBagConstraints.BOTH;
		gbc_txtJugada.insets = new Insets(0, 0, 5, 0);
		gbc_txtJugada.gridx = 3;
		gbc_txtJugada.gridy = 0;
		panelInGame.add(txtJugada, gbc_txtJugada);
		txtJugada.setColumns(10);
		
		txtMensajeDos = new JTextField();
		txtMensajeDos.setBackground(Color.DARK_GRAY);
		txtMensajeDos.setForeground(new Color(0, 255, 0));
		txtMensajeDos.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 11));
		txtMensajeDos.setEditable(false);
		GridBagConstraints gbc_txtMensajeDos = new GridBagConstraints();
		gbc_txtMensajeDos.fill = GridBagConstraints.BOTH;
		gbc_txtMensajeDos.gridwidth = 2;
		gbc_txtMensajeDos.insets = new Insets(0, 0, 0, 5);
		gbc_txtMensajeDos.gridx = 0;
		gbc_txtMensajeDos.gridy = 1;
		panelInGame.add(txtMensajeDos, gbc_txtMensajeDos);
		txtMensajeDos.setColumns(10);
		
		lblTurnoJugador = new JLabel("Jugador");
		lblTurnoJugador.setForeground(Color.LIGHT_GRAY);
		GridBagConstraints gbc_lblTurnoJugador = new GridBagConstraints();
		gbc_lblTurnoJugador.insets = new Insets(0, 0, 0, 5);
		gbc_lblTurnoJugador.gridx = 2;
		gbc_lblTurnoJugador.gridy = 1;
		panelInGame.add(lblTurnoJugador, gbc_lblTurnoJugador);
		
		txtJugador = new JTextField();
		txtJugador.setEditable(false);
		GridBagConstraints gbc_txtJugador = new GridBagConstraints();
		gbc_txtJugador.fill = GridBagConstraints.BOTH;
		gbc_txtJugador.gridx = 3;
		gbc_txtJugador.gridy = 1;
		panelInGame.add(txtJugador, gbc_txtJugador);
		txtJugador.setColumns(10);
		
		panelPostGame = new JPanel();
		panelPostGame.setBackground(Color.BLACK);
		panel.add(panelPostGame, "name_1434492852353661");
		GridBagLayout gbl_panelPostGame = new GridBagLayout();
		gbl_panelPostGame.columnWidths = new int[]{149, 145, 0};
		gbl_panelPostGame.rowHeights = new int[]{0, 0, 23, 0};
		gbl_panelPostGame.columnWeights = new double[]{1.0, 1.0, Double.MIN_VALUE};
		gbl_panelPostGame.rowWeights = new double[]{1.0, 1.0, 1.0, Double.MIN_VALUE};
		panelPostGame.setLayout(gbl_panelPostGame);
		
		txtGanador = new JTextField();
		txtGanador.setEditable(false);
		txtGanador.setFont(new Font("Comic Sans MS", Font.BOLD, 14));
		txtGanador.setForeground(Color.ORANGE);
		txtGanador.setCaretColor(Color.DARK_GRAY);
		GridBagConstraints gbc_txtGanador = new GridBagConstraints();
		gbc_txtGanador.gridwidth = 2;
		gbc_txtGanador.insets = new Insets(0, 0, 5, 5);
		gbc_txtGanador.fill = GridBagConstraints.BOTH;
		gbc_txtGanador.gridx = 0;
		gbc_txtGanador.gridy = 0;
		panelPostGame.add(txtGanador, gbc_txtGanador);
		txtGanador.setColumns(10);
		
		btnReboot = new JButton("Reiniciar");
		GridBagConstraints gbc_btnReboot = new GridBagConstraints();
		gbc_btnReboot.fill = GridBagConstraints.BOTH;
		gbc_btnReboot.insets = new Insets(0, 0, 0, 5);
		gbc_btnReboot.gridx = 0;
		gbc_btnReboot.gridy = 2;
		panelPostGame.add(btnReboot, gbc_btnReboot);
		
		btnCerrar = new JButton("Cerrar");
		GridBagConstraints gbc_btnCerrar = new GridBagConstraints();
		gbc_btnCerrar.fill = GridBagConstraints.BOTH;
		gbc_btnCerrar.gridx = 1;
		gbc_btnCerrar.gridy = 2;
		panelPostGame.add(btnCerrar, gbc_btnCerrar);
	}
}