package TeachMeSkills.Generic;

public final class Optional <T> {


    private final T o;

    public Optional(T o) {
        this.o = o;
    }

    public boolean isEmpty(){
        return o== null;

    }

    public T get(){
        return o;
    }
}
