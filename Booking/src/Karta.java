
public class Karta {
String ID;
String Ime;
String Prezime;
String Kontakt;
String Utakmica;
String Tribina;
String Sektor;
String Sjediste;
public String getID() {
	return ID;
}
public void setID(String iD) {
	ID = iD;
}
public String getIme() {
	return Ime;
}
public void setIme(String ime) {
	Ime = ime;
}
public String getPrezime() {
	return Prezime;
}
public void setPrezime(String prezime) {
	Prezime = prezime;
}
public String getKontakt() {
	return Kontakt;
}
public void setKontakt(String kontakt) {
	Kontakt = kontakt;
}
public String getUtakmica() {
	return Utakmica;
}
public void setUtakmica(String utakmica) {
	Utakmica = utakmica;
}
public String getTribina() {
	return Tribina;
}
public void setTribina(String tribina) {
	Tribina = tribina;
}
public String getSektor() {
	return Sektor;
}
public void setSektor(String sektor) {
	Sektor = sektor;
}
public String getSjediste() {
	return Sjediste;
}
public void setSjediste(String sjediste) {
	Sjediste = sjediste;
}
@Override
public String toString() {
	return "ID karte:" + ID + "/// Ime=" + Ime + "/// Prezime=" + Prezime + "/// Kontakt=" + Kontakt + "/// Utakmica="
			+ Utakmica + "/// Tribina=" + Tribina + "/// Sektor=" + Sektor + "/// Sjediste=" + Sjediste;
}




}
