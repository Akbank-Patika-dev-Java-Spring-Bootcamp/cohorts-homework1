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

    public static int getTotalSquareMeterOfVillas(List<Villa> villas) {
        List<? extends Residence> upcastingVillas=villas;
        return ResidenceService.getTotalSquareMeter((List<Residence>) upcastingVillas);
    }

    public static int getTotalSquareMeterOfHomes(List<Home> homes) {
        List<? extends Residence> upCastingHomes=homes;
        return ResidenceService.getTotalSquareMeter((List<Residence>) upCastingHomes);
    }

    public static int getTotalSquareMeterOfSummerHouses(List<SummerHouse> summerHouses) {
        List<? extends Residence> upcastingSummerHouses=summerHouses;
        return ResidenceService.getTotalSquareMeter((List<Residence>) upcastingSummerHouses);
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
                        (residence.getRoomNumber() == roomNumber
                                && residence.getSaloonNumber() == saloonNumber)).toList();

    }



}
