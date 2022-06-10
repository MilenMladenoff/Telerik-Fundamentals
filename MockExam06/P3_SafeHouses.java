package MockExam06;

import java.util.Arrays;
import java.util.Scanner;

public class P3_SafeHouses {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int spawnPoints = Integer.parseInt(scan.nextLine());
        int[] houses = new int[spawnPoints];
        int[] safeHousesIndices = Arrays.stream(scan.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt).toArray();

        Arrays.sort(safeHousesIndices);

        for (int i = 0; i < spawnPoints; i++) {

            for (int safeHouseIndex : safeHousesIndices) {

                if (i == safeHouseIndex) {
                    houses[i] = 1;
                    break;
                }
            }
        }

        int distanceCounter = 0;
        int safeHousesCounter = 0;
        int maxDistance = 0;
        double distanceBetweenHouses = 0.0;

        for (int i = 0; i < houses.length; i++) {

            if (houses[i] == 0) {
                distanceCounter++;

                if (maxDistance < distanceCounter && (safeHousesCounter == 0 || safeHousesIndices.length == safeHousesCounter)) {
                    maxDistance = distanceCounter;
                } else if (maxDistance < distanceCounter
                        && (safeHousesCounter > 0 && safeHousesIndices.length > safeHousesCounter)) {

                    distanceBetweenHouses = Math.ceil(distanceCounter * 1.0 / 2);

                    if (maxDistance < distanceBetweenHouses) {
                        maxDistance = (int) distanceBetweenHouses;
                    }
                }

            } else {
                safeHousesCounter++;
                distanceCounter = 0;
            }
        }

        System.out.println(maxDistance);
    }
}
