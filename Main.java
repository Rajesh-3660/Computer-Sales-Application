import java.util.Scanner;
import java.util.ArrayList;

public class Main
{
    public static void main(String[] args)
    {

        Scanner scanner=new Scanner(System.in);    
        System.out.println("Enter your laptop configurataion ");
        System.out.println();
             
        LaptopConfiguration userInputConfiguration=new LaptopConfiguration();

        do{
            System.out.print("Brand Name : ");
            userInputConfiguration.brandName=scanner.next();

            System.out.print("Color : ");
            userInputConfiguration.color=scanner.next();

            System.out.print("Screen size in Inches: ");
            userInputConfiguration.screenSize=scanner.nextDouble();

            System.out.print("operating System : ");
            userInputConfiguration.operatingSystem=scanner.next();       

	    	System.out.print("CPU Model : ");
            userInputConfiguration.CPUModel=scanner.next();

            System.out.print("RAM size : ");
            userInputConfiguration.RAMSize=scanner.next();

            System.out.print("ROM size : ");
            userInputConfiguration.ROMSize=scanner.next(); 

            System.out.println();
            System.out.print("Is this configurations are okay or you want to change it ?... (Yes/No) : ");
            String changeingConfiguration=scanner.next();
            if(changeingConfiguration.equalsIgnoreCase("no"))        
		    {
                break;
            }
            else
		    {
		        continue;
		    }
                 
        }while(true);    // if user want to change their requirements
 
            StoreLaptopConfigurations ourLaptops =new StoreLaptopConfigurations();  
            ArrayList<LaptopConfiguration> laptopsStockInTheStore= ourLaptops.availableLaptopsOfShop();         // retreiving the available laptops data into the arraylist from the store 

            if(ourLaptops.isLaptopAvailable(userInputConfiguration,laptopsStockInTheStore))
            {
                    System.out.println("The laptop is available in our store based on your configuration");
                    System.out.println("This is the laptop price "+userInputConfiguration.price+"Rs only");
                    System.out.print("Do you want to buy it ?...(Yes/No)  : ");   // taking the input from the user...if they want to buy the product or not
                    String toBuy=scanner.next();
                    if(toBuy.equalsIgnoreCase("yes"))
                    {
                        System.out.println("Congrats..Here is your laptop and thank you for buying this product in our store...Please visit our store again....HAVE A NICE DAY");
                    }
                    else
                    {
                        System.out.println("Thank you..!\t VISIT US AGAIN");      // if user enter no..then they don't want to buy the product even if it available
                    } 
            }
            else
            { 
                System.out.println("Sorry, we don't have that kind of laptop...");      // if user configuration are not available in our store 
            }  

        scanner.close();
    }
} 
