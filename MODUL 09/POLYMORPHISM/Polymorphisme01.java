class Polymorphisme01 {
    public static void main(String[] args) {
        A ref = new B();
        
        //cara 1
        B b = (B) ref;
        b.MethodDiB();
        
        //cara 2
        ((B)ref).MethodDiB();
    }
}