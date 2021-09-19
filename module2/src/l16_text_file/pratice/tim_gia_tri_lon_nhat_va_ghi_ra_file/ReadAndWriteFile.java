package l16_text_file.pratice.tim_gia_tri_lon_nhat_va_ghi_ra_file;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWriteFile {
    public List<Double> readFile(String filePath) throws IOException{
        List<Double> numbers = new ArrayList<>();
        File file = new File(filePath);
        if (!file.exists()){
            throw new FileNotFoundException();
        }

        BufferedReader br = new BufferedReader(new FileReader(file));
        String line = "";
        while ((line = br.readLine()) != null){
            System.out.println(line);
            numbers.add(Double.parseDouble(line));
        }
        br.close();

        return numbers;
    }

    public void writeFile(String filePath, List<Double> numbers) throws IOException{
        FileWriter fileWriter = new FileWriter(filePath, false);

        BufferedWriter bw = new BufferedWriter(fileWriter);

        bw.write("The max number is: " + findMax(numbers));

        bw.close();
    }

    public static double findMax(List<Double> numbers){
        double max =numbers.get(0);
        for (int i = 1; i < numbers.size(); i++) {
            if (max < numbers.get(i)){
                max = numbers.get(i);
            }
        }
        return max;
    }

    public static void main(String[] args) throws IOException {
        ReadAndWriteFile readAndWriteFile = new ReadAndWriteFile();
        List<Double> numbers = readAndWriteFile.readFile("D:\\nhat_coder\\CodeGym\\GIT_HUB\\module2\\src\\l16_text_file\\pratice\\tim_gia_tri_lon_nhat_va_ghi_ra_file\\numbers.txt");
        readAndWriteFile.writeFile("D:\\nhat_coder\\CodeGym\\GIT_HUB\\module2\\src\\l16_text_file\\pratice\\tim_gia_tri_lon_nhat_va_ghi_ra_file\\result.txt", numbers);
    }
}
