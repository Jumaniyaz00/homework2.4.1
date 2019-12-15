package com.company;

public class Main {

    public static void main(String[] args) {
        try {
            for (int i = 1; i <=5 ; i++) {
                Runner runner = new Runner(" Runner  ");
                System.out.println(" runner "+ i+" берет палочку ");
                if (i==5){

                    System.out.println(" Runner " + (i) +" бежит к финишу");

                }
                System.out.println(" Runner " + (i) +" бежит к Runner" +(i +1));
                runner.start();
                runner.setPriority(i);
            }
            for (int i = 5; i >=1 ; i--) {
                Runner runner = new Runner(" Runner  ");
                System.out.println(" runner "+ i+" берет палочку ");
                if (i==1){

                    System.out.println(" Runner " + (i) +" бежит к финишу");
                    return;
                }
                System.out.println(" Runner " + (i) +" бежит к Runner" +(i -1));
                runner.start();
                runner.setPriority(i);
            }

        }catch (Exception e){
            e.getMessage();
        }
    }
}
