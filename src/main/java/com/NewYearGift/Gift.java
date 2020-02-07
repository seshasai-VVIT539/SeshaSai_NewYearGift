package com.NewYearGift;
import java.util.ArrayList;

//Class for storing gift contents
class Gift
{
//	Arraylist object for storing contents
	ArrayList<Sweet> gift_items;
//	Name of the person receiving gift
	String recipient;
//	Total cost of the gift
	double giftCost;
//	Total weight of gift in grams
	double totalWeight;
//	Constructor 
	public Gift(String r,ArrayList<Candie> candies,ArrayList<Chocolate> chocolates)
	{
		recipient=r;
		giftCost=0;
		totalWeight=0;
		gift_items=new ArrayList<Sweet>(candies.size()+chocolates.size());
		for(int j=0;j<candies.size();j++)
		{
			gift_items.add(candies.get(j));
			giftCost+=candies.get(j).getCost();
			totalWeight+=candies.get(j).getWeight();
		}
		for(int j=0;j<chocolates.size();j++)
		{
			gift_items.add(chocolates.get(j));
			giftCost+=chocolates.get(j).getCost();
			totalWeight+=chocolates.get(j).getWeight();
		}
	}

	public void display()
	{
		System.out.println("~~~~~~~~~~~~~"+recipient+"~~~~~~~~~~~~~~~~~");
		System.out.println("  Name\t  \tWeight\tSugar-Level\tCost    ");
		for(int iter=0;iter<gift_items.size();iter++)
		{
			System.out.printf("%-15s",gift_items.get(iter).getName());
			System.out.printf("%5.2f",gift_items.get(iter).getWeight());
			System.out.printf("\t%5.2f",gift_items.get(iter).getSugarLevel());
			System.out.printf("\t\t%5.2f\n",gift_items.get(iter).getCost());
		}
		System.out.println("\nTotal Weight:  "+totalWeight);
		System.out.println("Total Cost:  "+giftCost+"\n\n");
	}
//	the gift contents which having low sugar content
	public void lowSugarCandies()
	{
		int iter,flag=0;
		System.out.println("Chocolates with low sugar content\n");
		for(iter=0;iter<gift_items.size();iter++)
		{
			if(gift_items.get(iter).getSugarLevel()>=40&&gift_items.get(iter).getSugarLevel()<=65)
			{
				flag=1;
				System.out.println(gift_items.get(iter).getName());
			}
		}
		if(flag==0)
		{
			System.out.println("Nothing found :(");
		}
		System.out.println();
	}
//	Sorting gift contents basing on their weight
	public void sortByWeight()
	{
		int iter_1,iter_2;
		for(iter_1=0;iter_1<gift_items.size();iter_1++)
		{
			for(iter_2=iter_1+1;iter_2<gift_items.size();iter_2++)
			{
				if(gift_items.get(iter_1).getWeight()>gift_items.get(iter_2).getWeight())
				{
					Sweet temp=gift_items.get(iter_1);
					gift_items.set(iter_1,gift_items.get(iter_2));
					gift_items.set(iter_2,temp);
				}
			}
		}
		System.out.println("\nTotal Weight:  "+totalWeight);
	}
//	Sorting gift contents basing on their cost
	public void sortByCost()
	{
		int iter_1,iter_2;
		for(iter_1=0;iter_1<gift_items.size();iter_1++)
		{
			for(iter_2=iter_1+1;iter_2<gift_items.size();iter_2++)
			{
				if(gift_items.get(iter_1).getCost()>gift_items.get(iter_2).getCost())
				{
					Sweet temp=gift_items.get(iter_1);
					gift_items.set(iter_1,gift_items.get(iter_2));
					gift_items.set(iter_2,temp);
				}
			}
		}
	}
}