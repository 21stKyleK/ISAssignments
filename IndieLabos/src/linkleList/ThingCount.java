package linkleList;//(c) A+ Computer Science
//www.apluscompsci.com

//Name -

import java.lang.RuntimeException;

public class ThingCount implements Comparable
{
	private int count;
	private Object thing;
	
	public ThingCount()
	{
		count = 0;
		thing = null;
	}
	
	public ThingCount(Object thang, int cnt)
	{
		count = cnt;
		thing = thang;
	}
	
	public int getCount()
	{
		return count;
	}
	
	public void setCount(int cnt)
	{
		count = cnt;
	}

	public void setThing(Object obj)
	{
		thing = obj;
	}	
	
	public Object getThing()
	{
		return thing;
	}
	
	public boolean equals(Object obj)
	{
		ThingCount other = (ThingCount)obj;
		if(other != null){
			if(getThing().equals(other.getThing()) && getCount() == other.getCount()){
				return true;
			}
		}
		return false;
	}
	
	public int compareTo(Object obj)
	{
		ThingCount other = (ThingCount)obj;
		if(!getThing().getClass().equals(other.getThing().getClass())){
			throw new RuntimeException("not the same type");
		}else if( !( getThing() instanceof Comparable && other.getThing() instanceof Comparable ) ){
			throw new RuntimeException("not implementing Comparable");
		}
		return ( (Comparable)getThing() ).compareTo(other.getThing()) ;		
	}
	
	public String toString()
	{
		return ""+ getThing() + " - " + getCount();
	}
}