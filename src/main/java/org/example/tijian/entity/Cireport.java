package org.example.tijian.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * (Cireport)实体类
 *
 * @author gugu
 * @since 2024-06-13 12:21:32
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Cireport  {
/**检查项报告主键*/private Integer cirId;
/**检查项编号*/private Integer ciId;
/**检查项名称*/private String ciName;
/**所属预约编号*/private Integer orderId;
}


