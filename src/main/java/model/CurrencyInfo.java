package model;

import java.util.ArrayList;
import java.util.List;

public class CurrencyInfo {
	public Double convertCurrency(ArrayList<Currency> c,String currency, String ExchangeCurrency, Double Amount) {
		String alise=null;
		Double rate;
		double price=0;
		Currency ci=new Currency();
		System.out.println("Currency info 1:"+currency);
		System.out.println("Currrency info 2:"+ExchangeCurrency);
		
		for(int i=0;i<=5;i++) {
			if(ExchangeCurrency.equals(c.get(i).getCurName())) {
				alise=c.get(i).getCurAlise();
				System.out.println(alise);
				break;
			}
		}
		System.out.println("\n\n"+alise);
		if(alise!=null) {
			for(int i=0;i<=5;i++) {
				if(currency.equals(c.get(i).getCurName())) {
					rate=c.get(i).getCurValue().get(alise);
					price = ci.convert(Amount, rate);
				}
			}
		}
		System.out.println("\n\nPrice :"+price);
		return price;
	}
//c.get(i).getCurName()==currency
}
