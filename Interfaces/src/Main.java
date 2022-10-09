
public class Main {

	public static void main(String[] args) {
		//ICustomerDal customerDal=new MySqlCustomerDal();
      //  customerDal.Add();
		CustomerManager customerManager=new CustomerManager(new MySqlCustomerDal());
	
		customerManager.add();
	}

}

//interfacelerde tamamlanmamış operasyonları içerir.
//interfaceler  newlenemez
//interface implemente eden classın referansını tutabilir
//bir class birden fazla interface 'i implemente edebilir