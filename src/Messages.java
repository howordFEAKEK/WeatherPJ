import javax.swing.ImageIcon;

public class Messages {
	String me;

	String pm10me(String val) {
		//System.out.println("--------"+val);
		switch (val) {
		case "1":
			me = "<html>일상적인 실외활동 가능<html>";break;
		case "2":
			me = "<html>일상적인 실외활동은 가능,<br> 호흡기가 민감한 분들은 조심하세요.<html>";break;
		case "3":
			me = "<html>장기간 또는 무리한 <br>실외 활동을 삼가해주세요.<br><br> 특히 천식이 있으시다면,<br> 흡입기를 더 자주 사용해주세요.<html>";break;
		case "4":
			me = "<html>가급적 실내활동을<br> 해주세요. <br><br>민감군 환자일 경우<br> 의사와의 상의가 <br>필요한 수준입니다.<html>";break;
			default:
				me="error";break;
		}

		return me;
	}
	String pm10img(String val) {
		System.out.println("img--------"+val+"/");
		switch (val) {
		case "1":
			me = "./good.jpg";break; //추후에 멀티리스터 if 문에 들어감
		
		case "2":
			me = "./soso.jpg";break; //추후에 멀티리스터 if 문에 들어감;break;
		case "3":
			me = "./bad.jpg";break; //추후에 멀티리스터 if 문에 들어감;break;
		case "4":
			me = "./uu.jpg";break; //추후에 멀티리스터 if 문에 들어감;break;
		default:
			me="error";break;

		}
		return me;
	}
}
