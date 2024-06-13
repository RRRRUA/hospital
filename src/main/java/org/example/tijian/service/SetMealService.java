package org.example.tijian.service;

import org.example.tijian.entity.SetMeal;
import org.example.tijian.util.Result;

/**
 * (SetMeal)表服务接口
 *
 * @author gugu
 * @since 2024-06-13 12:21:32
 */
public interface SetMealService {

        /**
         * 通过ID查询单条数据
         *
         * @param smId 主键
         * @return 实例对象
         */
        Result queryById(Integer smId);

        /**
         * 全查询
         *
         * @param setMeal 筛选条件
         * @return 查询结果
         */
        Result queryAll(SetMeal setMeal);

        /**
         * 新增数据
         *
         * @param setMeal 实例对象
         * @return 实例对象
         */
        Result insert(SetMeal setMeal);

        /**
         * 修改数据
         *
         * @param setMeal 实例对象
         * @return 实例对象
         */
        Result update(SetMeal setMeal);

        /**
         * 通过主键删除数据
         *
         * @param smId 主键
         * @return 是否成功
         */
        Result deleteById(Integer smId);

        }

