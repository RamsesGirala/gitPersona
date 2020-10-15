package com.example.gitpersona.entities;


import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import lombok.Builder;
import org.hibernate.envers.Audited;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;


@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
@Entity
@Table(name = "persona")
@Audited
public class Persona extends Base {

   @Column(name = "nombre")
   private String nombre;

   @Column(name = "apellido")
   private String apellido;

   @Column(name = "mail")
   private String mail;

   @Column(name = "createAt")
   private Date createAt;

   @Column(name = "foto")
   private Byte[] foto;
}
