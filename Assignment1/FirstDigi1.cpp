#include <iostream>
using namespace std;

int main() {
    int n, sum = 0;
    cout << "Enter how many numbers to enter: ";
    cin >> n;
    cout << "Enter " << n << " numbers: ";
    for (int i=0; i<n; i++) {
        int x;
        cin >> x;
        int m = x;
        while (m>9) {
            m /= 10;
        }
        if (m==1) {
            sum += x;
        }
    }
    cout << sum;
    return 0;
}