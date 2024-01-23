package ДЗ;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        TeacherService model=new TeacherService();
        TeacherView view=new TeacherView();
        TeacherController controller=new TeacherController(view,model);

        controller.Base();

    }
}
