package com.insurance;


import ch.qos.logback.classic.pattern.DateConverter;
import com.sun.istack.NotNull;
import lombok.Data;
import org.springframework.boot.autoconfigure.ImportAutoConfiguration;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

//getter and setter olaylarını data anatsayonu ile hallediyoruz buna bırakıyoruz.
@Data
// bu sınıf database de bir tabloya denk geliyor bu anatasyon ile.
@Entity
@Table(schema = "insurance",name = "insurance")
public class Insurance {

    //bu girdi null olamaz demek.
    @NotNull
    String name;

    @NotNull
    Double price;

//    @NotNull
//    long startDate;

//    @NotNull
//    long endDate;

    //id ile primary key, generated value ile de bu id yi kendisi üretip veriyor. tablonun primery keyi olması gerek.
    @Id
    @GeneratedValue
    String id;


}
