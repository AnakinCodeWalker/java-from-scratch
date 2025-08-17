package array.com;

import java.util.ArrayList;
// formula of finding total pairs =n(n-1)/2
public class PairsInArray {
    public static void main(String[] args) {
        //to print all the possible pairs of an array
        ArrayList<Integer>list=new ArrayList<>();
     for (int i =1;i<=5;i++)
         list.add(i*2);
        System.out.print("[ ");
     for(Integer i :list)
         System.out.print(i+" ");
        System.out.print("]");
        System.out.println(" ");


        //to generate all possible pairs.
        int tp=0 ; // to generate total pairs of the array.
        for(int i=0 ; i<list.size();i++){
            for (int j=i+1;j<list.size();j++) {
                tp += 1;
                System.out.print("[ " + list.get(i) + "," + list.get(j) + " ]");

            }
            System.out.println(" ");
        }
        System.out.println("total pairs in the array :" +tp);
        System.out.print("finding the pairs via the formula : ");
        int n=5;
        int value=n*(n-1)/2;
        System.out.println(value);
    }
}
