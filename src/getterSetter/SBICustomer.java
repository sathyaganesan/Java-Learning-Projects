package getterSetter;

public class SBICustomer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StateBank sbi = new StateBank();
		int minimum = sbi.getMinBalance();
		System.out.println("Minimum Balance " + minimum);
		
		int emi = sbi.getEMI();
		System.out.println("EMI beofre Set " + emi);
		
		sbi.setEMI(200);
		emi = sbi.getEMI();
		System.out.println("EMI after set value " +emi);
	}

}
