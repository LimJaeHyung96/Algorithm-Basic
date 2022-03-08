public class Main {
    public static void main (String[] args){
        /*
        String name = "DaveLee";
        int key = (int)(name.charAt(0)) % 20;
        */

        MyHash mainObject = new MyHash(20);
        mainObject.saveData("DaveLee", "01011112222");
        mainObject.saveData("fun-coding", "01022223333");
        mainObject.saveData("Lim", "01077777777");

        System.out.println(mainObject.getData("DaveLee"));
        System.out.println(mainObject.getData("fun-coding"));
        System.out.println(mainObject.getData("Lim"));

    }
}
