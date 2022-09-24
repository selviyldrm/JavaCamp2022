package methodOverloading;

public class Dortİslem {

	public int topla(int sayi1,int sayi2) {
		return sayi1+sayi2;
	}
	public int topla(int sayi1,int sayi2,int sayi3) { 
//ayni method ismi olmasına rağmen biri 2 parametreli diğeri 3 parametreli bu olaya overloading denir.
		return sayi1+sayi2;
	}
	
}
