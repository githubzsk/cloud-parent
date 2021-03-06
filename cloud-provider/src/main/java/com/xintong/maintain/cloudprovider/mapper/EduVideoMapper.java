package com.xintong.maintain.cloudprovider.mapper;

import com.xintong.maintain.cloudprovider.entity.EduVideo;
import com.xintong.maintain.cloudprovider.entity.EduVideoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EduVideoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table edu_video
     *
     * @mbg.generated Sun May 17 11:19:16 CST 2020
     */
    long countByExample(EduVideoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table edu_video
     *
     * @mbg.generated Sun May 17 11:19:16 CST 2020
     */
    int deleteByExample(EduVideoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table edu_video
     *
     * @mbg.generated Sun May 17 11:19:16 CST 2020
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table edu_video
     *
     * @mbg.generated Sun May 17 11:19:16 CST 2020
     */
    int insert(EduVideo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table edu_video
     *
     * @mbg.generated Sun May 17 11:19:16 CST 2020
     */
    int insertSelective(EduVideo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table edu_video
     *
     * @mbg.generated Sun May 17 11:19:16 CST 2020
     */
    List<EduVideo> selectByExample(EduVideoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table edu_video
     *
     * @mbg.generated Sun May 17 11:19:16 CST 2020
     */
    EduVideo selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table edu_video
     *
     * @mbg.generated Sun May 17 11:19:16 CST 2020
     */
    int updateByExampleSelective(@Param("record") EduVideo record, @Param("example") EduVideoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table edu_video
     *
     * @mbg.generated Sun May 17 11:19:16 CST 2020
     */
    int updateByExample(@Param("record") EduVideo record, @Param("example") EduVideoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table edu_video
     *
     * @mbg.generated Sun May 17 11:19:16 CST 2020
     */
    int updateByPrimaryKeySelective(EduVideo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table edu_video
     *
     * @mbg.generated Sun May 17 11:19:16 CST 2020
     */
    int updateByPrimaryKey(EduVideo record);
}