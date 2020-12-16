import java.util.ArrayDeque;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        int[] input = new int[count];
        for (int i = 0; i < count; i++) {
            input[i] = scanner.nextInt();
        }
        IntStream.of(input).boxed()
                .collect(Collectors.toCollection(ArrayDeque::new)) // or LinkedList
                .descendingIterator()
                .forEachRemaining(System.out::println);
    }
}