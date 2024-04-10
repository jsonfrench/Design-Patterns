package Composite_Pattern;

public class TestDrive {
    public static void main(String[] args) {

        //Create Folders
        Component all_files = new Folder("File System"); // This will be the root folder that holds all other components.
        
        Component homework = new Folder("Homework");  
        Component SE_257 = new Folder("SE_257");  
        Component MA_225 = new Folder("MA_225"); 
        
        Component images = new Folder("Images");
        Component vscode = new Folder("VsCode");

        all_files.add(homework);
            homework.add(SE_257);
                SE_257.add(new File("Observer Pattern Research Paper", "docx", 12));
                SE_257.add(new File("Singleton Pattern Research Paper", "docx", 10));
            homework.add(MA_225);
                MA_225.add(new File("Line Integrals hw", "pdf", 4));
                MA_225.add(new File("Lagange Multipliers", "pptx", 30));
        all_files.add(images);
            images.add(new File("Picture_of_Jason_French", "jpg", 440));
            images.add(new File("Screenshot 4.10.24", "jpg", 1220));
            images.add(new File("Observer Pattern Diagram", "png", 800));
        all_files.add(vscode);
            vscode.add(new File("File", "java", 2));
            vscode.add(new File("Component", "java", 2));
            vscode.add(new File("TestDrive", "java", 1));

        FileSystem fileSystem = new FileSystem(all_files); 

        fileSystem.displayFiles();

    }        
          
}
