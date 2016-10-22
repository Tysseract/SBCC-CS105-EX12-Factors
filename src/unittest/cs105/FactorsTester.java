package unittest.cs105;

import static org.junit.Assert.assertEquals;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import edu.sbcc.cs105.Factors;

public class FactorsTester {
	private static final int maximumScore = 15;
	private static final int maximumAssignmentScore = 18;
	private static int totalScore;

	@BeforeClass
	public static void beforeTesting() {
		totalScore = 0;
	}

	@AfterClass
	public static void afterTesting() {
		System.out.printf("Your program's functionality scores %d out of %d.\n\n", totalScore, maximumScore);

		int difference = maximumAssignmentScore - maximumScore;
		String correctedPoint = (difference == 1) ? "point" : "points";

		System.out.printf("The assignment is worth a total of %d where the remainder of %d %s\n",
				maximumAssignmentScore, difference, correctedPoint);
		System.out.println("comes from grading related to documentation, algorithms, and other");
		System.out.println("criteria.");
	}

	@Test
	public void test150() {
		assertEquals("2 3 5 5 ", Factors.findFactors(150));
		
		totalScore += 4;
	}

	@Test
	public void test295() {
		assertEquals("5 59 ", Factors.findFactors(295));

		totalScore += 4;
	}

	@Test
	public void test1024() {
		assertEquals("2 2 2 2 2 2 2 2 2 2 ", Factors.findFactors(1024));
		
		totalScore += 3;
	}
	
	@Test
	public void test30030() {
		assertEquals("2 3 5 7 11 13 ", Factors.findFactors(30030));
		
		totalScore += 4;
	}
}
