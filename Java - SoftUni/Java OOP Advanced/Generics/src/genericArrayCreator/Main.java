package genericArrayCreator;


public class Main {

    public static void main(String[] args) {
        Integer[] integers = ArrayCreator.create(Integer.class, 5, 1);
        for (Integer integer : integers) {
            System.out.println(integer);
        }
    }
}
