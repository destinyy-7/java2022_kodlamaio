public class Main {

    public static void main(String[] args) {
        /* CreditManager creditManager = new CreditManager();
        creditManager.Calculate();
        creditManager.Save();

        Customer customer = new Customer();
        customer.id=1;
        customer.city="Trabzon";

        CustomerManager customerManager = new CustomerManager(customer);
        customerManager.Save();
        customerManager.Delete();

        Company company = new Company();
        company.taxNumber="10000";
        company.companyName="Arçelik";
        company.id=100; */

        CustomerManager customerManager1= new CustomerManager(new Person(),new CarCreditManager());
        customerManager1.GiveCredit();


        /*Person person= new Person();
        person.firstName="";
        person.nationalIdentity="";

        Customer c1= new  Customer();
        Customer c2=new Person();
        Customer c3=new Company();*/
    }
}
