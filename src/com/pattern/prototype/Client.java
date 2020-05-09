package com.pattern.prototype;

import java.util.Date;

/**
 * ԭ��ģʽ������������}�u��ֱ�ӄ���������r��rʹ��
 * 
 * @author SEN.CHEN
 *
 */
public class Client {

	public static void main(String[] args) {
		ConcreteSheepPrototype csp = new ConcreteSheepPrototype("Dolly", new Date());
		ConcreteSheepPrototype cloneSheep = null;
		try {
			cloneSheep = (ConcreteSheepPrototype) csp.clone();// ����һ�����󣬲�������
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		cloneSheep.show();
		System.out.println(csp);
		System.out.println(csp.getName() + "/" + csp.getBirthday());
		System.out.println(cloneSheep);
		System.out.println(cloneSheep.getName() + "--" + cloneSheep.getBirthday());

		try {
			Thread.sleep(3000);// ��ͣ3��
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		Date date = new Date();
		System.out.println(date);
		csp.setName("David");// String �ؐ

		Date d1 = csp.getBirthday();
		d1.setTime(date.getTime());

		csp.setBirthday(d1);// ���M����������Ì��� �\��ؐ �}�u����
		if (csp.getBirthday() == cloneSheep.getBirthday()) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
		System.out.println(csp.getName() + "/" + csp.getBirthday());
		System.out.println(cloneSheep.getName() + "--" + cloneSheep.getBirthday());
	}
}
