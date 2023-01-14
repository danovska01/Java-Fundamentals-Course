package _09_Arrays_More_Ex;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Scanner;

public class _04_LongestIncreasingSubsequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Read a list of integers and find the longest increasing subsequence (LIS).
        // If several such exist, print the leftmost.
        // Input: 3 14 5 12 15 7 8 9 11 10 1
        // Output: 3 5 7 8 9 11

        try (final BufferedReader reader = new BufferedReader(new InputStreamReader(System.in, StandardCharsets.UTF_8))) {

            int[] numbers = Arrays
                    .stream(reader.readLine().trim().split("\\s+"))
                    .mapToInt(Integer::parseInt)
                    .toArray();

            int[] lis = new int[numbers.length];    // Longest increasing sequence for the index
            int[] prev = new int[numbers.length];   // For backtracking of the solution

            for (int currentIndex = 0; currentIndex < numbers.length; currentIndex++) {

                lis[currentIndex] = 1;
                prev[currentIndex] = -1;

                for (int prevIndex = 0; prevIndex < currentIndex; prevIndex++) {

                    if (numbers[prevIndex] < numbers[currentIndex] &&
                            lis[prevIndex] >= lis[currentIndex]) {

                        lis[currentIndex] = lis[prevIndex] + 1;
                        prev[currentIndex] = prevIndex;
                    }
                }
            }

            int lastIndex = -1;
            int maxLen = 0;

            for (int index = 0; index < numbers.length; index++) {
                if (maxLen < lis[index]) {
                    maxLen = lis[index];
                    lastIndex = index;
                }
            }

            int[] lisElements = new int[maxLen];

            while (lastIndex != -1) {
                lisElements[--maxLen] = numbers[lastIndex];
                lastIndex = prev[lastIndex];
            }

            System.out.println(Arrays.toString(lisElements).replaceAll("[,\\[\\]]", "").trim());

        } catch (IOException | NullPointerException e) {
            e.printStackTrace();
        }
    }
}
