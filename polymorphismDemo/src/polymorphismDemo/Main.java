package polymorphismDemo;

public class Main {

	//Polymorhism :Çok biçimlilik
	public static void main(String[] args) {
		
		/*BaseLogger[] loggers=new BaseLogger[] {new FileLogger(),new EmailLogger(),new DatabaseLogger(),new ConsoleLogger()};
        for (BaseLogger logger:loggers) {
        	logger.Log("Log Mesajı");
        }*/
		
		CustomerManager customerManager=new CustomerManager(new FileLogger());
		customerManager.add();
	}

}
