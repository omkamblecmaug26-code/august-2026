#include <iostream>
#include <cmath>

using namespace std;

double computeRMS(double *ptr, int n) {

    double sum = 0;

    for(int i = 0; i < n; i++) {
        sum += (*ptr) * (*ptr);
        ptr++;
    }

    return sqrt(sum / n);
}

void normalise(double *ptr, int n) {

    double max = fabs(ptr[0]);

    // Find maximum absolute value
    for(int i = 1; i < n; i++) {

        if(fabs(ptr[i]) > max) {
            max = fabs(ptr[i]);
        }
    }

    // Divide every element by max
    for(int i = 0; i < n; i++) {
        ptr[i] /= max;
    }
}

void applyGain(double *ptr, int n, double gainFactor) {

    for(int i = 0; i < n; i++) {
        ptr[i] *= gainFactor;
    }
}

int main() {

    int num = 5;

    double arr[5] = {2, 3.65, 5, 3, 8.65};

    cout << "RMS = " << computeRMS(arr, num) << endl;

    cout << "Before normalize: ";

    for(int i = 0; i < num; i++) {
        cout << arr[i] << " ";
    }

    cout << endl;

    normalise(arr, num);

    cout << "After normalize: ";

    for(int i = 0; i < num; i++) {
        cout << arr[i] << " ";
    }

    cout << endl;

    return 0;
}