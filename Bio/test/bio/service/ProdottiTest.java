package bio.service;

import org.slim3.tester.AppEngineTestCase;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

public class ProdottiTest extends AppEngineTestCase {
    private ProdottiService service = new ProdottiService();
    @Test
    public void test() throws Exception {
        assertThat(service, is(notNullValue()));
    }
}
