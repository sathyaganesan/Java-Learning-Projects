package interfaceDemo;

public class EmployeeNigeria implements EmployeeRulesNigeria {
	
	public void maintainHours() { // by default these methods are abstract.
		System.out.println("40 hours");
	}; 
	public void relocate() {
		System.out.println("To other city");
	};
	public void report() {
		System.out.println("Reporting to Manager");
	};
	public void dress() {
		System.out.println("Formal Dress");
	};
	public void salaryDate() {
		System.out.println("Monthly Payment");
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmployeeNigeria ne = new EmployeeNigeria();
		System.out.println(EmployeeRulesNigeria.salary);
			
	}
}
