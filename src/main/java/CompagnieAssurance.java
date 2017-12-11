import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Scanner;

public class CompagnieAssurance {

	private String nom;
	private List<Personne> listPersonnes = new ArrayList<Personne>();
	private static Scanner sc;
	
	
	public int obtenirNombreDeClients() {
		int i=0;
		for(Personne p: listPersonnes) {
			if(p.estClient())i++;
		}
		
		return i;
	}
	
	public int obtenirNombreDeProspects() {
		int i=0;
		for(Personne p: listPersonnes) {
			if(!p.estClient())i++;
		}
		
		return i;	
	}
	
	public int obtenirNombreDeContrats() {
		int i=0;
		for(Personne p: listPersonnes) {
			List<Contrat> list=p.obtenirContrats();
			for(Contrat c:list) {
				i++;
			}
		}
		
		return i;
	}
	
	
	
	public Personne obtenirPlusGrosClient() {
		int max=-1;
		Personne p=null;
		for(Personne per: listPersonnes) {
			if(per.obtenirNbContrats()>=max) {
				max=per.obtenirNbContrats();
				p=per;
			}
		}
		return p;
	}
	
	public static void main(String[] args) {
		CompagnieAssurance ca= new CompagnieAssurance();
		ca.nom="MMA";
		GregorianCalendar date1=new GregorianCalendar(1996,04,28);
		Personne p1= new Personne("LeMechec", "Valentin",date1 );
		GregorianCalendar date2=new GregorianCalendar(1996,04,20);
		Personne p2= new Personne("Zidane", "Zinedine", date2);
		GregorianCalendar date3=new GregorianCalendar(1976,04,15);
		Personne p3= new Personne("Cayon", "Etienne", date3);
		ca.listPersonnes.add(p1);
		ca.listPersonnes.add(p2);
		ca.listPersonnes.add(p3);
		
		p1.creerContrat("Auto", "1");
		p1.creerContrat("MRH", "1");
		System.out.println(p1.obtenirNomComplet()+":"+p1.obtenirContrats());
		
		//System.out.println(p1.obtenirNbContrats()); //test fonction obtenirNbContrats
		System.out.println("plus gros client: "+ca.obtenirPlusGrosClient().obtenirNomComplet());
		
		
		sc = new Scanner(System.in);
		System.out.println("Pour créer un nouveau client, tapez 1.");
		System.out.println("Pour créer un nouveau client, tapez 2.");
		if(sc.nextInt()==1) {
			
			System.out.println("Veuillez entrer son nom, puis son prenom");
			sc.nextLine();
			String str= sc.nextLine();
			String[] s=str.split(" ");
			Personne p=new Personne(s[0],s[1], new GregorianCalendar(1955,06,20));
			System.out.println("client créé:"+p.obtenirNomComplet());
			ca.listPersonnes.add(p);
		}
		
		else if(sc.nextInt()==2) {
			int j=1;
			for(Personne p: ca.listPersonnes) {
				System.out.println(j+"-->"+ p.obtenirNomComplet());
				j++;
			}
			System.out.println("tapez le numero correspondant a la personne puis le type de contrat a creer. \n(exemple: [1 Auto], [2 MRH], [1 Prevoyance])");
			sc.nextLine();
			String str=sc.nextLine();
			String[] st=str.split(" ");
			String num=st[0];
			
			String type= st[1];
			Personne p=ca.listPersonnes.get(Integer.valueOf(num)-1);
			Contrat c=p.creerContrat(type, "ContratCree1");
			System.out.println(p.obtenirNomComplet()+"  contrat: "+c);
		}
	}
}

