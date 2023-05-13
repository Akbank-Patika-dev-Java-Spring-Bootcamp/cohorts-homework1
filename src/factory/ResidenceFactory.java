package factory;

import domain.Home;
import domain.Residence;
import domain.SummerHouse;
import domain.Villa;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class ResidenceFactory {

  public static List<Home> getHomesList(int numberOfInstance) {
    int startIndex = 0;
    List<Home> homes=new ArrayList<>();
    while (numberOfInstance > startIndex) {
      Home newHome = 

    }
    return null;

  }

  public static List<Villa> getVillasList(int numberOfInstance){
            return null;
  }

  public static List<SummerHouse> getSummerHouses(int numberOfInstance) {return null;}

  private static ResidenceODT generateAttributesOfResidence() {
    Random randomGenerator=new Random();
    double price=randomGenerator.nextDouble(10.0) + 1.0;
    int squareMeter=randomGenerator.nextInt(100) + 30;
    int roomNumber=randomGenerator.nextInt(5) + 1;
    int saloonNumber=randomGenerator.nextInt(3) + 1;
    return new ResidenceODT(price,squareMeter,roomNumber,saloonNumber);

  }
}
