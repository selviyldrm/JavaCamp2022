package ucuncuHaftaOdevler;

public class Company extends Customer {

	private String companyName;
	private String TaxNumber;

	public String getTaxNumber() {
		return TaxNumber;
	}

	public void setTaxNumber(String taxNumber) {
		TaxNumber = taxNumber;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	
}
