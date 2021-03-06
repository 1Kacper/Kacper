package pl.alx.debt.model;

import lombok.Getter;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Getter
public class Repayment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private LocalDateTime createAt;
    private BigDecimal installment;
    @ManyToOne
    @JoinColumn(name = "debt_id")
    private Debt debt;
}
