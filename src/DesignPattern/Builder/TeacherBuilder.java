package DesignPattern.Builder;

import java.time.LocalDate;

public class TeacherBuilder {
    private int id;
    private String name;
    private String email;
    private LocalDate birthDate;
    private String address;

    public TeacherBuilder(){

    }

    public TeacherBuilder id(int id){
        this.id = id;
        return this;
    }

    public TeacherBuilder name(String firstName){
        this.name = firstName;
        return this;
    }

    public TeacherBuilder email(String email){
        this.email = email;
        return this;
    }

    public TeacherBuilder birthDate(LocalDate birthDate){
        this.birthDate = birthDate;
        return this;
    }

    public TeacherBuilder address(String address){
        this.address = address;
        return this;
    }

    public Teacher build(){
        return new Teacher(id, name, email, birthDate, address);
    }

}
