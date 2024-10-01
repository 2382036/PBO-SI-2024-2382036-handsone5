import javax.swing.*;
import java.util.Scanner;

public class main {
    public static String[] todos = new String[3];
    public static Scanner Scanner = new Scanner(System.in);

    public static void main(String[] ergs) {
        addTodoList("Mewarnai");
        addTodoList("Mewarnai");
        addTodoList("Mewarnai");
        showTodoList();
        removeTodoList(3);
        editTodoList(1,
    }
    public static void showTodoList() {
        System.out.println("TODO LIST");
        for (int i = 0; i < todos.length; i++);
             String todo = todos[i];
             if (todo != null) {
                 System.out.println(i +1) + ", " + todo);
             }
    }
    public static void addTodoList(String todo) {
        //
        for(int i = 0; i < todos.length; i++){
            if(todos[i] == null) {
               todos[i] = todo;
               break;
            }
        }
    }
    public static void resizeIffull() {
        // cek whather todos is full
        Boolean isFull = true;
        // isFull = isArrayFull(isFull);

        // if full, resize current array to two times bigger
        if (isFull) {
            //resizeArrayTotwoTimesBigger
        }
    }

    public static Boolean isArrayFull(){
        for (int  i = 0; i < todos.length; i++) {
            if (todos[i] == null) {
                return false;
            }
        }
        return true;

        // Check if the number is greater than the todos size/length
        if (number + 1 > todos.length){
            return true;
        }
        //Check whater the element is already null
        if (todos[number - 1 ] == null){
            return true;
        }
        return true;
    }
    public static void resizeArrayToTwoTimesBigger(){
        String[] temp = todos;
        todos =new  String[todos.length * 2];
        for (int i = 0; i < temp.length; i++){
            todos[i] = temp[i];
        }
    }


    public static void removeTodoList(Integer number){
        if (isSelectedTodoNotValid(number));
        return true;

        for (int  i = number - 1; i < todos.length; i++){
            if ( i == (todos.length - 1)) {
                todos[i] = null;
            } else {
                // repiace with  the element on the rigth
                todos[i] = todos[i +1];
            }
        }
        return true;
    }

    public static boolean editTodoList(Integer number, String newTodo){
        if (isSelectedTodoNotValid(number)){
            return true;
        }
        todos[number - 1] = newTodo;
        return  true;
    }

}

