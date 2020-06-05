import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.util.Scanner;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.IOException;

public class PublicDateGetter {
	Cutter c = new Cutter();
	private String val;

	String pm10getter(String place) throws IOException {
		StringBuilder urlBuilder = new StringBuilder(
				"http://openapi.airkorea.or.kr/openapi/services/rest/ArpltnInforInqireSvc/getCtprvnRltmMesureDnsty"); /*
																														 * URL
																														 */
		urlBuilder.append("?" + URLEncoder.encode("ServiceKey", "UTF-8")
				+ "=LgRgbunXMOlZA23p%2B3W9rS6oLCPvoFIt%2FIFz1k4lLvYZPSmOjf6WgbER6%2Be2gybE73XKzeGgaaveKiSn1SlykA%3D%3D"); /*
																															 * Service
																															 * Key
																															 */
		urlBuilder.append("&" + URLEncoder.encode("numOfRows", "UTF-8") + "="
				+ URLEncoder.encode("10", "UTF-8")); /* 한 페이지 결과 수 */
		urlBuilder.append(
				"&" + URLEncoder.encode("pageNo", "UTF-8") + "=" + URLEncoder.encode("1", "UTF-8")); /* 페이지 번호 */
		urlBuilder.append("&" + URLEncoder.encode("sidoName", "UTF-8") + "=" + URLEncoder.encode(place,
				"UTF-8")); /* 시도 이름 (서울, 부산, 대구, 인천, 광주, 대전, 울산, 경기, 강원, 충북, 충남, 전북, 전남, 경북, 경남, 제주, 세종) */
		urlBuilder.append("&" + URLEncoder.encode("ver", "UTF-8") + "="
				+ URLEncoder.encode("1.3", "UTF-8")); /* 버전별 상세 결과 참고문서 참조 */
		URL url = new URL(urlBuilder.toString());
		String val;

		HttpURLConnection conn = (HttpURLConnection) url.openConnection();
		conn.setRequestMethod("GET");
		conn.setRequestProperty("Content-type", "application/json");
		// System.out.println("Response code: " + conn.getResponseCode());
		BufferedReader rd;
		if (conn.getResponseCode() >= 200 && conn.getResponseCode() <= 300) {
			rd = new BufferedReader(new InputStreamReader(conn.getInputStream()));
		} else {
			rd = new BufferedReader(new InputStreamReader(conn.getErrorStream()));
		}
		StringBuilder sb = new StringBuilder();
		String line;
		while ((line = rd.readLine()) != null) {
			sb.append(line);
		}
		rd.close();
		conn.disconnect();
		val = c.pm10cutter(sb.toString());
		return val;
	}

	String pm25getter(String place) throws IOException {
		StringBuilder urlBuilder = new StringBuilder(
				"http://openapi.airkorea.or.kr/openapi/services/rest/ArpltnInforInqireSvc/getCtprvnRltmMesureDnsty"); /*
																														 * URL
																														 */
		urlBuilder.append("?" + URLEncoder.encode("ServiceKey", "UTF-8")
				+ "=LgRgbunXMOlZA23p%2B3W9rS6oLCPvoFIt%2FIFz1k4lLvYZPSmOjf6WgbER6%2Be2gybE73XKzeGgaaveKiSn1SlykA%3D%3D"); /*
																															 * Service
																															 * Key
																															 */
		urlBuilder.append("&" + URLEncoder.encode("numOfRows", "UTF-8") + "="
				+ URLEncoder.encode("10", "UTF-8")); /* 한 페이지 결과 수 */
		urlBuilder.append(
				"&" + URLEncoder.encode("pageNo", "UTF-8") + "=" + URLEncoder.encode("1", "UTF-8")); /* 페이지 번호 */
		urlBuilder.append("&" + URLEncoder.encode("sidoName", "UTF-8") + "=" + URLEncoder.encode(place,
				"UTF-8")); /* 시도 이름 (서울, 부산, 대구, 인천, 광주, 대전, 울산, 경기, 강원, 충북, 충남, 전북, 전남, 경북, 경남, 제주, 세종) */
		urlBuilder.append("&" + URLEncoder.encode("ver", "UTF-8") + "="
				+ URLEncoder.encode("1.3", "UTF-8")); /* 버전별 상세 결과 참고문서 참조 */
		URL url = new URL(urlBuilder.toString());
		HttpURLConnection conn = (HttpURLConnection) url.openConnection();
		conn.setRequestMethod("GET");
		conn.setRequestProperty("Content-type", "application/json");
		// System.out.println("Response code: " + conn.getResponseCode());
		BufferedReader rd;
		if (conn.getResponseCode() >= 200 && conn.getResponseCode() <= 300) {
			rd = new BufferedReader(new InputStreamReader(conn.getInputStream()));
		} else {
			rd = new BufferedReader(new InputStreamReader(conn.getErrorStream()));
		}
		StringBuilder sb = new StringBuilder();
		String line;
		while ((line = rd.readLine()) != null) {
			sb.append(line);
		}
		rd.close();
		conn.disconnect();
		val = c.pm25cutter(sb.toString());
		return val;
	}

