package com.maggioni.StringChallengers;

import org.junit.Test;

import static org.assertj.core.api.Assertions.*;

public class StringChallengers {
    private String duke = new String("duke");
    private String anotherDuke = new String("duke");

    @Test
    public void givenTwoStringsEqualValue_whenBothInPool_thenResultIsSameObject() {
        String juggy = "Juggy";
        String anotherJuggy = "Juggy";
        assertThat(juggy == anotherJuggy).isTrue();
        assertThat(juggy).isSameAs(anotherJuggy);
    }

    @Test
    public void givenTwoStringsEqualValue_whenInHeap_thenResultIsNotSameObject() {
        assertThat(duke == anotherDuke).isFalse();
        assertThat(duke).isNotSameAs(anotherDuke);
    }

    @Test
    public void givenTwoStringsEqualValueInHeap_whenIntern_thenResultIsSameObject() {
        assertThat(duke.intern() == anotherDuke.intern()).isTrue();
        assertThat(duke).isEqualTo(anotherDuke);
    }

    @Test
    public void givenStringWithEqualValuesAfterTrim_whenCompared_thenResultIsNotSameOject() {
        String s1 = " power ".trim(); // new object created
        String s2 = "power";
        assertThat(s1).isEqualTo(s2); // equals but not the same

        assertThat(s1).isNotSameAs(s2); // important
        assertThat(s1==s2).isFalse();
    }

    @Test
    public void givenStringWithEqualValuesAfterTrim_whenIntern_thenResultIsSameObject() {
        String s1 = " power ".trim().intern();
        String s2 = "power";
        assertThat(s1).isEqualTo(s2);
        assertThat(s1).isSameAs(s2);
        assertThat(s1==s2).isTrue();
    }

    @Test
    public void givenStringWithEqualValues_whenTrimIsNotGeneratingNewObject_thenAllStringsAreTheSame() {
        String s1 = "power".trim();
        String s2 = "power";
        String s3 = "power".trim(); // no new object created
        assertThat(s1).isSameAs(s2).isSameAs(s3);
        assertThat(s2).isSameAs(s3);
    }

    @Test
    public  void challenge() {
        String result = "";
        result += "powerfulCode ".trim() == "powerfulCode"
                ? "0" : "1"; // 1

        result += "flexibleCode" == "flexibleCode" ? "2" : "3"; // 02

        result += new String("doYourBest")
                == new String("doYourBest") ? "4" : "5"; // 025

        result += new String("noBugsProject")
                .equals("noBugsProject") ? "6" : "7"; // 0256

        result += new String("breakYourLimits").intern()
                == new String("breakYourLimits").intern() ? "8" : "9"; // 02568

        assertThat(result).isEqualTo("12568");
    }
}
