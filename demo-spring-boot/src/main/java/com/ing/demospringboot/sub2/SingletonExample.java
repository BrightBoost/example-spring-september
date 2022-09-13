package com.ing.demospringboot.sub2;

// this is a singleton (99%), not the same as bean scope singleton
public final class SingletonExample {
    private static SingletonExample singletonExample;
    private SingletonExample() {
        if(singletonExample != null) {
            throw new ExceptionInInitializerError();
        }
    }

    public static synchronized SingletonExample getInstance() {
        if(singletonExample == null) {
            return new SingletonExample();
        } else {
            return singletonExample;
        }
    }
}
