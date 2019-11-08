package Metier;

public class Annonce {
	

	public int IdAnnonce;
	public String Intitule;
	public String Detail;
	public float Prix;
	
	public Annonce() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Annonce(int idAnnonce, String intitule, String detail, float prix) {
		super();
		IdAnnonce = idAnnonce;
		Intitule = intitule;
		Detail = detail;
		Prix = prix;
	}

	public int getIdAnnonce() {
		return IdAnnonce;
	}


	public void setIdAnnonce(int idAnnonce) {
		IdAnnonce = idAnnonce;
	}


	public String getIntitule() {
		return Intitule;
	}


	public void setIntitule(String intitule) {
		Intitule = intitule;
	}


	public String getDetail() {
		return Detail;
	}


	public void setDetail(String detail) {
		Detail = detail;
	}


	public float getPrix() {
		return Prix;
	}


	public void setPrix(float prix) {
		Prix = prix;
	}


	@Override
	public String toString() {
		return "Annonce [IdAnnonce=" + IdAnnonce + ", Intitule=" + Intitule + ", Detail=" + Detail + ", Prix=" + Prix
				+ "]";
	}
	
		
}
