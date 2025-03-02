package fpt.demoCICD;

public class Calculator {
	public int add(int a, int b) {
		return a+b;
	}
	public int subtract(int a, int b) {
		return a-b;
	}
	public int multiply(int a, int b) {
		return a*b;
	}
	public int divide(int a, int b) {
		if(b==0) {
			throw new ArithmeticException("Loi: Khong the chia cho 0");
		}
		return a/b;
	}
	public int parseNumber(String input) {
		if(input==null) {
			throw new NullPointerException("Loi: Gia tri nhap vao bi null");
		}
		try {
			return Integer.parseInt(input);
		} catch (Exception e) {
			throw new NumberFormatException("Loi: Gia tri nhap vao khong hop le");
		}
	}
}
