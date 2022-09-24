
public class Methodlar {

	public static void main(String[] args) {

		sayiBulmaca();
	}

	public static void sayiBulmaca() { //parametresiz fonksiyon
		int[] sayilar = new int[] { 1, 2, 5, 7, 9 };
		int aranacak = 1;
		boolean varMi = false;

		for (int sayi : sayilar) {
			if (sayi == aranacak) {
				varMi = true;
				break;
			}
		}
		String mesaj = "";
		if (varMi) {
			mesaj="Sayı mevcuttur: " + aranacak;
			mesajVer(mesaj);
		} else {
			mesajVer("Sayi mevcut değildir: " + aranacak);
		}
	}

	public static void mesajVer(String mesaj) { // parametreli fonksiyon
		System.out.println(mesaj);
	}

}
