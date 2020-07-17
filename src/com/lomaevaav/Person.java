package com.lomaevaav;

public class Person implements Sportsmen{
    int limitRun;
    int limitJump;
    public Person(int limitJump, int limitRun){
        this.limitJump = limitJump;
        this.limitRun = limitRun;
    }
    public void run(int length) {
        if(this.limitRun<=length)
            System.out.println("Пробежал, устал");
        else
            System.out.println("Не добежал, устал");
    }
    public void jump(int height){
        if(this.limitJump<=height)
            System.out.println("Перерыгнул, но больше не станет");
        else
            System.out.println("Не стал прыгать, высоко");
    }
}
