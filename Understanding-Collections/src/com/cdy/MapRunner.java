package com.cdy;

import java.util.HashMap;
import java.util.Map;

public class MapRunner {

	public static void main(String[] args) {
		String str = "This is an awesome occasion." + " This has never happened before";

		char[] characters = str.toCharArray();

		Map<Character, Integer> occurances = new HashMap<>();

		for (char character : characters) {
			Integer integer = occurances.get(characters);
			if (integer == null) {
				occurances.put(character, 1);
			} else {
				occurances.put(character, integer + 1);
			}
		}

		System.out.println(occurances);

		String[] words = str.split(" ");
		Map<String, Integer> frequency = new HashMap<>();
		for (String word : words) {
			Integer number = frequency.get(word);
			if (number == null) {
				frequency.put(word, 1);
			} else {
				frequency.put(word, number + 1);
			}
		}
		System.out.println(frequency);

	}

}
