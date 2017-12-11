import java.util.List;

public abstract class Contrat {

	private String numeroContrat;
	private Boolean contratValide;
	
	
	public abstract Contrat creationContrat() {
		
	}
	
	public abstract List<String> determinerGaranties(){
		
	}
	
	public abstract double determinerCotisation() {
		
	}
}
