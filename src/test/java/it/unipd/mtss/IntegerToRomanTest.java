////////////////////////////////////////////////////////////////////
// [CATERINA] [VALLOTTO] [2076434]
// [VICTORIA] [DURNEA] [2076324]
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class IntegerToRomanTest {

    @Test
    public void testConvert() {
        assertEquals("CD", IntegerToRoman.convert(400));
        assertEquals("DI", IntegerToRoman.convert(501));
        assertEquals("DXLV", IntegerToRoman.convert(545));
        assertEquals("DXI", IntegerToRoman.convert(511));
        assertEquals("DXXXIX", IntegerToRoman.convert(539));
        assertEquals("DL", IntegerToRoman.convert(550));
        assertEquals("DXCIX", IntegerToRoman.convert(599));
        assertEquals("DC", IntegerToRoman.convert(600));
        assertEquals("DCL", IntegerToRoman.convert(650));
        assertEquals("DCXCIX", IntegerToRoman.convert(699));
        assertEquals("DCC", IntegerToRoman.convert(700));
        assertEquals("DCCL", IntegerToRoman.convert(750));
        assertEquals("DCCXCIX", IntegerToRoman.convert(799));
        assertEquals("DCCC", IntegerToRoman.convert(800));
        assertEquals("DCCCL", IntegerToRoman.convert(850));
        assertEquals("DCCCXCIX", IntegerToRoman.convert(899));
        assertEquals("CM", IntegerToRoman.convert(900));
        assertEquals("CML", IntegerToRoman.convert(950));
        assertEquals("CMXCIX", IntegerToRoman.convert(999));
        assertEquals("M", IntegerToRoman.convert(1000));
        assertEquals("IV", IntegerToRoman.convert(4));
        assertEquals("Numero non valido", IntegerToRoman.convert(1001));
        assertEquals("Numero non valido", IntegerToRoman.convert(0));
    }
}
