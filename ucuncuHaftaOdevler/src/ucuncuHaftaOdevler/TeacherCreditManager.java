package ucuncuHaftaOdevler;

public class TeacherCreditManager extends BaseCreditManager implements ICreditManager{

	@Override
	public  void Calculate() {
		System.out.println("Öğretmen kredisi hesaplandı");
		
	}

	@Override
	public void Save() {
		System.out.println("Öğretmen kredisi kaydedildi");
		super.Save();
	}
	
}
