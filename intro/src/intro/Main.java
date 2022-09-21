package intro;

public class Main {

	//main javada başlangıç methotudur.
	public static void main(String[] args) {
	
		System.out.println("Hello  world!"); //sys yaz ctrl+space
        
		String ortaMetin="İlginizi çekebilir"; 
		//S büyük metinsel ifadeler için string kullanılır
		String altMetin="Vade süresi";	
		
		//Bütün satırlar noktalı virgülle bitmek zorunda
		//değişken isimlendirmeleri javada camelCase yazılır.
		
		System.out.println(ortaMetin); 
		System.out.println(altMetin);
		
		//Değişkenin tipi String, int, double, float, boolean, char, long, short, byte olabilir.
		
		//integer:tamsayı değerlerini tutar
		int vade =12; 
		//double :ondalıklı sayı değerlerini tutar
		double dolarDun=18.20;
		double dolarBugun=18.20;
		
		//boolean true veya false değerlerini tutar
		boolean dolarDustuMu=false;
		
		String okYonu="";
		
		if (dolarBugun<dolarDun) {//true şart sağlanırsa
			okYonu="down.svg";
			System.out.println(okYonu);
		}
		else if(dolarBugun>dolarDun) {
		    okYonu="up.svg";
		    System.out.println(okYonu);
		}
		else { //şart sağlanmazsa
			okYonu="equal.svg";
			System.out.println(okYonu);
		}
		//Array :Birden fazla olan verileri tutmak için kullanılır
		
		String[] krediler= {"Hızlı Kredi","Maaşını Halkbanktan Alanlar","Mutlu Emekli"};
		
		// Arraylerde ilk eleman indisi 0'dır. 
		    System.out.println(krediler[0]); 
		    System.out.println(krediler[1]);
	        System.out.println(krediler[2]);
		
		for (int i = 0; i < krediler.length; i++) {
			System.out.println(krediler[i]);
		}
	}

}
