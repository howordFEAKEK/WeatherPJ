public class Cutter {

	String cutterStandard(String sample, String start, String fin, int num) {
		int index1 = sample.indexOf(start);// 파싱해서 얻어온 데이터 끊는 앞부분
		int indexEnd = sample.indexOf(fin);// 파싱해서 얻어온 데이터 끊는 뒷부분

		// System.out.println("index1 = " + index1 + " indexEnd = " + indexEnd); // 위치
		// 확인용 test print문

		String result = sample.substring(index1 + num, indexEnd);// 시작 부분 +<resultCode> 만큼 단어를 result에 저장
		// System.out.println("result = " + result);// result 값 확인

		return result; // result 반환

	}

	String pm10cutter(String sample) {

		String result = cutterStandard(sample, "<pm10Grade>", "</pm10Grade>", 11);

		return result; // result 반환
	}

	String pm25cutter(String sample) {

		String result = cutterStandard(sample, "<pm25Grade>", "</pm25Grade>", 11);

		return result; // result 반환
	}

	String infocutter(String sample) {

		String result = cutterStandard(sample, "<wf>", "</wf>", 4);

		return result;
	}

	String tempercutter(String sample) {
		String result = cutterStandard(sample, "<wf>", "</wf>", 4);

		return result;
	}

	String pm10Value(String sample) {

		int index1 = sample.indexOf("<pm10Value>");//
		int indexEnd = sample.indexOf("</pm10Value>");//
		String result = cutterStandard(sample, "<pm10Value>", "</pm10Value>", 10);

		return result;
	}

	String pm25Value(String sample) {

		String result = cutterStandard(sample, "<pm25Value>", "</pm25Value>", 10);

		return result;
	}



}
