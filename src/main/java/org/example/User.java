package org.example;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.boot.SpringBootConfiguration;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="USERS")
public class User {

    @Id
    private int id;
    @Column(nullable=false, unique=true, name = "CREDITCARDNUMBER")
    private int creditCardNumber;

    @Column(nullable=false, unique = true, name = "EMAIL")
    private String email;

    @Column(nullable=false, name = "PASSWORD")
    private String password;

}
