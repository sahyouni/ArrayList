import java.util.*;

public class ArrayListHelper {

    private ArrayList<Integer> arrayList;

    public ArrayListHelper(ArrayList<Integer> arrayList) {
        this.arrayList = arrayList;
    }

    public void Sort() {
        Collections.sort(this.arrayList);
    }

    public void Reverse() {
        Collections.reverse(this.arrayList);
    }

    public void Append(ArrayList<Integer> list) {

        for (int index = 0; index < list.size(); index++) {
            this.arrayList.add(list.get(index));
        }
    }

    public String Display() {

        String result = "";

        for (int index = 0; index < this.arrayList.size(); index++) {
            result += this.arrayList.get(index);

            if (index != this.arrayList.size() - 1)
                result += "-";
        }

        return result;

    }
}