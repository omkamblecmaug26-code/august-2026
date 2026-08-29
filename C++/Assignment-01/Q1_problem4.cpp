#include <iostream>
#include <string>
#include <random>

using namespace std;

int main(int argc, char* argv[]) {

    if (argc != 4) {
        cout << "Error  : Missing arguments." << endl;
        return 0;
    }

    int warn = stoi(argv[1]);
    int critical = stoi(argv[2]);
    int numReadings = stoi(argv[3]);

    // Validation
    if (warn >= critical) {
        cout << "Error  : warn_threshold must be less than "
             << "critical_threshold." << endl;
        return 1;
    }

    if (numReadings < 1 || numReadings > 500) {
        cout << "Error  : num_readings must be between 1 and 500."
             << endl;
        return 1;
    }

    int normal = 0;
    int warning = 0;
    int criticalCount = 0;
    int shutdown = 0;

    // Random number generator: 0 to 69
    random_device rd;
    mt19937 gen(rd());
    uniform_int_distribution<int> dist(0, 69);

    for (int i = 0; i < numReadings; i++) {

        int temperature = dist(gen);

        if (temperature < warn) {
            normal++;
        }
        else if (temperature < critical) {
            warning++;
        }
        else if (temperature < critical + 10) {
            criticalCount++;
        }
        else {
            shutdown++;
        }
    }

    cout << "Config : Warn=" << warn << "°C  "
         << "Critical=" << critical << "°C  "
         << "Readings=" << numReadings << endl;

    cout << "Results: Normal:" << normal
         << "  Warning:" << warning
         << "  Critical:" << criticalCount
         << "  Shutdown:" << shutdown << endl;

    return 0;
}