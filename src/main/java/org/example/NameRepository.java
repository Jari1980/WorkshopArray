package org.example;

import java.util.Arrays;

public class NameRepository {
    private static String[] names = new String[0];

    public static int getSizes() {
        return names.length;
    }

    public static void setNames(String[] names) { // ["Jean Test" , "Bachar Test"]
        NameRepository.names = Arrays.copyOf(names, names.length);
    }

    public static void clear() {
        names = new String[0];
    }

    public static String[] findAll() {
        return Arrays.copyOf(names, names.length);
    }

    public static String[] findAll2() {
        String[] allNames = new String[names.length];
        for (int i = 0; i < names.length; i++) {
            allNames[i] = names[i];
        }
        return allNames;
    }

    public static String find(final String fullName){
        for(int i = 0; i < names.length; i++){
            if(names[i].equals(fullName)){
                return names[i];
            }
        }
        return null;
    }

    public static boolean add(final String fullName){
        if(find(fullName) == null){
            names = Arrays.copyOf(names, names.length + 1); //Adding empty element
            names[names.length - 1] = fullName; // adding fullName to last index in names
            return true;
        }
        return false;
    }

}
