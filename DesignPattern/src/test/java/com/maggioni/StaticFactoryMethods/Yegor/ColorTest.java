package com.maggioni.StaticFactoryMethods.Yegor;

import com.maggioni.StaticFactoryMethods.Yegor.Entities.Joshua.ColorJ;
import com.maggioni.StaticFactoryMethods.Yegor.Entities.Yegor.ColorBase;
import com.maggioni.StaticFactoryMethods.Yegor.Entities.Yegor.HexColor;
import com.maggioni.StaticFactoryMethods.Yegor.Entities.Yegor.RGBColor;
import org.junit.Test;

import static org.junit.Assert.*;

public class ColorTest {

    @Test
    public void testNewColor(){
        int hex = 123;
        ColorJ colorJ = ColorJ.makeFromHex(hex);
        HexColor hexColor = new HexColor(hex);
        assertEquals(colorJ.getHex(),hexColor.getHex());
    }

    @Test
    public void testTomato() {
        int red = 255; int green = 99; int blue = 71;
        ColorBase tomatoJ = ColorJ.makeFromPalette(red, green, blue);
        ColorBase tomatoY = new RGBColor(red, green, blue);
        assertEquals(tomatoJ.getHex(),tomatoY.getHex());
    }

    @Test
    public void test() {
        int red = 255; int green = 99; int blue = 71;
        int i = red << 16 + green << 8 + blue;
        System.out.println(i);
        int hexValue1 = 0x100;
        System.out.println(hexValue1);
    }
}