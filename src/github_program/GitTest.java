package github_program;

public class GitTest {
	
	public static void reverseCheck() {
		String str = "BIKASH";

		// Time for StringBuilder
		long startBuilder = System.nanoTime();
		String revBuilder = new StringBuilder(str).reverse().toString();
		long endBuilder = System.nanoTime();

		// Time for StringBuffer
		long startBuffer = System.nanoTime();
		String revBuffer = new StringBuffer(str).reverse().toString();
		long endBuffer = System.nanoTime();

		long builderTime = endBuilder - startBuilder;
		long bufferTime = endBuffer - startBuffer;

		System.out.println("Reverse using StringBuilder: " + revBuilder);
		System.out.println("Time taken by StringBuilder: " + builderTime + " ns");

		System.out.println("Reverse using StringBuffer: " + revBuffer);
		System.out.println("Time taken by StringBuffer is too late: " + bufferTime + " ns");

	}

	public static void main(String[] args) {
		
        GitTest.reverseCheck();
	}
}
