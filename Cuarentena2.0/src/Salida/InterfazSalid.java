package Salida;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;


import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class InterfazSalid extends JFrame {

	private JPanel contentPane;
	private JTextField textFielddia;
	private JTextField textFielhora;
	private JTextField textFieldminutos;
	private String dni;
	//private ArrayList<Salida> vSalida;
	private DefaultComboBoxModel modeloComboBox = new DefaultComboBoxModel();
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					String dni=null;
					InterfazSalid frame = new InterfazSalid(dni);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public InterfazSalid(String dni) {
		dni=this.dni;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 428, 664);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblfoto = new JLabel("");
		lblfoto.setBounds(50, 11, 94, 87);
		contentPane.add(lblfoto);
		
		JLabel lbldni = new JLabel("Nombre - Dni");
		lbldni.setBounds(154, 43, 94, 14);
		contentPane.add(lbldni);
		
		JLabel lbldnimostrar = new JLabel("");
		lbldnimostrar.setBounds(154, 58, 152, 14);
		contentPane.add(lbldnimostrar);
		
		JLabel lblsalidas = new JLabel("Salidas Realizadas:");
		lblsalidas.setBounds(33, 123, 111, 14);
		contentPane.add(lblsalidas);
		
		JTextArea textAreasalidas = new JTextArea();
		textAreasalidas.setEditable(false);
		textAreasalidas.setBounds(33, 148, 331, 81);
		contentPane.add(textAreasalidas);
		
		JLabel lbldia = new JLabel("Dia Salida");
		lbldia.setBounds(70, 262, 88, 14);
		contentPane.add(lbldia);
		
		JLabel lblhora = new JLabel("Hora Salida");
		lblhora.setBounds(247, 262, 73, 14);
		contentPane.add(lblhora);
		
		textFielddia = new JTextField();
		textFielddia.setBounds(48, 287, 96, 20);
		contentPane.add(textFielddia);
		textFielddia.setColumns(10);
		
		textFielhora = new JTextField();
		textFielhora.setBounds(210, 287, 56, 20);
		contentPane.add(textFielhora);
		textFielhora.setColumns(10);
		
		JComboBox comboBox = new JComboBox();


		
		modeloComboBox= new DefaultComboBoxModel();
		comboBox.setModel(modeloComboBox);
		comboBox.setBounds(210, 364, 154, 22);
		contentPane.add(comboBox);
		
		JLabel lblmotivos = new JLabel("Motivos");
		lblmotivos.setBounds(264, 339, 48, 14);
		contentPane.add(lblmotivos);
		
		JTextArea textAreaotros = new JTextArea();
		textAreaotros.setBounds(33, 432, 331, 87);
		contentPane.add(textAreaotros);
		
		JLabel lblotros = new JLabel("Otros:");
		lblotros.setBounds(33, 409, 48, 14);
		contentPane.add(lblotros);
		
		
		
		JButton btnvolver = new JButton("Volver");
		btnvolver.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			//	Login l = new Login();
			//	l.setVisible(true);
			//	dispose();
				}
		});
		btnvolver.setBounds(21, 572, 89, 23);
		contentPane.add(btnvolver);
		
		
		textFieldminutos = new JTextField();
		textFieldminutos.setBounds(289, 287, 63, 20);
		contentPane.add(textFieldminutos);
		textFieldminutos.setColumns(10);
		
		lbldnimostrar.setText(dni);
		modeloComboBox.addElement("Sacar a pasear al perro");
		modeloComboBox.addElement("Ir al medico de Urgencias");
		modeloComboBox.addElement("Ir a hacer la compra");
		modeloComboBox.addElement("Otros");
		textAreaotros.setVisible(false);
		lblotros.setVisible(false);
		
		
		comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(modeloComboBox.getSelectedItem().equals("Otros")) {
					textAreaotros.setVisible(true);
					lblotros.setVisible(true);
				}else {
					textAreaotros.setVisible(false);
					lblotros.setVisible(false);
				}
			}
		});
		
		
		//vSalida=Iodatos.cargarSalida;
		
		//String salidas="";
		//for (Salida s : vSalida) {
		//	if(s.getdni.equalsIgnoreCase(dni)) {
		//		salidas+=s.tostring() + "\n";
		//	}
		//}
//		textAreasalidas.setText(salidas);
		
		
		JButton btnreservar = new JButton("Reservar");
		btnreservar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				if(comboBox.getSelectedItem().equals("Otros")) {
					if(textFielddia.getText().equalsIgnoreCase("") || textFielhora.getText().equalsIgnoreCase("") ||textFielddia.getText().equalsIgnoreCase("") || textFieldminutos.getText().equalsIgnoreCase("") || textAreaotros.getText().equalsIgnoreCase("")) {
						JOptionPane.showMessageDialog(null, "No pueden haber datos en blanco", "Mensaje", 2);
					}
				}else {
					if(textFielddia.getText().equalsIgnoreCase("") || textFielddia.getText().equalsIgnoreCase("") || textFielhora.getText().equalsIgnoreCase("") || textFieldminutos.getText().equalsIgnoreCase("") || comboBox.getSelectedItem().equals("")) {
						JOptionPane.showMessageDialog(null, "No pueden haber datos en blanco", "Mensaje", 2);
					}
				}
				
				//if(comboBox.getSelectedItem().equals("Otros")) {
					//Salida s = new Salida(textAreaotros.getText(),textFielddia.getText(),textFielhora.getText(),textFieldminutos.getText(),dni)
					//JOptionPane.showMessageDialog(null, "Se Ha Guardado Con Exito", "Guardado Completado", 1);
				//	vSalida.add(s)
				// Iodatos.guardarSal(vSalida);
				//}else{
				// Salida c = new Salida(comboBox.getSelectedItem(),textFielddia.getText(),textFielhora.getText(),textFieldminutos.getText(),dni)
				//JOptionPane.showMessageDialog(null, "Se Ha Guardado Con Exito", "Guardado Completado", 1);
				//Iodatos.guardarSal(vSalida);
			//}
				
				
				
			}
		});
		btnreservar.setBounds(293, 572, 89, 23);
		contentPane.add(btnreservar);
	
	}


}
