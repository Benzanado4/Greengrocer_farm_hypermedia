package bio.meta;
//@javax.annotation.Generated(value = { "slim3-gen", "@VERSION@" }, date = "2011-07-11 21:25:52")
public final class ProdottiMeta extends org.slim3.datastore.ModelMeta<bio.model.Prodotti> {
    public final org.slim3.datastore.StringAttributeMeta<bio.model.Prodotti> Descrizione = new org.slim3.datastore.StringAttributeMeta<bio.model.Prodotti>(this, "Descrizione", "Descrizione");
    public final org.slim3.datastore.StringCollectionAttributeMeta<bio.model.Prodotti, java.util.ArrayList<java.lang.String>> Need = new org.slim3.datastore.StringCollectionAttributeMeta<bio.model.Prodotti, java.util.ArrayList<java.lang.String>>(this, "Need", "Need", java.util.ArrayList.class);
    public final org.slim3.datastore.StringAttributeMeta<bio.model.Prodotti> Nome = new org.slim3.datastore.StringAttributeMeta<bio.model.Prodotti>(this, "Nome", "Nome");
    public final org.slim3.datastore.StringCollectionAttributeMeta<bio.model.Prodotti, java.util.ArrayList<java.lang.String>> Produttori = new org.slim3.datastore.StringCollectionAttributeMeta<bio.model.Prodotti, java.util.ArrayList<java.lang.String>>(this, "Produttori", "Produttori", java.util.ArrayList.class);
    public final org.slim3.datastore.StringCollectionAttributeMeta<bio.model.Prodotti, java.util.ArrayList<java.lang.String>> genre = new org.slim3.datastore.StringCollectionAttributeMeta<bio.model.Prodotti, java.util.ArrayList<java.lang.String>>(this, "genre", "genre", java.util.ArrayList.class);
    public final org.slim3.datastore.CoreAttributeMeta<bio.model.Prodotti, com.google.appengine.api.datastore.Key> key = new org.slim3.datastore.CoreAttributeMeta<bio.model.Prodotti, com.google.appengine.api.datastore.Key>(this, "__key__", "key", com.google.appengine.api.datastore.Key.class);
    public final org.slim3.datastore.CoreAttributeMeta<bio.model.Prodotti, java.lang.Long> version = new org.slim3.datastore.CoreAttributeMeta<bio.model.Prodotti, java.lang.Long>(this, "version", "version", java.lang.Long.class);

    private static final ProdottiMeta slim3_singleton = new ProdottiMeta();

    /**
     * @return the singleton
     */
    public static ProdottiMeta get() {
       return slim3_singleton;
    }

    public ProdottiMeta() {
        super("Prodotti", bio.model.Prodotti.class);
    }

    @Override
    public bio.model.Prodotti entityToModel(com.google.appengine.api.datastore.Entity entity) {
        bio.model.Prodotti model = new bio.model.Prodotti();
        model.setDescrizione((java.lang.String) entity.getProperty("Descrizione"));
        model.setNeed(toList(java.lang.String.class, entity.getProperty("Need")));
        model.setNome((java.lang.String) entity.getProperty("Nome"));
        model.setProduttori(toList(java.lang.String.class, entity.getProperty("Produttori")));
        model.setGenre(toList(java.lang.String.class, entity.getProperty("genre")));
        model.setKey(entity.getKey());
        model.setVersion((java.lang.Long) entity.getProperty("version"));
        return model;
    }

    @Override
    public com.google.appengine.api.datastore.Entity modelToEntity(java.lang.Object model) {
        bio.model.Prodotti m = (bio.model.Prodotti) model;
        com.google.appengine.api.datastore.Entity entity = null;
        if (m.getKey() != null) {
            entity = new com.google.appengine.api.datastore.Entity(m.getKey());
        } else {
            entity = new com.google.appengine.api.datastore.Entity(kind);
        }
        entity.setProperty("Descrizione", m.getDescrizione());
        entity.setProperty("Need", m.getNeed());
        entity.setProperty("Nome", m.getNome());
        entity.setProperty("Produttori", m.getProduttori());
        entity.setProperty("genre", m.getGenre());
        entity.setProperty("version", m.getVersion());
        entity.setProperty("slim3.schemaVersion", 1);
        return entity;
    }

