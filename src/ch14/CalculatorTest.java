package ch14;

public class CalculatorTest {

	public static void main(String[] args) {

		int num1 = 10;
		int num2 = 2;
		int[] arr = {1, 2, 3, 4, 5};
		
		Calc calc = new CompleteCalc();

		System.out.println(calc.add(num1, num2));
		System.out.println(calc.subtract(num1, num2));
		System.out.println(calc.times(num1, num2));
		System.out.println(calc.divide(num1, num2));
		
		/*
		 * Interface default 메서드 사용
		 * implements 한 객체에서 override 가능
		 */
		calc.description();
		
		/*
		 * Interface static 메서드 사용
		 * instance화(implements한 객체) 필요없음
		 * 클래스.메서드() 호출 가능 
		 */
		System.out.println(Calc.total(arr));
		
	}

}
