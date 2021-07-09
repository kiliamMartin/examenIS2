package examen.view;

import examen.model.Catalogue;
import java.util.List;


public interface CatalogueLoader {
   public Catalogue load(String type);
   public List<String> load(List<String> lists);
    
}
