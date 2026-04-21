package chapter3;

import java.util.*;


public class ArrayListLesson {
    public static void main(String[] args) {
        ArrayList list1 = new ArrayList<>();
        list1.add(1);
        list1.add('c');
        list1.add(true);
        list1.add("abcdf");
        System.out.println(list1);
        
        ArrayList <Integer>list2 = new ArrayList<>();
        list2.add(21); 
        list2.add(11);
        list2.add(54); 
        list2.add(4);
        
        System.out.println(list2.add(2));   //Boolean add (E element) kaya naging true
        System.out.println(list1.add ("NJ"));
        list2.add(5,100);   //void add (int index, E element)
        System.out.println(list2);
        int q = 10;
        Integer w = 20;
        List nums = new ArrayList<>();
        nums.add(1);
        nums.add(2);
        System.out.println(nums);
        nums.remove(1);
        System.out.println(nums);
        List nums2 = Arrays.asList(8,7,2,3,4,1,9,5,6);
        Collections.sort(nums2);
        System.out.println(nums2);
        Collections.reverse(nums2);
        System.out.println(nums2);
        Collections.shuffle(nums2);
        System.out.println(nums2);
    }
}

