package ucuncuHaftaOdevler;

abstract class BaseCreditManager implements ICreditManager {

	@Override
	public abstract void Calculate(); //heryerde değişken

	@Override
 public void  Save() {
		
		System.out.println("Kaydedildi");
		
	}

}
