package com.SpringAssignment2.SpringAssignment2;

import java.util.Map;

public class MapClass {
private Map<String, String > map;
    
    public MapClass(Map<String, String> map) {
        this.map = map;
    }
    
    public void printMap() {
        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}