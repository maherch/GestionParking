import java.awt.EventQueue;
import java.text.SimpleDateFormat;
import java.sql.Date;
import java.util.Calendar;

public class Test {
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Park window = new Park();
					window.frame.setVisible(true);
					
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		 
	}
}
