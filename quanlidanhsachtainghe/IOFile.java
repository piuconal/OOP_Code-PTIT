package quanlidanhsachtainghe;
//viet vao
import java.io.ObjectOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

public class IOFile {
    public static <T> void
        writeFile(String file, ArrayList<T> arr) 
        {
            try 
            {
                ObjectOutputStream o = new ObjectOutputStream 
                (
                    new FileOutputStream(file) 
                );
                o.writeObject(arr);
                o.close() ;
            } 
            catch ( IOException e) 
            {
                System.out.println ( e ) ;
            }
        }
}