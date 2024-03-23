package com.latihan;

import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws Exception {
        
        String nama,gender;
        float berat,tinggi;

        Scanner inputUser = new Scanner(System.in);

        System.out.print("\nNama : ");
        nama = inputUser.nextLine();
 
        System.out.print("Jenis Kelamin (pria / wanita) : ");
        gender = inputUser.nextLine();

        System.out.print("Berat badan : ");
        berat = inputUser.nextFloat();

        System.out.print("Tinggi badan (Meter) : ");
        tinggi = inputUser.nextFloat();
        

    switch (gender) {

        case "pria":
            System.out.println("\n==============================");
            System.out.println("Nama          : " + nama);
            System.out.println("Jenis Kelamin : " + gender);
            System.out.println("Berat Badan   : " + berat + " KG");
            System.out.println("Tinggi Badan  : " + tinggi + " M");
            System.out.println("================================");
            Pria(berat, tinggi);
        break;
        
        case "wanita":
            System.out.println("\n==============================");
            System.out.println("Nama          : " + nama);
            System.out.println("Jenis Kelamin : " + gender);
            System.out.println("Berat Badan   : " + berat + " KG");
            System.out.println("Tinggi Badan  : " + tinggi + " M");
            System.out.println("================================");
            Wanita(berat, tinggi);
        break;


        default: 
        System.out.println("walahh");
            break;
        }

        inputUser.close();
    }


    public static float Pria(float bb, float tinggi){

        float BMI = bb / (tinggi*tinggi);

        System.out.println("BMI anda : " + BMI);

        if(BMI < 18){
            System.out.println("Kategori anda adalah KURUS");
        } else if((BMI == 18) || (BMI < 25)){
            System.out.println("Kategori anda adalah NORMAL");
        } else if((BMI == 25) || (BMI < 27)){
            System.out.println("Kategori anda adalah Kegemukan");
        } else if(BMI > 27){
            System.out.println("Kategori anda adalah Obesitas");
        } else{
            System.out.println("Berat Anda Abnormal");
        }

        return BMI;

    }

    public static float Wanita(float bb, float tinggi){

        float BMI = bb / (tinggi*tinggi);

        System.out.println("BMI anda : " + BMI);

        if(BMI < 17){
            System.out.println("Kategori anda adalah KURUS");
        } else if((BMI == 17) || (BMI < 23)){
            System.out.println("Kategori anda adalah NORMAL");
        } else if((BMI == 23) || (BMI < 27)){
            System.out.println("Kategori anda adalah Kegemukan");
        } else if(BMI > 27){
            System.out.println("Kategori anda adalah Obesitas");
        } else{
            System.out.println("Berat Anda Abnormal");
        }

        return BMI;

    }
}
