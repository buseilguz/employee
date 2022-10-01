

public class Employee {
	private String name;
	private double salary;
	private int workHours;
	private int hireYear;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public int getWorkHours() {
		return workHours;
	}
	public void setWorkHours(int workHours) {
		this.workHours = workHours;
	}
	
	
	public int getHireYear() {
		return hireYear;
	}
	public void setHireYear(int hireYear) {
		this.hireYear = hireYear;
	}
	public Employee(String name, double salary, int workHours, int  hireYear) {
		super();
		this.name = name;
		this.salary = salary;
		this.workHours = workHours;
		this.hireYear = hireYear;
	}
	
	
	public double tax() {
		double tax=0;;
		if(getSalary()>=1000) {
			  tax=getSalary()*3/100;
		}
		
		 return tax;
	}
	
	
	public double bonus() {
		double bonus=0;
		if(getWorkHours()>40) {
		bonus=(getWorkHours()-40)*30;
		}
		return bonus;
	}
    public double raiseSalary() {
    	double raiseSalary=0;
    	double totalSalary=getSalary()+tax()+bonus();
    	int workingYear=2021-getHireYear();
    	if(workingYear<10) {
    		raiseSalary=totalSalary*0.05;
    	}
    	else if(workingYear>=10&&workingYear<20) {
    		raiseSalary=totalSalary*0.10;
    	}
    	else if(workingYear>19) {
    		raiseSalary=totalSalary*0.15;
    	}
		return raiseSalary;
    }
    public String toString() {
		return "Çalýþanýn Adý Soyadý :"+getName()+"\n"+
				"Çalýþanýn Maaþý :"+getSalary()+"\n"+
				"Haftalýk Çalýþma Saati :"+getWorkHours()+"\n"+
				"Ýþe Baþlangýç Yýlý :"+getHireYear()+"\n"+
				"Vergi:"+tax()+"\n"+
				"Bonus :" +bonus()+"\n"+
				"Kýdem Bonusu :"+raiseSalary()+"\n"+
				"Toplam  Maaþ :"+ (getSalary()+bonus()+raiseSalary()-tax())
		
				;
    	
    }
    
    
    
}
