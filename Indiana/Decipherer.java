public class Decipherer {

    public static void main(String[] args) {
        String message1 = "0@sn9sirppa@#?ia'jgtvryko1";
        String message2 = "q8e?wsellecif@#?sel@#?setuotpazdsy0*b9+mw@x1vj";
        String message3 = "aopi?sedohtém@#?sedhtmg+p9l!";

        String test = Dechiffrer(message1);
        String test2 = Dechiffrer(message2);
        String test3 = Dechiffrer(message3);
    }


    public static String Dechiffrer (String message) {
        int chiffreCle = message.length()/2;
        String presqueDechiffré1 = message.substring(5,chiffreCle+5);
        String presqueDechiffré2 = presqueDechiffré1.replace("@#?"," ");
        String dechiffre = new StringBuilder(presqueDechiffré2).reverse().toString();
        System.out.println(dechiffre);

        return dechiffre ;
    }



}