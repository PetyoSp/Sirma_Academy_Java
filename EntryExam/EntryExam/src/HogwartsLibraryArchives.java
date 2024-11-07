import java.util.Scanner;

public class HogwartsLibraryArchives {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] magicalRecords = scanner.nextLine().split(", ");
        String name = scanner.nextLine();
        int first = 0, last = 0;
        boolean saveFirst = true;

        for (int i = 0; i < magicalRecords.length; i++) {

            if (magicalRecords[i].equals(name)) {
                if (saveFirst) {
                    first = i;
                    last=first;
                    saveFirst = false;
                } else {
                    last = i;
                }

            }

        }
        if (saveFirst) {
            System.out.println("Record not found");
        } else {
            System.out.printf("First Occurrence: %d %n", first);
            System.out.printf("Last Occurrence: %d %n", last);
        }
    }
}
