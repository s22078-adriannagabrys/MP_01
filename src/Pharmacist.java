import java.time.LocalDate;
import java.util.ArrayList;

public class Pharmacist extends CommunityPharmacyEmployee{
    private double degreeBonus = 5.00;
    private int extraAmountOfDrugsSoldPerMonth;

    public Pharmacist(ArrayList<String> names, String surName, LocalDate birthDate, double salaryPerHour, LocalDate dateOfEmployment, boolean hasMasterDegree) {
        super(names, surName, birthDate, salaryPerHour, dateOfEmployment, hasMasterDegree);
    }

    //przesłonięcie metody
    @Override
    public double calculateSalary() {
        return getSalaryPerHour() * degreeBonus + extraAmountOfDrugsSoldPerMonth;
    }

    //metoda klasowa

    //ewentualnie zrobić dynamiczny przykład klasy ze farmaceuta stanie sie kierownikiem

}
