package com.myapplicationdev.android.tw_listview;

public class CourseStructure {
    private String moduleCode;
    private Boolean coding;

    public CourseStructure(String moduleCode, Boolean coding) {
        this.moduleCode = moduleCode;
        this.coding = coding;
    }

    public String getModuleCode() {
        return moduleCode;
    }

    public void setModuleCode(String moduleCode) {
        this.moduleCode = moduleCode;
    }

    public Boolean getCoding() {
        return coding;
    }

    public void setCoding(Boolean coding) {
        this.coding = coding;
    }
}
