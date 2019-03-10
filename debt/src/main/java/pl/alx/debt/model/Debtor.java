package pl.alx.debt.model;

import lombok.Getter;

import javax.persistence.*;

@Entity
@Getter
public class Debtor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(length = 45,unique = true, nullable = true)
    private String email;


    @Column(length = 45,unique = true, nullable = false)
    private String firstName;

    @Column(length = 45,unique = true, nullable = false)
    private String lastName;

    public Debtor(String email, String firstName, String lastName) {
        this.email = email;
        this.firstName = firstName;
        this.lastName = lastName;
    }
}