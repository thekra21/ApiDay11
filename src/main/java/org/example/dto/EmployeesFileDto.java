package org.example.dto;

import jakarta.ws.rs.QueryParam;

public class EmployeesFileDto {

    private @QueryParam("hire_date")String hire_date;
    private @QueryParam("job_id")Integer job_id;

    public String getHire_date() {
        return hire_date;
    }

    public void setHire_date(String hire_date) {
        this.hire_date = hire_date;
    }

    public Integer getJob_id() {
        return job_id;
    }

    public void setJob_id(Integer job_id) {
        this.job_id = job_id;
    }
}
