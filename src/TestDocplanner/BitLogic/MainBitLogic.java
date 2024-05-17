package TestDocplanner.BitLogic;

public class MainBitLogic {
	public static void main(String[] args) {
		System.out.println(BitLogic.maxXor(1,2,3) == 3);
		System.out.println(BitLogic.maxXor(2,4,8) == 7);
		System.out.println(BitLogic.maxXor(11,61,32) == 32);
		System.out.println(BitLogic.maxXor(10,80,19) == 19);
	}

}