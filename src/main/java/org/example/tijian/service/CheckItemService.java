package org.example.tijian.service;

import org.example.tijian.entity.CheckItem;
import org.example.tijian.util.Result;

/**
 * (CheckItem)表服务接口
 *
 * @author gugu
 * @since 2024-06-13 12:21:32
 */
public interface CheckItemService {

        /**
         * 通过ID查询单条数据
         *
         * @param ciId 主键
         * @return 实例对象
         */
        Result queryById(Integer ciId);

        /**
         * 全查询
         *
         * @param checkItem 筛选条件
         * @return 查询结果
         */
        Result queryAll(CheckItem checkItem);

        /**
         * 新增数据
         *
         * @param checkItem 实例对象
         * @return 实例对象
         */
        Result insert(CheckItem checkItem);

        /**
         * 修改数据
         *
         * @param checkItem 实例对象
         * @return 实例对象
         */
        Result update(CheckItem checkItem);

        /**
         * 通过主键删除数据
         *
         * @param ciId 主键
         * @return 是否成功
         */
        Result deleteById(Integer ciId);

        }

