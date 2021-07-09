package examen.app;

import examen.control.LoadPatElemCommand;
import examen.control.Command;
import examen.control.NullCommand;
import examen.control.SelectTypeCommand;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class Main {

    
    public static void main(String[] args) {
        new Main().execute();
    }
    
    private MockCatalogDisplay display;
    private MockCatalogLoader loader;
    private Map<String,Command> commands;

    private void execute() {
        display = new MockCatalogDisplay();
        loader = new MockCatalogLoader();
        Scanner sc = new Scanner(System.in);
        commands = commandsInit();
        while(true){
            System.out.println("[-l] --list availables Patrimonial Elements\n"
                    +          "[-s] --select patrimonial element \n"
                    +          "[-e] --exit");
            commands.getOrDefault(sc.next(), NullCommand.instance).execute();
        }
                
    }

    private Map<String, Command> commandsInit() {
        Map<String,Command> commands = new HashMap<>();
        commands.put("-l", new LoadPatElemCommand(loader, display, loader.getLists()));
        commands.put("-s", new SelectTypeCommand(loader.getLists(), display, loader));
        commands.put("-e", new Command() {
            @Override
            public void execute() {
                System.exit(0);
            }
        });
        
        return commands;
    }
    
    
}
