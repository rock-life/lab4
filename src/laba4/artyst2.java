package laba4;

import java.io.Serializable;

public abstract class artyst2 implements Serializable
{
	protected String name="",janr="";
	public artyst2() {}
	public artyst2(String name, String janr) 
	{
		this.name=name;
		this.janr=janr;
	}
	
	public abstract void show();
	public abstract void k_s();
}