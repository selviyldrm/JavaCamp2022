
public class WhileDongusu {

	public static void main(String[] args) {
	
		int i=1;
		while(i<10) {
		System.out.println(i);	
		i++;
		}
		System.out.println("Do-While Dongusu ");
		//Do-While :şart sağlanmasa bile en az bir kere çalışır
		int j=1;
		do{
			System.out.println(j);	
			j+=2;
		}while(j<10);
		
	}
}
