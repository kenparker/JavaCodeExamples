package com.maggioni.StaticFactoryMethods.Yegor.Entities.Yegor;

import java.util.Objects;

public class RGBColor implements ColorBase {
    private final ColorBase origin;

    public RGBColor(Integer red, Integer green, Integer blue) {
        origin = new HexColor(red << 16 + green << 8 + blue);
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
    public Integer getHex() {
        return origin.getHex();
    }
}
