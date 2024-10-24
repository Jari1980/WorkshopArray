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

    public static String[] findByFirstName (final String firstName){
        String[] allFullNamesArray = findAll(); //Getting all elements in names
        String[] allMatches = new String[0];    //Creating new array and initialising
        for(String name : allFullNamesArray){   //foreach element in allFullNamesArray
            String[] tempFullName = name.split(" ");    //New array with 2 elements, first and last name
            if(tempFullName[0].equals(firstName)){      // Checking if firstname is = to searched name
                allMatches = Arrays.copyOf(allMatches, allMatches.length + 1); //Adding empty element to allMatches
                allMatches[allMatches.length - 1] = name; // adding name (firstName LastName) to last index in allMatches
            }
        }
        return allMatches;
    }

    public static String[] findByLastName(final String lastName){
        String[] allFullNamesArray = findAll(); //Getting all elements in names
        String[] allMatches = new String[0];    //Creating new array and initialising
        for(String name : allFullNamesArray){   //foreach element in allFullNamesArray
            String[] tempFullName = name.split(" ");    //New array with 2 elements, first and last name
            if(tempFullName[1].equals(lastName)){      // Checking if lastName is = to searched name
                allMatches = Arrays.copyOf(allMatches, allMatches.length + 1); //Adding empty element to allMatches
                allMatches[allMatches.length - 1] = name; // adding name (firstName LastName) to last index in allMatches
            }
        }
        return allMatches;
    }

    public static boolean update(final String original, final String updatedName){
        if(find(updatedName) != null){  // Checking if updatedName already exists in names
            return false;               // Names can not be updated because updatedName already exist
        }
        for(int i = 0; i < names.length; i++){  //Iterating trough names array
            if(names[i].equals(original)){      //Checking if original name was found
                names[i] = updatedName;         //Replace originalName with updatedName
                return true;  //If names was found and updated returning true
            }
        }
        return false; // If orginal names was not found
    }

    public static boolean remove(final String fullName){
        int indexToRemove = -1;                     //Initializing indextoremove as -1
        for(int i = 0; i < names.length; i++){      //Iterating trough names array
            if(names[i].equals(fullName)){          //If fullName is found in names
                indexToRemove = i;                  //storing the indexnumber which should be removed
                break;
            }
        }
        if(indexToRemove == -1){                    //If fullName is not found then breaking
            return false;
        }

        String[] tempArr = new String[names.length - 1]; //Creating temporal array with one slot smaller
        for(int i = 0, j = 0; i < names.length; i++){     //Iterating trough names
            if(i != indexToRemove){                       //Skipping the index, the element we want to remove
                tempArr[j++] = names[i];                  //Copying all elements
            }
        }
        names = tempArr;                                    //Updating the original array
        return true;                                        //Succesfully removed
    }
}
