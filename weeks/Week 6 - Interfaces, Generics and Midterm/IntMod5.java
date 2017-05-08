package interfaces;

public class IntMod5 implements IntMod {
	
	private final static int MOD = 5;
	private int value;
	
	public IntMod5(int n){
		value = n%5;
		while(value<0){
			value+=5;
		}
	}

	@Override
	public IntMod add(IntMod i) {
		return new IntMod5(this.value+i.getValue());
	}

	@Override
	public IntMod multiply(IntMod i) {
		return new IntMod5(this.value*i.getValue());
	}

	@Override
	public IntMod subtract(IntMod i) {
		return new IntMod5(this.value-i.getValue());
	}

	@Override
	public int getMod() {
		return MOD;
	}

	@Override
	public boolean equals(IntMod other) {
		return IntMod5.MOD==other.getMod()&&this.value==other.getValue();
	}

	@Override
	public int compareTo(IntMod other) {
		return this.value-other.getValue();
	}

	@Override
	public int getValue() {
		return this.value;
	}
	
	@Override
	public String toString(){
		return value+"";
	}

}
