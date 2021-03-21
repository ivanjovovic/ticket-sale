import java.awt.BorderLayout;
import java.awt.Desktop;
import java.awt.EventQueue;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;
import java.util.Scanner;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import java.awt.Font;
import javax.swing.UIManager;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class Admin extends JFrame {

	private JPanel contentPane;
	private JTextField prodate;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Admin frame = new Admin();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}


	public void close() {
		WindowEvent win=new WindowEvent(this,WindowEvent.WINDOW_CLOSING);
		Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(win);
	}
	public Admin() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 726, 390);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton dugme = new JButton("Informacije o kartama");
		dugme.setFont(new Font("Tahoma", Font.BOLD, 19));
		dugme.setBackground(UIManager.getColor("Button.background"));
		dugme.setForeground(Color.BLACK);
		dugme.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				File file = new File("C:\\Kodovi\\Booking\\src\\karte.html");
		        
		        //first check if Desktop is supported by Platform or not
		        if(!Desktop.isDesktopSupported()){
		            System.out.println("Desktop is not supported");
		            return;
		        }
		        
		        Desktop desktop = Desktop.getDesktop();
		        if(file.exists())
					try {
						desktop.open(file);
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
		        
		        //let's try to open PDF file
		        file = new File("/Users/pankaj/java.pdf");
		        if(file.exists())
					try {
						desktop.open(file);
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
			}
		});
		dugme.setBounds(12, 71, 347, 171);
		contentPane.add(dugme);
		
		JLabel lblNewLabel = new JLabel("");
		try {
	    	Image img = ImageIO.read(getClass().getResource("3.jpg"));
	    	lblNewLabel.setIcon(new ImageIcon(img));
	    } catch (Exception ex) {
	    	System.out.println(ex);
	    }
		
		JButton btnNewButton = new JButton("Odjava");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Login ps = new Login();
	    		ps.setVisible(true);
	    		close();
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton.setBounds(535, 269, 144, 49);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Broj prodatih karata");
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try
				(
				   FileReader       input = new FileReader("C:\\Kodovi\\Booking\\karte.txt");
				   LineNumberReader count = new LineNumberReader(input);
				)
				{
				   while (count.skip(Long.MAX_VALUE) > 0)
				   {
				      
				   }

				   int result = count.getLineNumber() ; 
				   
				   
				  String a=String.valueOf(result);
				  prodate.setText(a);
				
				} catch (IOException e) {
				
					e.printStackTrace();
				}
			}
		});
		btnNewButton_1.setBounds(449, 60, 206, 54);
		contentPane.add(btnNewButton_1);
		
		prodate = new JTextField();
		prodate.setHorizontalAlignment(SwingConstants.CENTER);
		prodate.setFont(new Font("Tahoma", Font.BOLD, 27));
		prodate.setBounds(449, 158, 206, 84);
		contentPane.add(prodate);
		prodate.setColumns(10);
		
		lblNewLabel.setBounds(-12, 0, 732, 353);
		contentPane.add(lblNewLabel);
	}
}
