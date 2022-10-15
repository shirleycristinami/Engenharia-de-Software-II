package org.iftm.projeto.view;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;

public class TelaEmpresa extends JInternalFrame {

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
		setBounds(100, 100, 450, 300);

	}

}
