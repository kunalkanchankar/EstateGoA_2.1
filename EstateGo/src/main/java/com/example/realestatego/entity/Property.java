package com.example.realestatego.entity;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Transient;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Property {
	
    @Id		// Primary key for the Property entity
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int pid;

    // Validation annotation for property @NotEmpty and @size,  @NotNull and others
    @NotEmpty(message = "Property name can't be empty.")
    @Size(min = 3, max = 255, message = "Property name must be between 3 and 255 characters.")
    private String name;

    @NotEmpty(message = "Property description can't be empty.")
    @Size(min = 3, max = 1000, message = "Property description must be between 3 and 1000 characters.")
    private String description;

    @NotNull(message = "Price can't be empty.")
    private int price;

    @NotEmpty(message = "Property type can't be empty.")
    private String propertyType;

    // Property image URL
//    private String propertyImage;

    @NotEmpty(message = "Property status can't be empty.")
    private String status;

    @NotEmpty(message = "Property city can't be empty.")
    private String city;

    @NotEmpty(message = "Property location can't be empty.")
    private String location;

    @NotEmpty(message = "Carpet area can not be empty")
    private String carpetArea;

    // One-to-Many relationship with Reviews entity, specifying the mappedBy property and ignoring serialization for reviews
    @OneToMany(mappedBy = "property")
    @JsonIgnore
    private List<Reviews> reviews;

    // Many-to-One relationship with Agent entity
    @ManyToOne
    @JoinColumn(name = "agent_id")
    private Agent agent;

    @Transient
    private String propertyAgentId;
}