	String weathergetter(String place) throws IOException {
		Cutter c = new Cutter();
		StringBuilder urlBuilder = new StringBuilder(
				"http://www.kma.go.kr/weather/forecast/mid-term-rss3.jsp?stnId=108"); /* URL */
		String val;

		urlBuilder.append(
				"&" + URLEncoder.encode("nx", "UTF-8") + "=" + URLEncoder.encode("27", "UTF-8")); /* 예보지점의 X 좌표값 */
		urlBuilder.append(
				"&" + URLEncoder.encode("ny", "UTF-8") + "=" + URLEncoder.encode("127", "UTF-8")); /* 예보지점 Y 좌표 */

		URL url = new URL(urlBuilder.toString());
		HttpURLConnection conn = (HttpURLConnection) url.openConnection();
		conn.setRequestMethod("GET");
		conn.setRequestProperty("Content-type", "application/json");
		System.out.println("Response code: " + conn.getResponseCode());

		BufferedReader rd = new BufferedReader(
				new InputStreamReader(conn.getInputStream(), "utf-8"));



		if (conn.getResponseCode() >= 200 && conn.getResponseCode() <= 300) {
			rd = new BufferedReader(new InputStreamReader(conn.getInputStream()));
		} else {
			rd = new BufferedReader(new InputStreamReader(conn.getErrorStream()));
		}
		StringBuilder sb = new StringBuilder();
		String line;
		while ((line = rd.readLine()) != null) {
			sb.append(line);
		}
		rd.close();
		conn.disconnect();
		// System.out.println(sb.toString());
		val = c.infocutter(sb.toString());
		System.out.println(val);
		return val;
	}

	String weathergetter1(String place) throws IOException {
		Cutter c = new Cutter();
		StringBuilder urlBuilder = new StringBuilder(
				"http://www.kma.go.kr/weather/forecast/mid-term-rss3.jsp?stnId=108"); /* URL */
		String val;

		// urlBuilder.append("?" + URLEncoder.encode("ServiceKey","UTF-8") +
		// "=LgRgbunXMOlZA23p%2B3W9rS6oLCPvoFIt%2FIFz1k4lLvYZPSmOjf6WgbER6%2Be2gybE73XKzeGgaaveKiSn1SlykA%3D%3D");
		// /*Service Key*/
		// urlBuilder.append("&" + URLEncoder.encode("ServiceKey","UTF-8") + "=" +
		// URLEncoder.encode("-", "UTF-8")); /*공공데이터포털에서 받은 인증키*/
		// urlBuilder.append("&" + URLEncoder.encode("pageNo","UTF-8") + "=" +
		// URLEncoder.encode("1", "UTF-8")); /*페이지번호*/
		// urlBuilder.append("&" + URLEncoder.encode("numOfRows","UTF-8") + "=" +
		// URLEncoder.encode("10", "UTF-8")); /*한 페이지 결과 수*/
		// urlBuilder.append("&" + URLEncoder.encode("dataType","UTF-8") + "=" +
		// URLEncoder.encode("XML", "UTF-8")); /*요청자료형식(XML/JSON)Default: XML*/
		// urlBuilder.append("&" + URLEncoder.encode("base_date","UTF-8") + "=" +
		// URLEncoder.encode("20200601", "UTF-8")); /*15년 12월 1일 발표*/
		// urlBuilder.append("&" + URLEncoder.encode("base_time","UTF-8") + "=" +
		// URLEncoder.encode("0600", "UTF-8")); /*06시 발표(정시단위)*/
		urlBuilder.append(
				"&" + URLEncoder.encode("nx", "UTF-8") + "=" + URLEncoder.encode("27", "UTF-8")); /* 예보지점의 X 좌표값 */
		urlBuilder.append(
				"&" + URLEncoder.encode("ny", "UTF-8") + "=" + URLEncoder.encode("127", "UTF-8")); /* 예보지점 Y 좌표 */

		URL url = new URL(urlBuilder.toString());
		HttpURLConnection conn = (HttpURLConnection) url.openConnection();
		conn.setRequestMethod("GET");
		conn.setRequestProperty("Content-type", "application/json");
		System.out.println("Response code: " + conn.getResponseCode());

		BufferedReader rd;

		if (conn.getResponseCode() >= 200 && conn.getResponseCode() <= 300) {
			rd = new BufferedReader(new InputStreamReader(conn.getInputStream()));
		} else {
			rd = new BufferedReader(new InputStreamReader(conn.getErrorStream()));
		}
		StringBuilder sb = new StringBuilder();
		String line;
		while ((line = rd.readLine()) != null) {
			sb.append(line);
		}
		rd.close();
		conn.disconnect();
		// System.out.println(sb.toString());
		val = c.infocutter(sb.toString());
		return val;
	}

