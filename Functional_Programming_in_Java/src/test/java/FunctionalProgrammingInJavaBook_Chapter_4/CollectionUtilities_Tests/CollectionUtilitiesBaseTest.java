package FunctionalProgrammingInJavaBook_Chapter_4.CollectionUtilities_Tests;

import Entities.Cup;

import java.util.List;

import static FunctionalProgrammingInJavaBook_Chapter_4.CollectionUtilities_Tests.CollectionUtilities.list;

public class CollectionUtilitiesBaseTest {
    Cup cup1 = Cup.builder()
            .field("Snake").build();
    Cup cup2 = Cup.builder()
            .field("Tiger").build();
    Cup cup3 = Cup.builder()
            .field("Lion").build();
    Cup cup4 = Cup.builder()
            .field("Giraffe").build();
    Cup cup5 = Cup.builder()
            .field("Giraffe").build();List<Cup> cupList = list(cup1, cup2);
}
