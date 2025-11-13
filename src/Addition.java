public class Addition {
    public int add(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        Addition addition = new Addition();
        int a = 10;
        int b = 20;
        int sum = addition.add(a, b);

        System.out.println("a: " + a);
        System.out.println("b: " + b);
        System.out.println("Sum: " + sum);
    }
}
