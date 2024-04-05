package com.yuva.Mydairy.biz.logs;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDateTime;
@Data
@AllArgsConstructor
public class Logs {

    private LocalDateTime time;
    private LogData logname;




}
