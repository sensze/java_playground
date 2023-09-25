package DesignPattern.Singleton.EagerSingleton;

import DesignPattern.Singleton.User;

public class UserGateway {
    public static final UserGateway userGateway = new UserGateway();
    private UserGateway(){
    }

    public static UserGateway getInstance(){
        return userGateway;
    }

    public String getUserNameById(int id){
        return "";
    }

    public User getUserById(int id){
        return new User();
    }
}
