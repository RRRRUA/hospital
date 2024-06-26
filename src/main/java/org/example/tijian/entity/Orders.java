package org.example.tijian.entity;

import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * (Orders)实体类
 *
 * @author gugu
 * @since 2024-06-13 12:21:32
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Orders  {
/**订单编号*/private Integer orderId;
/**预约日期*/private Date orderDate;
/**客户编号*/private String userId;
/**所属医院编号*/private Integer hpId;
/**所属套餐编号*/private Integer smId;
/**订单状态（1：未归档；2：已归档）*/private Integer state;
}


