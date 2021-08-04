import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class TableTest {

    @Test
    public void tabletesting() {
        Table table = new Table();
        List<String> Kristóf = table.iterate_table();
        List<String> expected = new ArrayList<>();
        expected.add("1");
        expected.add("2");
        expected.add("3");
        Assertions.assertEquals(expected, Kristóf);
    }


}
