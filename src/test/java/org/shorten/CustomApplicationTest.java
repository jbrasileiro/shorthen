package org.shorten;

import java.util.stream.Stream;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class CustomApplicationTest {

	private static Stream<Arguments> shorthen() {
		return Stream.of(
			/** 1**/Arguments.of("aaaa aannnqddtttwebbb", "a nqdtweb")
			/** 2**/, Arguments.of("aaaa aannnqddtttwebbbaa", "a nqdtweb")
			/** 3**/, Arguments.of("aaaa aannnqddtttwebbbaanqdtt aannnqddtttwebbbaanq", "a nqdtweb")
		);
	}
	
	@ParameterizedTest
	@MethodSource
	void shorthen(String value, String expected) {
		String result = CustomApplication.shorthen(value);
		Assertions.assertThat(result).isEqualTo(expected);
	}

}
