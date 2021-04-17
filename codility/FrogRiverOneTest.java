package codilityTest;

import java.util.ArrayList;
import java.util.Iterator;

import org.junit.Assert;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class FrogRiverOneTest {

	private FrogRiverOne solution;
	private ArrayList<createData> testSets = new ArrayList<createData>();

	class createData {
		private int[] testArray;
		private int testExpected;
		private int testX;

		public int getTestX() {
			return testX;
		}

		public void setTestX(int testX) {
			this.testX = testX;
		}

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
		solution = new FrogRiverOne();

		createData testSet = new createData();
		testSet.setTestX(5);
		testSet.setTestArray(new int[] { 1, 3, 1, 4, 2, 3, 5, 4 });
		testSet.setTestExpected(6);
		testSets.add(testSet);

		createData testSet1 = new createData();
		testSet1.setTestX(3);
		testSet1.setTestArray(new int[] { 1, 3 });
		testSet1.setTestExpected(-1);
		testSets.add(testSet1);

		createData testSet2 = new createData();
		testSet2.setTestX(2);
		testSet2.setTestArray(new int[] { 1, 1, 1, 1 });
		testSet2.setTestExpected(-1);
		testSets.add(testSet2);

		createData testSet3 = new createData();
		testSet3.setTestX(3);
		testSet3.setTestArray(new int[] { 1, 4, 2, 3 });
		testSet3.setTestExpected(3);
		testSets.add(testSet3);

		createData testSet4 = new createData();
		testSet4.setTestX(2);
		testSet4.setTestArray(new int[] { 1, 4, 2, 3 });
		testSet4.setTestExpected(2);
		testSets.add(testSet4);

		createData testSet5 = new createData();
		testSet5.setTestX(4);
		testSet5.setTestArray(new int[] { 1, 2, 3, 2, 3, 3, 1, 2, 2, 4, 2, 1 });
		testSet5.setTestExpected(9);
		testSets.add(testSet5);

		createData testSet6 = new createData();
		testSet6.setTestX(4);
		testSet6.setTestArray(new int[] { 1, 2, 3, 2, 3, 3, 1, 2, 4, 4, 2, 1 });
		testSet6.setTestExpected(8);
		testSets.add(testSet6);

		createData testSet7 = new createData();
		testSet7.setTestX(4);
		testSet7.setTestArray(new int[] { 1, 2, 3, 4, 3, 3, 1, 2, 4, 4, 2, 1 });
		testSet7.setTestExpected(3);
		testSets.add(testSet7);
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void test() {
		Iterator<createData> iterator = testSets.iterator();
		while (iterator.hasNext()) {
			createData testSet = (createData) iterator.next();
			Assert.assertEquals(solution.solution(testSet.getTestX(), testSet.getTestArray()),
					testSet.getTestExpected());
		}
	}

}
