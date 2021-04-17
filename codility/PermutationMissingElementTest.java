package codilityTest;

import java.util.ArrayList;
import java.util.Iterator;

import org.junit.Assert;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PermutationMissingElementTest {

	private PermutationMissingElement solution;
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
	public void setUp() {
		solution = new PermutationMissingElement();

		createData testSet = new createData();
		testSet.setTestArray(new int[] {});
		testSet.setTestExpected(1);
		testSets.add(testSet);

		createData testSet1 = new createData();
		testSet1.setTestArray(new int[] { 1 });
		testSet1.setTestExpected(2);
		testSets.add(testSet1);

		createData testSet2 = new createData();
		testSet2.setTestArray(new int[] { 2 });
		testSet2.setTestExpected(1);
		testSets.add(testSet2);

		createData testSet3 = new createData();
		testSet3.setTestArray(new int[] { 1, 3 });
		testSet3.setTestExpected(2);
		testSets.add(testSet3);

		createData testSet4 = new createData();
		testSet4.setTestArray(new int[] { 2, 3 });
		testSet4.setTestExpected(1);
		testSets.add(testSet4);

		createData testSet5 = new createData();
		testSet5.setTestArray(new int[] { 1, 2 });
		testSet5.setTestExpected(3);
		testSets.add(testSet5);

		createData testSet6 = new createData();
		testSet6.setTestArray(new int[] { 1, 3, 4 });
		testSet6.setTestExpected(2);
		testSets.add(testSet6);

		createData testSet7 = new createData();
		testSet7.setTestArray(new int[] { 2, 4, 3 });
		testSet7.setTestExpected(1);
		testSets.add(testSet7);

		createData testSet8 = new createData();
		testSet8.setTestArray(new int[] { 2, 3, 1, 5 });
		testSet8.setTestExpected(4);
		testSets.add(testSet8);

		createData testSet9 = new createData();
		testSet9.setTestArray(new int[] { 4, 2, 3, 1, 5, 6, 8, 9 });
		testSet9.setTestExpected(7);
		testSets.add(testSet9);

		createData testSet10 = new createData();
		testSet10.setTestArray(new int[] { 4, 2, 3, 1, 5, 6, 8, 7 });
		testSet10.setTestExpected(9);
		testSets.add(testSet10);
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testSolution() {
		Iterator<createData> iterator = testSets.iterator();
		while (iterator.hasNext()) {
			createData testSet = (createData) iterator.next();
			Assert.assertEquals(solution.solution(testSet.getTestArray()), testSet.getTestExpected());
		}
	}

}
