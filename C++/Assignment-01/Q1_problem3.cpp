#include <iostream>
using namespace std;



int main() {
  double arr[3][3];

  //getting Temperaure from user
  for(int i=0;i<3;i++){
    cout <<"Enter the temperature of "<<i +1<<" floor"<<endl;
      for(int j=0;j<3;j++){
        cin >> arr[i][j];
      }
    }

  //printing Temperature  
    cout<<"          Room1  Room2  Room3"<<endl;
  for(int i=0;i<3;i++){
    cout <<"Floor "<<i+1<<" : ";
      for(int j=0;j<3;j++){
        cout << arr[i][j]<< "      ";
      }
      cout <<endl;    
  }

//calculating hottest room   
double hottest_room = arr[0][0];
int hot_room,hot_floor;

  for(int i=0;i<3;i++){
      for(int j=0;j<3;j++){
        if(arr[i][j]>hottest_room){
          hot_floor=i;
          hot_room=j;
        }
      }
    }

  cout <<endl;  
  cout <<"Hottest Room   : Floor "<<hot_floor+1<<", Room "<<hot_room+1<<" -> "<<arr[hot_floor][hot_room]<<"°C" << endl; 

 // calculating hottest floor
 double avg_floor1=0,avg_floor2 =0,avg_floor3 =0;
 double sum_floor1=0,sum_floor2 =0,sum_floor3 =0;
 int warning_room =0;
 for(int i=0;i<3;i++){
  for(int j=0;j<3;j++){
    if(i==0){
      sum_floor1+=arr[i][j];
    }
    else if(i==1){
      sum_floor2+=arr[i][j];
    }
    else{
      sum_floor3+=arr[i][j];
    }

    if(arr[i][j]>=30)
      warning_room++;

    
      
  }
  if(i==0){
      avg_floor1 = sum_floor1/3;
    }
    else if(i==1){
      avg_floor2 = sum_floor2 / 3;
    }
    else{
      avg_floor3 = sum_floor3 /3;
    }
 }


 //hotest floor
 cout << "Hottest Floor  : Floor ";
 if(avg_floor1>avg_floor2){
  if(avg_floor1>avg_floor3)
    cout << "1  (avg " << avg_floor1 <<"°C"<<endl;
  else
     cout << "3  (avg " << avg_floor3 <<"°C"<<endl;
 }
 else{
  if(avg_floor2>avg_floor3)
    cout << "2  (avg " << avg_floor2 <<"°C"<<endl;
  else
     cout << "3  (avg " << avg_floor3 <<"°C)"<<endl;
 }

 cout << "Rooms at WARNING or above : "<< warning_room;

}