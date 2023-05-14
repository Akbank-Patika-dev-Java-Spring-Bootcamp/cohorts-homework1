package service;

import domain.Home;
import domain.Residence;
import domain.SummerHouse;
import domain.Villa;

import java.util.List;

public class ResidenceService {

    public static int getTotalPriceOfHomes(List<Home> homes) {
        List<? extends Residence> upCastingHomes=homes;
        return ResidenceService.getTotalPrice((List<Residence>) upCastingHomes);
    }

    public static int getTotalPricesOfVillas(List<Villa> villas) {
        List<? extends Residence> upcastingVillas=villas;
        return ResidenceService.getTotalPrice((List<Residence>) upcastingVillas);
    }

    public static int getTotalPricesOfSummerHouses(List<SummerHouse> summerHouses) {
        List<? extends Residence> upcastingSummerHouses=summerHouses;
        return ResidenceService.getTotalPrice((List<Residence>) upcastingSummerHouses);
    }

    public static double getAverageSquareMeterOfVillas(List<Villa> villas) {
        List<? extends Residence> upcastingVillas=villas;
        return ResidenceService.getTotalSquareMeter((List<Residence>) upcastingVillas) / villas.size();
    }

    public static double getAverageSquareMeterOfHomes(List<Home> homes) {
        List<? extends Residence> upCastingHomes=homes;
        return ResidenceService.getTotalSquareMeter((List<Residence>) upCastingHomes) / homes.size();
    }

    public static double getAverageSquareMeterOfSummerHouses(List<SummerHouse> summerHouses) {
        List<? extends Residence> upcastingSummerHouses=summerHouses;
        return ResidenceService.getTotalSquareMeter((List<Residence>) upcastingSummerHouses) / summerHouses.size();
    }


    public static int getTotalPrice(List<Residence> residences) {
        int totalPrice = 0;
        for (Residence residence: residences) {
            totalPrice += residence.getPrice();
        }
        return totalPrice;
    }

    public static int getTotalSquareMeter(List<Residence> residences) {
        int totalSquareMeter = 0;
        for (Residence residence: residences) {
            totalSquareMeter += residence.getSquareMeter();
        }
        return totalSquareMeter;

    }

    public static List<Residence> getResidences(List<Residence> residences,int roomNumber,int saloonNumber) {
       return  residences.stream().
                filter(residence ->
                        (residence.getNumberOfRooms() == roomNumber
                                && residence.getNumberOfHalls() == saloonNumber)).toList();

    }



}
