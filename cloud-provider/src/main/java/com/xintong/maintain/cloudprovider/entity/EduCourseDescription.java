package com.xintong.maintain.cloudprovider.entity;

import java.util.Date;

public class EduCourseDescription {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column edu_course_description.id
     *
     * @mbg.generated Sun May 17 11:19:16 CST 2020
     */
    private String id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column edu_course_description.gmt_create
     *
     * @mbg.generated Sun May 17 11:19:16 CST 2020
     */
    private Date gmtCreate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column edu_course_description.gmt_modified
     *
     * @mbg.generated Sun May 17 11:19:16 CST 2020
     */
    private Date gmtModified;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column edu_course_description.description
     *
     * @mbg.generated Sun May 17 11:19:16 CST 2020
     */
    private String description;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column edu_course_description.id
     *
     * @return the value of edu_course_description.id
     *
     * @mbg.generated Sun May 17 11:19:16 CST 2020
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column edu_course_description.id
     *
     * @param id the value for edu_course_description.id
     *
     * @mbg.generated Sun May 17 11:19:16 CST 2020
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column edu_course_description.gmt_create
     *
     * @return the value of edu_course_description.gmt_create
     *
     * @mbg.generated Sun May 17 11:19:16 CST 2020
     */
    public Date getGmtCreate() {
        return gmtCreate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column edu_course_description.gmt_create
     *
     * @param gmtCreate the value for edu_course_description.gmt_create
     *
     * @mbg.generated Sun May 17 11:19:16 CST 2020
     */
    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column edu_course_description.gmt_modified
     *
     * @return the value of edu_course_description.gmt_modified
     *
     * @mbg.generated Sun May 17 11:19:16 CST 2020
     */
    public Date getGmtModified() {
        return gmtModified;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column edu_course_description.gmt_modified
     *
     * @param gmtModified the value for edu_course_description.gmt_modified
     *
     * @mbg.generated Sun May 17 11:19:16 CST 2020
     */
    public void setGmtModified(Date gmtModified) {
        this.gmtModified = gmtModified;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column edu_course_description.description
     *
     * @return the value of edu_course_description.description
     *
     * @mbg.generated Sun May 17 11:19:16 CST 2020
     */
    public String getDescription() {
        return description;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column edu_course_description.description
     *
     * @param description the value for edu_course_description.description
     *
     * @mbg.generated Sun May 17 11:19:16 CST 2020
     */
    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }
}