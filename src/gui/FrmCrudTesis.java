package gui;

import javax.swing.JFrame;
import javax.swing.JInternalFrame;

public class FrmCrudTesis extends JInternalFrame {

	private static final long serialVersionUID = 1L;

	public FrmCrudTesis() {
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		setMaximizable(true);
		setIconifiable(true);
		setClosable(true);
		setTitle("Mantenimiento de Tesis");
		setBounds(100, 100, 900, 600);
		getContentPane().setLayout(null);

	}

}
