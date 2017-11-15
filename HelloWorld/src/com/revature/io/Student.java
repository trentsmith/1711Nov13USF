package com.revature.io;
import java.io.Serializable;
//POJO - plain old java object
public class Student implements Serializable
{
	/*
	 * The SerialVersionUID is used as a version control in a serializable class. If you do not 
	 * explicitly declare one, the jvm will do it for you based on various aspects of your 
	 * serializable class.
	 */
	private static final long serialVersionUID = -1706602523015578910L;
	private String name;
	int age;
	public Student(String name, int age) 
	{
		super();
		this.name = name;
		this.age = age;
	}

	public Student() 
	{

	}
	public String getName() 
	{
		return name;
	}
	public void setName(String name) 
	{
		this.name = name;
	}
	public int getAge() 
	{
		return age;
	}
	public void setAge(int age) 
	{
		this.age = age;
	}
	@Override
	public String toString() 
	{
		return name + ":" + age+"\n";
	}
	
}