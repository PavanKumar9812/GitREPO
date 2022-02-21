
class Lab3Exercise3
{
    static boolean isVowel(char ch)
    {
        if (ch != 'a' && ch != 'e' && ch != 'i'
                && ch != 'o' && ch != 'u')
        {
            return false;
        }
        return true;
    }
 
    static String replaceConsonants(char[] s)
    {
     
        for (int k = 0; k < s.length; k++)
        {
            if (!isVowel(s[k]))
            {
 
                if (s[k] == 'z')
                {
                    s[k] = 'b';
                }
                 
                else
                {
 
                
                    s[k] = (char) (s[k] + 1);
 
                    if (isVowel(s[k]))
                    {
                        s[k] = (char) (s[k] + 1);
                    }
                }
            }
        }
        return String.valueOf(s);
    }
 
    public static void main(String[] args)
    {
        String s = "Capgemini";
        System.out.println(replaceConsonants(s.toCharArray()));
    }
}