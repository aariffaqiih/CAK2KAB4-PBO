public class Manusia {
    private String nama;
    private int umur;
    //definisi constructor
    public Manusia(){ }        //constructor pertama = default tanpa parameter
    public Manusia(String a){  //constructor kedua
        nama=a;
    }
    public Manusia(String a, int b){  //constructor ketiga
        nama=a;
        umur=b;
    }
    //definisi Method
    public void setNama(String a){
        nama=a;
    }
    public String getNama(){
        return nama;
    }
    public void setUmur(int a){
        umur=a;
    }
    public int getUmur(){
        return umur;
    }
}