package org.shorten;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class CustomApplication {

	/**
	 * A method that would you shorten the following string: "aaaa aannnqddtttwebbb" and Returns a string. 
	 * Remember that you need to be able to recreate the string as original.
	 * @param value
	 * @return
	 */
	public static String shorthen(String value) {
		
		String[] characters = value.split("");
		Map<String, Integer> charactersMap = new LinkedHashMap<>();
		for (int index = 0; index < characters.length; index++) {
			String nextCharacter = characters[index];
			if(charactersMap.containsKey(nextCharacter)) {
				Integer nextValue = charactersMap.get(nextCharacter) + 1;
				charactersMap.put(nextCharacter, nextValue);
			} else {
				charactersMap.put(nextCharacter, 1);
			}
			
		}
		String result = charactersMap.keySet().stream().collect(Collectors.joining());
		return result;
	}
}
