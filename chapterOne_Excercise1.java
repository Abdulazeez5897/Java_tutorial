// part one
class shuffle1 {
    public static void main(String[] args) {
        int x = 3;
        while (x > 0) {
            if (x > 2) {
                System.out.print("a");
            }
            x = x - 1;
            System.out.print("-");
            if (x == 2) {
                System.out.print("b c");
            }
            x = x - 1;
            System.out.print("-");
            if (x == 1) {
                System.out.print("d");
                x = x - 1;
            }
        }
    }
}
// part two

// A
class Exercise1b {
 public static void main(String [] args) {
 int x = 1;
 while ( x < 10 ) {
 if ( x > 3) {
 System.out.println(“big x”);
 }
 }
 }
}
// This will compile without an output... and loop continues till infinity
// How to fix
class Exercise1b {
 public static void main(String [] args) {
 int x = 1;
 while ( x < 10 ) {
     x = x + 1;
 if ( x > 3) {
 System.out.println(“big x”);
 }
 }
 }
}

//B
public static void main(String [] args) {
 int x = 5;
 while ( x > 1 ) {
 x = x - 1; //Add this line
 if ( x < 3) {
 System.out.println(“small x”);
 }
 }
}
// This code won't run without a class declaration
// How to fix
class Excercise2b { //Add this line
public static void main(String [] args) {
 int x = 5;
 while ( x > 1 ) {
 x = x - 1;
 if ( x < 3) {
 System.out.println(“small x”);
 }
 }
}
}

//C
class Exercise1b {
 int x = 5;
 while ( x > 1 ) {
 x = x - 1;
 if ( x < 3) {
 System.out.println(“small x”);
 }
 }
}
//This code won't run without the main method
//How to fix
class Exercise1b {
    public static void main(string [] args) {
        int x = 5;
 while ( x > 1 ) {
 x = x - 1;
 if ( x < 3) {
 System.out.println(“small x”);
 }
 }
}
}
