package com.xintong.maintain.cloudprovider.mapper;

import com.xintong.maintain.cloudprovider.entity.EduTeacher;
import com.xintong.maintain.cloudprovider.entity.EduTeacherExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EduTeacherMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table edu_teacher
     *
     * @mbg.generated Sun May 17 11:19:16 CST 2020
     */
    long countByExample(EduTeacherExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table edu_teacher
     *
     * @mbg.generated Sun May 17 11:19:16 CST 2020
     */
    int deleteByExample(EduTeacherExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table edu_teacher
     *
     * @mbg.generated Sun May 17 11:19:16 CST 2020
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table edu_teacher
     *
     * @mbg.generated Sun May 17 11:19:16 CST 2020
     */
    int insert(EduTeacher record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table edu_teacher
     *
     * @mbg.generated Sun May 17 11:19:16 CST 2020
     */
    int insertSelective(EduTeacher record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table edu_teacher
     *
     * @mbg.generated Sun May 17 11:19:16 CST 2020
     */
    List<EduTeacher> selectByExampleWithBLOBs(EduTeacherExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table edu_teacher
     *
     * @mbg.generated Sun May 17 11:19:16 CST 2020
     */
    List<EduTeacher> selectByExample(EduTeacherExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table edu_teacher
     *
     * @mbg.generated Sun May 17 11:19:16 CST 2020
     */
    EduTeacher selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table edu_teacher
     *
     * @mbg.generated Sun May 17 11:19:16 CST 2020
     */
    int updateByExampleSelective(@Param("record") EduTeacher record, @Param("example") EduTeacherExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table edu_teacher
     *
     * @mbg.generated Sun May 17 11:19:16 CST 2020
     */
    int updateByExampleWithBLOBs(@Param("record") EduTeacher record, @Param("example") EduTeacherExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table edu_teacher
     *
     * @mbg.generated Sun May 17 11:19:16 CST 2020
     */
    int updateByExample(@Param("record") EduTeacher record, @Param("example") EduTeacherExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table edu_teacher
     *
     * @mbg.generated Sun May 17 11:19:16 CST 2020
     */
    int updateByPrimaryKeySelective(EduTeacher record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table edu_teacher
     *
     * @mbg.generated Sun May 17 11:19:16 CST 2020
     */
    int updateByPrimaryKeyWithBLOBs(EduTeacher record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table edu_teacher
     *
     * @mbg.generated Sun May 17 11:19:16 CST 2020
     */
    int updateByPrimaryKey(EduTeacher record);
}