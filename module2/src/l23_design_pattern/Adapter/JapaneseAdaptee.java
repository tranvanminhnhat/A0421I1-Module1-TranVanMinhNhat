package l23_design_pattern.Adapter;

public class JapaneseAdaptee {
    public void receive(String words) {
        System.out.println("Retrieving words from Adapter ...");
        System.out.println(words);
    }
}
