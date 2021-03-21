import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Datumi extends JFrame {

	private JPanel contentPane;
	private JTextField unijeti;
	private JTextField sada;
	private JButton uporedi;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Datumi frame = new Datumi();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public Datumi() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		unijeti = new JTextField();
		unijeti.setBounds(131, 54, 174, 43);
		contentPane.add(unijeti);
		unijeti.setColumns(10);
		
		sada = new JTextField();
		sada.setColumns(10);
		sada.setBounds(131, 126, 174, 43);
		contentPane.add(sada);
		
		uporedi = new JButton("New button");
		uporedi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			SimpleDateFormat bb=new SimpleDateFormat("dd/MM/yyyy");
				String a=unijeti.getText().toString();
				String datum=new SimpleDateFormat("dd/MM/yyyy").format(new Date());
				try {
				Date date1=bb.parse(a);
			    Date date2=bb.parse(datum);
			    if(date1.before(date2)) {
			    	System.out.println("Nema karata");
			    }
			    else 
			    	System.out.println("Ima karata");
			    
				} catch (ParseException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			
			}
		});
		uporedi.setBounds(150, 201, 97, 25);
		contentPane.add(uporedi);
		
	}
}
