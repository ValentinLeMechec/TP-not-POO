import java.util.List;

public abstract class Contrat {

	protected String numeroContrat;
	protected Boolean contratValide;
	
	
	public abstract Contrat creationContrat() {
		
	}
	
	public abstract List<String> determinerGaranties(){
		
	}
	
	public abstract double determinerCotisation() {
		
	}
}
