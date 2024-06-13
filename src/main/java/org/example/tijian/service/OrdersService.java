package org.example.tijian.service;

import org.example.tijian.entity.Orders;
import org.example.tijian.util.Result;

/**
 * (Orders)表服务接口
 *
 * @author gugu
 * @since 2024-06-13 12:21:32
 */
public interface OrdersService {

        /**
         * 通过ID查询单条数据
         *
         * @param orderId 主键
         * @return 实例对象
         */
        Result queryById(Integer orderId);

        /**
         * 全查询
         *
         * @param orders 筛选条件
         * @return 查询结果
         */
        Result queryAll(Orders orders);

        /**
         * 新增数据
         *
         * @param orders 实例对象
         * @return 实例对象
         */
        Result insert(Orders orders);

        /**
         * 修改数据
         *
         * @param orders 实例对象
         * @return 实例对象
         */
        Result update(Orders orders);

        /**
         * 通过主键删除数据
         *
         * @param orderId 主键
         * @return 是否成功
         */
        Result deleteById(Integer orderId);

        }

