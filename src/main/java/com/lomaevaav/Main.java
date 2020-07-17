package com.lomaevaav;

public class Main {

    public static void main(String[] args) {
    	Obstruction[] obs = new Obstruction[5];
		obs[0] = new Wall();
		obs[1] = new Wall();
		obs[2] = new Treadmill();
		obs[3] = new Wall();
		obs[4] = new Treadmill();


		Sportsmen[] sportsmens = new Sportsmen[5];
		sportsmens[0] = new Person(1,11000);
		sportsmens[1] = new Cat(2,3000);
		sportsmens[2] = new Person(3,2000);
		sportsmens[3] = new Robot(0,2);
		sportsmens[4] = new Robot(5,0);

		for (Sportsmen s: sportsmens){
			System.out.println();
			for (Obstruction o: obs){
				o.pass(s);
			}
		}

    }
}
