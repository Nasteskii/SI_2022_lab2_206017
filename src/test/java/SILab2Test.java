import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SILab2Test {

    private List<String> createList(String... elems) {
        return new ArrayList<>(Arrays.asList(elems));
    }
    @Test
    void EveryStatement() {
        System.out.println("Every Statement Test");
        IllegalArgumentException exception;
        exception = assertThrows(IllegalArgumentException.class, () -> SILab2.function(createList()));
        assertTrue(exception.getMessage().contains("List length should be greater than 0"));
        exception = assertThrows(IllegalArgumentException.class, () -> SILab2.function(createList("0","#","0")));
        assertTrue(exception.getMessage().contains("List length should be a perfect square"));
        assertEquals(createList("2","#","2","#","4","#","2","#","#"),
                SILab2.function(createList("0","#","0","#","0","#","0","#","#")));
    }
    @Test
    void EveryBranch() {
        System.out.println("Every Branch Test");
        IllegalArgumentException exception;
        exception = assertThrows(IllegalArgumentException.class, () -> SILab2.function(createList()));
        assertTrue(exception.getMessage().contains("List length should be greater than 0"));
        exception = assertThrows(IllegalArgumentException.class, () -> SILab2.function(createList("0","#","0")));
        assertTrue(exception.getMessage().contains("List length should be a perfect square"));
        assertEquals(createList("2","#","2","#","4","#","2","#","#"),
                SILab2.function(createList("0","#","0","#","0","#","0","#","#")));
    }
}