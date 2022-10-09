package abstractSiniflar;

public abstract class GameCalculator {

	public abstract void hesapla() ;
	public final void gameOver() {  //final override edilemez olacağını belirtir
		System.out.println("Oyun bitti");
	}
}
