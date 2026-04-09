public class Main {
    public static void main(String[] args) {
        Hero yve = new Hero("Yve", 100, 50, 12);
        Hero cyclops = new Hero("Cyclops", 90, 60, 14);

        System.out.println("Midlaner adu mekanik");
        yve.status();
        cyclops.status();

        System.out.println("1. Basic attack");
        yve.attack(cyclops);
        cyclops.status();

        System.out.println("2. Skill");
        cyclops.skill(yve);
        yve.status();

        System.out.println("3. Regen");
        yve.regen();
        yve.status();

        System.out.println("4. Spam skill sampai mana habis");
        cyclops.skill(yve);
        yve.status();

        cyclops.skill(yve);
        yve.status();

        System.out.println("5. Kill");
        while (!yve.isDead()) {
            cyclops.attack(yve);
        }
        yve.status();

        System.out.println("6. Montage top global cyclops");
        yve.attack(cyclops);
        yve.skill(cyclops);
        yve.regen();
        System.out.println("------------------------------------|");

        System.out.println("7. Mencoba regen tapi sudah mati");
        yve.regen();
        System.out.println("------------------------------------|");

        System.out.println("8. Menyerang musuh tapi musuh sudah mati");
        while (!cyclops.isDead()) {
            yve.attack(cyclops);
            break;
        }
        System.out.println("------------------------------------|");

        System.out.println("9. Regen sampai full HP");
        Hero estes = new Hero("Estes", 50, 30, 10);
        estes.status();

        estes.regen();
        estes.status();

        estes.regen();
        estes.status();

        estes.regen();
        estes.status();

        System.out.println("Hasil adu mekanik");
        yve.status();
        cyclops.status();
        estes.status();
    }
}