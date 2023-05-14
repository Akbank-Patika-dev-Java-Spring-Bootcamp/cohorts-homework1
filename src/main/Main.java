package main;

import domain.Home;
import domain.Residence;
import domain.SummerHouse;
import domain.Villa;
import factory.ResidenceFactory;
import service.ResidenceService;

import java.util.ArrayList;
import java.util.List;


public class Main {

    public static void main(String[] args) {
        List<Residence> allResidences= new ArrayList<>();
        List<Home> homes= ResidenceFactory.createHomesList(3);
        List<Villa> villas=ResidenceFactory.createVillasList(3);
        List<SummerHouse> summerHouses = ResidenceFactory.createSummerHousesList(3);
        allResidences.addAll(homes);
        allResidences.addAll(villas);
        allResidences.addAll(summerHouses);
        int homesPrice = ResidenceService.getTotalPriceOfHomes(homes);
        int summerHousesPrice = ResidenceService.getTotalPricesOfSummerHouses(summerHouses);
        int villasPrice = ResidenceService.getTotalPricesOfVillas(villas);
        double homesAverageSquareMeter = ResidenceService.getAverageSquareMeterOfHomes(homes);
        double summerHousesAverageSquareMeter = ResidenceService.getAverageSquareMeterOfSummerHouses(summerHouses);
        double villasAverageSquareMeter = ResidenceService.getAverageSquareMeterOfVillas(villas);
        System.out.println("Homes --> " + homes);
        System.out.println("villas --> " + villas);
        System.out.println("summerHouses -->" + summerHouses);
        System.out.println("Total prices of homes = " + homesPrice);
        System.out.println("Total prices of summerhouses = " + summerHousesPrice);
        System.out.println("Total prices of villas = " + villasPrice);
        System.out.println("Total prices of all residences = " + (homesPrice + summerHousesPrice + villasPrice));
        System.out.println("Average square meter of homes = " + homesAverageSquareMeter);
        System.out.println("Average square meter of summerhouses = " + summerHousesAverageSquareMeter);
        System.out.println("Average square meter of villas = " + villasAverageSquareMeter);
        System.out.println("Average square meter of all residences = " + (ResidenceService.getTotalSquareMeter(allResidences) / allResidences.size()));
        System.out.println("Get residences based on  room and saloon number = " + ResidenceService.getResidences(allResidences,2,1));

    }

}