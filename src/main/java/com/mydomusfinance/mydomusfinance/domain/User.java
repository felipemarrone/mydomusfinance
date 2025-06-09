package com.mydomusfinance.mydomusfinance.domain;

import jakarta.persistence.*;
import lombok.Getter;

import java.time.Instant;
import java.time.LocalDateTime;
import java.util.UUID;

@Getter
@Entity //Marca a entity como JPA (Java Persistence API) para uma tabela no banco de dados
@Table(name = "users") //Nome da tabela
public class User {
    @Id //Indica que o atributo ID vai ser uma chave primaria na tabela
    @GeneratedValue(strategy = GenerationType.AUTO) //UUID vai ser gerado automaticamente
    private UUID id;

    private String name;

    @Column(unique = true, nullable = false) //Personaliza a coluna unique - sem dois emails iguais e nullable - campo obrigatorio
    private String email;

    private String password;
    private Boolean enabled = true;
    private LocalDateTime createdAt = LocalDateTime.now();

    //private User(final UserInput input){
        // this.id = input.getId();
        // this.name = input.getName();
        // this.email = input.getEmail();
        // this.password = input.getPassword();
        // this.enabled = input.isEnabled();
        // this.createdAt = LocalDateTime.from(Instant.now());
    }
}