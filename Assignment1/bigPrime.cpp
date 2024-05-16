#include <iostream>
using namespace std;

int main() {
    int n;
    cout << "Enter how many numbers to enter: ";
    cin >> n;
    int max = 0;
    cout << "Enter " << n << " numbers: ";
    for (int i = 0; i < n; i++) {
        bool pr = true;
        int x;
        cin >> x;
        for (int j = 2; j <= (x / 2) + 1; j++) {
            if (x % j == 0) {
                pr = false;
                break;
            }
        }
        if (pr && x > max)
            max = x;
    }
    cout << max;
    return 0;
}