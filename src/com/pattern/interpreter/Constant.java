package com.pattern.interpreter;

/**
 * terminal expression���K�Y���_ʽ
 * 
 * @author SEN.CHEN
 *
 */
public class Constant implements Expression {
	private Integer value;

	public Constant(Integer value) {
		super();
		this.value = value;
	}

	@Override
	public int interpre(Context ctx) {
		return value;
	}

}
