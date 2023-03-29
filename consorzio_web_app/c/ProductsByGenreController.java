package bio.controller.bio;

import java.util.ArrayList;
import java.util.List;
import org.slim3.controller.Controller;
import org.slim3.controller.Navigation;
import bio.model.Prodotti;
import bio.service.ProdottiService;

public class ProductsByGenreController extends Controller {
    private ProdottiService pservice = new ProdottiService();
    private List<Prodotti> prodotti;
    private ArrayList<Prodotti> p = new ArrayList<Prodotti>();
    
    @Override
    public Navigation run() throws Exception {
        String stagioni = request.getQueryString();
        prodotti = pservice.getProdottiList();
        
        for(int i =0 ;i<prodotti.size();i++)
            for(int j=0;j<prodotti.get(i).getGenre().size();j++)
                if ((prodotti.get(i).getGenre().get(j)).equals(stagioni))
                p.add(prodotti.get(i));
        
        requestScope("Prodotti", p);
        requestScope("Stagione", stagioni);
        return forward("ProductsByGenre.jsp");
    }
}
