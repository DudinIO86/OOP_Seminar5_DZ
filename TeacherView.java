package ДЗ;

import java.util.ArrayList;
import java.util.*;
import java.util.Scanner;

public class TeacherView {


    private Scanner scanner = new Scanner(System.in);
    public String getUserInput() {
        return scanner.next();
    }
    public int getUserInputItem() {
        return scanner.nextInt();
    }

    ArrayList<TeacherService> tch=new ArrayList<>();
    public void menu(){
        System.out.println("Меню выбора");
        System.out.println("1. Посмотреть текущую информацию о преподавателях");
        System.out.println("2.Добавить преподавателя");
        System.out.println("3. Завершить работу");
        System.out.println("Ваш выбор");
    }

    public TeacherService addInfo(){
        TeacherService teacher=new TeacherService();
        System.out.println("Введите Имя: ");
        String FN = String.valueOf(getUserInput());
        teacher.addFirstName(FN);

        System.out.println("Введите Фамилию: ");
        String LN = String.valueOf(getUserInput());
        teacher.addLastName(LN);

        System.out.println("Введите предмет: ");
        String pred = String.valueOf(getUserInput());
        teacher.addPredmet(pred);

        System.out.println("Введите кабинет: ");
        String cab = String.valueOf(getUserInput());
        teacher.addCabinet(cab);

        System.out.println("Введите телефон: ");
        String tel = String.valueOf(getUserInput());
        teacher.addNumber_tel(tel);

        return teacher;
    }
    public void GetTeacherInfo(){

        for (int i = 1; i < tch.size()+1 ; i++) {
            System.out.println("Преподаватель №: " +i);
            System.out.println("Имя: " + tch.get(i-1).getFirstName());
            System.out.println("Фамилия: " + tch.get(i-1).getLastName());
            System.out.println("Преподаваемый предмет: " + tch.get(i-1).getPredmet());
            System.out.println("Номер кабинета: " + tch.get(i-1).getCabinet());
            System.out.println("Номер телефона: " + tch.get(i-1).getTelefon());
            System.out.println();

        }
    }

}
