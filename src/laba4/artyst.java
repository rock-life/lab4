package laba4;

import java.io.Serializable;

public class artyst implements Serializable
{
	protected String name="",janr="";
	public artyst() {}
	public artyst(String name, String janr) 
	{
		this.name=name;
		this.janr=janr;
	}
	
	public void show() 
	{
		System.out.print("\n���������� - "+name+"; ���� - "+janr);
	}
	public void k_s()
	{
		int i=janr.length() - janr.replace(" ", "").length()+1;
		System.out.print("ʳ������ ��� � ���� ����� - "+i);
	}
}