public class Cutter {

	String pm10cutter(String sample) {

		int index1 = sample.indexOf("<pm10Grade>");//
		int indexEnd = sample.indexOf("</pm10Grade>");//

		//System.out.println("index1 = " + index1 + " indexEnd = " + indexEnd); // 

		String result = sample.substring(index1 + 11, indexEnd);
		//System.out.println("result = " + result);// 

		return result; // result ��ȯ
	}

	String pm25cutter(String sample) {

		int index1 = sample.indexOf("<pm25Grade>");//
		int indexEnd = sample.indexOf("</pm25Grade>");// �Ľ
		
		//System.out.println("index1 = " + index1 + " indexEnd = " + indexEnd); // �
		String result = sample.substring(index1 + 11, indexEnd);
		//System.out.println("result = " + result);

		return result; // result ��ȯ
	}
	
	String infocutter(String sample) {
		
		int index1 = sample.indexOf("<wf>");//
		int indexEnd = sample.indexOf("</wf>");// 
		
		String result = sample.substring(index1 + 4, indexEnd);
		
		
		return result;
	}
}
