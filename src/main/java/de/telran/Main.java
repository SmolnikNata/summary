package de.telran;

import java.util.Arrays;

public class Main {
    private static final Library[] LIBRARIES = Generator.libraryGen();
    public static void main(String[] args) {
        //Generator.bookGenerator(150);
//        System.out.println(Arrays.toString(Generator.bookGenerator(150)));
//        Handler.printAllAddresses(LIBRARIES);
//        Handler.printTotalBookCount(LIBRARIES);
//        Handler.printAllBookNames(LIBRARIES[0]);
        Handler.printLibrariesWithEBooks(LIBRARIES);
       // Handler.printLibrariesWithMoreThanXBooks(LIBRARIES,14 );
    }
}