public class Main {
    public static void main(String[] args){
        HashChaining myHash = new HashChaining(20);
        myHash.saveData("Lee","01012345678");
        myHash.saveData("Lim","01009098787");
        myHash.saveData("David","01024683579");
        myHash.saveData("Lam","01056561111");

        System.out.println(myHash.getData("Lee"));
        System.out.println(myHash.getData("Lim"));
        System.out.println(myHash.getData("David"));
        System.out.println(myHash.getData("Lam"));
    }
}
