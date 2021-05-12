package laba4;

import java.io.Serializable;
import java.time.LocalDate;

public class koncert extends artyst implements Serializable{
private LocalDate date;
private int v, id;
public koncert () {};
public koncert(int id, String name,String janr,LocalDate date, int k) 
{super(name, janr);this.date=date;v=k;this.id=id;}
public int get_id() {return id;}
public String get_art() {return name;}
public String get_janr() {return janr;}
public LocalDate get_date() {return date;}
public int get_hl() {return v;}
@Override
public void show()
{
	super.show();
	System.out.print("\nДата концерту - "+date+"; Кількість відвідувачів - "+v+"; Ідентифікатор - "+id);
}
}
