package Encapsulation;

public class Person {

    private String name;
    private int age;
    
    public Person(String n, int a)
    {
   	 this.name=n;
   	 this.age=a;
    }
    

	public void setName(String n)
    {
   	 name=n;
    }
    
    public void setId(int a)
    {
   	 age=a;
    }
    
    public String getName()
    {
   	 return name;
    }
    
    public int getId()
    {
   	 return age;
    }
}


