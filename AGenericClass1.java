class Main {
    public static void main(String[] args) {
        AGenericClass<Integer> intObj = new AGenericClass<>(5);
        System.out.println("Generic Class returns: " + intObj.getData());

        AGenericClass<String> stringObj = new AGenericClass<>("Java Programming");
        System.out.println("Generic Class returns: " + stringObj.getData());
    }
}

class AGenericClass<T> {
    private T data;

    public AGenericClass(T data) {
        this.data = data;
    }

    public T getData() {
        return this.data;
    }
}
