package org.example.tijian.service.impl;

import org.example.tijian.entity.SetMeal;
import org.example.tijian.mapper.SetMealMapper;
import org.example.tijian.service.SetMealService;
import org.example.tijian.util.Result;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * (SetMeal)表服务实现类
 *
 * @author gugu
 * @since 2024-06-13 12:21:32
 */
@Service("setMealService")
public class SetMealServiceImpl implements SetMealService {
@Resource
private SetMealMapper setMealMapper;

/**
 * 通过ID查询单条数据
 *
 * @param smId 主键
 * @return 实例对象
 */
@Override
public Result queryById(Integer smId) {
        return Result.success(this.setMealMapper.queryById(smId));
        }

/**
 * 全查询
 *
 * @param setMeal 筛选条件
 * @return 查询结果
 */
@Override
public Result queryAll(SetMeal setMeal) {
        return Result.success(this.setMealMapper.queryAll(setMeal));
        }

/**
 * 新增数据
 *
 * @param setMeal 实例对象
 * @return 实例对象
 */
@Override
public Result insert(SetMeal setMeal) {
        this.setMealMapper.insert(setMeal);
        return Result.success(setMeal);
        }

/**
 * 修改数据
 *
 * @param setMeal 实例对象
 * @return 实例对象
 */
@Override
public Result update(SetMeal setMeal) {
        this.setMealMapper.update(setMeal);
        return Result.success(this.queryById(setMeal.getSmId()));
        }

/**
 * 通过主键删除数据
 *
 * @param smId 主键
 * @return 是否成功
 */
@Override
public Result deleteById(Integer smId) {
        boolean del = this.setMealMapper.deleteById(smId) > 0;
        return Result.success(del);
        }
        }

