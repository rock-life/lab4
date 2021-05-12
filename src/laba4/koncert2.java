package laba4;

import java.io.Serializable;
import java.time.LocalDate;

public class koncert2 extends artyst implements Serializable{
private LocalDate date;
private int v, id;
public koncert2 () {};
public koncert2(int id, String name,String janr,LocalDate date, int k) 
{super(name, janr);this.date=date;v=k;this.id=id;}
public int get_id() {return id;}
public String get_art() {return name;}
public String get_janr() {return janr;}
public LocalDate get_date() {return date;}
public int get_hl() {return v;}
@Override
public void show()
{
	System.out.print("\nВиконавець - "+name+"; Жанр - "+janr);
	System.out.print("\nДата концерту - "+date+"; Кількість відвідувачів - "+v+"; Ідентифікатор - "+id);
}
@Override
public void k_s()
{
	int i=janr.length() - janr.replace(" ", "").length()+1;
	System.out.print("Кількість слів у назві жанру - "+i);
}
}
