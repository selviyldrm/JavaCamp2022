package staticDemo;

public class ProductManager {

	public void add(Product product) {
		
		if(ProductValidator.isValid(product)) {
			System.out.println("Ürün Eklendi");
		}else {
			System.out.println("Ürü bilgileri geçersizdir");
		}
		ProductValidator validator=new ProductValidator();//yapıcı bloklar class newlenince çalışır
		validator.bisey();
	}
}
