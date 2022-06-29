import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MyOwnLists {

    public static <T> List<T> asListedSorted (T [] array, Comparator<? super T> c) {
        List<T> lista = Arrays.asList(array);
        Collections.sort(lista, c);
        return lista;
    }
}
