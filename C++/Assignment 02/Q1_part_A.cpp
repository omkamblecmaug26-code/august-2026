#include <iostream>
using namespace std;
#include <iomanip>
#include <string>


class Product{
    int productId;
    static int nexid;
    string name;
    double price;
    int quantity;
    public:
        Product(){
            productId = nexid++;
        }

        //setters

        void setName(const string& name){
            if(name == ""){
                cout <<"Invalid input!"<<endl;
                return;
            }
            else{
                this->name = name;
            }
        }

        void setPrice(double price){
            if(price<0){
                cout <<"Invalid input!"<<endl;
                return;
            }
            else{
                this->price = price;
            }
        }

        void setQuantity(int quantity){
            if(quantity<0){
                cout <<"Invalid input!"<<endl;
                return;
            }
            else{
                this->quantity = quantity;
            }
        }

        //getter 
        string getName() const{
            return this->name;
        }

        double getPrice() const{
            return this->price;
        }

        int getQuantity() const{
            return this->quantity;
        }

        int getProductId() const {
            return this->productId;
        }

        //member functions 

        void acceptDetails(){
            string name;
            double price;
            int quantity;

            cout<<"Enter the product name: ";
            getline(cin,name);
            setName(name);

            cout<<"Enter the price: ";
            cin >>price;
            cin.ignore();

            setPrice(price);
            cout<<"Enter the quantity: ";
            cin >>quantity;
            cin.ignore();
            setQuantity(quantity);        
        }

        void displayDetails() const {

            cout << left
                << setw(8)  << getProductId()
                << setw(15) << getName()
                << setw(10) << fixed << setprecision(2) << getPrice()
                << setw(8)  << getQuantity()
                << setw(15) << totalValue()
                << (isLowstock(45)?"← LOW STOCK":"")
                << endl;
        }

        double totalValue() const{
            return this->price * this->quantity;
        }

        bool isLowstock(int threshold) const{
            if(this->quantity < threshold)
                return true;
            else 
                return false;
        };
};

int Product::nexid =1001;

int main(){
    Product p1[5];
    for(int i=0;i<5;i++){
        p1[i].acceptDetails();
    }

    cout << "========== INVENTORY REPORT ==========" << endl;

    cout << left
        << setw(8)  << "ID"
        << setw(15) << "Name"
        << setw(10) << "Price"
        << setw(8)  << "Qty"
        << setw(15) << "Total Value"
        << endl;

    cout << "----------------------------------------------------" << endl;

    //display output
    for(int i=0;i<5;i++){
         p1[i].displayDetails();
    }

    //highnest total value
    int highestIndex = 0;

    for(int i=0;i<5;i++){
        if(p1[i].totalValue() > p1[i].totalValue())
            highestIndex = i;
    }

    cout << "Product with highest total value:\n";p1[highestIndex].displayDetails();


} 