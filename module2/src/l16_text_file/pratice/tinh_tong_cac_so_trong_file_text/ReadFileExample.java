package l16_text_file.pratice.tinh_tong_cac_so_trong_file_text;

import java.io.*;


public class ReadFileExample {
    public void readFileText(String path) throws IOException {
        File file = new File(path);
        if (!file.exists()){
            throw new FileNotFoundException();
        }

        BufferedReader bufferedReader = new BufferedReader(new FileReader(file));

        String line = "";
        double sum = 0;
        while ((line = bufferedReader.readLine()) != null){
            System.out.println(line);
            sum += Double.parseDouble(line);
        }
        bufferedReader.close();
        System.out.println("Total: " + sum);
    }

    public static void main(String[] args) {
        ReadFileExample readFileExample = new ReadFileExample();
        try {
            readFileExample.readFileText("D:\\nhat_coder\\CodeGym\\GIT_HUB\\module2\\src\\l16_text_file\\pratice\\tinh_tong_cac_so_trong_file_text\\number.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
