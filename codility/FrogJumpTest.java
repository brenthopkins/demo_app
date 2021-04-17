package codilityTest;

import java.util.ArrayList;
import java.util.Iterator;

import org.junit.Assert;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

//import codilityTest.CyclicRotationTest.createData;

class FrogJumpTest {

	private FrogJump solution;
	private ArrayList<createData> testSets = new ArrayList<createData>();

	class createData {
		private int testX;
		private int testY;
		private int testD;
		private int testJumps;

		public int getTestX() {
			return testX;
		}

		public void setTestX(int testX) {
			this.testX = testX;
		}

		public int getTestY() {
			return testY;
		}

		public void setTestY(int testY) {
			this.testY = testY;
		}

		public int getTestD() {
			return testD;
		}

		public void setTestD(int testD) {
			this.testD = testD;
		}

		public int getTestJumps() {
			return testJumps;
		}

		public void setTestJumps(int testJumps) {
			this.testJumps = testJumps;
		}
	}

	@BeforeEach
	public void setUp() {
		solution = new FrogJump();
		
		createData testSet = new createData();
		testSet.setTestX(10);
		testSet.setTestY(85);
		testSet.setTestD(30);
		testSet.setTestJumps(3);
		testSets.add(testSet);
		
		createData testSet1 = new createData();
		testSet1.setTestX(1);
		testSet1.setTestY(14);
		testSet1.setTestD(3);
		testSet1.setTestJumps(5);
		testSets.add(testSet1);
		
		createData testSet2 = new createData();
		testSet2.setTestX(100);
		testSet2.setTestY(1001);
		testSet2.setTestD(100);
		testSet2.setTestJumps(10);
		testSets.add(testSet2);
		
		createData testSet3 = new createData();
		testSet3.setTestX(150000);
		testSet3.setTestY(999999);
		testSet3.setTestD(10000);
		testSet3.setTestJumps(85);
		testSets.add(testSet3);
		
		createData testSet4 = new createData();
		testSet4.setTestX(150000);
		testSet4.setTestY(1000000);
		testSet4.setTestD(10000);
		testSet4.setTestJumps(85);
		testSets.add(testSet4);	
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void test() {
		Iterator<createData> iterator = testSets.iterator();
		while (iterator.hasNext()) {
			createData testSet = (createData) iterator.next();
			Assert.assertEquals(solution.solution(testSet.getTestX(), testSet.getTestY(), testSet.getTestD()), testSet.getTestJumps());
		}
	}
}
