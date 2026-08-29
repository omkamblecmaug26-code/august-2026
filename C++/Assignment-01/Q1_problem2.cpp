#include <iostream>
using namespace std;


int main(){
  int num_reading,error_counts = 0,normal_count=0,warning_cout=0,critical_cout = 0,shutdown_cout = 0;
  double arr[100];
  double min,max,avg,sum;

  cout <<"Enter the number of readings: "<< endl;
  cin  >>num_reading;


  if(num_reading>=1 && num_reading<=100) {

    //reading the input from user
    cout<<"enter the reading: "<<endl;
    for(int i =0;i<num_reading;i++){
      cin >> arr[i];
    }

    cout <<"reading entered    :  " <<num_reading<<endl;
    cout <<"Valid readings     :  ";

    // printing valid readings
    for(int i =0;i<num_reading;i++){
      if(arr[i] < 0){
        error_counts++;
        continue;
      }
      cout << arr[i] <<" ";
    }
    cout <<endl;

    cout <<"Skipped (errors)   :  " <<error_counts<<endl;

    //skipped error
    for(int i =0;i<num_reading;i++){
      if(arr[i] >=45){
        cout <<"First CRITICAL    : Index " <<i <<" -> "<<arr[i]<<"°C"<<endl;
        break;
      }
    }

    min = arr[0];

    //
    for(int i =0;i<num_reading;i++){

      //minimum
      if(min>arr[i])
        min = arr[i]; 
      
      //maximun  
      if(max<arr[i])
        max = arr[i];

      //reading count
      (arr[i]>=0 && arr[i]<=29)?normal_count++:(arr[i]>=30 && arr[i]<=44)?warning_cout++:(arr[i]>=45 && arr[i]<=59)?critical_cout++:shutdown_cout++;
      //average  
      sum +=arr[i];  
    }
    avg = sum/num_reading;
    
    cout<<"Min : "<<min<<"°C   "<<"Max : "<< max <<"°C   " << "Avg : " <<avg<<"°C"<<endl;

    cout<<"Normal:"<<normal_count<<"  "<<"Warning:"<<warning_cout<<"  "<<"Critical:"<<critical_cout<<"  "<<"Shutdown"<<shutdown_cout<<endl;
  }
  else {
    cout << "invalid  input";
    return 0;
  }
}