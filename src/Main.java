public class Main {
    public static void main(String[] args) {
        Triplet<Integer> integerTriplet = new Triplet<>(5, 6, 7);
        System.out.println("Кортеж=" + integerTriplet);
        System.out.println("Входит элемент в кортеж=" + integerTriplet.checkOfObject(1));
        System.out.println("Минимальный элемент кортежа=" + integerTriplet.min());
        System.out.println("Сумма кортежа=" + integerTriplet.sum());

        Triplet<String> stringTriplet = new Triplet<>("Hello", "my", "friends");
        System.out.println("Кортеж=" + stringTriplet);
        System.out.println("Входит элемент в кортеж=" + stringTriplet.checkOfObject("hello"));
        System.out.println("Минимальный элемент кортежа=" + stringTriplet.min());
        System.out.println("Сумма кортежа=" + stringTriplet.sum());

        Triplet<Double> doubleTriplet = new Triplet<>(2.3, 1.5, 4.5);
        System.out.println("Кортеж=" + doubleTriplet);
        System.out.println("Входит элемент в кортеж=" + doubleTriplet.checkOfObject(2.30));
        System.out.println("Минимальный элемент кортежа=" + doubleTriplet.min());
        System.out.println("Сумма кортежа=" + doubleTriplet.sum());
    }
}
