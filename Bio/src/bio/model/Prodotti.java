package bio.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.swing.text.StyledEditorKit.BoldAction;
import com.google.appengine.api.datastore.Key;
import com.google.appengine.repackaged.com.google.common.base.Flag.Date;
import com.google.appengine.repackaged.org.joda.time.Minutes;
import org.slim3.datastore.Attribute;
import org.slim3.datastore.Model;

@Model(schemaVersion = 1)
public class Prodotti implements Serializable {
    private static final long serialVersionUID = 1L;
    @Attribute(primaryKey = true)
    private Key key;
    @Attribute(version = true)
    private Long version;
    private String Nome;
    private String Descrizione;
    private ArrayList<String> Produttori;
    private ArrayList<String> genre;
    private ArrayList<String> Need;

    public ArrayList<String> getProduttori() {
        return Produttori;
    }

    public void setProduttori(ArrayList<String> produttori) {
        Produttori = produttori;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public String getDescrizione() {
        return Descrizione;
    }

    public void setDescrizione(String descrizione) {
        Descrizione = descrizione;
    }

    /**
     * Returns the key.
     *
     * @return the key
     */
    public Key getKey() {
        return key;
    }

    /**
     * Sets the key.
     *
     * @param key
     *            the key
     */
    public void setKey(Key key) {
        this.key = key;
    }

    /**
     * Returns the version.
     *
     * @return the version
     */
    public Long getVersion() {
        return version;
    }

    /**
     * Sets the version.
     *
     * @param version
     *            the version
     */
    public void setVersion(Long version) {
        this.version = version;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((key == null) ? 0 : key.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        Prodotti other = (Prodotti) obj;
        if (key == null) {
            if (other.key != null) {
                return false;
            }
        } else if (!key.equals(other.key)) {
            return false;
        }
        return true;
    }

    public void setNeed(ArrayList<String> need) {
        Need = need;
    }

    public ArrayList<String> getNeed() {
        return Need;
    }

    public void setGenre(ArrayList<String> genre) {
        genre = genre;
    }

    public ArrayList<String> getGenre() {
        return genre;
    }
}
