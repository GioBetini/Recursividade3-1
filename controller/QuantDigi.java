package controller;

public class QuantDigi {

	public QuantDigi() {
		super();
	}
	public int divideDez(int num) {
	if (num<=0) {
		return 0;
		}
	
	return 1 + divideDez(num/10);
	}
}
