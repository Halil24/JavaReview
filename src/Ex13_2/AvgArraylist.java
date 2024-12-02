package Ex13_3;

import java.util.ArrayList;
import java.util.Scanner;

public class AvgArraylist {
    public static void main(String[]args){
        int n;
        System.out.println("Enter number of elements: ");
        Scanner in = new Scanner(System.in);
        n=in.nextInt();
        ArrayList<Integer> list = new ArrayList<Integer>();

        System.out.println("Enter numbers to be averaged: ");

        for (int i = 0 ; i < n; i++){
            list.add(in.nextInt());
        }
        average(list);
        System.out.println("Average of the list is: "+ list);


    }

    public static void average(ArrayList<Integer> list){
        int sum=0;
        for (int i = 0; i < list.size(); i++){
            sum+=list.get(i);
        }
        int average= sum/list.size();
        list.clear();
        list.add(average);
    }
}
