package com.kingfly.domain;

public class TaskKey {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column task.task_id
     *
     * @mbg.generated Sun Apr 01 14:50:31 CST 2018
     */
    private String taskId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column task.task_date
     *
     * @mbg.generated Sun Apr 01 14:50:31 CST 2018
     */
    private String taskDate;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column task.task_id
     *
     * @return the value of task.task_id
     *
     * @mbg.generated Sun Apr 01 14:50:31 CST 2018
     */
    public String getTaskId() {
        return taskId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column task.task_id
     *
     * @param taskId the value for task.task_id
     *
     * @mbg.generated Sun Apr 01 14:50:31 CST 2018
     */
    public void setTaskId(String taskId) {
        this.taskId = taskId == null ? null : taskId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column task.task_date
     *
     * @return the value of task.task_date
     *
     * @mbg.generated Sun Apr 01 14:50:31 CST 2018
     */
    public String getTaskDate() {
        return taskDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column task.task_date
     *
     * @param taskDate the value for task.task_date
     *
     * @mbg.generated Sun Apr 01 14:50:31 CST 2018
     */
    public void setTaskDate(String taskDate) {
        this.taskDate = taskDate == null ? null : taskDate.trim();
    }
}