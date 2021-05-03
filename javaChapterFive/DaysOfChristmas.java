package Chapter5;

public class DaysOfChristmas {
    public static void main(String[] args) {
        final int VERSE_LENGTH = 12;
        String lyricAccessory = "my true love sent to me:";
        String day = "";
        String verse = "";

        for(int counter = 1; counter <= VERSE_LENGTH; counter++){
            System.out.println("  ");
            switch(counter){
                case 1:
                    day = "On the first day of christmas " + lyricAccessory;
                    System.out.println(day);
                    break;
                case 2:
                    day = "On the second day of christmas " + lyricAccessory;
                    System.out.println(day);
                    break;
                case 3:
                    day = "On the third day of christmas " + lyricAccessory;
                    System.out.println(day);
                    break;
                case 4:
                    day = "On the fourth day of christmas " + lyricAccessory;
                    System.out.println(day);
                    break;
                case 5:
                    day = "On the fifth day of christmas " + lyricAccessory;
                    System.out.println(day);
                    break;
                case 6:
                    day = "On the sixth day of christmas " + lyricAccessory;
                    System.out.println(day);
                    break;
                case 7:
                    day = "On the seventh day of christmas " + lyricAccessory;
                    System.out.println(day);
                    break;
                case 8:
                    day = "On the eighth day of christmas " + lyricAccessory;
                    System.out.println(day);
                    break;
                case 9:
                    day = "On the ninth day of christmas " + lyricAccessory;
                    System.out.println(day);
                    break;
                case 10:
                    day = "On the tenth day of christmas " + lyricAccessory;
                    System.out.println(day);
                    break;
                case 11:
                    day = "On the eleventh day of christmas " + lyricAccessory;
                    System.out.println(day);
                    break;
                case 12:
                    day = "On the twelfth day of christmas " + lyricAccessory;
                    System.out.println(day);
                    break;
            }

            switch(counter){
                case 1:
                    verse = "A partridge in a pear tree";
                    System.out.println(verse);
                    break;
                case 2:
                    verse = "Two turtle doves and \n" + verse;
                    System.out.println(verse);
                    break;
                case 3:
                    verse = "Three french hens \n" + verse;
                    System.out.println(verse);
                    break;
                case 4:
                    verse = "Four calling birds \n" + verse;
                    System.out.println(verse);
                    break;
                case 5:
                    verse = "Five golden rings \n" + verse;
                    System.out.println(verse);
                    break;
                case 6:
                    verse = "Six geese are laying \n" + verse;
                    System.out.println(verse);
                    break;
                case 7:
                    verse = "Seven swams are swimming \n" + verse;
                    System.out.println(verse);
                    break;
                case 8:
                    verse = "Eight maids are milking \n" + verse;
                    System.out.println(verse);
                    break;
                case 9:
                    verse = "Nine ladies dancing \n" + verse;
                    System.out.println(verse);
                    break;
                case 10:
                    verse = "Ten lords are leaping \n" + verse;
                    System.out.println(verse);
                    break;
                case 11:
                    verse = "Eleven pipers piping \n" + verse;
                    System.out.println(verse);
                    break;
                case 12:
                    verse = "Twelve drummers drumming \n" + verse;
                    System.out.println(verse);
                    break;
            }
        }

    }
}
