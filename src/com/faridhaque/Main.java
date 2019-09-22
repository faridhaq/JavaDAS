package com.faridhaque;

import java.sql.SQLOutput;
import java.text.NumberFormat;
import java.util.*;

public class Main {

    public static void main(String[] args) {


        Tree tree=new Tree();
        tree.insert(7);
        tree.insert(4);
        tree.insert(9);
        tree.insert(1);
        tree.insert(6);
        tree.insert(8);
        tree.insert(10);
       //tree.traversalInOrder();
        System.out.println(tree.height());

    }
}




//        String Str="I have gree Inha Apples";
//
//        Str =Str.replace(" ","");
//
//        Map<Character,Integer> map=new HashMap<>();
//
//        for (char ch: Str.toCharArray()){
//            if (map.containsKey(ch))
//                map.put(ch,map.get(ch)+1);
//            else
//                map.put(ch,1);
//        }
//        for (char ch: Str.toCharArray()){
//            if(map.get(ch)==1){
//                System.out.println(ch);
//            break;}
//        }
//
//        System.out.println(map);
//
//}
//}
//        int[] numbers=new int[3];
//        System.out.println(Arrays.toString(numbers));
//
//
//
//    }
////        var employee=new Employee();
////
////        employee.setBaseSalary(50_000);
//        employee.setHourlyRate(20);
//        int wage=employee.calculateWage(10);
//        System.out.println(wage);
//    }






//        int baseSalary = 50_000;
//        int extraHours = 10;
//        int hourlyRate = 20;
//int wage=calculateWage(baseSalary,hourlyRate,extraHours);
//        System.out.println(wage);
//    }
//public static int calculateWage(
//        int baseSalary,
//                int extraHours,
//                        int hourlyRate
//                ){
//    return baseSalary+(extraHours*hourlyRate);
//        }




//        TextBox textBox=new TextBox();
//        textBox.setText("Box1");
//        System.out.println(textBox.text);



        //        Scanner scanner= new Scanner(System.in);
//        System.out.println("Principal: ");
//        int P=scanner.nextInt();
//        System.out.println("Annual Interest Rate: ");
//        float annualInterestRate=scanner.nextFloat();
//        System.out.println("Period (Years): ");
//        int timePeriod=scanner.nextInt();
//        float r=annualInterestRate/1200;
//        int n =timePeriod*12;
//        double mortgage= P*(r* Math.pow((1+r),n)/(Math.pow((1+r),n)-1));
//        String currency=NumberFormat.getCurrencyInstance().format(mortgage);
//        System.out.print("Mortgage: ");
//        System.out.println(currency);
//        System.out.println("Schedule: ");
//        for (int i=1;i<=n;i++){
//        double Balance=P*(Math.pow((1+r),n)- Math.pow((1+r),i))/(Math.pow((1+r),n)-1);
//        String balance=NumberFormat.getCurrencyInstance().format(Balance);
//        System.out.println(balance);



