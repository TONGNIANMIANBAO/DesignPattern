package com.pattern.builder;

/**
 * ���󘋽���
 * @author SEN.CHEN
 *
 */
public interface IBuilder {
	// ������
	public void buildParts();

	// ��ӹ���
	public void addFun();

	// ���خaƷ
	public Production getProduct();
}
