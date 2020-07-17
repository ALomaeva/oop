package com.lomaevaav;

public class Cat implements Sportsmen{
    int limitRun = 1000;
    int limitJump = 1;
    public Cat(int limitJump, int limitRun){
        this.limitJump = limitJump;
        this.limitRun = limitRun;
    }
    public void run(int length) {
        if(this.limitRun<=length)
            System.out.println("Пробежал, доволен");
        else
            System.out.println("Не добежал, уснул");
    }
    public void jump(int height){
        if(this.limitJump<=height)
            System.out.println("Запрыгнул и остался наверху :)");
        else
            System.out.println("Не перепрыгнул, повис на стене");
    }

}
