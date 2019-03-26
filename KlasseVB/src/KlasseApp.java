import java.awt.Color;

public class KlasseApp {

	
	public static void main(String[] args) {
		Voertuig mijnFiets=new Voertuig(10.00,"auto",Color.GREEN,1200.00);
		Voertuig jouwFiets=new Voertuig();
		
		boolean isGelijk=false;
		//mijnFiets=jouwFiets;
		//vergelijke of de inhoud hetzelfde is doe je met Equals.
		
		if (jouwFiets==mijnFiets){
			isGelijk=true;
		} else {
			isGelijk=false;
		}
		
		if (jouwFiets.equals(mijnFiets)) {
			isGelijk=true;
		} else {
			isGelijk=false;
		}
		
		
		jouwFiets.setSoort("Fiets van Pietje");
		jouwFiets.setKleur(Color.red);
		System.out.println(mijnFiets.toString() );
		System.out.println(jouwFiets.toString() );
		System.out.println(isGelijk);
		
	 
	}

}
