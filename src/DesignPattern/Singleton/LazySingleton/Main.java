package DesignPattern.Singleton.LazySingleton;

import DesignPattern.Singleton.LazySingleton.UserGateway;

public class Main {
    public static void main(String[] args) {
        UserGateway userGateway = UserGateway.getInstance();
        System.out.println("userGateway.getUserNameById(1) = " + userGateway.getUserNameById(1));
        System.out.println("userGateway.getUserById(2) = " + userGateway.getUserById(2));
    }
}
