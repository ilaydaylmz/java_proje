public class KelvinFactory implements ISÄ±caklikAlgilayiciFactory{

    @Override
    public ISicaklik factoryMethod() throws InterruptedException {
        Kelvin kelvin = new Kelvin();
        kelvin.sicaklikOku();
        return kelvin;
    }
}
