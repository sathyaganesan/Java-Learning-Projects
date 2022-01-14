package interfaceDemo;

public interface EmployeeRules {
	int salary = 2000; // by default these variables are final and static
	int leave = 20;
	
	public void maintainHours();  // by default these methods are abstract.
	public void relocate();
	public void report();
	public void dress();
}
