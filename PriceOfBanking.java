import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class PriceOfBanking {
    public static void bankingPrice(String typeOfCard, int age) {
        int price = 0;

        if (typeOfCard.equals("Normal")) {
            price = 100000;
        }
        else if (typeOfCard.equals("Gold")) {
            price = 200000;
        }
        else {
            price = 500000;
        }

        if (age < 18) price = 0;
        else if (age > 55) {
                price = price / 2;
        }
        System.out.println("Số tiền quý khách phải trả là " + price + " đồng");
}

    public static void main(String[] args) {
        try {
            File file = new File("testcases/controlFlowTesting/Test 3.txt");
            Scanner scanner = new Scanner(file);

            String str = scanner.next();
            int number = scanner.nextInt();
            bankingPrice(str, number);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
