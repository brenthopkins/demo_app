package codilityTest;

import java.util.ArrayList;
import java.util.Iterator;

import org.junit.Assert;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

//import codilityTest.TapeEquilibriumTest.createData;

class FibFrogTest {
	private FibFrog solution;
	private ArrayList<createData> testSets = new ArrayList<createData>();

	class createData {
		private int[] testArray;
		private int testExpected;

		public int[] getTestArray() {
			return testArray;
		}

		public void setTestArray(int[] testArray) {
			this.testArray = testArray;
		}

		public int getTestExpected() {
			return testExpected;
		}

		public void setTestExpected(int testExpected) {
			this.testExpected = testExpected;
		}
	}

	@BeforeEach
	void setUp() throws Exception {
		solution = new FibFrog();

		createData testSet = new createData();
		testSet.setTestArray(new int[] { 0, 0, 0, 1, 1, 0, 1, 0, 0, 0, 0 });
		testSet.setTestExpected(3);
		testSets.add(testSet);

		createData testSet1 = new createData();
		testSet1.setTestArray(new int[] { 0, 0, 0, 1, 1, 0, 1, 0, 0, 0, 0 });
		testSet1.setTestExpected(3);
		testSets.add(testSet1);
		
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void test() {
		Iterator<createData> iterator = testSets.iterator();
		while (iterator.hasNext()) {
			createData testSet = (createData) iterator.next();
			Assert.assertEquals(solution.solution(testSet.getTestArray()), testSet.getTestExpected());
		}
	}

}
