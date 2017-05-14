package observer;

/**
 * Created by thomasmcgarry on 13/05/2017.
 */
public interface Subject {

    public void register(Observer o);
    public void unregister(Observer o);
    public void notifyObserver();

}
