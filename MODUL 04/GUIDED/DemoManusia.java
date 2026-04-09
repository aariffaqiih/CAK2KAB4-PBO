public class DemoManusia {
    public static void main(String[] args) {  // program utama
        Manusia arrMns[] = new Manusia[3];    // buat array of Object
        Manusia objMns1 = new Manusia();      // constructor pertama
        objMns1.setNama("Markonah");
        objMns1.setUmur(76);
        Manusia objMns2 = new Manusia("Mat Conan");   //constructor kedua
        Manusia objMns3 = new Manusia("Bajuri", 13);  //constructor ketiga
        arrMns[0] = objMns1;
        arrMns[1] = objMns2;
        arrMns[2] = objMns3;

        for(int i=0; i<3; i++) {
            System.out.println("Nama : "+arrMns[i].getNama());
            System.out.println("Umur : "+arrMns[i].getUmur());
            System.out.println();
        }
    }
}