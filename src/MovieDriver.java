/*
 * Class: CMSC203 CRN 22297
 * Instructor: Grigoriy Grinberg
 * Description: You are given a file called Movie.java, which has the data
    fields for a movie, along with “setters” and “getters”, and a “toString”
    method.  You will create a driver class from the pseudocode in Task #1 
    below to test the Movie class.
 * Due: 9/20/2021
 * Platform/compiler: Eclipse/Java
 * I pledge that I have completed the programming assignment independently.
   I have not copied the code from a student or any source.
   I have not given my code to any student.
   Print your Name here: Daniel Cortes Gratacos
*/

import java.util.Scanner;

public class MovieDriver 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		char ch='y';
		while(ch=='y')
		{
		Movie m=new Movie();
		System.out.println("Enter the name of the movie : ");
		String title=sc.nextLine();
		m.setTitle(title);	//setting title
		System.out.println("Enter the rating of the movie : ");
		String rating=sc.next();
		m.setRating(rating);	//setting rating
		System.out.println("Enter the number of tickets sold for this movie : ");
		int n=sc.nextInt();
		m.setSoldTickets(n);	//setting no of tickets
		System.out.println(m.toString());
		System.out.println("Do you want to enter another ?(y or n)");
		ch=sc.next().charAt(0);
		sc.nextLine();	//for line feed

		}

		System.out.println("Goodbye");
	}
}