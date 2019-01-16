package hashcode;

public class Main {
    public static void main(String[] args) {

        //HashCode - это уникальный номер для данного объекта, который возвращает функция хэширования
        Object obj = new Object();
        System.out.println(obj.hashCode()); //97730845

        hashcode.Person max1 = new hashcode.Person("Max", 28);
        hashcode.Person max2 = new hashcode.Person("Max", 28);

        //HashCode уникален даже для казалось бы одинаковых объектов.
        //Хотя бывают ситуации когда хэшкод может быть равным для двух разных объектов,
        //так как хэшкод органичен типом int, а все многообразие объектов неограничено ничем
        System.out.println(max1.hashCode() == max2.hashCode()); // false

    }
}
