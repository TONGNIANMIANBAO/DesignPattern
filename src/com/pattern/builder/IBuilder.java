package com.pattern.builder;

/**
 * 抽象構建者
 * @author SEN.CHEN
 *
 */
public interface IBuilder {
	// 添加零件
	public void buildParts();

	// 添加功能
	public void addFun();

	// 返回產品
	public Production getProduct();
}
