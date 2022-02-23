package com.example.travel.entity;

import javax.persistence.*;

@Entity
@DiscriminatorValue("Bus")
public class Bus extends Vehicle{

}
