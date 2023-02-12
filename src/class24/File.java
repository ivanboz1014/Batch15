package class24;

public abstract class File {
    int size;
    File(int size){
        this.size=size;
    }

   abstract void open();

        void edit(){
            System.out.println("File edit");

        }
        void close(){
            System.out.println("File close");

        }

}
class JavaFile extends File{
    JavaFile(int size){
        super(size);
    }
    @Override
    void open() {
        System.out.println("Java File opened");
    }

    @Override
    void edit() {
        System.out.println("Editing file in Java");
    }
}
class WordFile extends File{
    WordFile(int size){
        super(size);
    }
    @Override
    void open() {
        System.out.println("Word file opened");
    }
}
class PDFFile extends File{
    PDFFile(int size){
        super(size);
    }
    @Override
    void open() {
        System.out.println("Opening pdf file");
    }
}
