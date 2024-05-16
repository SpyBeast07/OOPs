#include <iostream>
using namespace std;

int main() {
    int n, maxSum = 0, z = 0;
    cout << "Enter how many numbers to enter: ";
    cin >> n;
    int a[n];
    cout << "Enter " << n << " numbers: ";
    for (int i = 0; i < n; i++) {
        cin >> a[i];
    }
    for (int j = 0; j < n; j++) {
        int y = a[j];
        int m = y;
        int sum = 0;
        while (m > 0) {
            sum += (m % 10);
            m /= 10;
        }
        if (sum >= maxSum) {
            maxSum = sum;
            z = y;
        }
    }
    cout << z;
    return 0;
}