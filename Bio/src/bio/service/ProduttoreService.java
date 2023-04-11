package bio.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import javax.xml.crypto.Data;
import org.slim3.datastore.Datastore;
import org.slim3.util.BeanUtil;
import bio.meta.ProduttoreMeta;
import bio.model.Produttore;
import com.google.appengine.api.datastore.Entity;
import com.google.appengine.api.datastore.Key;
import com.google.appengine.api.datastore.Transaction;

public class ProduttoreService {    
    private ProduttoreMeta p = new ProduttoreMeta();

    public void NewProduttore(String nome, String descrizione) {
        bio.model.Produttore p = new bio.model.Produttore();
        p.setNome(nome);
        p.setDescrizione(descrizione); 
        Datastore.put(p);
    }
    public List<bio.model.Produttore> getProduttoreList(){
        return Datastore.query(p).sort(p.Nome.desc).asList();
    }
    public bio.model.Produttore getProduttore(String key){
        bio.model.Produttore produttore;
        produttore = p.entityToModel(Datastore.get(Datastore.stringToKey(key)));
        return produttore;
        list =  Datastore.query(p).sort(p.Nome.desc).asList();
        for(int i= 0;i<list.size();i++)
            if(Datastore.keyToString(list.get(i).getKey()).equals(key)){
                return produttore = list.get(i); }
        return null;
    }
}
