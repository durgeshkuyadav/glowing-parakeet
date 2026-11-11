package com.avyahome.crm.entity;
import jakarta.persistence.*;import jakarta.validation.constraints.*;import lombok.*;import java.time.LocalDate;
@Entity @Getter @Setter @NoArgsConstructor public class Customer{@Id @GeneratedValue(strategy=GenerationType.IDENTITY) Long id;@NotBlank String name;@NotBlank String mobile;@Email String email;String aadhaar;String pan;@Column(length=2000) String address;String nomineeDetails;LocalDate bookingDate;String promoterAssociateCode;}
