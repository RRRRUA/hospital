package org.example.tijian.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * (CheckItemDetailed)实体类
 *
 * @author gugu
 * @since 2024-06-13 12:21:32
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CheckItemDetailed  {
/**检查项明细编号*/private Integer cdId;
/**检查项细明名称*/private String name;
/**检查项明细单位*/private String unit;
/**检查项细明正常值范围中的最小值*/private Double minrange;
/**检查项细明正常值范围中的最大值*/private Double maxrange;
/**检查项细明正常值（非数字型）*/private String normalValue;
/**检查项验证范围说明文字*/private String normalValueString;
/**检查项明细类型（1：数值围范验证型；2：数值相等验证型；3：无需验证型；4：描述型；5：其它）*/private Integer type;
/**所属检查项编号*/private Integer ciId;
/**备注*/private String remarks;
}


