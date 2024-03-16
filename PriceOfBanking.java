import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class PriceOfBanking {
    public static void bankingPrice(String a, int b) {
        int price = 0;

        if (a.equals("Normal")) {
            price = 100000;
        }
        else if (a.equals("Gold")) {
            price = 200000;
        }
        else if (a.equals("Platinum")) {
            price = 500000;
        }

        if (b <= 0) {
            System.out.println("Độ tuổi không hợp lệ!");
        }
        else {
            if (b < 18) price = 0;
            if (b > 55) {
                price = price / 2;
            }
            System.out.println("Số tiền quý khách phải trả là " + price + " đồng");
        }
    }

    public static void main(String[] args) {
        try {
            File file = new File("testcases/decisionTable/test 7.txt");
            Scanner scanner = new Scanner(file);

            String str = scanner.next();
            int number = scanner.nextInt();
            bankingPrice(str, number);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
