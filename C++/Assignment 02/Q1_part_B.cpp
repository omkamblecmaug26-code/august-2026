#include <iostream>
using namespace  std;


double reorderCost(int qty, double unitPrice){
    double reorderCost = qty * unitPrice;
    return reorderCost;
} 
double reorderCost(double qty, double unitPrice){
    double reorderCost = qty * unitPrice;
        return reorderCost;
} 
double reorderCost(int qty, double unitPrice, double taxRate){
     double reorderCost = (qty * unitPrice) + (qty * unitPrice*taxRate);
        return reorderCost;
} 

double applyDiscount(double price, double discountPercent = 10.0){
    double discount_price = price - ((discountPercent/100)*price);
        return discount_price;
}
int main(){
    double reorderCost1 = reorderCost(23,567.87);
    double reorderCost2 = reorderCost(34.56,324.67);
    double reorderCost3 = reorderCost(34,7867.78,12);
    double reorderCost4 = applyDiscount(345.67);
    cout<<reorderCost1<<" "<<reorderCost2<<" "<<reorderCost3<<" "<<reorderCost3<<" "<<reorderCost4<<endl;
}
                     