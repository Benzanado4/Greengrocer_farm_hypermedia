package bio.controller.bio;

import java.util.List;
import org.slim3.controller.Controller;
import org.slim3.controller.Navigation;
import com.sun.org.apache.bcel.internal.generic.NEW;
import bio.service.ProduttoreService;

public class TuttiproduttoriController extends Controller {
    private bio.service.ProduttoreService service = new bio.service.ProduttoreService();
    @Override
    public Navigation run() throws Exception {
        String nome = request.getParameter("Nome");
        String descrizione = request.getParameter("Descrizione");
        
        if (nome!=null)
        service.NewProduttore(nome, descrizione);
        List<bio.model.Produttore> ProduttoreList = service.getProduttoreList();
        
        requestScope("ProduttoreList", ProduttoreList);
        return forward("tuttiproduttori.jsp");
    }
}
