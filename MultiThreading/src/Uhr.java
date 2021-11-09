import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Uhr extends JFrame implements Runnable{

	JLabel ausgabe;
	
	public Uhr() {
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(300, 400);
		setLayout(null);
		
		ausgabe = new JLabel("Ausgabe");
		ausgabe.setBounds(20, 20, 300, 25);
		add(ausgabe);
		
		setVisible(true);
	}

	@Override
	public void run() {
		while(true) {
			ausgabe.setText(new SimpleDateFormat("dd.MM.yyyy hh:mm:ss").format(new Date()));
		}
	}
	
}
