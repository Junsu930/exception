package edu.kh.exception.model.vo;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Child extends Parent{
	
	@Override
	public void method() throws FileNotFoundException {
		// 오버라이딩 시 
		// 예외는 같거나 더 좁은 범위여야 한다.
		// *좁은 범위 == 구체적인 예외
		
		// FileNotFoundException은
		// IOException의 자식 예외미으로 오버라이딩 가능
		
		// Exception은 IOException의 부모 예외이므로 오버라이딩 불가
		
		System.out.println("오버라이딩된 자식 메소드");
	}
	


}
