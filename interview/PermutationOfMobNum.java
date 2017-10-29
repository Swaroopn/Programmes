package interview;

public class PermutationOfMobNum
{
	public static void main( String[] args )
	{
		String[] mobAlpha =
		{ "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };
		int[] digits =
		{ 2, 3, 4 };

		for ( int i = 0; i < digits.length; i++ )
			System.out.println( Permutation.generatePerm( mobAlpha[digits[i] - 1] ) );
	}
}
