import java.util.ArrayList;
import java.util.List;

public class ContratAuto extends Contrat{

	private Contrat c;

	public List<String> determinerGaranties(){
		List<String> list= new ArrayList<String>();
		list.add("Accidents");
		list.add("Bris de glace");
		list.add("Responsabilité civile");
		return list;
		
	}
	
	public double determinerCotisation(){
		return 150.0;
	}
	
	public Contrat CreationContrat(String numContrat){
	
		this.contratValide=true;
		this.numeroContrat=numContrat;
		
		
		return this;
	}

	
}
