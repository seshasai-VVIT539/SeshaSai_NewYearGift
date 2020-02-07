package com.NewYearGift;
import java.util.ArrayList;

//Main class for the project
public class Main
{
//	main method
	public static void main(String[] args)
	{
		System.out.println();
		
//		different gift items for recipient Gopi
		Candie candie1=new Candie("Poppins",3.2,5.0,77,"orange");
		Candie candie2=new Candie("Melody",6.7,3.5,65,"black");
		ArrayList<Candie> candie_list=new ArrayList<Candie>(2);
		candie_list.add(candie1);
		candie_list.add(candie2);
		Chocolate chocolate1=new Chocolate("DM Silk","Oreo",57.0,51.7,59);
		Chocolate chocolate2=new Chocolate("5star 3D","Caramilk",30,80,30);
		ArrayList<Chocolate> chocolate_list=new ArrayList<Chocolate>(2);
		chocolate_list.add(chocolate1);
		chocolate_list.add(chocolate2);
//		Adding all contents into Gopi's gift
		Gift gopiGift=new Gift("Gopi",candie_list,chocolate_list);
		
//		different gift items for recipient Dharma
		gopiGift.display();
		candie1=new Candie("Mango Bite",5,2,40,"green");
		candie2=new Candie("Coffee Bite",3,1,30,"black");
		candie_list=new ArrayList<Candie>(2);
		candie_list.add(candie1);
		candie_list.add(candie2);
		chocolate1=new Chocolate("Kitkat","dessert",120,81,150);
		chocolate_list=new ArrayList<Chocolate>(1);
		chocolate_list.add(chocolate1);
//		Adding all the items into gift
		Gift dharmaGift=new Gift("Dharma",candie_list,chocolate_list);
		dharmaGift.display();
		
//		displaying low sugar level sweets of Dharma's gift
		dharmaGift.lowSugarCandies();
		
//		gift items for Teja's gift
		candie1=new Candie("Kismi",7,10,67,"white");
		candie2=new Candie("Gems",30,20,30,"multi");
		candie_list=new ArrayList<Candie>(2);
		candie_list.add(candie1);
		candie_list.add(candie2);
		chocolate1=new Chocolate("DM Special","Cadbury",240,80,100);
		chocolate2=new Chocolate("Bournville","Dark",442,30,80);
		chocolate_list=new ArrayList<Chocolate>(2);
		chocolate_list.add(chocolate1);
		chocolate_list.add(chocolate2);
//		adding all the items into gift
		Gift tejaGift=new Gift("Teja",candie_list,chocolate_list);
		tejaGift.display();
		
//		Teja's gift items of low sugar contents
		tejaGift.lowSugarCandies();
		
//		sorting the gift contents by various 
		System.out.println("\n\n after sorting\n\n");
//		sorting teja gift's items based on weight and displaying
		tejaGift.sortByWeight();
		tejaGift.display();
//		sorting dharma gift's items based on cost and displaying
		dharmaGift.sortByCost();
		dharmaGift.display();
	}
}