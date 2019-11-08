package Service;

import java.sql.Date;

import java.util.List;

import Metier.Annonce;
import Metier.Personne;

public interface Iservice {
	
	 public int CreerPersonne(List<Personne> list,Personne personne);
	 public Personne getPersonne(List<Personne> list,int idPersonne);
	 public void deletePersonne(List<Personne> list,int idPersonne);
	 public void updatePersonne(List<Personne> list,Personne p, String nom, String prenom,Date dateNaissance);
	 public List<Personne> findAllPersonnes();
	 public int getPersonneId(List<Personne> list,Personne p);
	 public void affichePersonnes();
	 public void afficheAnnoncesPersonne(Personne p);
	 
	 public Annonce getAnnonce(Personne personne,int idAnnonce);
	 public List<Annonce> findAllAnnonce(Personne personne);
	 public void deleteAnnonce(List<Annonce> list, int idAnnonce);
	public void updateAnnonce(List<Annonce> list, Annonce a, String intitule, String detail);
	public int creerAnnonce(List<Annonce> list, Annonce a);
	 
}
