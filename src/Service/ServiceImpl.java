package Service;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import javax.imageio.metadata.IIOInvalidTreeException;

import Metier.Annonce;
import Metier.Personne;

public class ServiceImpl implements Iservice {


	private static final char[] Personne = null;
	public static List<Personne> base = new ArrayList<Personne>();
	public static List<Annonce> base1 = new ArrayList<Annonce>();
	
	
	
	
	public int CreerPersonne(List<Personne> list, Personne personne) {
		
		list.add(personne);
		return 1;
		
	}

	@Override
	public Personne getPersonne(List<Personne> list, int idPersonne) {
		
		for (Personne personne : list) {
			if(personne.getPersonneId() == idPersonne) {
			return personne;
			}
		}
		return null;
		
	}

	@Override
	public void deletePersonne(List<Personne> list, int idPersonne) {
		for (Personne personne : list) {
			if(personne.getPersonneId() == idPersonne) {
				list.remove(personne);
				break;
			}
		}

	}
	@Override
	public void updatePersonne(List<Personne> list, Personne p, String nom, String prenom, Date dateNaissance) {
		{
			for (Personne personne : list) {
				if(personne.getPersonneId()==p.getPersonneId()) {
					personne.setNom(nom);
					personne.setPrenom(prenom);
					personne.setDateNaissance(dateNaissance);
					break;
				}
			}
			
		}
			
	}

	@Override
	public List<Personne> findAllPersonnes() {
		
		return (List<Personne>)base;
	}

	@Override
	public int getPersonneId(List<Personne> list, Personne p) {
		
		return 0;
	}

	@Override
	public void affichePersonnes() {

		System.out.println(Personne);
	}

	
	@Override
	public int creerAnnonce(List<Annonce> list, Annonce a) {

		list.add(a);
		return 1;
	}

	@Override
	public Annonce getAnnonce(Personne personne, int idAnnonce) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteAnnonce(List<Annonce> list, int idAnnonce) {
		for (Annonce annonce : list) {
			if(annonce.getIdAnnonce() == idAnnonce) {
				list.remove(annonce);
				break;
			}
		}

	}

	@Override
	public void updateAnnonce(List<Annonce> list, Annonce a, String intitule, String detail) {
		for (Annonce annonce : list) {
			if(annonce.getIdAnnonce()==a.getIdAnnonce()) {
				annonce.setIntitule(intitule);
				annonce.setDetail(detail);
				break;
			}
		}
	
	}

	@Override
	public List<Annonce> findAllAnnonce(Personne personne) {
		
		return (List<Annonce>)base1;
		
	}

	@Override
	public void afficheAnnoncesPersonne(Metier.Personne p) {
		// TODO Auto-generated method stub
		
	}

}
