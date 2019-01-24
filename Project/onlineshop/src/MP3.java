package src;

public class MP3 extends Audio{ 
	protected double HST=0.13; 
	protected double pricetotal;
	protected double HSTprice; 
	protected double Shippingprice;
	protected double EnvironmentTaxprice;
	public MP3(int sNo, String nameofitem, double price, int quantityinstore, String author, String type){
		super(sNo, nameofitem, price, quantityinstore, author, type);
	}
	@Override 
	public double getPrice(){ 
		price=super.getPrice();
		return price;
	} 
	@Override 
	public double getHSTprice(int quantitysold){ 
		HSTprice=quantitysold*price*HST; 
		return HSTprice; 
	} 
	@Override 
	public double getEnvironmentTaxprice(int quantitysold){ 
		EnvironmentTaxprice=0; 
		return EnvironmentTaxprice; 
	} 
	@Override 
	public double getShippingprice(int quantitysold){ 
		Shippingprice=0; 
		return Shippingprice; 
	} 
	@Override 
	public double getTotalprice(int quantitysold){ 
		pricetotal=(price+price*HST)*quantitysold; 
		return pricetotal;
	} 
} 
