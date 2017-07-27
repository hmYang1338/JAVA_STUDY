package kosta.generictype;

public class Pair<K, V> {
	
	private K key;
	private V value;
	
	// 추가 put
	public void put(K key, V value) {
		this.key = key;
		this.value = value;
	}
	
	// 꺼내오기 get / 키를 통해 값을 얻어옴
	public V get(K key) {
		return this.value;
	}
}
