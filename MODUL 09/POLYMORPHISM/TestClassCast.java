class TestClassCast {
    public static void main(String[] args) {
        TestClassCast t = new TestClassCast();
        t.lAkukanSesuatu();
    }

    void lAkukanSesuatu() {
        A a = new A();
        /* Statement di bawah dapat dicompile, akan tetapi
         * saat dijalankan akan melemparkan exception
         * ClassCastException !!!!
         */
        B b = (B) a;
    }
}