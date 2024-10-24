package org.example;


import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        //System.out.println(NameRepository.getSizes());

        //String[] arr = {"Jari Testar", "New test", "New tmmm", "New Thrid"};
        //System.out.println(NameRepository.findByFirstName("New"));
        //NameRepository.setNames(arr);
        NameRepository.setNames(new String[] {"Jari Testar", "New Third", "New tmmm", "New Third"});
        //NameRepository.update("Jari Testar", "Jean Testar");
        //String target = "tmmm";
        NameRepository.remove("New tm");
        String[] test =NameRepository.findAll();
        //String[] test = NameRepository.findByLastName(target);
        //for(String element : test){
        //    System.out.println(element);
        //}
        for(int i = 0; i < test.length; i++){
            System.out.println(test[i]);
        }

        //System.out.println(Arrays.toString(test));
        //String[] arrTwo = {"Kalle Test"};
        //NameRepository.setNames(arr);
        //System.out.println(NameRepository.find("New test"));
        //System.out.println(NameRepository.add("New test"));

        //System.out.println(NameRepository.getSizes());

        //String[] arrThree = NameRepository.findAll();
        //String[] arrFour = NameRepository.findAll2();
        //NameRepository.clear();
        //System.out.println(arrThree[0].toString());
        //System.out.println(arrFour[0].toString());
        //System.out.println(NameRepository.getSizes());


    }


}