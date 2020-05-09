package com.pattern.nullobject;

/**
 * ¿ÕŒ¦ÏóÄ£Ê½
 * 
 * @author SEN.CHEN
 *
 */
public class Client {

	public static void main(String[] args) {
		ObjectFactory fa = new ObjectFactory();
		IObject obj1 = fa.creatObject(2);
		obj1.get();

		IObject obj2 = fa.creatObject(0);
		obj2.get();
	}

}
