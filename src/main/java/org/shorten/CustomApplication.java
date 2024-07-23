package org.shorten;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;

public class CustomApplication {

	/**
	 * A method that would you shorten the following string: "aaaa aannnqddtttwebbb" and Returns a string. 
	 * Remember that you need to be able to recreate the string as original.
	 * @param value
	 * @return
	 */
	public static String shorthen(String value) {
		if(Objects.isNull(value) || value.isEmpty()) { // add null check
			return "";
		}
		
		String[] characters = value.split("");
		Set<String> charactersMap = new LinkedHashSet<>();
		for (int index = 0; index < characters.length; index++) {
			String nextCharacter = characters[index];
			if(!charactersMap.contains(nextCharacter)) {
				charactersMap.add(nextCharacter);
			}
			
		}
		String result = charactersMap
				.stream()
				.collect(Collectors.joining());
		return result;
	}
	
	public static String shorthenV2(String value) {
		if(Objects.isNull(value) || value.isEmpty()) {
			return "";
		}
		String[] characters = value.split("");
		StringBuilder builder = new StringBuilder();
		Set<String> charactersMap = new LinkedHashSet<>();
		for (int index = 0; index < characters.length; index++) {
			String nextCharacter = characters[index];
			if(!charactersMap.contains(nextCharacter)) {
				builder.append(nextCharacter);
				charactersMap.add(nextCharacter);
			}
			
		}
		return builder.toString();
	}
}
