package l17_binary_file_and_serialization.pratice.demo;

import java.io.IOException;
import java.io.InputStream;

public class ReadByteConsole {
    public static void main(String[] args) throws IOException {
        InputStream is = System.in;

        while (true){
            System.out.println("Enter a character: ");
            int ch = is.read();
            if (ch == 'q'){
                System.out.println("Finished!");
                break;
            }
            is.skip(2);
            System.out.println("Character is received : " + (char) ch);
        }
    }
}
