package HomeWork2;

import java.util.Arrays;

public class homeWork2 {
    public static void main(String[] args) {
        // // {"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"}
        // String string = "{\"name\":\"Ivanov\", \"country\":\"Russia\", \"city\":\"Moscow\", \"age\":\"null\"}";
        // System.out.println(string);

        // string = string.substring(1, string.length() - 1);
        // String str = string.replace("\"", "").replace(" age:null", "").replace(",", "");

        // System.out.println("select * from students where " + str);




        // Реализуйте алгоритм сортировки пузырьком числового массива, результат после каждой итерации вывести в консоль
        // int[] arr = {5, 2, 8, 1, 4};
        // int n = arr.length;
        // for (int i = 0; i < n - 1; i++) {
        //     for (int j = 0; j < n - i - 1; j++) {
        //         if (arr[j] > arr[j + 1]) {
        //             int temp = arr[j];
        //             arr[j] = arr[j + 1];
        //             arr[j + 1] = temp;
        //         }
        //     }
        //     System.out.print("Итерация " + (i + 1) + ": ");
        //     for (int k = 0; k < n; k++) {
        //         System.out.print(arr[k] + " ");
        //     }
        //     System.out.println();
        // }



        // Написать метод(ы), который распарсит json и, используя StringBuilder, создаст строки вида: Студент [фамилия] получил [оценка] по предмету [предмет].
        // String string = "[{\"фамилия\":\"Иванов\",\"оценка\":\"5\",\"предмет\":\"Математика\"},{\"фамилия\":\"Петрова\",\"оценка\":\"4\",\"предмет\":\"Информатика\"},{\"фамилия\":\"Краснов\",\"оценка\":\"5\",\"предмет\":\"Физика\"}]";
        // string = string.substring(1, string.length() - 1);
        // System.out.println(string);

        // String str = string.replace("{", "\n").replace("\"", "").replace(",", " ").replace(":", " ").replace("}", ".");
        // String sstr = str.replace("фамилия", "Студент").replace("оценка", "получил").replace("предмет", "по предмету");
        // System.out.println(sstr);
    }
}
