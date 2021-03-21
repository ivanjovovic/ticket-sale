import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Window.Type;

public class Login extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;
	private final JLabel lblNewLabel = new JLabel("New label");

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
					frame.setVisible(true);
					frame.setLocationRelativeTo(null);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
public void close() {
		
		WindowEvent winclose = new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
		Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(winclose);
	}
	public Login() {
		setTitle("Rezervacija");
		setResizable(false);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 715, 396);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblKorisnickoIme = new JLabel("Korisnicko ime:");
		lblKorisnickoIme.setForeground(Color.BLACK);
		lblKorisnickoIme.setFont(new Font("Tahoma", Font.BOLD, 19));
		lblKorisnickoIme.setBounds(61, 84, 160, 16);
		contentPane.add(lblKorisnickoIme);
		
		JLabel lblLozinka = new JLabel("Lozinka:");
		lblLozinka.setForeground(Color.BLACK);
		lblLozinka.setFont(new Font("Tahoma", Font.BOLD, 19));
		lblLozinka.setBounds(61, 176, 136, 16);
		contentPane.add(lblLozinka);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textField.setBounds(267, 76, 370, 38);
		contentPane.add(textField);
		textField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setFont(new Font("Tahoma", Font.PLAIN, 18));
		passwordField.setBounds(267, 167, 370, 38);
		contentPane.add(passwordField);
		
		JButton btnNewButton = new JButton("Prijavi se");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String password=passwordField.getText();
		    	String email=textField.getText();
		    	if(password.equals("user")&& email.equals("user")) {
		    		passwordField.setText(null);
		    		textField.setText(null);
		    	    Rezervacija info=new Rezervacija();
		    	    Rezervacija.main(null);
		    	    close();
		    	}
		    	else
		    		if(password.equals("admin")&& email.equals("admin")) {
			    		passwordField.setText(null);
			    		textField.setText(null);
			    	    Admin info=new Admin();
			    	    Admin.main(null);
			    	    close();
			    	}
		    		else	
		    	{
		    	JOptionPane.showMessageDialog(null,"Pogresno korisnicko ime ili lozinka","Neuspjesna prijava",JOptionPane.ERROR_MESSAGE);
		    	passwordField.setText(null);
	    		textField.setText(null);
		    	}
			}
		});
		btnNewButton.setBounds(91, 284, 252, 38);
		contentPane.add(btnNewButton);
JLabel lblNewLabel = new JLabel("Pozadina");
		
		try {
	    	Image img = ImageIO.read(getClass().getResource("3.jpg"));
	    	lblNewLabel.setIcon(new ImageIcon(img));
	    } catch (Exception ex) {
	    	System.out.println(ex);
	    }
		
		JButton btnIzadji = new JButton("Izadji");
		btnIzadji.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnIzadji.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnIzadji.setBounds(385, 284, 252, 38);
		contentPane.add(btnIzadji);
		lblNewLabel.setBounds(0, 0, 709, 361);
		contentPane.add(lblNewLabel);
	}
}
