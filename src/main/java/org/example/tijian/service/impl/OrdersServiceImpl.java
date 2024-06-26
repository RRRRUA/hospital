package org.example.tijian.service.impl;

import org.example.tijian.entity.Orders;
import org.example.tijian.mapper.OrdersMapper;
import org.example.tijian.service.OrdersService;
import org.example.tijian.util.Result;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * (Orders)表服务实现类
 *
 * @author gugu
 * @since 2024-06-13 12:21:32
 */
@Service("ordersService")
public class OrdersServiceImpl implements OrdersService {
@Resource
private OrdersMapper ordersMapper;

/**
 * 通过ID查询单条数据
 *
 * @param orderId 主键
 * @return 实例对象
 */
@Override
public Result queryById(Integer orderId) {
        return Result.success(this.ordersMapper.queryById(orderId));
        }

/**
 * 全查询
 *
 * @param orders 筛选条件
 * @return 查询结果
 */
@Override
public Result queryAll(Orders orders) {
        return Result.success(this.ordersMapper.queryAll(orders));
        }

/**
 * 新增数据
 *
 * @param orders 实例对象
 * @return 实例对象
 */
@Override
public Result insert(Orders orders) {
        this.ordersMapper.insert(orders);
        return Result.success(orders);
        }

/**
 * 修改数据
 *
 * @param orders 实例对象
 * @return 实例对象
 */
@Override
public Result update(Orders orders) {
        this.ordersMapper.update(orders);
        return Result.success(this.queryById(orders.getOrderId()));
        }

/**
 * 通过主键删除数据
 *
 * @param orderId 主键
 * @return 是否成功
 */
@Override
public Result deleteById(Integer orderId) {
        boolean del = this.ordersMapper.deleteById(orderId) > 0;
        return Result.success(del);
        }
        }

