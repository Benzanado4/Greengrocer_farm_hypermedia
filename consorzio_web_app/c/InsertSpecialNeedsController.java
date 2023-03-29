package bio.controller.bio;

import org.slim3.controller.Controller;
import org.slim3.controller.Navigation;

public class InsertSpecialNeedsController extends Controller {
    @Override
    public Navigation run() throws Exception {
        return forward("InsertSpecialNeeds.jsp");
    }
}
