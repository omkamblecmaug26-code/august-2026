#include <iostream>
using namespace std;

bool parsePacket(const int* rawData, int size,int** outMin, int**outMax){
	int min;
	int max;
	if(size>0){
		min = *rawData;
		max = *rawData;
		for(int i=0;i<size;i++){
			if(min>*rawData){
				*outMin = const_cast<int*>(rawData);
				min = *rawData;
			}	
			if(*rawData>max){
				*outMax = const_cast<int*>(rawData);
				max = *rawData;
			}	
			rawData++;
		}

		return true;
	}
	else {
		return false;
	}
};

int main(){
	int packet[] = {45, 12, 67, 8, 55, 31};
	int* minPtr = nullptr;
	int* maxPtr = nullptr;
	if (parsePacket(packet, 6, &minPtr, &maxPtr)) {
	cout << "Calibration Min : " << *minPtr << endl;
	cout << "Calibration Max : " << *maxPtr << endl;
	}
}