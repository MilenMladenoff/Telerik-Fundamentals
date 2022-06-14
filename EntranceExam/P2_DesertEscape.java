package EntranceExam;

import java.util.Scanner;

public class P2_DesertEscape {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        StringBuilder safeDirections = new StringBuilder();

        for (int i = 1; i <= n; i++) {
            String[] inputLine = scan.nextLine().split("\\s+");
            char direction = inputLine[0].charAt(0);
            int distance = Integer.parseInt(inputLine[1].replace("km", ""));
            String terrainDelay = inputLine[2];
            double camelRun = 5 * 12;

            switch (terrainDelay) {
                case "D1":
                    camelRun *= 0.9;
                    break;
                case "D2":
                    camelRun *= 0.87;
                    break;
                case "D3":
                    camelRun *= 0.85;
                    break;
                case "D4":
                    camelRun *= 0.82;
                    break;
                case "D5":
                    camelRun *= 0.79;
                    break;
                case "D6":
                    camelRun *= 0.78;
                    break;
                case "D7":
                    camelRun *= 0.74;
                    break;
                case "D8":
                    camelRun *= 0.72;
                    break;
                case "D9":
                    camelRun *= 0.69;
                    break;
                case "D10":
                    camelRun *= 0.67;
                    break;
            }

            if (camelRun >= distance) {
                safeDirections.append(direction).append(",");
            }
        }

        if (safeDirections.length() > 0 && safeDirections.charAt(safeDirections.length() - 1) == ',') {
            safeDirections.deleteCharAt(safeDirections.length() - 1);
        }

        System.out.println(safeDirections);
    }
}
