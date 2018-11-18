package harflendime;
import java.util.*;

public class Harf_notu {
	
	public static void main(String[] args){
		
		System.out.printf("S�nav notunuzu giriniz: ");
		Scanner not_al = new Scanner(System.in);
		int snv_notu = not_al.nextInt();
		
		System.out.println("S�nav sonucunuzun harf kar��l���: " + Harflendirme(snv_notu));
		
		if(snv_notu<40)
		System.out.println("S�navdan Ba�ar�s�z Oldunuz");
		else 
		System.out.println("Tebrikler...");
	}
	
	public static String Harflendirme(int snv_notu){
		
		String harf_notu;
		
		if(snv_notu>=0 && snv_notu<20) harf_notu = "FF";  
		else if (snv_notu>=20 && snv_notu<40) harf_notu = "DD";
		else if (snv_notu>=40 && snv_notu<60) harf_notu = "CC";
		else if (snv_notu>=60 && snv_notu<80) harf_notu = "BB";
		else if (snv_notu>=80 && snv_notu<=100) harf_notu = "AA";
		else harf_notu = "Ge�ersiz";
		
	return harf_notu ;
	}

}
