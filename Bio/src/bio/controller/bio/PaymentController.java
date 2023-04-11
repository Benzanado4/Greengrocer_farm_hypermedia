package bio.controller.bio;

import org.slim3.controller.Controller;
import org.slim3.controller.Navigation;

public class PaymentController extends Controller {
    @Override
    public Navigation run() throws Exception {
        return forward("Payment.jsp");
    }
}
