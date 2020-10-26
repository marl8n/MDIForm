/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package meso.mdiformpersons.classes;

import static meso.mdiformpersons.classes.ageUtils.AgeUtils.calculateAge;

/**
 *
 * @author MIDP9
 */
public class Person {
    protected String name;
    protected String birthDate;
    protected Integer age;
    protected String dpi;

    public Person(String name, String birthDate, String dpi) {
        this.name = name;
        this.birthDate = birthDate;
        this.dpi = dpi;
        actualizeAge(this.birthDate);
        
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getDpi() {
        return dpi;
    }

    public void setDpi(String dpi) {
        this.dpi = dpi;
    }
    
    public String getInfoAsString(){
        return "Nombre: " + this.name + ". Edad: " + this.age;
    }
    
    public void actualizeAge(String dateOfBirth){
        String[] strBuffer = dateOfBirth.split("/");
        Integer[] intBuffer = new Integer[3];
        for( int i = 0; i < 3; i++ ){
            intBuffer[i] = Integer.valueOf(strBuffer[i]);
        }
        this.age = calculateAge.apply(intBuffer[0], intBuffer[1], intBuffer[2]);
    }
}
