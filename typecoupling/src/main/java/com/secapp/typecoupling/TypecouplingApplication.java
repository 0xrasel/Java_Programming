package com.secapp.typecoupling;

import com.secapp.typecoupling.tightcoupling.TypeCouplingProblem;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TypecouplingApplication {

    public static void main(String[] args) {
        SpringApplication.run(TypecouplingApplication.class, args);
        TypeCouplingProblem problem=new TypeCouplingProblem(new Doctor(), new Engineer());
        problem.showData();
    }

}
