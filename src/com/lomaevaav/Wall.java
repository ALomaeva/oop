package com.lomaevaav;

public class Wall implements Obstruction{
    public int height = 1;
    public void pass(Sportsmen s){
        s.jump(height);
    }
}
