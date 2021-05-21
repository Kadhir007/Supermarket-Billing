import java.util.*;

class Market
{
	public static void main(String args[])
	{
		 String[] main = new String[100];
		int [] main1 = new int [100];
		int [] cost =new int[100];
		int q,i,j,k,quantity[] =new int[100];
		int sum=0,dd,mm,yy,hh,rr,ss;
		GregorianCalendar gc=new GregorianCalendar();



		String name,p;
		int item[]=new int[100];
		 Addon obj = new Addon();
		Scanner s=new Scanner(System.in);
		System.out.println("\n\t\tAlWAYS BREWING");
		System.out.println("\n\nEnter Name of the Customer");
		name=s.next();

		int test=1;
		j=1;
		while(test>0)
		{


			System.out.println("\nEnter Product");
			System.out.println("1) TEA ");
			System.out.println("2) COFFEE");
			System.out.println("3) MILK");
			System.out.println("4) ADDONS");
		k=s.nextInt();

		if(k==1)
		{
			main[j]=obj.inputtea();
			if(main[j]=="Green Tea      ")
			{
				System.out.println("Enter quantity of Green tea");
				quantity[j]=s.nextInt();
				cost[j]=(quantity[j]*80);

			}

					else if(main[j]=="Lemon Tea      ")
			{
				System.out.println("Enter quantity of Lemon Tea");
				quantity[j]=s.nextInt();
				cost[j]=(quantity[j]*40);

			}


					else if(main[j]=="Ginger Tea     ")
			{
				System.out.println("Enter quantity of Ginger Tea");
				quantity[j]=s.nextInt();
				cost[j]=(quantity[j]*50);

			}

					else if(main[j]=="Herbal Tea     ")
			{
				System.out.println("Enter quantity of Herbal Tea");
				quantity[j]=s.nextInt();
				cost[j]=(quantity[j]*100);

			}

				else
			{
				System.out.println("Enter quantity of Cardamon Tea");
				quantity[j]=s.nextInt();
				cost[j]=(quantity[j]*80);

			}




		}

		else if(k==2)
		{



				main[j]=obj.inputcoffee();
					if(main[j]=="Cappuccino     ")
			{
				System.out.println("Enter quantity of Cappuccino");
				quantity[j]=s.nextInt();
				cost[j]=(quantity[j]*150);

			}

					else if(main[j]=="Espresso       ")
			{
				System.out.println("Enter quantity of Espresso");
				quantity[j]=s.nextInt();
				cost[j]=(quantity[j]*200);

			}


					else if(main[j]=="Flat White     ")
			{
				System.out.println("Enter quantity of Flat White");
				quantity[j]=s.nextInt();
				cost[j]=(quantity[j]*100);

			}

				else
			{
				System.out.println("Enter quantity of Latte");
				quantity[j]=s.nextInt();
				cost[j]=(quantity[j]*120);

			}






		}



		else if(k==3)
		{

					main[j]=obj.inputmilk();
			if(main[j]=="Boost          ")
			{
				System.out.println("Enter quantity of Boost");
				quantity[j]=s.nextInt();
				cost[j]=(quantity[j]*60);

			}

					else if(main[j]=="Complan        ")
			{
				System.out.println("Enter quantity of Complan");
				quantity[j]=s.nextInt();
				cost[j]=(quantity[j]*60);

			}


					else if(main[j]=="Horlicks       ")
			{
				System.out.println("Enter quantity of Horlicks");
				quantity[j]=s.nextInt();
				cost[j]=(quantity[j]*60);

			}

				else
			{
				System.out.println("Enter quantity of Plain Milk");
				quantity[j]=s.nextInt();
				cost[j]=(quantity[j]*50);

			}






		}

		else
		{

					main[j]=obj.inputaddon();
					if(main[j]=="Bun            ")
			{
				System.out.println("Enter quantity of Bun");
				quantity[j]=s.nextInt();
				cost[j]=(quantity[j]*10);

			}

					else if(main[j]=="Salt Biscuit   ")
			{
				System.out.println("Enter quantity of Salt Biscuit");
				quantity[j]=s.nextInt();
				cost[j]=(quantity[j]*20);

			}


					else if(main[j]=="Rusk           ")
			{
				System.out.println("Enter quantity of Rusk");
				quantity[j]=s.nextInt();
				cost[j]=(quantity[j]*25);

			}

					else
			{
				System.out.println("Enter quantity of Parle G");
				quantity[j]=s.nextInt();
				cost[j]=(quantity[j]*7);

			}
		}
		j++;
		System.out.println("\n\t\tContinue Shopping\t\t1-Yes\t0-No");
		test=s.nextInt();

		}



	System.out.println("\n\n\t\tHey "+name+" here's your Bill\n\n");
	System.out.println("\n"+gc.getTime());

System.out.println("\n\nlist\t\tProduct name\t\tquantity\t\tprice\n\n");
	for(i=1;i<j;i++)
	{

		System.out.println(i+"\t\t"+main[i]+"\t\t"+quantity[i]+"\t\t          "+cost[i]);
		sum=sum+cost[i];

	}

	System.out.println("_________________________________________________________________________");
	System.out.println("Total Amount to be paid\t\t\t\t\t        "+sum);


	System.out.println("\n\n\t\tThank You "+name+" Visit again");






	}
}
class Tea
{
	String  inputtea()

