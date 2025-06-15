public class PhraseOMatic {
    public static void main(String[] args) {
        String[] wordListOne = { "27/7", "multi-tier", "30000foot", "B-to-B", "win-win", "frontend", "web-based",
                "pervasive", "smart", "sixsigma", "critical-path", "dynamic" };

        String[] wordListtwo = { "empowerd", "sticky", "value-added", "oriented", "centric", "distrubted", "clustered",
                "barnded", "outside-the-box", "positioned", "networked", "focused", "leveraged", "aligned", "targeted",
                "shared", "cooperative", "accelarted" };
        String[] wordListThree = { "process", "tippingpoint", "solution", "architecture", "core competecny",
                "strategy", "mindshare", "portal", "space", "vision", "paradigm", "mission" };

        // find out how many words are in each list

        int onelength = wordListOne.length;
        int twoLength = wordListtwo.length;
        int threeLength = wordListThree.length;

        // Generate three randome number
        int rand1 = (int) (Math.random() * onelength);
        int rand2 = (int) (Math.random() * twoLength);
        int rand3 = (int) (Math.random() * threeLength);

        // now build a phrase
        String phrase = wordListOne[rand1] + " " + wordListtwo[rand2] + " " + wordListThree[rand3];

        // print out the phrase
        System.out.println("What we need is a " + phrase);
    }

}
