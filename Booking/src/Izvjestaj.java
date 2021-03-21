import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.RandomAccessFile;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;
public class Izvjestaj {

	
	List<Karta>kupjeneKarte=new LinkedList<Karta>();
	
private Document parse(File file) throws DocumentException{
		
		SAXReader reader=new SAXReader();
		Document doc;
		doc=reader.read(file);
		return doc;
	}

public void procesirajNarudzbinu(File file) {
	try {
		Document doc=parse(file);
		
		
		Element rootEl=doc.getRootElement();
		
		//ovdje smo u book orderu
		for (Iterator<Element> itEl = rootEl.elementIterator(); itEl.hasNext();) {
			Element elKarta = (Element) itEl.next();
			//ovdje imamo jedan element koji odgovara 1 knjizi
			Karta kartaEl=new Karta();
			
			for(Iterator<Element> itKarta=elKarta.elementIterator();itKarta.hasNext();){
				Element podatakOKarti=(Element)itKarta.next();
				String nazivKarte=podatakOKarti.getName();
				
				if(nazivKarte.equals("Ime")) {
					kartaEl.setIme(podatakOKarti.getText());
					
				}
				if(nazivKarte.equals("Id")) kartaEl.setID(podatakOKarti.getText());
				if(nazivKarte.equals("Prezime")) kartaEl.setPrezime(podatakOKarti.getText());
				if(nazivKarte.equals("Kontakt")) kartaEl.setKontakt(podatakOKarti.getText());
				if(nazivKarte.equals("Utakmica")) kartaEl.setUtakmica(podatakOKarti.getText());
				if(nazivKarte.equals("Tribina")) kartaEl.setTribina(podatakOKarti.getText());
				if(nazivKarte.equals("Sektor")) kartaEl.setSektor(podatakOKarti.getText());
				if(nazivKarte.equals("Sjediste")) kartaEl.setSjediste(podatakOKarti.getText());
			}
			kupjeneKarte.add(kartaEl);
			//ovdje smo ucitali podatke o jednoj knjizi i dodali u listu
		}
		
		
	} catch (DocumentException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}


public void Brisanje() {
	try {
		
		FileOutputStream writer = new FileOutputStream("C:\\Kodovi\\Booking\\karte.txt");
		writer.write(("").getBytes());
		writer.close();
	}
	
	
	

catch(Exception e1) {
		
	
};
}


public void prikazKarata() {
	
	
	
	
	for (Iterator<Karta>i=kupjeneKarte.iterator();i.hasNext();){
		Karta karta=i.next();
		try {
			
			    FileWriter pisanje=new FileWriter("C:\\Kodovi\\Booking\\karte.txt",true);
				pisanje.write(karta.toString());
				
				pisanje.write(System.getProperty("line.separator"));
				

				pisanje.close();
			}
			
			
		
			
		
		catch(Exception e1) {
				
			
		};
	}
	
	
}

}
