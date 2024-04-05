package com.yuva.Mydairy.biz.logs;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class LogData {
    @Id
    @GeneratedValue
    private Long id;
    private String inputdata;
    private String logname;

}
