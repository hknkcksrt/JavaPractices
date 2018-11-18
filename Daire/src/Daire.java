import java.util.Scanner;

public class Daire {
	
	public static void main(String[] args){
		
		double cevre, alan;
		
		System.out.printf("Dairenin yarýçapýný giriniz: ");
		Scanner yariCapAl = new Scanner(System.in);
		
		DaireNitelik d = new DaireNitelik();
		
		d.yaricap = yariCapAl.nextDouble();
		
		cevre = HesapCevre.cevre(d.yaricap, d.pi);
		
		HesapAlan daireAlan = new HesapAlan();
		alan = daireAlan.alan(d);
		
		System.out.printf("Dairenin Çevresi: %f\nDairenin Alaný: %f\n ", cevre, alan);
		
	}

}

class DaireNitelik{
	
	double yaricap;
	final double pi = 3.14;
	
}

class HesapCevre{
	
	public static double cevre(double r, double pi){
		
		return(2*pi*r);
		
	}
}

class HesapAlan{
	
	public double alan(DaireNitelik daire){
		
		return(daire.pi*Math.pow(daire.yaricap, 2));
	
	}
}
