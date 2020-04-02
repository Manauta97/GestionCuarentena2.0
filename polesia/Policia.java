package polesia;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JTextArea;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import javax.swing.JToggleButton;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
/**
 * 
 * @author a112
 * @version 0.1.0
 *
 */
public class Policia extends JFrame {

	private JPanel contentPane;
	private JLabel lblpolicia;
	private JLabel lblfoto;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_hora;
	private JTextField textField_dni;
	private JTextField textField_hora;
	private JTextField textField_minutos;
	private JComboBox comboBox_personas;
	private JLabel lblNewLabel_personas;
	private JLabel lblNewLabel_dia;
	private JLabel lblNewLabel_info;
	private JTextArea textArea_infoCiudadano;
	private JCheckBox chckbx_multado;
	private JButton btn_atras;
	private JButton btn_multar;
	private JCheckBox chckbxrevisado;
	private JToggleButton tglbtn_mostrartodo;
	private JButton btn_revisar;

	/**
	 * Launch the application,
	 *  no it doesn't.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					Policia frame = new Policia();
//					frame.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//	}

	/**
	 * Create the frame.
	 */
	public Policia() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 461, 713);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblpolicia = new JLabel("Policia");
		lblpolicia.setFont(new Font("Comic Sans MS", Font.BOLD | Font.ITALIC, 30));
		lblpolicia.setBounds(146, 34, 118, 45);
		contentPane.add(lblpolicia);
		
		lblfoto = new JLabel("foto");
		lblfoto.setBounds(274, 11, 116, 100);
		contentPane.add(lblfoto);
		
		lblNewLabel = new JLabel("dni a comprobar");
		lblNewLabel.setBounds(60, 116, 107, 14);
		contentPane.add(lblNewLabel);
		
		lblNewLabel_hora = new JLabel("hora a comprobar");
		lblNewLabel_hora.setBounds(60, 157, 107, 14);
		contentPane.add(lblNewLabel_hora);
		
		textField_dni = new JTextField();
		textField_dni.addKeyListener(new TextField_dniKeyListener());
		textField_dni.setBounds(223, 113, 167, 20);
		contentPane.add(textField_dni);
		textField_dni.setColumns(10);
		
		textField_hora = new JTextField();
		textField_hora.addKeyListener(new TextField_horaKeyListener());
		textField_hora.setBounds(223, 154, 86, 20);
		contentPane.add(textField_hora);
		textField_hora.setColumns(10);
		
		textField_minutos = new JTextField();
		textField_minutos.addKeyListener(new TextField_minutosKeyListener());
		textField_minutos.setBounds(319, 154, 86, 20);
		contentPane.add(textField_minutos);
		textField_minutos.setColumns(10);
		
		comboBox_personas = new JComboBox();
		comboBox_personas.addMouseListener(new ComboBox_personasMouseListener());
		comboBox_personas.addMouseListener(new ComboBox_personasMouseListener());
		comboBox_personas.setBounds(60, 267, 107, 22);
		contentPane.add(comboBox_personas);
		
		lblNewLabel_personas = new JLabel("personas en el momento seleccionado");
		lblNewLabel_personas.setBounds(189, 271, 193, 14);
		contentPane.add(lblNewLabel_personas);
		
		lblNewLabel_dia = new JLabel("dia");
		lblNewLabel_dia.setBounds(60, 206, 107, 14);
		contentPane.add(lblNewLabel_dia);
		
		lblNewLabel_info = new JLabel("informacion del ciudadano");
		lblNewLabel_info.setBounds(60, 349, 167, 14);
		contentPane.add(lblNewLabel_info);
		
		textArea_infoCiudadano = new JTextArea();
		textArea_infoCiudadano.setBounds(43, 374, 362, 178);
		contentPane.add(textArea_infoCiudadano);
		
		chckbx_multado = new JCheckBox("multado");
		chckbx_multado.setBounds(308, 569, 97, 23);
		contentPane.add(chckbx_multado);
		
		btn_atras = new JButton("atras");
		btn_atras.addMouseListener(new Btn_atrasMouseListener());
		btn_atras.setBounds(52, 617, 89, 23);
		contentPane.add(btn_atras);
		
		btn_multar = new JButton("multar");
		btn_multar.addMouseListener(new Btn_multarMouseListener());
		btn_multar.setBounds(305, 617, 89, 23);
		contentPane.add(btn_multar);
		
		chckbxrevisado = new JCheckBox("revisado");
		chckbxrevisado.setBounds(179, 569, 97, 23);
		contentPane.add(chckbxrevisado);
		
		tglbtn_mostrartodo = new JToggleButton("mostrar todos");
		tglbtn_mostrartodo.setBounds(223, 288, 121, 23);
		contentPane.add(tglbtn_mostrartodo);
		
		btn_revisar = new JButton("revisar");
		btn_revisar.addMouseListener(new Btn_revisarMouseListener());
		btn_revisar.setBounds(175, 617, 89, 23);
		contentPane.add(btn_revisar);
	}
	private class TextField_dniKeyListener extends KeyAdapter {
		@Override
		public void keyReleased(KeyEvent e) {
		}
	}
	private class TextField_horaKeyListener extends KeyAdapter {
		@Override
		public void keyReleased(KeyEvent e) {
		}
	}
	private class TextField_minutosKeyListener extends KeyAdapter {
		@Override
		public void keyReleased(KeyEvent e) {
		}
	}
	private class ComboBox_personasMouseListener extends MouseAdapter {
		@Override
		public void mouseClicked(MouseEvent e) {
		}
	}
	private class Btn_atrasMouseListener extends MouseAdapter {
		@Override
		public void mouseClicked(MouseEvent e) {
		}
	}
	private class Btn_revisarMouseListener extends MouseAdapter {
		@Override
		public void mouseClicked(MouseEvent e) {
		}
	}
	private class Btn_multarMouseListener extends MouseAdapter {
		@Override
		public void mouseClicked(MouseEvent e) {	
		}
	}
	
}















