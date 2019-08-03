package com.stackroute.pe5;
import java.util.HashMap;
import java.util.Map;

public class KeyValue {

    public Map<String, Boolean> keyValueChecker(String[] inputString) {

        Map<String, Boolean> resultMap = new HashMap<>();


            for (int i = 0; i < inputString.length; i++) {

                String word = inputString[i];
                if (resultMap.containsKey(word))
                    resultMap.put(word, true);
                else
                    resultMap.put(word, false);
            }
            return resultMap;
    }
}

