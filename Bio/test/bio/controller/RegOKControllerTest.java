package bio.controller;

import org.slim3.tester.ControllerTestCase;
import org.junit.Test;
import bio.controller.bio.RegOKController;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

public class RegOKControllerTest extends ControllerTestCase {
    @Test
    public void run() throws Exception {
        tester.start("/RegOK");
        RegOKController controller = tester.getController();
        assertThat(controller, is(notNullValue()));
        assertThat(tester.isRedirect(), is(false));
        assertThat(tester.getDestinationPath(), is("/RegOK.jsp"));
    }
}