	String weatherloca(String loca) {
		String val = null;
		try {

			// OpenAPI call하는 URL
			String urlstr = "http://api.openweathermap.org/data/2.5/weather?" + "q=" + loca
					+ "&appid=082b31d2f7ab5b654775052d887b7b0c";
			URL url = new URL(urlstr);
			BufferedReader bf;
			String line;
			String result = "";

			// 날씨 정보를 받아온다.
			bf = new BufferedReader(new InputStreamReader(url.openStream()));

			// 버퍼에 있는 정보를 문자열로 변환.
			while ((line = bf.readLine()) != null) {
				result = result.concat(line);
				// System.out.println(line);
			}

			// 문자열을 JSON으로 파싱
			JSONParser jsonParser = new JSONParser();
			JSONObject jsonObj = (JSONObject) jsonParser.parse(result);
			// 지역 출력

			val = jsonObj.get("name").toString();

			bf.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		return val;
	}

	String weatherinfo(String loca) {
		smalltool s = new smalltool();
		int sample;
		String val = null;
		try {
			// 서울시청의 위도와 경도

			// OpenAPI call하는 URL
			String urlstr = "http://api.openweathermap.org/data/2.5/weather?" + "q=" + loca
					+ "&appid=082b31d2f7ab5b654775052d887b7b0c";
			URL url = new URL(urlstr);
			BufferedReader bf;
			String line;
			String result = "";

			// 날씨 정보를 받아온다.
			bf = new BufferedReader(new InputStreamReader(url.openStream()));

			// 버퍼에 있는 정보를 문자열로 변환.
			while ((line = bf.readLine()) != null) {
				result = result.concat(line);
				// System.out.println(line);
			}

			// 문자열을 JSON으로 파싱
			JSONParser jsonParser = new JSONParser();
			JSONObject jsonObj = (JSONObject) jsonParser.parse(result);

			// 날씨 출력
			JSONArray weatherArray = (JSONArray) jsonObj.get("weather");
			JSONObject obj = (JSONObject) weatherArray.get(0);
			System.out.println("날씨 : " + obj.get("id"));

			val = obj.get("id").toString();
			sample = Integer.parseInt(val);

			val = s.wDescEngToKor(sample);

			bf.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		return val;
	}

	double weathertemp(String loca) {
		double val = 00.00;
		try {
			// 서울시청의 위도와 경도
			String urlstr = "http://api.openweathermap.org/data/2.5/weather?" + "q=" + loca
					+ "&appid=082b31d2f7ab5b654775052d887b7b0c";
			URL url = new URL(urlstr);
			BufferedReader bf;
			String line;
			String result = "";

			// 날씨 정보를 받아온다.
			bf = new BufferedReader(new InputStreamReader(url.openStream()));

			// 버퍼에 있는 정보를 문자열로 변환.
			while ((line = bf.readLine()) != null) {
				result = result.concat(line);
				// System.out.println(line);
			}

			// 문자열을 JSON으로 파싱
			JSONParser jsonParser = new JSONParser();
			JSONObject jsonObj = (JSONObject) jsonParser.parse(result);

			// 온도 출력(절대온도라서 변환 필요)
			JSONObject mainArray = (JSONObject) jsonObj.get("main");
			double ktemp = Double.parseDouble(mainArray.get("temp").toString());
			double temp = ktemp - 273.15;

			val = temp;

			bf.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		return val;
	}

}
