package gui;

import javax.swing.JFrame;
import javax.swing.JInternalFrame;

public class FrmCrudAlumno extends JInternalFrame {

	private static final long serialVersionUID = 1L;

	public FrmCrudAlumno() {
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		setMaximizable(true);
		setIconifiable(true);
		setClosable(true);
		setTitle("Mantenimiento de Alumno");
		setBounds(100, 100, 900, 600);
		getContentPane().setLayout(null);

	}

}
