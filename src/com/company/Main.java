package com.company;

import java.util.ArrayList;

public class Main {

    public static ArrayList<ArrayList<OBJ>> list1 = new ArrayList<>();

    public static void main(String[] args) {
        createArray();
        printArray();
    }

    public static void createArray(){
        for (int i = 0; i < 10; i++){
            ArrayList<OBJ> temp = new ArrayList<>();
            for (int j = 0; j < 10; j++){
                OBJ myOBJ = new OBJ(1);
                temp.add(myOBJ);
            }
            list1.add(temp);
        }
    }

    public static void printArray(){
        for (int i = 0; i < 10; i++){
            for (int j = 0; j < 10; j++){
                OBJ myOBJ = list1.get(i).get(j);
                System.out.print(myOBJ.getNum()+" ");
            }
            System.out.println();
        }
    }
}
