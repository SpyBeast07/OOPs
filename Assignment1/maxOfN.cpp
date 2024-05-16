#include <iostream>
using namespace std;

int main() {
    int n;
    cout << "Enter how many numbers to enter: ";
    cin >> n;
    int a[n], x = 0;
    cout << "Enter " << n << " numbers: ";
    for (int i = 0; i < n; i++) {
        cin >> a[i];
    }
    for (int j = 0; j < n; j++) {
        int y = a[j];
        if (y >= x) {
            x = y;
        }
    }
    cout << x << endl;
    return 0;
}