import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class lab8_pr5 {
    public static void main(String[] args) 
    {
        FileReader fr = null;
        FileWriter fw = null;
        try
        {
            File f = new File("sdj.txt");
            f.createNewFile();
            fr = new FileReader(f);

            char[] text = new char[(int)f.length()];
            fr.read(text, 0, (int)f.length());      //copy the text from index 0 to length of fileReader to text array

            String te = String.valueOf(text);
            te = te.replace("his", "her");  //since string in immutable, we write te = te.re... if it was stringBuffer, changes wldve been made in place

            fw = new FileWriter(f);     //clears the file automatically
            fw.append(te);
            fw.close();     //once closed, the changes will be shown on file
            
            fr.read(text, 0, (int)f.length());
            System.out.println(text);
            

        }
        catch(IOException ex)
        {
            ex.printStackTrace();
        }
        finally
        {
            try
            {
                if(fr!=null)
                {
                    fr.close();
                    fr = null;
                }
            }
            catch(IOException ex)
            {
                ex.printStackTrace();
            }
        }
    }
}
