package it.unipd.mtss;
import static org.junit.Assert.*;
import org.junit.*;

public class RomanPrinterTest {

    @Test
    public void Test (){
        System.out.println(RomanPrinter.print(1));
        System.out.println(RomanPrinter.print(3));
        System.out.println(RomanPrinter.print(6));
        System.out.println(RomanPrinter.print(10));
        System.out.println(RomanPrinter.print(20));
        System.out.println(RomanPrinter.print(35));
        System.out.println(RomanPrinter.print(50));
        System.out.println(RomanPrinter.print(100));
        System.out.println(RomanPrinter.print(500));
        System.out.println(RomanPrinter.print(783));
        System.out.println(RomanPrinter.print(1000));
    }
}
