package org.example.tijian.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * (CheckItem)实体类
 *
 * @author gugu
 * @since 2024-06-13 12:21:32
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CheckItem  {
/**检查项编号*/private Integer ciId;
/**检查项名称*/private String ciName;
/**检查项内容*/private String ciContent;
/**检查项意义*/private String meaning;
/**备注*/private String remarks;
}


