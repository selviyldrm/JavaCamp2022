
public class enbuyuksayi {

	public static void main(String[] args) {
		
		int sayi1=60;
		int sayi2=55;
		int sayi3=32;
		
		if (sayi1>sayi2 && sayi1>sayi3) {
			System.out.println("sayi1 en büyüktür : " + sayi1);
		}
		else if(sayi2>sayi1 && sayi2>sayi3){
			System.out.println("sayi2 en büyüktür : " + sayi2);
		}
		else {
           System.out.println("sayi3 en büyüktür :  " + sayi3);
		}

	/*	int enBuyuk=sayi1;
		if (enBuyuk<sayi2) {
			enBuyuk=sayi2;
		}
		if (enBuyuk<sayi3) {
			enBuyuk=sayi3;
		}
		System.out.println("En Büyük : " + enBuyuk );*/
	}

}
