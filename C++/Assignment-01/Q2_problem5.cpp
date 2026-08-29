#include <iostream> 
#include<cmath>
using namespace std;

class Drone {
	public:
	
	inline double distanceBetween(double x1, double y1, double x2, double y2){
		return sqrt( pow(x2-x1, 2) + pow(y2-y1, 2) );
	}

	inline double toRadians(double degrees){
		return degrees * (M_PI / 180.0);
	}

	inline double clamp(double value, double minVal, double maxVal){
		if (value<minVal){
			return minVal;		
		}
		else if(minVal <= value && value<=maxVal){
			return value;
		}
		else{
			return maxVal;
		}
	}

	inline bool isInSafeZone(double x, double y, double cx, double cy, double radius){
		if(distanceBetween(x,y,cx,cy) <=radius)
			return true;
		else {
			return false;
		}
	}
};	



int main(){

	Drone drone;
	double home[2]{0.0,0.0};
	double safe_radius = 50.0;

	double way_point1[2] = {24.5,20.6};
	double way_point2[2] = {10.01,15.6};
	double way_point3[2] = {52.5,40.6};

	 cout << drone.isInSafeZone(
        way_point1[0], way_point1[1],
        home[0], home[1],
        safe_radius
    ) << endl;

    cout << drone.distanceBetween(
        way_point2[0], way_point2[1],
        home[0], home[1]) << endl;

    cout << drone.isInSafeZone(
        way_point3[0], way_point3[1],
        home[0], home[1],
        safe_radius
    ) << endl;

}