package fourteentwo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class FishCollection {

    private List<String> fishList;

    public FishCollection(List<String> fishList) {
        this.fishList = fishList;
    }
    //Получить коллекцию без дубликатов.
    public List<String> getUniqueFishList() {
        HashSet<String> uniqueFishSet = new HashSet<>(fishList);
        return new ArrayList<>(uniqueFishSet);
    }
    //Отсортировать элементы
    public List<String> sortFishList(List<String> list) {
        List<String> sortedList = new ArrayList<>(list);
        Collections.sort(sortedList);
        return sortedList;
    }
    // Заменить элемент (элементы).
    public List<String> replaceFish(List<String> list, String oldFish, String newFish) {
        List<String> replacedList = new ArrayList<>(list);
        int indexToReplace = replacedList.indexOf(oldFish);
        if (indexToReplace != -1) {
            replacedList.set(indexToReplace, newFish);
        }
        return replacedList;
    }
    //Обменять значения двух элементов.
    public List<String> swapFish(List<String> list, int index1, int index2) {
        List<String> swappedList = new ArrayList<>(list);
        Collections.swap(swappedList, index1, index2);
        return swappedList;
    }
    //Удалить последний элемент.
    public List<String> removeLastElement(List<String> list) {
        List<String> modifiedList = new ArrayList<>(list);
        modifiedList.remove(modifiedList.size() - 1);
        return modifiedList;
    }
}
