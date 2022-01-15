package getterSetter;

public class StateBank {
	
	private int minBalance = 2000;
	private int EMI = 100;
	
	public int getMinBalance() {
		return minBalance;
	}
	public void setMinBalance(int minBalance) {
		this.minBalance = minBalance;
	}
	public int getEMI() {
		return EMI;
	}
	public void setEMI(int eMI) {
		if(eMI > 100)
		EMI = eMI;
	}
	
	
}
