package bio.controller.bio;

import java.util.List;
import org.slim3.controller.Controller;
import org.slim3.controller.Navigation;
import bio.model.Need;
import bio.service.SpecialNeedsService;

public class AllSpecialNeedsController extends Controller {
    private SpecialNeedsService serviceNeed = new SpecialNeedsService();
    
    @Override
    public Navigation run() throws Exception {    
        String nome = request.getParameter("Nome");
        
        if(nome!=null)
        serviceNeed.newNeed(nome);
        
        List<Need> CategorieList =
            serviceNeed.getNeedList();
        requestScope("CategorieList", CategorieList);
        
        return forward("AllSpecialNeeds.jsp");
    }
}
