import static org.junit.jupiter.api.Assertions.*;

import java.awt.Color;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;
import java.util.TreeSet;

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
		Set<String> hashSet = new HashSet<>();
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
		String helloThere = "HELLO THERE";
		char[] charArray = helloThere.toCharArray();
		Map<Character, Integer> hashMap = new HashMap<>();
		for (int i = 0; i < charArray.length; i++) {
			// If the map already has the letter
			if (hashMap.containsKey(charArray[i])) {
				// Add 1 to the value
				hashMap.put(charArray[i], hashMap.get(charArray[i]) + 1);
			} else {
				hashMap.put(charArray[i], 1);
			}
		}
		// Assert
		assertEquals(2, hashMap.get('H'));
	}

	// Question 5
	@Test
	void test_CountDuplicates() {
		String str = "Ridita Ridita Nizam Nizam";
		str = str.toLowerCase();
		String[] words = str.split(" ");
		Set<String> duplicates = new HashSet<>();
		for (String word : words) {
			duplicates.add(word);
		}
		// Assert
		assertTrue(duplicates.size() == 2);
	}

	// Question 6
//	@Test
//	void test_ReverseLinkedList() {
//		LinkedList<Integer> originalList = new LinkedList<>();
//		for (int i = 1; i < 5; i++) {
//			originalList.add(i);
//		}
//		LinkedList<Integer> secondList = new LinkedList<>();
//		secondList = (LinkedList) originalList.clone();
//	}

	// Question 7
	@Test
	void test_TreeSet() {
		Set<String> treeSet = new TreeSet<>();
		treeSet.add("Amanda");
		treeSet.add("Cindarella");
		treeSet.add("Bob");
		treeSet.add("Cindarella");
		// Assert
		assertTrue(treeSet.size() == 3);
	}

	// Question 8
	@Test
	void test_PriorityQueue() {
		PriorityQueue<Double> priorityQueue = new PriorityQueue<>();
		double testSum = 0.0;
		priorityQueue.add(14.8);
		priorityQueue.add(2.2);
		priorityQueue.add(6.5);
		for (double element : priorityQueue) {
			testSum += element;
		}
		assertEquals(23.5, testSum);
	}
}