package sit.int202.jpa_demo.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.NamedQueries;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;


//ขอEntity นี้จากตาราง  offices ในsql
@Entity
@Table(name = "offices")
@Getter
@Setter
@ToString //ดูผลลัพธ์ได้ง่าย
@NamedQueries({
        @NamedQuery(name = "OFFICE.FIND_ALL", query = "select o from Office o"),
        @NamedQuery(name = "OFFICE.FIND_BY_CITY",
                query = "select o from Office o where o.city like :cityParam")
})
public class Office implements Cloneable {
    @Id //ต้องมีอยู่ตลอด คอลัมน์ในmy sql

    //mysql vachar --> Java String
    private String officeCode; //--PK---//
    private String city;
    private String phone;
    private String addressLine1;
    private String addressLine2;
    private String state;
    private String country;
    private String postalCode;
    private String territory;
}
