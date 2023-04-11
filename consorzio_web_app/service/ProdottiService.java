package bio.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.slim3.datastore.Datastore;
import org.slim3.util.BeanUtil;
import bio.meta.ProdottiMeta;
import bio.model.Prodotti;
import com.google.appengine.api.datastore.Transaction;
import com.sun.org.apache.bcel.internal.generic.NEW;

public class ProdottiService {
    private ProdottiMeta p = new ProdottiMeta();
    private bio.service.ProduttoreService produttoreService = new ProduttoreService();
    public void NewProdotti(String nome, String descrizione, ArrayList<String> produttori, ArrayList<String> genre, ArrayList<String> need) {
        bio.model.Produttore produttore = null;
        bio.model.Prodotti p = new bio.model.Prodotti();
        p.setNome(nome);
        p.setDescrizione(descrizione); 
        p.setProduttori(produttori);
        p.setGenre(genre);
        p.setNeed(need);
        Datastore.put(p);

        for(int i=0;i<produttori.size();i++){
            produttore = produttoreService.getProduttore(produttori.get(i));
            produttore.getProdotti().add(Datastore.keyToString(p.getKey()));
            Datastore.put(produttore);}
    }
    public List<bio.model.Prodotti> getProdottiList() {
        return Datastore.query(p).sort(p.Nome.desc).asList();
    }
    public Prodotti getProdotti(String key){
        Prodotti prodotti;
        prodotti = p.entityToModel(Datastore.get(Datastore.stringToKey(key)));
        return prodotti;
    }
}
