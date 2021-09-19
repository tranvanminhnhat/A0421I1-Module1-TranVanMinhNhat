package l17_binary_file_and_serialization.optional.exercise.copy_file_nhi_phan;

import java.io.*;

public class CopyFile {
    public void copyFile(File sourcePath, File desPath) throws IOException {
        InputStream is = null;
        OutputStream os = null;
        try {
            is = new FileInputStream(sourcePath);
            os = new FileOutputStream(desPath);
            byte[] buffer = new byte[1024];
            int length;
            while ((length = is.read(buffer)) > 0){
                os.write(buffer,0,length);
            }
        }finally {
            is.close();
            os.close();
        }
    }
}
