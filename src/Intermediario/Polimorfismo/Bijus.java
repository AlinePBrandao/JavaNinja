package Intermediario.Polimorfismo;

public enum Bijus {

    SHUKAKU("Shukaku", "Gaara", 1),
    MATATABI("Matatabi","Yugito Nii", 2),
    ISOBU("Isobu", "Yagura", 3),
    SON_GOKU("Son Goku", "Roshi", 4),
    KOKUO("Kokuo", "Han", 5),
    SAIKEN("Saiken", "Utakata", 6),
    CHOMEI("Chomei", "Fuu", 7),
    GYUKI("Gyuki", "Killer Bee", 8),
    KURAMA("Kurama", "Naruto Uzumaki", 9);

    String nomeBiju;
    String jinchuriki;
    int numeroDeCaldas;

    Bijus() {
    }

    Bijus(String nomeBiju, String jinchuriki, int numeroDeCaldas) {
        this.nomeBiju = nomeBiju;
        this.jinchuriki = jinchuriki;
        this.numeroDeCaldas = numeroDeCaldas;
    }
}
