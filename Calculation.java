package src;

public class Calculation {
    private int a;
    private int b;

    public Calculation(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int sum() {
        return a + b;
    }

    public int minus() {
        return a - b;
    }

    public int mul() {
        return a * b;
    }

    public float div() {
        return (float) a / b;
    }
}
