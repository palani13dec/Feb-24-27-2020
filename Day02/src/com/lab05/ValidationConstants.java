package com.lab05;

import java.util.function.Predicate;

public interface ValidationConstants {
	Predicate<String> isNotNull = val -> val != null;
	Predicate<String> isNotEmpty = val -> !val.isEmpty();
	Predicate<String> isNotBlank = val -> !val.isBlank();
	Predicate<String> isNotLesserThan6 = val -> val.length() >= 6;
}
