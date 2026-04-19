package chapter3;

import java.util.*;            // lahat ng class 
                               //import java.util.Scanner; isang class lng
public class ArrayLesson {
    public static void main(String ...args ) {
       int [] i = new int[3]; 
       int [] numbers2 = new int[] {1,54,75};
       int [] numbers3 =  {1,54,75};
       Student [] batch2 = {new Student(),new Student(), new Student(), new Student(), null};
       for( int j = 0; j<numbers3.length;j++ )
       System.out.println(numbers3[j]);
       
       int [] numbers4 =  {1,54,75,5,76,34,7,3,8,10,34};
       Arrays.sort(numbers4);
       for(int nj1: numbers4)                 //println may nextline
            System.out.print(nj1+" , ");      //print dikit dikit 
            int searchnum = 9;   //result = -(5) - 1 , result = -6 negative pag wala sa array
            System.out.println("\n"+searchnum+ " search result: "+ Arrays.binarySearch(numbers4, searchnum));
            String [] numbersString =  {"1","B","54","75","5","76","35","3","7","9","11","99","121"};
            String stringSearch = "b";
       Arrays.sort(numbersString);       //Paano gawing integer ang String?
        for(String nj: numbersString)    // int x = Integer.parseInt("54");       
        System.out.print(nj+" , ");      //System.out.println(x + 1); // 55
        System.out.println();
        System.out.println("\n"+stringSearch+ " search result: "+Arrays.binarySearch(numbersString,stringSearch));
        
        int [][] diffsize = {{1,2},{3},{9,8,7}};
        System.out.println(diffsize[1][0]);
        
        int squarepants[][][]= 
       {
        { {2,3,4},{10,20,30} } ,      //unang [ ] → pili ng group
          { {3,6,9} } ,               // pangalawa [][] → pili ng array sa loob
        };                            //pangatlo [][][] → pili ng value sagot 20
      
    
       System.out.println(squarepants[0][1][1]);                                       
} }             

class Student{
    String fullname;
    int age; 
    String address;
    String course;
    int yearlevel;

}


//    0  1  2  3  4
//    1  2  3  4  6                  
//  -1 -2 -3 -4 -5 -6