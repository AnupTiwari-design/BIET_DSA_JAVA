package greedy;

public class TrieNodes {
    TrieNodes[] children = new TrieNodes[26];
    boolean isEndOfWord;

    public TrieNodes() {
        isEndOfWord = false;
    }
}

class Trie {
    TrieNodes root;

    Trie() {
        root = new TrieNodes();
    }

    public void insert(String word) {
        TrieNodes node = root;
        for (char ch : word.toCharArray()) {
            int index = ch - 'a';
            if (node.children[index] == null)
                node.children[index] = new TrieNodes();
            node = node.children[index];
        }
        node.isEndOfWord = true;
    }

    public boolean search(String word) {
        TrieNodes node = root;
        for (char ch : word.toCharArray()) {
            int index = ch - 'a';
            if (node.children[index] == null)
                return false;
            node = node.children[index];
        }
        return node.isEndOfWord;
    }

    public boolean startsWith(String prefix) {
        TrieNodes node = root;
        for (char ch : prefix.toCharArray()) {
            int index = ch - 'a';
            if (node.children[index] == null)
                return false;
            node = node.children[index];
        }
        return true;
    }

    public static void main(String[] args) {
        Trie trie = new Trie();
        trie.insert("apple");
        trie.insert("app");
        trie.insert("bat");

        System.out.println(trie.search("apple"));
        System.out.println(trie.search("appl"));
        System.out.println(trie.startsWith("app"));
        System.out.println(trie.search("bat"));
    }
} 