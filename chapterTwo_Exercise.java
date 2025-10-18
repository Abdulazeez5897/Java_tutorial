//  PART ONE
// A
class TapeDeck {
 boolean canRecord = false;
 void playTape() {
 System.out.println(“tape playing”);
 }
 void recordTape() {
 System.out.println(“tape recording”);
 }
}
class TapeDeckTestDrive {
 public static void main(String [] args) {
 t.canRecord = true; // the varaible t used here is not defined any where.
 t.playTape(); // the varaible t used here is not defined any where.
 if (t.canRecord == true) {
 t.recordTape();
 }
 }
}
// This would through a run time error.
// HOW TO FIX
class TapeDeck {
 boolean canRecord = false;
 void playTape() {
 System.out.println("tape playing");
 }
 void recordTape() {
 System.out.println("tape recording");
 }
}
class TapeDeckTestDrive {
 public static void main(String [] args) {
    TapeDeck t = new TapeDeck(); // Add this line here.
 t.canRecord = true;
 t.playTape();
 if (t.canRecord == true) {
 t.recordTape();
 }
 }
}
// OUTPUT
tape playing
tape recording

// B
class DVDPlayer {
 boolean canRecord = false;
 void recordDVD() {
 System.out.println("DVD recording");
 }
}
class DVDPlayerTestDrive {
 public static void main(String [] args) {
 DVDPlayer d = new DVDPlayer();
 d.canRecord = true;
 d.playDVD(); //no playDVD method.
 if (d.canRecord == true) {
 d.recordDVD();
 }
 }
}
// THIS WOULD THROUGH A RUNTIME ERROR.
// HOW TO FIX
class DVDPlayer {
 boolean canRecord = false;
 void recordDVD() {
 System.out.println("DVD recording");
 }
 void playDVD() { // Add this method.
 System.out.println("DVD playing");
 }
}
class DVDPlayerTestDrive {
 public static void main(String [] args) {
 DVDPlayer d = new DVDPlayer();
 d.canRecord = true;
 d.playDVD(); //no playDVD method.
 if (d.canRecord == true) {
 d.recordDVD();
 }
 }
}
// OUTPUT
DVD playing
DVD recording

  // PART TWO

  class DrumKit {
    boolean topHat = true;
    boolean snare = true;

    void playTopHat () {
        System.out.println("ding ding da-ding");
    }
    void playSnare () {
        System.out.println("bang bang ba-bang");
    }
}

class DrumKitTestDrive {
    public static void main(String [] args) {
        DrumKit d = new DrumKit();
        d.snare = false;
        if (d.snare = true ) {
            d.playSnare();
        }
        d.playTopHat();
    }
}
//OUTPUT

bang bang ba-bang
ding ding da-ding
