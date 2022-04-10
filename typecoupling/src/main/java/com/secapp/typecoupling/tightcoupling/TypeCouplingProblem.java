package com.secapp.typecoupling.tightcoupling;

import com.secapp.typecoupling.Doctor;
import com.secapp.typecoupling.Engineer;

public class TypeCouplingProblem {
    Doctor doctor;
    Engineer engineer;
    public TypeCouplingProblem() {
        this.doctor=doctor;
        this.engineer=engineer;

    }
    public void showData(){
        doctor.display();
        engineer.display();
    }

}
