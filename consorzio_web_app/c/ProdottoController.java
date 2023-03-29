package bio.controller.bio;

import java.util.ArrayList;
import java.util.List;
import org.slim3.controller.Controller;
import org.slim3.controller.Navigation;
import org.slim3.datastore.Datastore;
import bio.meta.ProdottiMeta;
import bio.meta.ProduttoreMeta;
import bio.model.Need;
import bio.model.Prodotti;
import bio.model.Produttore;
import bio.service.SpecialNeedsService;
import bio.service.ProdottiService;
import bio.service.ProduttoreService;

public class ProdottoController extends Controller {
    private Prodotti p = new Prodotti(); 
    private ProdottiMeta pmeta = new ProdottiMeta();
    private ProduttoreService produttoreService = new ProduttoreService();
    private SpecialNeedsService needService = new SpecialNeedsService();
    
    @Override
    public Navigation run() throws Exception {
        String key = request.getQueryString();
        ArrayList<Produttore> produttori = new ArrayList<Produttore>();
        ArrayList<Need> need = new ArrayList<Need>();
        ArrayList<String> genre = new ArrayList<String>();
        
        p = pmeta.entityToModel(Datastore.get(Datastore.stringToKey((key))));
    
        for (int i =0;i<p.getProduttori().size();i++)
               produttori.add(produttoreService.getProduttore(p.getProduttori().get(i)));    
        for (int i =0;i<p.getNeed().size();i++)
            need.add(needService.getNeed(p.getNeed().get(i)));
        
        genre = p.getGenre();
        
        requestScope("Prodotto", p);
        requestScope("Produttori", produttori);
        requestScope("Categorie", need);
        requestScope("Stagioni", genre);
        
        return forward("Prodotto.jsp");
    }
}
