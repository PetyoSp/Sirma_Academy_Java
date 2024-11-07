import java.util.ArrayList;
import java.util.Scanner;

public class AurorBattleFormation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] inputFormationAsString = scanner.nextLine().split(", ");
        ArrayList<Integer> formation = new ArrayList<>();
        for (String addToList : inputFormationAsString) {
            formation.add(Integer.parseInt(addToList));
        }
        boolean end = true;
        while (end) {
            String[] commandSring = scanner.nextLine().split(" ");
            switch (commandSring[0]) {
                case "destroy":
                    int indexDestroy = Integer.parseInt(commandSring[1]);
                    if (indexDestroy >= 0 && indexDestroy < formation.size()) {
                        formation.remove(indexDestroy);
                        printFormation(formation);
                    }
                    break;
                case "swap":
                    int firstIndex = Integer.parseInt(commandSring[1]);
                    int secondIndex = Integer.parseInt(commandSring[2]);
                    if (firstIndex >= 0
                            && firstIndex <= formation.size()
                            && secondIndex >= 0
                            && secondIndex <= formation.size()
                            && firstIndex != secondIndex) {
                        int swap = formation.get(firstIndex);
                        formation.set(firstIndex, formation.get(secondIndex));
                        formation.set(secondIndex, swap);
                        printFormation(formation);
                    }
                    break;
                case "add":
                        formation.add(Integer.parseInt(commandSring[1]));
                        printFormation(formation);

                    break;
                case "center":
                    if (formation.size() % 2 == 0) {
                        int centerIndex = formation.size() / 2;
                        System.out.println(formation.get(centerIndex-1) + " " + formation.get(centerIndex));
                    } else {
                        int index = formation.size() / 2;
                        System.out.println(formation.get(index));
                    }
                    break;
                case "insert":
                    int insertIndex = Integer.parseInt(commandSring[2]);
                    int insertValue = Integer.parseInt(commandSring[1]);
                    if (insertIndex >= 0 && insertIndex <= formation.size()) {
                        formation.add(insertIndex, insertValue);
                        printFormation(formation);
                    }
                    break;

                case "end":
                    end = false;
                    break;

                default:
                    break;
            }


        }

    }

    public static void printFormation(ArrayList<Integer> printFormation) {
        for (Integer print : printFormation) {
            System.out.print(print + " ");
        }
        System.out.println();

    }
}

