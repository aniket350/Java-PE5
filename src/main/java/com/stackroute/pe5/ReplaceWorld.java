package com.stackroute.pe5;
import java.util.Map;

public class ReplaceWorld {

    public String replaceWorld(Map<String, String> input) {
        if (input == null) {
            return null;
        }
        String value = input.get("val1");
        input.replace("val2", value);
        input.replace("val1", " ");
        return input.toString();
    }
}
