
import java.awt.*;
import java.awt.event.*;
import java.io.IOException;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.event.*;
import java.lang.NullPointerException;

public class Operator extends JFrame {

	// test
	Cutter c = new Cutter();
	PublicDateGetter p = new PublicDateGetter();
	Messages m = new Messages();
	smalltool s = new smalltool();
	//
	// 홈패널 구성요소
	JPanel homeP = new JPanel();
	JLabel hlb = new JLabel("Weather Forecast");
	JTextField SiTf = new JTextField("지역(시)를 영어로");
	JTextField DongTf = new JTextField();
	JButton WB = new JButton("\uC77C\uAE30\uC608\uBCF4");
	JButton DB = new JButton("\uBBF8\uC138\uBA3C\uC9C0");
	JComboBox DoCB = new JComboBox();

	JButton Hop = new JButton("?");
	//

	/*
	 * sunset.jpg 의 경로명이 "images/sunset.jpg"인 경우 ImageIcon image = new
	 * ImageIcon("images/sunset.jpg"); JLabel jLabel = new JLabel(image);
	 */

	// 미세먼지 패널 구성요소
	JPanel DP = new JPanel();
	JLabel DPLb = new JLabel("Fine Dust Forecast");

	ImageIcon img = new ImageIcon("bin/image.jpg"); // 추후에 멀티리스터 if 문에 들어감
	JLabel DImage = new JLabel(img);

	String DC;
	JLabel DContent = new JLabel(DC);
	JButton DButton1 = new JButton(new ImageIcon(getClass().getClassLoader().getResource("!.jpg")));
	JButton DButton2 = new JButton("new");
	JButton DButton3 = new JButton(new ImageIcon(getClass().getClassLoader().getResource("home.jpg")));
	//

	// 일기예보 패널 구성요소
	String WC;
	JLabel Wlabel = new JLabel("Temperature forecast");
	JPanel WP = new JPanel();
	JButton WButton2 = new JButton(new ImageIcon(getClass().getClassLoader().getResource("home.jpg")));
	JButton WButton1 = new JButton(new ImageIcon(getClass().getClassLoader().getResource("!.jpg")));
	JLabel WImg = new JLabel(img);
	JLabel WCont = new JLabel("");

	// Change color 패널 구성
	JPanel CP = new JPanel();
	JLabel Clabel = new JLabel("Change Color");
	JButton Color1 = new JButton("ORANGE");
	JButton Color2 = new JButton("WHITE");
	JButton Color3 = new JButton("GREEN");
	JButton Color4 = new JButton("PINK");
	JButton Color5 = new JButton("CYAN");
	JButton Color6 = new JButton("GRAY");
	JButton Chome = new JButton(new ImageIcon(getClass().getClassLoader().getResource("home.jpg")));

	//

	// 그 외의 코드 실행에 필요한 값들
	String aVal = "서울";
	String tV;

	//
	Operator() {
		// 홈패널 구성
		setTitle("날씨예보프로그램");
		System.setProperty("file.encoding", "UTF-8");

		System.out.println("test");
		setBounds(100, 100, 400, 400);

		homeP.setBorder(new EmptyBorder(5, 5, 5, 5));
		homeP.setLayout(null);

		hlb.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.BOLD, 26));
		hlb.setHorizontalAlignment(SwingConstants.CENTER);
		homeP.add(hlb);
		hlb.setBounds(92, 46, 206, 43);

		homeP.add(DoCB);
		DoCB.setModel(new DefaultComboBoxModel(new String[] { "서울", "부산", "대구", "인천", "광주", "대전", "울산", "경기", "강원",
				"충북", "충남", "전북", "전남", "경북", "경남", "제주", "세종" }));
		DoCB.setFont(new Font("HY그래픽M", Font.BOLD, 12));

		DoCB.setBounds(50, 200, 124, 32);

		homeP.add(SiTf);
		SiTf.setColumns(10);
		SiTf.setBounds(50, 260, 124, 32);

		homeP.add(DongTf);
		DongTf.setColumns(10);
		// DongTf.setBounds(357, 289, 124, 32);

		WB.setFont(new Font("휴먼편지체", Font.BOLD, 19));
		homeP.add(WB);
		WB.setBounds(210, 200, 145, 32);

		DB.setFont(new Font("휴먼편지체", Font.BOLD, 19));
		homeP.add(DB);
		DB.setBounds(210, 300, 145, 32);

		Hop.setHorizontalAlignment(SwingConstants.CENTER);
		Hop.setBounds(320, 46, 44, 39);
		homeP.add(Hop);
		setContentPane(homeP);
		setVisible(true);
		//

		// 미세먼지 패널 구성

