package com.pattern.factory;

/**
 * ���Sģʽ���ṩ��ͬ�ӿڄ�������
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
