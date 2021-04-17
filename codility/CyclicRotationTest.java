package codilityTest;

import java.util.ArrayList;
import java.util.Iterator;

import org.junit.Assert;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CyclicRotationTest {

	private ArrayList<createData> testSets = new ArrayList<createData>();
//	private CyclicRotation solution;
	private ShiftArray solution;

	@BeforeEach
	void setUp() throws Exception {
//		solution = new CyclicRotation();
		solution = new ShiftArray();

		createData testSet = new createData();
		testSet.setTestArray(new int[] { 3, 8, 9, 7, 6 });
		testSet.setTestRotations(3);
		testSet.setTestArrayExpected(new int[] { 9, 7, 6, 3, 8 });
		testSets.add(testSet);

		createData testSet1 = new createData();
		testSet1.setTestArray(new int[] { 0, 0, 0 });
		testSet1.setTestRotations(1);
		testSet1.setTestArrayExpected(new int[] { 0, 0, 0 });
		testSets.add(testSet1);

		createData testSet2 = new createData();
		testSet2.setTestArray(new int[] { 1, 2, 3, 4 });
		testSet2.setTestRotations(4);
		testSet2.setTestArrayExpected(new int[] { 1, 2, 3, 4 });
		testSets.add(testSet2);

		// wrap around more than once
		createData testSet3 = new createData();
		testSet3.setTestArray(new int[] { 1, 2, 3, 4 });
		testSet3.setTestRotations(5);
		testSet3.setTestArrayExpected(new int[] { 04, 1, 2, 3 });
		testSets.add(testSet3);

		// wrap around more than once, with negative
		createData testSet4 = new createData();
		testSet4.setTestArray(new int[] { 1, 2, -3, 4 });
		testSet4.setTestRotations(10);
		testSet4.setTestArrayExpected(new int[] { -3, 4, 1, 2 });
		testSets.add(testSet4);

		// wrap around > 10 times - same as rotate by 3 (99 mod 4 = 3)
		createData testSet5 = new createData();
		testSet5.setTestArray(new int[] { 1, 2, -3, 4 });
		testSet5.setTestRotations(99);
		testSet5.setTestArrayExpected(new int[] { 2, -3, 4, 1 });
		testSets.add(testSet5);

		// wrap around > 10 times - finish where it started
		createData testSet6 = new createData();
		testSet6.setTestArray(new int[] { -1, 2, -3, 4 });
		testSet6.setTestRotations(100);
		testSet6.setTestArrayExpected(new int[] { -1, 2, -3, 4 });
		testSets.add(testSet6);
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	class createData {
		private int[] testArray;
		private int testRotations;
		private int[] testArrayExpected;

		public int[] getTestArray() {
			return testArray;
		}

		public void setTestArray(int[] testArray) {
			this.testArray = testArray;
		}

		public int getTestRotations() {
			return testRotations;
		}

		public void setTestRotations(int testRotations) {
			this.testRotations = testRotations;
		}

		public int[] getTestArrayExpected() {
			return testArrayExpected;
		}

		public void setTestArrayExpected(int[] testArrayExpected) {
			this.testArrayExpected = testArrayExpected;
		}
	}

	@Test
	public void testSolution() {
		Iterator<createData> iterator = testSets.iterator();
		while (iterator.hasNext()) {
			createData testSet = (createData) iterator.next();
			int[] actualArray = solution.solution(testSet.getTestArray(), testSet.getTestRotations());
			Assert.assertEquals(testSet.getTestArrayExpected().length, actualArray.length);
			for (int i = 0; i < testSet.getTestArrayExpected().length; i++) {
				Assert.assertEquals(testSet.getTestArrayExpected()[i], actualArray[i]);
			}
		}
	}

}
