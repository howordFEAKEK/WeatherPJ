import java.awt.*;
import java.awt.event.*;
import java.io.IOException;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.event.*;
import java.lang.NullPointerException;

public class Operator extends JFrame {

	// test
	// Cutter c = new Cutter();
	PublicDateGetter p = new PublicDateGetter();
	Messages m = new Messages();
	//
	// Ȩ�г� �������
	JPanel homeP = new JPanel();
	JLabel hlb = new JLabel("Weather Forecast");
	JTextField SiTf = new JTextField();
	JTextField DongTf = new JTextField();
	JButton WB = new JButton("\uC77C\uAE30\uC608\uBCF4");
	JButton DB = new JButton("\uBBF8\uC138\uBA3C\uC9C0");
	JComboBox DoCB = new JComboBox();

	JButton Hop = new JButton("?");
	//

	/*
	 * sunset.jpg �� ��θ��� "images/sunset.jpg"�� ��� ImageIcon image = new
	 * ImageIcon("images/sunset.jpg"); JLabel jLabel = new JLabel(image);
	 */

	// �̼����� �г� �������
	JPanel DP = new JPanel();
	JLabel DPLb = new JLabel("Fine Dust Forecast");

	ImageIcon img = new ImageIcon("./image.jpg"); // ���Ŀ� ��Ƽ������ if ���� ��
	JLabel DImage = new JLabel(img);

	String DC;
	JLabel DContent = new JLabel(DC);
	JButton DButton1 = new JButton(new ImageIcon("./!.jpg"));
	JButton DButton2 = new JButton("new");
	JButton DButton3 = new JButton(new ImageIcon("./home.jpg"));
	//

	// �ϱ⿹�� �г� �������
	JLabel Wlabel = new JLabel("Temperature forecast");
	JPanel WP = new JPanel();
	JButton WButton2 = new JButton("\uC0C1\uC138\uC815\uBCF42");
	JButton WButton1 = new JButton("\uC0C1\uC138\uC815\uBCF41");
	JLabel WImg = new JLabel("Wimg");
	JLabel WCont = new JLabel("Wcont");

	//Change color �г� ����
	JPanel CP = new JPanel();
	JLabel Clabel = new JLabel("Change Color");
	JButton Color1 = new JButton("ORANGE");	
	JButton Color2= new JButton("WHITE");
	JButton Color3 = new JButton("GREEN");
	JButton Color4 = new JButton("PINK");
	JButton Color5= new JButton("YELLOW");
	JButton Color6 = new JButton("GRAY");
	JButton Chome = new JButton(new ImageIcon("./home.jpg"));
	
	//
	

	// �� ���� �ڵ� ���࿡ �ʿ��� ����
	String aVal = "����";

