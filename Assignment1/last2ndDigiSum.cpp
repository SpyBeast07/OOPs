#include <iostream>
using namespace std;

int main() {
    int n, sum = 0;
    cout << "Enter how many numbers to enter: ";
    cin >> n;
    cout << "Enter " << n << " numbers: ";
    for (int i = 0; i < n; i++) {
        int x;
        cin >> x;
        x = (x / 10) % 10;
        sum += x;
    }
    cout << sum << endl;
    return 0;
}