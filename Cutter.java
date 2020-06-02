public class Cutter {

	String pm10cutter(String sample) {

		int index1 = sample.indexOf("<pm10Grade>");// 파싱해서 얻어온 데이터 끊는 앞부분
		int indexEnd = sample.indexOf("</pm10Grade>");// 파싱해서 얻어온 데이터 끊는 뒷부분

		//System.out.println("index1 = " + index1 + " indexEnd = " + indexEnd); // 위치 확인용 test print문

		String result = sample.substring(index1 + 11, indexEnd);// 시작 부분 +<resultCode> 만큼 단어를 result에 저장
		//System.out.println("result = " + result);// result 값 확인

		return result; // result 반환
	}

	String pm25cutter(String sample) {

		int index1 = sample.indexOf("<pm25Grade>");// 파싱해서 얻어온 데이터 끊는 앞부분
		int indexEnd = sample.indexOf("</pm25Grade>");// 파싱해서 얻어온 데이터 끊는 뒷부분

		//System.out.println("index1 = " + index1 + " indexEnd = " + indexEnd); // 위치 확인용 test print문

		String result = sample.substring(index1 + 11, indexEnd);// 시작 부분 +<resultCode> 만큼 단어를 result에 저장
		//System.out.println("result = " + result);// result 값 확인

		return result; // result 반환
	}

}
