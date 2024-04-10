package Composite_Pattern;

public class FileSystem {
    Component allFiles;

    public FileSystem(Component allFiles) {
        this.allFiles = allFiles;
    }

    public void displayFiles() {
        allFiles.print();
    }
    
}
