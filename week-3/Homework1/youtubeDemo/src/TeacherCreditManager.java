public class TeacherCreditManager extends BaseCreditManager implements ICreditManager {
    @Override
    public void Calculate() {
        System.out.println("Öğretmen Kredisi Hesaplandı");
    }
    @Override
    public void Save(){
        System.out.println("Save methodu override edildi");
    }

}
