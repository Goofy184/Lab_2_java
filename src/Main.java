public class Main {
    public static void main(String[] args) {
        String text =
                "National Forestry University of Ukraine, Institute of Woodworking,\n" +
                        "Computer Technology and Design, IST-21, 126 Information systems and technologies"
                ;
        // Task 1
        char[] characterArray = {'N', 'a', 't', 'i', 'o', 'n', 'a', 'l', ' ', 'F', 'o', 'r', 'e', 's', 't', 'r', 'y', ' ',
                'U', 'n', 'i', 'v', 'e', 'r', 's', 'i', 't', 'y', ' ', 'o', 'f', ' ', 'U', 'k', 'r', 'a', 'i','n', 'e', ',', ' ',
                'I', 'n', 's', 't', 'i', 't', 'u', 't', 'e', ' ', 'o', 'f', ' ', 'W', 'o', 'o','d', 'w', 'o', 'r', 'k', 'i', 'n', 'g', ',', ' ',
                'C', 'o', 'm', 'p', 'u', 't', 'e', 'r', ' ', 'T','e', 'c', 'h', 'n', 'o', 'l', 'o', 'g', 'y', ' ', 'a', 'n', 'd', ' ', 'D', 'e', 's', 'i', 'g', 'n',',', ' ',
                'I', 'S', 'T', '-', '2', '1', ',', ' ', '1', '2', '6', ' ',
                'I', 'n', 'f', 'o', 'r', 'm','a', 't', 'i', 'o', 'n', ' ', 's', 'y', 's', 't', 'e', 'm', 's', ' ', 'a', 'n', 'd', ' ', 't', 'e','c', 'h', 'n', 'o', 'l', 'o', 'g', 'i', 'e', 's'};
        // Task 2
        String string1 = "National Forestry University of Ukraine, Institute of Woodworking,Computer Technology and Design, IST-21, 126 Information systems and technologies ";
        System.out.println("Task 2: " + string1.substring(0, string1.lastIndexOf(",") + 1));
        // Task 3
        StringBuilder text2 = new StringBuilder();
        text2.append(string1);
        text2.reverse();
        System.out.println("Task 3: " + text2);
        //Task 4
        String string3 = string1.toUpperCase();
        System.out.println("Task 4: " + string3);
        System.out.println("Task 4: " +string1.equals(string3));
        // Task 5
        System.out.println("Task 5: " + string1.split(", ")[2]);
        //Task 6
        String string4 = string1 + string3;
        System.out.println("Task 6: " + string4);
        // Task 7
        System.out.println("Task 7: Індекс першої букви 'N' :" + string1.indexOf("N"));
        System.out.println("Task 7: Індекс останньої букви 'r' :" + string1.lastIndexOf("r"));
        // Task 8
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append ("Spas Oleh Ihorovych 12.05.2004");
        System.out.println("Task 8: " + stringBuffer);
        // Task 9
        System.out.println("Task 9: " + stringBuffer.substring( 0, stringBuffer.lastIndexOf("h") + 1));
        // Task 10
        String placeOfBirth = ", Lviv, Ukraine";
        System.out.println("Task 10: " + stringBuffer.append(placeOfBirth));
        // Task 11
        stringBuffer.insert(31, " Male,");
        System.out.println("Task 11: " + stringBuffer);
        // Task 12
        System.out.println("Task 12: characters length: " + stringBuffer.length());
        System.out.println("Task 12: bytes length: " +  stringBuffer.toString().getBytes().length);
        // Task 13
        System.out.println("Task 13: " + stringBuffer.delete(stringBuffer.length() - 32, stringBuffer.length()));
        // Task 14
        stringBuffer.reverse();
        System.out.println("Task 14: " + stringBuffer);
    }
}