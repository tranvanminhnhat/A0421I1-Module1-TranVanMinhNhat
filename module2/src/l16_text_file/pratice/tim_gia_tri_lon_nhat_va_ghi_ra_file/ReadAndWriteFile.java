package l16_text_file.pratice.tim_gia_tri_lon_nhat_va_ghi_ra_file;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWriteFile {
    public List<Integer> readFile(String filePath){

        List<Integer> numbers = new ArrayList<>();

        try {
            File file = new File(filePath);

            if (!file.exists()){
                throw new FileNotFoundException();
            }

            BufferedReader br = new BufferedReader(new FileReader(file));
            String line = "";

            while ((line = br.readLine()) != null){
                numbers.add(Integer.parseInt(line));
            }

            br.close();
        }catch (Exception e){
            System.err.println("File is not exists or error content");
        }

        return numbers;
    }

    public void writeFile(String filePath, int max){
        try {
            FileWriter writer = new FileWriter(filePath, false);
            BufferedWriter bufferedWriter = new BufferedWriter(writer);
            bufferedWriter.write("The biggest value is: " + max);
            bufferedWriter.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    public static int findMax(List<Integer> numbers){
        int max = numbers.get(0);
        for (int i = 0; i < numbers.size(); i++) {
            if(max < numbers.get(i)){
                max = numbers.get(i);
            }
        }
        return max;
    }

    public static void main(String[] args) {
        ReadAndWriteFile readAndWriteFile = new ReadAndWriteFile();
        List<Integer> numbers = readAndWriteFile.readFile("D:\\nhat_coder\\CodeGym\\GIT_HUB\\module2\\src\\l16_text_file\\pratice\\tim_gia_tri_lon_nhat_va_ghi_ra_file\\numbers.txt");
        int maxValue = findMax(numbers);
        readAndWriteFile.writeFile("D:\\nhat_coder\\CodeGym\\GIT_HUB\\module2\\src\\l16_text_file\\pratice\\tim_gia_tri_lon_nhat_va_ghi_ra_file\\result.txt", maxValue);
    }
}
