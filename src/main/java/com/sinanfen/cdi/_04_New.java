package com.sinanfen.cdi;

import com.sinanfen.StudentDto;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.inject.New;
import jakarta.enterprise.inject.Produces;
import jakarta.inject.Inject;
import jakarta.inject.Named;
import lombok.Getter;

import java.io.Serializable;

@Named(value = "newtuto")
@ApplicationScoped
public class _04_New {


    //üretilen
    @Produces //üretilen yapı- produces
    public String uretilenData(@New StudentDto studentDto) {
        studentDto = StudentDto.builder()
                .studentId(0L)
                .studentName("student adi")
                .build();

        return studentDto.getStudentName();
    }

    @Getter
    @Inject //tüketen
    private  String tuketilenData;
}
