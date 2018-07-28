package com.zls.mrj;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;

public class OtherTest {

	public static void main(String[] args) {
//		test22();·	
//		RoundingMode.UP;
//		BigDecimal.ROUND_UP;
		List<String> list = new ArrayList<String>(){{System.out.println("ok");}};
	}
	
	public static void test21() {
		System.out.println(-1 % 2);
		System.out.println(-3 % 2);
		
		System.out.println(remainder(-1, 2));
		System.out.println(remainder(-3, 2));
		System.out.println(-1 / 2);
		System.out.println(-2 / 2);
		System.out.println(-3 / 2);
	}
	public static int remainder(int dividend, int divisor) {
		return dividend - dividend / divisor * divisor;
	}

	public static void test22() {
		System.out.println(10.00 - 9.60);
	}

	
}
