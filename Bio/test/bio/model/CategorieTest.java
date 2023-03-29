package bio.model;

import org.slim3.tester.AppEngineTestCase;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

public class CategorieTest extends AppEngineTestCase {
    private Need model = new Need();
    @Test
    public void test() throws Exception {
        assertThat(model, is(notNullValue()));
    }
}
