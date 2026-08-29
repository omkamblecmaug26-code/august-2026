#include <iostream>
#include <string>
using namespace std;

class Employee{
    
    string  name;
    string department;
    char grade;
    double basicSalary;
    bool isActive =true;
    
  

    public:

      static int employeeCount;
      static int empId;
      Employee(){
        employeeCount++;
        empId++;
      };
      
    //setter
    void setName( const string& n){
        if(n !=""){
            name = n;
        }    
        else{
            cout << "Enter valid input"<<endl;
        }
    }

    void setDepartment(const string& dept){
        if(dept =="Engineering" || dept =="HR" || dept== "Finance" || dept =="Operation"){
            department = dept;
        }    
        else{
            cout << "ERROR: '"<<dept<<"' is not a registered department"<<endl;
        }
        
    }
    void setGrade(char g) {
        if(g =='A' || g =='B' || g== 'C'|| g =='D'){
            grade  = g;
        }    
        else{
            cout << "Enter valid input"<<endl;
        }
    }
    void setBasicSalary(double salary){
        if(salary<500000 && salary>10000)
            basicSalary = salary;
        else{
            cout << "Enter valid input"<<endl;
        }
    }
    void deactivate(){
        isActive = false;
    }

    // getter
    int getEmpId()const{
        return empId;
    }

    string getName() const{
        return name;
    }
    string getDepartment()  const{
        return department;
    }

    char getGrade() const{
        return grade;
    }

    double getBasicSalary() const{
        return basicSalary;
    }

    bool getIsActive() const {
        return isActive;
    }

    // Business logic 

    double computeAllowances() const{
        switch(grade){
            case 'A':
                return ((basicSalary*40)/100);
                
            case 'B':
                return ((basicSalary*30)/100);
                
            case 'C':
                return ((basicSalary*20)/100);;
                
            case 'D':
                return ((basicSalary*10)/100);;
                
            default:
                cout<<"error occur" <<endl;
                return 0;          
        }
    }

    double computeGrossSalary() const {
        return basicSalary + computeAllowances();
    }

    double computeTax() const{
        if(computeGrossSalary()<=50000)
            return 00.00;
        else if(computeGrossSalary()>50000 && computeGrossSalary()<=100000)
            return ((computeGrossSalary() - 50000)*10)/100;
        else {
            return 5000 + (((computeGrossSalary() - 100000)*20)/100);
        }
    }

    double computeNetsalary() const{
        return (computeGrossSalary() - computeTax());
    }

    
    static int getEmployeeCount() {
        return employeeCount;
    }

    void acceptDetails() {
        string n;
        string dept;
        char g;
        double salary;

        cout << "Enter name: ";
        cin >> n;
        setName(n);

        cout << "Enter department: ";
        cin >> dept;
        setDepartment(dept);

        cout << "Enter grade: ";
        cin >> g;
        setGrade(g);

        cout << "Enter basic salary: ";
        cin >> salary;
        setBasicSalary(salary);
    }

    void printPayslip(){
        cout<<"============================================"<<endl;
        cout<<"      EMPLOYEE PAYSLIP -- AUG 2026"<<endl;
        cout<<"============================================"<<endl;
        cout<<"Emp ID       :"<<getEmpId()<<endl;
        cout<<"Name         :"<<getName()<<endl;
        cout<<"Department   :"<<getDepartment()<<endl;
        cout<<"Grade        :"<<getGrade()<<endl;
        cout<<"Status       :"<<(getIsActive()?"Active":"Deactivated")<<endl;
        cout<<"-------------------------------------------"<<endl;
        cout<<"Basic Salary        : Rs. "<<getBasicSalary()<<endl;
        cout<<"Allowances("<<((getGrade()=='A')?"40%":(getGrade()=='B')?"30%":(getGrade()=='C')?"20%":"10%")<<"      : Rs. "<<computeAllowances()<<endl;
        cout<<"Gross Salary        : Rs. "<<computeGrossSalary()<<endl;
        cout<<"-------------------------------------------"<<endl;
        cout<<"Tax Deduction       : Rs. "<<computeTax()<<endl;
        cout<<"Net Salary          : Rs. "<<computeNetsalary()<<endl;
        cout<<"============================================"<<endl;
    }

    
};

int Employee::employeeCount  = 0;
int Employee::empId  = 1000;

int main() {
// Create objects — one on stack, two on heap
    Employee e1;
    Employee* e2 = new Employee();
    Employee* e3 = new Employee();
    e1.acceptDetails();
    e2->acceptDetails();
    e3->acceptDetails();
    // Try uncommenting — observe the compiler error, then explain in a comment 

    // e1.empId = 999;
    // e1.basicSalary = -1000;
    e1.printPayslip();
    e2->printPayslip();
    e3->printPayslip();
    // Simulate a resignation
    e3->deactivate();
    if (!e3->getIsActive())
    cout << e3->getName() << " is no longer active. Payroll skipped." << endl;
    cout << "Total Employees : " << Employee::getEmployeeCount() << endl;
    delete e2;
    delete e3;
    return 0;
}