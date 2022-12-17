package org.iftm.projeto.view;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.Color;

public class TelaEmpresa extends JInternalFrame {
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaEmpresa frame = new TelaEmpresa();
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
	public TelaEmpresa() {
		setClosable(true);
		setMaximizable(true);
		setIconifiable(true);
		getContentPane().setFont(new Font("Tahoma", Font.PLAIN, 12));
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("EMPRESA");
		lblNewLabel.setBounds(10, 33, 46, 14);
		getContentPane().add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(92, 30, 206, 20);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("INSERIR");
		btnNewButton.setBackground(new Color(192, 192, 192));
		btnNewButton.setBounds(319, 29, 105, 23);
		getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel_1 = new JLabel("EMPRESA");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(143, 11, 77, 14);
		getContentPane().add(lblNewLabel_1);
		
		JButton btnNewButton_1 = new JButton("EXCLUIR");
		btnNewButton_1.setBackground(new Color(192, 192, 192));
		btnNewButton_1.setBounds(319, 124, 105, 23);
		getContentPane().add(btnNewButton_1);
		
		JLabel lblNewLabel_2 = new JLabel("ENDEREÇO");
		lblNewLabel_2.setBounds(10, 84, 72, 14);
		getContentPane().add(lblNewLabel_2);
		
		textField_1 = new JTextField();
		textField_1.setBounds(92, 81, 206, 20);
		getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnNewButton_2 = new JButton("ALTERAR");
		btnNewButton_2.setBackground(new Color(192, 192, 192));
		btnNewButton_2.setBounds(319, 77, 105, 23);
		getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("CONSULTAR");
		btnNewButton_3.setBackground(new Color(192, 192, 192));
		btnNewButton_3.setForeground(new Color(0, 0, 0));
		btnNewButton_3.setBounds(319, 169, 105, 23);
		getContentPane().add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("FECHAR");
		btnNewButton_4.setBackground(new Color(192, 192, 192));
		btnNewButton_4.setBounds(319, 214, 105, 23);
		getContentPane().add(btnNewButton_4);
		
		JLabel lblNewLabel_3 = new JLabel("RESPONSÁVEL");
		lblNewLabel_3.setBounds(10, 133, 72, 14);
		getContentPane().add(lblNewLabel_3);
		
		textField_2 = new JTextField();
		textField_2.setBounds(92, 130, 206, 20);
		getContentPane().add(textField_2);
		textField_2.setColumns(10);
		setBounds(100, 100, 450, 300);

	}
}
