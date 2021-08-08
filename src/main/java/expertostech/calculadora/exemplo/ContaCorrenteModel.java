package expertostech.calculadora.exemplo;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import java.math.BigDecimal;

@Data
@Entity
public class ContaCorrenteModel {

    @Id
    private Integer codigo;
    private BigDecimal entrada;
    private BigDecimal saida;
    @OneToOne
    private ClienteModel cliente;

}

