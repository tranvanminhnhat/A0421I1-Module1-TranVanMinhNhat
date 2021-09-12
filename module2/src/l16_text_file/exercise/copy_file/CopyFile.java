package l16_text_file.exercise.copy_file;

import java.io.*;

public class CopyFile {
    public static void main(String[] args) throws IOException{
        InputStream inStream = null;
        OutputStream outStream = null;
        try {
            inStream = new FileInputStream(new File("D:\\nhat_coder\\CodeGym\\GIT_HUB\\module2\\src\\l16_text_file\\exercise\\copy_file\\file1"));
            outStream = new FileOutputStream(new File("D:\\nhat_coder\\CodeGym\\GIT_HUB\\module2\\src\\l16_text_file\\exercise\\copy_file\\file2"));
            int length;
            byte[] buffer = new byte[1024];
            while ((length = inStream.read(buffer)) > 0) {
                outStream.write(buffer, 0, length);
            }
            System.out.println("File is copied successful!");
        }catch (IOException e){
            e.printStackTrace();
        }finally {
            inStream.close();
            outStream.close();
        }
    }
}
