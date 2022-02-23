package com.example.travel.entity;

import javax.persistence.*;

@Entity
@DiscriminatorValue("Train")
public class Train extends Vehicle{

}
