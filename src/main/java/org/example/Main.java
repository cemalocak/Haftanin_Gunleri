package org.example;

import java.io.Reader;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        HashMap<Integer,String> nameOfDays = new HashMap<>();
        nameOfDays.put(1,"Pazartesi");
        nameOfDays.put(2,"Salı");
        nameOfDays.put(3,"Çarşamba");
        nameOfDays.put(4,"Perşembe");
        nameOfDays.put(5,"Cuma");
        nameOfDays.put(6,"Cumartesi");
        nameOfDays.put(7,"Pazar");

        Scanner scanner = new Scanner(System.in);
        int value = 0;
       do{
            System.out.print("1 ile 7 arasında bir sayı giriniz... : ");
            try {
                value = Integer.parseInt(scanner.next());
                if(value<1 || value >7){
                    System.out.println("Hatalı giriş yaptınız!");
                }
                else{
                    System.out.printf(String.format("Haftanın %d. günü : %s", value, nameOfDays.get(value)));
                }
            }
            catch (Exception e){
                System.out.println("Hatalı giriş yaptınız!");
            }
        }while( !(value>=1 && value<=7) );

        };

        
        

    }
