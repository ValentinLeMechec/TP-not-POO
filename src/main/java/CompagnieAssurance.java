import java.util.ArrayList;
import java.util.List;

public class CompagnieAssurance {

	private String nom;
	private List<Personne> listPersonnes = new ArrayList<Personne>();
	
	
	public int obtenirNombreDeClients() {
		int i=0;
		for(Personne p: listPersonnes) {
			if(p.estClient())i++;
		}
		
		return i;
	}
	
	public int obtenirNombreDeProspects() {
		
	}
	
	public int obtenirNombreDeContrats() {
		
	}
	
	
	
	public static void main(String[] args) {
		CompagnieAssurance ca= new CompagnieAssurance();
		ca.nom="MMA";
		
		Personne p1= new Personne();
		Personne p2= new Personne();
		Personne p3= new Personne();
		
		
	}
}

