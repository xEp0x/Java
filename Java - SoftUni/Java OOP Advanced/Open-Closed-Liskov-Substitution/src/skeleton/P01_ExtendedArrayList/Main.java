package skeleton.P01_ExtendedArrayList;



public class Main {
    public static void main(String[] args) {
        ExtendedArrayList<Integer> someList = new ExtendedArrayList<>();
        someList.add(1);
        someList.add(2);
        someList.add(3);
        someList.add(4);
        System.out.println(someList.max());
        System.out.println(someList.min());
    }
}
