package com.yuva.Mydairy.biz.logs;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class LogData {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "log_data_seq")
    @SequenceGenerator(name = "log_data_seq", sequenceName = "log_data_seq", allocationSize = 1) // Update allocationSize to match your database
    @Column(name = "id")
    private Long id;

    private String inputdata;
    private String logname;

}
