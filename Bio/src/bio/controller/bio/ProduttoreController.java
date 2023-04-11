package bio.controller.bio;

import java.util.ArrayList;
import org.slim3.controller.Controller;
import org.slim3.controller.Navigation;
import org.slim3.datastore.Datastore;
import bio.meta.ProdottiMeta;
import bio.meta.ProduttoreMeta;
import bio.model.Prodotti;
import bio.model.Produttore;
import bio.service.ProdottiService;
import bio.service.ProduttoreService;

public class ProduttoreController extends Controller {
    private Produttore p = new Produttore(); 
    private ProduttoreMeta pmeta = new ProduttoreMeta();
    private ProdottiService prodottiService = new ProdottiService();
    
    @Override
    public Navigation run() throws Exception {
        String key = request.getQueryString();
        ArrayList<Prodotti> prodotti = new ArrayList<Prodotti>();
        p = pmeta.entityToModel(Datastore.get(Datastore.stringToKey((key))));
        
        for (int i =0;i<p.getProdotti().size();i++)
            prodotti.add(prodottiService.getProdotti(p.getProdotti().get(i)));

        requestScope("Produttore", p);
        requestScope("Prodotti", prodotti);
        return forward("produttore.jsp");
    }
}
