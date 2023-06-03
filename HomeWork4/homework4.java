package HomeWork4;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Scanner;

public class homework4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PrintStream ps = new PrintStream(System.out);        

        System.out.println("Введите ФИО пользователя или q для выхода");
        ArrayList<String> fname = new ArrayList<>();
        ArrayList<String> sname = new ArrayList<>();
        ArrayList<String> lname = new ArrayList<>();
        ArrayList<Integer> age = new ArrayList<>();
        ArrayList<Boolean> gen = new ArrayList<>();
        ArrayList<Integer> id = new ArrayList<>();
        
        while (true) {
            String in = scanner.nextLine();
            if (in.toLowerCase().equals("q")) break;
            String[] str = in.split(" ");
            id.add(age.size());
            fname.add(str[0]);
            sname.add(str[1]);
            lname.add(str[2]);
            age.add(Integer.parseInt(str[3]));
            gen.add(str[4].toLowerCase().contains("м"));
        }

        for (int i = 0; i < age.size() - 1; i++) {
            int max = age.get(id.get(i));
            int index = i;
            for (int j = i + 1; j < age.size(); j++) {
                if (age.get(id.get(j)) < max) {
                    max = age.get(id.get(j));
                    index = j;
                }
            }
            if (index != i) {
                int tmp = id.get(i);
                id.set(i, id.get(index));
                id.set(index, tmp);
            }
        }

        System.out.println();
        for (int i = 0; i < fname.size(); i++) {
            ps.println(fname.get(id.get(i)) + " " + sname.get(id.get(i)).toUpperCase().charAt(0) + "." + lname.get(id.get(i)).toUpperCase().charAt(0) + " " + age.get(id.get(i)));
        }
    }
}
