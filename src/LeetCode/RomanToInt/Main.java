import static LeetCode.RomanToInt.RomanToInt.romanToInt;

public static void main(String[] args) {
	System.out.println(romanToInt("III") == 3);
	System.out.println(romanToInt("IV") == 4);
	System.out.println(romanToInt("IX") == 9);
	System.out.println(romanToInt("LVIII") == 58);
	System.out.println(romanToInt("MCMXCIV") == 1994);
}