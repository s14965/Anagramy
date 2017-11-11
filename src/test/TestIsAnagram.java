package test;

import static org.junit.Assert.*;

import org.junit.Test;

import main.IsAnagram;

public class TestIsAnagram {

	@Test
	public void test() {
		
		IsAnagram test = new IsAnagram();
		
		assertTrue(test.test("aba ba", "aba'ba"));
	}

}
