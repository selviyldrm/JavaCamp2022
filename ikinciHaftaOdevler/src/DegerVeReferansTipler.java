
public class DegerVeReferansTipler {

	public static void main(String[] args) {

		//değer ve referans tipler
		//int,double,float,byte değer tiptir(value type)
		int sayi1 = 10;
		int sayi2 = 20;
		sayi2 = sayi1;
		sayi1=30;
		System.out.println(sayi2);
		
		//diziler referans tiptir.
		int[] sayilar1=new int[] {1,2,3};
		int[] sayilar2=new int[] {4,5,6};
		sayilar2=sayilar1;
		sayilar1[0]=10;
		System.out.println(sayilar2[0]);
	}

}
