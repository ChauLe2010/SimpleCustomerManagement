import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Customer {
    private int idCus;
    private String nameCus;
    private Date dateOfBirth;
    private String image;
    private DateFormat simpleDateFormat=new SimpleDateFormat("dd-mm-yyyy");
    public Customer() {
    }

    public Customer(int idCus, String nameCus, String dateOfBirth, String image) {
        this.idCus = idCus;
        this.nameCus = nameCus;
        try {
            this.dateOfBirth = simpleDateFormat.parse(dateOfBirth);
        } catch (ParseException e) {
            e.getMessage();
        }
        this.image = image;
    }

    public int getIdCus() {
        return idCus;
    }

    public void setIdCus(int idCus) {
        this.idCus = idCus;
    }

    public String getNameCus() {
        return nameCus;
    }

    public void setNameCus(String nameCus) {
        this.nameCus = nameCus;
    }

    public String getDateOfBirth() {
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("dd-mm-yyyy");
        return simpleDateFormat.format(this.dateOfBirth);
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getImage() {
        return this.image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
