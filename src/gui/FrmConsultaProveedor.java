package gui;

import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;

public class FrmConsultaProveedor extends JInternalFrame {

	private static final long serialVersionUID = 1L;

	public FrmConsultaProveedor() {
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		setMaximizable(true);
		setIconifiable(true);
		setClosable(true);
		setTitle("Consulta Proveedor");
		setBounds(100, 100, 1000, 600);
		getContentPane().setLayout(null);
	}

	public void mensaje(String ms) {
		JOptionPane.showMessageDialog(this, ms);
	}

}
