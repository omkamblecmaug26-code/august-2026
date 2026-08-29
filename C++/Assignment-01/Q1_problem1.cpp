#include <iostream>
using namespace std;

int main(){
  double reading = -8;
  int status_code;

  double fah = (reading * 9/5) + 32;

  if(reading<0){
	status_code = -1;
  }
  else if(reading >= 0 && reading <=29){
	status_code = 0;
  }
  else if(reading >=30 && reading <=44){
	status_code = 1;
  }
  else if(reading >=45 && reading <=59) {
	status_code = 2;
  }
  else{
	status_code = 3;
  }

  switch(status_code){
	case -1:
	  cout << "Temperature  :  " << reading << "C  /  " << fah <<"F"<<endl;
	  cout << "Status       :  SENSOR_ERROR"<<endl;
	  cout << "Action       :  Sensor fault -- check wiring"<<endl;
	  break;
	case 0:
	  cout << "Temperature  :  " << reading << "C  /  " << fah <<"F"<<endl;
	  cout << "Status       :  Normal"<<endl;
	  cout << "Action       :  No action required";
	  break;
	case 1:
	  cout << "Temperature  :  " << reading << "C  /  " << fah <<"F"<<endl;
	  cout << "Status       :  WARNING"<<endl;
	  cout << "Action       :  Aler sent to supervisor";
	  break;
	case 2:
	  cout << "Temperature  :  " << reading << "C  /  " << fah <<"F"<<endl;
	  cout << "Status       :  CRITICAL"<<endl;
	  cout << "Action       :  Cooling System triggered";
	  break;
	default:
	  cout << "Temperature  :  " << reading << "C  /  " << fah <<"F"<<endl;
	  cout << "Status       :  SHUTDOWN"<<endl;
	  cout << "Action       :  Emergency Shutdown initiated";
  }
  reading>25 ?cout<<"Above Average":cout<<"Below Average";
}