//   DP.setSize(300,300);

		DP.setBorder(new EmptyBorder(5, 5, 5, 5));
		DP.setLayout(null);

		DPLb.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.BOLD, 26));
		DPLb.setHorizontalAlignment(SwingConstants.CENTER);
		DP.add(DPLb);
		DPLb.setBounds(92, 46, 206, 43);

		// DContent.setBounds(256, 167, 170, 170);
//      DP.add(DContent);

		DButton1.setBounds(25, 100, 60, 60);
		DP.add(DButton1);

		DButton2.setBounds(550, 236, 97, 32);
		DP.add(DButton2);

		DButton3.setBounds(25, 25, 60, 60);
		DP.add(DButton3);

		//

		// 일기 예보 패널 구성

		WP.setBorder(new EmptyBorder(5, 5, 5, 5));
		WP.setLayout(null);
		WP.setBounds(100, 100, 300, 300);
		Wlabel.setBounds(92, 46, 206, 43);
		Wlabel.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.BOLD, 23));
		Wlabel.setHorizontalAlignment(SwingConstants.CENTER);
		WP.add(Wlabel);

		WButton2.setBounds(25, 25, 60, 60);
		WButton2.setFont(new Font("휴먼편지체", Font.BOLD, 19));
		WP.add(WButton2);

		WButton1.setBounds(25, 100, 60, 60);
		WButton1.setFont(new Font("휴먼편지체", Font.BOLD, 19));
		WP.add(WButton1);

		WImg.setBounds(37, 181, 157, 139);
		WP.add(WImg);

		WCont.setBounds(255, 181, 157, 139);
		WP.add(WCont);

		// Change Color

		CP.setLayout(null);

		Clabel.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.BOLD, 26));
		Clabel.setHorizontalAlignment(SwingConstants.CENTER);
		CP.add(Clabel);
		Clabel.setBounds(92, 46, 206, 43);

		Color1.setBounds(56, 166, 107, 23);
		CP.add(Color1);

		Color2.setBounds(56, 213, 107, 23);
		CP.add(Color2);

		Color3.setBounds(56, 261, 107, 23);
		CP.add(Color3);

		Color4.setBounds(216, 166, 107, 23);
		CP.add(Color4);

		Color5.setBounds(216, 213, 107, 23);
		CP.add(Color5);

		Color6.setBounds(216, 261, 107, 23);
		CP.add(Color6);

		Chome.setBounds(25, 25, 60, 60);
		CP.add(Chome);

		// 멀티리스너 선언 및 부착
		MyMultiListener ml = new MyMultiListener();
		WB.addActionListener(ml);
		DB.addActionListener(ml);
		DoCB.addActionListener(ml);
		Hop.addActionListener(ml);

		DButton1.addActionListener(ml);
		DButton2.addActionListener(ml);
		DButton3.addActionListener(ml);

		WButton1.addActionListener(ml);
		WButton2.addActionListener(ml);

		Color1.addActionListener(ml);
		Color2.addActionListener(ml);
		Color3.addActionListener(ml);
		Color4.addActionListener(ml);
		Color5.addActionListener(ml);
		Color6.addActionListener(ml);
		Chome.addActionListener(ml);
	}

	public class MyMultiListener implements ActionListener {
		ImageIcon img = new ImageIcon();
		public void actionPerformed(ActionEvent e) {
			if (e.getSource() == DB) { // 미세먼지 버튼 눌렀을때
				
				try {

					DC = m.pm10me(p.pm10getter(aVal));

					System.out.println(DC);
				} catch (IOException e1) {
					e1.printStackTrace();
				}

				DContent = new JLabel(DC);

				DContent.setBounds(190, 167, 170, 170);
				DContent.setHorizontalAlignment(SwingConstants.CENTER);

				DP.add(DContent);

				setContentPane(DP);

				try {
					switch (p.pm10getter(aVal)) {
					case "1":
						img = new ImageIcon(getClass().getClassLoader().getResource("good.jpg"));
						break;

					case "2":
						img = new ImageIcon(getClass().getClassLoader().getResource("soso.jpg"));
						break;
					case "3":
						img = new ImageIcon(getClass().getClassLoader().getResource("bad.jpg"));
						break;
					case "4":
						img = new ImageIcon(getClass().getClassLoader().getResource("uu.jpg"));
						break;
					default:
						System.out.println("error testdfadsfa : " + aVal);
						break;

					}
				} catch (IOException e2) {
					// TODO Auto-generated catch block
					e2.printStackTrace();
				}

				DImage = new JLabel(img);

				DImage.setBounds(10, 180, 170, 170);
				DP.add(DImage);
				// test

				try {
					System.out.println("getter val" + p.pm10getter(aVal));
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				try {
					// System.out.println("img val : " + m.pm10img(p.pm10getter(aVal)));
					if (m.pm10me(p.pm10getter(aVal)) == "error") {
						JOptionPane.showMessageDialog(DP, "해당지역의 정보는 현재 조회되지 않습니다.");

					}
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				// ----------------

				setVisible(true);

				// 오늘의 날씨에 따라 if 문 사용해서 brunch 함

				//
			}
			if (e.getSource() == WB) { // 일기예보 버튼 눌렀을때

				tV = SiTf.getText();
				if (tV == null) {
					JOptionPane.showMessageDialog(null, "텍스트 창에 사시는 지역(시)를 영어로 입력해주세요");
				}
				ImageIcon img = new ImageIcon();
				if (p.weatherloca(tV) == null) {
					JOptionPane.showMessageDialog(null, "<html>지역(시)를 확인하여 주십시오.<br> 지역은 영어로 입력해주세요</html>");
				}
				WC = "<html>현재 지역 : " + p.weatherloca(tV) + "<br>현재 날씨 : " + p.weatherinfo(tV) + "<br>현재 기온 : "
						+ p.weathertemp(tV) + "도<html>";

				WCont = new JLabel(WC);

				WCont.setBounds(190, 167, 170, 170);
				WCont.setHorizontalAlignment(SwingConstants.CENTER);
				WP.add(WCont);

				// test

				switch (s.weatherimg(p.weatherinfo(tV))) {
				case 1:
					//System.out.println("test img1");
					 img = new ImageIcon(getClass().getClassLoader().getResource("thor.png"));
					break;

				case 2:
					//System.out.println("test img2");
					 img = new ImageIcon(getClass().getClassLoader().getResource("rain.png"));
					break;
				case 3:
					//System.out.println("test img3");
				img = new ImageIcon(getClass().getClassLoader().getResource("snow.png"));
					break;
				case 4:
					//System.out.println("test img4");
					 img = new ImageIcon(getClass().getClassLoader().getResource("clear.png"));
					break;
				case 5:
					//System.out.println("test img5");
					img = new ImageIcon(getClass().getClassLoader().getResource("mc.png"));
					break;
				case 6:
				//	System.out.println("test img6");
					img = new ImageIcon(getClass().getClassLoader().getResource("wind.png"));
					break;
				default:
					System.out.println("error testdfadsfa : " + aVal);
					break;

				}

				WImg = new JLabel(img);

				WImg.setBounds(10, 180, 170, 170);
				WP.add(WImg);
				//

				setContentPane(WP);
				setVisible(true);

				// 오늘의 날씨에 따라 if 문 사용해서 brunch 함

				//
			}
			if (e.getSource() == DButton3) { // 홈으로 가기 눌렀을 때
				DContent.setText("");
				//

				DImage.setIcon(null);

				setContentPane(homeP);

				setVisible(true);
			}
			if (e.getSource() == DButton1) { // ! 버튼을 눌렀을 때

				try {
					JOptionPane.showMessageDialog(null,
							"<html> 0 ~ 30 : 좋음 / 30 ~ 80 보통 / 80 ~ 150 나쁨 / 151 ~ 매우 나쁨 <br>해당지역(" + aVal
									+ ") 의 미세먼지 농도 <br> pm10 = " + c.pm10Value(p.pm25getter(aVal)) + "<br><br> pm25 = "
									+ c.pm25Value(p.pm25getter(aVal)) + "<br><br>한국 평균 : 100<html>");
				} catch (HeadlessException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				setVisible(true);

			}
			if (e.getSource() == Chome) { // 홈으로 가기 눌렀을 때

				setContentPane(homeP);

				setVisible(true);
			}
			if (e.getSource() == WButton1) { // 뒤로가기 눌렀을때
				try {
					JOptionPane.showMessageDialog(null, "<html>" + p.weathergetter(null) + "<html>");
				} catch (HeadlessException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				setVisible(true);
			}
			if (e.getSource() == WButton2) { // 뒤로가기 눌렀을때
				WCont.setText("");
				//

				// DImage.setIcon(null);

				setContentPane(homeP);

				setVisible(true);
			}
			if (e.getSource().equals(DoCB)) {
				JComboBox cb = (JComboBox) e.getSource();
				aVal = (String) cb.getSelectedItem();
				System.out.println(aVal);
				// 콤보박스를 통하여 입력을 받으면 그 값을 반환하여 val 필드에 저장함
			}
			if (e.getSource() == Hop) { // 뒤로가기 눌렀을때
				setContentPane(CP);
				setVisible(true);
			}
			if (e.getSource() == Color1) { // 뒤로가기 눌렀을때
				CP.setBackground(Color.ORANGE);
				homeP.setBackground(Color.ORANGE);
				DP.setBackground(Color.ORANGE);
				WP.setBackground(Color.ORANGE);
			}
			if (e.getSource() == Color2) { // 뒤로가기 눌렀을때
				CP.setBackground(Color.WHITE);
				homeP.setBackground(Color.WHITE);
				DP.setBackground(Color.WHITE);
				WP.setBackground(Color.WHITE);
			}
			if (e.getSource() == Color3) { // 뒤로가기 눌렀을때
				CP.setBackground(Color.GREEN);
				homeP.setBackground(Color.GREEN);
				DP.setBackground(Color.GREEN);
				WP.setBackground(Color.GREEN);
			}
			if (e.getSource() == Color4) { // 뒤로가기 눌렀을때
				CP.setBackground(Color.PINK);
				homeP.setBackground(Color.PINK);
				DP.setBackground(Color.PINK);
				WP.setBackground(Color.PINK);
			}
			if (e.getSource() == Color5) { // 뒤로가기 눌렀을때
				CP.setBackground(Color.cyan);
				homeP.setBackground(Color.cyan);
				DP.setBackground(Color.cyan);
				WP.setBackground(Color.cyan);
			}
			if (e.getSource() == Color6) { // 뒤로가기 눌렀을때
				CP.setBackground(Color.GRAY);
				homeP.setBackground(Color.GRAY);
				DP.setBackground(Color.GRAY);
				WP.setBackground(Color.GRAY);
			}
		}
	}

	public static void main(String[] args) {
		new Operator();
	}

}