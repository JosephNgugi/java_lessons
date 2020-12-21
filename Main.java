package com.company;

import java.util.zip.GZIPInputStream;

class goodDog{
    private int size;

    public int getSize(){
        return size;
    }
    public void setSize(int x){
        // this will allow me to set the size of the dog without neseccarily
        // accessing the instance variable size
        size = x;
    }
    void bark(){
        if (size >60){
            System.out.println("woof woof");

        }else if (size >14){
            System.out.println("ruff ruff");
        }else {
            System.out.println("yip yip");
        }
    }






}
public class Main {

    public  static void main(String[] args) {
        // creating an array of 3 goodDog
        goodDog []GoodDog = new goodDog[3];
        // creating objects of the created 3  and accessing the set size method to give them size
        GoodDog[0]=new goodDog();
        GoodDog[1]=new goodDog();
        GoodDog[2]=new goodDog();
        /////////////////////////
        GoodDog[0].setSize(70);
        GoodDog[1].setSize(14);
        GoodDog[2].setSize(1);

       GoodDog[0].bark();
        GoodDog[1].bark();
        GoodDog[2].bark();








        }
    }





























	//









