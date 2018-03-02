package com.maggioni.StaticFactoryMethods.Yegor.Entities.Yegor;

import java.util.Objects;

public class HexColor implements ColorBase {
    private final Integer hex;

    public HexColor(Integer hex) {
        this.hex = hex;
    }

    public int getHex() {
        return hex;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof HexColor)) return false;
        HexColor that = (HexColor) o;
        return Objects.equals(hex, that.hex);
    }

    @Override
    public int hashCode() {
        return Objects.hash(hex);
    }
}
