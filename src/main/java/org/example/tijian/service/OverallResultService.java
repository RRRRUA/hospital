package org.example.tijian.service;

import org.example.tijian.entity.OverallResult;
import org.example.tijian.util.Result;

/**
 * (OverallResult)表服务接口
 *
 * @author gugu
 * @since 2024-06-13 12:21:32
 */
public interface OverallResultService {

        /**
         * 通过ID查询单条数据
         *
         * @param orId 主键
         * @return 实例对象
         */
        Result queryById(Integer orId);

        /**
         * 全查询
         *
         * @param overallResult 筛选条件
         * @return 查询结果
         */
        Result queryAll(OverallResult overallResult);

        /**
         * 新增数据
         *
         * @param overallResult 实例对象
         * @return 实例对象
         */
        Result insert(OverallResult overallResult);

        /**
         * 修改数据
         *
         * @param overallResult 实例对象
         * @return 实例对象
         */
        Result update(OverallResult overallResult);

        /**
         * 通过主键删除数据
         *
         * @param orId 主键
         * @return 是否成功
         */
        Result deleteById(Integer orId);

        }

