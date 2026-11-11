package com.avyahome.crm.entity;
import jakarta.persistence.*;import jakarta.validation.constraints.*;import lombok.*;import java.math.BigDecimal;
@Entity @Getter @Setter @NoArgsConstructor public class Plot{@Id @GeneratedValue(strategy=GenerationType.IDENTITY) Long id;@ManyToOne(optional=false) Project project;@NotBlank String plotNumber;String blockCode;String dimension;String category;String facing;BigDecimal bsp;BigDecimal plcCharges;BigDecimal totalPrice;@Enumerated(EnumType.STRING) DomainEnums.PlotStatus status=DomainEnums.PlotStatus.AVAILABLE;}
