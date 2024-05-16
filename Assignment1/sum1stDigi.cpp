#include <iostream>
using namespace std;

int main() {
    int n;
    cout << "Enter how many numbers to enter: ";
    cin >> n;
    int sum = 0;
    cout << "Enter " << n << " numbers: ";
    for (int i=0; i<n; i++) {
        int x;
        cin >> x;
        while (x>9) {
            x /= 10;
        }
        sum += x;
    }
    cout << sum;
    return 0;
}