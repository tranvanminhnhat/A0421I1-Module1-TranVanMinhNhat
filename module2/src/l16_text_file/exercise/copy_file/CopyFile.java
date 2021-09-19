package l16_text_file.exercise.copy_file;

import java.io.*;

public class CopyFile {
    public void copyFile(String sourcePath, String desPath) throws IOException{
        File fileSource = new File(sourcePath);
        if (!fileSource.exists()){
            throw new FileNotFoundException();
        }

        File fileDes = new File(desPath);
        if (!fileDes.exists()){
            throw new FileNotFoundException();
        }

        BufferedReader br = new BufferedReader(new FileReader(fileSource));
        BufferedWriter bw = new BufferedWriter(new FileWriter(fileDes));
        String line = "";
        while ((line = br.readLine()) != null){
            bw.write(line);
        }
        br.close();
        bw.close();
    }
}
