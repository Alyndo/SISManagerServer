package com.prac.recordsmanagerweb.dto;

import com.prac.recordsmanagerweb.entities.Student;
import lombok.Data;

@Data
public class MarkDto {

    private String markname;
    private int mark;
    private String subjectcode;
    private String studentnumber;

    private Student student;
}
