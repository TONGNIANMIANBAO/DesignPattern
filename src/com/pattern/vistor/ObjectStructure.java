package com.pattern.vistor;

import java.util.ArrayList;
import java.util.List;

/**
 * 对象结构是一个抽象表述，它内部管理了元素集合，并且可以迭代这些元素供访问者访问。
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
