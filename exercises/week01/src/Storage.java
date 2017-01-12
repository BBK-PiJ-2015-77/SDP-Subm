/**
 * Created by thomasmcgarry on 12/01/2017.
 */
public class Storage<T> {

    T x;

    public void setValue(T value) {
        x = value;
    }

    public T getValue() {
        return x;
    }

}
