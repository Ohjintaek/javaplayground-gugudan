import java.util.Scanner;

public class GugudanMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("두 개의 값을 콤마로 구분하여 입력해주세요 : ");
        String userInput = scanner.nextLine();
        String[] splitInput = userInput.split(",");
        int first = Integer.parseInt(splitInput[0]);
        int second = Integer.parseInt(splitInput[1]);
        for(int j = 2; j < first + 1; j++) {
            System.out.println(j + "단");
            Gugudan.print(Gugudan.calculate(second, j));
            System.out.println();
        }
    }
}
