package org.example.tijian.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * (SetMealDetailed)实体类
 *
 * @author gugu
 * @since 2024-06-13 12:21:32
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class SetMealDetailed  {
/**套餐明细编号（无意义主键）*/private Integer sdId;
/**套餐编号*/private Integer smId;
/**检查项编号*/private Integer ciId;
}


