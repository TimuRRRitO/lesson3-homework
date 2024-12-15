import java.util.ArrayList;
import java.util.List;

public class two {
    public static void main (String[] args) {
    class Strings {
    protected List<String> StringsList;

    public Strings(List<String> stringsList) {
        StringsList = stringsList;
    }

    void SortStrings() {
        for (int i = 0; i < StringsList.size() - 1; i++) {
            for (int j = 0; i < StringsList.size() - i - 1; j++) {
                if (StringsList.get(i).length() > StringsList.get(i).length()) {
                    String t = StringsList.get(j+1);
                    StringsList.add(j+1, StringsList.get(j));
                    StringsList.add(j, t);
                }
            }
        }
    }

    void AddString(String NewString) {
        StringsList.add(NewString);
    }

    String MaxElem() {
        String elem = "";
        int maxlen = 0;
        for (int i = 0; i < StringsList.size(); i++) {
            if (maxlen < StringsList.get(i).length()) {
                maxlen = StringsList.get(i).length();
                elem = StringsList.get(i);
            }
        }
        return elem;
    }

    double avg() {
        double sum = 0;
        for (int i = 0; i < StringsList.size(); i++) {
            sum += StringsList.get(i).length();
        }
        return sum / StringsList.size();
    }
}
    List<String> l = new ArrayList<>();
    Strings s = new Strings (l);
        System.out.println(s.MaxElem());
}
}
