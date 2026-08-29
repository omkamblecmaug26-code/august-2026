#include <iostream>
using namespace std;



int main(){
  int statusReg  = 0b10110001;   // Read-only from firmware side
int controlReg = 0b00000000;     // Firmware writes here
int dataReg    = 0b11001010;     // For reassignment demo

const int* regPtr1 = &statusReg;

cout<<*regPtr1<<endl;
//*regPtr1 = 3589099;
//regPtr1 = &controlReg;
/*
its give  error: assignment of read-only location because we have declared  pointer in such a way that its value can't be changed/modify but the pointer can point to other variable
*/

int * const regPtr2 = &controlReg;

// *regPtr2 = 0b11010110;  here we can change the value of controlreg by deferencing it because we have declared the pointer in that way

//regPtr2 = &dataReg; it's give error: assignment of read-only variable 'regPtr2' because this point is in read-only variable and we can't point it to other variable


const int*const regPtr3 = &dataReg;

cout<<*regPtr3<<endl;

//*regPtr3 = 0b101100101; here its gives error: assignment of read-only location '*(const int*)regPtr3' means we can't change the value of it because we have declared it constant

// regPtr3 = &controlReg; Here its gives error: assignment of read-only variable 'regPtr3' bcz we have set pointer to constant

}