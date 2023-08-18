package gm.cuentas.modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity //Clase de entidad, registro base datos
@Data //Métodos get y set de manera automática
@NoArgsConstructor //Constructor vacío
@AllArgsConstructor //Contructor con todos los argumentos
@ToString //ToString de forma automática
public class Cuenta {
    //Id autoincrementable
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer idCuenta;
    String nombre;
    String tipoCuenta;
    Double saldo;
}
