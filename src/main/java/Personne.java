import java.util.Date;
import java.util.List;

public class Personne {

	
	private Boolean estUnClient;
	private String nom;
	private String prenom;
	private Date dateDeNaissance;
	
	
	public Boolean estClient() {
		if (estUnClient)return true;
		else return false;
	}
	 public String obtenirNomComplet() {
		 String nomComplet;
		 nomComplet=nom+" "+prenom;
		 return nomComplet;
	 }
	 
	 public Date obtenirDateDeNaissance() {
		 return dateDeNaissance;
	 }
	 
	 public Contrat creerContrat() {
		 
	 }
	 
	 public void resilierContrat(Contrat c) {
		 
		 
	 }
	 
	 public void resilierContrat(String s) {
		 
	 }
	 
	 public List<Contrat> obtenirContrats(){
		 
	 }
	 
	 public List<Contrat> obtenirContratsAuto(){
		 
	 }
	 
	 public List<Contrat> obtenirContratsMRH(){
		 
	 }
	 
	 public String toString() {
		 
	 }
	
}
