package com.company;


public class Main {
    double ileLitrow;
    Main(){

    }
    Main(double ileLitrow){
        this.ileLitrow = ileLitrow;
    }
    double GetIleLitrow(){
        return ileLitrow;
    }
    void wlej(double ilosc){
        this.ileLitrow += ilosc;
    }
    void wylej(double ilosc){
        this.ileLitrow -= ilosc;
    }

    public static void main(String[] args) {
        Main[] butelka = new Main[3];

        for (int i = 0;i <= 2;i++){
            butelka[i] = new Main();

        }
        butelka[0].ileLitrow = 5;
        butelka[1].ileLitrow = 8;
        butelka[2].ileLitrow = 9;

        for (int i = 0;i <=2;i++){
            System.out.println(butelka[i].GetIleLitrow());



        }

    }}

