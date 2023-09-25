package DesignPattern.Singleton.BillPushSingleton;

import DesignPattern.Singleton.User;

public class UserGateway{
    static class UserGatewayHolder{
        private static final UserGateway instance = new UserGateway();
    }

    private UserGateway(){
    }

    public static UserGateway getInstance(){
        return UserGatewayHolder.instance;
    }

    public String getUserNameById(int id){
        return "";
    }

    public User getUserById(int id){
        return new User();
    }
}