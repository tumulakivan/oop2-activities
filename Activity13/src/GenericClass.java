public class GenericClass<T, V> {
    private T data1;
    private V data2;

    public void setData1(T data1) {
        this.data1 = data1;
    }

    public T getData1() {
        return this.data1;
    }

    public void setData2(V data2) {
        this.data2 = data2;
    }

    public V getData2() {
        return this.data2;
    }

    @Override
    public String toString() {
        return this.data1 + " " + this.data2;
    }
}