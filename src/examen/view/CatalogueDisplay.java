package examen.view;

import examen.model.Catalogue;
import examen.model.ElemPatrimonial;
import java.util.List;


public interface CatalogueDisplay {
    public void display(List<String> lists);
    public void display(Catalogue catalogue);

    public void display(ElemPatrimonial e);
}
