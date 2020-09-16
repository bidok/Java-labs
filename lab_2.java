public class lab_2 {
    public static void main(String[] args) {
        String str = "@@@ ясав %:?:* ваХДЛПВАся $%!@";
        System.out.println("Your string: "+ str);
        str = str.toLowerCase();
        String cleanStr = str.replaceAll("[^а-я]" , "");
        System.out.println("clean string: "+ cleanStr);
        StringBuffer temp = new StringBuffer(cleanStr);
        String reverse = new String(temp.reverse());
        System.out.println("Reverse string: " + reverse);
        System.out.println("==================================");
        if (cleanStr.equals(reverse)){
            System.out.println("Your string is polindrom");
        }
        else{
            System.out.println("Your string isn't polindrom");
        }

    }
}
