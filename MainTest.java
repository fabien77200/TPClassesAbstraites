package lanceur;

import domaine.*;

public class MainTest {

	public static void main(String[] args) {
	
		Cadre p1=new CadreInformaticien();
		System.out.println("nbcong�s/mois ="+p1.nbCongesMois()+"\nbonus fin d'ann�e = "+p1.bonusAnnuel());
		
	}

}
