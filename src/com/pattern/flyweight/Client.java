package com.pattern.flyweight;

import java.util.Random;

import com.pattern.factory.Bandai;
import com.pattern.factory.Banpresto;
import com.pattern.factory.Company;
import com.pattern.factory.CompanyFactory;
import com.pattern.factory.Namco;

/**
 * ��Ԫģʽ����출p�ل�������Ĕ������������}�����c���Sģʽ��ϡ�
 * 
 * @author SEN.CHEN
 *
 */
public class Client {

	public static void main(String[] args) {
		final Class<?>[] list = { Bandai.class, Banpresto.class, Namco.class };
		Random random = new Random();
		int[] arr = random.ints(10, 0, 3).toArray();
		for (int i = 0; i < 10; i++) {
			System.out.println("-- " + arr[i]);
			Class<?> clazz = list[arr[i]];
			System.out.println(clazz);
			Company company = (Company) CompanyFactory.getCompany(clazz);
			company.Bankrupt();

		}
	}

}
