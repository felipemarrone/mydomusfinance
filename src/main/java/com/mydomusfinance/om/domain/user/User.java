package com.mydomusfinance.om.domain.user;

import jakarta.persistence.*;

import java.time.Instant;
import java.time.LocalDateTime;

@Entity //Marca a entity como JPA (Java Persistence API) para uma tabela no banco de dados
@Table(name = "users") //Nome da tabela

public class User {
    @Id //Indica que o atributo ID vai ser uma chave primaria na tabela
    //@GeneratedValue(strategy = GenerationType.AUTO) //UUID vai ser gerado automaticamente
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "Name", nullable = false)
    private String name;

    @Column(name = "E-mail" ,unique = true, nullable = false) //Personaliza a coluna unique - sem dois emails iguais e nullable - campo obrigatorio
    private String email;

    @Column(name = "Password", nullable = false)
    private String password;

    @Column(name = "enabled", nullable = false)
    private Boolean enabled = true;

    @Column(name = "CreatedAt", nullable = false)
    private LocalDateTime createdAt = LocalDateTime.now();

    public User(){

    }

    public User(Long id, String name, String email, String password, Boolean enabled, LocalDateTime createdAt){
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
        this.enabled = enabled;
        this.createdAt = LocalDateTime.from(Instant.now());
    }

    public Long getId() {
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