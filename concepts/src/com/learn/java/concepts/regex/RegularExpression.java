package com.learn.java.concepts.regex;

public class RegularExpression {

    /**
     * ? -> 0 or 1
     * + -> 1 0r many
     * * -> 0 or any
     * () -> group
     * {} -> quantifier
     */
    public static void main(String[] args) {

/*        System.out.println("cat".matches("cat"));
        System.out.println("Cat".matches("cat"));
        System.out.println("Cat".matches("[cC]at"));
        System.out.println("Bat".matches("[cCbB]at"));
        System.out.println("c9t".matches("c[^S]t"));
        System.out.println("c9t".matches("c[^0-9]t"));

        System.out.println("Lat".matches("\\wat")); // single word match
        System.out.println("_at".matches("\\wat")); // _ is considered as a word
        System.out.println("Lat".matches("\\w\\w\\w"));

        System.out.println("7".matches("\\d")); // numbers match 0-9
        System.out.println("007".matches("\\d\\d\\d"));
        System.out.println("7AM".matches("\\d\\d\\d")); // this will fail


        System.out.println("080-8736-5307".matches("\\d\\d\\d-\\d\\d\\d\\d-\\d\\d\\d\\d")); // brute-force method
        System.out.println("080-8736-5307".matches("\\d{3}-\\d{4}-\\d{4}"));
        System.out.println("080.8736.5307".matches("\\d{3}[-.]\\d{4}[-.]\\d{4}")); // phone numbers can be in different format
        System.out.println("080 8736 5307".matches("\\d{3}[-. ]\\d{4}[-. ]\\d{4}")); // space? brute force method
        System.out.println("080 8736 5307".matches("\\d{3}[-.\\s]\\d{4}[-.\\s]\\d{4}")); // space? using space character*/

        System.out.println("080 8736 5307".matches("\\d{3}[-.,\\s]+\\d{4}[-.,\\s]+\\d{4}"));
        System.out.println("0808736 5307".matches("\\d{3}[-.,\\s]*\\d{4}[-.,\\s]*\\d{4}"));
        System.out.println("080  8736 5307".matches("\\d{3}[-.,\\s]?\\d{4}[-.,\\s]?\\d{4}"));

        System.out.println("080 8736 5307".matches("\\d{3}[-.,\\s]+(\\d{4}[-.,\\s]?){2}"));

/*
        String emailRegex = "[a-zA-Z0-9]{2,}@[a-z]{2,}.[a-z]{2,}.[a-z]{2,}";
        String email1 = "test@gmail.com";
        String email2 = "test@ramp.co.jp";
        System.out.println(email1.matches(emailRegex));
        System.out.println(email2.matches(emailRegex));
*/
    }
}
