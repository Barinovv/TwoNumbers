import org.junit.Test;

import static org.junit.Assert.*;

public class MainTest {
    @Test
    public void main() throws Exception {

        Main main = new Main();
        assertEquals(8,main.resultati(4,2));

    }

}