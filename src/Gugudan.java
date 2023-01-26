import java.util.Scanner;

public class Gugudan {
    public static int[] calculate(int number, int times) {
        int[] result = new int[number];

        for(int i = 0; i < result.length; i++) {
            result[i] = times * (i+1);
        }

        return result;
    }

    public static void print(int[] result) {
        for(int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }

    public static void practice () {
        // 2단
//        System.out.println("2단");
//        System.out.println(2 * 1);
//        System.out.println(2 * 2);
//        System.out.println(2 * 3);
//        System.out.println(2 * 4);
//        System.out.println(2 * 5);
//        System.out.println(2 * 6);
//        System.out.println(2 * 7);
//        System.out.println(2 * 8);
//        System.out.println(2 * 9);

        // 3단
//        System.out.println("3단");
//        System.out.println(3 * 1);
//        System.out.println(3 * 2);
//        System.out.println(3 * 3);
//        System.out.println(3 * 4);
//        System.out.println(3 * 5);
//        System.out.println(3 * 6);
//        System.out.println(3 * 7);
//        System.out.println(3 * 8);
//        System.out.println(3 * 9);

        // 4단
//        System.out.println("4단");
//        int result = 4 * 1;
//        System.out.println(result);
//        result = 4 * 2;
//        System.out.println(result);
//        result = 4 * 3;
//        System.out.println(result);
//        result = 4 * 4;
//        System.out.println(result);
//        result = 4 * 5;
//        System.out.println(result);
//        result = 4 * 6;
//        System.out.println(result);
//        result = 4 * 7;
//        System.out.println(result);
//        result = 4 * 8;
//        System.out.println(result);
//        result = 4 * 9;
//        System.out.println(result);

        // 5단
//        System.out.println("구구단 중 출력할 단은? : ");
//        Scanner scanner = new Scanner(System.in);
//        int number = scanner.nextInt();
//        System.out.println("number : " + number);
//
//        int result  = number * 1;
//        System.out.println(result);
//        result  = number * 2;
//        System.out.println(result);
//        result  = number * 3;
//        System.out.println(result);
//        result  = number * 4;
//        System.out.println(result);
//        result  = number * 5;
//        System.out.println(result);
//        result  = number * 6;
//        System.out.println(result);
//        result  = number * 7;
//        System.out.println(result);
//        result  = number * 8;
//        System.out.println(result);
//        result  = number * 9;
//        System.out.println(result);

        // 6단
//        int i = 1;
//        while (i < 10) {
//            System.out.println(6 * i);
//            i++;
//        }

        // 7단
//        for (int j = 1; j < 10; j++) {
//            System.out.println(7 * j);
//        }

        // 8, 9단
//        System.out.println("구구단 중 출력할 단은? : ");
//        Scanner scanner = new Scanner(System.in);
//        int number = scanner.nextInt();
//        System.out.println("사용자가 입력한 값 : " + number);
//
//        if (number < 2) {
//            System.out.println("값을 잘못 입력했습니다.");
//        } else if (number > 9) {
//            System.out.println("값을 잘못 입력했습니다.");
//        } else {
//            for (int i = 1; i < 10; i++) {
//                System.out.println(number * i);
//            }
//        }

//        int[][] result = new int[8][9];
//        for(int i = 2; i <= result.length + 1; i++) {
//            for(int j = 1; j <= result[i-2].length; j++) {
//                result[i-2][j-1] = i * j;
//            }
//        }
//
//        for(int i = 1; i <= result.length; i++) {
//            for(int j = 1; j <= result[i-1].length; j++) {
//                System.out.println(result[i-1][j-1]);
//            }
//        }
    }
}
