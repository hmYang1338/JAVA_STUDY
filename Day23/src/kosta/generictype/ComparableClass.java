package kosta.generictype;

public class ComparableClass implements Comparable<String>{	// <>안에 타입적어줘

	@Override
	public void put(String t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String get() {
		// TODO Auto-generated method stub
		return null;
	}
	
	// 요거랑 같은거임
	/*Comparable<String> c = new Comparable<String>() {
		
		@Override
		public void put(String t) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public String get() {
			// TODO Auto-generated method stub
			return null;
		}
	};*/
}