    @Override
    protected com.google.appengine.api.datastore.Key getKey(Object model) {
        bio.model.Prodotti m = (bio.model.Prodotti) model;
        return m.getKey();
    }

    @Override
    protected void setKey(Object model, com.google.appengine.api.datastore.Key key) {
        validateKey(key);
        bio.model.Prodotti m = (bio.model.Prodotti) model;
        m.setKey(key);
    }

    @Override
    protected long getVersion(Object model) {
        bio.model.Prodotti m = (bio.model.Prodotti) model;
        return m.getVersion() != null ? m.getVersion().longValue() : 0L;
    }

    @Override
    protected void assignKeyToModelRefIfNecessary(com.google.appengine.api.datastore.AsyncDatastoreService ds, java.lang.Object model) {
    }

    @Override
    protected void incrementVersion(Object model) {
        bio.model.Prodotti m = (bio.model.Prodotti) model;
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
        bio.model.Prodotti m = (bio.model.Prodotti) model;
        writer.beginObject();
        org.slim3.datastore.json.Default encoder0 = new org.slim3.datastore.json.Default();
        if(m.getDescrizione() != null){
            writer.setNextPropertyName("Descrizione");
            encoder0.encode(writer, m.getDescrizione());
        }
        if(m.getNeed() != null){
            writer.setNextPropertyName("Need");
            writer.beginArray();
            for(java.lang.String v : m.getNeed()){
                encoder0.encode(writer, v);
            }
            writer.endArray();
        }
        if(m.getNome() != null){
            writer.setNextPropertyName("Nome");
            encoder0.encode(writer, m.getNome());
        }
        if(m.getProduttori() != null){
            writer.setNextPropertyName("Produttori");
            writer.beginArray();
            for(java.lang.String v : m.getProduttori()){
                encoder0.encode(writer, v);
            }
            writer.endArray();
        }
        if(m.getGenre() != null){
            writer.setNextPropertyName("genre");
            writer.beginArray();
            for(java.lang.String v : m.getGenre()){
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
    protected bio.model.Prodotti jsonToModel(org.slim3.datastore.json.JsonRootReader rootReader, int maxDepth, int currentDepth) {
        bio.model.Prodotti m = new bio.model.Prodotti();
        org.slim3.datastore.json.JsonReader reader = null;
        org.slim3.datastore.json.Default decoder0 = new org.slim3.datastore.json.Default();
        reader = rootReader.newObjectReader("Descrizione");
        m.setDescrizione(decoder0.decode(reader, m.getDescrizione()));
        reader = rootReader.newObjectReader("Need");
        {
            java.util.ArrayList<java.lang.String> elements = new java.util.ArrayList<java.lang.String>();
            org.slim3.datastore.json.JsonArrayReader r = rootReader.newArrayReader("Need");
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
                m.setNeed(elements);
            }
        }
        reader = rootReader.newObjectReader("Nome");
        m.setNome(decoder0.decode(reader, m.getNome()));
        reader = rootReader.newObjectReader("Produttori");
        {
            java.util.ArrayList<java.lang.String> elements = new java.util.ArrayList<java.lang.String>();
            org.slim3.datastore.json.JsonArrayReader r = rootReader.newArrayReader("Produttori");
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
                m.setProduttori(elements);
            }
        }
        reader = rootReader.newObjectReader("genre");
        {
            java.util.ArrayList<java.lang.String> elements = new java.util.ArrayList<java.lang.String>();
            org.slim3.datastore.json.JsonArrayReader r = rootReader.newArrayReader("genre");
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
                m.setGenre(elements);
            }
        }
        reader = rootReader.newObjectReader("key");
        m.setKey(decoder0.decode(reader, m.getKey()));
        reader = rootReader.newObjectReader("version");
        m.setVersion(decoder0.decode(reader, m.getVersion()));
        return m;
    }
}