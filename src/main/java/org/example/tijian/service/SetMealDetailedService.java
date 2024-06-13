package org.example.tijian.service;

import org.example.tijian.entity.SetMealDetailed;
import org.example.tijian.util.Result;

/**
 * (SetMealDetailed)表服务接口
 *
 * @author gugu
 * @since 2024-06-13 12:21:32
 */
public interface SetMealDetailedService {

        /**
         * 通过ID查询单条数据
         *
         * @param sdId 主键
         * @return 实例对象
         */
        Result queryById(Integer sdId);

        /**
         * 全查询
         *
         * @param setMealDetailed 筛选条件
         * @return 查询结果
         */
        Result queryAll(SetMealDetailed setMealDetailed);

        /**
         * 新增数据
         *
         * @param setMealDetailed 实例对象
         * @return 实例对象
         */
        Result insert(SetMealDetailed setMealDetailed);

        /**
         * 修改数据
         *
         * @param setMealDetailed 实例对象
         * @return 实例对象
         */
        Result update(SetMealDetailed setMealDetailed);

        /**
         * 通过主键删除数据
         *
         * @param sdId 主键
         * @return 是否成功
         */
        Result deleteById(Integer sdId);

        }

