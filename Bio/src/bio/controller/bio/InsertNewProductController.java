package bio.controller.bio;

import java.util.List;
import org.slim3.controller.Controller;
import org.slim3.controller.Navigation;
import bio.model.Need;
import bio.service.SpecialNeedsService;

public class InsertNewProductController extends Controller {    
    private bio.service.ProduttoreService serviceProduttori = new bio.service.ProduttoreService();
    private SpecialNeedsService needService = new SpecialNeedsService();
    
    @Override
    public Navigation run() throws Exception {
        List<bio.model.Produttore> ProduttoreList = serviceProduttori.getProduttoreList();
        requestScope("ProduttoreList", ProduttoreList);
        List<Need> CategoriaList = needService.getNeedList();
        requestScope("CategorieList", CategoriaList);    
        return forward("InsertNewProduct.jsp");
    }
}
