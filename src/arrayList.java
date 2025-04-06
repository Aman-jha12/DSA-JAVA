import java.util.Scanner;

import java.util.ArrayList;

class arrayList{
    public static void main(String[] args){
        ArrayList<Integer> list=new ArrayList<>(10);
Scanner sc=new Scanner(System.in);
//        list.add(10);
//        System.out.println(list);

        //taking input
        for(int i=0;i<=5;i++){
            list.add(sc.nextInt());
        }

//        //get item at any index
//        for(int j=0;j<=5;j++){
//            System.out.println(list.get(j));
//        }
        System.out.println(list);
    }
}