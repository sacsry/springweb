package org.fullstack4.springmvc.domain;

import lombok.*;
import lombok.extern.log4j.Log4j2;

import java.time.LocalDate;

@Log4j2///실제 배포시에 넣지마
@ToString
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class BbsVO {
    private int idx;
    private String user_id;
    private String title;
    private String content;
    private String display_date;
    private LocalDate reg_date;
    private LocalDate modify_date;
    private int read_cnt;
    private String interest;
    private int reply_cnt;
}
