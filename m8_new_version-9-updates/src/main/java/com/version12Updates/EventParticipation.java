package com.version12Updates;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;
@ToString
@AllArgsConstructor
@Getter
@Setter

class EventParticipation {


  private List<String> guestNameList;
  private Integer totalNumberOfParticipants;



}