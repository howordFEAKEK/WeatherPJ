import javax.swing.ImageIcon;

public class Messages {
	String me;

	String pm10me(String val) {
		//System.out.println("--------"+val);
		switch (val) {
		case "1":
			me = "<html>�ϻ����� �ǿ�Ȱ�� ����<html>";break;
		case "2":
			me = "<html>�ϻ����� �ǿ�Ȱ���� ����,<br> ȣ��Ⱑ �ΰ��� �е��� �����ϼ���.<html>";break;
		case "3":
			me = "<html>��Ⱓ �Ǵ� ������ <br>�ǿ� Ȱ���� �ﰡ���ּ���.<br><br> Ư�� õ���� �����ôٸ�,<br> ���Ա⸦ �� ���� ������ּ���.<html>";break;
		case "4":
			me = "<html>������ �ǳ�Ȱ����<br> ���ּ���. <br><br>�ΰ��� ȯ���� ���<br> �ǻ���� ���ǰ� <br>�ʿ��� �����Դϴ�.<html>";break;
			default:
				me="error";break;
		}

		return me;
	}
	String pm10img(String val) {
		System.out.println("img--------"+val+"/");
		switch (val) {
		case "1":
			me = "./good.jpg";break; //���Ŀ� ��Ƽ������ if ���� ��
		
		case "2":
			me = "./soso.jpg";break; //���Ŀ� ��Ƽ������ if ���� ��;break;
		case "3":
			me = "./bad.jpg";break; //���Ŀ� ��Ƽ������ if ���� ��;break;
		case "4":
			me = "./uu.jpg";break; //���Ŀ� ��Ƽ������ if ���� ��;break;
		default:
			me="error";break;

		}
		return me;
	}
}
