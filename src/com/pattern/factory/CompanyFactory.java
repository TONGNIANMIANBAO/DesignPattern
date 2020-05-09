package com.pattern.factory;

import java.util.HashMap;

public class CompanyFactory {
	private static HashMap<String, Object> map = new HashMap<>();

	@SuppressWarnings("unchecked")
	public static <T> T getCompany(Class<T> clazz) {
		T obj = null;
		obj = (T) map.get(clazz.toString());
		if (obj == null) {
			try {
				obj = (T) Class.forName(clazz.getName()).newInstance();
				map.put(clazz.toString(), obj);
				System.out.println("flyweight");
			} catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return obj;
	}
}
