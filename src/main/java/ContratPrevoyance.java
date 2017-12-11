import java.util.ArrayList;
import java.util.List;

public class ContratPrevoyance extends Contrat {

	
	public List<String> determinerGaranties(){
		List<String> list= new ArrayList<String>();
		list.add("Accidents de la vie");
		list.add("Maladie");
		list.add("Mutuelle");
		return list;
	}
	
	public double determinerCotisation(){
		return 75.0;
	}
	
	public Contrat CreationContrat(String numContrat){
	
		this.contratValide=true;
		this.numeroContrat=numContrat;
		
		
		return this;
		
	}
}
