package model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Currency {
	private String curName;
	private String curAlise;
	private Map<String,Double> curValue=new HashMap<String,Double>();
	public Currency() {
		
	}
	public Currency(String curName, String curAlise) {
		super();
		this.curName = curName;
		this.curAlise = curAlise;
	
	}
	public String getCurName() {
		return curName;
	}
	public void setCurName(String curName) {
		this.curName = curName;
	}
	public String getCurAlise() {
		return curAlise;
	}
	public void setCurAlise(String curAlise) {
		this.curAlise = curAlise;
	}
	public Map<String, Double> getCurValue() {
		return this.curValue;
	}
	public void setCurValue(String key,Double value) {
		this.curValue.put(key, value);
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((curAlise == null) ? 0 : curAlise.hashCode());
		result = prime * result + ((curName == null) ? 0 : curName.hashCode());
		result = prime * result + ((curValue == null) ? 0 : curValue.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Currency other = (Currency) obj;
		if (curAlise == null) {
			if (other.curAlise != null)
				return false;
		} else if (!curAlise.equals(other.curAlise))
			return false;
		if (curName == null) {
			if (other.curName != null)
				return false;
		} else if (!curName.equals(other.curName))
			return false;
		if (curValue == null) {
			if (other.curValue != null)
				return false;
		} else if (!curValue.equals(other.curValue))
			return false;
		return true;
	}
	
	public static ArrayList<Currency> AssignValue() {
		
		ArrayList<Currency> c=new ArrayList<Currency>();
		c.add(new Currency("US Doller","USD"));
		c.add(new Currency("Euro","EUR"));
		c.add(new Currency("British Pound","GBP"));
		c.add(new Currency("Japanese Yen","JPY"));
		c.add(new Currency("Canadian Doller","CAD"));
		c.add(new Currency("Indian Rupee","INR"));
		for(int i=0;i<=5;i++) {
			c.get(i).AssignCurrency();
		}
		return c;
		  
	}
	public void display(ArrayList<Currency> c) {
		for(Currency ci:c) {
			System.out.println(ci.getCurName()+" "+ci.getCurAlise()+ci.getCurValue());
		}
	}
	public void AssignCurrency() {
		String cur=this.curName;
		switch(cur) {
		case "US Doller":
				this.setCurValue("USD", 1.00);
				this.setCurValue("EUR", 1.028);
				this.setCurValue("GBP", 55.020);
				this.setCurValue("JPY", 144.043);
				this.setCurValue("CAD", 1.361);
				this.setCurValue("INR", 59.800);
			break;
		case "Euro":
				this.setCurValue("USD",0.973);
				this.setCurValue("EUR", 1.00);
				this.setCurValue("GBP", 0.896);
				this.setCurValue("JPY", 140.188);
				this.setCurValue("CAD", 1.325);
				this.setCurValue("INR",79.212);
			break;
		case "British Pound":
				this.setCurValue("USD",1.087);
				this.setCurValue("EUR", 1.118);
				this.setCurValue("GBP", 1.00);
				this.setCurValue("JPY", 156.721);
				this.setCurValue("CAD", 1.481);
				this.setCurValue("INR",88.554);
			break;
		case "Japanese Yen":
				this.setCurValue("USD",0.007);
				this.setCurValue("EUR",0.007);
				this.setCurValue("GBP", 0.006);
				this.setCurValue("JPY", 1.00);
				this.setCurValue("CAD", 0.009);
				this.setCurValue("INR",0.565);
			break;
		case "Canadian Doller":
				this.setCurValue("USD",0.734);
				this.setCurValue("EUR",0.755);
				this.setCurValue("GBP", 0.675);
				this.setCurValue("JPY",105.833);
				this.setCurValue("CAD", 1.00);
				this.setCurValue("INR",59.800);
			break;
		case "Indian Rupee":
				this.setCurValue("USD",0.012);
				this.setCurValue("EUR",0.013);
				this.setCurValue("GBP", 0.011);
				this.setCurValue("JPY",1.770);
				this.setCurValue("CAD", 0.017);
				this.setCurValue("INR",1.00);
			break;
		}
	}
	public static Double convert(Double curvalue, Double changevalue) {
		double price=curvalue*changevalue;
		
		return price;
		
	}
}
