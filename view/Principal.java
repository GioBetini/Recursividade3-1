package view;
import controller.QuantDigi;
public class Principal {

	public static void main(String[] args) {
		int num = 10;
		controller.QuantDigi qd = new controller.QuantDigi();
		int x = qd.divideDez(num);
		System.out.println("O número "+num+" possui "+x+" dígitos");
	}

}
