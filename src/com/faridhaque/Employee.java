package com.faridhaque;

public class Employee {
    private int baseSalary;
    private int hourlyRate;


    public int calculateWage(int extraHours){
        return baseSalary + (hourlyRate*extraHours);
    }

    public void setBaseSalary(int baseSalary){
        if(baseSalary<0)
            throw new IllegalArgumentException("Base salary cannot be 0 or less than 0.");
        this.baseSalary=baseSalary;
    }

    public int getBaseSalary(){
        return baseSalary;
    }

    public void setHourlyRate(int hourlyRate){
        if(hourlyRate<0)
            throw new IllegalArgumentException("Hourly Rate cannot be 0 or negative");
        this.hourlyRate=hourlyRate;
    }

    public int getHourlyRate(){
        return hourlyRate;
    }
}
