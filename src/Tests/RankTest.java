package Tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import DataStructures.Rank;

class RankTest {

	@Test
	void test() {
		Rank rank = Rank.SIX;
		assertEquals(rank.value, 6);
	}

}
