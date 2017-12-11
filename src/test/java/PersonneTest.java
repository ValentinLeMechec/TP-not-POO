import static org.junit.Assert.*;

import java.util.GregorianCalendar;

import org.junit.Test;

public class PersonneTest {

	@Test
	public void test() {
		GregorianCalendar date1=new GregorianCalendar(1996,04,28);
		Personne p= new Personne("machin", "truc", date1);
		assertEquals("test personne", "machin truc", p.obtenirNomComplet());
		
		assertEquals("test personne nb contrats", 0, p.obtenirNbContrats());
		
		
	}

}
