package fourteentwo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

class RunnerTwo {
    public static void main(String[] args) {
        List<String> fishList = new ArrayList<>();
        fishList.add("salmon");
        fishList.add("trout");
        fishList.add("tuna");
        fishList.add("salmon");

        FishCollection fishCollection = new FishCollection(fishList);

        System.out.println("Исходная коллекция: " + fishList);

        List<String> uniqueFishList = fishCollection.getUniqueFishList();
        System.out.println("Коллекция без дубликатов: " + uniqueFishList);

        List<String> sortedFishList = fishCollection.sortFishList(uniqueFishList);
        System.out.println("Отсортированная коллекция: " + sortedFishList);

        List<String> replacedFishList = fishCollection.replaceFish(sortedFishList, "tuna", "cod");
        System.out.println("Коллекция после замены: " + replacedFishList);

        List<String> swappedFishList = fishCollection.swapFish(replacedFishList, 0, 1);
        System.out.println("Коллекция после обмена элементов: " + swappedFishList);

        List<String> finalFishList = fishCollection.removeLastElement(swappedFishList);
        System.out.println("Коллекция после удаления последнего элемента: " + finalFishList);
    }
}
