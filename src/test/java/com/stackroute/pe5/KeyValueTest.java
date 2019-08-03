package com.stackroute.pe5;

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;


public class KeyValueTest {
    KeyValue keyvalue;

    @Before
    public void setUp() throws Exception {
        this.keyvalue = new KeyValue();
    }

    @After
    public void tearDown() throws Exception {
        this.keyvalue = null;
    }

    @Test
    public void givenInputStringArrayShouldReturnMapWithStringAndBoolean() {

        String[] array = {"a", "b", "c", "d", "e", "a", "c", "e"};
        Map<String, Boolean> expected = new HashMap<>();
        expected.put("a", true);
        expected.put("b", false);
        expected.put("c", true);
        expected.put("d", false);
        expected.put("e", true);
        System.out.println(expected);
        Map<String, Boolean> actualResult = keyvalue.keyValueChecker(array);
        assertEquals(expected, actualResult);

    }
}