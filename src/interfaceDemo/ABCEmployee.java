package interfaceDemo;

public class ABCEmployee implements EmployeeRules {
	
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

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ABCEmployee abc = new ABCEmployee();
		
		abc.maintainHours();
		abc.relocate();
	}

}
