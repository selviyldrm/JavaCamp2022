
public class mükemmelSayi {

	public static void main(String[] args) {
	
		//6-->1,2,3 3 sayıya tam bölünür toplamları 6ya eşittir
		int number=6;
		int total=0;
		for(int i=1;i<number;i++) {
			if(number%i==0) {
			total=total+i;	
			}
		}
		
		if(total==number) {
			System.out.println("Mükemmel Sayıdır...");
		}
		else {
			System.out.println("Mükemmel sayı değildir...");
		}
	}

}
