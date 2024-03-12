class MySubclass<T, U, V, W> implements MyInterface<T, U, V, W> {
    private T element1;
    private U element2;
    private V element3;
    private W element4;

    public MySubclass(T element1, U element2, V element3, W element4) {
        this.element1 = element1;
        this.element2 = element2;
        this.element3 = element3;
        this.element4 = element4;
    }

    @Override
    public T getValueT() {
        return element1;
    }

    @Override
    public U getValueU() {
        return element2;
    }

    @Override
    public V getValueV() {
        return element3;
    }

    @Override
    public W getValueW() {
        return element4;
    }
}