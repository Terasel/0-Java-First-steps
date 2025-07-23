package exercicibigdecimal;

import java.math.BigDecimal;

public class ExerciciBigDecimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double num1 = 0.1;
		double num2 = 0.2;
		
		System.out.println(num1 + num2);
		
		BigDecimal num3 = new BigDecimal("0.01");
		BigDecimal num4 = new BigDecimal("0.02");
		BigDecimal resposta = num3.add(num4);
		
		System.out.println(resposta);
		
	}

}
