package examen.app;

import examen.model.Catalogue;
import examen.model.ElemPatrimonial;
import java.util.ArrayList;
import java.util.List;
import examen.view.CatalogueLoader;


public class MockCatalogLoader implements CatalogueLoader {
    
    
    private final List<ElemPatrimonial> churchs;
    private final List<ElemPatrimonial> buildings;
    private final List<ElemPatrimonial> bridges;
    public MockCatalogLoader() {
        ElemPatrimonial e1 = new ElemPatrimonial("North", "Church", "Felix", 1965, "any", 
                                "stones", "great", "church.jpg, church2.jpg", "Church");
        ElemPatrimonial e2 = new ElemPatrimonial("South", "Town hall", "Juan", 1930, "any", 
                "concrete", "normal", "townh.jpg","Building");
        
        ElemPatrimonial e3 = new ElemPatrimonial("East", "Museum", "Jose", 1945, "any", 
                "marble", "bad", "museum.jpg,m.jpg","Building");
        
        ElemPatrimonial e4 = new ElemPatrimonial("West", "El puente", "Manolo", 1999, "unknown", 
                "wood", "good", "puente.jpg", "Bridges");
        
        bridges = new ArrayList<>();
        churchs = new ArrayList<>();
        buildings = new ArrayList<>();
        churchs.add(e1);
        buildings.add(e2);
        buildings.add(e3);
        bridges.add(e4);
        
       
         
    }

    @Override
    public Catalogue load(String text) {
        if(text.equals("Churchs")){
            return new Catalogue("Churchs", churchs);
        } else if(text.equals("Buildings")){
            return new Catalogue("Buildings", buildings);
            
        } else if(text.equals("Bridges")){
            return new Catalogue("Bridges", bridges);
        }
        else{
            System.out.println("Catalogue not found!");
            System.exit(0);
        }
        return null;
        
    }
    @Override
    public List<String> load(List<String> lists) {
        return lists;
    }
    
    public List<String> getLists(){
        List<String> res = new ArrayList<>();
        res.add("Churchs");
        res.add("Buildings");
        res.add("Bridges");
        return res;
    }
    
    
}
