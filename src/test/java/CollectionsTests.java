import static org.junit.jupiter.api.Assertions.*;

import java.awt.Color;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

import org.junit.jupiter.api.Test;

class CollectionsTests {

	// Question 1
	@Test
	void test_CanAdd12345toQueue() {
		Queue<Integer> queue = new LinkedList<>();
		queue.add(12345);
		// Assert
		assertEquals(new Integer(12345), queue.peek());
	}

	// Question 2
	@Test
	void test_EliminatesDuplicates() {
		Set<String> hashSet = new HashSet<String>();
		hashSet.add("Ridita");
		hashSet.add("Adam");
		hashSet.add("Bob");
		hashSet.add("Adam");
		// Assert
		assertEquals(3, hashSet.size());
	}

	// Question 3
	@Test
	void test_returnsPinkFromHashMap() {
		Map<String, Color> myMap = new HashMap<>();
		myMap.put("magenta", Color.MAGENTA);
		myMap.put("pink", Color.PINK);
		myMap.put("red", Color.RED);
		myMap.put("orange", Color.ORANGE);
		myMap.put("yellow", Color.YELLOW);
		myMap.put("green", Color.GREEN);
		myMap.put("cyan", Color.CYAN);
		myMap.put("blue", Color.BLUE);
		myMap.put("black", Color.BLACK);
		myMap.put("dark gray", Color.DARK_GRAY);
		myMap.put("gray", Color.GRAY);
		myMap.put("light gray", Color.LIGHT_GRAY);
		myMap.put("white", Color.WHITE);
		// Assert
		assertEquals(Color.PINK, myMap.get("pink"));
	}

	// Question 4
	@Test
	void test_occurencesFromMap() {
		// Arrange
		String helloThere = "HELLO THERE";
		char[] charArray = helloThere.toCharArray();
		Map<Character, Integer> hashMap = new HashMap<>();
		for (int i = 0; i < charArray.length; i++) {
			if (hashMap.containsKey(charArray[i])) {
				hashMap.put(charArray[i], hashMap.get(charArray[i]) + 1);
			} else {
				hashMap.put(charArray[i], 1);
			}
		}
		// Assert
		assertEquals(2, hashMap.get('H'));
	}

	// Question 5
//	@Test
//	void test_CountDuplicates() {
//		Map<String, Integer> myMap = new HashMap<>();
//		String str = "The error in this sentence is repeating cow cow.";
//		String lowerCaseVersion = str.toLowerCase();
//		for(int i = 0; i < str.length(); i++) {
//			if(myMap.containsKey(key))
//		}
//	}

}