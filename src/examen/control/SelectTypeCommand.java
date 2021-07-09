package examen.control;

import examen.view.CatalogueLoader;
import examen.view.CatalogueDisplay;
import java.util.List;
import java.util.Scanner;

public class SelectTypeCommand implements Command {
    private final CatalogueLoader loader;
    private final CatalogueDisplay display;
    private final List<String> catalogue;


    public SelectTypeCommand(List<String> catalogue,CatalogueDisplay display,CatalogueLoader loader) {
        this.display = display;
        this.catalogue = catalogue;
        this.loader = loader;
    }
    
    @Override
    public void execute() {
        System.out.println("Select type of Patrimonial Element: ");
        Scanner sc = new Scanner(System.in);
        String type = sc.nextLine();
        for (String c : catalogue) {
            if(c.equals(type)){
                display.display(loader.load(type));
                }
            }
        }
        
       
        
    
    
    
    
}
