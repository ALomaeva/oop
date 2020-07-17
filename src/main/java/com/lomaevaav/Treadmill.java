package com.lomaevaav;

public class Treadmill implements Obstruction{
    public int length = 3000;
    public void pass (Sportsmen s){
        s.run(length);
    }
}
