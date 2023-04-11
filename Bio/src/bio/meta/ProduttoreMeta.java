package bio.meta;

//@javax.annotation.Generated(value = { "slim3-gen", "@VERSION@" }, date = "2011-07-11 21:25:52"
public final class ProduttoreMeta extends org.slim3.datastore.ModelMeta<bio.model.Produttore> {
    public final org.slim3.datastore.StringAttributeMeta<bio.model.Produttore> Descrizione = new org.slim3.datastore.StringAttributeMeta<bio.model.Produttore>(this, "Descrizione", "Descrizione");
    public final org.slim3.datastore.StringAttributeMeta<bio.model.Produttore> Nome = new org.slim3.datastore.StringAttributeMeta<bio.model.Produttore>(this, "Nome", "Nome");
    public final org.slim3.datastore.StringCollectionAttributeMeta<bio.model.Produttore, java.util.ArrayList<java.lang.String>> Prodotti = new org.slim3.datastore.StringCollectionAttributeMeta<bio.model.Produttore, java.util.ArrayList<java.lang.String>>(this, "Prodotti", "Prodotti", java.util.ArrayList.class);
    public final org.slim3.datastore.CoreAttributeMeta<bio.model.Produttore, com.google.appengine.api.datastore.Key> key = new org.slim3.datastore.CoreAttributeMeta<bio.model.Produttore, com.google.appengine.api.datastore.Key>(this, "__key__", "key", com.google.appengine.api.datastore.Key.class);
    public final org.slim3.datastore.CoreAttributeMeta<bio.model.Produttore, java.lang.Long> version = new org.slim3.datastore.CoreAttributeMeta<bio.model.Produttore, java.lang.Long>(this, "version", "version", java.lang.Long.class);

    private static final ProduttoreMeta slim3_singleton = new ProduttoreMeta();

    /**
     * @return the singleton
     */
    public static ProduttoreMeta get() {
       return slim3_singleton;
    }

    public ProduttoreMeta() {
        super("Produttore", bio.model.Produttore.class);
    }

    @Override
    public bio.model.Produttore entityToModel(com.google.appengine.api.datastore.Entity entity) {
        bio.model.Produttore model = new bio.model.Produttore();
        model.setDescrizione((java.lang.String) entity.getProperty("Descrizione"));
        model.setNome((java.lang.String) entity.getProperty("Nome"));
        model.setProdotti(toList(java.lang.String.class, entity.getProperty("Prodotti")));
        model.setKey(entity.getKey());
        model.setVersion((java.lang.Long) entity.getProperty("version"));
        return model;
    }

    @Override
    public com.google.appengine.api.datastore.Entity modelToEntity(java.lang.Object model) {
        bio.model.Produttore m = (bio.model.Produttore) model;
        com.google.appengine.api.datastore.Entity entity = null;
        if (m.getKey() != null) {
            entity = new com.google.appengine.api.datastore.Entity(m.getKey());
        } else {
            entity = new com.google.appengine.api.datastore.Entity(kind);
        }
        entity.setProperty("Descrizione", m.getDescrizione());
        entity.setProperty("Nome", m.getNome());
        entity.setProperty("Prodotti", m.getProdotti());
        entity.setProperty("version", m.getVersion());
        entity.setProperty("slim3.schemaVersion", 1);
        return entity;
    }

    @Override
    protected com.google.appengine.api.datastore.Key getKey(Object model) {
        bio.model.Produttore m = (bio.model.Produttore) model;
        return m.getKey();
    }

    @Override
    protected void setKey(Object model, com.google.appengine.api.datastore.Key key) {
        validateKey(key);
        bio.model.Produttore m = (bio.model.Produttore) model;
        m.setKey(key);
    }

    @Override
    protected long getVersion(Object model) {
        bio.model.Produttore m = (bio.model.Produttore) model;
        return m.getVersion() != null ? m.getVersion().longValue() : 0L;
    }

    @Override
    protected void assignKeyToModelRefIfNecessary(com.google.appengine.api.datastore.AsyncDatastoreService ds, java.lang.Object model) {
    }

    @Override
    protected void incrementVersion(Object model) {
        bio.model.Produttore m = (bio.model.Produttore) model;
        long version = m.getVersion() != null ? m.getVersion().longValue() : 0L;
        m.setVersion(Long.valueOf(version + 1L));
    }

    @Override
    protected void prePut(Object model) {
    }

    @Override
    public String getSchemaVersionName() {
        return "slim3.schemaVersion";
    }

    @Override
    public String getClassHierarchyListName() {
        return "slim3.classHierarchyList";
    }

    @Override
    protected boolean isCipherProperty(String propertyName) {
        return false;
    }

    @Override
    protected void modelToJson(org.slim3.datastore.json.JsonWriter writer, java.lang.Object model, int maxDepth, int currentDepth) {
        bio.model.Produttore m = (bio.model.Produttore) model;
        writer.beginObject();
        org.slim3.datastore.json.Default encoder0 = new org.slim3.datastore.json.Default();
        if(m.getDescrizione() != null){
            writer.setNextPropertyName("Descrizione");
            encoder0.encode(writer, m.getDescrizione());
        }
        if(m.getNome() != null){
            writer.setNextPropertyName("Nome");
            encoder0.encode(writer, m.getNome());
        }
        if(m.getProdotti() != null){
            writer.setNextPropertyName("Prodotti");
            writer.beginArray();
            for(java.lang.String v : m.getProdotti()){
                encoder0.encode(writer, v);
            }
            writer.endArray();
        }
        if(m.getKey() != null){
            writer.setNextPropertyName("key");
            encoder0.encode(writer, m.getKey());
        }
        if(m.getVersion() != null){
            writer.setNextPropertyName("version");
            encoder0.encode(writer, m.getVersion());
        }
        writer.endObject();
    }

    @Override
    protected bio.model.Produttore jsonToModel(org.slim3.datastore.json.JsonRootReader rootReader, int maxDepth, int currentDepth) {
        bio.model.Produttore m = new bio.model.Produttore();
        org.slim3.datastore.json.JsonReader reader = null;
        org.slim3.datastore.json.Default decoder0 = new org.slim3.datastore.json.Default();
        reader = rootReader.newObjectReader("Descrizione");
        m.setDescrizione(decoder0.decode(reader, m.getDescrizione()));
        reader = rootReader.newObjectReader("Nome");
        m.setNome(decoder0.decode(reader, m.getNome()));
        reader = rootReader.newObjectReader("Prodotti");
        {
            java.util.ArrayList<java.lang.String> elements = new java.util.ArrayList<java.lang.String>();
            org.slim3.datastore.json.JsonArrayReader r = rootReader.newArrayReader("Prodotti");
            if(r != null){
                reader = r;
                int n = r.length();
                for(int i = 0; i < n; i++){
                    r.setIndex(i);
                    java.lang.String v = decoder0.decode(reader, (java.lang.String)null);
                    if(v != null){
                        elements.add(v);
                    }
                }
                m.setProdotti(elements);
            }
        }
        reader = rootReader.newObjectReader("key");
        m.setKey(decoder0.decode(reader, m.getKey()));
        reader = rootReader.newObjectReader("version");
        m.setVersion(decoder0.decode(reader, m.getVersion()));
        return m;
    }
}