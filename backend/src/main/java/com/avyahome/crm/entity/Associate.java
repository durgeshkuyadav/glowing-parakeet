package com.avyahome.crm.entity;
import jakarta.persistence.*;import jakarta.validation.constraints.*;import lombok.*;
@Entity @Getter @Setter @NoArgsConstructor public class Associate{@Id @GeneratedValue(strategy=GenerationType.IDENTITY) Long id;@NotBlank String code;@NotBlank String name;String mobile;String email;String pan;@ManyToOne Associate sponsor;@Enumerated(EnumType.STRING) DomainEnums.Role role=DomainEnums.Role.ASSOCIATE;}
