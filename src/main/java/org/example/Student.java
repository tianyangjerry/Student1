package org.example;

public class Student {
    private String studentId;
    private String studentName;

    private String[] extraActivities;
    public Student() {
    }

    public Student(String studentId, String studentName, String[] extraActivities) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.extraActivities = extraActivities;
    }

    /**
     * 获取
     * @return studentId
     */
    public String getStudentId() {
        return studentId;
    }

    /**
     * 设置
     * @param studentId
     */
    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    /**
     * 获取
     * @return studentName
     */
    public String getStudentName() {
        return studentName;
    }

    /**
     * 设置
     * @param studentName
     */
    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    /**
     * 获取
     * @return extraActivities
     */
    public String[] getExtraActivities() {
        return extraActivities;
    }

    /**
     * 设置
     * @param extraActivities
     */
    public void setExtraActivities(String[] extraActivities) {
        this.extraActivities = extraActivities;
    }

    public String toString() {
        return "Student{studentId = " + studentId + ", studentName = " + studentName + ", extraActivities = " + extraActivities + "}";
    }

    //该方法获取活动总数，并允许用户添加额外活动
    public int addExtraActivity(String extraActivity) {
        if (extraActivities == null) {
            extraActivities = new String[0];
        }
        int newLength = extraActivities.length + 1;
        String[] newExtraActivities = new String[newLength];
        for (int i = 0; i < extraActivities.length; i++) {
            newExtraActivities[i] = extraActivities[i];
        }
        newExtraActivities[newLength - 1] = extraActivity;
        extraActivities = newExtraActivities;
        return newLength;
    }
}
