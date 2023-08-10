package jalang.test;

import org.junit.Test;

import jalang.WrapperExam;

public class WrapperTest {
	@Test
	public void methodAaaTest() {
		WrapperExam exam = new WrapperExam();
		exam.methodAaa();
	}
@Test
	public void toMultiRadixStringTest() {
		System.out.println(WrapperExam.toMultiRadixString(120, 5));//static 객체생성 안하고 바로 쓰면됨 
	}
}