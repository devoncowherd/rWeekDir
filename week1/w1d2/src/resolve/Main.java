package w1d2.src.resolve;


public class Main 
{

    public static void main(String[] args) throws Exception
    {
        boolean run = true;
        boolean yesNo;
        boolean arrayFull = false;
        char userInput;

        System.out.println("...Script Loaded\n\n");
        
        CharArr myCharArr = new CharArr();


        while(run)
        {
            System.out.println("Enter characters one at a time until the array is full, and then the array size will double!\nCurrent Array Size: " + myCharArr.charArray.length);
            userInput = (char)myCharArr.getChar();
            myCharArr.charArray = myCharArr.fillArr(userInput , myCharArr.charArray);
            myCharArr.shareArr(myCharArr.charArray);
            do{
                System.out.println("Would you like to continue filling the array?\nEnter Response Below: \nY = Yes\nN = No");
                userInput = myCharArr.getChar();
                switch((char)userInput)
                {
                    case 'y':
                        run = true;
                        break;
                    case 'Y':
                        run = true;
                        break;
                    case 'n':
                        run = false;
                        break;
                    case 'N':
                        run = false;
                        break;
                    default:
                        System.out.println("Would you like to continue filling the array?\nEnter Response Below: \nY = Yes\nN = No");
                        userInput = myCharArr.getChar();
                } 
            }while(userInput != 'y' || userInput != 'Y' || userInput != 'n' || userInput != 'N');
        }
    }

}
