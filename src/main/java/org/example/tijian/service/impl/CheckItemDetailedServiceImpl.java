package org.example.tijian.service.impl;

import org.example.tijian.entity.CheckItemDetailed;
import org.example.tijian.mapper.CheckItemDetailedMapper;
import org.example.tijian.service.CheckItemDetailedService;
import org.example.tijian.util.Result;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * (CheckItemDetailed)表服务实现类
 *
 * @author gugu
 * @since 2024-06-13 12:21:32
 */
@Service("checkItemDetailedService")
public class CheckItemDetailedServiceImpl implements CheckItemDetailedService {
@Resource
private CheckItemDetailedMapper checkItemDetailedMapper;

/**
 * 通过ID查询单条数据
 *
 * @param cdId 主键
 * @return 实例对象
 */
@Override
public Result queryById(Integer cdId) {
        return Result.success(this.checkItemDetailedMapper.queryById(cdId));
        }

/**
 * 全查询
 *
 * @param checkItemDetailed 筛选条件
 * @return 查询结果
 */
@Override
public Result queryAll(CheckItemDetailed checkItemDetailed) {
        return Result.success(this.checkItemDetailedMapper.queryAll(checkItemDetailed));
        }

/**
 * 新增数据
 *
 * @param checkItemDetailed 实例对象
 * @return 实例对象
 */
@Override
public Result insert(CheckItemDetailed checkItemDetailed) {
        this.checkItemDetailedMapper.insert(checkItemDetailed);
        return Result.success(checkItemDetailed);
        }

/**
 * 修改数据
 *
 * @param checkItemDetailed 实例对象
 * @return 实例对象
 */
@Override
public Result update(CheckItemDetailed checkItemDetailed) {
        this.checkItemDetailedMapper.update(checkItemDetailed);
        return Result.success(this.queryById(checkItemDetailed.getCdId()));
        }

/**
 * 通过主键删除数据
 *
 * @param cdId 主键
 * @return 是否成功
 */
@Override
public Result deleteById(Integer cdId) {
        boolean del = this.checkItemDetailedMapper.deleteById(cdId) > 0;
        return Result.success(del);
        }
        }