	//
	Operator() {
		// Ȩ�г� ����
		setTitle("�����������α׷�");
		System.out.println("test");
		setBounds(100, 100, 400, 400);

		homeP.setBorder(new EmptyBorder(5, 5, 5, 5));
		homeP.setLayout(null);

		hlb.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.BOLD, 26));
		hlb.setHorizontalAlignment(SwingConstants.CENTER);
		homeP.add(hlb);
		hlb.setBounds(92, 46, 206, 43);

		homeP.add(DoCB);
		DoCB.setModel(new DefaultComboBoxModel(new String[] { "����", "�λ�", "�뱸", "��õ", "����", "����", "���", "���", "����",
				"���", "�泲", "����", "����", "���", "�泲", "����", "����" }));
		DoCB.setFont(new Font("HY�׷���M", Font.BOLD, 12));

		DoCB.setBounds(50, 200, 124, 32);

		homeP.add(SiTf);
		SiTf.setColumns(10);
		// SiTf.setBounds(208, 289, 124, 32);

		homeP.add(DongTf);
		DongTf.setColumns(10);
		// DongTf.setBounds(357, 289, 124, 32);

		WB.setFont(new Font("�޸�����ü", Font.BOLD, 19));
		homeP.add(WB);
		WB.setBounds(210, 200, 145, 32);

		DB.setFont(new Font("�޸�����ü", Font.BOLD, 19));
		homeP.add(DB);
		DB.setBounds(210, 300, 145, 32);

		Hop.setHorizontalAlignment(SwingConstants.CENTER);
		Hop.setBounds(320, 46, 44, 39);
		homeP.add(Hop);
		setContentPane(homeP);
		setVisible(true);
		//

		// �̼����� �г� ����

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

		// �ϱ� ���� �г� ����

		WP.setBorder(new EmptyBorder(5, 5, 5, 5));
		WP.setLayout(null);
		WP.setBounds(100, 100, 300, 300);
		Wlabel.setBounds(143, 48, 384, 49);
		Wlabel.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.BOLD, 29));
		Wlabel.setHorizontalAlignment(SwingConstants.CENTER);
		WP.add(Wlabel);

		WButton2.setBounds(516, 288, 145, 32);
		WButton2.setFont(new Font("�޸�����ü", Font.BOLD, 19));
		WP.add(WButton2);

		WButton1.setBounds(516, 230, 145, 32);
		WButton1.setFont(new Font("�޸�����ü", Font.BOLD, 19));
		WP.add(WButton1);

		WImg.setBounds(37, 181, 157, 139);
		WP.add(WImg);

		WCont.setBounds(255, 181, 157, 139);
		WP.add(WCont);
		
		//Change Color 

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

		// ��Ƽ������ ���� �� ����
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

		public void actionPerformed(ActionEvent e) {
			if (e.getSource() == DB) { // �̼����� ��ư ��������
				ImageIcon img = new ImageIcon();
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
					m.pm10img(p.pm10getter(aVal));
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}

				try {
					img = new ImageIcon(m.pm10img(p.pm10getter(aVal)));
				} catch (IOException e1) {
					e1.printStackTrace();
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
					System.out.println("img val : " + m.pm10img(p.pm10getter(aVal)));
					if(m.pm10me(p.pm10getter(aVal))=="error") {
						JOptionPane.showMessageDialog(DP, "�ش������� ������ ���� ��ȸ���� �ʽ��ϴ�.");

					}
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				// ----------------
			
				setVisible(true);

				// ������ ������ ���� if �� ����ؼ� brunch ��

				//
			}
			if (e.getSource() == WB) { // �ϱ⿹�� ��ư ��������
				setContentPane(WP);
				setVisible(true);

				// ������ ������ ���� if �� ����ؼ� brunch ��

				//
			}
			if (e.getSource() == DButton3) { // Ȩ���� ���� ������ ��
				DContent.setText("");
				//

				DImage.setIcon(null);

				setContentPane(homeP);

				setVisible(true);
			}
			if (e.getSource() == Chome) { // Ȩ���� ���� ������ ��

				setContentPane(homeP);

				setVisible(true);
			}
			if (e.getSource() == WButton2) { // �ڷΰ��� ��������
				setContentPane(homeP);
				setVisible(true);
			}
			if (e.getSource().equals(DoCB)) {
				JComboBox cb = (JComboBox) e.getSource();
				aVal = (String) cb.getSelectedItem();
				System.out.println(aVal);
				// �޺��ڽ��� ���Ͽ� �Է��� ������ �� ���� ��ȯ�Ͽ� val �ʵ忡 ������
			}
			if (e.getSource() == Hop) { // �ڷΰ��� ��������
				setContentPane(CP);
				setVisible(true);
			}
			if (e.getSource() == Color1) { // �ڷΰ��� ��������
				CP.setBackground(Color.ORANGE);
				homeP.setBackground(Color.ORANGE);
				DP.setBackground(Color.ORANGE);
				WP.setBackground(Color.ORANGE);
			}
			if (e.getSource() == Color2) { // �ڷΰ��� ��������
				CP.setBackground(Color.WHITE);
				homeP.setBackground(Color.WHITE);
				DP.setBackground(Color.WHITE);
				WP.setBackground(Color.WHITE);
			}
			if (e.getSource() == Color3) { // �ڷΰ��� ��������
				CP.setBackground(Color.GREEN);
				homeP.setBackground(Color.GREEN);
				DP.setBackground(Color.GREEN);
				WP.setBackground(Color.GREEN);
			}
			if (e.getSource() == Color4) { // �ڷΰ��� ��������
				CP.setBackground(Color.PINK);
				homeP.setBackground(Color.PINK);
				DP.setBackground(Color.PINK);
				WP.setBackground(Color.PINK);
			}
			if (e.getSource() == Color5) { // �ڷΰ��� ��������
				CP.setBackground(Color.YELLOW);
				homeP.setBackground(Color.YELLOW);
				DP.setBackground(Color.YELLOW);
				WP.setBackground(Color.YELLOW);
			}
			if (e.getSource() == Color6) { // �ڷΰ��� ��������
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