package DesignPattern.Builder;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Teacher teacher = new TeacherBuilder()
                .name("Ifku Syoba")
                .birthDate(LocalDate.of(2002, 3, 9))
                .email("ifkusyobaa")
                .build();

        teacher.getAllData();
    }
}
