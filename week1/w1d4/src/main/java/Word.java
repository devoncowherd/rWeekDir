package src.main.java;

//Ted's Word Class
public class Word implements Comparable<Word>{
//    think of objects as a custom type..
//    objects are an instance of a class..
//    they have independent states and behavior


//    access modifier
//    4 in java: public, private, protected, default
//    access modifiers influence whether the variable, method, object, class can be accessed
//    outside of its object
//    this relates to the oop concept of encapsulation
    private char[] charArray;
    int length;

    public Word(){
//        do something here.. (usually instantiate variables)
    }
    public Word(char[] charArray, int length){
        char[] copiedArray = new char[length];
        for(int i = 0; i < length; i++){
            copiedArray[i] = charArray[i];
        }
        this.charArray = copiedArray;
        this.length = length;
    }
    public Word(char[] charArray){
        this(charArray, charArray.length);
    }

    public String toString(){

        String out = "";

        for(int i = 0; i < length; i++){
            out = out + charArray[i];
        }
/*
//        this is replacing:
        int i = 0;
        while(i < length){
//            doing something here
            i++;
        }
        */
        return out;
    }

//    a method that returns true or false depending on if it contains a certain character:
    public boolean contains(char a){
        for(int i = 0; i < length; i++){
            if(charArray[i] == a){
                return true;
            }
        }
        return false;
    }

//    a method that returns the first index of a certain character
    public int indexOf(char c){
        for(int i = 0; i < length; i++){
            if(charArray[i] == c){
                return i;
            }
        }
        return -1;
    }
//    a method that returns true if another word is equal to this word (word1.equals(word2))
    public boolean equals(char[] inputarr){
        int counter = 0;
        for(int i = 0 ;  i< length ;i++){
            if(inputarr[i] != charArray[i]){
                counter++;
            }
        }
        if(counter>0){
            return false;
        }
        return true;
}

//    a method that returns -1 if the word is before another lexigraphically (like in a dictionary), 0 if equal, 1 if after
//    lexigraphically
public int compareTo(Word word) {
    for (int i = 0; i < charArray.length; i++) {
        if (i < word.charArray.length) {
            char first = Character.toLowerCase(charArray[i]);
            char second = Character.toLowerCase(word.charArray[i]);
            if (first < second) {
                return -1;
            }else if (first > second) {
                return 1;
            }
        }else{
            return 1;
        }
    }

    if (charArray.length == word.charArray.length) {
        return 0;
    }else{
        return -1;
    }
}

//    a method that concatenates (combines) two words together - eg cat.concat(dog) = catdog
public String concatTwoString(char[] charArray1, char[] charArray2){
    String concatedString = "";

    for( int x = 0; x<charArray1.length; x++){
        concatedString = concatedString +charArray1[x];
        if (x==charArray1.length-1){
            for(int y=0;y<charArray2.length;y++){
                concatedString = concatedString + charArray2[y];
            }
        }
    }
    return concatedString;
}
    public String concatTwoString(char[] inputArray){
        String concat = "";
        for(int i = 0; i < length; i++){
            concat += charArray[i];
        }
        for(int i = 0; i < length; i++){
           concat += inputArray[i];
        }
        return concat;
    }


//    a method that replaces a character with another at a given index - eg cat.replace(0, 'b') = bat
    public void setIndex(int index, char c){
        charArray[index] = c;
    }
    public char[] getCharArray(){
        return charArray;
    }
    public char getIndex(int i){
        return charArray[i];
    }
//    a method that replaces all of a particular character with another - eg racecar.replace('r', 'w') = wacecaw
    public void replaceAll(char toBeReplaced, char replacingChar){
        for(int i = 0; i < length; i++){
            if(charArray[i] == toBeReplaced){
                charArray[i] = replacingChar;
            }
        }
    }
//    a method that returns all of a word until a particular index (substring) - eg racecar.substring(3) = rac
    public Word substring(int lastIndex){
        char[] tempArray = new char[lastIndex];
        for(int i =0 ; i < lastIndex; i++){
            tempArray[i] = charArray[i];
        }
        return new Word(tempArray);
    }
//    a method that returns all of a word between two indexes (first inclusive - second exclusive) - eg
//    racecar.substring(2, 5) = cec
    public Word substring(int firstIndex, int lastIndex){
        char[] tempArray = new char[lastIndex - firstIndex];
        for(int i = firstIndex; i < lastIndex; i++){
            tempArray[i-firstIndex] = charArray[i];
        }
        return new Word(tempArray);
    }

    public Word append(Word appendingWord){
        char[] tempArray = new char[length + appendingWord.getLength()];
        for(int i = 0; i < length; i++){
            tempArray[i] = charArray[i];
        }
        for(int i = 0; i < appendingWord.getLength(); i++){
            tempArray[i+length] = appendingWord.getIndex(i);
        }
        return new Word(tempArray);
    }

    public int getLength(){
        return length;
    }



}