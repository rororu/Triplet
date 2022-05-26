import java.util.*;

public class Triplet<E extends Comparable<E>> {
    private final E first;
    private final E second;
    private final E third;
    private final List<E> list;

    Triplet(E first, E second, E third) {
        this.first = first;
        this.second = second;
        this.third = third;

        list = Arrays.asList(first, second, third);
    }

    public E getFirst() {
        return first;
    }

    public E getSecond() {
        return second;
    }

    public E getThird() {
        return third;
    }

    @Override
    public String toString() {
        return list.toString();
    }

    public final boolean checkOfObject(E obj) {
        return list.contains(obj);
    }

    public final E min() {
        return Collections.min(list);
    }

    public final String sum() {
        if (getFirst() instanceof Number
                && getSecond() instanceof Number
                && getThird() instanceof Number) {
            double sum = 0D;

            for (E obj: list) {
                sum += ((Number) obj).doubleValue();
            }
            return Double.toString(sum);
        } else {
            StringBuilder result = new StringBuilder();

            for (int i = 0; i < 3; i++) {
                result.append(list.get(i));
                if (i != 2) {
                    result.append(" ");
                }
            }
            return result.toString();
        }
    }
}
