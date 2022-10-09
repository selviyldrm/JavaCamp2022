package ucuncuHaftaOdevler;

public class Odev1 {

	public static void main(String[] args) {
		
		//Değer tip: 
		int sayi1=10;  //int olan bir değerde bütün işlemler stack'te yapılıyor
		int sayi2=20;
		sayi1=sayi2; //sayi1'in değeri sayi2'nin değerine eşit oluyor sayi1=20
		sayi2=100;
		System.out.println(sayi1); //cevap 20 
		
		//Referans tip 
		int[] sayilar1={1,2,3}; 
		int[] sayilar2= {10,20,30};
		sayilar1=sayilar2; //s1'in referansını s2'nin referansına  eşitle
		sayilar2[0]=1000;
		System.out.println(sayilar1[0]);
		
		CreditManager creditManager=new CreditManager(); //örneğini oluşturma(instance creation)
		creditManager.Calculate();
		creditManager.Save();
		
		Customer customer=new Customer();
		customer.setId(1);
		 
		CustomerManager customerManager=new CustomerManager(new Person(),new TeacherCreditManager());
		customerManager.Save();
		customerManager.Delete();
		customerManager.GiveCredit();
		
		Company company=new Company();
		company.setTaxNumber("100000");
		company.setCompanyName("Arçelik");
		
		Person person=new Person();
		person.setFirstName("Engin");
		person.setLastName("Demiroğ");
		person.setNationalIdentity("12345678910");
				
		
	}
}

