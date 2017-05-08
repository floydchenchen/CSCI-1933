package generics;

public class Pair<A extends Comparable<A>,B> implements Comparable<Pair<A,B>> {

	private A a;
	private B b;
	
	public Pair(A a,B b){
		this.a=a;
		this.b=b;
	}
	
	@Override
	public int compareTo(Pair<A, B> other) {
		return this.a.compareTo(other.a);
	}

	public String toString(){
		return b.toString();
	}
}
