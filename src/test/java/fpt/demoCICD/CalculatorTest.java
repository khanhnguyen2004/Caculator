package fpt.demoCICD;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class CalculatorTest {
	Calculator calculator=new Calculator();
	@BeforeAll
	public static void setupBeforeAll() {
		System.out.println("Khoi dong kiem thu - setupBeforeAll()");
	}
//	@BeforeEach
//	public void setup() {
//		System.out.println("Khoi tao doi tuong Calculator truoc moi bai kiem thu - setup()");
//	}
//	@Test
//	public void testAssertNotEquals() {
//		int result=calculator.add(3, 5);
//		assertNotEquals(7, result, "Ket qua khong duoc bang 7");
//		System.out.println("Kiem thu 1");
//	}
//	@Test
//	public void testAssertTrue() {
//		int result=calculator.multiply(3, 5);
//		assertTrue(result==15, "Ket qua phai dung 15");
//		System.out.println("Kiem thu 2");
//	}
//	@Test
//	public void testAssertEquals() {
//		int result=calculator.subtract(1, 2);
//		assertEquals(-1, result, "Ket qua phai bang -1");
//		System.out.println("Kiem thu 3");
//	}
//	@Test
//	public void testAssertFalse() {
//		int result=calculator.divide(15, 5);
//		assertFalse(result==4, "Ket qua phai khac 3");
//		System.out.println("Kiem thu 4");
//	}
//	@Test
//	public void testAssertNull() {
//		Integer result=null;
//		assertNull(result, "Ket qua phai la null");
//		System.out.println("Kiem thu 5");
//	}
//	@AfterEach
//	public void teardown() {
//		System.out.println("Don dep sau moi bai kiem thu - teardown()");
//	}
	@BeforeEach
	public void setup1() {
		System.out.println("Khoi tao doi tuong Calculator truoc moi bai kiem thu - setup1()");
	}
	@Test
	public void testDivideByZero() {
		assertThrows(ArithmeticException.class, () -> calculator.divide(10, 0));
		System.out.println("Loi: Khong the chia cho 0");
	}
	@Test
    public void testInvalidNumberFormat() {
		assertThrows(NumberFormatException.class, () -> calculator.parseNumber("abc"));
        System.out.println("Loi: Gia tri nhap vao khong phai so hop le");
	}
	@Test
    public void testNullPointerException() {
		assertThrows(NullPointerException.class, () -> calculator.parseNumber(null));
		System.out.println("Loi: Gia tri nhap vao bi null");
    }
	@AfterEach
	public void teardown1() {
		System.out.println("Don dep sau moi bai kiem thu - teardown1()");
	}
	@AfterAll
	public static void teardownAfterAll() {
		System.out.println("Ket thuc kiem thu - teardownAfterAll()");
	}
}
