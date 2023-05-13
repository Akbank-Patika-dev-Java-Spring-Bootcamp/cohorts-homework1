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
        List<Home> homes= ResidenceFactory.getHomesList(3);
        List<Villa> villas=ResidenceFactory.getVillasList(3);
        List<SummerHouse> summerHouses = ResidenceFactory.getSummerHouses(3);
        allResidences.addAll(homes);
        allResidences.addAll(villas);
        allResidences.addAll(summerHouses);
        int homesPrice = ResidenceService.getTotalPriceOfHomes(homes);
        int summerHousesPrice = ResidenceService.getTotalPricesOfSummerHouses(summerHouses);
        int villasPrice = ResidenceService.getTotalPricesOfVillas(villas);
        int homesSquareMeter = ResidenceService.getTotalSquareMeterOfHomes(homes);
        int summerHousesSquareMeter = ResidenceService.getTotalSquareMeterOfSummerHouses(summerHouses);
        int villasSquareMeter = ResidenceService.getTotalSquareMeterOfVillas(villas);
        System.out.println("Homes --> " + homes);
        System.out.println("villas --> " + villas);
        System.out.println("summerHouses -->" + summerHouses);
        System.out.println("Total prices of homes = " + homesPrice);
        System.out.println("Total prices of summerhouses = " + summerHousesPrice);
        System.out.println("Total prices of villas = " + villasPrice);
        System.out.println("Total prices of all residences = " + (homesPrice + summerHousesPrice + villasPrice));
        System.out.println("Total square meter of homes = " + homesSquareMeter);
        System.out.println("Total square meter of summerhouses = " + summerHousesSquareMeter);
        System.out.println("Total square meter of villas = " + villasSquareMeter);
        System.out.println("Total square meter of all residences = " + (homesSquareMeter + summerHousesSquareMeter + villasSquareMeter));
        System.out.println("Get residences based on  room and saloon number = " + ResidenceService.getResidences(allResidences,2,1));

    }

}