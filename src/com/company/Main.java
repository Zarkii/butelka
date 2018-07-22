package com.company;


public class Main {
    double ileLitrow;
    int pojemnosc;
    Main(){

    }
    Main(double ileLitrow){
        this.ileLitrow = ileLitrow;
    }
    double GetIleLitrow(){
        return ileLitrow;
    }
    Main(int pojemnosc){
        this.pojemnosc = pojemnosc;
    }
    boolean wlej(double ilosc){
        if (ilosc+ileLitrow > pojemnosc){
            System.out.println("za mała pojemnosc!");
            return false;
        }else{
        this.ileLitrow += ilosc;
        return true;}
    }
    boolean wylej(double ilosc){
        if (ilosc > ileLitrow){
            System.out.println("za mało płynu!");
            return false;
        }else {
            this.ileLitrow -= ilosc;
            return true;
        }
    }
    void przelej(double ilosc,Main gdzie){

        if(this.wylej(ilosc)){
        gdzie.wlej(ilosc);}


    }

    public static void main(String[] args) {
        Main[] butelka = new Main[3];

        for (int i = 0;i <= 2;i++){
            butelka[i] = new Main();

        }
        butelka[0].ileLitrow = 5;
        butelka[1].ileLitrow = 8;
        butelka[2].ileLitrow = 9;
        butelka[0].pojemnosc = 12;
        butelka[1].pojemnosc = 15;
        butelka[2].pojemnosc = 18;


        //butelka[2].przelej(32,butelka[0]);
        butelka[0].wlej(9);
        for (int i = 0;i <=2;i++){
            System.out.println(butelka[i].GetIleLitrow());



        }
    }}

