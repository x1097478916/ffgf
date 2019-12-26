package view;

import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

import dao.*;
import entity.*;
public class MainUI {
	public static Student user=null;
	
	public static void show() throws Exception{
		Frame f=new Frame("ѧ��ѡ��ϵͳ");
		f.setSize(1100,700);
		f.setLocation(350, 110);
		f.setFont(new Font("����",Font.BOLD,30));
		Button btn1=new Button("ע��");
		btn1.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				try{RegisterUI.show();}catch(Exception a){};
			}
		});
		Button btn2=new Button("�޸�����");
		btn2.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				if(user==null) {
					System.out.println("���ȵ�¼");
				}
				try{ModifyPasswordUI.show();}catch(Exception a){};
			}
		});
		Button btn3=new Button("ѡ��");
		btn3.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				if(user==null) {
					System.out.println("���ȵ�¼");
				}
					try{CourseSelection2UI.show();}catch(Exception a){};
			}
		});
		Button btn4=new Button("��¼");
		btn4.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				try{LoginUI.show();}catch(Exception a){};
			}
		});
		Button btn5=new Button("ѡ����Ϣ");
		btn5.addMouseListener(new MouseAdapter(){
			public void mouseClicked(MouseEvent e) {
				if(user==null) {
					System.out.println("���ȵ�¼");
				}
				try{CourseSelection3UI.show();}catch(Exception a){};
			}
		});
		Button btn6=new Button("��ѡ");
		btn6.addMouseListener(new MouseAdapter(){
			public void mouseClicked(MouseEvent e) {
				if(user==null) {
					System.out.println("���ȵ�¼");
				}
				try{DropOutCourseUI.show();}catch(Exception a){};
			}
		});
		btn1.setBackground(new Color(135,206,235));
		btn1.setBounds(70,500,150,50);
		btn2.setBackground(new Color(135,206,235));
		btn2.setBounds(270,500,150,50);
		btn3.setBackground(new Color(135,206,235));
		btn3.setBounds(470,500,150,50);
		btn4.setBackground(new Color(135,206,235));
		btn4.setBounds(450,300,200,100);
		btn5.setBackground(new Color(135,206,235));
		btn5.setBounds(670,500,150,50);
		btn6.setBackground(new Color(135,206,235));
		btn6.setBounds(870,500,150,50);
		f.add(btn1);
		f.add(btn2);
		f.add(btn3);
		f.add(btn4);
		f.add(btn5);
		f.add(btn6);
		String bgpath = "bg.jpeg";
		ImageIcon background = new ImageIcon(bgpath);
		JLabel label = new JLabel(background);
		label.setBounds(0, 0, f.getWidth(), f.getHeight());
		f.add(label);
		f.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e){
				try{
					FileOutputStream fos=new FileOutputStream("CourseDao.txt");
					ObjectOutputStream oos=new ObjectOutputStream(fos);
					oos.writeObject(CourseDao.getInstance());
					oos.close();
					FileOutputStream fos2=new FileOutputStream("SCDao.txt");
					ObjectOutputStream oos2=new ObjectOutputStream(fos2);
					oos2.writeObject(SCDao.getInstance());
					oos2.close();
					FileOutputStream fos3=new FileOutputStream("StudentDao.txt");
					ObjectOutputStream oos3=new ObjectOutputStream(fos3);
					oos3.writeObject(StudentDao.getInstance());
					oos3.close();
					f.dispose();
				}catch (Exception a){};
			}
		});
		f.setVisible(true);
	}

}
