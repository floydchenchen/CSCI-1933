package interfaces;

public class IntMod7 implements IntMod {
	
	private final static int MOD = 7;
	private int value;
	
	public IntMod7(int n){
		value = n%7;
		while(value<0){
			value+=7;
		}
	}

	@Override
	public IntMod add(IntMod i) {
		return new IntMod7(this.value+i.getValue());
	}

	@Override
	public IntMod multiply(IntMod i) {
		return new IntMod7(this.value*i.getValue());
	}

	@Override
	public IntMod subtract(IntMod i) {
		return new IntMod7(this.value-i.getValue());
	}

	@Override
	public int getMod() {
		return MOD;
	}

	@Override
	public boolean equals(IntMod other) {
		return IntMod7.MOD==other.getMod()&&this.value==other.getValue();
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
