package codilityTest;

import java.util.ArrayList;
import java.util.Iterator;

import org.junit.Assert;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

//import codilityTest.BinaryGapTests.Pair;

class BinaryGapTests {

	private BinaryGap solution;
	private ArrayList<Pair> testSets = new ArrayList<Pair>();
	class Pair {
		private int testNumber;
		private int testAnswer;

		public int getTestNumber() {
			return testNumber;
		}

		public void setTestNumber(int testNumber) {
			this.testNumber = testNumber;
		}

		public int getTestAnswer() {
			return testAnswer;
		}

		public void setTestAnswer(int testAnswer) {
			this.testAnswer = testAnswer;
		}

	}

	@BeforeEach
	void setUp() throws Exception {
		solution = new BinaryGap();
		
		Pair testSet = new Pair();		
		testSet.setTestNumber(0);
		testSet.setTestAnswer(0);
		testSets.add(testSet);

		Pair testSet1 = new Pair();		
		testSet1.setTestNumber(9);
		testSet1.setTestAnswer(2);
		testSets.add(testSet1);

		Pair testSet2 = new Pair();		
		testSet2.setTestNumber(32);
		testSet2.setTestAnswer(0);
		testSets.add(testSet2);

		Pair testSet3 = new Pair();		
		testSet3.setTestNumber(529);
		testSet3.setTestAnswer(4);
		testSets.add(testSet3);

		Pair testSet4 = new Pair();		
		testSet4.setTestNumber(1041);
		testSet4.setTestAnswer(5);
		testSets.add(testSet4);

		Pair testSet5 = new Pair();		
		testSet5.setTestNumber(65536);
		testSet5.setTestAnswer(0);
		testSets.add(testSet5);

		Pair testSet6 = new Pair();		
		testSet6.setTestNumber(65537);
		testSet6.setTestAnswer(15);
		testSets.add(testSet6);
		
		Pair testSet7 = new Pair();		
		testSet7.setTestNumber(100000);
		testSet7.setTestAnswer(4);
		testSets.add(testSet7);

		Pair testSet8 = new Pair();		
		testSet8.setTestNumber(2147483);
		testSet8.setTestAnswer(5);
		testSets.add(testSet8);

		Pair testSet9 = new Pair();		
		testSet9.setTestNumber(2147483637);
		testSet9.setTestAnswer(1);
		testSets.add(testSet9);

		Pair testSet10 = new Pair();		
		testSet10.setTestNumber(2147483646);
		testSet10.setTestAnswer(0);
		testSets.add(testSet10);

		Pair testSet11 = new Pair();		
		testSet11.setTestNumber(2147483647);
		testSet11.setTestAnswer(0);
		testSets.add(testSet11);
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testSolution() {
		Iterator<Pair> iterator = testSets.iterator();
		while (iterator.hasNext()) {
			Pair testSet = (Pair) iterator.next();
			System.out.println("Before Value to check = " + testSet.getTestNumber() + ";  Result = " + testSet.getTestAnswer());

			Assert.assertEquals(solution.solution(testSet.getTestNumber()),testSet.getTestAnswer());
		}
	}

}
