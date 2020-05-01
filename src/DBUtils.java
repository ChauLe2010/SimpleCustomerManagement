import javax.jnlp.ClipboardService;
import java.util.ArrayList;

public class DBUtils {
    private static ArrayList<Customer> listCustomers=new ArrayList<Customer>();
    static {
        initDB();
    }
    public static void initDB(){
        Customer customer1=new Customer(1,"Tu","10-10-1990","../../images/baby1.jpg");
        Customer customer2=new Customer(1,"Tuan","10-10-1990","../../images/baby2.jpg");
        Customer customer3=new Customer(1,"Tien","10-10-1990","../../images/baby3.jpg");
        Customer customer4=new Customer(1,"Tam","10-10-1990","../../images/baby4.jpg");

        listCustomers.add(customer1);
        listCustomers.add(customer2);
        listCustomers.add(customer3);
        listCustomers.add(customer4);
    }
    public static ArrayList<Customer> getList(){
        return listCustomers;
    }
    public static Customer getCustomer(int idCus){
        for(Customer customer:listCustomers){
            if(idCus==customer.getIdCus()){
                return customer;
            }
        }
        return null;
    }
}
