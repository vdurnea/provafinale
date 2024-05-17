package it.unipd.mtss;
import java.io.*;

public class RomanPrinter {

    public static String print(int num){
        return printAsciiArt(IntegerToRoman.convert(num));
    }

    static String[] I = "  _____ \n |_   _|\n   | |  \n   | |  \n  _| |_ \n |_____|\n".split("\n");
    static String[] V = " __      __\n \\ \\    / /\n  \\ \\  / / \n   \\ \\/ /  \n    \\  /   \n     \\/    \n".split("\n");
    static String[] X = " __   __\n \\ \\ / /\n  \\ V / \n   > <  \n  / . \\ \n /_/ \\_\\\n".split("\n");
    static String[] L = "  _      \n | |     \n | |     \n | |     \n | |____ \n |______|\n".split("\n");
    static String[] C = "   _____ \n  / ____|\n | |     \n | |     \n | |____ \n  \\_____|\n".split("\n");
    static String[] D = "  _____  \n |  __ \\ \n | |  | |\n | |  | |\n | |__| |\n |_____/ \n".split("\n");
    static String[] M = "  __  __ \n |  \\/  |\n | \\  / |\n | |\\/| |\n | |  | |\n |_|  |_|\n".split("\n");

    private static String printAsciiArt(String romanNumber){
        int lung=romanNumber.length();
        StringBuilder asciiArt=new StringBuilder();
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < lung; j++) {
                char c = romanNumber.charAt(j);
                switch(c) {
                    case 'I':
                        asciiArt.append(I[i]);
                        break;
                    case 'V':
                        asciiArt.append(V[i]);
                        break;
                    case 'X':
                        asciiArt.append(X[i]);
                        break;
                    case 'L':
                        asciiArt.append(L[i]);
                        break;
                    case 'C':
                        asciiArt.append(C[i]);
                        break;
                    case 'D':
                        asciiArt.append(D[i]);
                        break;
                    case 'M':
                        asciiArt.append(M[i]);
                        break;
                }
            }
            asciiArt.append("\n");
        }
        return asciiArt.toString();
    }

}
