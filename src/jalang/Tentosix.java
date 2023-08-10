package jalang;

public class Tentosix {
	public void tenToSixTran() {
		for (int radix = 3; radix < 12; radix++) {
		    final String s = Integer.toString(100, radix);
		    System.out.println("radix " + radix + " = " + s);
		}
		
	}
}
