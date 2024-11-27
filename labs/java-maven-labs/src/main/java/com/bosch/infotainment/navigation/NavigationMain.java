package com.bosch.infotainment.navigation;

public class NavigationMain {
    public static void main(String[] args) {
        System.out.println("Navigation Main");
        NavigationService navigationService = new NavigationServiceImpl();
        System.out.println(navigationService.getCoordinates());
    }
}
