public class Main {
    public static void main(String[] args){
        int count = 0;

        String dataset[] = {
                "Braund, Mr.Owen Harris",
                "Cumings, Mrs. John Bradley(Florence Briggs Thayer)",
                "Heikkinen, Miss. Laina",
                "Futrelle,  Mts. Jacques Heath(Lily May Peel)",
                "Allen, Mr. William Henry",
                "Moran, Mr. James",
                "McCarthy, Mr. Timothy J",
                "Palsson, Master. Gosta Lenoard",
                "Johnson, Mrs.Oscar W (Elisabeth Vilhelmina Berg)",
                "Nasser, Mrs. Nicholas (Adele Achem)",
                "Sandstrom, Miss. MatgueriteRut",
                "Fortune, Mr. Charles Alexander",
                "Dwyer, Miss. Ellen",
                "Todoroff, Mr. Lalio"
        };

        for(int i = 0; i < dataset.length; i++){
            if(dataset[i].indexOf("M") >= 0)
                count++;
        }

        System.out.println("M이 들어간 값의 갯수는 "+count);
    }
}
