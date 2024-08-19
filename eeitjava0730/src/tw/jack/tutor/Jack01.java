package tw.jack.tutor;

public class Jack01 {
	public static void main(String[] args) {
		// 整數: byte, short, int, long
		byte var1;			// 範圍2的8次方 2^8 => -128 ~ 127 第二常用
		var1 = 12;
		byte var2 = 123;	// java 變數名稱命名規則 [a-zA-Z$_][a-zA-Z0-9$_]*
		byte $$$ = 124;
		byte $_$ = 125;
		System.out.println($_$);
		short var3 = 10000;	// 2^16 -32768 ~ 32767
		int var4 = 123; 	// 2^32 = 42億 = 4G 最常用
		long var5 = 123; 	 	// 2^64
	}
}