	{


			int test;
		Scanner s=new Scanner(System.in);

		System.out.println("\n\tEnter Tea variety \n1) Green Tea\t\t80_Inr\n2) Lemon tea\t\t40_Inr\n3) Ginger Tea\t\t50_inr\n4) Herbal Tea\t\t100_Inr\n5) Cardamon tea\t\t80_Inr");
		int variety;
		variety=s.nextInt();

		if (variety ==1)
		{
			return "Green Tea      ";
		}

		else if(variety==2)
		{
			return "Lemon Tea      ";
		}
		else if(variety==3)
		{
			return "Ginger Tea     ";
		}
		else if(variety==4)
		{
			return "Herbal Tea     ";
		}
		else
		{
			return "Cardamon Tea   ";
		}


	}

}

class Coffee extends Tea
{


	String  inputcoffee()

	{


			int test;
		Scanner s=new Scanner(System.in);

		System.out.println("\n\tEnter Coffee variety \n1) Cappuccino\t\t150_Inr\n2) Espresso\t\t200_Inr\n3) Flat White \t\t100_inr\n4) Latte \t\t100_Inr");
		int variety;
		variety=s.nextInt();

		if (variety ==1)
		{
			return "Cappuccino     ";
		}

		else if(variety==2)
		{
			return "Espresso       ";
		}
		else if(variety==3)
		{
			return "Flat White     ";
		}

		else
		{
			return "Latte          ";
		}


	}





}







class Milk extends Coffee
{


				String  inputmilk()

	{


			int test;
		Scanner s=new Scanner(System.in);

		System.out.println("\n\tEnter Milk variety \n1) Boost\t60_Inr\n2) Complan\t60_Inr\n3) Horlicks\t60_inr\n4) Plain Milk\t50_Inr");
		int variety;
		variety=s.nextInt();

		if (variety ==1)
		{
			return "Boost          ";
		}

		else if(variety==2)
		{
			return "Complan        ";
		}
		else if(variety==3)
		{
			return "Horlicks       ";
		}

		else
		{
			return "Plain Milk     ";
		}


	}




}

class Addon extends Milk
{

				String  inputaddon()

	{


			int test;
		Scanner s=new Scanner(System.in);

		System.out.println("\n\tEnter Addon variety \n1) Bun\t\t\t10_Inr\n2) Salt Biscuit\t\t20_Inr\n3) Rusk\t\t\t25_inr\n4) Parle G\t\t7_Inr");
		int variety;
		variety=s.nextInt();

		if (variety ==1)
		{
			return "Bun            ";
		}

		else if(variety==2)
		{
			return "Salt Biscuit   ";
		}
		else if(variety==3)
		{
			return "Rusk           ";
		}

		else
		{
			return "Parle G        ";
		}


	}

}
