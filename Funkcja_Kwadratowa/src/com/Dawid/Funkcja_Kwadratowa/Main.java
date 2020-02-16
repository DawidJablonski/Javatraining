package com.Dawid.Funkcja_Kwadratowa;

import java.util.Scanner;
import java.lang.Math;
public class Main {

	public static void main(String[] args) {
		int a,b,c; // TODO Auto-generated method stub
       
		System.out.println("Witamy w programie do obliczania miejsc zerowych funkcji kwadratowej - dla leniwych uczniow");
        System.out.print("Podaj A :");
        Scanner sc = new Scanner(System.in);
        a=Integer.parseInt(sc.nextLine());
        
        System.out.print("Podaj B :");
        b=Integer.parseInt(sc.nextLine());
        
        System.out.print("Podaj C :");
        c=Integer.parseInt(sc.nextLine());
        
        System.out.println("A:" + a+" B:" +b+ " C:" +c );// konkatenacja - laczenie stringow
        if(a==0)
        {
         System.out.println("To nie jest funkcja kwadratowa, tylko liniowa");
         System.exit(0);
        }
        
        float delta=b*b-4*a*c;
        System.out.println(delta);
        
        if(delta>0)
        {
        	double x1=(-b-Math.sqrt(delta))/(2*a);
        	double x2=(-b+Math.sqrt(delta))/(2*a);
        	System.out.println("X1 :"+ x1 + " X2 :" + x2);
        }
        else if(delta<0)
        {
        System.out.println("Miejca zerowe nie istnieja");
        }
        else
        {
        	double x=(-b)/(2*a);
        	System.out.println("X :" + x);
        }
        
	}

}
