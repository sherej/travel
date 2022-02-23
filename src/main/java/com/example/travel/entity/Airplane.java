package com.example.travel.entity;

import javax.persistence.*;

@Entity
@DiscriminatorValue("Airplane")
public class Airplane extends Vehicle{

}
