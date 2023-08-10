package jalang;

public class WrapperExam {//기본타입을 참조타입으로 감쌌다.
	//int = Integer 상호간 자동으로 변환이 된다./ -> packing / <- unpacking
	//char = character
	//long = Long
	//기본타입  참조타입
	//       Wrapper Class
	int k = new Integer("3");
	Integer h = 3;//VO Class에서 기본타입을 Wrapping type으로 정의하는 경우가 많다.
	public void methodAaa() {
		System.out.println( new Integer(3));
		System.out.println( Integer.BYTES );
		System.out.println( Integer.MIN_VALUE );
		System.out.println( Long.MAX_VALUE );
		System.out.println( Double.SIZE );
		System.out.println( Integer.parseInt("ABCDEF", 16));//16진수로 해석
		System.out.println( Integer.parseInt("123"));//("123", 10생략 가능)
		System.out.println( Integer.parseInt("123", 36));//최대 36 진수까지 쓸 수 있다.
		System.out.printf( "%X\n", 255);// 16진수
		System.out.println( Integer.toBinaryString(255));
		int kk = 0101110;//맨앞 0 이면 8진수 -> 10진수로 바꿔서 저장함
		int kkk = 0x101110;//16진수로 바꿔서 저장함
		System.out.println(kk);
		System.out.println( Integer.parseInt("123", 6));
	}
	//10진수를 6진수의 숫자로 바꾸기
	public static String toMultiRadixString(int number, int radix) {
		String result = "";
		String divData = "0123456789ABCDEFGHIJKLNMOPQRSTUVWXYZ";
		int sourceData = number;
		
		while( true ) {
			int devideNum = sourceData / radix;//몫이 나옴
			result = divData.charAt(sourceData % radix) + result;
			sourceData = devideNum;
			if( devideNum <= 0 ) break;
		}
		return result;
		//암호화 할 때 문자를 숫지로 변환해서 연결하는 방식을 적용
	}
	
}
