package Composite_Pattern;

public class File extends Component{
    String name;
    String file_type;
    int file_size;

    public File(String name, String file_type, int file_size) {
        this.name = name;
        this.file_type = file_type;
        this.file_size = file_size;
    }

    @Override
    public int getFileSize() {
        return file_size;
    }

    @Override
    public String getFileType() {
        return file_type;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void print() {
        System.out.printf("%-20.20s.%-10.5s%sMB%n", name, file_type, file_size);
    } 

}
