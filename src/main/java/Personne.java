import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Personne {

	
	private Boolean estUnClient=false;
	private String nom;
	private String prenom;
	private Date dateDeNaissance;
	private List<Contrat> listContrats = new ArrayList<Contrat>();
	
	public Boolean estClient() {
		return estUnClient;
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
		 Contrat c;
		 c.creationContrat();
		 estUnClient=true;
		 listContrats.add(c);
		 
		 return c;
		 
	 }
	 
	 public void resilierContrat(Contrat c) {
		 
		 
	 }
	 
	 public void resilierContrat(String s) {
		 
	 }
	 
	 public List<Contrat> obtenirContrats(){
		 List<Contrat> list = new ArrayList<Contrat>();
		 for(Contrat c:listContrats) {
			 list.add(c);
		 }
		 
		 return list;
	 }
	 
	 public List<Contrat> obtenirContratsAuto(){
		 List<Contrat> list = new ArrayList<Contrat>();
		 for(Contrat c: listContrats) {
			 if(c.getClass().equals("ContratAuto")) {
				 list.add(c);
			 }
		 }
		 return list;
	 }
	 
	 public List<Contrat> obtenirContratsMRH(){
		 List<Contrat> list = new ArrayList<Contrat>();
		 for(Contrat c: listContrats) {
			 if(c.getClass().equals("ContratMRH")) {
				 list.add(c);
			 }
		 }
		 return list; 
	 }
	 
	 
	 public List<Contrat> obtenirContratsPrevoyance(){
		 List<Contrat> list = new ArrayList<Contrat>();
		 for(Contrat c: listContrats) {
			 if(c.getClass().equals("ContratPrevoyance")) {
				 list.add(c);
			 }
		 }
		 return list; 
	 }
	 
	 public String toString() {
		 
	 }
	
}
