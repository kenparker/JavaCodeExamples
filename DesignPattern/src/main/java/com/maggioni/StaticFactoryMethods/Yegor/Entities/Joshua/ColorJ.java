package com.maggioni.StaticFactoryMethods.Yegor.Entities.Joshua;

import com.maggioni.StaticFactoryMethods.Yegor.Entities.Yegor.*;

import java.util.Objects;

public class ColorJ implements ColorBase{
    private final Integer hex;

    public ColorJ(Integer hex) {
        this.hex = hex;
    }

    public ColorJ(Integer red, Integer green, Integer blue) {
        this(red << 16 + green << 8 + blue);
    }

    public ColorJ(String RGB) {
        this.hex = Integer.parseInt(RGB,16);
    }

    public static ColorJ makeFromRGB(String RGB) {
        return new ColorJ(RGB);
    }

    public static ColorJ makeFromHex(Integer hex) {
        return new ColorJ(hex);
    }

    public static ColorJ makeFromPalette(Integer red, Integer green, Integer blue) {
        return new ColorJ(red,green,blue);
    }

    public Integer getHex() {
        return hex;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ColorJ)) return false;
        ColorJ colorJ = (ColorJ) o;
        return Objects.equals(hex, colorJ.hex);
    }

    @Override
    public int hashCode() {

        return Objects.hash(hex);
    }
}
