import Person.Person;
import Vehicle.Vehicle;

public class Exec {
    public static void main(String[] args) {
        Vehicle carro = new Vehicle();
        Person pessoa = new Person();
        pessoa.setName("Gustavo");
        pessoa.setCNH("51070144976");
        carro.setDriver(pessoa);
        carro.gearDown();
        carro.decreaseUntil(-30.0);
        System.out.println(carro.speed());
        carro.increaseUntil(0);
        System.out.println(carro.speed());
        carro.increaseUntil(50);
        System.out.println(carro.speed());
        carro.gearDown();
        carro.gearDown();
        System.out.println(carro.speed());
        carro.gearUp();
        System.out.println(carro.speed());
    }
}