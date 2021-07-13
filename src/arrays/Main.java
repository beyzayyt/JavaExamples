package arrays;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        String[] arr1 = new String[4];
        arr1[0] = "beyza";
        arr1[1] = "cagatay";
        arr1[2] = "mahmut";
        arr1[3] = "kubra";

        ArrayList<String> list = new ArrayList<>();
        list.add("beyza");
        list.add("cagatay");
        list.add("mahmut");
        list.add("kubra");

        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = arr1[i].substring(0, 1).toUpperCase() + arr1[i].substring(1);
        }

        for (int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i]);
        }

        for (int i = 0; i < list.size(); i++) {
            list.set(i, list.get(i).substring(0, 1).toUpperCase() + list.get(i).substring(1));
            System.out.println(list.get(i));
//            list.set(0,"abc");
        }
    }
}
