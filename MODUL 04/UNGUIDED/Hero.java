class Hero {
    private final String nama;
    private int hp;
    private int mana;
    private int damage;

    private int nilaiTerakhir = 0;
    private int hpSebelum = 0;
    private int manaSebelum = 0;
    private String tipeAksiTerakhir = "";

    private static final int max_hp = 100;
    private static final int max_mana = 100;
    private static final int max_damage = 15;
    private static final int mana_cost = 25;
    private static final int regen = 15;

    public Hero(String nama, int hp, int mana, int damage) {
        if (nama == null || nama.isEmpty()) {
            throw new IllegalArgumentException("Nama tidak valid");
        }

        this.nama = nama;

        hp(hp);
        mana(mana);
        damage(damage);
    }

    private void hp(int value) {
        if (value < 0) {
            this.hp = 0;
        } else if (value > max_hp) {
            this.hp = max_hp;
        } else {
            this.hp = value;
        }
    }

    private void mana(int value) {
        if (value < 0) {
            this.mana = 0;
        } else if (value > max_mana) {
            this.mana = max_mana;
        } else {
            this.mana = value;
        }
    }

    private void damage(int value) {
        if (value < 0) {
            this.damage = 0;
        } else if (value > max_damage) {
            this.damage = max_damage;
        } else {
            this.damage = value;
        }
    }

    public boolean isDead() {
        return this.hp == 0;
    }

    public String getNama() {
        return this.nama;
    }

    private void takeDamage(int damage) {
        if (this.isDead()) return;

        if (damage < 0) {
            throw new IllegalArgumentException("Damage tidak boleh negatif");
        }

        this.hpSebelum = this.hp;
        this.nilaiTerakhir = damage;
        this.tipeAksiTerakhir = "damage";

        hp(this.hp - damage);
    }

    public void attack(Hero musuh) {
        if (this.isDead()) {
            System.out.println(nama + " tidak bisa menyerang karena sudah mati");
            return;
        }

        if (musuh.isDead()) {
            System.out.println("Target sudah mati");
            return;
        }

        musuh.takeDamage(this.damage);
        System.out.println(nama + " menyerang " + musuh.getNama() + " dengan damage sebesar " + damage);
    }

    public void skill(Hero musuh) {
        if (this.isDead()) {
            System.out.println(nama + " sudah mati, tidak bisa menggunakan skill");
            return;
        }

        if (this.mana < mana_cost) {
            System.out.println(nama + " tidak memiliki cukup mana");
            return;
        }

        if (musuh.isDead()) {
            System.out.println("Target sudah mati");
            return;
        }

        int skillDamage = this.damage * 2;

        this.manaSebelum = this.mana;
        this.nilaiTerakhir = mana_cost;
        this.tipeAksiTerakhir = "mana";

        mana(this.mana - mana_cost);
        musuh.takeDamage(skillDamage);
        System.out.println(nama + " menggunakan skill ke " + musuh.getNama() + " dengan damage sebesar " + skillDamage);
    }

    public void regen() {
        if (this.isDead()) {
            System.out.println(nama + " sudah mati, tidak bisa regen");
            return;
        }

        if (this.hp == max_hp) {
            System.out.println("HP " + nama + " sudah penuh");
            return;
        }

        this.hpSebelum = this.hp;
        this.nilaiTerakhir = regen;
        this.tipeAksiTerakhir = "regen";

        hp(this.hp + regen);
        System.out.println(nama + " melakukan regen sebanyak " + regen + " HP");
    }

    public void status() {
        String kondisi;

        if (hp == 0) {
            kondisi = "DEAD";
        } else {
            kondisi = "ALIVE";
        }

        System.out.println("Nama         : " + nama);

        switch (tipeAksiTerakhir) {
            case "damage":
                System.out.println("HP           : " + hpSebelum + " - " + nilaiTerakhir + " = " + hp);
                break;
            case "regen":
                System.out.println("HP           : " + hpSebelum + " + " + nilaiTerakhir + " = " + hp);
                break;
            default:
                System.out.println("HP           : " + hp);
                break;
        }

        switch (tipeAksiTerakhir) {
            case "mana":
                System.out.println("Mana         : " + manaSebelum + " - " + nilaiTerakhir + " = " + mana);
                break;
            default:
                System.out.println("Mana         : " + mana);
                break;
        }

        System.out.println("Damage basic : " + damage);
        System.out.println("Damage skill : " + (damage * 2));
        System.out.println("Status       : " + kondisi);
        System.out.println("------------------------------------|");
    }
}