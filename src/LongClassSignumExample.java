public class LongClassSignumExample {
	public static void main(String[] args) {

		// Passing the primitive long value
		Long lValue = new Long(100000);
		System.out.println("signum + :" + Long.signum(lValue));

		System.out.println("signum 0  :" + Long.signum(0));

		System.out.println("signum - :" + Long.signum(-100000));
	}
}
