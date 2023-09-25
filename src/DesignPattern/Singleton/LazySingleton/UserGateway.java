package DesignPattern.Singleton.LazySingleton;

import DesignPattern.Singleton.User;

public class UserGateway{
    private static UserGateway userGateway;

    private UserGateway(){
    }

    public static UserGateway getInstance(){
        if(userGateway == null){
            userGateway = new UserGateway();
        }
        return userGateway;
    }

    public String getUserNameById(int id){
        return "";
    }

    public User getUserById(int id){
        return new User();
    }
}