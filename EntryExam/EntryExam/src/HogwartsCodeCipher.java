import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HogwartsCodeCipher {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String encryptedMessage= scanner.nextLine();
        int shift=Integer.parseInt(scanner.nextLine());
        List<Character> decryptMessage=new ArrayList<>();

        for (int i = 0; i < encryptedMessage.length(); i++) {
            decryptMessage.add((char)(encryptedMessage.charAt(i)-shift));
        }
        for (char ch:decryptMessage){
            System.out.print(ch);
        }
    }
}
