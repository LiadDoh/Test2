package q5;

public class Main {
    public static void main(String[] args) {
        MyProtectedUniqueList<String> list = new MyProtectedUniqueList<>("yese");
        list.add("yones");
        list.add("oshri");
        list.add("gary");
        list.add("shai");
        //list.add("shai");
        //list.add("oshri");
        //list.add("oshri");
        //list.add("gary");
        list.add("yakir");
        //list.add("");
        //list.add(null);
        //list.remove(null);
        //list.remove("yakir");
        //list.remove("");
        //list.remove("yakir");
        //list.removeAt(0);
        //list.removeAt(20);
        //list.removeAt(-1);
        //list.clear("nose");
        //list.clear("yese");
        //list.sort("nose");
        list.sort("yese");
        list.print();
    }
}
