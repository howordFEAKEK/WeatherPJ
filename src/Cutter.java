public class Cutter {

	String pm10cutter(String sample) {

		int index1 = sample.indexOf("<pm10Grade>");// �Ľ��ؼ� ���� ������ ���� �պκ�
		int indexEnd = sample.indexOf("</pm10Grade>");// �Ľ��ؼ� ���� ������ ���� �޺κ�

		//System.out.println("index1 = " + index1 + " indexEnd = " + indexEnd); // ��ġ Ȯ�ο� test print��

		String result = sample.substring(index1 + 11, indexEnd);// ���� �κ� +<resultCode> ��ŭ �ܾ result�� ����
		//System.out.println("result = " + result);// result �� Ȯ��

		return result; // result ��ȯ
	}

	String pm25cutter(String sample) {

		int index1 = sample.indexOf("<pm25Grade>");// �Ľ��ؼ� ���� ������ ���� �պκ�
		int indexEnd = sample.indexOf("</pm25Grade>");// �Ľ��ؼ� ���� ������ ���� �޺κ�

		//System.out.println("index1 = " + index1 + " indexEnd = " + indexEnd); // ��ġ Ȯ�ο� test print��

		String result = sample.substring(index1 + 11, indexEnd);// ���� �κ� +<resultCode> ��ŭ �ܾ result�� ����
		//System.out.println("result = " + result);// result �� Ȯ��

		return result; // result ��ȯ
	}

}
