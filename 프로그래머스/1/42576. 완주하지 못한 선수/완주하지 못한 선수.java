import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
//        List<String> nameList = new ArrayList<>(Arrays.asList(participant));
//        for (String name : completion) {
//            nameList.remove(name);
//        }
//        return nameList.get(0);

        Map<String, Integer> nameMap = new HashMap<>();
        for (String name : participant) nameMap.put(name, nameMap.getOrDefault(name, 0) + 1);
        for (String completionName : completion) nameMap.put(completionName, nameMap.get(completionName) - 1);
        for (String name : nameMap.keySet()) {
            if(nameMap.get(name) == 1) {
                return name;
            }
        }
        return "";
    }
}