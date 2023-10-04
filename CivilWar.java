import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class CivilWar {
   
      public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        List<Integer> powers = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            powers.add(scanner.nextInt());
        }

        // Sort the powers using Java 8 Stream API
        List<Integer> sortedPowers = powers.stream()
                .sorted(Comparator.comparingInt(a -> Math.abs(a))
                        .thenComparing(Comparator.reverseOrder()))
                .collect(Collectors.toList());

        int teamAPower = 0;
        int teamBPower = 0;
        boolean ironmanTurn = true;

        for (int i = 0; i < N; i++) {
            if (ironmanTurn) {
                teamAPower += sortedPowers.get(i);
            } else {
                teamBPower += sortedPowers.get(i);
            }
            ironmanTurn = !ironmanTurn;
        }

        int powerDifference = Math.abs(teamAPower - teamBPower);
        System.out.println(powerDifference);
    }
}
