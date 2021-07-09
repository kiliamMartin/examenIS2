package examen.control;

import examen.control.Command;
import examen.view.CatalogueDisplay;
import examen.view.CatalogueLoader;
import java.util.List;


public class LoadPatElemCommand implements Command {
    private final CatalogueLoader loader;
    private final CatalogueDisplay display;
    private final List<String> catalogue;

    public LoadPatElemCommand(CatalogueLoader loader, CatalogueDisplay display, List<String> catalogue) {
        this.loader = loader;
        this.display = display;
        this.catalogue = catalogue;
    }

    

    @Override
    public void execute() {
        display.display(loader.load(catalogue));
    }
    
}
