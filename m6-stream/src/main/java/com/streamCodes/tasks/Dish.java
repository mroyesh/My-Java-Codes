package com.streamCodes.tasks;

import lombok.*;

@Getter
@AllArgsConstructor
@ToString
@Setter
public class Dish {
     private String name;
     private boolean vegetarian;
     private int calories;
     private Type type;
}

