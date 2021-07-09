package examen.app;
import examen.model.Catalogue;
import examen.model.ElemPatrimonial;
import examen.view.CatalogueDisplay;
import java.util.List;

public class MockCatalogDisplay implements CatalogueDisplay  {

    @Override
    public void display(List<String> lists) {
        System.out.println(lists);
    }

    @Override
    public void display(Catalogue catalogue) {
        System.out.println("Catalogue: " + catalogue.getType());
        for (ElemPatrimonial e : catalogue.getList()) {
            System.out.println("-------------------------------------------");
            System.out.println("Position: " + e.getPosition());
            System.out.println("Name: " + e.getName());
            System.out.println("Author: " + e.getAuthor());
            System.out.println("Year: " + e.getYear());
            System.out.println("Manufacturing method: " + e.getMethod());
            System.out.println("Material: " + e.getMaterial());
            System.out.println("Status: " + e.getStatus());
            System.out.println("Pictures: " + e.getPictures());
            System.out.println("Type: " + e.getType());
            System.out.println("-------------------------------------------\n");
        }
    }

    @Override
    public void display(ElemPatrimonial e) {
        System.out.println("-------------------------------------------");
        System.out.println("Position: " + e.getPosition());
        System.out.println("Name: " + e.getName());
        System.out.println("Author: " + e.getAuthor());
        System.out.println("Year: " + e.getYear());
        System.out.println("Manufacturing method: " + e.getMethod());
        System.out.println("Material: " + e.getMaterial());
        System.out.println("Status: " + e.getStatus());
        System.out.println("Pictures: " + e.getPictures());
        System.out.println("Type: " + e.getType());
        System.out.println("-------------------------------------------\n");
    }
    
    
}
