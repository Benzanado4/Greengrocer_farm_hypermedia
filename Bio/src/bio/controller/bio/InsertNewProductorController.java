package bio.controller.bio;

import org.slim3.controller.Controller;
import org.slim3.controller.Navigation;

public class InsertNewProductorController extends Controller {
    @Override
    public Navigation run() throws Exception {
        return forward("InsertNewProductor.jsp");
    }
}

