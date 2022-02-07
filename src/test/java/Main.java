import java.math.BigDecimal;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] randomElements = Main.fillRandom(); //creating array with the 15 random elements
        System.out.println("Total number of the even numbers is " + Main.countEven(randomElements));  //printing the number of even numbers
        Main.sortArray(randomElements); // printing sorted array



        Phone blackberry = new Phone("RIM",333.0);
        System.out.println( blackberry.getPriceVendor()); // get price and vendor for the Phone



        BankAccount account = new BankAccount();
        account.setBalance(new BigDecimal( 100.00));  
        account.credit(new BigDecimal(200));
        account.debit(new BigDecimal( 350 ));
        System.out.println(account.getBalance());


    }

    public static void sortArray (int[] value){
        int temp = 0;
        for (int i = 0; i < value.length; i++) {
            for (int j = i + 1; j < value.length; j++) {
                if (value[i] > value[j]) {
                    temp = value[i];
                    value[i] = value[j];
                    value[j] = temp;
                }
            }
            System.out.print(value[i] + " ");
        }
    }

    public static int countEven(int[] value){
        int evenCount = 0;
        for (int i = 0; i < value.length; i++) {
            if ( value[i] % 2 == 0) { //selecting even elements
                evenCount++; //counting even elements
            }
        }
        return evenCount;
    }

    public static int[] fillRandom(){
        int[] randomElements = new int[15];
        for (int i = 0; i < randomElements.length; i++) {
            randomElements[i] = new Random().nextInt(10);//storing random elements the range (0-9) in the array
            System.out.print(randomElements[i]); // printing array's elements
        }
        System.out.println("");
        return randomElements;
    }
}
