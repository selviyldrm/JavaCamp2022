
public class StringIfadeler {

	public static void main(String[] args) {
		
		String mesaj="Bugün Hava Çok Güzel.";
		//metinler bir karakter dizisidir.char
		System.out.println(mesaj);
        System.out.println("Eleman sayısı : "+ mesaj.length()); 
        System.out.println("5. Eleman : "+ mesaj.charAt(4) );
        System.out.println(mesaj.concat(" Yaşasın"));
        System.out.println(mesaj.startsWith("B")); //verilen karakterle başlıyorsa true döner
        System.out.println(mesaj.endsWith(".")); //verilen karakterle bitiyorsa true döner
        char[] karakterler=new char[5];
       
        mesaj.getChars(0, 5, karakterler, 0);
	    System.out.println(karakterler);
	    System.out.println( mesaj.indexOf('a')); //baştan başlayarak verilen karakteri arar
	    System.out.println( mesaj.lastIndexOf('a'));//sondan başlayarak verilen karakteri arar
	    
	    String yeniMesaj=mesaj.replace(' ', '-');
	    System.out.println(yeniMesaj);//karakter değitirme yapar
	    
	    System.out.println(mesaj.substring(2));//verilen indexden sonrasını alır
	    System.out.println(mesaj.substring(2,5));
	    
	    for(String kelime:mesaj.split(" ")) {
	    	System.out.println(kelime); //kelimeleri ayırır
	    }
	    
	    System.out.println(mesaj.toLowerCase());
	    System.out.println(mesaj.toUpperCase());
	    System.out.println(mesaj.trim());//baştaki ve sondaki boşlukları siler
	}

}
