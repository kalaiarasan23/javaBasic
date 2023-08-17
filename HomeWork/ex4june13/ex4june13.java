package ex4june13;

import java.util.Scanner;

public class ex4june13 {
	public static void main(String[] args) {
		
		ex4june13 ex = new ex4june13();
		ex.templePuzzle();
		//System.out.println(ex.puzzles(18));
//		Scanner scr = new Scanner(System.in);
//		int n=scr.nextInt();
//		System.out.println("the number of cholates are "+ex.shopOffer(n));
		//scr.close();
//		Scanner sc = new Scanner(System.in);
//
//        System.out.print("Enter the number of chocolates you have: ");
//        int numChocolates = sc.nextInt();
//
//        int totalChocolates = numChocolates;
//        int remainingWrappers = numChocolates;
//
//        while (remainingWrappers >= 3) {
//            int exchangedChocolates = remainingWrappers / 3;
//            System.out.print("ex "+exchangedChocolates);
//            totalChocolates += exchangedChocolates;
//            System.out.print("   tot "+totalChocolates);
//            remainingWrappers = exchangedChocolates + (remainingWrappers % 3);
//            System.out.println(" rem "+remainingWrappers);
//        }
//
//        System.out.println("Total number of chocolates you can have: " + totalChocolates);
	}

	private void templePuzzle() {
		int divided=0,temp=0,initialFlowers=0;
		while(true)
		{
			divided+=3;
				temp= divided/3;
				
				if((temp+divided)%3!=0)
					continue;
				initialFlowers=temp;
				temp=temp/3;
				initialFlowers+=temp;
				
				if((temp+divided)%3==0) {
					temp=temp/3;
					initialFlowers+=temp;
				break;
				}
		}
		System.out.println(divided+" "+initialFlowers);
	}

	private int shopOffer(int boy) {
		int temp=0,chocolate=0;
		
		while(boy!=0)
		{
			temp+=boy%3;
			chocolate+=boy;
			if(temp>=3) {
				chocolate+=1;
				temp=(temp%3)+1;
			}
			boy/=3;
			System.out.println("chocolate "+chocolate+" rappers "+ temp);
		}
		return chocolate;
	}
	
	 private int puzzles(int n) {
		  
		  
		  int c3=0;int Total=0;int count=0;
		  while (c3<2) {
		   int c1=n/3;
		   int c2=n%3;
		   Total=Total+c1;
		   c3=c1+c2;
		   if (c3>=3) {
		    Total=Total+c1;
		    c3=c1+c2;

		   }
		  }
		  System.out.println(Total+n);
		  return (Total+n);
		 }
}
