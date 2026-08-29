#include <iostream>
using namespace std;

void resetSensorPairV1(int reading1, int reading2) {
	int temp = reading1;
	reading1 = reading2;
	reading2 = temp;

}
void resetSensorPairV2(int& reading1, int& reading2){
	int temp = reading1;
	reading1 = reading2;
	reading2 = temp;
}; // Fix 1 — Call by Reference
void resetSensorPairV3(int* reading1, int* reading2){
	int temp = *reading1;
	*reading1 = *reading2;
	*reading2 = temp;
}; // Fix 2 — Call by Pointer

int main(){
    int A=55;
    int B=12;
	cout<<"--- V1: Call by Value ---"<<endl;
	cout<<"Before : A="<< A << "  B="<<B<<endl;

	resetSensorPairV1(A,B);  // Original bug — Call by Value
	/*
	Here when we passing the argument to the function, we are sending a copy  of that variable. so their copy are swapped but orignal variable remain unchanged. In function their gets created
	*/
	cout<<"After : A="<< A << "  B="<<B<<endl;

	cout<<endl;

	cout<<"--- V1: Call by Reference ---"<<endl;

	cout<<"Before : A="<< A << "  B="<<B<<endl;
	resetSensorPairV2(A,B);
	cout<<"After : A="<< A << "  B="<<B<<endl;

	/*here we are sending the reference of the variable that is alias of existing variable so changes happen in origianal variable it just another name for that variable */

	cout<<"--- V3: Call by Pointer ---"<<endl;

	cout<<endl;

	cout<<"Before : A="<< A << "  B="<<B<<endl;
	resetSensorPairV3(&A,&B);
	/*Here we are passing the adress of the variable which is catch by the pointer in the function. The pointer points to the adress  of origanal variable*/
	cout<<"After : A="<< A << "  B="<<B<<endl;

}