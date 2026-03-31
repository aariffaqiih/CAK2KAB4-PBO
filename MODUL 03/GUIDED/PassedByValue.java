class TestPass {
    int i, j;

    TestPass(int a, int b) {
        i = a;
        j = b;
    }

    void calculate(int m, int n) {
        m = m * 10;
        n = n / 2;
    }

    void calculate(TestPass e) {
        e.i = e.i * 10;
        e.j = e.j / 2;
    }
}

class PassedByValue {
    public static void main(String[] args) {
        int x, y;
        TestPass z;

        z = new TestPass(50, 100);
        x = 10;
        y = 20;

        System.out.println("Nilai sebelum passed by value : ");
        System.out.println("x = " + x);
        System.out.println("y = " + y);

        z.calculate(x, y);

        System.out.println("Nilai sesudah passed by value : ");
        System.out.println("x = " + x);
        System.out.println("y = " + y);

        System.out.println("Nilai sebelum passed by reference : ");
        System.out.println("z.i = " + z.i);
        System.out.println("z.j = " + z.j);

        z.calculate(z);

        System.out.println("Nilai sesudah passed by reference : ");
        System.out.println("z.i = " + z.i);
        System.out.println("z.j = " + z.j);
    }
}