import java.awt.Color;

public class Voertuig {
	
	private double snelheid;
	private String soort;
	private Color kleur;
	private double gewicht;
	
	
	//constructor
	Voertuig(){
		this(0.0,"nog niet bepaald",Color.black,0.0);
	}
	
	
	Voertuig(double snelheid, String soort, Color kleur, double gewicht){
		this.snelheid=snelheid;
		this.soort=soort;
		this.kleur=kleur;
		this.gewicht=gewicht;		
	}
	
	
	public double versnel(double percentage) {
		return snelheid*(1+percentage);
		
	}


	public double getSnelheid() {
		return snelheid;
	}


	public void setSnelheid(double snelheid) {
		this.snelheid = snelheid;
	}


	public String getSoort() {
		return soort;
	}


	public void setSoort(String soort) {
		this.soort = soort;
	}


	public Color getKleur() {
		return kleur;
	}


	public void setKleur(Color kleur) {
		this.kleur = kleur;
	}


	public double getGewicht() {
		return gewicht;
	}


	public void setGewicht(double gewicht) {
		this.gewicht = gewicht;
	}


	@Override
	public String toString() {
		return "Voertuig [snelheid=" + snelheid + ", soort=" + soort + ", kleur=" + kleur + ", gewicht=" + gewicht
				+ "]";
	}
	
	
	
	

}
