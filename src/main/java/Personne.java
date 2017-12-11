import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

public class Personne {

	
	private Boolean estUnClient=false;
	private String nom;
	private String prenom;
	private GregorianCalendar dateDeNaissance;
	private List<Contrat> listContrats = new ArrayList<Contrat>();
	
	
	Personne(String n, String pr, GregorianCalendar d){
		nom=n;
		prenom=pr;
		dateDeNaissance=d;
	}
	
	public Boolean estClient() {
		return estUnClient;
	}
	 public String obtenirNomComplet() {
		 String nomComplet;
		 nomComplet=nom+" "+prenom;
		 return nomComplet;
	 }
	 
	 public GregorianCalendar obtenirDateDeNaissance() {
		 return dateDeNaissance;
	 }
	 
	 public int obtenirNbContrats() {
		 int i=0;
		 for(Contrat c:listContrats) {
			 i++;
		 }
		 return i;
	 }
	 
	 public Contrat creerContrat(String s,String numContrat) {
		 
		 if( s.equals("Auto")) {
			 ContratAuto c=new ContratAuto();
			 c.creationContrat(numContrat);
			 listContrats.add(c);
			 estUnClient=true;
			 return c;
		 }
		 
		 if(s.equals("MRH")) {
			 ContratMRH c=new ContratMRH();
			 c.creationContrat(numContrat);
			 listContrats.add(c);
			 estUnClient=true;
			 return c;
		 }
		 
		 if(s.equals("Prevoyance")) {
			 ContratPrevoyance c= new ContratPrevoyance();
			 c.creationContrat(numContrat);
			 listContrats.add(c);
			 estUnClient=true;
			 return c;
		 }
		 else return null;
		 
		 
		
		 
		 
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
	 
	 
	
}
