package laba4;

import java.util.Scanner;
public class laba4 {
	public static void main(String[] str) 
	{
		Scanner in=null;
		int v=10;
		while(v!=0) {
			try {
		in=new Scanner(System.in);
		System.out.println("������� ��������:\n1 - �����������\n2 - abstract  \n0 - �����");
		v=in.nextInt();
		switch(v) {
		case 1:one();break;
		case 2:two();break;
		case 3:break;}
			}
			catch(Exception ex) {System.out.print("������� ������ ������!");};
		}
	}
	public static void one()
	{
		action.start();
		Scanner in=null;
		String v="";
		do{
			in=new Scanner(System.in);
			System.out.println("\n������� ��������:\none - ������/���������� two - ������� tree - �������� \nfour - ����� five -�������� ������� ��������\nsix - ������� � ������������ ������� �������� sefen - ������� ��� � ���� �����");
			
			try {
				v=in.nextLine();
		switch(v) {
		case "one":action.add(); break;
		case "two":action.show(); break;
		case "tree":action.delete(); break;
		case "four":action.search(); break;
		case "five": action.suma(); break;
		case "six": action.tooK();break;
		case "sefen":action.k_s(); break;
		case "exit": break;
		default: System.out.print("Error value");
		
		}
			}
			catch(Exception ex) {System.out.print("������� ������ ������!");};
			}while(v.equals("exit")==false);
	}
	public static void two()
	{
		action2.start();
		Scanner in=null;
		String v="";
		do {
			try {
		in=new Scanner(System.in);
		System.out.println("\n������� ��������:\none - ������/���������� two - ������� tree - �������� \nfour - ����� five -�������� ������� ��������\nsix - ������� � ������������ ������� �������� sefen - ������� ��� � ���� �����");
		v=in.nextLine();
		switch(v) {
		case "one":action2.add(); break;
		case "two":action2.show(); break;
		case "tree":action2.delete(); break;
		case "four":action2.search(); break;
		case "five": action2.suma(); break;
		case "six": action2.tooK();break;
		case "sefen":action2.k_s(); break;
		case "exit": break;
		default: System.out.print("Error value");
		
		}
			}
			catch(Exception ex) {System.out.print(ex.getMessage());};
		}while(v.equals("exit")==false);;
	}
}
