
public class LongClassZeroCountExample {
	public static void main(String[] args) {
		System.out.println("zero count:" + Long.numberOfTrailingZeros(000001000));

		System.out.println("zero count:" + Long.numberOfTrailingZeros(0100011000));
	}
}
