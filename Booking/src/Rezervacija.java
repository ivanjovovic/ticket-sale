import java.awt.EventQueue;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JSpinner;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JScrollBar;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.SpinnerNumberModel;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.io.FileWriter;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.xml.sax.SAXException;
import javax.swing.UIManager;

public class Rezervacija {

	private JFrame frmRezervacijaKarata;
	private JTextField Ime;
	private JTextField Prezime;
	private JTextField Email;
	private JTextField id;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args)  {
		
		
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					
					
					Rezervacija window = new Rezervacija();
					window.frmRezervacijaKarata.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public  void  rand() {
		Random r=new Random();
		int n=r.nextInt(1000000)+1;
		String val=String.valueOf(n);
		id.setText(val);
	}

	
	public String getStringBetweenTwoChars(String input, String startChar, String endChar) {
	    try {
	        int start = input.indexOf(startChar);
	        if (start != -1) {
	            int end = input.indexOf(endChar, start + startChar.length());
	            if (end != -1) {
	                return input.substring(start + startChar.length(), end);
	            }
	        }
	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	    return input; // return null; || return "" ;
	}
	
	public void close() {
		WindowEvent win=new WindowEvent(this.frmRezervacijaKarata,WindowEvent.WINDOW_CLOSING);
		Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(win);
	}

	public Rezervacija() {
		initialize();
	}
	

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmRezervacijaKarata = new JFrame();
		frmRezervacijaKarata.setTitle("Rezervacija karata");
		frmRezervacijaKarata.setResizable(false);
		frmRezervacijaKarata.setBounds(100, 100, 868, 549);
		frmRezervacijaKarata.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frmRezervacijaKarata.getContentPane().setLayout(null);
		frmRezervacijaKarata.setLocationRelativeTo(null);
		JLabel lblIme = new JLabel("Ime:");
		lblIme.setForeground(Color.BLACK);
		lblIme.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblIme.setBounds(295, 98, 56, 16);
		frmRezervacijaKarata.getContentPane().add(lblIme);
		
		JLabel lblPrezime = new JLabel("Prezime:");
		lblPrezime.setForeground(Color.BLACK);
		lblPrezime.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblPrezime.setBounds(295, 131, 85, 16);
		frmRezervacijaKarata.getContentPane().add(lblPrezime);
		
		JLabel lblEmaikontakt = new JLabel("Emai/Kontakt:");
		lblEmaikontakt.setForeground(Color.BLACK);
		lblEmaikontakt.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblEmaikontakt.setBounds(295, 166, 116, 16);
		frmRezervacijaKarata.getContentPane().add(lblEmaikontakt);
		
		JLabel lblUtakmica = new JLabel("Utakmica:");
		lblUtakmica.setForeground(Color.BLACK);
		lblUtakmica.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblUtakmica.setBounds(295, 195, 85, 16);
		frmRezervacijaKarata.getContentPane().add(lblUtakmica);
		
		JLabel lblTribina = new JLabel("Tribina:");
		lblTribina.setForeground(Color.BLACK);
		lblTribina.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblTribina.setBounds(295, 230, 85, 16);
		frmRezervacijaKarata.getContentPane().add(lblTribina);
		
		JLabel lblSektor = new JLabel("Sektor:");
		lblSektor.setForeground(Color.BLACK);
		lblSektor.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblSektor.setBounds(295, 264, 85, 16);
		frmRezervacijaKarata.getContentPane().add(lblSektor);
		
		JLabel lblSjediste = new JLabel("Sjediste:");
		lblSjediste.setForeground(Color.BLACK);
		lblSjediste.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblSjediste.setBounds(295, 294, 85, 16);
		frmRezervacijaKarata.getContentPane().add(lblSjediste);
		
		
		
		Ime = new JTextField();
		Ime.setFont(new Font("Tahoma", Font.PLAIN, 15));
		Ime.setBounds(500, 96, 231, 22);
		frmRezervacijaKarata.getContentPane().add(Ime);
		Ime.setColumns(10);
		
		Prezime = new JTextField();
		Prezime.setFont(new Font("Dialog", Font.PLAIN, 15));
		Prezime.setBounds(500, 125, 231, 22);
		frmRezervacijaKarata.getContentPane().add(Prezime);
		Prezime.setColumns(10);
		
		Email = new JTextField();
		Email.setFont(new Font("Dialog", Font.PLAIN, 15));
		Email.setBounds(500, 154, 231, 22);
		frmRezervacijaKarata.getContentPane().add(Email);
		Email.setColumns(10);
		
		JComboBox Utakmica = new JComboBox();
		Utakmica.setFont(new Font("Tahoma", Font.PLAIN, 15));
		Utakmica.setBounds(500, 192, 231, 22);
		frmRezervacijaKarata.getContentPane().add(Utakmica);
		Utakmica.addItem("Sutjeska-Iskra [25/01/2019]");
		Utakmica.addItem("Sutjeska-Buducnost [02/02/2019]");
		Utakmica.addItem("Sutjeska-Zeta[11/02/2019]");
		Utakmica.addItem("Sutjeska-Rudar[19/02/2019]");
		Utakmica.addItem("Sutjeska-Mladost[27/02/2020]");
		Utakmica.addItem("Sutjeska-Ibar[03/03/2020]");
		Utakmica.addItem("Sutjeska-Mornar[12/03/2020]");
		Utakmica.addItem("Sutjeska-Lovcen[22/03/2020]");
		Utakmica.addItem("Sutjeska-Mogren[29/03/2020]");
		Utakmica.addItem("Sutjeska-Celik[09/05/2020]");
		Utakmica.addItem("Sutjeska-Otrant[22/05/2020]");

		
		JComboBox Tribina = new JComboBox();
		Tribina.setFont(new Font("Dialog", Font.PLAIN, 15));
		Tribina.setBounds(500, 227, 231, 22);
		frmRezervacijaKarata.getContentPane().add(Tribina);
		Tribina.addItem("Istok");
		Tribina.addItem("Zapad");
		
		JComboBox Sektor = new JComboBox();
		Sektor.setFont(new Font("Dialog", Font.PLAIN, 15));
		Sektor.setBounds(500, 262, 231, 22);
		frmRezervacijaKarata.getContentPane().add(Sektor);
		Sektor.addItem("A");
		Sektor.addItem("B");
		Sektor.addItem("C");
		
		JSpinner Sjediste = new JSpinner();
		Sjediste.setFont(new Font("Dialog", Font.PLAIN, 15));
		Sjediste.setModel(new SpinnerNumberModel(1, 1, 100, 1));
		Sjediste.setBounds(500, 292, 231, 22);
		frmRezervacijaKarata.getContentPane().add(Sjediste);
	

		JButton dugme = new JButton("KUPI KARTU");
		dugme.setFont(new Font("Tahoma", Font.BOLD, 17));
		dugme.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String input =Utakmica.getSelectedItem().toString();
				String startChar = "[";
				String endChar   = "]";
				String output = getStringBetweenTwoChars(input, startChar, endChar);
				SimpleDateFormat bb=new SimpleDateFormat("dd/MM/yyyy");
				String datum=new SimpleDateFormat("dd/MM/yyyy").format(new Date());
				try {
					Date date1=bb.parse(output);
				    Date date2=bb.parse(datum);
				    if(Ime.getText().equals("") || Prezime.getText().equals("") || Email.getText().equals("")  ){
			    		JOptionPane.showMessageDialog(null, "Unesite podatke");	
			    	}
				    
				    else
				    	if(date1.before(date2)) {
					    	JOptionPane.showMessageDialog(null, "Ne mozete kupiti kartu,utakmica je odigrana");
					    }
				    	else
				    { 	
	                DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
	                DocumentBuilder docBuilder = docFactory.newDocumentBuilder();   

	                
	                Document document = docBuilder.parse("C:\\Kodovi\\Booking\\src\\karte.xml");
                    Element root=document.getDocumentElement();
                    
                    Element Karta=document.createElement("Karta");
                    root.appendChild(Karta);
                    
                    Element Id=document.createElement("Id");
                    Id.appendChild(document.createTextNode(id.getText()));
                    Karta.appendChild(Id);
                    
                    Element ime=document.createElement("Ime");
                    ime.appendChild(document.createTextNode(Ime.getText()));
                    Karta.appendChild(ime);
                    
                    Element prezime=document.createElement("Prezime");
                    prezime.appendChild(document.createTextNode(Prezime.getText()));
                    Karta.appendChild(prezime);
                    
                    Element email=document.createElement("Kontakt");
                    email.appendChild(document.createTextNode(Email.getText()));
                    Karta.appendChild(email);
                    
                    Element utakmica=document.createElement("Utakmica");
                    utakmica.appendChild(document.createTextNode(Utakmica.getSelectedItem().toString()));
                    Karta.appendChild(utakmica);
                    
                    Element tribina=document.createElement("Tribina");
                    tribina.appendChild(document.createTextNode(Tribina.getSelectedItem().toString()));
                    Karta.appendChild(tribina);
                    
                    Element sektor=document.createElement("Sektor");
                    sektor.appendChild(document.createTextNode(Sektor.getSelectedItem().toString()));
                    Karta.appendChild(sektor);
                    
                    Element sjediste=document.createElement("Sjediste");
                    sjediste.appendChild(document.createTextNode(Sjediste.getValue().toString()));
                    Karta.appendChild(sjediste);
                  
	               

	                
	                TransformerFactory transformerFactory = TransformerFactory.newInstance();
	                Transformer transformer = transformerFactory.newTransformer();
	                DOMSource source = new DOMSource(document);
	                StreamResult result = new StreamResult(new File("C:\\Kodovi\\Booking\\src\\karte.xml"));
	                
	               
	            	;

	                transformer.transform(source, result);
	                
	                Izvjestaj izvjestaj=new Izvjestaj();
	        		izvjestaj.procesirajNarudzbinu(new File("C:\\Kodovi\\Booking\\src\\karte.xml"));
	        		izvjestaj.Brisanje();
	        		izvjestaj.prikazKarata();
	        		
	        		 TransformerFactory tff= TransformerFactory.newInstance();
		            	Transformer tf=tff.newTransformer(new StreamSource(new File("C:\\Kodovi\\Booking\\src\\karte.xslt")));
		            	StreamSource ss= new StreamSource(new File("C:\\Kodovi\\Booking\\src\\karte.xml"));
		            	StreamResult sr=new StreamResult(new File("C:\\Kodovi\\Booking\\src\\karte.html"));
		            	tf.transform(ss, sr);
	        		
	                JOptionPane.showMessageDialog(null, "Karte su kupljene");
				    }
	                

	              } catch (ParserConfigurationException pce) {
	                pce.printStackTrace();
	              } catch (TransformerException tfe) {
	                tfe.printStackTrace();
	              } catch (SAXException e1) {
	                // TODO Auto-generated catch block
	                e1.printStackTrace();
	            } catch (IOException e1) {
	                // TODO Auto-generated catch block
	                e1.printStackTrace();
	            } catch (ParseException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}

			}
		});
		dugme.setBounds(279, 341, 157, 57);
		frmRezervacijaKarata.getContentPane().add(dugme);
		
		JLabel pozadina = new JLabel("Pozadina");
		
		try {
	    	Image img = ImageIO.read(getClass().getResource("2.jpg"));
	    	pozadina.setIcon(new ImageIcon(img));
	    } catch (Exception ex) {
	    	System.out.println(ex);
	    }
		
		id = new JTextField();
		id.setFont(new Font("Tahoma", Font.PLAIN, 15));
		id.setBackground(Color.WHITE);
		id.setForeground(Color.BLACK);
		id.setColumns(10);
		id.setBounds(500, 67, 231, 22);
		frmRezervacijaKarata.getContentPane().add(id);
		

		
		
		JLabel label = new JLabel("ID:");
		label.setForeground(new Color(0, 0, 0));
		label.setFont(new Font("Tahoma", Font.BOLD, 15));
		label.setBounds(295, 69, 56, 16);
		frmRezervacijaKarata.getContentPane().add(label);
		
		JButton Nova = new JButton("NOVA KARTA");
		Nova.setFont(new Font("Tahoma", Font.BOLD, 17));
		Nova.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Random r=new Random();
				int n=r.nextInt(1000000)+1;
				String val=String.valueOf(n);
				id.setText(val);
				Ime.setText(" ");
				Prezime.setText(" ");
				Email.setText(" ");
				
			}
		});
		
		Nova.setBounds(541, 341, 157, 57);
		frmRezervacijaKarata.getContentPane().add(Nova);
		
		JButton btnNewButton = new JButton("Odjava");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Login ps = new Login();
	    		ps.setVisible(true);
	    		close();
			}
		});
		btnNewButton.setBounds(731, 468, 103, 25);
		frmRezervacijaKarata.getContentPane().add(btnNewButton);
		
		JLabel poz2 = new JLabel("New label");
		try {
	    	Image img = ImageIO.read(getClass().getResource("3.jpg"));
	    	poz2.setIcon(new ImageIcon(img));
	    } catch (Exception ex) {
	    	System.out.println(ex);
	    }
		
		poz2.setForeground(Color.WHITE);
		poz2.setBackground(Color.WHITE);
		poz2.setBounds(205, 49, 555, 378);
		frmRezervacijaKarata.getContentPane().add(poz2);
		pozadina.setBounds(0, -7, 899, 560);
		frmRezervacijaKarata.getContentPane().add(pozadina);
		  rand();
		  
		
		
	}
}
 