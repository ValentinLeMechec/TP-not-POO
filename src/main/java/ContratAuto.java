import java.util.ArrayList;
import java.util.List;

public abstract class ContratAuto extends Contrat{

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
	
	public Contrat CreationContrat(){
		
	}
	
}
