package com.pattern.factory;

/**
 * 工廠模式：提供共同接口創建對象
 * 
 * @author SEN.CHEN
 *
 */
public class FactoryPattern {

	public static void main(String[] args) {
		Bandai bandai = CompanyFactory.getCompany(Bandai.class);
		bandai.Bankrupt();
		Banpresto banpresto = CompanyFactory.getCompany(Banpresto.class);
		banpresto.Bankrupt();
		Namco namco = CompanyFactory.getCompany(Namco.class);
		namco.Bankrupt();
	}

}
