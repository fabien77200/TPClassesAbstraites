package lanceur;

import domaine.*;

public class MainTest {

	public static void main(String[] args) {
	
		Cadre p1=new CadreInformaticien();
		System.out.println("nbcongés/mois ="+p1.nbCongesMois()+"\nbonus fin d'année = "+p1.bonusAnnuel());
		
	}

}
