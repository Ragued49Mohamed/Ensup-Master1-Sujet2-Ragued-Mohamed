package Metier;

import java.sql.Date;

public class Personne {

	
	public int PersonneId;
	public String Nom;
	public String Prenom;
	public String Login;
	public String Motpass;
	public Date DateNaissance;
	
	public Personne() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Personne(int personneId, String nom, String prenom, String login, String motpass,Date DateNaissance) {
		super();
		PersonneId = personneId;
		Nom = nom;
		Prenom = prenom;
		Login = login;
		Motpass = motpass;
		DateNaissance = DateNaissance;
	}
	
	public int getPersonneId() {
		return PersonneId;
	}
	public void setPersonneId(int personneId) {
		PersonneId = personneId;
	}
	public String getNom() {
		return Nom;
	}
	public void setNom(String nom) {
		Nom = nom;
	}
	public String getPrenom() {
		return Prenom;
	}
	public void setPrenom(String prenom) {
		Prenom = prenom;
	}
	public String getLogin() {
		return Login;
	}
	public void setLogin(String login) {
		Login = login;
	}
	public String getMotpass() {
		return Motpass;
	}
	public void setMotpass(String motpass) {
		Motpass = motpass;
	}
	public Date getDateNaissance() {
		return DateNaissance;
	}
	public void setDateNaissance(Date dateNaissance) {
		DateNaissance = dateNaissance;
	}
	@Override
	public String toString() {
		return "Personne [PersonneId=" + PersonneId + ", Nom=" + Nom + ", Prenom=" + Prenom + ", Login=" + Login
				+ ", Motpass=" + Motpass + ", DateNaissance=" + DateNaissance + "]";
	}
	
	
	
}
