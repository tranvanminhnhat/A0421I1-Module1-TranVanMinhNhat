package l16_text_file.exercise.copy_file;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        CopyFile copyFile = new CopyFile();
        String fileSource = "D:\\nhat_coder\\CodeGym\\GIT_HUB\\module2\\src\\l16_text_file\\exercise\\copy_file\\file1";
        String fileDes = "D:\\nhat_coder\\CodeGym\\GIT_HUB\\module2\\src\\l16_text_file\\exercise\\copy_file\\file2";
        copyFile.copyFile(fileSource, fileDes);
    }
}
