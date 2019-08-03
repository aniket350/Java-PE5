package com.stackroute.pe5;

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;


public class ReplaceWorldTest {

    ReplaceWorld replaceWorld;
    @Before
    public void setUp() throws Exception {
        this.replaceWorld = new ReplaceWorld();
    }

    @After
    public void tearDown() throws Exception {
        this.replaceWorld = null;
    }
    @Test
    public void givenAStringMapShouldReurnNoOfWords(){

        Map<String,String> stringMap = new HashMap<String, String>();
        stringMap.put("val1","Java");
        stringMap.put("val2","C++");
        String actual = replaceWorld.replaceWorld(stringMap);
        String expected = "{val2=Java, val1= }";
        assertEquals(expected, actual);
    }
}

