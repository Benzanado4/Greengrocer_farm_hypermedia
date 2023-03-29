package bio.controller;

import org.slim3.tester.ControllerTestCase;
import org.junit.Test;
import bio.controller.bio.PaymentController;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

public class PaymentControllerTest extends ControllerTestCase {
    @Test
    public void run() throws Exception {
        tester.start("/Payment");
        PaymentController controller = tester.getController();
        assertThat(controller, is(notNullValue()));
        assertThat(tester.isRedirect(), is(false));
        assertThat(tester.getDestinationPath(), is("/Payment.jsp"));
    }
}
