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
        Integer hex = 123;
        ColorJ colorJ = ColorJ.makeFromHex(hex);
        HexColor hexColor = new HexColor(hex);
        assertEquals(colorJ.getHex(),hexColor.getHex());
    }

    @Test
    public void testTomato() {
        Integer red = 255; Integer green = 99; Integer blue = 71;
        ColorJ tomatoJ = ColorJ.makeFromPalette(red, green, blue);
        RGBColor tomatoY = new RGBColor(red, green, blue);
        assertEquals(tomatoJ.getHex(),((HexColor) tomatoY.getOrigin()).getHex());
    }
}