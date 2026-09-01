#include <iostream>
#include <string>
using namespace std;


class Patient {
    int patientId;
    string name;
    int age;
    string ward;
    const string bloodGroup;
    public:
        //default constructor
        Patient():bloodGroup("O+"){
            patientId=0;
            name = "unkown";
            age = 0;
            ward="General";
        }

        //Emergency constructor
        Patient(int id,const string& name):patientId(id),name(name){
        }

        //full admission constructor
        Patient(int id, const string& name, int age, const string& ward, const string& bg):bloodGroup(bg){
            patientId =  id;
            this->name = name;
            this->age = age;
            this->ward = ward;
        }

        //getter
        int getId() const{
            return patientId;
        }

        string getName() const{
            return this->name;
        }

        int getAge() const{
            return this->age;
        }

        string getWard()const{
            return this->ward;
        }

        string getBloogGrp() const{
            return bloodGroup;
        }
        //member function

        void displayRecord()const{
            cout<<"Patient Record:"<<endl;
            cout<<" ID         :"<<getId()<<endl;
            cout<<" Name       :"<<getName()<<endl;
            cout<<" Age        :"<<getAge()<<endl;
            cout<<" Ward       :"<<getWard()<<endl;
            cout<<" Blood Grp  :"<<getBloogGrp()<<endl;
            cout<<endl;
        }

        void TransferWard(const string& newWard){
            this->ward = newWard;

            cout<<"Ward Transfer: "<<this->name<<" -> "<<ward<<endl;
        }

        //destructor
        ~Patient(){
            cout<<name<<" discharged"<<endl;
        }


};
int main(){
    Patient p1,
    p2(1034,"Om Kamble"),
    p3(1035,"Ansh Shinde",23,"ICU","AB+");
    p1.displayRecord();
    cout<<"--------------------------"<<endl;
    p2.displayRecord();
    cout<<"--------------------------"<<endl;
    p3.displayRecord();

    Patient *pArr= new Patient[4];

    for(int i=0;i<4;i++){
        pArr[i].displayRecord();
         cout<<endl;
         cout<<"--------------------------"<<endl;
    }

    p3.TransferWard("General");

    delete[] pArr;
} 