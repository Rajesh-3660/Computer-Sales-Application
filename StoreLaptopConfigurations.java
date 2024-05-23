import java.util.ArrayList;

public class StoreLaptopConfigurations
{
   private ArrayList<LaptopConfiguration> laptopsStock;

   public StoreLaptopConfigurations()
   {
      this.laptopsStock=new ArrayList<>();
   }
   
   public ArrayList<LaptopConfiguration> availableLaptopsOfShop()
   {
       // stock laptops in the store

             LaptopConfiguration  acerLite12thGen=new LaptopConfiguration();
             acerLite12thGen.brandName="acer";
             acerLite12thGen.color="silver";
             acerLite12thGen.screenSize=15.6;
             acerLite12thGen.operatingSystem="windows11";
             acerLite12thGen.CPUModel="intelCorei7";
             acerLite12thGen.RAMSize="16GB";
             acerLite12thGen.ROMSize="1TB";
             acerLite12thGen.price=54990;

             LaptopConfiguration  lenovoV15=new LaptopConfiguration();
             lenovoV15.brandName="lenovo";
             lenovoV15.color="black";
             lenovoV15.screenSize=15.6;
             lenovoV15.operatingSystem="windows11";
             lenovoV15.CPUModel="intelCorei5";
             lenovoV15.RAMSize="8GB";
             lenovoV15.ROMSize="256GB";
             lenovoV15.price=20990;

             LaptopConfiguration acerAspireLite=new LaptopConfiguration();
             acerAspireLite.brandName="acer";
             acerAspireLite.color="silver";
             acerAspireLite.screenSize=14.5;
             acerAspireLite.operatingSystem="windows10";
             acerAspireLite.CPUModel="intelCorei5";
             acerAspireLite.RAMSize="8GB";
             acerAspireLite.ROMSize="512GB";
             acerAspireLite.price=29990;

             LaptopConfiguration hp15S=new LaptopConfiguration();
             hp15S.brandName="hp";
             hp15S.color="gray";
             hp15S.screenSize=14.6;
             hp15S.operatingSystem="windows11";
             hp15S.CPUModel="intelCorei5";
             hp15S.RAMSize="16GB";
             hp15S.ROMSize="512GB";
             hp15S.price=33990;

             
             laptopsStock.add(acerLite12thGen);
             laptopsStock.add(lenovoV15);
             laptopsStock.add(acerAspireLite);
             laptopsStock.add(hp15S);

               // for displaying the available laptops in our store
           /*  for(int i=0;i<laptopsWithConfigurations.size();i++)
             {
               	   System.out.println(laptopsWithConfigurations.get(i));
             } */
          

         return laptopsStock;
   }
   
   public boolean isLaptopAvailable(LaptopConfiguration userInputConfiguration,ArrayList<LaptopConfiguration> laptopsStockInTheStore) 
   {
       for (LaptopConfiguration laptop : laptopsStockInTheStore)
        {
           if(userInputConfiguration.brandName.equalsIgnoreCase(laptop.brandName) &&

		          userInputConfiguration.color.equalsIgnoreCase(laptop.color) &&

                  userInputConfiguration.screenSize == laptop.screenSize &&

                    userInputConfiguration.operatingSystem.equalsIgnoreCase(laptop.operatingSystem) &&

                        userInputConfiguration.CPUModel.equalsIgnoreCase(laptop.CPUModel) &&
 
                            userInputConfiguration.RAMSize.equalsIgnoreCase(laptop.RAMSize) &&
    
                               userInputConfiguration.ROMSize.equalsIgnoreCase(laptop.ROMSize))
                                 {
                                    userInputConfiguration.price=laptop.price;
                                    return true; 
                                 }
         }                 
       return false; 
   }
}
