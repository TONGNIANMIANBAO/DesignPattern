package com.pattern.vistor;

import java.util.ArrayList;
import java.util.List;

/**
 * ����ṹ��һ��������������ڲ�������Ԫ�ؼ��ϣ����ҿ��Ե�����ЩԪ�ع������߷��ʡ�
 * 
 * @author SEN.CHEN
 *
 */
public class ObjectStructure {
	private List<Element> list = new ArrayList<>();

	public void addElememt(Element e) {
		list.add(e);
	}

	public void show(Visitor v) {
		for (Element e : list) {
			e.accept(v);
		}
	}

}
