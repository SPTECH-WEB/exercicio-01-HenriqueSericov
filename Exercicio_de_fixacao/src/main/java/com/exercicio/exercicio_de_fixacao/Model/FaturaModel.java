package com.exercicio.exercicio_de_fixacao.Model;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.*;

import java.time.LocalDate;

@Entity
@Table(name = "faturas")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString

public class FaturaModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "O numero do cartão não pode estar em branco")
    @Pattern(regexp = "\\d{16}", message = "O numero do cartão deve conter exatamente 16 dígitos")
    String numeroCartao;


    @NotBlank(message = "O nome não pode estar nulo")
    @Size(min = 10, max = 100, message = "O nome deve ter entre 10 e 100 caracteres.")
    String nomeTitular;

    @NotNull(message = "O valor não pode estar nulo.")
    @DecimalMin(value = "10.00", message = "O valor minímo é de 10.00")
    @DecimalMax(value = "5000.00", message = "O valor maxímo é de 5000.00")
    Double valor;

    @NotNull(message = "O data não pode estar vazia")
    @FutureOrPresent(message = "A data deve estar em uma data atual ou futura.")
    LocalDate dataPagamento;

    @NotBlank(message = "O email não pode estar vazio")
    @Email(message = "O email deve ser válido.")
    String emailContato;
}
