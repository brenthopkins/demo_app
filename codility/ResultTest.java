package codilityTest;

import java.util.ArrayList;

import org.junit.Assert;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ResultTest {
	private Result solution;
	int target = 0;
	ArrayList<Integer> arrival = new ArrayList<Integer>();
	ArrayList<Integer> duration = new ArrayList<Integer>();
	@BeforeEach
	void setUp() throws Exception {
		solution = new Result();

//		arrival.add(1);
//		arrival.add(3);
//		arrival.add(3);
//		arrival.add(5);
//		arrival.add(7);
//		duration.add(2);
//		duration.add(2);
//		duration.add(1);
//		duration.add(2);
//		duration.add(1);
//		target = 4;
		
//		arrival.add(1);
//		arrival.add(2);
//		arrival.add(3);
//		arrival.add(5);
//		arrival.add(7);
//		duration.add(2);
//		duration.add(2);
//		duration.add(3);
//		duration.add(2);
//		duration.add(1);
//		target = 4;

		arrival.add(250);
		arrival.add(74);
		arrival.add(659);
		arrival.add(931);
		arrival.add(273);
		arrival.add(545);
		arrival.add(879);
		duration.add(924);
		duration.add(710);
		duration.add(441);
		duration.add(166);
		duration.add(493);
		duration.add(43);
		duration.add(988);
		target = 2;

//		arrival.add(1);
//		arrival.add(3);
//		arrival.add(5);
//		duration.add(2);
//		duration.add(2);
//		duration.add(2);
//		target = 3;
		
//		arrival.add(1);
//		duration.add(1);
//		target = 1;
		
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void test() {
//		System.out.println(solution.maxEvents(arrival, duration));
		Assert.assertEquals(solution.maxEvents(arrival, duration), target);
	}

}
