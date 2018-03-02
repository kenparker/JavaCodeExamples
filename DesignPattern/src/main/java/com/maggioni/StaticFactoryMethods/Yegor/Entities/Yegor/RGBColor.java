package com.maggioni.StaticFactoryMethods.Yegor.Entities.Yegor;

import java.util.Objects;

public class RGBColor implements ColorBase {
    private final ColorBase origin;

    public RGBColor(int red, int green, int blue) {
        origin = new HexColor(red*65536+green*256+blue);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof RGBColor)) return false;
        RGBColor that = (RGBColor) o;
        return Objects.equals(origin, that.origin);
    }

    @Override
    public int hashCode() {
        return Objects.hash(origin);
    }

    public ColorBase getOrigin() {
        return origin;
    }

    @Override
    public int getHex() {
        return origin.getHex();
    }
}
