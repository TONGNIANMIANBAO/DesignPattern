package com.pattern.iterator;

/**
 * ������ģʽ��ʹ���ڲ�����������������ô����ǿ���ֱ��ʹ���ⲿ�������
 * 
 * @author SEN.CHEN
 *
 */
public class Client {

	public static void main(String[] args) {
		ConcreteAggregate agg = new ConcreteAggregate();
		agg.add(234);
		agg.add("ss");
		agg.add(new Boolean("FALSE"));
		for (Iterator it = agg.getIterator(); it.hasNext();) {
			System.out.println(it.getCurrentObject());
			it.next();
		}
	}

}
