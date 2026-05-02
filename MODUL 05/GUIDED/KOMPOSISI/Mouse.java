public class Mouse {
    private String Merk, Type;

    public Mouse(String m, String t) {
        this.Merk = m;
        this.Type = t;
    }

    public void DisplaySpecMouse() {
        System.out.println(this.Merk + ", " + this.Type);
    }
}