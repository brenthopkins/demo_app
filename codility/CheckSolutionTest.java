package codilityTest;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CheckSolutionTest {
	private CheckSolution solution;

	@BeforeEach
	void setUp() throws Exception {
		solution = new CheckSolution();
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void test() {
		String[] A = new String[] { "Apples", "Oranges","Grapes" };
		String T = "Apples";
		System.out.println(solution.solution(A, T));
	}

}
