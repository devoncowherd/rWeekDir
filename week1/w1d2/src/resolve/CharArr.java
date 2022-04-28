package w1d2.src.resolve;
import java.util.Scanner;

public class CharArr 
{
    //base array values
    char[] charArray = new char[5];

    //gets user input
    public char getChar()
    {
        Scanner scan = new Scanner(System.in);
        char userInput = (char)scan.next().charAt(0);
        return userInput;
    }

    //fills the current array
    public char[] fillArr(char userInput, char[] charArr)
    {
        charArr[0] = userInput;
        for(int x = 0; x < charArr.length; x++)
        {       
            if((int)charArr[x] == 0)
            {
                userInput = getChar();
                charArr[x] = userInput; 
            }       
        }
        charArr = doubleArr(charArr);
        return charArr;
    }

    //doubles char array size
    public static char[] doubleArr(char[] charArr)
    {
        char[] doubleSize = new char[charArr.length * 2];
        for(int y = 0; y < charArr.length; y++)
        {
            doubleSize[y] = charArr[y];
            ++y;
        }
        return doubleSize;
    }

    public void shareArr(char[] charArr)
    {
        StringBuilder share = new StringBuilder();
        for(int z = 0; z < charArray.length; z++)
        {
            share.append(charArray[z]);
        }
        System.out.println("Current Array: " + share + "\nNew Array: " + charArray.length);
    }
}
