package com.mydomusfinance.om.domain.user;

import jakarta.persistence.*;
import java.time.LocalDateTime;
import java.util.UUID;

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

    public User(){

    }

    public User(UUID id, String name, String email, String password, Boolean enabled, LocalDateTime createdAt){
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
        this.enabled = enabled;
        this.createdAt = createdAt;
    }

    public UUID getId() {
        return id;
    }
    public String getName(){
        return name;
    }
    public String getEmail(){
        return email;
    }
    public String getPassword(){
        return password;
    }
    public Boolean getEnabled(){
        return enabled;
    }
    public LocalDateTime getCreatedAt(){
        return createdAt;
    }
}