package equals;

public class Main {
    public static void main(String[] args) {

        Integer a = new Integer(6);
        Integer b = new Integer(6);

        //Оператор == сравнивая объекты, сравнивает их ссылки на объекты в памяти
        System.out.println(a == b); //false

        // (исключение: строки, так как они харнятся в памяте в пуле строк)
        String s1 = "sanya";
        String s2 = "sanya";
        System.out.println(s1 == s2); //true

        //метод equals делает тоже саме что и ==, если не переопределен
        //В классе Integer метод equals переопределен, таком образом что он сравнивает value в объектах
        System.out.println(a.equals(b)); //true

    }
}
