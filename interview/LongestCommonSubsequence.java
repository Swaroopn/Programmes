package interview;

public class LongestCommonSubsequence
{
	public static void main( String[] args )
	{
		String str1 = "abcdefa";
		String str2 = "aca";

		System.out.println( findLCS( str1, str2 ) );
	}

	private static int findLCS( String word1, String word2 )
	{
		char[] str1 = word1.toCharArray();
		char[] str2 = word2.toCharArray();

		int temp[][] = new int[str1.length + 1][str2.length + 1];
		int max = 0;

		for ( int i = 1; i < temp.length; i++ )
		{
			for ( int j = 1; j < temp[0].length; j++ )
			{
				if ( str1[i - 1] == str2[j - 1] )
				{
					temp[i][j] = temp[i - 1][j - 1] + 1;
				}
				else
				{
					temp[i][j] = Math.max( temp[i][j - 1], temp[i - 1][j] );
				}

				if ( temp[i][j] > max )
				{
					max = temp[i][j];
				}
			}
		}

		return max;
	}

}
