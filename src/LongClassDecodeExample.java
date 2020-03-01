
public class LongClassDecodeExample {
	public static void main(String[] args) {
		// decimal conversion
		System.out.println("decode decimal = " + Long.decode("90"));
		// octal conversion
		System.out.println("decode octal = " + Long.decode("007"));
		// hex conversion
		System.out.println("decode hex = " + Long.decode("0x0f"));
	}
}
