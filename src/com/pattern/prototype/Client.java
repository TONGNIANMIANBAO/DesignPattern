package com.pattern.prototype;

import java.util.Date;

/**
 * 原型模式：創建對象的複製。直接創建對象代價大時使用
 * 
 * @author SEN.CHEN
 *
 */
public class Client {

	public static void main(String[] args) {
		ConcreteSheepPrototype csp = new ConcreteSheepPrototype("Dolly", new Date());
		ConcreteSheepPrototype cloneSheep = null;
		try {
			cloneSheep = (ConcreteSheepPrototype) csp.clone();// 返回一個新對象，不是引用
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		cloneSheep.show();
		System.out.println(csp);
		System.out.println(csp.getName() + "/" + csp.getBirthday());
		System.out.println(cloneSheep);
		System.out.println(cloneSheep.getName() + "--" + cloneSheep.getBirthday());

		try {
			Thread.sleep(3000);// 暫停3秒
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		Date date = new Date();
		System.out.println(date);
		csp.setName("David");// String 深拷貝

		Date d1 = csp.getBirthday();
		d1.setTime(date.getTime());

		csp.setBirthday(d1);// 數組，容器類，引用對象 淺拷貝 複製引用
		if (csp.getBirthday() == cloneSheep.getBirthday()) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
		System.out.println(csp.getName() + "/" + csp.getBirthday());
		System.out.println(cloneSheep.getName() + "--" + cloneSheep.getBirthday());
	}
}
