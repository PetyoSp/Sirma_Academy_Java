import java.util.Arrays;
import java.util.Scanner;

public class OrderOfThePhoenixVotes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] vote = scanner.nextLine().split(", ");
        int voteYes = 0;
        int voteNo = 0;
        for (String st : vote) {
            if (st.equals("Yes")) {
                voteYes += 1;

            } else if (st.equals("No")) {
                voteNo += 1;

            }
        }
        if (voteYes > voteNo) {
            System.out.println("Yes");
        } else if (voteYes < voteNo) {
            System.out.println("No");
        } else if (voteYes == voteNo && voteYes != 0) {
            System.out.println("Tie");
        } else  {
            System.out.println("Abstain");

        }

    }
}
