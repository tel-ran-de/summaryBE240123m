package summary9.specialInterface;

public class OurClass implements OurInterface{
    @Override
    public void ourAbstractMethod() {
        System.out.println("Реализация абстрактного метода из нашего интерфейса");
        System.out.println("Значение переменной element " + element);
    }
}
