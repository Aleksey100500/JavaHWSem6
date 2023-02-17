import java.util.HashMap;

class newSet {
    private HashMap<Integer, Object> hm = new HashMap<>();
    private final Object object = new Object();

    public boolean Append(Integer num) { return hm.put(num, object) != null ? true : false; }

    @Override
    public String toString() {
        return hm.keySet().toString();
    }
}
