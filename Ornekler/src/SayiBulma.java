
public class SayiBulma {

	public static void main(String[] args) {
		
		int[] sayilar=new int[] {1,2,5,7,9};
		int aranacak=4;
		boolean varMi=false;
		
         for(int sayi:sayilar) {
        	 if(sayi==aranacak) {
        		 varMi=true;
        		 break;
        	 }
         }   
         if(varMi) {
        	 System.out.println("Sayı mevcuttur");
         }
         else {
        	 System.out.println("Sayi mevcut değildir");
         }
	}

}
