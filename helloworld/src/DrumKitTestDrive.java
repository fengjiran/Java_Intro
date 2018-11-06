public class DrumKitTestDrive {
    public static void main(String[] args) {
        DrumKit d = new DrumKit();
        boolean topHat = true;
        boolean snare = true;

        d.snare = snare;

        if (d.snare)
            d.playSnare();
        d.playTopHat();

    }
}

class DrumKit {
    boolean snare;
    boolean topHat;

    void playTopHat() {
        System.out.println("ding ding da-ding");
    }

    void playSnare() {
        System.out.println("bang bang ba-bang");
    }
}