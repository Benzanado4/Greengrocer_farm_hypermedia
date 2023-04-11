package bio.controller.bio;

import java.util.ArrayList;
import java.util.List;
import org.slim3.controller.Controller;
import org.slim3.controller.Navigation;
import bio.model.Prodotti;
import com.google.appengine.api.datastore.Key;

public class TuttiprodottiController extends Controller {
    private bio.service.ProdottiService serviceProdotti =
        new bio.service.ProdottiService();

    @Override
    public Navigation run() throws Exception {
        String nome = request.getParameter("Nome");
        String descrizione = request.getParameter("Descrizione");
        ArrayList<String> key = new ArrayList<String>();
        ArrayList<String> stagioni = new ArrayList<String>();
        ArrayList<String> categorie = new ArrayList<String>();

        if (request.getParameterValues("options") != null) {
            String check[] = request.getParameterValues("options");
            for (int i = 0; i < check.length; i++)
                key.add(check[i]);
            String[] checkStagioni = request.getParameterValues("stagioni");
            for (int i = 0; i < checkStagioni.length; i++)
                stagioni.add(checkStagioni[i]);
            String[] checkCategorie = request.getParameterValues("categorie");
            for (int i = 0; i < checkCategorie.length; i++)
                categorie.add(checkCategorie[i]);

            serviceProdotti.NewProdotti(
                nome,
                descrizione,
                key,
                stagioni,
                categorie);
        }

        List<Prodotti> ProdottiList =
            serviceProdotti.getProdottiList();
        requestScope("ProdottiList", ProdottiList);

        return forward("tuttiprodotti.jsp");
    }
}
