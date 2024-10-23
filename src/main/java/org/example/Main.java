package org.example;


public class Main {
    public static void main(String[] args) {

        //System.out.println(NameRepository.getSizes());

        String[] arr = {"Jari Testar", "New test"};
        //String[] arrTwo = {"Kalle Test"};
        NameRepository.setNames(arr);
        System.out.println(NameRepository.find("New test"));
        System.out.println(NameRepository.add("New test"));

        //System.out.println(NameRepository.getSizes());

        //String[] arrThree = NameRepository.findAll();
        //String[] arrFour = NameRepository.findAll2();
        //NameRepository.clear();
        //System.out.println(arrThree[0].toString());
        //System.out.println(arrFour[0].toString());
        //System.out.println(NameRepository.getSizes());


    }


}