package org.example.tijian.service;

import org.example.tijian.entity.CheckItemDetailed;
import org.example.tijian.util.Result;

/**
 * (CheckItemDetailed)表服务接口
 *
 * @author gugu
 * @since 2024-06-13 12:21:32
 */
public interface CheckItemDetailedService {

        /**
         * 通过ID查询单条数据
         *
         * @param cdId 主键
         * @return 实例对象
         */
        Result queryById(Integer cdId);

        /**
         * 全查询
         *
         * @param checkItemDetailed 筛选条件
         * @return 查询结果
         */
        Result queryAll(CheckItemDetailed checkItemDetailed);

        /**
         * 新增数据
         *
         * @param checkItemDetailed 实例对象
         * @return 实例对象
         */
        Result insert(CheckItemDetailed checkItemDetailed);

        /**
         * 修改数据
         *
         * @param checkItemDetailed 实例对象
         * @return 实例对象
         */
        Result update(CheckItemDetailed checkItemDetailed);

        /**
         * 通过主键删除数据
         *
         * @param cdId 主键
         * @return 是否成功
         */
        Result deleteById(Integer cdId);

        }

