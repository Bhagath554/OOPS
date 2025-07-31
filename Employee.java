class Emp{
    int empno;
    String name;
        float sal;

        Emp(){
            System.out.println("*****");
            empno=101;
            name ="AAshish";
            sal = 5000f;
        }
        void displayDetails(){
            System.out.println(empno+"|"+name+"|"+sal);
        }
    }
    class Employee{
        public static void main(String[] args)
        {
            Emp emp1 = new Emp();
            Emp emp2 = new Emp();
            Emp emp3 = new Emp();
            emp1.displayDetails();
            emp2.displayDetails();
            emp3.displayDetails();
        }
    }
