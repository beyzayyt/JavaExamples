//package chapter5Inheritance;
//
//import chapter5GetSet.Tasit;
//
//public class Main {
//    public static void main(String[] args) {
//        Person person = new Person();
//        long salary = person.getSalary();
//        System.out.println(salary);
//        int id = person.getId();
//        System.out.println(id);
//        String role = person.getRole();
//        System.out.println(role);
//        Bisiklet bisiklet = new Bisiklet();
//        bisiklet.ilerle(5);
//        System.out.println("Tekerlek sayısı : " + bisiklet.getTekerlekSayisi());
//    }
//}
//
//
////class KaraTasiti extends Tasit {
////    protected int tekerlekSayisi = 2;
////
////    public int getTekerlekSayisi() {
////        return this.tekerlekSayisi;
////    }
////}
//
//class DenizTasidi extends Tasit {
//    public void protectedExample1() {
//        KaraTasiti tasit = new KaraTasiti();
//        tasit.tekerlekSayisi = 6;
//    }
//}
//class Bisiklet extends KaraTasiti {
//    public void protectedExample() {
//        KaraTasiti tasit = new KaraTasiti();
//        tasit.tekerlekSayisi = 2;
//    }
//}
//class A {
//    // Class A uses a Class Inheritence.
//    public void Yontem(Inheritance b) {
//
//    }
//}
//
//class Inheritance {
//}
//
////composition
//class Job {
//    private String role;
//    private long salary;
//    private int id;
//
//    public String getRole() {
//        return role;
//    }
//
//    public void setRole(String role) {
//        this.role = role;
//    }
//
//    public long getSalary() {
//        return salary;
//    }
//
//    public void setSalary(long salary) {
//        this.salary = salary;
//    }
//
//    public int getId() {
//        return id;
//    }
//
//    public void setId(int id) {
//        this.id = id;
//    }
//}
//
//class Person {
//    //    composition has a relationship
////    Class Person has a Class Job.
//    private Job job;
//
//    public Person() {
//        this.job = new Job();
//        job.setSalary(1000L);
//        job.setId(1);
//        job.setRole("engineer");
//
//    }
//
//    public long getSalary() {
//        return job.getSalary();
//    }
//
//    public int getId() {
//        return job.getId();
//    }
//
//    public String getRole() {
//        return job.getRole();
//    }
//
//}
