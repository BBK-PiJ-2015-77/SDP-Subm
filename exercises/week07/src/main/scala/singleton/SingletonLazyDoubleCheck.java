package singleton;

public class SingletonLazyDoubleCheck {
    private volatile static SingletonLazyDoubleCheck sc = null;

    private SingletonLazyDoubleCheck() {
    }

    public static SingletonLazyDoubleCheck getInstance() {
        if (sc == null) {
            synchronized (SingletonLazyDoubleCheck.class) {
                if (sc == null) {
                    sc = new SingletonLazyDoubleCheck();
                }
            }
        }
        return sc;
    }
}

/**
 * 2 (a) Why might you decide to lazy-initialise a singleton instance rather than initialise
 * it in its field declaration? Provide code examples of both approaches to illustrate your answer.
 *
 * In lazy initialisation, the creation of the object is deferred until it is actually needed. This
 * is useful for optimising performance - you are not expending computing time until required to do so.
 *
 * The alternative is initialising the object at declaration- called eager initialisation
 *
 *
 *
 */


