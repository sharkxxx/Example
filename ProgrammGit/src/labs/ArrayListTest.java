package labs;
import java.util.*;



public class ArrayListTest 
{
public static void main(String[] args)
{
	//Заполнение staff тремя объектами ListEmployee
	ArrayList<ListEmployee> staff=new ArrayList<ListEmployee>();
	
	staff.add(new ListEmployee("Carl Cracker", 75000, 1987, 12,15) );
	staff.add(new ListEmployee("Harry Hacker",50000,1989,10,1));
	staff.add(new ListEmployee("Tony Tester", 40000,1990,3,15));
	staff.add(new ListEmployee("Tony Hacker", 80000,1979,3,15));
	staff.add(new ListEmployee("Tony Middle", 100000,1969,3,15));
	
	// Увелечение заработной платы на 5%
	for (ListEmployee e:staff)
		e.raiseSalary(5);
	
	//Вывод информации обо всех сотрудниках
	for (ListEmployee e: staff)
		System.out.println("name" +e.getName()
		+",salary=" +e.getSalary()+ ",hireDay=" +e.getHireDay());
		
	
}
	
	
}

class ListEmployee
{
	public ListEmployee(String n, double s, int year, int month, int day)
	
	{
		name=n;
		salary=s;
		GregorianCalendar calendar=new GregorianCalendar(year, month-1, day);
		hireDay=calendar.getTime();
		
	}
	
	public String getName()
	{
		return name;
	}
	
	public double getSalary()
	{
		return salary;
	}
	
	public Date getHireDay()
	{
		return hireDay;
	}
	
	public void raiseSalary(double byPercent)
	{
		double raise= salary*byPercent/100;
		salary+=raise;
	}
	
	private String name;
	private double salary;
	private Date hireDay;
	
	
	
	
	
	
	
	
	
	
	
}