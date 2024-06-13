package org.example.tijian.service.impl;

import org.example.tijian.entity.Hospital;
import org.example.tijian.mapper.HospitalMapper;
import org.example.tijian.service.HospitalService;
import org.example.tijian.util.Result;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * (Hospital)表服务实现类
 *
 * @author gugu
 * @since 2024-06-13 12:21:32
 */
@Service("hospitalService")
public class HospitalServiceImpl implements HospitalService {
@Resource
private HospitalMapper hospitalMapper;

/**
 * 通过ID查询单条数据
 *
 * @param hpId 主键
 * @return 实例对象
 */
@Override
public Result queryById(Integer hpId) {
        return Result.success(this.hospitalMapper.queryById(hpId));
        }

/**
 * 全查询
 *
 * @param hospital 筛选条件
 * @return 查询结果
 */
@Override
public Result queryAll(Hospital hospital) {
        return Result.success(this.hospitalMapper.queryAll(hospital));
        }

/**
 * 新增数据
 *
 * @param hospital 实例对象
 * @return 实例对象
 */
@Override
public Result insert(Hospital hospital) {
        this.hospitalMapper.insert(hospital);
        return Result.success(hospital);
        }

/**
 * 修改数据
 *
 * @param hospital 实例对象
 * @return 实例对象
 */
@Override
public Result update(Hospital hospital) {
        this.hospitalMapper.update(hospital);
        return Result.success(this.queryById(hospital.getHpId()));
        }

/**
 * 通过主键删除数据
 *
 * @param hpId 主键
 * @return 是否成功
 */
@Override
public Result deleteById(Integer hpId) {
        boolean del = this.hospitalMapper.deleteById(hpId) > 0;
        return Result.success(del);
        }
        }

