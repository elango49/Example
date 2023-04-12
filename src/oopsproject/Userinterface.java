package oopsproject;

import java.util.Scanner;

public class Userinterface {
	static Scanner s=new Scanner(System.in);
	static Bag bag=new Bag();
	static boolean b=true;
	public static void main(String[] args) {
		do {
			System.out.println("\t\t\"Welcome To The Indoor Game\"\n");
			System.out.println("Select The Input\n");
			System.out.println("1.addBall\n2.removeBall\n3.check bag isBagEmpty\n4.ShowGame\n5.Exit");
			int input =s.nextInt();
			switch (input) {
			case 1:{//adding the ball
				System.out.println("Select the Ball");
				System.out.println("1.Tennis Ball\n2.BasketBall");
				int user_wish=s.nextInt();
				switch (user_wish) {
				case 1:{//adding Tennis
					bag.addBall(new Tennis());
					break;}
               case 2:{
					bag.addBall(new Basketball());
					break;}
               }
				break;}
            case 2:{//remove ball
            	bag.removeBall();
				break;}
            case 3:{//Checkingg Bag is Empty 
            	if(bag.isBagEmpty()) {
            		System.out.println("Bag is Empty");
            	}else {
            		System.out.println("Bag Is Not Empty");
            	}
				
				break;}
            case 4:{//showgame
            	bag.ShowGame();
				break;}
           case 5:{
				b=false;
						System.out.println("\t\t\'\"thank you\"");
				break;}
           
			}
		} while (b);
	}

}
