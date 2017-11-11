package test;

import static org.junit.Assert.*;

import org.junit.Test;

import main.IsAnagram;

public class TestIsAnagram {

	@Test
	public void test() {
		
		IsAnagram test = new IsAnagram();
		
		assertTrue(test.test("ababa", "aba'ba"));
		assertTrue(test.test("Adolf's", "Faldo's"));
		assertTrue(test.test("acb", "bca"));
		assertTrue(test.test("Vedantisms", "Adventism's"));
		assertTrue(test.test("hazards", "Adzhars"));
		assertFalse(test.test("abdba", "aba'ba"));
	}

}
