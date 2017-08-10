package pack;
import javax.persistence.*;

//@NamedQueries({
//        @NamedQuery(
//                        name = "findBdataByIfsc",
////                        query = "from Bdata b where b.name = :name"
//                        query = "FROM Bdata WHERE ifsc like '%" + ifsc + "%'"
////                            query = "from Bdata b where b.ifsc = :ifsc"
//                  )
//        }
//)

@Entity
@Table(name="bankdata")
public class Bdata {

    @Column(name="BANK")
    private String bank;


    //    @JoinColumn(name="IFSC", referencedColumnName="IFSC", updatable=false , insertable=false)
    @Id
    @Column(name="IFSC", updatable=false, insertable=false)
    private String ifsc;

    @Column(name="BRANCH")
    private String branch;

    @Column(name="ADDRESS")
    private String address;

    @Column(name="CONTACT")
    private String contact;

    @Column(name="CITY")
    private String city;

    @Column(name="DISTRICT")
    private String district;

    @Column(name="STATE")
    private String state;

    /*Constructor*/
    public Bdata(){

    }

    /*Getter*/

    public String getBank() {
        return bank;
    }

    public String getIfsc() {
        return ifsc;
    }

    public String getBranch() {
        return branch;
    }

    public String getAddress() {
        return address;
    }


    public String getContact() {
        return contact;
    }

    public String getCity() {
        return city;
    }

    public String getDistrict() {
        return district;
    }

    public String getState() {
        return state;
    }


    /*Setter*/

    public void setBank(String bank) {
        this.bank = bank;
    }

    public void setIfsc(String ifsc) {
        this.ifsc = ifsc;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Override
    public String toString(){
        return ("BANK = " + bank + ", IFSC = " + ifsc + ", BRANCH = " + branch + ", ADDRESS = " + address + ", CONTACT = " + contact + ", CITY = " + city + ", DISTRICT = " + district + ", STATE = " + state);
    }
}
