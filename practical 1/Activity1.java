package practical1;

public class Activity1 {
    /**
     * Activity 1:
     * Consider   the   following   values:
     * true,  false,  'Z',  '\\',  100,  10000,  1000000,
     * 10000000000L, 3.14f and 2.71828d. Assign each value
     * into the following base (or primitive) types: boolean,
     * char, byte, short, int, long, float, double.
     * Answer each of the following questions:
     *
     * 1.Which values can be assigned to each base type?
     *
     * 2.Which values require type casting?
     * Can you identify each type of casting?
     *
     * 3.Print each valid base type.
     * Are all values printed as expected?
     */

    public static void booleanTests(){
        boolean b1 = true;
        boolean b2 = false;
        /*
        boolean b3 = 'Z';
        boolean b4 = '\\';
        boolean b5 = 100;
        boolean b6 = 100000;
        boolean b7 = 1000000;
        boolean b8 = 10000000000L;
        boolean b9 = 3.14f;
        boolean b10 = 2.71828d;
        */
        boolean b11;
        System.out.println("Boolean data type will only accept true false, null values. \n");
    }

    public static void charTests(){
        /*
        char b1 = true;
        char b1 = (char) true;
        char b2 = false;
        char b2  = 'false'; //too many characters - char is length 1
        */
        char b3 = 'Z';
        char b4 = '\\';
        char b5 = 100;
        /*
        char b6 = 100000;
        char b7 = 1000000;
        char b8 = 10000000000L;
        char b9 = 3.14f;
        char b10 = 2.71828d;
        */
        char b11;
        char b12 = 3;   //displays character with ASCII code 3 rather than the alpha-numeric 3
        System.out.println("b12: " + b12);

        System.out.println("Char data type will only accept single characters, " +
                "defined in single quotation marks or numbers which are valid " +
                "ASCII codes");
    }

    public static void byteTest(){
        /*
        byte b1 = true;
        byte b2 = false;
        byte b1 = (byte) true;
        */
        byte b3 = 'Z';
        System.out.println("b3: " + b3);
        byte b4 = '\\'; //the first \ will be ignored
        System.out.println("b4: " + b4);
        //in both of the above cases, the ASCII code for the character is displayed

        byte b5 = 100;
        System.out.println("b5: " + b5);

        /*
        byte b6 = 100000;
        byte b7 = 1000000;
        byte b8 = 10000000000L;
        byte b9 = 3.14f;
        byte b10 = 2.71828d;
        */
        byte b6 = (byte) 100000;
        System.out.println("b6: " + b6);
        //displays -96 as this is the 2C's represented by binary 100000

        byte b7 = (byte) 1000000;
        System.out.println("b7: " + b7);
        //displays 64 (binary)

        byte b8 = (byte) 10000000000L;
        System.out.println("b8: " + b8);
        //2C's for 0, all data outside 8 bits is lost

        byte b9 = (byte) 3.14f;
        System.out.println("b9: " + b9);
        byte b10 = (byte) -2.71828d;
        System.out.println("b10: " + b10);
        //displays 3 and -2 respectively, the decimals are lost

        byte b11;
        //you must assign a value in order to output a variable
        //System.out.println("b11: " + b11);

        System.out.println("Byte data type will accept binary, " +
                "characters which are converted to ASCII codes and" +
                " numbers (decimals are lost) \n");

    }

    public static void shortTest(){
        /*
        short b1 = true;
        short b2 = false;
         */
        short b3 = 'Z';
        System.out.println("b3: " + b3);
        short b4 = '\\';
        System.out.println("b4: " + b4);
        //above displays ascii codes

        short b5 = 100;
        System.out.println("b5: " + b5);
        //prints as shown

        /*
        short b6 = 100000;
        short b7 = 1000000;
        short b8 = 10000000000L;
        short b9 = 3.14f;
        short b10 = 2.71828d;
        */
        short b6 = (short)100000;
        System.out.println("b6: " + b6);
        //display -31072 2c's from the binary of 100000
        short b7 = (short)1000000;
        System.out.println("b7: " + b7);
        //display 16960 2c's from the binary of 1000000
        short b8 = (short)10000000000L;
        System.out.println("b8: " + b8);
        //displays -7168 2c's from the binary of 10000000000L

        short b9 = (short)3.14f;
        System.out.println("b9: " + b9);
        short b10 = (short)2.71828d;
        System.out.println("b10: " + b10);
        //above displays 2 and 3 respectively with decimal data lost
        short b11;

        System.out.println("Short data type will accept all of the above values except true/false once casted. \n");
    }

