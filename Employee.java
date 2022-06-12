
public class Employee {
	private String empid;
	private String empname;
	private int basicSalary;
	
	public Employee(String name, String id, int salary)
	{
		empname = name;
		empid = id;
		basicSalary = salary;
	}

	public String getEmpid()
	{
		return empid;
	}
	

	public void setEmpid(String id)
	{
		empid = id;
	}

	public String getEmpname() 
	{
		return empname;
	}

	public void setEmpname(String name) 
	{
		empname = name;
	}

	public int getBasicSalary()
	{
		return basicSalary;
	}

	public void setBasicSalary(int salary) 
	{
		basicSalary = salary;
	}
	
	public int calculateSalary()
	{
		 return basicSalary +1000
	}
	
	public String toString()
	{
		String str = ("Employee Name : "+ empname +
					 "\nEmployee Id : "+ empid +
					 "\nBasic Salary : " + basicSalary +"/n")
		return str;
	}

}
