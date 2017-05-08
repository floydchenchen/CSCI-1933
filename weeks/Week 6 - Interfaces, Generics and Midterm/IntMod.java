package interfaces;

public interface IntMod extends Comparable<IntMod>{

	//Adds i to this number
	public IntMod add(IntMod i);
	
	//Multiplies this number by i
	public IntMod multiply(IntMod i);

	//Subtracts i from this number
	public IntMod subtract(IntMod i);

	//Returns the mod of the class
	public int getMod();

	//Returns the value after modding as a string
	public String toString();

	//Returns true if both the mod and value are equal
	public boolean equals(IntMod other);

	//negative if this value is less than other's
	//0 if they're the same value
	//positive if this value is greater than other's
	public int compareTo(IntMod other);

	//Returns the value after modulo
	public int getValue();
}
