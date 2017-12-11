import java.util.ArrayList;
import java.util.List;

public abstract class ContratMRH extends Contrat{

	
	public List<String> determinerGaranties(){
		List<String> list= new ArrayList<String>();
		list.add("Incendits");
		list.add("Vitres");
		list.add("Inondation");
		list.add("Responsabilité civile");
		return list;
	}
	
	public double determinerCotisation(){
		return 100.0;
	}
	
	public Contrat CreationContrat(){
		
	}
}
