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
      ResidenceDTO residenceDTO = ResidenceFactory.generateAttributesOfResidence();
      Home newHome = new Home(residenceDTO.price(),residenceDTO.squareMeter(),residenceDTO.roomNumber(), residenceDTO.saloonNumber());
      homes.add(newHome);
      numberOfInstance--;
    }
    return homes;

  }

  public static List<Villa> getVillasList(int numberOfInstance){
    int startIndex = 0;
    List<Villa> villas=new ArrayList<>();
    while (numberOfInstance > startIndex) {
      ResidenceDTO residenceDTO = ResidenceFactory.generateAttributesOfResidence();
      Villa newVilla = new Villa(residenceDTO.price(),residenceDTO.squareMeter(),residenceDTO.roomNumber(), residenceDTO.saloonNumber());
      villas.add(newVilla);
      numberOfInstance--;
    }
    return villas;
    
  }

  public static List<SummerHouse> getSummerHouses(int numberOfInstance) {
    int startIndex = 0;
    List<SummerHouse> summerHouses=new ArrayList<>();
    while (numberOfInstance > startIndex) {
      ResidenceDTO residenceDTO = ResidenceFactory.generateAttributesOfResidence();
      SummerHouse newSummerHouse = new SummerHouse(residenceDTO.price(),residenceDTO.squareMeter(),residenceDTO.roomNumber(), residenceDTO.saloonNumber());
      summerHouses.add(newSummerHouse);
      numberOfInstance--;
    }
    return summerHouses;

  }

  private static ResidenceDTO generateAttributesOfResidence() {
    Random randomGenerator=new Random();
    double price=randomGenerator.nextDouble(10.0) + 1.0;
    int squareMeter=randomGenerator.nextInt(100) + 30;
    int roomNumber=randomGenerator.nextInt(5) + 1;
    int saloonNumber=randomGenerator.nextInt(3) + 1;
    return new ResidenceDTO(price,squareMeter,roomNumber,saloonNumber);

  }
}
