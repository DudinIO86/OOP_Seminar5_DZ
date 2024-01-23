package ДЗ;


import java.util.ArrayList;

public class TeacherController {
    private TeacherService model;
    private TeacherView view;


    public TeacherController(TeacherView view,TeacherService model){
        this.model=model;
        this.view=view;
    }

    public void Base() {

        boolean flag = true;

        while (flag!=false) {
            view.menu();
            int item = view.getUserInputItem();
            switch (item) {
                case 1:
                   view.GetTeacherInfo();
                    break;
                case 2:
                    view.tch.add(view.addInfo());
                    break;
                case 3:
                    flag = false;
                default:
                    throw new IllegalArgumentException("Недопустимый номер");
            }

        }
    }


}
