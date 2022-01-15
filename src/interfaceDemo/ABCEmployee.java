package interfaceDemo;

public class ABCEmployee implements EmployeeRules, FamilyRules {
	
//	Employee Rules
	
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
	
//	Family Rules
	
	public void takeCareOfParents() {
		System.out.println("Take care of parents");
	};
	public void helpFamily() {
		System.out.println("Helping Family");
	};
	public void dinnerTogether() {
		System.out.println("Eat dinner together");
	};
	public void enjoy() {
		System.out.println("Have fun together");
	};

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ABCEmployee abc = new ABCEmployee();
		
		abc.maintainHours();
		abc.relocate();
		
		System.out.println(EmployeeRules.salary);
		System.out.println(EmployeeRules.leave); // Since it's a static variable we can call directly.
		
		FamilyRules father = new ABCEmployee(); // Dynamic binding between interface and implementing class
		father.dinnerTogether();
	}

}
