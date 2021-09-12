package l16_text_file.pratice.tinh_tong_cac_so_trong_file_text;

import java.io.*;


public class ReadFileExample {
    public void readFileText(String path){
        try {
            File file = new File(path);
            if (!file.exists()){
                throw new FileNotFoundException();
            }

            BufferedReader br = new BufferedReader(new FileReader(file));
            String line = "";
            int sum = 0;
            while ((line = br.readLine()) != null){
                System.out.println(line);
                sum += Integer.parseInt(line);
            }
            br.close();

            System.out.println("Total: " + sum);
        }catch (Exception e){
            System.out.println("file is not exists or error content");
        }
    }

    public static void main(String[] args) {
        ReadFileExample readFileExample = new ReadFileExample();
        readFileExample.readFileText("D:\\nhat_coder\\CodeGym\\GIT_HUB\\module2\\src\\l16_text_file\\pratice\\tinh_tong_cac_so_trong_file_text\\number.txt");
    }
}
