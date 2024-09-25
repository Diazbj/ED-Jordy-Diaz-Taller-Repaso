package Util;

import java.util.HashMap;
import java.util.Map;

public class MemoriaCache<K,V> {

    private Map<K,V> memoria;

    public MemoriaCache() {
        this.memoria = new HashMap<K,V>();
    }
    public V get(K key) {
        return this.memoria.get(key);
    }
    public void put(K key, V value) {
        this.memoria.put(key, value);
    }

    public void agregar(K key, V value) {
        this.memoria.put(key, value);
    }



}
