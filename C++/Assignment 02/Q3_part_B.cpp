#include <iostream>
#include <cmath>
using namespace std;

namespace Physics {
    double clamp(double val, double min, double max){

        if(val <min)
            return min;
        else if(val > max)
            return max;
        else
            return val;

    }

    double lerp(double a, double b, double t){
        return (a + pow((b-a),t));
    }
}

namespace GameMath {
    int clamp(int val, int min, int max){

        if(val < min)
            return min;
        else if(val > max)
            return max;
        else
            return val;

    }
 double lerp(double a, double b, double t){
    return (a + pow((b-a),t));  // lerp for UI animations
 } 
}

int main(){
    //Physics functins
    cout<<"Physics clamp: "<<Physics::clamp(26.89, 12.89,45.78)<<endl;
    cout<<"Physics lerp: "<<Physics::lerp(2.45, 5.67, 7.65)<<endl;

    //GameMath
    cout<<"Gamemath clamp: "<<GameMath::clamp(34, 8, 20)<<endl;
    cout<<"GameMath lerp: "<<GameMath::lerp(2.67, 7.54, 8.65)<<endl;

    { // doing with using keyword
        using Physics::clamp;
        using Physics::lerp;
        cout<<"Physics clamp: "<<clamp(26.89, 12.89,45.78)<<endl;
        cout<<"Physics lerp: "<<Physics::lerp(2.45, 5.67, 7.65)<<endl;
    }

    { // doing with using keyword
        using GameMath::clamp;
        using GameMath::lerp;
        cout<<"GameMath clamp: "<<clamp(26.89, 12.89,45.78)<<endl;
        cout<<"GameMath lerp: "<<Physics::lerp(2.45, 5.67, 7.65)<<endl;
    }
    return 0;
}