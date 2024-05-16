#include <iostream>
using namespace std;

int main() {
    int n, x=0, sum=0;
    cout << "Enter how many numbers to enter: ";
    cin >> n;
    int a[n];
    cout << "Enter " << n << " numbers: ";
    for (int i=0; i<n; i++) {
        cin >> a[i];
    }
    for (int j=0; j<n; j++) {
        int y = a[j];
        if (y >= x) {
            x = y;
        }
    }
    for (int k=0; k<n; k++) {
        int z = a[k];
        if (z == x) {
            continue;
        }
        sum += z;
    }
    cout << sum;
    return 0;
}