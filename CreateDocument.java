/**
 * Created by root on 1/14/2016.
 */

import java.io.File;
import java.io.FileOutputStream;

import org.apache.poi.xwpf.usermodel.XWPFDocument;


public class CreateDocument {
    public static void main()
    {
        // Blank Document
        XPWDocument document = new XPWFDocument();
        // Write the Document in the file Systen
        FileOutputStream out = new FileOutputStream(new File("createdocument.docx"));
        document.write(out);
        out.close();
        System.out.println("createdocument.docx was written successfully");
    }
}
