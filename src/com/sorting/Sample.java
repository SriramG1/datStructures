package com.sorting;
import java.io.*;

class SampleTwo implements Runnable{
    public void run(){
        for(int i=0;i<10;i++){
            System.out.println("Message");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class Sample{
    public static void main(String[] args) {
        SampleTwo sample= new SampleTwo();
        Thread thread = new Thread(sample);
        thread.start();
    }
}
