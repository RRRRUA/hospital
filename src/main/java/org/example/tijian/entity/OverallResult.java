package org.example.tijian.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * (OverallResult)实体类
 *
 * @author gugu
 * @since 2024-06-13 12:21:32
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class OverallResult  {
/**总检结论项编号*/private Integer orId;
/**总检结论项标题*/private String title;
/**总检结论项内容*/private String content;
/**所属预约编号*/private Integer orderId;
}


