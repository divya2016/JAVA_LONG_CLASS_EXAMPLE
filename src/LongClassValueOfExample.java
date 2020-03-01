
public class LongClassValueOfExample {
	public static void main(String[] args) {

		// parseLong method with radix 36 and capital value
		System.out.println("Value for radix 36 and capital value: " + Long.valueOf("DIVYA", 36));

		// parseLong method with radix 36 and small value
		System.out.println("Value for radix 36 and small value: " + Long.valueOf("divya", 36));

		// parseLong method without radix
		System.out.println("Value without radix" + Long.valueOf("10000"));

		// parseLong method without radix
		System.out.println("Value without radix" + Long.valueOf("divya"));
	}
}
