package bio.service;

import java.util.List;
import org.slim3.datastore.Datastore;
import bio.meta.NeedMeta;
import bio.model.Need;

public class SpecialNeedsService {
    private NeedMeta c = new NeedMeta();
    public void newNeed(String nome){
        Need need = new Need();
        need.setNome(nome);
        Datastore.put(need);
    }
    public List<bio.model.Need> getNeedList() {
        return Datastore.query(c).sort(c.Nome.desc).asList();
    }
    public Need getNeed(String key){
        Need need;
        need = c.entityToModel(Datastore.get(Datastore.stringToKey(key)));
        return need;
    }
}
