import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Historique {

	 JFrame frameo;
	 JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Historique window = new Historique();
					window.frameo.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Historique() {
		try {
			initialize();
		}
		catch (Exception e){
			System.out.println("erreur");
		}
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frameo = new JFrame();
		frameo.setBounds(100, 100, 671, 435);
		frameo.getContentPane().setLayout(null);
		
		JLabel lblDate = new JLabel("Date : ");
		lblDate.setBounds(81, 52, 46, 14);
		frameo.getContentPane().add(lblDate);
		
		textField = new JTextField();
		textField.setBounds(137, 49, 127, 20);
		frameo.getContentPane().add(textField);
		textField.setColumns(10);
	}
}
