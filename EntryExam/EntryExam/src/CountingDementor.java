import java.util.Scanner;

public class CountingDementor {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int intCount = Integer.parseInt(scanner.nextLine());
        int increaseCount = Integer.parseInt(scanner.nextLine());
        int hour = Integer.parseInt(scanner.nextLine());
        int dementors=0;
        for (int i = 0; i < hour; i++) {
            dementors=dementors+(intCount+increaseCount*i);
            
        }
        System.out.println(dementors);
    }
}
