public class SicaklikAlgila {
    ISÄ±caklikAlgilayiciFactory sicaklikFactory;
    public SicaklikAlgila(ISÄ±caklikAlgilayiciFactory sicaklikFactory)
    {
        this.sicaklikFactory=sicaklikFactory;
    }
    public void basla(String msg) throws InterruptedException {
        System.out.println(msg);
        ISicaklik sicaklik= sicaklikFactory.factoryMethod();
        //ISicaklik sicaklik1= sicaklikFactory.factoryMethod();
    }
}
