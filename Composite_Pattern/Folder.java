package Composite_Pattern;
import java.util.LinkedList;
import java.util.List;

public class Folder extends Component {
    List<Component> folderComponents = new LinkedList<Component>();
    String name;

    public Folder(String name) {
        this.name = name;
    }

    @Override
    public void add(Component component) {
        folderComponents.add(component);    // Don't confuse this add() method with Folder's add method. Here were just adding a component to an array list. It feels weird, I know.
    }

    @Override
    public Component getChild(int i) {
        return folderComponents.get(i);    
    }

    @Override
    public int getFileSize() {
        int folder_size = 0;
        for (Component component : folderComponents) {
            folder_size += component.getFileSize();     // Recursive voodoo magic
        }
        return folder_size;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void remove(Component component) {
        folderComponents.remove(component);
    } 

    @Override
    public void print() {
        System.out.printf("%S: %sMB %n=========================%n", name, this.getFileSize()); // I could add code in the future to count the characters in name and change the width of "===" to match
        for (Component component : folderComponents) { 
            component.print();                                                                        // I would like the subfolders to be tabbed inward as is the format for most file systems, but I can't figure it out yet.
        }
    }
    
}
