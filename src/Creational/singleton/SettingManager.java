package Creational.singleton;

import java.util.HashMap;
import java.util.Map;

public class SettingManager {

    private static SettingManager instance = new SettingManager();
    private Map<String, Object> params = new HashMap<>();

    private SettingManager () {}

    public static SettingManager getInstance() {
        return instance;
    }

    public void set(String key, Object value) {
        params.put(key, value);
    }

    public Object get(String key) {
        return params.get(key);
    }
}
