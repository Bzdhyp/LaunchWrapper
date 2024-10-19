import java.util.Arrays;

public class Start {
    public static void main(String[] args) {
        LaunchWrapper.main(concat(new String[] {}, args));
    }

    public static <T> T[] concat(T[] first, T[] second)  {
        T[] result = Arrays.copyOf(first, first.length + second.length);
        System.arraycopy(second, 0, result, first.length, second.length);
        return result;
    }
}
