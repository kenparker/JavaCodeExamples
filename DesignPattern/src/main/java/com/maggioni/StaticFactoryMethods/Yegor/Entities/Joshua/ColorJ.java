package com.maggioni.StaticFactoryMethods.Yegor.Entities.Joshua;

import com.maggioni.StaticFactoryMethods.Yegor.Entities.Yegor.*;

import java.util.Objects;

public class ColorJ implements ColorBase{
    private final int hex;

    public ColorJ(int hex) {
        this.hex = hex;
    }

    public ColorJ(int red, int green, int blue) {
        this(red*65536+green*256+blue);
    }

    public ColorJ(String RGB) {
        this.hex = Integer.parseInt(RGB,16);
    }

    public static ColorJ makeFromRGB(String RGB) {
        return new ColorJ(RGB);
    }

    public static ColorJ makeFromHex(int hex) {
        return new ColorJ(hex);
    }

    public static ColorJ makeFromPalette(int red, int green, int blue) {
        return new ColorJ(red,green,blue);
    }

    public int getHex() {
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
