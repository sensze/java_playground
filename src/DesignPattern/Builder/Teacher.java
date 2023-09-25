package DesignPattern.Builder;

import java.time.LocalDate;

public class Teacher {
    private final int id;
    private final String name;
    private final String email;
    private final LocalDate birthDate;
    private final String address;

    public Teacher(int id, String name, String email, LocalDate birthDate, String address){
        this.id = id;
        this.name = name;
        this.email = email;
        this.birthDate = birthDate;
        this.address = address;
    }

    public void getAllData(){
        System.out.println(id);
        System.out.println(name);
        System.out.println(email);
        System.out.println(birthDate);
        System.out.println(address);
    }
}
