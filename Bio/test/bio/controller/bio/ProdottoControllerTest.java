package bio.controller.bio;

import org.slim3.tester.ControllerTestCase;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

public class ProdottoControllerTest extends ControllerTestCase {
    @Test
    public void run() throws Exception {
        tester.start("/bio/Prodotto");
        ProdottoController controller = tester.getController();
        assertThat(controller, is(notNullValue()));
        assertThat(tester.isRedirect(), is(false));
        assertThat(tester.getDestinationPath(), is("/bio/Prodotto.jsp"));
    }
}
