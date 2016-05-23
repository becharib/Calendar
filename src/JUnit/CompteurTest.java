/*
 * Created on 3 mars 2006
 *
 * To change the template for this generated file go to
 * Window&gt;Preferences&gt;Java&gt;Code Generation&gt;Code and Comments
 */

/**
 * @author Michel
 *
 * To change the template for this generated type comment go to
 * Window&gt;Preferences&gt;Java&gt;Code Generation&gt;Code and Comments
 */

import junit.framework.*;

public class CompteurTest extends TestCase {
	//	TestCase est défini dans JUnit
	//	constructeur typique d’une classe de test JUnit
	public CompteurTest(String name) {
		super(name); // appel du constructeur de TestCase
	}
	//	une classe de test comprenant plusieurs cas de test
	public void testAjouterVal() throws CompteurInvalide {
		Compteur c1 = new Compteur(5);
		c1.ajouterVal(4);
		//	première assertion de test :
		//	si la valeur du compteur est différente de 9, on provoque un échec du test :
		assertEquals(c1.getVal(), 9);
		c1.ajouterVal(3);
		//	deuxième assertion de test
		//	on utilise ici la possibilité d’adjoindre un message d’erreur :
		assertEquals("Le compteur devrait valoir 12", c1.getVal(), 12);
	}
	//	test spécifique de la levée d’exception en cas de valeur négative
	public void testCreation() {
		try {
			Compteur c1 = new Compteur(-2);
			//	si on arrive ici, c’est que l’exception n’a pas été levée
			fail("Création compteur avec valeur négative non détectée !");
		} catch (CompteurInvalide e) {
		}
		//		l’exception CompteurInvalide a bien été levée
		assertTrue(true); // le test est donc OK

	}
	
	public static Test suite() {
	  TestSuite suite= new TestSuite();
	  suite.addTest(new CompteurTest("testAjouterVal"));
	  suite.addTest(new CompteurTest("testCreation"));
	  return suite;
	}
	
//	public static Test suite() {
//	  return new TestSuite(CompteurTest.class);
//	}


}
