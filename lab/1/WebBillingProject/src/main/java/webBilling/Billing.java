package webBilling;

public class Billing {
	private String client_LName;
	private String client_FName;
	private String product_name;
	private double prd_Price;
	private Integer prd_Qty;
	private static double Fed_Tax;
	private static double Prv_Tax;
	
	// Constructors
	public Billing() {
		this.client_LName = "";
		this.client_FName = "";
		this.product_name = "";
		this.prd_Price = 0;
		this.prd_Qty = 0;
		Billing.Fed_Tax = 0.075;
		Billing.Prv_Tax = 0.06;
	}
	
	public Billing(String client_LName, String client_FName, String product_name, double prd_Price, Integer prd_Qty) {
		this.client_LName = client_LName;
		this.client_FName = client_FName;
		this.product_name = product_name;
		this.prd_Price = prd_Price;
		this.prd_Qty = prd_Qty;
		Billing.Fed_Tax = 0.075;
		Billing.Prv_Tax = 0.06;
	}

	public String getClient_LName() {
		return client_LName;
	}

	public void setClient_LName(String client_LName) {
		this.client_LName = client_LName;
	}

	public String getClient_FName() {
		return client_FName;
	}

	public void setClient_FName(String client_FName) {
		this.client_FName = client_FName;
	}

	public String getProduct_name() {
		return product_name;
	}

	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}

	public double getPrd_Price() {
		return prd_Price;
	}

	public void setPrd_Price(double prd_Price) {
		this.prd_Price = prd_Price;
	}

	public Integer getPrt_Qty() {
		return prd_Qty;
	}

	public void setPrt_Qty(Integer prt_Qty) {
		this.prd_Qty = prt_Qty;
	}

	public static double getFed_Tax() {
		return Fed_Tax;
	}

	public static void setFed_Tax(double fed_Tax) {
		Fed_Tax = fed_Tax;
	}

	public static double getPrv_Tax() {
		return Prv_Tax;
	}

	public static void setPrv_Tax(double prv_Tax) {
		Prv_Tax = prv_Tax;
	}
	
	// Methods
	
	public double CalculateBilling() {
		return (prd_Price * prd_Qty) + (prd_Price * prd_Qty) * Fed_Tax + (prd_Price * prd_Qty) * Prv_Tax;
	}
}
