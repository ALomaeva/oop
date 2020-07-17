package com.lomaevaav;

public class Robot implements Sportsmen{
    int limitRun = 10000;
    int limitJump = 3;
    public Robot(int limitJump, int limitRun){
        this.limitJump = limitJump;
        this.limitRun = limitRun;
    }
    public void run(int length) {
        if(this.limitRun<=length)
            System.out.println("Пробежал, ждет команды");
        else
            System.out.println("Не добежал, разрядился");
    }
    public void jump(int height){
        if(this.limitJump<=height)
            System.out.println("Перепрыгнул, ждет приказов");
        else
            System.out.println("Не перепрыгнул, сломался");
    }
}
