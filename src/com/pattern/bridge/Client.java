package com.pattern.bridge;

/**
 * ���ģʽ��ʹ�����c���F������
 * 
 * @author SEN.CHEN
 *
 */
public class Client {

	public static void main(String[] args) {
		IDraw drawImp = new Rectangle();
		Reds redRec = new Reds(drawImp);
		redRec.print("red");

		Blues blueRec = new Blues(drawImp);
		blueRec.print("blue");

		IDraw imp = new triangle();
		Reds redTri = new Reds(imp);
		redTri.print("red");
		Blues blueTri = new Blues(imp);
		blueTri.print("blue");
	}

}
