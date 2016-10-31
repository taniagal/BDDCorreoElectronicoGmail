package com.sura.guidewire.policycenter.util;


import ch.lambdaj.Lambda;
import org.hamcrest.Description;
import org.hamcrest.Matcher;
import org.hamcrest.TypeSafeMatcher;
import org.hamcrest.core.StringContains;

import java.util.List;

public class AssertUtil {
    private AssertUtil(){
    }

    public static Matcher<? super List<String>> hasItemContainsString(String expectedValue) {
        return new HasItemContainsString(expectedValue);
    }

    private static final class HasItemContainsString extends TypeSafeMatcher<List<String>> {

        private final String expectedValue;

        private HasItemContainsString(String expectedValue) {
            this.expectedValue = expectedValue;
        }

        @Override
        protected boolean matchesSafely(List<String> values) {
            return !Lambda.filter(StringContains.containsString(expectedValue), values).isEmpty();
        }

        @Override
        public void describeTo(Description description) {
            description.appendText("Se esperaba una lista que contuviera un string ").appendValue(expectedValue);
        }
    }
}
