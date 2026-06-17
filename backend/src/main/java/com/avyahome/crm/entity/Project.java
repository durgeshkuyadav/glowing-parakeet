package com.avyahome.crm.entity;
import jakarta.persistence.*;import jakarta.validation.constraints.*;import lombok.*;import java.math.BigDecimal;import java.time.LocalDate;
@Entity @Getter @Setter @NoArgsConstructor public class Project{@Id @GeneratedValue(strategy=GenerationType.IDENTITY) Long id;@NotBlank String name;@NotBlank String location;String totalArea;LocalDate launchDate;@NotNull BigDecimal basePricePerSqFt;@Column(length=4000) String description;String brochureUrl;@Enumerated(EnumType.STRING) DomainEnums.ProjectStatus status=DomainEnums.ProjectStatus.ACTIVE;}
