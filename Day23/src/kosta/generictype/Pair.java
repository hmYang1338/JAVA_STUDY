package kosta.generictype;

public class Pair<K, V> {
	
	private K key;
	private V value;
	
	// �߰� put
	public void put(K key, V value) {
		this.key = key;
		this.value = value;
	}
	
	// �������� get / Ű�� ���� ���� ����
	public V get(K key) {
		return this.value;
	}
}
