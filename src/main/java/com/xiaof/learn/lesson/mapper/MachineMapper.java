package com.xiaof.learn.lesson.mapper;

import com.xiaof.learn.lesson.entity.Machine;
import com.xiaof.learn.lesson.entity.MachineExample;
import com.xiaof.learn.lesson.entity.MachineKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MachineMapper {
    int countByExample(MachineExample example);

    int deleteByExample(MachineExample example);

    int deleteByPrimaryKey(MachineKey key);

    int insert(Machine record);

    int insertSelective(Machine record);

    List<Machine> selectByExample(MachineExample example);

    Machine selectByPrimaryKey(MachineKey key);

    int updateByExampleSelective(@Param("record") Machine record, @Param("example") MachineExample example);

    int updateByExample(@Param("record") Machine record, @Param("example") MachineExample example);

    int updateByPrimaryKeySelective(Machine record);

    int updateByPrimaryKey(Machine record);
}