package cn.springmvc.dao;

import cn.springmvc.model.AaaLoginFtpLog;
import cn.springmvc.model.AaaLoginFtpLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AaaLoginFtpLogMapper {
    int countByExample(AaaLoginFtpLogExample example);

    int deleteByExample(AaaLoginFtpLogExample example);

    int deleteByPrimaryKey(String aaaLoginFtpLogId);

    int insert(AaaLoginFtpLog record);

    int insertSelective(AaaLoginFtpLog record);

    List<AaaLoginFtpLog> selectByExample(AaaLoginFtpLogExample example);

    AaaLoginFtpLog selectByPrimaryKey(String aaaLoginFtpLogId);

    int updateByExampleSelective(@Param("record") AaaLoginFtpLog record, @Param("example") AaaLoginFtpLogExample example);

    int updateByExample(@Param("record") AaaLoginFtpLog record, @Param("example") AaaLoginFtpLogExample example);

    int updateByPrimaryKeySelective(AaaLoginFtpLog record);

    int updateByPrimaryKey(AaaLoginFtpLog record);
}