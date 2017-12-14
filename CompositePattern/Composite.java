/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package composite;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Student
 */
public class Composite {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        UniversityEmp Rector = new UniversityEmp("Leo","Rector",1);
        
        UniversityEmp ViceRector = new UniversityEmp("Richard","Vice Rector",2);
        
        UniversityEmp MuhFakDekan = new UniversityEmp("Kaplan","Dekan , Department of Engineering",3);
        UniversityEmp MuhFakSecreter = new UniversityEmp("Charmie","Secreter , Department of Engineering",4);
        
        UniversityEmp SoftwareEngChairman = new UniversityEmp("Mehmet","Software Engineering Chairman",5);
        UniversityEmp SoftwareEngViceChairman = new UniversityEmp("Ayşe","Software Engineering Vice Chairman",6);
        
        UniversityEmp SoftwareEngStudent = new UniversityEmp("Ali","Student of Sofware Engineering ",7);
        UniversityEmp SoftwareEngStudent2 = new UniversityEmp("Yağız","Student of Sofware Engineering ",8);
        
        Rector.add(ViceRector);
        
        System.out.println(Rector);
        
        ViceRector.add(MuhFakDekan);
        ViceRector.add(MuhFakSecreter);
        
        MuhFakDekan.add(SoftwareEngChairman);
        MuhFakDekan.add(SoftwareEngViceChairman);
        
        SoftwareEngViceChairman.add(SoftwareEngStudent);
        SoftwareEngViceChairman.add(SoftwareEngStudent2);
        
        
        for(UniversityEmp employee : Rector.getSub()){
            System.out.println(employee);
            for(UniversityEmp headEmployee : employee.getSub()){
                System.out.println(headEmployee);
                for(UniversityEmp studepEmployee : headEmployee.getSub()){
                    System.out.println(studepEmployee);
                    for(UniversityEmp stuEmployee : studepEmployee.getSub() ){
                        System.out.println(stuEmployee);
                    }
                }
            }
        }
    }
}
    

class UniversityEmp{
    private String name;
    private String rol;
    private int id;
    private List<UniversityEmp> sub;
    
    public UniversityEmp(String name, String rol, int id){
        this.name = name;
        this.rol = rol;
        this.id = id;
        sub = new ArrayList<UniversityEmp>();
    }
    
    public void add(UniversityEmp e){
        sub.add(e);
    }
    
    public List<UniversityEmp> getSub(){
        return sub;
    }
    
    public String toString(){
        return ("UniversityEmp : [ Name : " + name +
                " , Rol : " + rol +
                " , id No : " + id +
                " ]");
    }
    
}
