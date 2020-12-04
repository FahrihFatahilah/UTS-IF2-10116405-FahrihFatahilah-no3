package uts.if2.pkg10116405.fahrihfatahilah.no3;

public class Rnb extends MusicGenre implements Blues, Jazz{
    public void genreBlues(String artistName) {
        System.out.println(artistName+" adalah musisi Blues");
    }

    public void genreJazz(String artistName) {
        System.out.println(artistName+" adalah musisi Jazz");
    }
}
