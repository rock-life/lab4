package laba4;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class action implements Serializable{
private static koncert k;
private static artyst a;
public static Map<Integer,koncert>list=new HashMap<Integer,koncert>();

public static void search()
{
Scanner in= new Scanner(System.in);
System.out.print("ID концерту - ");
int id=in.nextInt();
boolean i=true;
	for(Map.Entry<Integer ,koncert> entry: list.entrySet()) {
		  int key = entry.getKey();
		  koncert value = entry.getValue();
		  if(value.get_id()==id) {
			  System.out.println("Дані про концерт ");
			value.show();
			}
			  
		}
	if(i==true)
		System.out.print("Данні не знайдено");
}
public static void delete()
{
Scanner in= new Scanner(System.in);
System.out.print("ID концерту - ");
int i=in.nextInt();
list.remove(i);
save();
}
public static void show()
{
	for(Map.Entry<Integer ,koncert> entry: list.entrySet()) {
		  int key = entry.getKey();
		  koncert value = entry.getValue();
		  value.show();
		}
}
public static void add()
{
	LocalDate date;
	Scanner in=new Scanner(System.in);
	System.out.print("ID концерту - ");
	int id=in.nextInt();
	int act=1;
	for(Map.Entry<Integer ,koncert> entry: list.entrySet()) {
		  int key = entry.getKey();
		  koncert value = entry.getValue();
		  if(key==id)
		  {
			  System.out.println("ID концерту існує. редагувати?\n1 - якщо так");
			  act=in.nextInt();
		  }
		  }
	if(act==1) 
	{
	System.out.println("Виконавець - ");
	in.nextLine();
	String v=in.nextLine();
	System.out.println("Жанр - ");
	String j=in.nextLine();
	System.out.print("День концерту - ");
	int d=in.nextInt();
	System.out.print("Місяць концерту - ");
	int m=in.nextInt();
	System.out.print("Рік концерту - ");
	int y=in.nextInt();
	System.out.print("Кількість глядачів - ");
	int kv=in.nextInt();
	date=LocalDate.of(y,m,d);
	k=new koncert(id,v,j,date,kv);
	list.put(id, k);	
	save();}
}

public static void save()
{
	try(ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("C:\\Users\\Admin\\Desktop\\file.txt"))) 
	{
		oos.writeObject(list);
	}
	catch(Exception ex) {}
}

public static void start()
{
	try(ObjectInputStream oos=new ObjectInputStream(new FileInputStream("C:\\Users\\Admin\\Desktop\\file.txt"))) 
	{
		list=(HashMap<Integer,koncert>)oos.readObject();
	}
	catch(Exception ex) {System.out.print(ex.getMessage());}
}

public static void suma()
{
	int sum=0;
	for(Map.Entry<Integer ,koncert> entry: list.entrySet()) {
		  int key = entry.getKey();
		  koncert value = entry.getValue();
		  sum=sum+value.get_hl();
		}
	System.out.println("Загальна кількість глядачів - "+sum);
}

public static void tooK()
{
	int sum=0, temp=0;
	koncert kk=null;
	for(Map.Entry<Integer ,koncert> entry: list.entrySet()) {
		  int key = entry.getKey();
		  koncert value = entry.getValue();
		  if(temp<value.get_hl())
			  {
			  	temp=value.get_hl();
			  	kk=value;
			  }
		}
	System.out.println("Kонцерт з максимальною кількістю глядачів ");
	kk.show();
}
public static void k_s()
{
	Scanner in= new Scanner(System.in);
	System.out.print("Виконавець - ");
	String id=in.nextLine();
	boolean i=true;
		for(Map.Entry<Integer ,koncert> entry: list.entrySet()) {
			  int key = entry.getKey();
			  koncert value = entry.getValue();
			  if(value.get_art().equals(id)) {
				a=new artyst(value.get_art(), value.get_janr());
				a.k_s();
				i=false;
				}
				  
			}
		if(i==true)
			System.out.print("Данні не знайдено");
		
}
}
