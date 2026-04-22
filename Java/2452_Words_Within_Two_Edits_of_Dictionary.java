// LeetCode 2452 - Words Within Two Edits of Dictionary
// Difficulty: Medium
// Language: Java

class Solution {
public List<String> twoEditWords(String[] queries, String[] dictionary) {
List<String> ans = new ArrayList<>();

```
    int len = queries[0].length();
    char[][] dict = new char[dictionary.length][];

    for (int i = 0; i < dictionary.length; i++) {
        dict[i] = dictionary[i].toCharArray();
    }

    for (String query : queries) {
        char[] q = query.toCharArray();

        outerloop:
        for (char[] word : dict) {
            if (word.length != q.length) continue;

            int diff = 0;

            for (int i = 0; i < len; i++) {
                if (q[i] != word[i]) {
                    diff++;
                    if (diff > 2) break;
                }
            }

            if (diff <= 2) {
                ans.add(query);
                break outerloop;
            }
        }
    }

    return ans;
}
```

}
