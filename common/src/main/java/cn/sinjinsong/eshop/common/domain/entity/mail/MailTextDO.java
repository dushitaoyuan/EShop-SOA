package cn.sinjinsong.eshop.common.domain.entity.mail;

import cn.sinjinsong.eshop.common.properties.DateTimeProperties;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MailTextDO {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column mail_text.id
     *
     * @mbggenerated
     */
    private Long id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column mail_text.send_time
     *
     * @mbggenerated
     */
    @JsonFormat(pattern = DateTimeProperties.LOCAL_DATE_TIME_PATTERN)
    private LocalDateTime sendTime;
    
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column mail_text.mail_text
     *
     * @mbggenerated
     */
    private String mailText;

}