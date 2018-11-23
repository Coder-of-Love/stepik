/*
Напишите программу, выводящую в консоль It's alive! It's alive!

Класс должен называться "Main", это ограничение проверяющей системы.
*/

// мое
public class Main{
    public static void main(String[] args) {
        System.out.print("It's alive! It's alive!");
    }
}

// чужое, через цикл
public class Main {
    public static void main(String[] args) {
        String a = "It's alive! ";
        for (int i = 1; i <= 2; i++) {
            System.out.print(a);
        }
    }
}

// чужое, через ArrayList
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList s = new ArrayList();
        s.add("It's alive! ");
        s.add("It's alive! ");
        for(Object i: s){
            System.out.print(i);
        }
    }
}

// чужое
public class Main{
    public static void main (String[] args){
        String a = "It's alive!";
        System.out.println(a+" "+a);
    }
}
