
public class Methodlar2 {

	public static void main(String[] args) {

		String mesaj = "Bugün hava çok güzel";
		String yeniMesaj1 = mesaj.substring(0, 2); // String olan bir değere void olan bir operasyon atanamaz
		System.out.println(yeniMesaj1);
		String yeniMesaj2 = sehirVer();
		System.out.println(yeniMesaj2);
		int sayi = topla(5, 7);
		System.out.println(sayi);
		int toplam=topla2(2,3,4,5,6,10);
		System.out.println(toplam);
	}

	// void operasyonlar :bir şeyi yap
	public static void ekle() {
		System.out.println("Eklendi");
	}

	public static void sil() {
		System.out.println("Silindi");
	}

	public static void guncelle() {
		System.out.println("Güncellendi");
	}

	public static int topla(int sayi1, int sayi2) {
		return 5;
	}

	public static int topla2(int... sayilar) { //... variable arguments integer array gibi calışır
		int toplam=0;
		for(int sayi:sayilar) {
			toplam+=sayi;
		}
		return toplam;
	}
	public static String sehirVer() {
		return "Ankara";
	}
}
