import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        String[] [] seatingChart =
                {{"Abby", "Don", "George", "Kim"},
                        {"Brian", "Eleanor", "Harry", "Lenny"},
                        {"Cathy", "Fred", "Jill", "Matt"}};
        seatingChart[1][2] = "Paul";
        String temp = seatingChart[0][0];
        seatingChart[0][0] = seatingChart[2][3];
        seatingChart[2][3] = temp;
        String[] tempArr = seatingChart[0];
        seatingChart[0] = seatingChart[1];
        seatingChart[1] = tempArr;
        for (String[] innerArr : seatingChart) {
            System.out.println(Arrays.toString(innerArr));
        }
        int[][] arr1 = new int[2][3];
        int[][] arr2 = new int[3][2];
        arr1[0][0] = 1;
        arr1[0][1] = 2;
        arr1[0][2] = 3;
        arr1[1][0] = 4;
        arr1[1][1] = 5;
        arr1[1][2] = 6;
        for (int[] inner : arr1) {
            System.out.println(Arrays.toString(inner));
        }
        arr2[0][0] = 1;
        arr2[0][1] = 4;
        arr2[1][0] = 2;
        arr2[1][1] = 5;
        arr2[2][0] = 3;
        arr2[2][1] = 6;
        for (int[] inner : arr2) {
            System.out.println(Arrays.toString(inner));
        }
        System.out.println(arr1[0][2] + arr2[2][0]);
    }
}