    public static void intTest(){
        /*
        int b1 = true;
        int b2 = false;
         */
        int b3 = 'Z';
        System.out.println("b3: " + b3);
        int b4 = '\\';
        System.out.println("b4: " + b4);
        //above displays ascii codes

        int b5 = 100;
        System.out.println("b5: " + b5);
        int ba = 100000;
        System.out.println("ba: " + ba);
        int bb = 1000000;
        System.out.println("bb: " + bb);
        /*
        int b8 = 10000000000L;
        int b9 = 3.14f;
        int b10 = 2.71828d;
        */
        int b6 = (int)100000;
        System.out.println("b6: " + b6);
        int b7 = (int)1000000;
        System.out.println("b7: " + b7);
        //prints as shown

        int b8 = (int)10000000000L;
        System.out.println("b8: " + b8);
        //displays 1410065408 2C's of 10000000000L

        int b9 = (int)3.14f;
        System.out.println("b9: " + b9);
        int b10 = (int)2.71828d;
        System.out.println("b10: " + b10);
        //above displays 2 and 3 respectively with decimal data lost
        int b11;

        System.out.println("int data type will accept all of the above values except true/false once casted. \n");
    }

    public static void floatTest(){
        /*
        float b1 = true;
        float b2 = false;
        */
        float b3 = 'Z';
        System.out.println("b3: " + b3);
        float b4 = '\\';
        System.out.println("b4: " + b4);
        //above displays ascii codes and .0

        float b5 = 100;
        System.out.println("b5: " + b5);
        float ba = 100000;
        System.out.println("ba: " + ba);
        float bb = 1000000;
        System.out.println("bb: " + bb);
        //displays as is with .0 appended

        float bc = 10000000000L;
        System.out.println("bc: " + bc);
        float bd = 3.14f;
        System.out.println("bd: " + bd);
        //displays 1.0E10 and 3.14

        //float b10 = 2.71828d;

        float b6 = (float)100000;
        System.out.println("b6: " + b6);
        float b7 = (float)1000000;
        System.out.println("b7: " + b7);
        //prints as shown with .0 appended

        float b8 = (float)10000000000L;
        System.out.println("b8: " + b8);
        //displays 1.0E10 fp of 10000000000L

        float b9 = (float)3.14f;
        System.out.println("b9: " + b9);
        float b10 = (float)2.71828d;
        System.out.println("b10: " + b10);
        //above displays 3.14 and 2.71828 respectively
        float b11;

        System.out.println("float data type will accept all of the above values except true/false once casted. \n");
    }

    public static void doubleTest(){
        /*
        double b1 = true;
        double b2 = false;
        */
        double b3 = 'Z';
        System.out.println("b3: " + b3);
        double b4 = '\\';
        System.out.println("b4: " + b4);
        //above displays ascii codes with .0 appended

        double b5 = 100;
        System.out.println("b5: " + b5);
        double ba = 100000;
        System.out.println("ba: " + ba);
        double bb = 1000000;
        System.out.println("bb: " + bb);
        //displays as shown with .0 appended

        double bc = 10000000000L;
        System.out.println("bd: " + bc);
        // displays as 1.0E10

        double bd = 3.14f;
        System.out.println("bd: " + bd);
        double be = 2.71828d;
        System.out.println("be: " + be);
        //displays as 3.140000104904175 and 2.71828 respectively

        double b6 = (double)100000;
        System.out.println("b6: " + b6);
        double b7 = (double)1000000;
        System.out.println("b7: " + b7);
        //displays as shown with .0 appended

        double b8 = (double)10000000000L;
        System.out.println("b8: " + b8);
        //displays 1410065408 2C's of 10000000000L

        double b9 = (double)3.14f;
        System.out.println("b9: " + b9);
        double b10 = (double)2.71828d;
        System.out.println("b10: " + b10);
        //displays as 3.140000104904175 and 2.71828 respectively
        double b11;

        System.out.println("double data type will accept all of the above values except true/false once casted. \n");

    }

    public static void main(String[] args) {
        booleanTests();
        charTests();
        byteTest();
        shortTest();
        intTest();
        floatTest();
        doubleTest();
    }
}
